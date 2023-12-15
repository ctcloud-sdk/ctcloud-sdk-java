/*
 * Copyright (c) Ct Technologies Co., Ltd. 2021-2021. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.ctcloud.sdk.core.auth;

import com.ctcloud.sdk.core.Constants;
import com.ctcloud.sdk.core.HcClient;
import com.ctcloud.sdk.core.exception.SdkException;
import com.ctcloud.sdk.core.http.HttpClient;
import com.ctcloud.sdk.core.http.HttpRequest;
import com.ctcloud.sdk.core.internal.Iam;
import com.ctcloud.sdk.core.internal.InnerIamMeta;
import com.ctcloud.sdk.core.internal.model.CreateTokenWithIdTokenResponse;
import com.ctcloud.sdk.core.internal.model.KeystoneListAuthDomainsRequest;
import com.ctcloud.sdk.core.internal.model.KeystoneListAuthDomainsResponse;
import com.ctcloud.sdk.core.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

/**
 * @author CtCloud_SDK
 */
public class GlobalCredentials extends AbstractCredentials<GlobalCredentials> {

    private String domainId;

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * @param domainId id of the account
     * @return GlobalCredentials
     */
    public GlobalCredentials withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    Map<String, Object> getPathParams() {
        Map<String, Object> pathParam = new LinkedHashMap<>();
        if (Objects.nonNull(domainId)) {
            pathParam.put(Constants.DOMAIN_ID, domainId);
        }
        return pathParam;
    }

    @Override
    public CompletableFuture<ICredential> processAuthParams(HcClient hcClient, String regionId) {
        return CompletableFuture.supplyAsync(() -> {
            if (!StringUtils.isEmpty(getIdpId()) || !StringUtils.isEmpty(getIdTokenFile())) {
                if (StringUtils.isEmpty(getIdpId())) {
                    throw new SdkException("idpId is required when using idpId&idTokenFile");
                } else if (StringUtils.isEmpty(getIdTokenFile())) {
                    throw new SdkException("idTokenFile is required when using idpId&idTokenFile");
                }
                if (StringUtils.isEmpty(domainId)) {
                    throw new SdkException("domainId is required when using idpId&idTokenFile");
                }
            }

            if (!StringUtils.isEmpty(domainId)) {
                return this;
            }

            // Confirm if current ak has been cached in AuthCache, key of authMap when searching domain info is ak
            String akWithName = getAk();
            if (Objects.nonNull(AuthCache.getAuth(akWithName))
                    && !StringUtils.isEmpty(AuthCache.getAuth(akWithName))) {
                domainId = AuthCache.getAuth(akWithName);
                return this;
            }

            String iamEndpoint = getUsedIamEndpoint();
            HcClient inner = hcClient.overrideEndpoints(Collections.singletonList(iamEndpoint));

            Function<HttpRequest, Boolean> derivedPredicate = getDerivedPredicate();
            setDerivedPredicate(null);

            Logger logger = LoggerFactory.getLogger(hcClient.getClass());
            logger.info("domain id not found in BasicCredentials," +
                    " trying to obtain domain id from IAM service: " + iamEndpoint);
            KeystoneListAuthDomainsRequest request = new KeystoneListAuthDomainsRequest();
            KeystoneListAuthDomainsResponse response = inner.syncInvokeHttp(request,
                    InnerIamMeta.KEYSTONE_LIST_AUTH_DOMAINS);
            if (Objects.isNull(response)
                    || Objects.isNull(response.getDomains())
                    || response.getDomains().size() == 0) {
                throw new SdkException(Constants.ErrorMessage.NO_DOMAIN_ID_FOUND);
            }
            domainId = response.getDomains().get(0).getId();
            logger.info("success to obtain domain id: " + domainId);
            AuthCache.putAuth(akWithName, domainId);

            setDerivedPredicate(derivedPredicate);

            return this;
        }, hcClient.getHttpConfig().getExecutorService());
    }

    @Override
    public CompletableFuture<HttpRequest> processAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {
        return CompletableFuture.completedFuture(syncProcessAuthRequest(httpRequest, httpClient));
    }

    @Override
    public HttpRequest syncProcessAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {
        HttpRequest.HttpRequestBuilder builder = httpRequest.builder().addAutoFilledPathParam(getPathParams());

        if (needUpdateAuthToken()) {
            updateAuthTokenByIdToken(httpClient);
        } else if (needUpdateSecurityToken()) {
            updateSecurityTokenFromMetadata();
        }

        if (Objects.nonNull(getDomainId())) {
            builder.addHeader(Constants.X_DOMAIN_ID, getDomainId());
        }

        if (Objects.nonNull(authToken)) {
            builder.addHeader(Constants.X_AUTH_TOKEN, authToken);
            return builder.build();
        }

        if (Objects.nonNull(getSecurityToken())) {
            builder.addHeader(Constants.X_SECURITY_TOKEN, getSecurityToken());
        }

        if (Objects.nonNull(httpRequest.getContentType())
                && !httpRequest.getContentType().startsWith(Constants.MEDIATYPE.APPLICATION_JSON)) {
            builder.addHeader(Constants.X_SDK_CONTENT_SHA256, Constants.UNSIGNED_PAYLOAD);
        }

        Map<String, String> headers;
        if (isDerivedAuth(httpRequest)) {
            headers = DerivedAKSKSigner.getInstance().sign(builder.build(), this);
        } else {
            IAKSKSigner signer = AKSKSignerFactory.getSigner(httpRequest.getSigningAlgorithm());
            headers = signer.sign(builder.build(), this);
        }

        builder.addHeaders(headers);
        return builder.build();
    }

    @Override
    protected void updateAuthTokenByIdToken(HttpClient httpClient) {
        HttpRequest httpRequest = Iam.getDomainTokenWithIdTokenRequest(
                getUsedIamEndpoint(), getIdpId(), getIdToken(), domainId);
        CreateTokenWithIdTokenResponse response = Iam.createTokenWithIdToken(httpClient, httpRequest);
        authToken = response.getSubjectToken();
        try {
            String expiredTime = response.getToken().getExpiresAt().replace("000Z", "Z");
            expiredAt = new SimpleDateFormat(Iam.EXPIRED_DATE_FORMAT).parse(expiredTime).getTime();
        } catch (ParseException e) {
            throw new SdkException(e);
        }
    }

    @Override
    public void processDerivedAuthParams(String derivedAuthServiceName, String regionId) {
        if (this.derivedAuthServiceName == null) {
            this.derivedAuthServiceName = derivedAuthServiceName;
        }

        if (this.regionId == null) {
            this.regionId = Constants.GLOBAL_REGION_ID;
        }
    }

    @Override
    public GlobalCredentials deepClone() {
        GlobalCredentials credentials = new GlobalCredentials()
                .withDomainId(domainId)
                .withAk(getAk())
                .withSk(getSk())
                .withIdpId(getIdpId())
                .withIdTokenFile(getIdTokenFile())
                .withDerivedPredicate(getDerivedPredicate())
                .withIamEndpoint(getIamEndpoint())
                .withSecurityToken(getSecurityToken());

        credentials.processDerivedAuthParams(derivedAuthServiceName, regionId);
        return credentials;
    }

}

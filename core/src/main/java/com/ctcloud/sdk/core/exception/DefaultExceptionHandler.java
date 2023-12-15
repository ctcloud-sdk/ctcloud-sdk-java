package com.ctcloud.sdk.core.exception;

import com.ctcloud.sdk.core.Constants;
import com.ctcloud.sdk.core.http.HttpRequest;
import com.ctcloud.sdk.core.http.HttpResponse;
import com.ctcloud.sdk.core.utils.ExceptionUtils;

public class DefaultExceptionHandler implements ExceptionHandler {
    @Override
    public void handleException(HttpRequest httpRequest, HttpResponse httpResponse) {
        if (httpResponse.getStatusCode() >= Constants.StatusCode.CLIENT_ERROR) {
            throw ServiceResponseException.mapException(httpResponse.getStatusCode(),
                    ExceptionUtils.extractErrorMessage(httpResponse));
        }
    }
}

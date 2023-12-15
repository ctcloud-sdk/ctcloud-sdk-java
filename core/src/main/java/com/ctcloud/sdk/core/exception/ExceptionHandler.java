package com.ctcloud.sdk.core.exception;

import com.ctcloud.sdk.core.http.HttpRequest;
import com.ctcloud.sdk.core.http.HttpResponse;

public interface ExceptionHandler {
    void handleException(HttpRequest httpRequest, HttpResponse httpResponse) throws ServiceResponseException;
}

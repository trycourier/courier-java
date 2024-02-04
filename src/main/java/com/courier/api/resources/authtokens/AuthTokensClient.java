/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.authtokens;

import com.courier.api.core.ApiError;
import com.courier.api.core.ClientOptions;
import com.courier.api.core.IdempotentRequestOptions;
import com.courier.api.core.MediaTypes;
import com.courier.api.core.ObjectMappers;
import com.courier.api.resources.authtokens.requests.IssueTokenParams;
import com.courier.api.resources.authtokens.types.IssueTokenResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class AuthTokensClient {
    protected final ClientOptions clientOptions;

    public AuthTokensClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Returns a new access token.
     */
    public IssueTokenResponse issueToken(IssueTokenParams request) {
        return issueToken(request, null);
    }

    /**
     * Returns a new access token.
     */
    public IssueTokenResponse issueToken(IssueTokenParams request, IdempotentRequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("auth")
                .addPathSegments("issue-token")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), IssueTokenResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
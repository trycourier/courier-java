/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.users.tokens;

import com.courier.api.core.ClientOptions;
import com.courier.api.core.CourierApiApiError;
import com.courier.api.core.CourierApiError;
import com.courier.api.core.MediaTypes;
import com.courier.api.core.ObjectMappers;
import com.courier.api.core.RequestOptions;
import com.courier.api.resources.commons.errors.CourierApiBadRequestError;
import com.courier.api.resources.commons.types.BadRequest;
import com.courier.api.resources.users.tokens.types.GetUserTokenResponse;
import com.courier.api.resources.users.tokens.types.PatchUserTokenOpts;
import com.courier.api.resources.users.tokens.types.UserToken;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class TokensClient {
    protected final ClientOptions clientOptions;

    public TokensClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Adds multiple tokens to a user and overwrites matching existing tokens.
     */
    public void addMultiple(String userId) {
        addMultiple(userId, null);
    }

    /**
     * Adds multiple tokens to a user and overwrites matching existing tokens.
     */
    public void addMultiple(String userId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("users")
                .addPathSegment(userId)
                .addPathSegments("tokens")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("PUT", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return;
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                if (response.code() == 400) {
                    throw new CourierApiBadRequestError(
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, BadRequest.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new CourierApiApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new CourierApiError("Network error executing HTTP request", e);
        }
    }

    /**
     * Adds a single token to a user and overwrites a matching existing token.
     */
    public void add(String userId, String token, UserToken request) {
        add(userId, token, request, null);
    }

    /**
     * Adds a single token to a user and overwrites a matching existing token.
     */
    public void add(String userId, String token, UserToken request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("users")
                .addPathSegment(userId)
                .addPathSegments("tokens")
                .addPathSegment(token)
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new CourierApiError("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("PUT", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return;
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                if (response.code() == 400) {
                    throw new CourierApiBadRequestError(
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, BadRequest.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new CourierApiApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new CourierApiError("Network error executing HTTP request", e);
        }
    }

    /**
     * Apply a JSON Patch (RFC 6902) to the specified token.
     */
    public void update(String userId, String token, PatchUserTokenOpts request) {
        update(userId, token, request, null);
    }

    /**
     * Apply a JSON Patch (RFC 6902) to the specified token.
     */
    public void update(String userId, String token, PatchUserTokenOpts request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("users")
                .addPathSegment(userId)
                .addPathSegments("tokens")
                .addPathSegment(token)
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new CourierApiError("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("PATCH", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return;
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                if (response.code() == 400) {
                    throw new CourierApiBadRequestError(
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, BadRequest.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new CourierApiApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new CourierApiError("Network error executing HTTP request", e);
        }
    }

    /**
     * Get single token available for a <code>:token</code>
     */
    public GetUserTokenResponse get(String userId, String token) {
        return get(userId, token, null);
    }

    /**
     * Get single token available for a <code>:token</code>
     */
    public GetUserTokenResponse get(String userId, String token, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("users")
                .addPathSegment(userId)
                .addPathSegments("tokens")
                .addPathSegment(token)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), GetUserTokenResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                if (response.code() == 400) {
                    throw new CourierApiBadRequestError(
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, BadRequest.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new CourierApiApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new CourierApiError("Network error executing HTTP request", e);
        }
    }

    /**
     * Gets all tokens available for a :user_id
     */
    public List<UserToken> list(String userId) {
        return list(userId, null);
    }

    /**
     * Gets all tokens available for a :user_id
     */
    public List<UserToken> list(String userId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("users")
                .addPathSegment(userId)
                .addPathSegments("tokens")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        responseBody.string(), new TypeReference<List<UserToken>>() {});
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                if (response.code() == 400) {
                    throw new CourierApiBadRequestError(
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, BadRequest.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new CourierApiApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new CourierApiError("Network error executing HTTP request", e);
        }
    }

    public void delete(String userId, String token) {
        delete(userId, token, null);
    }

    public void delete(String userId, String token, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("users")
                .addPathSegment(userId)
                .addPathSegments("tokens")
                .addPathSegment(token)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("DELETE", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return;
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            throw new CourierApiApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new CourierApiError("Network error executing HTTP request", e);
        }
    }
}

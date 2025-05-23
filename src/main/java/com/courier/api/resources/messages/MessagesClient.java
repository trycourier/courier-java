/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.messages;

import com.courier.api.core.ClientOptions;
import com.courier.api.core.CourierApiApiError;
import com.courier.api.core.CourierApiError;
import com.courier.api.core.IdempotentRequestOptions;
import com.courier.api.core.ObjectMappers;
import com.courier.api.core.RequestOptions;
import com.courier.api.resources.commons.errors.CourierApiBadRequestError;
import com.courier.api.resources.commons.errors.CourierApiMessageNotFoundError;
import com.courier.api.resources.commons.types.BadRequest;
import com.courier.api.resources.commons.types.MessageNotFound;
import com.courier.api.resources.messages.requests.GetMessageHistoryRequest;
import com.courier.api.resources.messages.requests.ListMessagesRequest;
import com.courier.api.resources.messages.types.ListMessagesResponse;
import com.courier.api.resources.messages.types.MessageDetails;
import com.courier.api.resources.messages.types.MessageDetailsExtended;
import com.courier.api.resources.messages.types.MessageHistoryResponse;
import com.courier.api.resources.messages.types.RenderOutputResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class MessagesClient {
    protected final ClientOptions clientOptions;

    public MessagesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Fetch the statuses of messages you've previously sent.
     */
    public ListMessagesResponse list() {
        return list(ListMessagesRequest.builder().build());
    }

    /**
     * Fetch the statuses of messages you've previously sent.
     */
    public ListMessagesResponse list(ListMessagesRequest request) {
        return list(request, null);
    }

    /**
     * Fetch the statuses of messages you've previously sent.
     */
    public ListMessagesResponse list(ListMessagesRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("messages");
        if (request.getArchived().isPresent()) {
            httpUrl.addQueryParameter("archived", request.getArchived().get().toString());
        }
        if (request.getCursor().isPresent()) {
            httpUrl.addQueryParameter("cursor", request.getCursor().get());
        }
        if (request.getEvent().isPresent()) {
            httpUrl.addQueryParameter("event", request.getEvent().get());
        }
        if (request.getList().isPresent()) {
            httpUrl.addQueryParameter("list", request.getList().get());
        }
        if (request.getMessageId().isPresent()) {
            httpUrl.addQueryParameter("messageId", request.getMessageId().get());
        }
        if (request.getNotification().isPresent()) {
            httpUrl.addQueryParameter("notification", request.getNotification().get());
        }
        if (request.getProvider().isPresent()) {
            httpUrl.addQueryParameter("provider", request.getProvider().get());
        }
        if (request.getRecipient().isPresent()) {
            httpUrl.addQueryParameter("recipient", request.getRecipient().get());
        }
        if (request.getStatus().isPresent()) {
            httpUrl.addQueryParameter("status", request.getStatus().get());
        }
        if (request.getTag().isPresent()) {
            httpUrl.addQueryParameter("tag", request.getTag().get());
        }
        if (request.getTags().isPresent()) {
            httpUrl.addQueryParameter("tags", request.getTags().get());
        }
        if (request.getTenantId().isPresent()) {
            httpUrl.addQueryParameter("tenant_id", request.getTenantId().get());
        }
        if (request.getEnqueuedAfter().isPresent()) {
            httpUrl.addQueryParameter(
                    "enqueued_after", request.getEnqueuedAfter().get());
        }
        if (request.getTraceId().isPresent()) {
            httpUrl.addQueryParameter("traceId", request.getTraceId().get());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), ListMessagesResponse.class);
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

    /**
     * Fetch the status of a message you've previously sent.
     */
    public MessageDetailsExtended get(String messageId) {
        return get(messageId, null);
    }

    /**
     * Fetch the status of a message you've previously sent.
     */
    public MessageDetailsExtended get(String messageId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("messages")
                .addPathSegment(messageId)
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), MessageDetailsExtended.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 400:
                        throw new CourierApiBadRequestError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, BadRequest.class));
                    case 404:
                        throw new CourierApiMessageNotFoundError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, MessageNotFound.class));
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
     * Cancel a message that is currently in the process of being delivered. A well-formatted API call to the cancel message API will return either <code>200</code> status code for a successful cancellation or <code>409</code> status code for an unsuccessful cancellation. Both cases will include the actual message record in the response body (see details below).
     */
    public MessageDetails cancel(String messageId) {
        return cancel(messageId, null);
    }

    /**
     * Cancel a message that is currently in the process of being delivered. A well-formatted API call to the cancel message API will return either <code>200</code> status code for a successful cancellation or <code>409</code> status code for an unsuccessful cancellation. Both cases will include the actual message record in the response body (see details below).
     */
    public MessageDetails cancel(String messageId, IdempotentRequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("messages")
                .addPathSegment(messageId)
                .addPathSegments("cancel")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", RequestBody.create("", null))
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), MessageDetails.class);
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

    /**
     * Fetch the array of events of a message you've previously sent.
     */
    public MessageHistoryResponse getHistory(String messageId) {
        return getHistory(messageId, GetMessageHistoryRequest.builder().build());
    }

    /**
     * Fetch the array of events of a message you've previously sent.
     */
    public MessageHistoryResponse getHistory(String messageId, GetMessageHistoryRequest request) {
        return getHistory(messageId, request, null);
    }

    /**
     * Fetch the array of events of a message you've previously sent.
     */
    public MessageHistoryResponse getHistory(
            String messageId, GetMessageHistoryRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("messages")
                .addPathSegment(messageId)
                .addPathSegments("history");
        if (request.getType().isPresent()) {
            httpUrl.addQueryParameter("type", request.getType().get());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), MessageHistoryResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 400:
                        throw new CourierApiBadRequestError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, BadRequest.class));
                    case 404:
                        throw new CourierApiMessageNotFoundError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, MessageNotFound.class));
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

    public RenderOutputResponse getContent(String messageId) {
        return getContent(messageId, null);
    }

    public RenderOutputResponse getContent(String messageId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("messages")
                .addPathSegment(messageId)
                .addPathSegments("output")
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), RenderOutputResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 400:
                        throw new CourierApiBadRequestError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, BadRequest.class));
                    case 404:
                        throw new CourierApiMessageNotFoundError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, MessageNotFound.class));
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

    public void archive(String requestId) {
        archive(requestId, null);
    }

    public void archive(String requestId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("requests")
                .addPathSegment(requestId)
                .addPathSegments("archive")
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
            throw new CourierApiApiError(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new CourierApiError("Network error executing HTTP request", e);
        }
    }
}

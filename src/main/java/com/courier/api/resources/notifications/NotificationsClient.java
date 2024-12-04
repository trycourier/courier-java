/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.notifications;

import com.courier.api.core.ClientOptions;
import com.courier.api.core.CourierApiApiError;
import com.courier.api.core.CourierApiError;
import com.courier.api.core.MediaTypes;
import com.courier.api.core.ObjectMappers;
import com.courier.api.core.RequestOptions;
import com.courier.api.resources.notifications.requests.NotificationListParams;
import com.courier.api.resources.notifications.requests.SubmissionChecksReplaceParams;
import com.courier.api.resources.notifications.types.NotificationGetContentResponse;
import com.courier.api.resources.notifications.types.NotificationListResponse;
import com.courier.api.resources.notifications.types.SubmissionChecksGetResponse;
import com.courier.api.resources.notifications.types.SubmissionChecksReplaceResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class NotificationsClient {
    protected final ClientOptions clientOptions;

    public NotificationsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public NotificationListResponse list() {
        return list(NotificationListParams.builder().build());
    }

    public NotificationListResponse list(NotificationListParams request) {
        return list(request, null);
    }

    public NotificationListResponse list(NotificationListParams request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("notifications");
        if (request.getCursor().isPresent()) {
            httpUrl.addQueryParameter("cursor", request.getCursor().get());
        }
        if (request.getNotes().isPresent()) {
            httpUrl.addQueryParameter("notes", request.getNotes().get().toString());
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), NotificationListResponse.class);
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

    public NotificationGetContentResponse getContent(String id) {
        return getContent(id, null);
    }

    public NotificationGetContentResponse getContent(String id, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("notifications")
                .addPathSegment(id)
                .addPathSegments("content")
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), NotificationGetContentResponse.class);
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

    public NotificationGetContentResponse getDraftContent(String id) {
        return getDraftContent(id, null);
    }

    public NotificationGetContentResponse getDraftContent(String id, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("notifications")
                .addPathSegment(id)
                .addPathSegments("draft/content")
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), NotificationGetContentResponse.class);
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

    public SubmissionChecksGetResponse getSubmissionChecks(String id, String submissionId) {
        return getSubmissionChecks(id, submissionId, null);
    }

    public SubmissionChecksGetResponse getSubmissionChecks(
            String id, String submissionId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("notifications")
                .addPathSegment(id)
                .addPathSegment(submissionId)
                .addPathSegments("checks")
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), SubmissionChecksGetResponse.class);
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

    public SubmissionChecksReplaceResponse replaceSubmissionChecks(
            String id, String submissionId, SubmissionChecksReplaceParams request) {
        return replaceSubmissionChecks(id, submissionId, request, null);
    }

    public SubmissionChecksReplaceResponse replaceSubmissionChecks(
            String id, String submissionId, SubmissionChecksReplaceParams request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("notifications")
                .addPathSegment(id)
                .addPathSegment(submissionId)
                .addPathSegments("checks")
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        responseBody.string(), SubmissionChecksReplaceResponse.class);
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

    public void cancelSubmission(String id, String submissionId) {
        cancelSubmission(id, submissionId, null);
    }

    public void cancelSubmission(String id, String submissionId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("notifications")
                .addPathSegment(id)
                .addPathSegment(submissionId)
                .addPathSegments("checks")
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

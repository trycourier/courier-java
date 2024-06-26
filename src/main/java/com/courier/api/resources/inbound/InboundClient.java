/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.inbound;

import com.courier.api.core.ClientOptions;
import com.courier.api.core.CourierApiApiError;
import com.courier.api.core.CourierApiError;
import com.courier.api.core.MediaTypes;
import com.courier.api.core.ObjectMappers;
import com.courier.api.core.RequestOptions;
import com.courier.api.resources.commons.errors.CourierApiBadRequestError;
import com.courier.api.resources.commons.errors.CourierApiConflictError;
import com.courier.api.resources.commons.types.BadRequest;
import com.courier.api.resources.commons.types.Conflict;
import com.courier.api.resources.inbound.types.InboundTrackEvent;
import com.courier.api.resources.inbound.types.TrackAcceptedResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class InboundClient {
    protected final ClientOptions clientOptions;

    public InboundClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public TrackAcceptedResponse track(InboundTrackEvent request) {
        return track(request, null);
    }

    public TrackAcceptedResponse track(InboundTrackEvent request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("inbound")
                .addPathSegments("courier")
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
                .method("POST", body)
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
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), TrackAcceptedResponse.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 400:
                        throw new CourierApiBadRequestError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, BadRequest.class));
                    case 409:
                        throw new CourierApiConflictError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Conflict.class));
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
}

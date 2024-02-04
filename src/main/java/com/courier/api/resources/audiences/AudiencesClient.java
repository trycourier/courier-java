/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.audiences;

import com.courier.api.core.ApiError;
import com.courier.api.core.ClientOptions;
import com.courier.api.core.MediaTypes;
import com.courier.api.core.ObjectMappers;
import com.courier.api.core.RequestOptions;
import com.courier.api.resources.audiences.requests.AudienceMembersListParams;
import com.courier.api.resources.audiences.requests.AudienceUpdateParams;
import com.courier.api.resources.audiences.requests.AudiencesListParams;
import com.courier.api.resources.audiences.types.Audience;
import com.courier.api.resources.audiences.types.AudienceListResponse;
import com.courier.api.resources.audiences.types.AudienceMemberListResponse;
import com.courier.api.resources.audiences.types.AudienceUpdateResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class AudiencesClient {
    protected final ClientOptions clientOptions;

    public AudiencesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Returns the specified audience by id.
     */
    public Audience get(String audienceId) {
        return get(audienceId, null);
    }

    /**
     * Returns the specified audience by id.
     */
    public Audience get(String audienceId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("audiences")
                .addPathSegment(audienceId)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Audience.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates or updates audience.
     */
    public AudienceUpdateResponse update(String audienceId) {
        return update(audienceId, AudienceUpdateParams.builder().build());
    }

    /**
     * Creates or updates audience.
     */
    public AudienceUpdateResponse update(String audienceId, AudienceUpdateParams request) {
        return update(audienceId, request, null);
    }

    /**
     * Creates or updates audience.
     */
    public AudienceUpdateResponse update(
            String audienceId, AudienceUpdateParams request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("audiences")
                .addPathSegment(audienceId)
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
                .method("PUT", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), AudienceUpdateResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Deletes the specified audience.
     */
    public void delete(String audienceId) {
        delete(audienceId, null);
    }

    /**
     * Deletes the specified audience.
     */
    public void delete(String audienceId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("audiences")
                .addPathSegment(audienceId)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("DELETE", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return;
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get list of members of an audience.
     */
    public AudienceMemberListResponse listMembers(String audienceId) {
        return listMembers(audienceId, AudienceMembersListParams.builder().build());
    }

    /**
     * Get list of members of an audience.
     */
    public AudienceMemberListResponse listMembers(String audienceId, AudienceMembersListParams request) {
        return listMembers(audienceId, request, null);
    }

    /**
     * Get list of members of an audience.
     */
    public AudienceMemberListResponse listMembers(
            String audienceId, AudienceMembersListParams request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("audiences")
                .addPathSegment(audienceId)
                .addPathSegments("members");
        if (request.getCursor().isPresent()) {
            httpUrl.addQueryParameter("cursor", request.getCursor().get());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), AudienceMemberListResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get the audiences associated with the authorization token.
     */
    public AudienceListResponse listAudiences() {
        return listAudiences(AudiencesListParams.builder().build());
    }

    /**
     * Get the audiences associated with the authorization token.
     */
    public AudienceListResponse listAudiences(AudiencesListParams request) {
        return listAudiences(request, null);
    }

    /**
     * Get the audiences associated with the authorization token.
     */
    public AudienceListResponse listAudiences(AudiencesListParams request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("audiences");
        if (request.getCursor().isPresent()) {
            httpUrl.addQueryParameter("cursor", request.getCursor().get());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), AudienceListResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

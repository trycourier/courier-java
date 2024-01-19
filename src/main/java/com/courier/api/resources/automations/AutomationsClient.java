/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.automations;

import com.courier.api.core.ApiError;
import com.courier.api.core.ClientOptions;
import com.courier.api.core.MediaTypes;
import com.courier.api.core.ObjectMappers;
import com.courier.api.core.RequestOptions;
import com.courier.api.resources.automations.types.AutomationAdHocInvokeParams;
import com.courier.api.resources.automations.types.AutomationInvokeParams;
import com.courier.api.resources.automations.types.AutomationInvokeResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class AutomationsClient {
    protected final ClientOptions clientOptions;

    public AutomationsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Invoke an automation run from an automation template.
     */
    public AutomationInvokeResponse invokeAutomationTemplate(String templateId) {
        return invokeAutomationTemplate(
                templateId, AutomationInvokeParams.builder().build());
    }

    /**
     * Invoke an automation run from an automation template.
     */
    public AutomationInvokeResponse invokeAutomationTemplate(String templateId, AutomationInvokeParams request) {
        return invokeAutomationTemplate(templateId, request, null);
    }

    /**
     * Invoke an automation run from an automation template.
     */
    public AutomationInvokeResponse invokeAutomationTemplate(
            String templateId, AutomationInvokeParams request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("automations")
                .addPathSegment(templateId)
                .addPathSegments("invoke")
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), AutomationInvokeResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Invoke an ad hoc automation run. This endpoint accepts a JSON payload with a series of automation steps. For information about what steps are available, checkout the ad hoc automation guide <a href="https://www.courier.com/docs/automations/steps/">here</a>.
     */
    public AutomationInvokeResponse invokeAdHocAutomation(AutomationAdHocInvokeParams request) {
        return invokeAdHocAutomation(request, null);
    }

    /**
     * Invoke an ad hoc automation run. This endpoint accepts a JSON payload with a series of automation steps. For information about what steps are available, checkout the ad hoc automation guide <a href="https://www.courier.com/docs/automations/steps/">here</a>.
     */
    public AutomationInvokeResponse invokeAdHocAutomation(
            AutomationAdHocInvokeParams request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("automations")
                .addPathSegments("invoke")
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), AutomationInvokeResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

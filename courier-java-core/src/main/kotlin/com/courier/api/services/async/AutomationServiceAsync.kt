// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.automations.AutomationInvokeAdHocParams
import com.courier.api.models.automations.AutomationInvokeByTemplateParams
import com.courier.api.models.automations.invoke.AutomationInvokeResponse
import com.courier.api.services.async.automations.InvokeServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AutomationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutomationServiceAsync

    fun invoke(): InvokeServiceAsync

    /**
     * Invoke an ad hoc automation run. This endpoint accepts a JSON payload with a series of
     * automation steps. For information about what steps are available, checkout the ad hoc
     * automation guide [here](https://www.courier.com/docs/automations/steps/).
     */
    fun invokeAdHoc(
        params: AutomationInvokeAdHocParams
    ): CompletableFuture<AutomationInvokeResponse> = invokeAdHoc(params, RequestOptions.none())

    /** @see invokeAdHoc */
    fun invokeAdHoc(
        params: AutomationInvokeAdHocParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutomationInvokeResponse>

    /** Invoke an automation run from an automation template. */
    fun invokeByTemplate(
        templateId: String,
        params: AutomationInvokeByTemplateParams,
    ): CompletableFuture<AutomationInvokeResponse> =
        invokeByTemplate(templateId, params, RequestOptions.none())

    /** @see invokeByTemplate */
    fun invokeByTemplate(
        templateId: String,
        params: AutomationInvokeByTemplateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutomationInvokeResponse> =
        invokeByTemplate(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see invokeByTemplate */
    fun invokeByTemplate(
        params: AutomationInvokeByTemplateParams
    ): CompletableFuture<AutomationInvokeResponse> = invokeByTemplate(params, RequestOptions.none())

    /** @see invokeByTemplate */
    fun invokeByTemplate(
        params: AutomationInvokeByTemplateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutomationInvokeResponse>

    /**
     * A view of [AutomationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutomationServiceAsync.WithRawResponse

        fun invoke(): InvokeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /automations/invoke`, but is otherwise the same as
         * [AutomationServiceAsync.invokeAdHoc].
         */
        fun invokeAdHoc(
            params: AutomationInvokeAdHocParams
        ): CompletableFuture<HttpResponseFor<AutomationInvokeResponse>> =
            invokeAdHoc(params, RequestOptions.none())

        /** @see invokeAdHoc */
        fun invokeAdHoc(
            params: AutomationInvokeAdHocParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutomationInvokeResponse>>

        /**
         * Returns a raw HTTP response for `post /automations/{templateId}/invoke`, but is otherwise
         * the same as [AutomationServiceAsync.invokeByTemplate].
         */
        fun invokeByTemplate(
            templateId: String,
            params: AutomationInvokeByTemplateParams,
        ): CompletableFuture<HttpResponseFor<AutomationInvokeResponse>> =
            invokeByTemplate(templateId, params, RequestOptions.none())

        /** @see invokeByTemplate */
        fun invokeByTemplate(
            templateId: String,
            params: AutomationInvokeByTemplateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutomationInvokeResponse>> =
            invokeByTemplate(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see invokeByTemplate */
        fun invokeByTemplate(
            params: AutomationInvokeByTemplateParams
        ): CompletableFuture<HttpResponseFor<AutomationInvokeResponse>> =
            invokeByTemplate(params, RequestOptions.none())

        /** @see invokeByTemplate */
        fun invokeByTemplate(
            params: AutomationInvokeByTemplateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutomationInvokeResponse>>
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.automations

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.automations.AutomationInvokeResponse
import com.courier.api.models.automations.invoke.InvokeInvokeAdHocParams
import com.courier.api.models.automations.invoke.InvokeInvokeByTemplateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InvokeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvokeServiceAsync

    /**
     * Invoke an ad hoc automation run. This endpoint accepts a JSON payload with a series of
     * automation steps. For information about what steps are available, checkout the ad hoc
     * automation guide [here](https://www.courier.com/docs/automations/steps/).
     */
    fun invokeAdHoc(params: InvokeInvokeAdHocParams): CompletableFuture<AutomationInvokeResponse> =
        invokeAdHoc(params, RequestOptions.none())

    /** @see invokeAdHoc */
    fun invokeAdHoc(
        params: InvokeInvokeAdHocParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutomationInvokeResponse>

    /** Invoke an automation run from an automation template. */
    fun invokeByTemplate(
        templateId: String,
        params: InvokeInvokeByTemplateParams,
    ): CompletableFuture<AutomationInvokeResponse> =
        invokeByTemplate(templateId, params, RequestOptions.none())

    /** @see invokeByTemplate */
    fun invokeByTemplate(
        templateId: String,
        params: InvokeInvokeByTemplateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutomationInvokeResponse> =
        invokeByTemplate(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see invokeByTemplate */
    fun invokeByTemplate(
        params: InvokeInvokeByTemplateParams
    ): CompletableFuture<AutomationInvokeResponse> = invokeByTemplate(params, RequestOptions.none())

    /** @see invokeByTemplate */
    fun invokeByTemplate(
        params: InvokeInvokeByTemplateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutomationInvokeResponse>

    /**
     * A view of [InvokeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvokeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /automations/invoke`, but is otherwise the same as
         * [InvokeServiceAsync.invokeAdHoc].
         */
        fun invokeAdHoc(
            params: InvokeInvokeAdHocParams
        ): CompletableFuture<HttpResponseFor<AutomationInvokeResponse>> =
            invokeAdHoc(params, RequestOptions.none())

        /** @see invokeAdHoc */
        fun invokeAdHoc(
            params: InvokeInvokeAdHocParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutomationInvokeResponse>>

        /**
         * Returns a raw HTTP response for `post /automations/{templateId}/invoke`, but is otherwise
         * the same as [InvokeServiceAsync.invokeByTemplate].
         */
        fun invokeByTemplate(
            templateId: String,
            params: InvokeInvokeByTemplateParams,
        ): CompletableFuture<HttpResponseFor<AutomationInvokeResponse>> =
            invokeByTemplate(templateId, params, RequestOptions.none())

        /** @see invokeByTemplate */
        fun invokeByTemplate(
            templateId: String,
            params: InvokeInvokeByTemplateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutomationInvokeResponse>> =
            invokeByTemplate(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see invokeByTemplate */
        fun invokeByTemplate(
            params: InvokeInvokeByTemplateParams
        ): CompletableFuture<HttpResponseFor<AutomationInvokeResponse>> =
            invokeByTemplate(params, RequestOptions.none())

        /** @see invokeByTemplate */
        fun invokeByTemplate(
            params: InvokeInvokeByTemplateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutomationInvokeResponse>>
    }
}

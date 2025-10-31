// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.automations

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.automations.AutomationInvokeResponse
import com.courier.models.automations.invoke.InvokeInvokeAdHocParams
import com.courier.models.automations.invoke.InvokeInvokeByTemplateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface InvokeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvokeService

    /**
     * Invoke an ad hoc automation run. This endpoint accepts a JSON payload with a series of
     * automation steps. For information about what steps are available, checkout the ad hoc
     * automation guide [here](https://www.courier.com/docs/automations/steps/).
     */
    fun invokeAdHoc(params: InvokeInvokeAdHocParams): AutomationInvokeResponse =
        invokeAdHoc(params, RequestOptions.none())

    /** @see invokeAdHoc */
    fun invokeAdHoc(
        params: InvokeInvokeAdHocParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomationInvokeResponse

    /** Invoke an automation run from an automation template. */
    fun invokeByTemplate(
        templateId: String,
        params: InvokeInvokeByTemplateParams,
    ): AutomationInvokeResponse = invokeByTemplate(templateId, params, RequestOptions.none())

    /** @see invokeByTemplate */
    fun invokeByTemplate(
        templateId: String,
        params: InvokeInvokeByTemplateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomationInvokeResponse =
        invokeByTemplate(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see invokeByTemplate */
    fun invokeByTemplate(params: InvokeInvokeByTemplateParams): AutomationInvokeResponse =
        invokeByTemplate(params, RequestOptions.none())

    /** @see invokeByTemplate */
    fun invokeByTemplate(
        params: InvokeInvokeByTemplateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomationInvokeResponse

    /** A view of [InvokeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvokeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /automations/invoke`, but is otherwise the same as
         * [InvokeService.invokeAdHoc].
         */
        @MustBeClosed
        fun invokeAdHoc(
            params: InvokeInvokeAdHocParams
        ): HttpResponseFor<AutomationInvokeResponse> = invokeAdHoc(params, RequestOptions.none())

        /** @see invokeAdHoc */
        @MustBeClosed
        fun invokeAdHoc(
            params: InvokeInvokeAdHocParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomationInvokeResponse>

        /**
         * Returns a raw HTTP response for `post /automations/{templateId}/invoke`, but is otherwise
         * the same as [InvokeService.invokeByTemplate].
         */
        @MustBeClosed
        fun invokeByTemplate(
            templateId: String,
            params: InvokeInvokeByTemplateParams,
        ): HttpResponseFor<AutomationInvokeResponse> =
            invokeByTemplate(templateId, params, RequestOptions.none())

        /** @see invokeByTemplate */
        @MustBeClosed
        fun invokeByTemplate(
            templateId: String,
            params: InvokeInvokeByTemplateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomationInvokeResponse> =
            invokeByTemplate(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see invokeByTemplate */
        @MustBeClosed
        fun invokeByTemplate(
            params: InvokeInvokeByTemplateParams
        ): HttpResponseFor<AutomationInvokeResponse> =
            invokeByTemplate(params, RequestOptions.none())

        /** @see invokeByTemplate */
        @MustBeClosed
        fun invokeByTemplate(
            params: InvokeInvokeByTemplateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomationInvokeResponse>
    }
}

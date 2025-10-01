// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.automations.AutomationInvokeAdHocParams
import com.courier.api.models.automations.AutomationInvokeByTemplateParams
import com.courier.api.models.automations.invoke.AutomationInvokeResponse
import com.courier.api.services.blocking.automations.InvokeService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface AutomationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutomationService

    fun invoke(): InvokeService

    /**
     * Invoke an ad hoc automation run. This endpoint accepts a JSON payload with a series of
     * automation steps. For information about what steps are available, checkout the ad hoc
     * automation guide [here](https://www.courier.com/docs/automations/steps/).
     */
    fun invokeAdHoc(params: AutomationInvokeAdHocParams): AutomationInvokeResponse =
        invokeAdHoc(params, RequestOptions.none())

    /** @see invokeAdHoc */
    fun invokeAdHoc(
        params: AutomationInvokeAdHocParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomationInvokeResponse

    /** Invoke an automation run from an automation template. */
    fun invokeByTemplate(
        templateId: String,
        params: AutomationInvokeByTemplateParams,
    ): AutomationInvokeResponse = invokeByTemplate(templateId, params, RequestOptions.none())

    /** @see invokeByTemplate */
    fun invokeByTemplate(
        templateId: String,
        params: AutomationInvokeByTemplateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomationInvokeResponse =
        invokeByTemplate(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see invokeByTemplate */
    fun invokeByTemplate(params: AutomationInvokeByTemplateParams): AutomationInvokeResponse =
        invokeByTemplate(params, RequestOptions.none())

    /** @see invokeByTemplate */
    fun invokeByTemplate(
        params: AutomationInvokeByTemplateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomationInvokeResponse

    /** A view of [AutomationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutomationService.WithRawResponse

        fun invoke(): InvokeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /automations/invoke`, but is otherwise the same as
         * [AutomationService.invokeAdHoc].
         */
        @MustBeClosed
        fun invokeAdHoc(
            params: AutomationInvokeAdHocParams
        ): HttpResponseFor<AutomationInvokeResponse> = invokeAdHoc(params, RequestOptions.none())

        /** @see invokeAdHoc */
        @MustBeClosed
        fun invokeAdHoc(
            params: AutomationInvokeAdHocParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomationInvokeResponse>

        /**
         * Returns a raw HTTP response for `post /automations/{templateId}/invoke`, but is otherwise
         * the same as [AutomationService.invokeByTemplate].
         */
        @MustBeClosed
        fun invokeByTemplate(
            templateId: String,
            params: AutomationInvokeByTemplateParams,
        ): HttpResponseFor<AutomationInvokeResponse> =
            invokeByTemplate(templateId, params, RequestOptions.none())

        /** @see invokeByTemplate */
        @MustBeClosed
        fun invokeByTemplate(
            templateId: String,
            params: AutomationInvokeByTemplateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomationInvokeResponse> =
            invokeByTemplate(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see invokeByTemplate */
        @MustBeClosed
        fun invokeByTemplate(
            params: AutomationInvokeByTemplateParams
        ): HttpResponseFor<AutomationInvokeResponse> =
            invokeByTemplate(params, RequestOptions.none())

        /** @see invokeByTemplate */
        @MustBeClosed
        fun invokeByTemplate(
            params: AutomationInvokeByTemplateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomationInvokeResponse>
    }
}

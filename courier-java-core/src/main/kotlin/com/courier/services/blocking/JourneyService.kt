// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.journeys.JourneyInvokeParams
import com.courier.models.journeys.JourneyListParams
import com.courier.models.journeys.JourneysInvokeResponse
import com.courier.models.journeys.JourneysListResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface JourneyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JourneyService

    /** Get the list of journeys. */
    fun list(): JourneysListResponse = list(JourneyListParams.none())

    /** @see list */
    fun list(
        params: JourneyListParams = JourneyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneysListResponse

    /** @see list */
    fun list(params: JourneyListParams = JourneyListParams.none()): JourneysListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): JourneysListResponse =
        list(JourneyListParams.none(), requestOptions)

    /** Invoke a journey run from a journey template. */
    fun invoke(templateId: String, params: JourneyInvokeParams): JourneysInvokeResponse =
        invoke(templateId, params, RequestOptions.none())

    /** @see invoke */
    fun invoke(
        templateId: String,
        params: JourneyInvokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneysInvokeResponse =
        invoke(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see invoke */
    fun invoke(params: JourneyInvokeParams): JourneysInvokeResponse =
        invoke(params, RequestOptions.none())

    /** @see invoke */
    fun invoke(
        params: JourneyInvokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneysInvokeResponse

    /** A view of [JourneyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JourneyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /journeys`, but is otherwise the same as
         * [JourneyService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<JourneysListResponse> = list(JourneyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: JourneyListParams = JourneyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneysListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: JourneyListParams = JourneyListParams.none()
        ): HttpResponseFor<JourneysListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<JourneysListResponse> =
            list(JourneyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /journeys/{templateId}/invoke`, but is otherwise
         * the same as [JourneyService.invoke].
         */
        @MustBeClosed
        fun invoke(
            templateId: String,
            params: JourneyInvokeParams,
        ): HttpResponseFor<JourneysInvokeResponse> =
            invoke(templateId, params, RequestOptions.none())

        /** @see invoke */
        @MustBeClosed
        fun invoke(
            templateId: String,
            params: JourneyInvokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneysInvokeResponse> =
            invoke(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see invoke */
        @MustBeClosed
        fun invoke(params: JourneyInvokeParams): HttpResponseFor<JourneysInvokeResponse> =
            invoke(params, RequestOptions.none())

        /** @see invoke */
        @MustBeClosed
        fun invoke(
            params: JourneyInvokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneysInvokeResponse>
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.journeys.JourneyInvokeParams
import com.courier.models.journeys.JourneyListParams
import com.courier.models.journeys.JourneysInvokeResponse
import com.courier.models.journeys.JourneysListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface JourneyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JourneyServiceAsync

    /** Get the list of journeys. */
    fun list(): CompletableFuture<JourneysListResponse> = list(JourneyListParams.none())

    /** @see list */
    fun list(
        params: JourneyListParams = JourneyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneysListResponse>

    /** @see list */
    fun list(
        params: JourneyListParams = JourneyListParams.none()
    ): CompletableFuture<JourneysListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<JourneysListResponse> =
        list(JourneyListParams.none(), requestOptions)

    /** Invoke a journey run from a journey template. */
    fun invoke(
        templateId: String,
        params: JourneyInvokeParams,
    ): CompletableFuture<JourneysInvokeResponse> = invoke(templateId, params, RequestOptions.none())

    /** @see invoke */
    fun invoke(
        templateId: String,
        params: JourneyInvokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneysInvokeResponse> =
        invoke(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see invoke */
    fun invoke(params: JourneyInvokeParams): CompletableFuture<JourneysInvokeResponse> =
        invoke(params, RequestOptions.none())

    /** @see invoke */
    fun invoke(
        params: JourneyInvokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneysInvokeResponse>

    /**
     * A view of [JourneyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JourneyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /journeys`, but is otherwise the same as
         * [JourneyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<JourneysListResponse>> =
            list(JourneyListParams.none())

        /** @see list */
        fun list(
            params: JourneyListParams = JourneyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneysListResponse>>

        /** @see list */
        fun list(
            params: JourneyListParams = JourneyListParams.none()
        ): CompletableFuture<HttpResponseFor<JourneysListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<JourneysListResponse>> =
            list(JourneyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /journeys/{templateId}/invoke`, but is otherwise
         * the same as [JourneyServiceAsync.invoke].
         */
        fun invoke(
            templateId: String,
            params: JourneyInvokeParams,
        ): CompletableFuture<HttpResponseFor<JourneysInvokeResponse>> =
            invoke(templateId, params, RequestOptions.none())

        /** @see invoke */
        fun invoke(
            templateId: String,
            params: JourneyInvokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneysInvokeResponse>> =
            invoke(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see invoke */
        fun invoke(
            params: JourneyInvokeParams
        ): CompletableFuture<HttpResponseFor<JourneysInvokeResponse>> =
            invoke(params, RequestOptions.none())

        /** @see invoke */
        fun invoke(
            params: JourneyInvokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneysInvokeResponse>>
    }
}

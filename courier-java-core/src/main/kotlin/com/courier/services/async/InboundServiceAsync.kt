// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.inbound.InboundTrackEventParams
import com.courier.models.inbound.InboundTrackEventResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InboundServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundServiceAsync

    /** Courier Track Event */
    fun trackEvent(params: InboundTrackEventParams): CompletableFuture<InboundTrackEventResponse> =
        trackEvent(params, RequestOptions.none())

    /** @see trackEvent */
    fun trackEvent(
        params: InboundTrackEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundTrackEventResponse>

    /**
     * A view of [InboundServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /inbound/courier`, but is otherwise the same as
         * [InboundServiceAsync.trackEvent].
         */
        fun trackEvent(
            params: InboundTrackEventParams
        ): CompletableFuture<HttpResponseFor<InboundTrackEventResponse>> =
            trackEvent(params, RequestOptions.none())

        /** @see trackEvent */
        fun trackEvent(
            params: InboundTrackEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundTrackEventResponse>>
    }
}

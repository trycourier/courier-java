// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.inbound.InboundTrackEventParams
import com.courier.api.models.inbound.InboundTrackEventResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface InboundService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundService

    /** Courier Track Event */
    fun trackEvent(params: InboundTrackEventParams): InboundTrackEventResponse =
        trackEvent(params, RequestOptions.none())

    /** @see trackEvent */
    fun trackEvent(
        params: InboundTrackEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundTrackEventResponse

    /** A view of [InboundService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /inbound/courier`, but is otherwise the same as
         * [InboundService.trackEvent].
         */
        @MustBeClosed
        fun trackEvent(
            params: InboundTrackEventParams
        ): HttpResponseFor<InboundTrackEventResponse> = trackEvent(params, RequestOptions.none())

        /** @see trackEvent */
        @MustBeClosed
        fun trackEvent(
            params: InboundTrackEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundTrackEventResponse>
    }
}

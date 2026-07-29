// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.models.requests.RequestArchiveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Look up the messages Courier has accepted, inspect their delivery history and rendered output,
 * and cancel, resend, or archive them.
 */
interface RequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RequestServiceAsync

    /**
     * Archives a send request by its request id. Use it to remove test sends or superseded requests
     * from the message list without deleting them.
     */
    fun archive(requestId: String): CompletableFuture<Void?> =
        archive(requestId, RequestArchiveParams.none())

    /** @see archive */
    fun archive(
        requestId: String,
        params: RequestArchiveParams = RequestArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        archive(params.toBuilder().requestId(requestId).build(), requestOptions)

    /** @see archive */
    fun archive(
        requestId: String,
        params: RequestArchiveParams = RequestArchiveParams.none(),
    ): CompletableFuture<Void?> = archive(requestId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: RequestArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see archive */
    fun archive(params: RequestArchiveParams): CompletableFuture<Void?> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(requestId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        archive(requestId, RequestArchiveParams.none(), requestOptions)

    /**
     * A view of [RequestServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RequestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /requests/{request_id}/archive`, but is otherwise
         * the same as [RequestServiceAsync.archive].
         */
        fun archive(requestId: String): CompletableFuture<HttpResponse> =
            archive(requestId, RequestArchiveParams.none())

        /** @see archive */
        fun archive(
            requestId: String,
            params: RequestArchiveParams = RequestArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            archive(params.toBuilder().requestId(requestId).build(), requestOptions)

        /** @see archive */
        fun archive(
            requestId: String,
            params: RequestArchiveParams = RequestArchiveParams.none(),
        ): CompletableFuture<HttpResponse> = archive(requestId, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: RequestArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see archive */
        fun archive(params: RequestArchiveParams): CompletableFuture<HttpResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            requestId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            archive(requestId, RequestArchiveParams.none(), requestOptions)
    }
}

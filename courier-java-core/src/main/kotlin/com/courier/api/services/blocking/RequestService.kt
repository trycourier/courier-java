// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponse
import com.courier.api.models.requests.RequestArchiveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface RequestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RequestService

    /** Archive message */
    fun archive(requestId: String) = archive(requestId, RequestArchiveParams.none())

    /** @see archive */
    fun archive(
        requestId: String,
        params: RequestArchiveParams = RequestArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archive(params.toBuilder().requestId(requestId).build(), requestOptions)

    /** @see archive */
    fun archive(requestId: String, params: RequestArchiveParams = RequestArchiveParams.none()) =
        archive(requestId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: RequestArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see archive */
    fun archive(params: RequestArchiveParams) = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(requestId: String, requestOptions: RequestOptions) =
        archive(requestId, RequestArchiveParams.none(), requestOptions)

    /** A view of [RequestService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RequestService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /requests/{request_id}/archive`, but is otherwise
         * the same as [RequestService.archive].
         */
        @MustBeClosed
        fun archive(requestId: String): HttpResponse =
            archive(requestId, RequestArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            requestId: String,
            params: RequestArchiveParams = RequestArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = archive(params.toBuilder().requestId(requestId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            requestId: String,
            params: RequestArchiveParams = RequestArchiveParams.none(),
        ): HttpResponse = archive(requestId, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: RequestArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see archive */
        @MustBeClosed
        fun archive(params: RequestArchiveParams): HttpResponse =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(requestId: String, requestOptions: RequestOptions): HttpResponse =
            archive(requestId, RequestArchiveParams.none(), requestOptions)
    }
}

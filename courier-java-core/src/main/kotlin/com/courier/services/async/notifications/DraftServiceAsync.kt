// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.notifications

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.notifications.NotificationGetContent
import com.courier.models.notifications.draft.DraftRetrieveContentParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DraftServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftServiceAsync

    fun retrieveContent(id: String): CompletableFuture<NotificationGetContent> =
        retrieveContent(id, DraftRetrieveContentParams.none())

    /** @see retrieveContent */
    fun retrieveContent(
        id: String,
        params: DraftRetrieveContentParams = DraftRetrieveContentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationGetContent> =
        retrieveContent(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveContent */
    fun retrieveContent(
        id: String,
        params: DraftRetrieveContentParams = DraftRetrieveContentParams.none(),
    ): CompletableFuture<NotificationGetContent> =
        retrieveContent(id, params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(
        params: DraftRetrieveContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationGetContent>

    /** @see retrieveContent */
    fun retrieveContent(
        params: DraftRetrieveContentParams
    ): CompletableFuture<NotificationGetContent> = retrieveContent(params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationGetContent> =
        retrieveContent(id, DraftRetrieveContentParams.none(), requestOptions)

    /** A view of [DraftServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DraftServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /notifications/{id}/draft/content`, but is otherwise
         * the same as [DraftServiceAsync.retrieveContent].
         */
        fun retrieveContent(
            id: String
        ): CompletableFuture<HttpResponseFor<NotificationGetContent>> =
            retrieveContent(id, DraftRetrieveContentParams.none())

        /** @see retrieveContent */
        fun retrieveContent(
            id: String,
            params: DraftRetrieveContentParams = DraftRetrieveContentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationGetContent>> =
            retrieveContent(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveContent */
        fun retrieveContent(
            id: String,
            params: DraftRetrieveContentParams = DraftRetrieveContentParams.none(),
        ): CompletableFuture<HttpResponseFor<NotificationGetContent>> =
            retrieveContent(id, params, RequestOptions.none())

        /** @see retrieveContent */
        fun retrieveContent(
            params: DraftRetrieveContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationGetContent>>

        /** @see retrieveContent */
        fun retrieveContent(
            params: DraftRetrieveContentParams
        ): CompletableFuture<HttpResponseFor<NotificationGetContent>> =
            retrieveContent(params, RequestOptions.none())

        /** @see retrieveContent */
        fun retrieveContent(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationGetContent>> =
            retrieveContent(id, DraftRetrieveContentParams.none(), requestOptions)
    }
}

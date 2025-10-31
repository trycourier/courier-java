// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.notifications.NotificationGetContent
import com.courier.models.notifications.NotificationListParams
import com.courier.models.notifications.NotificationListResponse
import com.courier.models.notifications.NotificationRetrieveContentParams
import com.courier.services.async.notifications.CheckServiceAsync
import com.courier.services.async.notifications.DraftServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NotificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationServiceAsync

    fun draft(): DraftServiceAsync

    fun checks(): CheckServiceAsync

    fun list(): CompletableFuture<NotificationListResponse> = list(NotificationListParams.none())

    /** @see list */
    fun list(
        params: NotificationListParams = NotificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationListResponse>

    /** @see list */
    fun list(
        params: NotificationListParams = NotificationListParams.none()
    ): CompletableFuture<NotificationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<NotificationListResponse> =
        list(NotificationListParams.none(), requestOptions)

    fun retrieveContent(id: String): CompletableFuture<NotificationGetContent> =
        retrieveContent(id, NotificationRetrieveContentParams.none())

    /** @see retrieveContent */
    fun retrieveContent(
        id: String,
        params: NotificationRetrieveContentParams = NotificationRetrieveContentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationGetContent> =
        retrieveContent(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveContent */
    fun retrieveContent(
        id: String,
        params: NotificationRetrieveContentParams = NotificationRetrieveContentParams.none(),
    ): CompletableFuture<NotificationGetContent> =
        retrieveContent(id, params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(
        params: NotificationRetrieveContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationGetContent>

    /** @see retrieveContent */
    fun retrieveContent(
        params: NotificationRetrieveContentParams
    ): CompletableFuture<NotificationGetContent> = retrieveContent(params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationGetContent> =
        retrieveContent(id, NotificationRetrieveContentParams.none(), requestOptions)

    /**
     * A view of [NotificationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationServiceAsync.WithRawResponse

        fun draft(): DraftServiceAsync.WithRawResponse

        fun checks(): CheckServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /notifications`, but is otherwise the same as
         * [NotificationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NotificationListResponse>> =
            list(NotificationListParams.none())

        /** @see list */
        fun list(
            params: NotificationListParams = NotificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationListResponse>>

        /** @see list */
        fun list(
            params: NotificationListParams = NotificationListParams.none()
        ): CompletableFuture<HttpResponseFor<NotificationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NotificationListResponse>> =
            list(NotificationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /notifications/{id}/content`, but is otherwise the
         * same as [NotificationServiceAsync.retrieveContent].
         */
        fun retrieveContent(
            id: String
        ): CompletableFuture<HttpResponseFor<NotificationGetContent>> =
            retrieveContent(id, NotificationRetrieveContentParams.none())

        /** @see retrieveContent */
        fun retrieveContent(
            id: String,
            params: NotificationRetrieveContentParams = NotificationRetrieveContentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationGetContent>> =
            retrieveContent(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveContent */
        fun retrieveContent(
            id: String,
            params: NotificationRetrieveContentParams = NotificationRetrieveContentParams.none(),
        ): CompletableFuture<HttpResponseFor<NotificationGetContent>> =
            retrieveContent(id, params, RequestOptions.none())

        /** @see retrieveContent */
        fun retrieveContent(
            params: NotificationRetrieveContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationGetContent>>

        /** @see retrieveContent */
        fun retrieveContent(
            params: NotificationRetrieveContentParams
        ): CompletableFuture<HttpResponseFor<NotificationGetContent>> =
            retrieveContent(params, RequestOptions.none())

        /** @see retrieveContent */
        fun retrieveContent(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationGetContent>> =
            retrieveContent(id, NotificationRetrieveContentParams.none(), requestOptions)
    }
}

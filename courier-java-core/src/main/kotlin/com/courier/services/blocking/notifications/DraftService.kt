// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.notifications

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.notifications.NotificationGetContent
import com.courier.models.notifications.draft.DraftRetrieveContentParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface DraftService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftService

    fun retrieveContent(id: String): NotificationGetContent =
        retrieveContent(id, DraftRetrieveContentParams.none())

    /** @see retrieveContent */
    fun retrieveContent(
        id: String,
        params: DraftRetrieveContentParams = DraftRetrieveContentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationGetContent = retrieveContent(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveContent */
    fun retrieveContent(
        id: String,
        params: DraftRetrieveContentParams = DraftRetrieveContentParams.none(),
    ): NotificationGetContent = retrieveContent(id, params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(
        params: DraftRetrieveContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationGetContent

    /** @see retrieveContent */
    fun retrieveContent(params: DraftRetrieveContentParams): NotificationGetContent =
        retrieveContent(params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(id: String, requestOptions: RequestOptions): NotificationGetContent =
        retrieveContent(id, DraftRetrieveContentParams.none(), requestOptions)

    /** A view of [DraftService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DraftService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /notifications/{id}/draft/content`, but is otherwise
         * the same as [DraftService.retrieveContent].
         */
        @MustBeClosed
        fun retrieveContent(id: String): HttpResponseFor<NotificationGetContent> =
            retrieveContent(id, DraftRetrieveContentParams.none())

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            id: String,
            params: DraftRetrieveContentParams = DraftRetrieveContentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationGetContent> =
            retrieveContent(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            id: String,
            params: DraftRetrieveContentParams = DraftRetrieveContentParams.none(),
        ): HttpResponseFor<NotificationGetContent> =
            retrieveContent(id, params, RequestOptions.none())

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            params: DraftRetrieveContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationGetContent>

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            params: DraftRetrieveContentParams
        ): HttpResponseFor<NotificationGetContent> = retrieveContent(params, RequestOptions.none())

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationGetContent> =
            retrieveContent(id, DraftRetrieveContentParams.none(), requestOptions)
    }
}

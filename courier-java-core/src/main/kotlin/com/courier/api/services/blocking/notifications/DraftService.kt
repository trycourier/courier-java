// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking.notifications

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.notifications.NotificationContent
import com.courier.api.models.notifications.draft.DraftRetrieveContentParams
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

    fun retrieveContent(id: String): NotificationContent =
        retrieveContent(id, DraftRetrieveContentParams.none())

    /** @see retrieveContent */
    fun retrieveContent(
        id: String,
        params: DraftRetrieveContentParams = DraftRetrieveContentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationContent = retrieveContent(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveContent */
    fun retrieveContent(
        id: String,
        params: DraftRetrieveContentParams = DraftRetrieveContentParams.none(),
    ): NotificationContent = retrieveContent(id, params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(
        params: DraftRetrieveContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationContent

    /** @see retrieveContent */
    fun retrieveContent(params: DraftRetrieveContentParams): NotificationContent =
        retrieveContent(params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(id: String, requestOptions: RequestOptions): NotificationContent =
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
        fun retrieveContent(id: String): HttpResponseFor<NotificationContent> =
            retrieveContent(id, DraftRetrieveContentParams.none())

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            id: String,
            params: DraftRetrieveContentParams = DraftRetrieveContentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationContent> =
            retrieveContent(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            id: String,
            params: DraftRetrieveContentParams = DraftRetrieveContentParams.none(),
        ): HttpResponseFor<NotificationContent> = retrieveContent(id, params, RequestOptions.none())

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            params: DraftRetrieveContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationContent>

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            params: DraftRetrieveContentParams
        ): HttpResponseFor<NotificationContent> = retrieveContent(params, RequestOptions.none())

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationContent> =
            retrieveContent(id, DraftRetrieveContentParams.none(), requestOptions)
    }
}

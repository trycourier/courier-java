// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.notifications.NotificationContent
import com.courier.api.models.notifications.NotificationListParams
import com.courier.api.models.notifications.NotificationListResponse
import com.courier.api.models.notifications.NotificationRetrieveContentParams
import com.courier.api.services.blocking.notifications.CheckService
import com.courier.api.services.blocking.notifications.DraftService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface NotificationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationService

    fun checks(): CheckService

    fun draft(): DraftService

    fun list(): NotificationListResponse = list(NotificationListParams.none())

    /** @see list */
    fun list(
        params: NotificationListParams = NotificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationListResponse

    /** @see list */
    fun list(
        params: NotificationListParams = NotificationListParams.none()
    ): NotificationListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NotificationListResponse =
        list(NotificationListParams.none(), requestOptions)

    fun retrieveContent(id: String): NotificationContent =
        retrieveContent(id, NotificationRetrieveContentParams.none())

    /** @see retrieveContent */
    fun retrieveContent(
        id: String,
        params: NotificationRetrieveContentParams = NotificationRetrieveContentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationContent = retrieveContent(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveContent */
    fun retrieveContent(
        id: String,
        params: NotificationRetrieveContentParams = NotificationRetrieveContentParams.none(),
    ): NotificationContent = retrieveContent(id, params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(
        params: NotificationRetrieveContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationContent

    /** @see retrieveContent */
    fun retrieveContent(params: NotificationRetrieveContentParams): NotificationContent =
        retrieveContent(params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(id: String, requestOptions: RequestOptions): NotificationContent =
        retrieveContent(id, NotificationRetrieveContentParams.none(), requestOptions)

    /**
     * A view of [NotificationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationService.WithRawResponse

        fun checks(): CheckService.WithRawResponse

        fun draft(): DraftService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /notifications`, but is otherwise the same as
         * [NotificationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NotificationListResponse> = list(NotificationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationListParams = NotificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotificationListParams = NotificationListParams.none()
        ): HttpResponseFor<NotificationListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NotificationListResponse> =
            list(NotificationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /notifications/{id}/content`, but is otherwise the
         * same as [NotificationService.retrieveContent].
         */
        @MustBeClosed
        fun retrieveContent(id: String): HttpResponseFor<NotificationContent> =
            retrieveContent(id, NotificationRetrieveContentParams.none())

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            id: String,
            params: NotificationRetrieveContentParams = NotificationRetrieveContentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationContent> =
            retrieveContent(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            id: String,
            params: NotificationRetrieveContentParams = NotificationRetrieveContentParams.none(),
        ): HttpResponseFor<NotificationContent> = retrieveContent(id, params, RequestOptions.none())

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            params: NotificationRetrieveContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationContent>

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            params: NotificationRetrieveContentParams
        ): HttpResponseFor<NotificationContent> = retrieveContent(params, RequestOptions.none())

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationContent> =
            retrieveContent(id, NotificationRetrieveContentParams.none(), requestOptions)
    }
}

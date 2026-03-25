// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.notifications.NotificationArchiveParams
import com.courier.models.notifications.NotificationCreateParams
import com.courier.models.notifications.NotificationGetContent
import com.courier.models.notifications.NotificationListParams
import com.courier.models.notifications.NotificationListResponse
import com.courier.models.notifications.NotificationPublishParams
import com.courier.models.notifications.NotificationReplaceParams
import com.courier.models.notifications.NotificationRetrieveContentParams
import com.courier.models.notifications.NotificationRetrieveParams
import com.courier.models.notifications.NotificationTemplateCreateRequest
import com.courier.models.notifications.NotificationTemplateGetResponse
import com.courier.models.notifications.NotificationTemplateMutationResponse
import com.courier.services.blocking.notifications.CheckService
import com.courier.services.blocking.notifications.DraftService
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

    fun draft(): DraftService

    fun checks(): CheckService

    /**
     * Create a notification template. Requires all fields in the notification object. Templates are
     * created in draft state by default.
     */
    fun create(params: NotificationCreateParams): NotificationTemplateMutationResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NotificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationTemplateMutationResponse

    /** @see create */
    fun create(
        notificationTemplateCreateRequest: NotificationTemplateCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationTemplateMutationResponse =
        create(
            NotificationCreateParams.builder()
                .notificationTemplateCreateRequest(notificationTemplateCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        notificationTemplateCreateRequest: NotificationTemplateCreateRequest
    ): NotificationTemplateMutationResponse =
        create(notificationTemplateCreateRequest, RequestOptions.none())

    /**
     * Retrieve a notification template by ID. Returns the published version by default. Pass
     * version=draft to retrieve an unpublished template.
     */
    fun retrieve(id: String): NotificationTemplateGetResponse =
        retrieve(id, NotificationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationRetrieveParams = NotificationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationTemplateGetResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationRetrieveParams = NotificationRetrieveParams.none(),
    ): NotificationTemplateGetResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NotificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationTemplateGetResponse

    /** @see retrieve */
    fun retrieve(params: NotificationRetrieveParams): NotificationTemplateGetResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): NotificationTemplateGetResponse =
        retrieve(id, NotificationRetrieveParams.none(), requestOptions)

    /** List notification templates in your workspace. */
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

    /** Archive a notification template. */
    fun archive(id: String) = archive(id, NotificationArchiveParams.none())

    /** @see archive */
    fun archive(
        id: String,
        params: NotificationArchiveParams = NotificationArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(id: String, params: NotificationArchiveParams = NotificationArchiveParams.none()) =
        archive(id, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: NotificationArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see archive */
    fun archive(params: NotificationArchiveParams) = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(id: String, requestOptions: RequestOptions) =
        archive(id, NotificationArchiveParams.none(), requestOptions)

    /** Publish the current draft of a notification template. */
    fun publish(id: String) = publish(id, NotificationPublishParams.none())

    /** @see publish */
    fun publish(
        id: String,
        params: NotificationPublishParams = NotificationPublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = publish(params.toBuilder().id(id).build(), requestOptions)

    /** @see publish */
    fun publish(id: String, params: NotificationPublishParams = NotificationPublishParams.none()) =
        publish(id, params, RequestOptions.none())

    /** @see publish */
    fun publish(
        params: NotificationPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see publish */
    fun publish(params: NotificationPublishParams) = publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(id: String, requestOptions: RequestOptions) =
        publish(id, NotificationPublishParams.none(), requestOptions)

    /** Replace a notification template. All fields are required. */
    fun replace(
        id: String,
        params: NotificationReplaceParams,
    ): NotificationTemplateMutationResponse = replace(id, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        id: String,
        params: NotificationReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationTemplateMutationResponse =
        replace(params.toBuilder().id(id).build(), requestOptions)

    /** @see replace */
    fun replace(params: NotificationReplaceParams): NotificationTemplateMutationResponse =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: NotificationReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationTemplateMutationResponse

    fun retrieveContent(id: String): NotificationGetContent =
        retrieveContent(id, NotificationRetrieveContentParams.none())

    /** @see retrieveContent */
    fun retrieveContent(
        id: String,
        params: NotificationRetrieveContentParams = NotificationRetrieveContentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationGetContent = retrieveContent(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveContent */
    fun retrieveContent(
        id: String,
        params: NotificationRetrieveContentParams = NotificationRetrieveContentParams.none(),
    ): NotificationGetContent = retrieveContent(id, params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(
        params: NotificationRetrieveContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationGetContent

    /** @see retrieveContent */
    fun retrieveContent(params: NotificationRetrieveContentParams): NotificationGetContent =
        retrieveContent(params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(id: String, requestOptions: RequestOptions): NotificationGetContent =
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

        fun draft(): DraftService.WithRawResponse

        fun checks(): CheckService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /notifications`, but is otherwise the same as
         * [NotificationService.create].
         */
        @MustBeClosed
        fun create(
            params: NotificationCreateParams
        ): HttpResponseFor<NotificationTemplateMutationResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NotificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationTemplateMutationResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            notificationTemplateCreateRequest: NotificationTemplateCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationTemplateMutationResponse> =
            create(
                NotificationCreateParams.builder()
                    .notificationTemplateCreateRequest(notificationTemplateCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            notificationTemplateCreateRequest: NotificationTemplateCreateRequest
        ): HttpResponseFor<NotificationTemplateMutationResponse> =
            create(notificationTemplateCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /notifications/{id}`, but is otherwise the same as
         * [NotificationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<NotificationTemplateGetResponse> =
            retrieve(id, NotificationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NotificationRetrieveParams = NotificationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationTemplateGetResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NotificationRetrieveParams = NotificationRetrieveParams.none(),
        ): HttpResponseFor<NotificationTemplateGetResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NotificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationTemplateGetResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NotificationRetrieveParams
        ): HttpResponseFor<NotificationTemplateGetResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationTemplateGetResponse> =
            retrieve(id, NotificationRetrieveParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `delete /notifications/{id}`, but is otherwise the same
         * as [NotificationService.archive].
         */
        @MustBeClosed
        fun archive(id: String): HttpResponse = archive(id, NotificationArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            id: String,
            params: NotificationArchiveParams = NotificationArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            id: String,
            params: NotificationArchiveParams = NotificationArchiveParams.none(),
        ): HttpResponse = archive(id, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: NotificationArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see archive */
        @MustBeClosed
        fun archive(params: NotificationArchiveParams): HttpResponse =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(id: String, requestOptions: RequestOptions): HttpResponse =
            archive(id, NotificationArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /notifications/{id}/publish`, but is otherwise the
         * same as [NotificationService.publish].
         */
        @MustBeClosed
        fun publish(id: String): HttpResponse = publish(id, NotificationPublishParams.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            id: String,
            params: NotificationPublishParams = NotificationPublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = publish(params.toBuilder().id(id).build(), requestOptions)

        /** @see publish */
        @MustBeClosed
        fun publish(
            id: String,
            params: NotificationPublishParams = NotificationPublishParams.none(),
        ): HttpResponse = publish(id, params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            params: NotificationPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see publish */
        @MustBeClosed
        fun publish(params: NotificationPublishParams): HttpResponse =
            publish(params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(id: String, requestOptions: RequestOptions): HttpResponse =
            publish(id, NotificationPublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /notifications/{id}`, but is otherwise the same as
         * [NotificationService.replace].
         */
        @MustBeClosed
        fun replace(
            id: String,
            params: NotificationReplaceParams,
        ): HttpResponseFor<NotificationTemplateMutationResponse> =
            replace(id, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            id: String,
            params: NotificationReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationTemplateMutationResponse> =
            replace(params.toBuilder().id(id).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: NotificationReplaceParams
        ): HttpResponseFor<NotificationTemplateMutationResponse> =
            replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: NotificationReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationTemplateMutationResponse>

        /**
         * Returns a raw HTTP response for `get /notifications/{id}/content`, but is otherwise the
         * same as [NotificationService.retrieveContent].
         */
        @MustBeClosed
        fun retrieveContent(id: String): HttpResponseFor<NotificationGetContent> =
            retrieveContent(id, NotificationRetrieveContentParams.none())

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            id: String,
            params: NotificationRetrieveContentParams = NotificationRetrieveContentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationGetContent> =
            retrieveContent(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            id: String,
            params: NotificationRetrieveContentParams = NotificationRetrieveContentParams.none(),
        ): HttpResponseFor<NotificationGetContent> =
            retrieveContent(id, params, RequestOptions.none())

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            params: NotificationRetrieveContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationGetContent>

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            params: NotificationRetrieveContentParams
        ): HttpResponseFor<NotificationGetContent> = retrieveContent(params, RequestOptions.none())

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationGetContent> =
            retrieveContent(id, NotificationRetrieveContentParams.none(), requestOptions)
    }
}

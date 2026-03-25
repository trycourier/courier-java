// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

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

    /**
     * Create a notification template. Requires all fields in the notification object. Templates are
     * created in draft state by default.
     */
    fun create(
        params: NotificationCreateParams
    ): CompletableFuture<NotificationTemplateMutationResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NotificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationTemplateMutationResponse>

    /** @see create */
    fun create(
        notificationTemplateCreateRequest: NotificationTemplateCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationTemplateMutationResponse> =
        create(
            NotificationCreateParams.builder()
                .notificationTemplateCreateRequest(notificationTemplateCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        notificationTemplateCreateRequest: NotificationTemplateCreateRequest
    ): CompletableFuture<NotificationTemplateMutationResponse> =
        create(notificationTemplateCreateRequest, RequestOptions.none())

    /**
     * Retrieve a notification template by ID. Returns the published version by default. Pass
     * version=draft to retrieve an unpublished template.
     */
    fun retrieve(id: String): CompletableFuture<NotificationTemplateGetResponse> =
        retrieve(id, NotificationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationRetrieveParams = NotificationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationTemplateGetResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationRetrieveParams = NotificationRetrieveParams.none(),
    ): CompletableFuture<NotificationTemplateGetResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NotificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationTemplateGetResponse>

    /** @see retrieve */
    fun retrieve(
        params: NotificationRetrieveParams
    ): CompletableFuture<NotificationTemplateGetResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationTemplateGetResponse> =
        retrieve(id, NotificationRetrieveParams.none(), requestOptions)

    /** List notification templates in your workspace. */
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

    /** Archive a notification template. */
    fun archive(id: String): CompletableFuture<Void?> =
        archive(id, NotificationArchiveParams.none())

    /** @see archive */
    fun archive(
        id: String,
        params: NotificationArchiveParams = NotificationArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(
        id: String,
        params: NotificationArchiveParams = NotificationArchiveParams.none(),
    ): CompletableFuture<Void?> = archive(id, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: NotificationArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see archive */
    fun archive(params: NotificationArchiveParams): CompletableFuture<Void?> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        archive(id, NotificationArchiveParams.none(), requestOptions)

    /** Publish the current draft of a notification template. */
    fun publish(id: String): CompletableFuture<Void?> =
        publish(id, NotificationPublishParams.none())

    /** @see publish */
    fun publish(
        id: String,
        params: NotificationPublishParams = NotificationPublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = publish(params.toBuilder().id(id).build(), requestOptions)

    /** @see publish */
    fun publish(
        id: String,
        params: NotificationPublishParams = NotificationPublishParams.none(),
    ): CompletableFuture<Void?> = publish(id, params, RequestOptions.none())

    /** @see publish */
    fun publish(
        params: NotificationPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see publish */
    fun publish(params: NotificationPublishParams): CompletableFuture<Void?> =
        publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        publish(id, NotificationPublishParams.none(), requestOptions)

    /** Replace a notification template. All fields are required. */
    fun replace(
        id: String,
        params: NotificationReplaceParams,
    ): CompletableFuture<NotificationTemplateMutationResponse> =
        replace(id, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        id: String,
        params: NotificationReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationTemplateMutationResponse> =
        replace(params.toBuilder().id(id).build(), requestOptions)

    /** @see replace */
    fun replace(
        params: NotificationReplaceParams
    ): CompletableFuture<NotificationTemplateMutationResponse> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: NotificationReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationTemplateMutationResponse>

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
         * Returns a raw HTTP response for `post /notifications`, but is otherwise the same as
         * [NotificationServiceAsync.create].
         */
        fun create(
            params: NotificationCreateParams
        ): CompletableFuture<HttpResponseFor<NotificationTemplateMutationResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: NotificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateMutationResponse>>

        /** @see create */
        fun create(
            notificationTemplateCreateRequest: NotificationTemplateCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateMutationResponse>> =
            create(
                NotificationCreateParams.builder()
                    .notificationTemplateCreateRequest(notificationTemplateCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            notificationTemplateCreateRequest: NotificationTemplateCreateRequest
        ): CompletableFuture<HttpResponseFor<NotificationTemplateMutationResponse>> =
            create(notificationTemplateCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /notifications/{id}`, but is otherwise the same as
         * [NotificationServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<NotificationTemplateGetResponse>> =
            retrieve(id, NotificationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NotificationRetrieveParams = NotificationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateGetResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NotificationRetrieveParams = NotificationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateGetResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NotificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateGetResponse>>

        /** @see retrieve */
        fun retrieve(
            params: NotificationRetrieveParams
        ): CompletableFuture<HttpResponseFor<NotificationTemplateGetResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationTemplateGetResponse>> =
            retrieve(id, NotificationRetrieveParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `delete /notifications/{id}`, but is otherwise the same
         * as [NotificationServiceAsync.archive].
         */
        fun archive(id: String): CompletableFuture<HttpResponse> =
            archive(id, NotificationArchiveParams.none())

        /** @see archive */
        fun archive(
            id: String,
            params: NotificationArchiveParams = NotificationArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        fun archive(
            id: String,
            params: NotificationArchiveParams = NotificationArchiveParams.none(),
        ): CompletableFuture<HttpResponse> = archive(id, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: NotificationArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see archive */
        fun archive(params: NotificationArchiveParams): CompletableFuture<HttpResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            archive(id, NotificationArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /notifications/{id}/publish`, but is otherwise the
         * same as [NotificationServiceAsync.publish].
         */
        fun publish(id: String): CompletableFuture<HttpResponse> =
            publish(id, NotificationPublishParams.none())

        /** @see publish */
        fun publish(
            id: String,
            params: NotificationPublishParams = NotificationPublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            publish(params.toBuilder().id(id).build(), requestOptions)

        /** @see publish */
        fun publish(
            id: String,
            params: NotificationPublishParams = NotificationPublishParams.none(),
        ): CompletableFuture<HttpResponse> = publish(id, params, RequestOptions.none())

        /** @see publish */
        fun publish(
            params: NotificationPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see publish */
        fun publish(params: NotificationPublishParams): CompletableFuture<HttpResponse> =
            publish(params, RequestOptions.none())

        /** @see publish */
        fun publish(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            publish(id, NotificationPublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /notifications/{id}`, but is otherwise the same as
         * [NotificationServiceAsync.replace].
         */
        fun replace(
            id: String,
            params: NotificationReplaceParams,
        ): CompletableFuture<HttpResponseFor<NotificationTemplateMutationResponse>> =
            replace(id, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            id: String,
            params: NotificationReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateMutationResponse>> =
            replace(params.toBuilder().id(id).build(), requestOptions)

        /** @see replace */
        fun replace(
            params: NotificationReplaceParams
        ): CompletableFuture<HttpResponseFor<NotificationTemplateMutationResponse>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: NotificationReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateMutationResponse>>

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

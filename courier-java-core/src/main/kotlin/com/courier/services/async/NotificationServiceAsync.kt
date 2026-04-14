// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.notifications.NotificationArchiveParams
import com.courier.models.notifications.NotificationContentMutationResponse
import com.courier.models.notifications.NotificationCreateParams
import com.courier.models.notifications.NotificationListParams
import com.courier.models.notifications.NotificationListResponse
import com.courier.models.notifications.NotificationListVersionsParams
import com.courier.models.notifications.NotificationPublishParams
import com.courier.models.notifications.NotificationPutContentParams
import com.courier.models.notifications.NotificationPutElementParams
import com.courier.models.notifications.NotificationPutLocaleParams
import com.courier.models.notifications.NotificationReplaceParams
import com.courier.models.notifications.NotificationRetrieveContentParams
import com.courier.models.notifications.NotificationRetrieveContentResponse
import com.courier.models.notifications.NotificationRetrieveParams
import com.courier.models.notifications.NotificationTemplateCreateRequest
import com.courier.models.notifications.NotificationTemplateResponse
import com.courier.models.notifications.NotificationTemplateVersionListResponse
import com.courier.services.async.notifications.CheckServiceAsync
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

    fun checks(): CheckServiceAsync

    /**
     * Create a notification template. Requires all fields in the notification object. Templates are
     * created in draft state by default.
     */
    fun create(params: NotificationCreateParams): CompletableFuture<NotificationTemplateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NotificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationTemplateResponse>

    /** @see create */
    fun create(
        notificationTemplateCreateRequest: NotificationTemplateCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationTemplateResponse> =
        create(
            NotificationCreateParams.builder()
                .notificationTemplateCreateRequest(notificationTemplateCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        notificationTemplateCreateRequest: NotificationTemplateCreateRequest
    ): CompletableFuture<NotificationTemplateResponse> =
        create(notificationTemplateCreateRequest, RequestOptions.none())

    /**
     * Retrieve a notification template by ID. Returns the published version by default. Pass
     * version=draft to retrieve an unpublished template.
     */
    fun retrieve(id: String): CompletableFuture<NotificationTemplateResponse> =
        retrieve(id, NotificationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationRetrieveParams = NotificationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationTemplateResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NotificationRetrieveParams = NotificationRetrieveParams.none(),
    ): CompletableFuture<NotificationTemplateResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NotificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationTemplateResponse>

    /** @see retrieve */
    fun retrieve(
        params: NotificationRetrieveParams
    ): CompletableFuture<NotificationTemplateResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationTemplateResponse> =
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

    /** List versions of a notification template. */
    fun listVersions(id: String): CompletableFuture<NotificationTemplateVersionListResponse> =
        listVersions(id, NotificationListVersionsParams.none())

    /** @see listVersions */
    fun listVersions(
        id: String,
        params: NotificationListVersionsParams = NotificationListVersionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationTemplateVersionListResponse> =
        listVersions(params.toBuilder().id(id).build(), requestOptions)

    /** @see listVersions */
    fun listVersions(
        id: String,
        params: NotificationListVersionsParams = NotificationListVersionsParams.none(),
    ): CompletableFuture<NotificationTemplateVersionListResponse> =
        listVersions(id, params, RequestOptions.none())

    /** @see listVersions */
    fun listVersions(
        params: NotificationListVersionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationTemplateVersionListResponse>

    /** @see listVersions */
    fun listVersions(
        params: NotificationListVersionsParams
    ): CompletableFuture<NotificationTemplateVersionListResponse> =
        listVersions(params, RequestOptions.none())

    /** @see listVersions */
    fun listVersions(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationTemplateVersionListResponse> =
        listVersions(id, NotificationListVersionsParams.none(), requestOptions)

    /**
     * Publish a notification template. Publishes the current draft by default. Pass a version in
     * the request body to publish a specific historical version.
     */
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

    /**
     * Replace the elemental content of a notification template. Overwrites all elements in the
     * template with the provided content. Only supported for V2 (elemental) templates.
     */
    fun putContent(
        id: String,
        params: NotificationPutContentParams,
    ): CompletableFuture<NotificationContentMutationResponse> =
        putContent(id, params, RequestOptions.none())

    /** @see putContent */
    fun putContent(
        id: String,
        params: NotificationPutContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationContentMutationResponse> =
        putContent(params.toBuilder().id(id).build(), requestOptions)

    /** @see putContent */
    fun putContent(
        params: NotificationPutContentParams
    ): CompletableFuture<NotificationContentMutationResponse> =
        putContent(params, RequestOptions.none())

    /** @see putContent */
    fun putContent(
        params: NotificationPutContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationContentMutationResponse>

    /**
     * Update a single element within a notification template. Only supported for V2 (elemental)
     * templates.
     */
    fun putElement(
        elementId: String,
        params: NotificationPutElementParams,
    ): CompletableFuture<NotificationContentMutationResponse> =
        putElement(elementId, params, RequestOptions.none())

    /** @see putElement */
    fun putElement(
        elementId: String,
        params: NotificationPutElementParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationContentMutationResponse> =
        putElement(params.toBuilder().elementId(elementId).build(), requestOptions)

    /** @see putElement */
    fun putElement(
        params: NotificationPutElementParams
    ): CompletableFuture<NotificationContentMutationResponse> =
        putElement(params, RequestOptions.none())

    /** @see putElement */
    fun putElement(
        params: NotificationPutElementParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationContentMutationResponse>

    /**
     * Set locale-specific content overrides for a notification template. Each element override must
     * reference an existing element by ID. Only supported for V2 (elemental) templates.
     */
    fun putLocale(
        localeId: String,
        params: NotificationPutLocaleParams,
    ): CompletableFuture<NotificationContentMutationResponse> =
        putLocale(localeId, params, RequestOptions.none())

    /** @see putLocale */
    fun putLocale(
        localeId: String,
        params: NotificationPutLocaleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationContentMutationResponse> =
        putLocale(params.toBuilder().localeId(localeId).build(), requestOptions)

    /** @see putLocale */
    fun putLocale(
        params: NotificationPutLocaleParams
    ): CompletableFuture<NotificationContentMutationResponse> =
        putLocale(params, RequestOptions.none())

    /** @see putLocale */
    fun putLocale(
        params: NotificationPutLocaleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationContentMutationResponse>

    /** Replace a notification template. All fields are required. */
    fun replace(
        id: String,
        params: NotificationReplaceParams,
    ): CompletableFuture<NotificationTemplateResponse> = replace(id, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        id: String,
        params: NotificationReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationTemplateResponse> =
        replace(params.toBuilder().id(id).build(), requestOptions)

    /** @see replace */
    fun replace(
        params: NotificationReplaceParams
    ): CompletableFuture<NotificationTemplateResponse> = replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: NotificationReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationTemplateResponse>

    /**
     * Retrieve the content of a notification template. The response shape depends on whether the
     * template uses V1 (blocks/channels) or V2 (elemental) content. Use the `version` query
     * parameter to select draft, published, or a specific historical version.
     */
    fun retrieveContent(id: String): CompletableFuture<NotificationRetrieveContentResponse> =
        retrieveContent(id, NotificationRetrieveContentParams.none())

    /** @see retrieveContent */
    fun retrieveContent(
        id: String,
        params: NotificationRetrieveContentParams = NotificationRetrieveContentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationRetrieveContentResponse> =
        retrieveContent(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveContent */
    fun retrieveContent(
        id: String,
        params: NotificationRetrieveContentParams = NotificationRetrieveContentParams.none(),
    ): CompletableFuture<NotificationRetrieveContentResponse> =
        retrieveContent(id, params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(
        params: NotificationRetrieveContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationRetrieveContentResponse>

    /** @see retrieveContent */
    fun retrieveContent(
        params: NotificationRetrieveContentParams
    ): CompletableFuture<NotificationRetrieveContentResponse> =
        retrieveContent(params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationRetrieveContentResponse> =
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

        fun checks(): CheckServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /notifications`, but is otherwise the same as
         * [NotificationServiceAsync.create].
         */
        fun create(
            params: NotificationCreateParams
        ): CompletableFuture<HttpResponseFor<NotificationTemplateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: NotificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateResponse>>

        /** @see create */
        fun create(
            notificationTemplateCreateRequest: NotificationTemplateCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateResponse>> =
            create(
                NotificationCreateParams.builder()
                    .notificationTemplateCreateRequest(notificationTemplateCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            notificationTemplateCreateRequest: NotificationTemplateCreateRequest
        ): CompletableFuture<HttpResponseFor<NotificationTemplateResponse>> =
            create(notificationTemplateCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /notifications/{id}`, but is otherwise the same as
         * [NotificationServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<NotificationTemplateResponse>> =
            retrieve(id, NotificationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NotificationRetrieveParams = NotificationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NotificationRetrieveParams = NotificationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NotificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateResponse>>

        /** @see retrieve */
        fun retrieve(
            params: NotificationRetrieveParams
        ): CompletableFuture<HttpResponseFor<NotificationTemplateResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationTemplateResponse>> =
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
         * Returns a raw HTTP response for `get /notifications/{id}/versions`, but is otherwise the
         * same as [NotificationServiceAsync.listVersions].
         */
        fun listVersions(
            id: String
        ): CompletableFuture<HttpResponseFor<NotificationTemplateVersionListResponse>> =
            listVersions(id, NotificationListVersionsParams.none())

        /** @see listVersions */
        fun listVersions(
            id: String,
            params: NotificationListVersionsParams = NotificationListVersionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateVersionListResponse>> =
            listVersions(params.toBuilder().id(id).build(), requestOptions)

        /** @see listVersions */
        fun listVersions(
            id: String,
            params: NotificationListVersionsParams = NotificationListVersionsParams.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateVersionListResponse>> =
            listVersions(id, params, RequestOptions.none())

        /** @see listVersions */
        fun listVersions(
            params: NotificationListVersionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateVersionListResponse>>

        /** @see listVersions */
        fun listVersions(
            params: NotificationListVersionsParams
        ): CompletableFuture<HttpResponseFor<NotificationTemplateVersionListResponse>> =
            listVersions(params, RequestOptions.none())

        /** @see listVersions */
        fun listVersions(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationTemplateVersionListResponse>> =
            listVersions(id, NotificationListVersionsParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `put /notifications/{id}/content`, but is otherwise the
         * same as [NotificationServiceAsync.putContent].
         */
        fun putContent(
            id: String,
            params: NotificationPutContentParams,
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>> =
            putContent(id, params, RequestOptions.none())

        /** @see putContent */
        fun putContent(
            id: String,
            params: NotificationPutContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>> =
            putContent(params.toBuilder().id(id).build(), requestOptions)

        /** @see putContent */
        fun putContent(
            params: NotificationPutContentParams
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>> =
            putContent(params, RequestOptions.none())

        /** @see putContent */
        fun putContent(
            params: NotificationPutContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>>

        /**
         * Returns a raw HTTP response for `put /notifications/{id}/elements/{elementId}`, but is
         * otherwise the same as [NotificationServiceAsync.putElement].
         */
        fun putElement(
            elementId: String,
            params: NotificationPutElementParams,
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>> =
            putElement(elementId, params, RequestOptions.none())

        /** @see putElement */
        fun putElement(
            elementId: String,
            params: NotificationPutElementParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>> =
            putElement(params.toBuilder().elementId(elementId).build(), requestOptions)

        /** @see putElement */
        fun putElement(
            params: NotificationPutElementParams
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>> =
            putElement(params, RequestOptions.none())

        /** @see putElement */
        fun putElement(
            params: NotificationPutElementParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>>

        /**
         * Returns a raw HTTP response for `put /notifications/{id}/locales/{localeId}`, but is
         * otherwise the same as [NotificationServiceAsync.putLocale].
         */
        fun putLocale(
            localeId: String,
            params: NotificationPutLocaleParams,
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>> =
            putLocale(localeId, params, RequestOptions.none())

        /** @see putLocale */
        fun putLocale(
            localeId: String,
            params: NotificationPutLocaleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>> =
            putLocale(params.toBuilder().localeId(localeId).build(), requestOptions)

        /** @see putLocale */
        fun putLocale(
            params: NotificationPutLocaleParams
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>> =
            putLocale(params, RequestOptions.none())

        /** @see putLocale */
        fun putLocale(
            params: NotificationPutLocaleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>>

        /**
         * Returns a raw HTTP response for `put /notifications/{id}`, but is otherwise the same as
         * [NotificationServiceAsync.replace].
         */
        fun replace(
            id: String,
            params: NotificationReplaceParams,
        ): CompletableFuture<HttpResponseFor<NotificationTemplateResponse>> =
            replace(id, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            id: String,
            params: NotificationReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateResponse>> =
            replace(params.toBuilder().id(id).build(), requestOptions)

        /** @see replace */
        fun replace(
            params: NotificationReplaceParams
        ): CompletableFuture<HttpResponseFor<NotificationTemplateResponse>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: NotificationReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateResponse>>

        /**
         * Returns a raw HTTP response for `get /notifications/{id}/content`, but is otherwise the
         * same as [NotificationServiceAsync.retrieveContent].
         */
        fun retrieveContent(
            id: String
        ): CompletableFuture<HttpResponseFor<NotificationRetrieveContentResponse>> =
            retrieveContent(id, NotificationRetrieveContentParams.none())

        /** @see retrieveContent */
        fun retrieveContent(
            id: String,
            params: NotificationRetrieveContentParams = NotificationRetrieveContentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationRetrieveContentResponse>> =
            retrieveContent(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveContent */
        fun retrieveContent(
            id: String,
            params: NotificationRetrieveContentParams = NotificationRetrieveContentParams.none(),
        ): CompletableFuture<HttpResponseFor<NotificationRetrieveContentResponse>> =
            retrieveContent(id, params, RequestOptions.none())

        /** @see retrieveContent */
        fun retrieveContent(
            params: NotificationRetrieveContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationRetrieveContentResponse>>

        /** @see retrieveContent */
        fun retrieveContent(
            params: NotificationRetrieveContentParams
        ): CompletableFuture<HttpResponseFor<NotificationRetrieveContentResponse>> =
            retrieveContent(params, RequestOptions.none())

        /** @see retrieveContent */
        fun retrieveContent(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationRetrieveContentResponse>> =
            retrieveContent(id, NotificationRetrieveContentParams.none(), requestOptions)
    }
}

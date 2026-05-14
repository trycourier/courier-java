// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.journeys

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.journeys.JourneyTemplateGetResponse
import com.courier.models.journeys.JourneyTemplateListResponse
import com.courier.models.journeys.templates.TemplateArchiveParams
import com.courier.models.journeys.templates.TemplateCreateParams
import com.courier.models.journeys.templates.TemplateListParams
import com.courier.models.journeys.templates.TemplateListVersionsParams
import com.courier.models.journeys.templates.TemplatePublishParams
import com.courier.models.journeys.templates.TemplateReplaceParams
import com.courier.models.journeys.templates.TemplateRetrieveParams
import com.courier.models.notifications.NotificationTemplateVersionListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TemplateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateServiceAsync

    /**
     * Create a notification template scoped to this journey. The template is created in DRAFT
     * state.
     */
    fun create(
        templateId: String,
        params: TemplateCreateParams,
    ): CompletableFuture<JourneyTemplateGetResponse> =
        create(templateId, params, RequestOptions.none())

    /** @see create */
    fun create(
        templateId: String,
        params: TemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyTemplateGetResponse> =
        create(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see create */
    fun create(params: TemplateCreateParams): CompletableFuture<JourneyTemplateGetResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyTemplateGetResponse>

    /**
     * Fetch a journey-scoped notification template by id. Pass `?version=draft` (default
     * `published`) to retrieve the working draft, or `?version=vN` for a historical version.
     */
    fun retrieve(
        notificationId: String,
        params: TemplateRetrieveParams,
    ): CompletableFuture<JourneyTemplateGetResponse> =
        retrieve(notificationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        notificationId: String,
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyTemplateGetResponse> =
        retrieve(params.toBuilder().notificationId(notificationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TemplateRetrieveParams): CompletableFuture<JourneyTemplateGetResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyTemplateGetResponse>

    /**
     * List notification templates scoped to this journey. Templates scoped to a journey can only be
     * referenced from `send` nodes of the same journey.
     */
    fun list(templateId: String): CompletableFuture<JourneyTemplateListResponse> =
        list(templateId, TemplateListParams.none())

    /** @see list */
    fun list(
        templateId: String,
        params: TemplateListParams = TemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyTemplateListResponse> =
        list(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see list */
    fun list(
        templateId: String,
        params: TemplateListParams = TemplateListParams.none(),
    ): CompletableFuture<JourneyTemplateListResponse> =
        list(templateId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TemplateListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyTemplateListResponse>

    /** @see list */
    fun list(params: TemplateListParams): CompletableFuture<JourneyTemplateListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        templateId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<JourneyTemplateListResponse> =
        list(templateId, TemplateListParams.none(), requestOptions)

    /** Archive a journey-scoped notification template. Archived templates cannot be sent. */
    fun archive(notificationId: String, params: TemplateArchiveParams): CompletableFuture<Void?> =
        archive(notificationId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        notificationId: String,
        params: TemplateArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        archive(params.toBuilder().notificationId(notificationId).build(), requestOptions)

    /** @see archive */
    fun archive(params: TemplateArchiveParams): CompletableFuture<Void?> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: TemplateArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * List published versions of a journey-scoped notification template, ordered most recent first.
     */
    fun listVersions(
        notificationId: String,
        params: TemplateListVersionsParams,
    ): CompletableFuture<NotificationTemplateVersionListResponse> =
        listVersions(notificationId, params, RequestOptions.none())

    /** @see listVersions */
    fun listVersions(
        notificationId: String,
        params: TemplateListVersionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationTemplateVersionListResponse> =
        listVersions(params.toBuilder().notificationId(notificationId).build(), requestOptions)

    /** @see listVersions */
    fun listVersions(
        params: TemplateListVersionsParams
    ): CompletableFuture<NotificationTemplateVersionListResponse> =
        listVersions(params, RequestOptions.none())

    /** @see listVersions */
    fun listVersions(
        params: TemplateListVersionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationTemplateVersionListResponse>

    /** Publish the current draft of a journey-scoped notification template. */
    fun publish(notificationId: String, params: TemplatePublishParams): CompletableFuture<Void?> =
        publish(notificationId, params, RequestOptions.none())

    /** @see publish */
    fun publish(
        notificationId: String,
        params: TemplatePublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        publish(params.toBuilder().notificationId(notificationId).build(), requestOptions)

    /** @see publish */
    fun publish(params: TemplatePublishParams): CompletableFuture<Void?> =
        publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(
        params: TemplatePublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Replace a journey-scoped notification template draft. */
    fun replace(
        notificationId: String,
        params: TemplateReplaceParams,
    ): CompletableFuture<JourneyTemplateGetResponse> =
        replace(notificationId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        notificationId: String,
        params: TemplateReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyTemplateGetResponse> =
        replace(params.toBuilder().notificationId(notificationId).build(), requestOptions)

    /** @see replace */
    fun replace(params: TemplateReplaceParams): CompletableFuture<JourneyTemplateGetResponse> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: TemplateReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyTemplateGetResponse>

    /**
     * A view of [TemplateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TemplateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /journeys/{templateId}/templates`, but is otherwise
         * the same as [TemplateServiceAsync.create].
         */
        fun create(
            templateId: String,
            params: TemplateCreateParams,
        ): CompletableFuture<HttpResponseFor<JourneyTemplateGetResponse>> =
            create(templateId, params, RequestOptions.none())

        /** @see create */
        fun create(
            templateId: String,
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyTemplateGetResponse>> =
            create(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see create */
        fun create(
            params: TemplateCreateParams
        ): CompletableFuture<HttpResponseFor<JourneyTemplateGetResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyTemplateGetResponse>>

        /**
         * Returns a raw HTTP response for `get /journeys/{templateId}/templates/{notificationId}`,
         * but is otherwise the same as [TemplateServiceAsync.retrieve].
         */
        fun retrieve(
            notificationId: String,
            params: TemplateRetrieveParams,
        ): CompletableFuture<HttpResponseFor<JourneyTemplateGetResponse>> =
            retrieve(notificationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            notificationId: String,
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyTemplateGetResponse>> =
            retrieve(params.toBuilder().notificationId(notificationId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: TemplateRetrieveParams
        ): CompletableFuture<HttpResponseFor<JourneyTemplateGetResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyTemplateGetResponse>>

        /**
         * Returns a raw HTTP response for `get /journeys/{templateId}/templates`, but is otherwise
         * the same as [TemplateServiceAsync.list].
         */
        fun list(
            templateId: String
        ): CompletableFuture<HttpResponseFor<JourneyTemplateListResponse>> =
            list(templateId, TemplateListParams.none())

        /** @see list */
        fun list(
            templateId: String,
            params: TemplateListParams = TemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyTemplateListResponse>> =
            list(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see list */
        fun list(
            templateId: String,
            params: TemplateListParams = TemplateListParams.none(),
        ): CompletableFuture<HttpResponseFor<JourneyTemplateListResponse>> =
            list(templateId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TemplateListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyTemplateListResponse>>

        /** @see list */
        fun list(
            params: TemplateListParams
        ): CompletableFuture<HttpResponseFor<JourneyTemplateListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            templateId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JourneyTemplateListResponse>> =
            list(templateId, TemplateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /journeys/{templateId}/templates/{notificationId}`, but is otherwise the same as
         * [TemplateServiceAsync.archive].
         */
        fun archive(
            notificationId: String,
            params: TemplateArchiveParams,
        ): CompletableFuture<HttpResponse> = archive(notificationId, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            notificationId: String,
            params: TemplateArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            archive(params.toBuilder().notificationId(notificationId).build(), requestOptions)

        /** @see archive */
        fun archive(params: TemplateArchiveParams): CompletableFuture<HttpResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: TemplateArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /journeys/{templateId}/templates/{notificationId}/versions`, but is otherwise the same as
         * [TemplateServiceAsync.listVersions].
         */
        fun listVersions(
            notificationId: String,
            params: TemplateListVersionsParams,
        ): CompletableFuture<HttpResponseFor<NotificationTemplateVersionListResponse>> =
            listVersions(notificationId, params, RequestOptions.none())

        /** @see listVersions */
        fun listVersions(
            notificationId: String,
            params: TemplateListVersionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateVersionListResponse>> =
            listVersions(params.toBuilder().notificationId(notificationId).build(), requestOptions)

        /** @see listVersions */
        fun listVersions(
            params: TemplateListVersionsParams
        ): CompletableFuture<HttpResponseFor<NotificationTemplateVersionListResponse>> =
            listVersions(params, RequestOptions.none())

        /** @see listVersions */
        fun listVersions(
            params: TemplateListVersionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationTemplateVersionListResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /journeys/{templateId}/templates/{notificationId}/publish`, but is otherwise the same as
         * [TemplateServiceAsync.publish].
         */
        fun publish(
            notificationId: String,
            params: TemplatePublishParams,
        ): CompletableFuture<HttpResponse> = publish(notificationId, params, RequestOptions.none())

        /** @see publish */
        fun publish(
            notificationId: String,
            params: TemplatePublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            publish(params.toBuilder().notificationId(notificationId).build(), requestOptions)

        /** @see publish */
        fun publish(params: TemplatePublishParams): CompletableFuture<HttpResponse> =
            publish(params, RequestOptions.none())

        /** @see publish */
        fun publish(
            params: TemplatePublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /journeys/{templateId}/templates/{notificationId}`,
         * but is otherwise the same as [TemplateServiceAsync.replace].
         */
        fun replace(
            notificationId: String,
            params: TemplateReplaceParams,
        ): CompletableFuture<HttpResponseFor<JourneyTemplateGetResponse>> =
            replace(notificationId, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            notificationId: String,
            params: TemplateReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyTemplateGetResponse>> =
            replace(params.toBuilder().notificationId(notificationId).build(), requestOptions)

        /** @see replace */
        fun replace(
            params: TemplateReplaceParams
        ): CompletableFuture<HttpResponseFor<JourneyTemplateGetResponse>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: TemplateReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyTemplateGetResponse>>
    }
}

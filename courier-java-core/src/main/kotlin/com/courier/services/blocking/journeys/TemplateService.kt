// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.journeys

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
import com.courier.models.journeys.templates.TemplatePutContentParams
import com.courier.models.journeys.templates.TemplatePutLocaleParams
import com.courier.models.journeys.templates.TemplateReplaceParams
import com.courier.models.journeys.templates.TemplateRetrieveContentParams
import com.courier.models.journeys.templates.TemplateRetrieveParams
import com.courier.models.notifications.NotificationContentGetResponse
import com.courier.models.notifications.NotificationContentMutationResponse
import com.courier.models.notifications.NotificationTemplateVersionListResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface TemplateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService

    /**
     * Create a notification template scoped to this journey. Defaults to `DRAFT` state; pass
     * `state: "PUBLISHED"` to publish on create.
     */
    fun create(templateId: String, params: TemplateCreateParams): JourneyTemplateGetResponse =
        create(templateId, params, RequestOptions.none())

    /** @see create */
    fun create(
        templateId: String,
        params: TemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyTemplateGetResponse =
        create(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see create */
    fun create(params: TemplateCreateParams): JourneyTemplateGetResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyTemplateGetResponse

    /**
     * Fetch a journey-scoped notification template by id. Pass `?version=draft` (default
     * `published`) to retrieve the working draft, or `?version=vN` for a historical version.
     */
    fun retrieve(
        notificationId: String,
        params: TemplateRetrieveParams,
    ): JourneyTemplateGetResponse = retrieve(notificationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        notificationId: String,
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyTemplateGetResponse =
        retrieve(params.toBuilder().notificationId(notificationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TemplateRetrieveParams): JourneyTemplateGetResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyTemplateGetResponse

    /**
     * List notification templates scoped to this journey. Journey-scoped notification templates can
     * only be referenced from `send` nodes within the same journey.
     */
    fun list(templateId: String): JourneyTemplateListResponse =
        list(templateId, TemplateListParams.none())

    /** @see list */
    fun list(
        templateId: String,
        params: TemplateListParams = TemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyTemplateListResponse =
        list(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see list */
    fun list(
        templateId: String,
        params: TemplateListParams = TemplateListParams.none(),
    ): JourneyTemplateListResponse = list(templateId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TemplateListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyTemplateListResponse

    /** @see list */
    fun list(params: TemplateListParams): JourneyTemplateListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(templateId: String, requestOptions: RequestOptions): JourneyTemplateListResponse =
        list(templateId, TemplateListParams.none(), requestOptions)

    /** Archive the journey-scoped notification template. Archived templates cannot be sent. */
    fun archive(notificationId: String, params: TemplateArchiveParams) =
        archive(notificationId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        notificationId: String,
        params: TemplateArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archive(params.toBuilder().notificationId(notificationId).build(), requestOptions)

    /** @see archive */
    fun archive(params: TemplateArchiveParams) = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: TemplateArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * List published versions of the journey-scoped notification template, ordered most recent
     * first.
     */
    fun listVersions(
        notificationId: String,
        params: TemplateListVersionsParams,
    ): NotificationTemplateVersionListResponse =
        listVersions(notificationId, params, RequestOptions.none())

    /** @see listVersions */
    fun listVersions(
        notificationId: String,
        params: TemplateListVersionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationTemplateVersionListResponse =
        listVersions(params.toBuilder().notificationId(notificationId).build(), requestOptions)

    /** @see listVersions */
    fun listVersions(params: TemplateListVersionsParams): NotificationTemplateVersionListResponse =
        listVersions(params, RequestOptions.none())

    /** @see listVersions */
    fun listVersions(
        params: TemplateListVersionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationTemplateVersionListResponse

    /**
     * Publish the current draft of the journey-scoped notification template as a new version.
     * Optionally roll back to a prior version by passing `{ "version": "vN" }`.
     */
    fun publish(notificationId: String, params: TemplatePublishParams) =
        publish(notificationId, params, RequestOptions.none())

    /** @see publish */
    fun publish(
        notificationId: String,
        params: TemplatePublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = publish(params.toBuilder().notificationId(notificationId).build(), requestOptions)

    /** @see publish */
    fun publish(params: TemplatePublishParams) = publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(
        params: TemplatePublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Replace the elemental content of a journey-scoped notification template. Overwrites all
     * elements in the template draft with the provided content.
     */
    fun putContent(
        notificationId: String,
        params: TemplatePutContentParams,
    ): NotificationContentMutationResponse =
        putContent(notificationId, params, RequestOptions.none())

    /** @see putContent */
    fun putContent(
        notificationId: String,
        params: TemplatePutContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationContentMutationResponse =
        putContent(params.toBuilder().notificationId(notificationId).build(), requestOptions)

    /** @see putContent */
    fun putContent(params: TemplatePutContentParams): NotificationContentMutationResponse =
        putContent(params, RequestOptions.none())

    /** @see putContent */
    fun putContent(
        params: TemplatePutContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationContentMutationResponse

    /**
     * Set locale-specific content overrides for a journey-scoped notification template. Each
     * element override must reference an existing element by ID.
     */
    fun putLocale(
        localeId: String,
        params: TemplatePutLocaleParams,
    ): NotificationContentMutationResponse = putLocale(localeId, params, RequestOptions.none())

    /** @see putLocale */
    fun putLocale(
        localeId: String,
        params: TemplatePutLocaleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationContentMutationResponse =
        putLocale(params.toBuilder().localeId(localeId).build(), requestOptions)

    /** @see putLocale */
    fun putLocale(params: TemplatePutLocaleParams): NotificationContentMutationResponse =
        putLocale(params, RequestOptions.none())

    /** @see putLocale */
    fun putLocale(
        params: TemplatePutLocaleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationContentMutationResponse

    /** Replace the journey-scoped notification template draft. */
    fun replace(notificationId: String, params: TemplateReplaceParams): JourneyTemplateGetResponse =
        replace(notificationId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        notificationId: String,
        params: TemplateReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyTemplateGetResponse =
        replace(params.toBuilder().notificationId(notificationId).build(), requestOptions)

    /** @see replace */
    fun replace(params: TemplateReplaceParams): JourneyTemplateGetResponse =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: TemplateReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyTemplateGetResponse

    /**
     * Retrieve the elemental content of a journey-scoped notification template. The response
     * contains the versioned elements along with their content checksums, which can be used to
     * detect changes between versions. Pass `?version=draft` (default `published`) to retrieve the
     * working draft, or `?version=vN` for a historical version.
     */
    fun retrieveContent(
        notificationId: String,
        params: TemplateRetrieveContentParams,
    ): NotificationContentGetResponse =
        retrieveContent(notificationId, params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(
        notificationId: String,
        params: TemplateRetrieveContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationContentGetResponse =
        retrieveContent(params.toBuilder().notificationId(notificationId).build(), requestOptions)

    /** @see retrieveContent */
    fun retrieveContent(params: TemplateRetrieveContentParams): NotificationContentGetResponse =
        retrieveContent(params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(
        params: TemplateRetrieveContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationContentGetResponse

    /** A view of [TemplateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /journeys/{templateId}/templates`, but is otherwise
         * the same as [TemplateService.create].
         */
        @MustBeClosed
        fun create(
            templateId: String,
            params: TemplateCreateParams,
        ): HttpResponseFor<JourneyTemplateGetResponse> =
            create(templateId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            templateId: String,
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyTemplateGetResponse> =
            create(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: TemplateCreateParams): HttpResponseFor<JourneyTemplateGetResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyTemplateGetResponse>

        /**
         * Returns a raw HTTP response for `get /journeys/{templateId}/templates/{notificationId}`,
         * but is otherwise the same as [TemplateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            notificationId: String,
            params: TemplateRetrieveParams,
        ): HttpResponseFor<JourneyTemplateGetResponse> =
            retrieve(notificationId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            notificationId: String,
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyTemplateGetResponse> =
            retrieve(params.toBuilder().notificationId(notificationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TemplateRetrieveParams): HttpResponseFor<JourneyTemplateGetResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyTemplateGetResponse>

        /**
         * Returns a raw HTTP response for `get /journeys/{templateId}/templates`, but is otherwise
         * the same as [TemplateService.list].
         */
        @MustBeClosed
        fun list(templateId: String): HttpResponseFor<JourneyTemplateListResponse> =
            list(templateId, TemplateListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            templateId: String,
            params: TemplateListParams = TemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyTemplateListResponse> =
            list(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            templateId: String,
            params: TemplateListParams = TemplateListParams.none(),
        ): HttpResponseFor<JourneyTemplateListResponse> =
            list(templateId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TemplateListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyTemplateListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: TemplateListParams): HttpResponseFor<JourneyTemplateListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            templateId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyTemplateListResponse> =
            list(templateId, TemplateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /journeys/{templateId}/templates/{notificationId}`, but is otherwise the same as
         * [TemplateService.archive].
         */
        @MustBeClosed
        fun archive(notificationId: String, params: TemplateArchiveParams): HttpResponse =
            archive(notificationId, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            notificationId: String,
            params: TemplateArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            archive(params.toBuilder().notificationId(notificationId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(params: TemplateArchiveParams): HttpResponse =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: TemplateArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /journeys/{templateId}/templates/{notificationId}/versions`, but is otherwise the same as
         * [TemplateService.listVersions].
         */
        @MustBeClosed
        fun listVersions(
            notificationId: String,
            params: TemplateListVersionsParams,
        ): HttpResponseFor<NotificationTemplateVersionListResponse> =
            listVersions(notificationId, params, RequestOptions.none())

        /** @see listVersions */
        @MustBeClosed
        fun listVersions(
            notificationId: String,
            params: TemplateListVersionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationTemplateVersionListResponse> =
            listVersions(params.toBuilder().notificationId(notificationId).build(), requestOptions)

        /** @see listVersions */
        @MustBeClosed
        fun listVersions(
            params: TemplateListVersionsParams
        ): HttpResponseFor<NotificationTemplateVersionListResponse> =
            listVersions(params, RequestOptions.none())

        /** @see listVersions */
        @MustBeClosed
        fun listVersions(
            params: TemplateListVersionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationTemplateVersionListResponse>

        /**
         * Returns a raw HTTP response for `post
         * /journeys/{templateId}/templates/{notificationId}/publish`, but is otherwise the same as
         * [TemplateService.publish].
         */
        @MustBeClosed
        fun publish(notificationId: String, params: TemplatePublishParams): HttpResponse =
            publish(notificationId, params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            notificationId: String,
            params: TemplatePublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            publish(params.toBuilder().notificationId(notificationId).build(), requestOptions)

        /** @see publish */
        @MustBeClosed
        fun publish(params: TemplatePublishParams): HttpResponse =
            publish(params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            params: TemplatePublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put
         * /journeys/{templateId}/templates/{notificationId}/content`, but is otherwise the same as
         * [TemplateService.putContent].
         */
        @MustBeClosed
        fun putContent(
            notificationId: String,
            params: TemplatePutContentParams,
        ): HttpResponseFor<NotificationContentMutationResponse> =
            putContent(notificationId, params, RequestOptions.none())

        /** @see putContent */
        @MustBeClosed
        fun putContent(
            notificationId: String,
            params: TemplatePutContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationContentMutationResponse> =
            putContent(params.toBuilder().notificationId(notificationId).build(), requestOptions)

        /** @see putContent */
        @MustBeClosed
        fun putContent(
            params: TemplatePutContentParams
        ): HttpResponseFor<NotificationContentMutationResponse> =
            putContent(params, RequestOptions.none())

        /** @see putContent */
        @MustBeClosed
        fun putContent(
            params: TemplatePutContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationContentMutationResponse>

        /**
         * Returns a raw HTTP response for `put
         * /journeys/{templateId}/templates/{notificationId}/locales/{localeId}`, but is otherwise
         * the same as [TemplateService.putLocale].
         */
        @MustBeClosed
        fun putLocale(
            localeId: String,
            params: TemplatePutLocaleParams,
        ): HttpResponseFor<NotificationContentMutationResponse> =
            putLocale(localeId, params, RequestOptions.none())

        /** @see putLocale */
        @MustBeClosed
        fun putLocale(
            localeId: String,
            params: TemplatePutLocaleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationContentMutationResponse> =
            putLocale(params.toBuilder().localeId(localeId).build(), requestOptions)

        /** @see putLocale */
        @MustBeClosed
        fun putLocale(
            params: TemplatePutLocaleParams
        ): HttpResponseFor<NotificationContentMutationResponse> =
            putLocale(params, RequestOptions.none())

        /** @see putLocale */
        @MustBeClosed
        fun putLocale(
            params: TemplatePutLocaleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationContentMutationResponse>

        /**
         * Returns a raw HTTP response for `put /journeys/{templateId}/templates/{notificationId}`,
         * but is otherwise the same as [TemplateService.replace].
         */
        @MustBeClosed
        fun replace(
            notificationId: String,
            params: TemplateReplaceParams,
        ): HttpResponseFor<JourneyTemplateGetResponse> =
            replace(notificationId, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            notificationId: String,
            params: TemplateReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyTemplateGetResponse> =
            replace(params.toBuilder().notificationId(notificationId).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(params: TemplateReplaceParams): HttpResponseFor<JourneyTemplateGetResponse> =
            replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: TemplateReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyTemplateGetResponse>

        /**
         * Returns a raw HTTP response for `get
         * /journeys/{templateId}/templates/{notificationId}/content`, but is otherwise the same as
         * [TemplateService.retrieveContent].
         */
        @MustBeClosed
        fun retrieveContent(
            notificationId: String,
            params: TemplateRetrieveContentParams,
        ): HttpResponseFor<NotificationContentGetResponse> =
            retrieveContent(notificationId, params, RequestOptions.none())

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            notificationId: String,
            params: TemplateRetrieveContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationContentGetResponse> =
            retrieveContent(
                params.toBuilder().notificationId(notificationId).build(),
                requestOptions,
            )

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            params: TemplateRetrieveContentParams
        ): HttpResponseFor<NotificationContentGetResponse> =
            retrieveContent(params, RequestOptions.none())

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            params: TemplateRetrieveContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationContentGetResponse>
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.preferencesections.PreferenceSectionArchiveParams
import com.courier.models.preferencesections.PreferenceSectionCreateParams
import com.courier.models.preferencesections.PreferenceSectionCreateRequest
import com.courier.models.preferencesections.PreferenceSectionGetResponse
import com.courier.models.preferencesections.PreferenceSectionListParams
import com.courier.models.preferencesections.PreferenceSectionListResponse
import com.courier.models.preferencesections.PreferenceSectionPublishParams
import com.courier.models.preferencesections.PreferenceSectionReplaceParams
import com.courier.models.preferencesections.PreferenceSectionRetrieveParams
import com.courier.models.preferencesections.PublishPreferencesResponse
import com.courier.services.blocking.preferencesections.TopicService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface PreferenceSectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreferenceSectionService

    fun topics(): TopicService

    /**
     * Create a preference section in your workspace. The section id is generated and returned.
     * Topics are created inside a section via POST /preferences/sections/{section_id}/topics.
     */
    fun create(params: PreferenceSectionCreateParams): PreferenceSectionGetResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PreferenceSectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSectionGetResponse

    /** @see create */
    fun create(
        preferenceSectionCreateRequest: PreferenceSectionCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSectionGetResponse =
        create(
            PreferenceSectionCreateParams.builder()
                .preferenceSectionCreateRequest(preferenceSectionCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        preferenceSectionCreateRequest: PreferenceSectionCreateRequest
    ): PreferenceSectionGetResponse = create(preferenceSectionCreateRequest, RequestOptions.none())

    /** Retrieve a preference section by id, including its topics. */
    fun retrieve(sectionId: String): PreferenceSectionGetResponse =
        retrieve(sectionId, PreferenceSectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        sectionId: String,
        params: PreferenceSectionRetrieveParams = PreferenceSectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSectionGetResponse =
        retrieve(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        sectionId: String,
        params: PreferenceSectionRetrieveParams = PreferenceSectionRetrieveParams.none(),
    ): PreferenceSectionGetResponse = retrieve(sectionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PreferenceSectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSectionGetResponse

    /** @see retrieve */
    fun retrieve(params: PreferenceSectionRetrieveParams): PreferenceSectionGetResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(sectionId: String, requestOptions: RequestOptions): PreferenceSectionGetResponse =
        retrieve(sectionId, PreferenceSectionRetrieveParams.none(), requestOptions)

    /**
     * List the workspace's preference sections. Each section embeds its topics. Scoped to the
     * workspace of the API key.
     */
    fun list(): PreferenceSectionListResponse = list(PreferenceSectionListParams.none())

    /** @see list */
    fun list(
        params: PreferenceSectionListParams = PreferenceSectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSectionListResponse

    /** @see list */
    fun list(
        params: PreferenceSectionListParams = PreferenceSectionListParams.none()
    ): PreferenceSectionListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PreferenceSectionListResponse =
        list(PreferenceSectionListParams.none(), requestOptions)

    /**
     * Archive a preference section. The section must be empty: delete its topics first, otherwise
     * the request fails with 409.
     */
    fun archive(sectionId: String) = archive(sectionId, PreferenceSectionArchiveParams.none())

    /** @see archive */
    fun archive(
        sectionId: String,
        params: PreferenceSectionArchiveParams = PreferenceSectionArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archive(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see archive */
    fun archive(
        sectionId: String,
        params: PreferenceSectionArchiveParams = PreferenceSectionArchiveParams.none(),
    ) = archive(sectionId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: PreferenceSectionArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see archive */
    fun archive(params: PreferenceSectionArchiveParams) = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(sectionId: String, requestOptions: RequestOptions) =
        archive(sectionId, PreferenceSectionArchiveParams.none(), requestOptions)

    /**
     * Publish the workspace's preferences page. Takes a snapshot of every section with its topics
     * under a new published version, making the current state visible on the hosted preferences
     * page (non-draft).
     */
    fun publish(): PublishPreferencesResponse = publish(PreferenceSectionPublishParams.none())

    /** @see publish */
    fun publish(
        params: PreferenceSectionPublishParams = PreferenceSectionPublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublishPreferencesResponse

    /** @see publish */
    fun publish(
        params: PreferenceSectionPublishParams = PreferenceSectionPublishParams.none()
    ): PublishPreferencesResponse = publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(requestOptions: RequestOptions): PublishPreferencesResponse =
        publish(PreferenceSectionPublishParams.none(), requestOptions)

    /**
     * Replace a preference section. Full document replacement; missing optional fields are cleared.
     * Topics attached to the section are unaffected.
     */
    fun replace(
        sectionId: String,
        params: PreferenceSectionReplaceParams,
    ): PreferenceSectionGetResponse = replace(sectionId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        sectionId: String,
        params: PreferenceSectionReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSectionGetResponse =
        replace(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see replace */
    fun replace(params: PreferenceSectionReplaceParams): PreferenceSectionGetResponse =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: PreferenceSectionReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSectionGetResponse

    /**
     * A view of [PreferenceSectionService] that provides access to raw HTTP responses for each
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
        ): PreferenceSectionService.WithRawResponse

        fun topics(): TopicService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /preferences/sections`, but is otherwise the same
         * as [PreferenceSectionService.create].
         */
        @MustBeClosed
        fun create(
            params: PreferenceSectionCreateParams
        ): HttpResponseFor<PreferenceSectionGetResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PreferenceSectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSectionGetResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            preferenceSectionCreateRequest: PreferenceSectionCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSectionGetResponse> =
            create(
                PreferenceSectionCreateParams.builder()
                    .preferenceSectionCreateRequest(preferenceSectionCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            preferenceSectionCreateRequest: PreferenceSectionCreateRequest
        ): HttpResponseFor<PreferenceSectionGetResponse> =
            create(preferenceSectionCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /preferences/sections/{section_id}`, but is
         * otherwise the same as [PreferenceSectionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(sectionId: String): HttpResponseFor<PreferenceSectionGetResponse> =
            retrieve(sectionId, PreferenceSectionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            sectionId: String,
            params: PreferenceSectionRetrieveParams = PreferenceSectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSectionGetResponse> =
            retrieve(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            sectionId: String,
            params: PreferenceSectionRetrieveParams = PreferenceSectionRetrieveParams.none(),
        ): HttpResponseFor<PreferenceSectionGetResponse> =
            retrieve(sectionId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PreferenceSectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSectionGetResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PreferenceSectionRetrieveParams
        ): HttpResponseFor<PreferenceSectionGetResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            sectionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PreferenceSectionGetResponse> =
            retrieve(sectionId, PreferenceSectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /preferences/sections`, but is otherwise the same as
         * [PreferenceSectionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PreferenceSectionListResponse> =
            list(PreferenceSectionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PreferenceSectionListParams = PreferenceSectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSectionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PreferenceSectionListParams = PreferenceSectionListParams.none()
        ): HttpResponseFor<PreferenceSectionListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PreferenceSectionListResponse> =
            list(PreferenceSectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /preferences/sections/{section_id}`, but is
         * otherwise the same as [PreferenceSectionService.archive].
         */
        @MustBeClosed
        fun archive(sectionId: String): HttpResponse =
            archive(sectionId, PreferenceSectionArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            sectionId: String,
            params: PreferenceSectionArchiveParams = PreferenceSectionArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = archive(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            sectionId: String,
            params: PreferenceSectionArchiveParams = PreferenceSectionArchiveParams.none(),
        ): HttpResponse = archive(sectionId, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: PreferenceSectionArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see archive */
        @MustBeClosed
        fun archive(params: PreferenceSectionArchiveParams): HttpResponse =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(sectionId: String, requestOptions: RequestOptions): HttpResponse =
            archive(sectionId, PreferenceSectionArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /preferences/publish`, but is otherwise the same as
         * [PreferenceSectionService.publish].
         */
        @MustBeClosed
        fun publish(): HttpResponseFor<PublishPreferencesResponse> =
            publish(PreferenceSectionPublishParams.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            params: PreferenceSectionPublishParams = PreferenceSectionPublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublishPreferencesResponse>

        /** @see publish */
        @MustBeClosed
        fun publish(
            params: PreferenceSectionPublishParams = PreferenceSectionPublishParams.none()
        ): HttpResponseFor<PublishPreferencesResponse> = publish(params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(requestOptions: RequestOptions): HttpResponseFor<PublishPreferencesResponse> =
            publish(PreferenceSectionPublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /preferences/sections/{section_id}`, but is
         * otherwise the same as [PreferenceSectionService.replace].
         */
        @MustBeClosed
        fun replace(
            sectionId: String,
            params: PreferenceSectionReplaceParams,
        ): HttpResponseFor<PreferenceSectionGetResponse> =
            replace(sectionId, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            sectionId: String,
            params: PreferenceSectionReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSectionGetResponse> =
            replace(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: PreferenceSectionReplaceParams
        ): HttpResponseFor<PreferenceSectionGetResponse> = replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: PreferenceSectionReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSectionGetResponse>
    }
}

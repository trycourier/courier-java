// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.preferencesections

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.preferencesections.PreferenceTopicGetResponse
import com.courier.models.preferencesections.PreferenceTopicListResponse
import com.courier.models.preferencesections.topics.TopicArchiveParams
import com.courier.models.preferencesections.topics.TopicCreateParams
import com.courier.models.preferencesections.topics.TopicListParams
import com.courier.models.preferencesections.topics.TopicReplaceParams
import com.courier.models.preferencesections.topics.TopicRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface TopicService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TopicService

    /**
     * Create a subscription preference topic inside a section. Fails with 404 if the section does
     * not exist. The topic id is generated and returned.
     */
    fun create(sectionId: String, params: TopicCreateParams): PreferenceTopicGetResponse =
        create(sectionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        sectionId: String,
        params: TopicCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceTopicGetResponse =
        create(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see create */
    fun create(params: TopicCreateParams): PreferenceTopicGetResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TopicCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceTopicGetResponse

    /**
     * Retrieve a topic within a section. Returns 404 if the section does not exist, the topic does
     * not exist, or the topic belongs to a different section.
     */
    fun retrieve(topicId: String, params: TopicRetrieveParams): PreferenceTopicGetResponse =
        retrieve(topicId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        topicId: String,
        params: TopicRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceTopicGetResponse =
        retrieve(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TopicRetrieveParams): PreferenceTopicGetResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TopicRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceTopicGetResponse

    /** List the topics in a preference section. */
    fun list(sectionId: String): PreferenceTopicListResponse =
        list(sectionId, TopicListParams.none())

    /** @see list */
    fun list(
        sectionId: String,
        params: TopicListParams = TopicListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceTopicListResponse =
        list(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see list */
    fun list(
        sectionId: String,
        params: TopicListParams = TopicListParams.none(),
    ): PreferenceTopicListResponse = list(sectionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TopicListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceTopicListResponse

    /** @see list */
    fun list(params: TopicListParams): PreferenceTopicListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(sectionId: String, requestOptions: RequestOptions): PreferenceTopicListResponse =
        list(sectionId, TopicListParams.none(), requestOptions)

    /** Archive a topic and remove it from its section. Same 404 rules as GET. */
    fun archive(topicId: String, params: TopicArchiveParams) =
        archive(topicId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        topicId: String,
        params: TopicArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archive(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see archive */
    fun archive(params: TopicArchiveParams) = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(params: TopicArchiveParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Replace a topic within a section. Full document replacement; missing optional fields are
     * cleared. Same 404 rules as GET.
     */
    fun replace(topicId: String, params: TopicReplaceParams): PreferenceTopicGetResponse =
        replace(topicId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        topicId: String,
        params: TopicReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceTopicGetResponse =
        replace(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see replace */
    fun replace(params: TopicReplaceParams): PreferenceTopicGetResponse =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: TopicReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceTopicGetResponse

    /** A view of [TopicService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TopicService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /preferences/sections/{section_id}/topics`, but is
         * otherwise the same as [TopicService.create].
         */
        @MustBeClosed
        fun create(
            sectionId: String,
            params: TopicCreateParams,
        ): HttpResponseFor<PreferenceTopicGetResponse> =
            create(sectionId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            sectionId: String,
            params: TopicCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceTopicGetResponse> =
            create(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: TopicCreateParams): HttpResponseFor<PreferenceTopicGetResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TopicCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceTopicGetResponse>

        /**
         * Returns a raw HTTP response for `get
         * /preferences/sections/{section_id}/topics/{topic_id}`, but is otherwise the same as
         * [TopicService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            topicId: String,
            params: TopicRetrieveParams,
        ): HttpResponseFor<PreferenceTopicGetResponse> =
            retrieve(topicId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            topicId: String,
            params: TopicRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceTopicGetResponse> =
            retrieve(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TopicRetrieveParams): HttpResponseFor<PreferenceTopicGetResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TopicRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceTopicGetResponse>

        /**
         * Returns a raw HTTP response for `get /preferences/sections/{section_id}/topics`, but is
         * otherwise the same as [TopicService.list].
         */
        @MustBeClosed
        fun list(sectionId: String): HttpResponseFor<PreferenceTopicListResponse> =
            list(sectionId, TopicListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            sectionId: String,
            params: TopicListParams = TopicListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceTopicListResponse> =
            list(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            sectionId: String,
            params: TopicListParams = TopicListParams.none(),
        ): HttpResponseFor<PreferenceTopicListResponse> =
            list(sectionId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TopicListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceTopicListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: TopicListParams): HttpResponseFor<PreferenceTopicListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            sectionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PreferenceTopicListResponse> =
            list(sectionId, TopicListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /preferences/sections/{section_id}/topics/{topic_id}`, but is otherwise the same as
         * [TopicService.archive].
         */
        @MustBeClosed
        fun archive(topicId: String, params: TopicArchiveParams): HttpResponse =
            archive(topicId, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            topicId: String,
            params: TopicArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = archive(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(params: TopicArchiveParams): HttpResponse =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: TopicArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put
         * /preferences/sections/{section_id}/topics/{topic_id}`, but is otherwise the same as
         * [TopicService.replace].
         */
        @MustBeClosed
        fun replace(
            topicId: String,
            params: TopicReplaceParams,
        ): HttpResponseFor<PreferenceTopicGetResponse> =
            replace(topicId, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            topicId: String,
            params: TopicReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceTopicGetResponse> =
            replace(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(params: TopicReplaceParams): HttpResponseFor<PreferenceTopicGetResponse> =
            replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: TopicReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceTopicGetResponse>
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.workspacepreferences

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.workspacepreferences.WorkspacePreferenceTopicGetResponse
import com.courier.models.workspacepreferences.WorkspacePreferenceTopicListResponse
import com.courier.models.workspacepreferences.topics.TopicArchiveParams
import com.courier.models.workspacepreferences.topics.TopicCreateParams
import com.courier.models.workspacepreferences.topics.TopicListParams
import com.courier.models.workspacepreferences.topics.TopicReplaceParams
import com.courier.models.workspacepreferences.topics.TopicRetrieveParams
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
     * Create a subscription preference topic inside a workspace preference. Fails with 404 if the
     * workspace preference does not exist. The topic id is generated and returned.
     */
    fun create(sectionId: String, params: TopicCreateParams): WorkspacePreferenceTopicGetResponse =
        create(sectionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        sectionId: String,
        params: TopicCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspacePreferenceTopicGetResponse =
        create(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see create */
    fun create(params: TopicCreateParams): WorkspacePreferenceTopicGetResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TopicCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspacePreferenceTopicGetResponse

    /**
     * Retrieve a topic within a workspace preference. Returns 404 if the workspace preference does
     * not exist, the topic does not exist, or the topic belongs to a different workspace
     * preference.
     */
    fun retrieve(
        topicId: String,
        params: TopicRetrieveParams,
    ): WorkspacePreferenceTopicGetResponse = retrieve(topicId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        topicId: String,
        params: TopicRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspacePreferenceTopicGetResponse =
        retrieve(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TopicRetrieveParams): WorkspacePreferenceTopicGetResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TopicRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspacePreferenceTopicGetResponse

    /** List the topics in a workspace preference. */
    fun list(sectionId: String): WorkspacePreferenceTopicListResponse =
        list(sectionId, TopicListParams.none())

    /** @see list */
    fun list(
        sectionId: String,
        params: TopicListParams = TopicListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspacePreferenceTopicListResponse =
        list(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see list */
    fun list(
        sectionId: String,
        params: TopicListParams = TopicListParams.none(),
    ): WorkspacePreferenceTopicListResponse = list(sectionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TopicListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspacePreferenceTopicListResponse

    /** @see list */
    fun list(params: TopicListParams): WorkspacePreferenceTopicListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        sectionId: String,
        requestOptions: RequestOptions,
    ): WorkspacePreferenceTopicListResponse =
        list(sectionId, TopicListParams.none(), requestOptions)

    /** Archive a topic and remove it from its workspace preference. Same 404 rules as GET. */
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
     * Replace a topic within a workspace preference. Full document replacement; missing optional
     * fields are cleared. Same 404 rules as GET.
     */
    fun replace(topicId: String, params: TopicReplaceParams): WorkspacePreferenceTopicGetResponse =
        replace(topicId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        topicId: String,
        params: TopicReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspacePreferenceTopicGetResponse =
        replace(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see replace */
    fun replace(params: TopicReplaceParams): WorkspacePreferenceTopicGetResponse =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: TopicReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspacePreferenceTopicGetResponse

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
        ): HttpResponseFor<WorkspacePreferenceTopicGetResponse> =
            create(sectionId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            sectionId: String,
            params: TopicCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspacePreferenceTopicGetResponse> =
            create(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: TopicCreateParams
        ): HttpResponseFor<WorkspacePreferenceTopicGetResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TopicCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspacePreferenceTopicGetResponse>

        /**
         * Returns a raw HTTP response for `get
         * /preferences/sections/{section_id}/topics/{topic_id}`, but is otherwise the same as
         * [TopicService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            topicId: String,
            params: TopicRetrieveParams,
        ): HttpResponseFor<WorkspacePreferenceTopicGetResponse> =
            retrieve(topicId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            topicId: String,
            params: TopicRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspacePreferenceTopicGetResponse> =
            retrieve(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TopicRetrieveParams
        ): HttpResponseFor<WorkspacePreferenceTopicGetResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TopicRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspacePreferenceTopicGetResponse>

        /**
         * Returns a raw HTTP response for `get /preferences/sections/{section_id}/topics`, but is
         * otherwise the same as [TopicService.list].
         */
        @MustBeClosed
        fun list(sectionId: String): HttpResponseFor<WorkspacePreferenceTopicListResponse> =
            list(sectionId, TopicListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            sectionId: String,
            params: TopicListParams = TopicListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspacePreferenceTopicListResponse> =
            list(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            sectionId: String,
            params: TopicListParams = TopicListParams.none(),
        ): HttpResponseFor<WorkspacePreferenceTopicListResponse> =
            list(sectionId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TopicListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspacePreferenceTopicListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: TopicListParams): HttpResponseFor<WorkspacePreferenceTopicListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            sectionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WorkspacePreferenceTopicListResponse> =
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
        ): HttpResponseFor<WorkspacePreferenceTopicGetResponse> =
            replace(topicId, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            topicId: String,
            params: TopicReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspacePreferenceTopicGetResponse> =
            replace(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: TopicReplaceParams
        ): HttpResponseFor<WorkspacePreferenceTopicGetResponse> =
            replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: TopicReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspacePreferenceTopicGetResponse>
    }
}

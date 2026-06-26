// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.workspacepreferences

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TopicServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TopicServiceAsync

    /**
     * Create a subscription preference topic inside a workspace preference. Fails with 404 if the
     * workspace preference does not exist. The topic id is generated and returned.
     */
    fun create(
        sectionId: String,
        params: TopicCreateParams,
    ): CompletableFuture<WorkspacePreferenceTopicGetResponse> =
        create(sectionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        sectionId: String,
        params: TopicCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspacePreferenceTopicGetResponse> =
        create(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see create */
    fun create(params: TopicCreateParams): CompletableFuture<WorkspacePreferenceTopicGetResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TopicCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspacePreferenceTopicGetResponse>

    /**
     * Retrieve a topic within a workspace preference. Returns 404 if the workspace preference does
     * not exist, the topic does not exist, or the topic belongs to a different workspace
     * preference.
     */
    fun retrieve(
        topicId: String,
        params: TopicRetrieveParams,
    ): CompletableFuture<WorkspacePreferenceTopicGetResponse> =
        retrieve(topicId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        topicId: String,
        params: TopicRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspacePreferenceTopicGetResponse> =
        retrieve(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: TopicRetrieveParams
    ): CompletableFuture<WorkspacePreferenceTopicGetResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TopicRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspacePreferenceTopicGetResponse>

    /** List the topics in a workspace preference. */
    fun list(sectionId: String): CompletableFuture<WorkspacePreferenceTopicListResponse> =
        list(sectionId, TopicListParams.none())

    /** @see list */
    fun list(
        sectionId: String,
        params: TopicListParams = TopicListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspacePreferenceTopicListResponse> =
        list(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see list */
    fun list(
        sectionId: String,
        params: TopicListParams = TopicListParams.none(),
    ): CompletableFuture<WorkspacePreferenceTopicListResponse> =
        list(sectionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TopicListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspacePreferenceTopicListResponse>

    /** @see list */
    fun list(params: TopicListParams): CompletableFuture<WorkspacePreferenceTopicListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        sectionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkspacePreferenceTopicListResponse> =
        list(sectionId, TopicListParams.none(), requestOptions)

    /** Archive a topic and remove it from its workspace preference. Same 404 rules as GET. */
    fun archive(topicId: String, params: TopicArchiveParams): CompletableFuture<Void?> =
        archive(topicId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        topicId: String,
        params: TopicArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        archive(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see archive */
    fun archive(params: TopicArchiveParams): CompletableFuture<Void?> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: TopicArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Replace a topic within a workspace preference. Full document replacement; missing optional
     * fields are cleared. Same 404 rules as GET.
     */
    fun replace(
        topicId: String,
        params: TopicReplaceParams,
    ): CompletableFuture<WorkspacePreferenceTopicGetResponse> =
        replace(topicId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        topicId: String,
        params: TopicReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspacePreferenceTopicGetResponse> =
        replace(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see replace */
    fun replace(
        params: TopicReplaceParams
    ): CompletableFuture<WorkspacePreferenceTopicGetResponse> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: TopicReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspacePreferenceTopicGetResponse>

    /** A view of [TopicServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TopicServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /preferences/sections/{section_id}/topics`, but is
         * otherwise the same as [TopicServiceAsync.create].
         */
        fun create(
            sectionId: String,
            params: TopicCreateParams,
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicGetResponse>> =
            create(sectionId, params, RequestOptions.none())

        /** @see create */
        fun create(
            sectionId: String,
            params: TopicCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicGetResponse>> =
            create(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see create */
        fun create(
            params: TopicCreateParams
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicGetResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TopicCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicGetResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /preferences/sections/{section_id}/topics/{topic_id}`, but is otherwise the same as
         * [TopicServiceAsync.retrieve].
         */
        fun retrieve(
            topicId: String,
            params: TopicRetrieveParams,
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicGetResponse>> =
            retrieve(topicId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            topicId: String,
            params: TopicRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicGetResponse>> =
            retrieve(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: TopicRetrieveParams
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicGetResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TopicRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicGetResponse>>

        /**
         * Returns a raw HTTP response for `get /preferences/sections/{section_id}/topics`, but is
         * otherwise the same as [TopicServiceAsync.list].
         */
        fun list(
            sectionId: String
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicListResponse>> =
            list(sectionId, TopicListParams.none())

        /** @see list */
        fun list(
            sectionId: String,
            params: TopicListParams = TopicListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicListResponse>> =
            list(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see list */
        fun list(
            sectionId: String,
            params: TopicListParams = TopicListParams.none(),
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicListResponse>> =
            list(sectionId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TopicListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicListResponse>>

        /** @see list */
        fun list(
            params: TopicListParams
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            sectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicListResponse>> =
            list(sectionId, TopicListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /preferences/sections/{section_id}/topics/{topic_id}`, but is otherwise the same as
         * [TopicServiceAsync.archive].
         */
        fun archive(topicId: String, params: TopicArchiveParams): CompletableFuture<HttpResponse> =
            archive(topicId, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            topicId: String,
            params: TopicArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            archive(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see archive */
        fun archive(params: TopicArchiveParams): CompletableFuture<HttpResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: TopicArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put
         * /preferences/sections/{section_id}/topics/{topic_id}`, but is otherwise the same as
         * [TopicServiceAsync.replace].
         */
        fun replace(
            topicId: String,
            params: TopicReplaceParams,
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicGetResponse>> =
            replace(topicId, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            topicId: String,
            params: TopicReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicGetResponse>> =
            replace(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see replace */
        fun replace(
            params: TopicReplaceParams
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicGetResponse>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: TopicReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceTopicGetResponse>>
    }
}

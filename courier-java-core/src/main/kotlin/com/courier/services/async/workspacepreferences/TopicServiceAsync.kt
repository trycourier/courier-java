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
import com.courier.models.workspacepreferences.topics.TopicDeleteDigestParams
import com.courier.models.workspacepreferences.topics.TopicListParams
import com.courier.models.workspacepreferences.topics.TopicReleaseDigestParams
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
     * Creates a subscription topic inside a workspace preference. The default status sets whether
     * users start opted in, opted out, or required.
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
     * Returns one subscription topic with its default status, routing options, allowed preferences,
     * and unsubscribe header setting.
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

    /**
     * Returns the subscription topics inside a workspace preference, each with its default status
     * and routing options.
     */
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

    /**
     * Archives a subscription topic and removes it from its workspace preference, addressed by
     * section id and topic id.
     */
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
     * Turn off a topic's digest, leaving the topic itself in place. The template is unlinked and
     * the digest's schedules are removed along with their delivery rules. Equivalent to sending
     * `digest: null` on a topic replace.
     */
    fun deleteDigest(topicId: String, params: TopicDeleteDigestParams): CompletableFuture<Void?> =
        deleteDigest(topicId, params, RequestOptions.none())

    /** @see deleteDigest */
    fun deleteDigest(
        topicId: String,
        params: TopicDeleteDigestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteDigest(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see deleteDigest */
    fun deleteDigest(params: TopicDeleteDigestParams): CompletableFuture<Void?> =
        deleteDigest(params, RequestOptions.none())

    /** @see deleteDigest */
    fun deleteDigest(
        params: TopicDeleteDigestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Send one recipient's held digest now, instead of waiting for its schedule. Use it to preview
     * what a digest will look like, or to let someone flush their own.
     *
     * Keyed on the topic because that is how a held digest is stored: one per recipient per topic,
     * with the schedule recorded on it rather than part of its identity. To flush every recipient
     * on a schedule instead, use `POST /digests/schedules/{schedule_id}/trigger`.
     */
    fun releaseDigest(topicId: String, params: TopicReleaseDigestParams): CompletableFuture<Void?> =
        releaseDigest(topicId, params, RequestOptions.none())

    /** @see releaseDigest */
    fun releaseDigest(
        topicId: String,
        params: TopicReleaseDigestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        releaseDigest(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see releaseDigest */
    fun releaseDigest(params: TopicReleaseDigestParams): CompletableFuture<Void?> =
        releaseDigest(params, RequestOptions.none())

    /** @see releaseDigest */
    fun releaseDigest(
        params: TopicReleaseDigestParams,
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
         * Returns a raw HTTP response for `delete
         * /preferences/sections/{section_id}/topics/{topic_id}/digest`, but is otherwise the same
         * as [TopicServiceAsync.deleteDigest].
         */
        fun deleteDigest(
            topicId: String,
            params: TopicDeleteDigestParams,
        ): CompletableFuture<HttpResponse> = deleteDigest(topicId, params, RequestOptions.none())

        /** @see deleteDigest */
        fun deleteDigest(
            topicId: String,
            params: TopicDeleteDigestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteDigest(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see deleteDigest */
        fun deleteDigest(params: TopicDeleteDigestParams): CompletableFuture<HttpResponse> =
            deleteDigest(params, RequestOptions.none())

        /** @see deleteDigest */
        fun deleteDigest(
            params: TopicDeleteDigestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /preferences/sections/{section_id}/topics/{topic_id}/digest/release`, but is otherwise
         * the same as [TopicServiceAsync.releaseDigest].
         */
        fun releaseDigest(
            topicId: String,
            params: TopicReleaseDigestParams,
        ): CompletableFuture<HttpResponse> = releaseDigest(topicId, params, RequestOptions.none())

        /** @see releaseDigest */
        fun releaseDigest(
            topicId: String,
            params: TopicReleaseDigestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            releaseDigest(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see releaseDigest */
        fun releaseDigest(params: TopicReleaseDigestParams): CompletableFuture<HttpResponse> =
            releaseDigest(params, RequestOptions.none())

        /** @see releaseDigest */
        fun releaseDigest(
            params: TopicReleaseDigestParams,
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

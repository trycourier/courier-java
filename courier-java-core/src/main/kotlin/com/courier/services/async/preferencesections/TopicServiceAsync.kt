// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.preferencesections

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
     * Create a subscription preference topic inside a section. Fails with 404 if the section does
     * not exist. The topic id is generated and returned.
     */
    fun create(
        sectionId: String,
        params: TopicCreateParams,
    ): CompletableFuture<PreferenceTopicGetResponse> =
        create(sectionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        sectionId: String,
        params: TopicCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceTopicGetResponse> =
        create(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see create */
    fun create(params: TopicCreateParams): CompletableFuture<PreferenceTopicGetResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TopicCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceTopicGetResponse>

    /**
     * Retrieve a topic within a section. Returns 404 if the section does not exist, the topic does
     * not exist, or the topic belongs to a different section.
     */
    fun retrieve(
        topicId: String,
        params: TopicRetrieveParams,
    ): CompletableFuture<PreferenceTopicGetResponse> =
        retrieve(topicId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        topicId: String,
        params: TopicRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceTopicGetResponse> =
        retrieve(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TopicRetrieveParams): CompletableFuture<PreferenceTopicGetResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TopicRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceTopicGetResponse>

    /** List the topics in a preference section. */
    fun list(sectionId: String): CompletableFuture<PreferenceTopicListResponse> =
        list(sectionId, TopicListParams.none())

    /** @see list */
    fun list(
        sectionId: String,
        params: TopicListParams = TopicListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceTopicListResponse> =
        list(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see list */
    fun list(
        sectionId: String,
        params: TopicListParams = TopicListParams.none(),
    ): CompletableFuture<PreferenceTopicListResponse> =
        list(sectionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TopicListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceTopicListResponse>

    /** @see list */
    fun list(params: TopicListParams): CompletableFuture<PreferenceTopicListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        sectionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PreferenceTopicListResponse> =
        list(sectionId, TopicListParams.none(), requestOptions)

    /** Archive a topic and remove it from its section. Same 404 rules as GET. */
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
     * Replace a topic within a section. Full document replacement; missing optional fields are
     * cleared. Same 404 rules as GET.
     */
    fun replace(
        topicId: String,
        params: TopicReplaceParams,
    ): CompletableFuture<PreferenceTopicGetResponse> =
        replace(topicId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        topicId: String,
        params: TopicReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceTopicGetResponse> =
        replace(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see replace */
    fun replace(params: TopicReplaceParams): CompletableFuture<PreferenceTopicGetResponse> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: TopicReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceTopicGetResponse>

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
        ): CompletableFuture<HttpResponseFor<PreferenceTopicGetResponse>> =
            create(sectionId, params, RequestOptions.none())

        /** @see create */
        fun create(
            sectionId: String,
            params: TopicCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceTopicGetResponse>> =
            create(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see create */
        fun create(
            params: TopicCreateParams
        ): CompletableFuture<HttpResponseFor<PreferenceTopicGetResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TopicCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceTopicGetResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /preferences/sections/{section_id}/topics/{topic_id}`, but is otherwise the same as
         * [TopicServiceAsync.retrieve].
         */
        fun retrieve(
            topicId: String,
            params: TopicRetrieveParams,
        ): CompletableFuture<HttpResponseFor<PreferenceTopicGetResponse>> =
            retrieve(topicId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            topicId: String,
            params: TopicRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceTopicGetResponse>> =
            retrieve(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: TopicRetrieveParams
        ): CompletableFuture<HttpResponseFor<PreferenceTopicGetResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TopicRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceTopicGetResponse>>

        /**
         * Returns a raw HTTP response for `get /preferences/sections/{section_id}/topics`, but is
         * otherwise the same as [TopicServiceAsync.list].
         */
        fun list(
            sectionId: String
        ): CompletableFuture<HttpResponseFor<PreferenceTopicListResponse>> =
            list(sectionId, TopicListParams.none())

        /** @see list */
        fun list(
            sectionId: String,
            params: TopicListParams = TopicListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceTopicListResponse>> =
            list(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see list */
        fun list(
            sectionId: String,
            params: TopicListParams = TopicListParams.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceTopicListResponse>> =
            list(sectionId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TopicListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceTopicListResponse>>

        /** @see list */
        fun list(
            params: TopicListParams
        ): CompletableFuture<HttpResponseFor<PreferenceTopicListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            sectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PreferenceTopicListResponse>> =
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
        ): CompletableFuture<HttpResponseFor<PreferenceTopicGetResponse>> =
            replace(topicId, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            topicId: String,
            params: TopicReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceTopicGetResponse>> =
            replace(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see replace */
        fun replace(
            params: TopicReplaceParams
        ): CompletableFuture<HttpResponseFor<PreferenceTopicGetResponse>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: TopicReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceTopicGetResponse>>
    }
}

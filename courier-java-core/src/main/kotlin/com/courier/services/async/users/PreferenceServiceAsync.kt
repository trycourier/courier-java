// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.users

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.users.preferences.PreferenceRetrieveParams
import com.courier.models.users.preferences.PreferenceRetrieveResponse
import com.courier.models.users.preferences.PreferenceRetrieveTopicParams
import com.courier.models.users.preferences.PreferenceRetrieveTopicResponse
import com.courier.models.users.preferences.PreferenceUpdateOrCreateTopicParams
import com.courier.models.users.preferences.PreferenceUpdateOrCreateTopicResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PreferenceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreferenceServiceAsync

    /** Fetch all user preferences. */
    fun retrieve(userId: String): CompletableFuture<PreferenceRetrieveResponse> =
        retrieve(userId, PreferenceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: PreferenceRetrieveParams = PreferenceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceRetrieveResponse> =
        retrieve(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: PreferenceRetrieveParams = PreferenceRetrieveParams.none(),
    ): CompletableFuture<PreferenceRetrieveResponse> =
        retrieve(userId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PreferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: PreferenceRetrieveParams): CompletableFuture<PreferenceRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        userId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PreferenceRetrieveResponse> =
        retrieve(userId, PreferenceRetrieveParams.none(), requestOptions)

    /** Fetch user preferences for a specific subscription topic. */
    fun retrieveTopic(
        topicId: String,
        params: PreferenceRetrieveTopicParams,
    ): CompletableFuture<PreferenceRetrieveTopicResponse> =
        retrieveTopic(topicId, params, RequestOptions.none())

    /** @see retrieveTopic */
    fun retrieveTopic(
        topicId: String,
        params: PreferenceRetrieveTopicParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceRetrieveTopicResponse> =
        retrieveTopic(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see retrieveTopic */
    fun retrieveTopic(
        params: PreferenceRetrieveTopicParams
    ): CompletableFuture<PreferenceRetrieveTopicResponse> =
        retrieveTopic(params, RequestOptions.none())

    /** @see retrieveTopic */
    fun retrieveTopic(
        params: PreferenceRetrieveTopicParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceRetrieveTopicResponse>

    /** Update or Create user preferences for a specific subscription topic. */
    fun updateOrCreateTopic(
        topicId: String,
        params: PreferenceUpdateOrCreateTopicParams,
    ): CompletableFuture<PreferenceUpdateOrCreateTopicResponse> =
        updateOrCreateTopic(topicId, params, RequestOptions.none())

    /** @see updateOrCreateTopic */
    fun updateOrCreateTopic(
        topicId: String,
        params: PreferenceUpdateOrCreateTopicParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceUpdateOrCreateTopicResponse> =
        updateOrCreateTopic(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see updateOrCreateTopic */
    fun updateOrCreateTopic(
        params: PreferenceUpdateOrCreateTopicParams
    ): CompletableFuture<PreferenceUpdateOrCreateTopicResponse> =
        updateOrCreateTopic(params, RequestOptions.none())

    /** @see updateOrCreateTopic */
    fun updateOrCreateTopic(
        params: PreferenceUpdateOrCreateTopicParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceUpdateOrCreateTopicResponse>

    /**
     * A view of [PreferenceServiceAsync] that provides access to raw HTTP responses for each
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
        ): PreferenceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /users/{user_id}/preferences`, but is otherwise the
         * same as [PreferenceServiceAsync.retrieve].
         */
        fun retrieve(
            userId: String
        ): CompletableFuture<HttpResponseFor<PreferenceRetrieveResponse>> =
            retrieve(userId, PreferenceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            userId: String,
            params: PreferenceRetrieveParams = PreferenceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceRetrieveResponse>> =
            retrieve(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            userId: String,
            params: PreferenceRetrieveParams = PreferenceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceRetrieveResponse>> =
            retrieve(userId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PreferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PreferenceRetrieveParams
        ): CompletableFuture<HttpResponseFor<PreferenceRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PreferenceRetrieveResponse>> =
            retrieve(userId, PreferenceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /users/{user_id}/preferences/{topic_id}`, but is
         * otherwise the same as [PreferenceServiceAsync.retrieveTopic].
         */
        fun retrieveTopic(
            topicId: String,
            params: PreferenceRetrieveTopicParams,
        ): CompletableFuture<HttpResponseFor<PreferenceRetrieveTopicResponse>> =
            retrieveTopic(topicId, params, RequestOptions.none())

        /** @see retrieveTopic */
        fun retrieveTopic(
            topicId: String,
            params: PreferenceRetrieveTopicParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceRetrieveTopicResponse>> =
            retrieveTopic(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see retrieveTopic */
        fun retrieveTopic(
            params: PreferenceRetrieveTopicParams
        ): CompletableFuture<HttpResponseFor<PreferenceRetrieveTopicResponse>> =
            retrieveTopic(params, RequestOptions.none())

        /** @see retrieveTopic */
        fun retrieveTopic(
            params: PreferenceRetrieveTopicParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceRetrieveTopicResponse>>

        /**
         * Returns a raw HTTP response for `put /users/{user_id}/preferences/{topic_id}`, but is
         * otherwise the same as [PreferenceServiceAsync.updateOrCreateTopic].
         */
        fun updateOrCreateTopic(
            topicId: String,
            params: PreferenceUpdateOrCreateTopicParams,
        ): CompletableFuture<HttpResponseFor<PreferenceUpdateOrCreateTopicResponse>> =
            updateOrCreateTopic(topicId, params, RequestOptions.none())

        /** @see updateOrCreateTopic */
        fun updateOrCreateTopic(
            topicId: String,
            params: PreferenceUpdateOrCreateTopicParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceUpdateOrCreateTopicResponse>> =
            updateOrCreateTopic(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see updateOrCreateTopic */
        fun updateOrCreateTopic(
            params: PreferenceUpdateOrCreateTopicParams
        ): CompletableFuture<HttpResponseFor<PreferenceUpdateOrCreateTopicResponse>> =
            updateOrCreateTopic(params, RequestOptions.none())

        /** @see updateOrCreateTopic */
        fun updateOrCreateTopic(
            params: PreferenceUpdateOrCreateTopicParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceUpdateOrCreateTopicResponse>>
    }
}

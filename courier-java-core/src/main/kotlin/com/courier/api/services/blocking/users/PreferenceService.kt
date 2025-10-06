// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking.users

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.users.preferences.PreferenceRetrieveParams
import com.courier.api.models.users.preferences.PreferenceRetrieveResponse
import com.courier.api.models.users.preferences.PreferenceRetrieveTopicParams
import com.courier.api.models.users.preferences.PreferenceRetrieveTopicResponse
import com.courier.api.models.users.preferences.PreferenceUpdateOrCreateTopicParams
import com.courier.api.models.users.preferences.PreferenceUpdateOrCreateTopicResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface PreferenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreferenceService

    /** Fetch all user preferences. */
    fun retrieve(userId: String): PreferenceRetrieveResponse =
        retrieve(userId, PreferenceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: PreferenceRetrieveParams = PreferenceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceRetrieveResponse =
        retrieve(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: PreferenceRetrieveParams = PreferenceRetrieveParams.none(),
    ): PreferenceRetrieveResponse = retrieve(userId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PreferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: PreferenceRetrieveParams): PreferenceRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(userId: String, requestOptions: RequestOptions): PreferenceRetrieveResponse =
        retrieve(userId, PreferenceRetrieveParams.none(), requestOptions)

    /** Fetch user preferences for a specific subscription topic. */
    fun retrieveTopic(
        topicId: String,
        params: PreferenceRetrieveTopicParams,
    ): PreferenceRetrieveTopicResponse = retrieveTopic(topicId, params, RequestOptions.none())

    /** @see retrieveTopic */
    fun retrieveTopic(
        topicId: String,
        params: PreferenceRetrieveTopicParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceRetrieveTopicResponse =
        retrieveTopic(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see retrieveTopic */
    fun retrieveTopic(params: PreferenceRetrieveTopicParams): PreferenceRetrieveTopicResponse =
        retrieveTopic(params, RequestOptions.none())

    /** @see retrieveTopic */
    fun retrieveTopic(
        params: PreferenceRetrieveTopicParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceRetrieveTopicResponse

    /** Update or Create user preferences for a specific subscription topic. */
    fun updateOrCreateTopic(
        topicId: String,
        params: PreferenceUpdateOrCreateTopicParams,
    ): PreferenceUpdateOrCreateTopicResponse =
        updateOrCreateTopic(topicId, params, RequestOptions.none())

    /** @see updateOrCreateTopic */
    fun updateOrCreateTopic(
        topicId: String,
        params: PreferenceUpdateOrCreateTopicParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceUpdateOrCreateTopicResponse =
        updateOrCreateTopic(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see updateOrCreateTopic */
    fun updateOrCreateTopic(
        params: PreferenceUpdateOrCreateTopicParams
    ): PreferenceUpdateOrCreateTopicResponse = updateOrCreateTopic(params, RequestOptions.none())

    /** @see updateOrCreateTopic */
    fun updateOrCreateTopic(
        params: PreferenceUpdateOrCreateTopicParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceUpdateOrCreateTopicResponse

    /** A view of [PreferenceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PreferenceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /users/{user_id}/preferences`, but is otherwise the
         * same as [PreferenceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(userId: String): HttpResponseFor<PreferenceRetrieveResponse> =
            retrieve(userId, PreferenceRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userId: String,
            params: PreferenceRetrieveParams = PreferenceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceRetrieveResponse> =
            retrieve(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userId: String,
            params: PreferenceRetrieveParams = PreferenceRetrieveParams.none(),
        ): HttpResponseFor<PreferenceRetrieveResponse> =
            retrieve(userId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PreferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PreferenceRetrieveParams
        ): HttpResponseFor<PreferenceRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PreferenceRetrieveResponse> =
            retrieve(userId, PreferenceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /users/{user_id}/preferences/{topic_id}`, but is
         * otherwise the same as [PreferenceService.retrieveTopic].
         */
        @MustBeClosed
        fun retrieveTopic(
            topicId: String,
            params: PreferenceRetrieveTopicParams,
        ): HttpResponseFor<PreferenceRetrieveTopicResponse> =
            retrieveTopic(topicId, params, RequestOptions.none())

        /** @see retrieveTopic */
        @MustBeClosed
        fun retrieveTopic(
            topicId: String,
            params: PreferenceRetrieveTopicParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceRetrieveTopicResponse> =
            retrieveTopic(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see retrieveTopic */
        @MustBeClosed
        fun retrieveTopic(
            params: PreferenceRetrieveTopicParams
        ): HttpResponseFor<PreferenceRetrieveTopicResponse> =
            retrieveTopic(params, RequestOptions.none())

        /** @see retrieveTopic */
        @MustBeClosed
        fun retrieveTopic(
            params: PreferenceRetrieveTopicParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceRetrieveTopicResponse>

        /**
         * Returns a raw HTTP response for `put /users/{user_id}/preferences/{topic_id}`, but is
         * otherwise the same as [PreferenceService.updateOrCreateTopic].
         */
        @MustBeClosed
        fun updateOrCreateTopic(
            topicId: String,
            params: PreferenceUpdateOrCreateTopicParams,
        ): HttpResponseFor<PreferenceUpdateOrCreateTopicResponse> =
            updateOrCreateTopic(topicId, params, RequestOptions.none())

        /** @see updateOrCreateTopic */
        @MustBeClosed
        fun updateOrCreateTopic(
            topicId: String,
            params: PreferenceUpdateOrCreateTopicParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceUpdateOrCreateTopicResponse> =
            updateOrCreateTopic(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see updateOrCreateTopic */
        @MustBeClosed
        fun updateOrCreateTopic(
            params: PreferenceUpdateOrCreateTopicParams
        ): HttpResponseFor<PreferenceUpdateOrCreateTopicResponse> =
            updateOrCreateTopic(params, RequestOptions.none())

        /** @see updateOrCreateTopic */
        @MustBeClosed
        fun updateOrCreateTopic(
            params: PreferenceUpdateOrCreateTopicParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceUpdateOrCreateTopicResponse>
    }
}

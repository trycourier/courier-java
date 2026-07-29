// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.users

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.users.preferences.PreferenceBulkReplaceParams
import com.courier.models.users.preferences.PreferenceBulkReplaceResponse
import com.courier.models.users.preferences.PreferenceBulkUpdateParams
import com.courier.models.users.preferences.PreferenceBulkUpdateResponse
import com.courier.models.users.preferences.PreferenceDeleteTopicParams
import com.courier.models.users.preferences.PreferenceRetrieveParams
import com.courier.models.users.preferences.PreferenceRetrieveResponse
import com.courier.models.users.preferences.PreferenceRetrieveTopicParams
import com.courier.models.users.preferences.PreferenceRetrieveTopicResponse
import com.courier.models.users.preferences.PreferenceUpdateOrCreateTopicParams
import com.courier.models.users.preferences.PreferenceUpdateOrCreateTopicResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Read and write a single user's notification preferences, per topic and per channel. */
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

    /**
     * Returns a user's preference overrides with paging, one entry per subscription topic they have
     * set a choice for.
     */
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

    /**
     * Replaces a user's entire set of preference overrides. Any topic you leave out is reset to its
     * default, so send the full set rather than a subset.
     */
    fun bulkReplace(
        userId: String,
        params: PreferenceBulkReplaceParams,
    ): PreferenceBulkReplaceResponse = bulkReplace(userId, params, RequestOptions.none())

    /** @see bulkReplace */
    fun bulkReplace(
        userId: String,
        params: PreferenceBulkReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceBulkReplaceResponse =
        bulkReplace(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see bulkReplace */
    fun bulkReplace(params: PreferenceBulkReplaceParams): PreferenceBulkReplaceResponse =
        bulkReplace(params, RequestOptions.none())

    /** @see bulkReplace */
    fun bulkReplace(
        params: PreferenceBulkReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceBulkReplaceResponse

    /**
     * Adds or updates a user's preferences for several subscription topics at once. Topics you
     * leave out keep whatever they were set to before.
     */
    fun bulkUpdate(
        userId: String,
        params: PreferenceBulkUpdateParams,
    ): PreferenceBulkUpdateResponse = bulkUpdate(userId, params, RequestOptions.none())

    /** @see bulkUpdate */
    fun bulkUpdate(
        userId: String,
        params: PreferenceBulkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceBulkUpdateResponse =
        bulkUpdate(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see bulkUpdate */
    fun bulkUpdate(params: PreferenceBulkUpdateParams): PreferenceBulkUpdateResponse =
        bulkUpdate(params, RequestOptions.none())

    /** @see bulkUpdate */
    fun bulkUpdate(
        params: PreferenceBulkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceBulkUpdateResponse

    /**
     * Removes a user's override for one subscription topic, resetting it to the effective default
     * from the tenant or workspace.
     */
    fun deleteTopic(topicId: String, params: PreferenceDeleteTopicParams) =
        deleteTopic(topicId, params, RequestOptions.none())

    /** @see deleteTopic */
    fun deleteTopic(
        topicId: String,
        params: PreferenceDeleteTopicParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteTopic(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see deleteTopic */
    fun deleteTopic(params: PreferenceDeleteTopicParams) =
        deleteTopic(params, RequestOptions.none())

    /** @see deleteTopic */
    fun deleteTopic(
        params: PreferenceDeleteTopicParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Returns a user's opt-in status and channel choices for one subscription topic, or the
     * effective default if they have set no override.
     */
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

    /**
     * Sets a user's opt-in status and channel choices for one subscription topic, overriding the
     * tenant default for that topic only.
     */
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
         * Returns a raw HTTP response for `put /users/{user_id}/preferences`, but is otherwise the
         * same as [PreferenceService.bulkReplace].
         */
        @MustBeClosed
        fun bulkReplace(
            userId: String,
            params: PreferenceBulkReplaceParams,
        ): HttpResponseFor<PreferenceBulkReplaceResponse> =
            bulkReplace(userId, params, RequestOptions.none())

        /** @see bulkReplace */
        @MustBeClosed
        fun bulkReplace(
            userId: String,
            params: PreferenceBulkReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceBulkReplaceResponse> =
            bulkReplace(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see bulkReplace */
        @MustBeClosed
        fun bulkReplace(
            params: PreferenceBulkReplaceParams
        ): HttpResponseFor<PreferenceBulkReplaceResponse> =
            bulkReplace(params, RequestOptions.none())

        /** @see bulkReplace */
        @MustBeClosed
        fun bulkReplace(
            params: PreferenceBulkReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceBulkReplaceResponse>

        /**
         * Returns a raw HTTP response for `post /users/{user_id}/preferences`, but is otherwise the
         * same as [PreferenceService.bulkUpdate].
         */
        @MustBeClosed
        fun bulkUpdate(
            userId: String,
            params: PreferenceBulkUpdateParams,
        ): HttpResponseFor<PreferenceBulkUpdateResponse> =
            bulkUpdate(userId, params, RequestOptions.none())

        /** @see bulkUpdate */
        @MustBeClosed
        fun bulkUpdate(
            userId: String,
            params: PreferenceBulkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceBulkUpdateResponse> =
            bulkUpdate(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see bulkUpdate */
        @MustBeClosed
        fun bulkUpdate(
            params: PreferenceBulkUpdateParams
        ): HttpResponseFor<PreferenceBulkUpdateResponse> = bulkUpdate(params, RequestOptions.none())

        /** @see bulkUpdate */
        @MustBeClosed
        fun bulkUpdate(
            params: PreferenceBulkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceBulkUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /users/{user_id}/preferences/{topic_id}`, but is
         * otherwise the same as [PreferenceService.deleteTopic].
         */
        @MustBeClosed
        fun deleteTopic(topicId: String, params: PreferenceDeleteTopicParams): HttpResponse =
            deleteTopic(topicId, params, RequestOptions.none())

        /** @see deleteTopic */
        @MustBeClosed
        fun deleteTopic(
            topicId: String,
            params: PreferenceDeleteTopicParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteTopic(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see deleteTopic */
        @MustBeClosed
        fun deleteTopic(params: PreferenceDeleteTopicParams): HttpResponse =
            deleteTopic(params, RequestOptions.none())

        /** @see deleteTopic */
        @MustBeClosed
        fun deleteTopic(
            params: PreferenceDeleteTopicParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

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

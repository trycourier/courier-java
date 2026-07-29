// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.users

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Read and write a single user's notification preferences, per topic and per channel. */
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

    /**
     * Returns a user's preference overrides with paging, one entry per subscription topic they have
     * set a choice for.
     */
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

    /**
     * Replaces a user's entire set of preference overrides. Any topic you leave out is reset to its
     * default, so send the full set rather than a subset.
     */
    fun bulkReplace(
        userId: String,
        params: PreferenceBulkReplaceParams,
    ): CompletableFuture<PreferenceBulkReplaceResponse> =
        bulkReplace(userId, params, RequestOptions.none())

    /** @see bulkReplace */
    fun bulkReplace(
        userId: String,
        params: PreferenceBulkReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceBulkReplaceResponse> =
        bulkReplace(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see bulkReplace */
    fun bulkReplace(
        params: PreferenceBulkReplaceParams
    ): CompletableFuture<PreferenceBulkReplaceResponse> = bulkReplace(params, RequestOptions.none())

    /** @see bulkReplace */
    fun bulkReplace(
        params: PreferenceBulkReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceBulkReplaceResponse>

    /**
     * Adds or updates a user's preferences for several subscription topics at once. Topics you
     * leave out keep whatever they were set to before.
     */
    fun bulkUpdate(
        userId: String,
        params: PreferenceBulkUpdateParams,
    ): CompletableFuture<PreferenceBulkUpdateResponse> =
        bulkUpdate(userId, params, RequestOptions.none())

    /** @see bulkUpdate */
    fun bulkUpdate(
        userId: String,
        params: PreferenceBulkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceBulkUpdateResponse> =
        bulkUpdate(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see bulkUpdate */
    fun bulkUpdate(
        params: PreferenceBulkUpdateParams
    ): CompletableFuture<PreferenceBulkUpdateResponse> = bulkUpdate(params, RequestOptions.none())

    /** @see bulkUpdate */
    fun bulkUpdate(
        params: PreferenceBulkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceBulkUpdateResponse>

    /**
     * Removes a user's override for one subscription topic, resetting it to the effective default
     * from the tenant or workspace.
     */
    fun deleteTopic(
        topicId: String,
        params: PreferenceDeleteTopicParams,
    ): CompletableFuture<Void?> = deleteTopic(topicId, params, RequestOptions.none())

    /** @see deleteTopic */
    fun deleteTopic(
        topicId: String,
        params: PreferenceDeleteTopicParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteTopic(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see deleteTopic */
    fun deleteTopic(params: PreferenceDeleteTopicParams): CompletableFuture<Void?> =
        deleteTopic(params, RequestOptions.none())

    /** @see deleteTopic */
    fun deleteTopic(
        params: PreferenceDeleteTopicParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Returns a user's opt-in status and channel choices for one subscription topic, or the
     * effective default if they have set no override.
     */
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

    /**
     * Sets a user's opt-in status and channel choices for one subscription topic, overriding the
     * tenant default for that topic only.
     */
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
         * Returns a raw HTTP response for `put /users/{user_id}/preferences`, but is otherwise the
         * same as [PreferenceServiceAsync.bulkReplace].
         */
        fun bulkReplace(
            userId: String,
            params: PreferenceBulkReplaceParams,
        ): CompletableFuture<HttpResponseFor<PreferenceBulkReplaceResponse>> =
            bulkReplace(userId, params, RequestOptions.none())

        /** @see bulkReplace */
        fun bulkReplace(
            userId: String,
            params: PreferenceBulkReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceBulkReplaceResponse>> =
            bulkReplace(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see bulkReplace */
        fun bulkReplace(
            params: PreferenceBulkReplaceParams
        ): CompletableFuture<HttpResponseFor<PreferenceBulkReplaceResponse>> =
            bulkReplace(params, RequestOptions.none())

        /** @see bulkReplace */
        fun bulkReplace(
            params: PreferenceBulkReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceBulkReplaceResponse>>

        /**
         * Returns a raw HTTP response for `post /users/{user_id}/preferences`, but is otherwise the
         * same as [PreferenceServiceAsync.bulkUpdate].
         */
        fun bulkUpdate(
            userId: String,
            params: PreferenceBulkUpdateParams,
        ): CompletableFuture<HttpResponseFor<PreferenceBulkUpdateResponse>> =
            bulkUpdate(userId, params, RequestOptions.none())

        /** @see bulkUpdate */
        fun bulkUpdate(
            userId: String,
            params: PreferenceBulkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceBulkUpdateResponse>> =
            bulkUpdate(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see bulkUpdate */
        fun bulkUpdate(
            params: PreferenceBulkUpdateParams
        ): CompletableFuture<HttpResponseFor<PreferenceBulkUpdateResponse>> =
            bulkUpdate(params, RequestOptions.none())

        /** @see bulkUpdate */
        fun bulkUpdate(
            params: PreferenceBulkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceBulkUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /users/{user_id}/preferences/{topic_id}`, but is
         * otherwise the same as [PreferenceServiceAsync.deleteTopic].
         */
        fun deleteTopic(
            topicId: String,
            params: PreferenceDeleteTopicParams,
        ): CompletableFuture<HttpResponse> = deleteTopic(topicId, params, RequestOptions.none())

        /** @see deleteTopic */
        fun deleteTopic(
            topicId: String,
            params: PreferenceDeleteTopicParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteTopic(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see deleteTopic */
        fun deleteTopic(params: PreferenceDeleteTopicParams): CompletableFuture<HttpResponse> =
            deleteTopic(params, RequestOptions.none())

        /** @see deleteTopic */
        fun deleteTopic(
            params: PreferenceDeleteTopicParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

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

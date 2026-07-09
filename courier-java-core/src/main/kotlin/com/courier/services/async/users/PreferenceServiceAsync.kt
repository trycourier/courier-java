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

    /**
     * Replace a user's complete set of preference overrides in a single request. The topics in the
     * request body become the recipient's entire set of overrides: listed topics are created or
     * updated, and every existing override that is not included in the body is reset to its topic
     * default. Submitting an empty `topics` array is a valid clear-all that resets every existing
     * override.
     *
     * This operation is validation-atomic (all-or-nothing): structural validation fails fast with a
     * single `400`, and if any topic is semantically invalid (an unknown topic, a `REQUIRED` topic
     * that cannot be opted out, or a custom routing request that is not available on the
     * workspace's plan) the request returns a single `400` aggregating every failure in `errors`
     * and writes nothing. On success it returns `200` with `items` (the complete resulting override
     * set) and `deleted` (the ids of the overrides that were reset to default).
     *
     * Every `topic_id` in the response — in `items`, `deleted`, and any `errors` — is returned in
     * Courier's canonical topic id form, regardless of the form supplied in the request.
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
     * Additively create or update a user's preferences for one or more subscription topics in a
     * single request. Only the topics included in the request body are created or updated; any
     * existing overrides for topics not listed are left untouched.
     *
     * Structural validation of the request body fails fast with a single `400`. Beyond that, each
     * topic is processed independently (partial-success, not all-or-nothing): valid topics are
     * written and returned in `items`, while topics that cannot be applied are collected in
     * `errors` with a per-topic `reason` (for example an unknown topic, a `REQUIRED` topic that
     * cannot be opted out, a custom routing request that is not available on the workspace's plan,
     * or a write failure). The request therefore returns `200` with both lists whenever the body is
     * structurally valid.
     *
     * Every `topic_id` in the response — in both `items` and `errors` — is returned in Courier's
     * canonical topic id form, regardless of the form supplied in the request.
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
     * Remove a user's preferences for a specific subscription topic, resetting the topic to its
     * effective default. This operation is idempotent: deleting a preference that does not exist
     * succeeds with no error.
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

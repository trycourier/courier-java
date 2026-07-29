// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.broadcasts.Broadcast
import com.courier.models.broadcasts.BroadcastArchiveParams
import com.courier.models.broadcasts.BroadcastCancelParams
import com.courier.models.broadcasts.BroadcastCreateParams
import com.courier.models.broadcasts.BroadcastDuplicateParams
import com.courier.models.broadcasts.BroadcastListParams
import com.courier.models.broadcasts.BroadcastListResponse
import com.courier.models.broadcasts.BroadcastPutContentParams
import com.courier.models.broadcasts.BroadcastRetrieveContentParams
import com.courier.models.broadcasts.BroadcastRetrieveParams
import com.courier.models.broadcasts.BroadcastScheduleParams
import com.courier.models.broadcasts.BroadcastSendParams
import com.courier.models.broadcasts.BroadcastUpdateParams
import com.courier.models.broadcasts.CreateBroadcastRequest
import com.courier.models.notifications.NotificationContentGetResponse
import com.courier.models.notifications.NotificationContentMutationResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BroadcastServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BroadcastServiceAsync

    /**
     * Create a broadcast. Provisions a private notification template for the broadcast and returns
     * the new broadcast in the draft state. Exactly one channel is required.
     */
    fun create(params: BroadcastCreateParams): CompletableFuture<Broadcast> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BroadcastCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Broadcast>

    /** @see create */
    fun create(
        createBroadcastRequest: CreateBroadcastRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Broadcast> =
        create(
            BroadcastCreateParams.builder().createBroadcastRequest(createBroadcastRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(createBroadcastRequest: CreateBroadcastRequest): CompletableFuture<Broadcast> =
        create(createBroadcastRequest, RequestOptions.none())

    /** Retrieve a broadcast by ID. Archived broadcasts return 404. */
    fun retrieve(broadcastId: String): CompletableFuture<Broadcast> =
        retrieve(broadcastId, BroadcastRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        broadcastId: String,
        params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Broadcast> =
        retrieve(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        broadcastId: String,
        params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
    ): CompletableFuture<Broadcast> = retrieve(broadcastId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BroadcastRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Broadcast>

    /** @see retrieve */
    fun retrieve(params: BroadcastRetrieveParams): CompletableFuture<Broadcast> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        broadcastId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Broadcast> =
        retrieve(broadcastId, BroadcastRetrieveParams.none(), requestOptions)

    /**
     * Update a broadcast's name. Content is edited via the broadcast's notification template, not
     * this endpoint.
     */
    fun update(broadcastId: String, params: BroadcastUpdateParams): CompletableFuture<Broadcast> =
        update(broadcastId, params, RequestOptions.none())

    /** @see update */
    fun update(
        broadcastId: String,
        params: BroadcastUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Broadcast> =
        update(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see update */
    fun update(params: BroadcastUpdateParams): CompletableFuture<Broadcast> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BroadcastUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Broadcast>

    /** List broadcasts in your workspace. Cursor-paginated; returns broadcasts newest-first. */
    fun list(): CompletableFuture<BroadcastListResponse> = list(BroadcastListParams.none())

    /** @see list */
    fun list(
        params: BroadcastListParams = BroadcastListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BroadcastListResponse>

    /** @see list */
    fun list(
        params: BroadcastListParams = BroadcastListParams.none()
    ): CompletableFuture<BroadcastListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BroadcastListResponse> =
        list(BroadcastListParams.none(), requestOptions)

    /**
     * Archive a broadcast. This is a soft delete — the archived broadcast is returned and no longer
     * appears in list results.
     */
    fun archive(broadcastId: String): CompletableFuture<Broadcast> =
        archive(broadcastId, BroadcastArchiveParams.none())

    /** @see archive */
    fun archive(
        broadcastId: String,
        params: BroadcastArchiveParams = BroadcastArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Broadcast> =
        archive(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see archive */
    fun archive(
        broadcastId: String,
        params: BroadcastArchiveParams = BroadcastArchiveParams.none(),
    ): CompletableFuture<Broadcast> = archive(broadcastId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: BroadcastArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Broadcast>

    /** @see archive */
    fun archive(params: BroadcastArchiveParams): CompletableFuture<Broadcast> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(broadcastId: String, requestOptions: RequestOptions): CompletableFuture<Broadcast> =
        archive(broadcastId, BroadcastArchiveParams.none(), requestOptions)

    /**
     * Cancel a broadcast's pending schedule, returning it to the draft state. Only valid for a
     * scheduled broadcast.
     */
    fun cancel(broadcastId: String): CompletableFuture<Broadcast> =
        cancel(broadcastId, BroadcastCancelParams.none())

    /** @see cancel */
    fun cancel(
        broadcastId: String,
        params: BroadcastCancelParams = BroadcastCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Broadcast> =
        cancel(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        broadcastId: String,
        params: BroadcastCancelParams = BroadcastCancelParams.none(),
    ): CompletableFuture<Broadcast> = cancel(broadcastId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: BroadcastCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Broadcast>

    /** @see cancel */
    fun cancel(params: BroadcastCancelParams): CompletableFuture<Broadcast> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(broadcastId: String, requestOptions: RequestOptions): CompletableFuture<Broadcast> =
        cancel(broadcastId, BroadcastCancelParams.none(), requestOptions)

    /** Duplicate a broadcast (and its template) into a new draft named "{source name} (copy)". */
    fun duplicate(broadcastId: String): CompletableFuture<Broadcast> =
        duplicate(broadcastId, BroadcastDuplicateParams.none())

    /** @see duplicate */
    fun duplicate(
        broadcastId: String,
        params: BroadcastDuplicateParams = BroadcastDuplicateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Broadcast> =
        duplicate(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see duplicate */
    fun duplicate(
        broadcastId: String,
        params: BroadcastDuplicateParams = BroadcastDuplicateParams.none(),
    ): CompletableFuture<Broadcast> = duplicate(broadcastId, params, RequestOptions.none())

    /** @see duplicate */
    fun duplicate(
        params: BroadcastDuplicateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Broadcast>

    /** @see duplicate */
    fun duplicate(params: BroadcastDuplicateParams): CompletableFuture<Broadcast> =
        duplicate(params, RequestOptions.none())

    /** @see duplicate */
    fun duplicate(
        broadcastId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Broadcast> =
        duplicate(broadcastId, BroadcastDuplicateParams.none(), requestOptions)

    /**
     * Author the broadcast's content by replacing the draft elemental content of its private
     * notification template. The draft is published automatically when the broadcast is sent or
     * scheduled.
     */
    fun putContent(
        broadcastId: String,
        params: BroadcastPutContentParams,
    ): CompletableFuture<NotificationContentMutationResponse> =
        putContent(broadcastId, params, RequestOptions.none())

    /** @see putContent */
    fun putContent(
        broadcastId: String,
        params: BroadcastPutContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationContentMutationResponse> =
        putContent(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see putContent */
    fun putContent(
        params: BroadcastPutContentParams
    ): CompletableFuture<NotificationContentMutationResponse> =
        putContent(params, RequestOptions.none())

    /** @see putContent */
    fun putContent(
        params: BroadcastPutContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationContentMutationResponse>

    /**
     * Retrieve the broadcast's content — the elemental content of its private notification
     * template. Defaults to the working draft, since broadcast content is authored as a draft until
     * the broadcast is sent.
     */
    fun retrieveContent(broadcastId: String): CompletableFuture<NotificationContentGetResponse> =
        retrieveContent(broadcastId, BroadcastRetrieveContentParams.none())

    /** @see retrieveContent */
    fun retrieveContent(
        broadcastId: String,
        params: BroadcastRetrieveContentParams = BroadcastRetrieveContentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationContentGetResponse> =
        retrieveContent(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see retrieveContent */
    fun retrieveContent(
        broadcastId: String,
        params: BroadcastRetrieveContentParams = BroadcastRetrieveContentParams.none(),
    ): CompletableFuture<NotificationContentGetResponse> =
        retrieveContent(broadcastId, params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(
        params: BroadcastRetrieveContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NotificationContentGetResponse>

    /** @see retrieveContent */
    fun retrieveContent(
        params: BroadcastRetrieveContentParams
    ): CompletableFuture<NotificationContentGetResponse> =
        retrieveContent(params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(
        broadcastId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotificationContentGetResponse> =
        retrieveContent(broadcastId, BroadcastRetrieveContentParams.none(), requestOptions)

    /**
     * Schedule a broadcast for a future send to a list or audience. Publishes the broadcast
     * template first. Not allowed once the broadcast is sending or sent. For an immediate send use
     * POST /broadcasts/{broadcastId}/send.
     */
    fun schedule(
        broadcastId: String,
        params: BroadcastScheduleParams,
    ): CompletableFuture<Broadcast> = schedule(broadcastId, params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        broadcastId: String,
        params: BroadcastScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Broadcast> =
        schedule(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see schedule */
    fun schedule(params: BroadcastScheduleParams): CompletableFuture<Broadcast> =
        schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        params: BroadcastScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Broadcast>

    /**
     * Send a broadcast immediately to a list or audience. Publishes the broadcast template first.
     * Not allowed once the broadcast is sending or sent.
     */
    fun send(broadcastId: String, params: BroadcastSendParams): CompletableFuture<Broadcast> =
        send(broadcastId, params, RequestOptions.none())

    /** @see send */
    fun send(
        broadcastId: String,
        params: BroadcastSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Broadcast> =
        send(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see send */
    fun send(params: BroadcastSendParams): CompletableFuture<Broadcast> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: BroadcastSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Broadcast>

    /**
     * A view of [BroadcastServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BroadcastServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /broadcasts`, but is otherwise the same as
         * [BroadcastServiceAsync.create].
         */
        fun create(params: BroadcastCreateParams): CompletableFuture<HttpResponseFor<Broadcast>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BroadcastCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>>

        /** @see create */
        fun create(
            createBroadcastRequest: CreateBroadcastRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            create(
                BroadcastCreateParams.builder()
                    .createBroadcastRequest(createBroadcastRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            createBroadcastRequest: CreateBroadcastRequest
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            create(createBroadcastRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /broadcasts/{broadcastId}`, but is otherwise the
         * same as [BroadcastServiceAsync.retrieve].
         */
        fun retrieve(broadcastId: String): CompletableFuture<HttpResponseFor<Broadcast>> =
            retrieve(broadcastId, BroadcastRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            broadcastId: String,
            params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            retrieve(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            broadcastId: String,
            params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            retrieve(broadcastId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BroadcastRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>>

        /** @see retrieve */
        fun retrieve(
            params: BroadcastRetrieveParams
        ): CompletableFuture<HttpResponseFor<Broadcast>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            retrieve(broadcastId, BroadcastRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /broadcasts/{broadcastId}`, but is otherwise the
         * same as [BroadcastServiceAsync.update].
         */
        fun update(
            broadcastId: String,
            params: BroadcastUpdateParams,
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            update(broadcastId, params, RequestOptions.none())

        /** @see update */
        fun update(
            broadcastId: String,
            params: BroadcastUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            update(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see update */
        fun update(params: BroadcastUpdateParams): CompletableFuture<HttpResponseFor<Broadcast>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BroadcastUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>>

        /**
         * Returns a raw HTTP response for `get /broadcasts`, but is otherwise the same as
         * [BroadcastServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BroadcastListResponse>> =
            list(BroadcastListParams.none())

        /** @see list */
        fun list(
            params: BroadcastListParams = BroadcastListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BroadcastListResponse>>

        /** @see list */
        fun list(
            params: BroadcastListParams = BroadcastListParams.none()
        ): CompletableFuture<HttpResponseFor<BroadcastListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BroadcastListResponse>> =
            list(BroadcastListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /broadcasts/{broadcastId}`, but is otherwise the
         * same as [BroadcastServiceAsync.archive].
         */
        fun archive(broadcastId: String): CompletableFuture<HttpResponseFor<Broadcast>> =
            archive(broadcastId, BroadcastArchiveParams.none())

        /** @see archive */
        fun archive(
            broadcastId: String,
            params: BroadcastArchiveParams = BroadcastArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            archive(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see archive */
        fun archive(
            broadcastId: String,
            params: BroadcastArchiveParams = BroadcastArchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            archive(broadcastId, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: BroadcastArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>>

        /** @see archive */
        fun archive(params: BroadcastArchiveParams): CompletableFuture<HttpResponseFor<Broadcast>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            archive(broadcastId, BroadcastArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /broadcasts/{broadcastId}/cancel`, but is otherwise
         * the same as [BroadcastServiceAsync.cancel].
         */
        fun cancel(broadcastId: String): CompletableFuture<HttpResponseFor<Broadcast>> =
            cancel(broadcastId, BroadcastCancelParams.none())

        /** @see cancel */
        fun cancel(
            broadcastId: String,
            params: BroadcastCancelParams = BroadcastCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            cancel(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            broadcastId: String,
            params: BroadcastCancelParams = BroadcastCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            cancel(broadcastId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: BroadcastCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>>

        /** @see cancel */
        fun cancel(params: BroadcastCancelParams): CompletableFuture<HttpResponseFor<Broadcast>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            cancel(broadcastId, BroadcastCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /broadcasts/{broadcastId}/duplicate`, but is
         * otherwise the same as [BroadcastServiceAsync.duplicate].
         */
        fun duplicate(broadcastId: String): CompletableFuture<HttpResponseFor<Broadcast>> =
            duplicate(broadcastId, BroadcastDuplicateParams.none())

        /** @see duplicate */
        fun duplicate(
            broadcastId: String,
            params: BroadcastDuplicateParams = BroadcastDuplicateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            duplicate(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see duplicate */
        fun duplicate(
            broadcastId: String,
            params: BroadcastDuplicateParams = BroadcastDuplicateParams.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            duplicate(broadcastId, params, RequestOptions.none())

        /** @see duplicate */
        fun duplicate(
            params: BroadcastDuplicateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>>

        /** @see duplicate */
        fun duplicate(
            params: BroadcastDuplicateParams
        ): CompletableFuture<HttpResponseFor<Broadcast>> = duplicate(params, RequestOptions.none())

        /** @see duplicate */
        fun duplicate(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            duplicate(broadcastId, BroadcastDuplicateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /broadcasts/{broadcastId}/content`, but is otherwise
         * the same as [BroadcastServiceAsync.putContent].
         */
        fun putContent(
            broadcastId: String,
            params: BroadcastPutContentParams,
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>> =
            putContent(broadcastId, params, RequestOptions.none())

        /** @see putContent */
        fun putContent(
            broadcastId: String,
            params: BroadcastPutContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>> =
            putContent(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see putContent */
        fun putContent(
            params: BroadcastPutContentParams
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>> =
            putContent(params, RequestOptions.none())

        /** @see putContent */
        fun putContent(
            params: BroadcastPutContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationContentMutationResponse>>

        /**
         * Returns a raw HTTP response for `get /broadcasts/{broadcastId}/content`, but is otherwise
         * the same as [BroadcastServiceAsync.retrieveContent].
         */
        fun retrieveContent(
            broadcastId: String
        ): CompletableFuture<HttpResponseFor<NotificationContentGetResponse>> =
            retrieveContent(broadcastId, BroadcastRetrieveContentParams.none())

        /** @see retrieveContent */
        fun retrieveContent(
            broadcastId: String,
            params: BroadcastRetrieveContentParams = BroadcastRetrieveContentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationContentGetResponse>> =
            retrieveContent(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see retrieveContent */
        fun retrieveContent(
            broadcastId: String,
            params: BroadcastRetrieveContentParams = BroadcastRetrieveContentParams.none(),
        ): CompletableFuture<HttpResponseFor<NotificationContentGetResponse>> =
            retrieveContent(broadcastId, params, RequestOptions.none())

        /** @see retrieveContent */
        fun retrieveContent(
            params: BroadcastRetrieveContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NotificationContentGetResponse>>

        /** @see retrieveContent */
        fun retrieveContent(
            params: BroadcastRetrieveContentParams
        ): CompletableFuture<HttpResponseFor<NotificationContentGetResponse>> =
            retrieveContent(params, RequestOptions.none())

        /** @see retrieveContent */
        fun retrieveContent(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotificationContentGetResponse>> =
            retrieveContent(broadcastId, BroadcastRetrieveContentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /broadcasts/{broadcastId}/schedule`, but is
         * otherwise the same as [BroadcastServiceAsync.schedule].
         */
        fun schedule(
            broadcastId: String,
            params: BroadcastScheduleParams,
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            schedule(broadcastId, params, RequestOptions.none())

        /** @see schedule */
        fun schedule(
            broadcastId: String,
            params: BroadcastScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            schedule(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see schedule */
        fun schedule(
            params: BroadcastScheduleParams
        ): CompletableFuture<HttpResponseFor<Broadcast>> = schedule(params, RequestOptions.none())

        /** @see schedule */
        fun schedule(
            params: BroadcastScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>>

        /**
         * Returns a raw HTTP response for `post /broadcasts/{broadcastId}/send`, but is otherwise
         * the same as [BroadcastServiceAsync.send].
         */
        fun send(
            broadcastId: String,
            params: BroadcastSendParams,
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            send(broadcastId, params, RequestOptions.none())

        /** @see send */
        fun send(
            broadcastId: String,
            params: BroadcastSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>> =
            send(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see send */
        fun send(params: BroadcastSendParams): CompletableFuture<HttpResponseFor<Broadcast>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            params: BroadcastSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Broadcast>>
    }
}

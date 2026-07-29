// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface BroadcastService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BroadcastService

    /**
     * Create a broadcast. Provisions a private notification template for the broadcast and returns
     * the new broadcast in the draft state. Exactly one channel is required.
     */
    fun create(params: BroadcastCreateParams): Broadcast = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BroadcastCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Broadcast

    /** @see create */
    fun create(
        createBroadcastRequest: CreateBroadcastRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Broadcast =
        create(
            BroadcastCreateParams.builder().createBroadcastRequest(createBroadcastRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(createBroadcastRequest: CreateBroadcastRequest): Broadcast =
        create(createBroadcastRequest, RequestOptions.none())

    /** Retrieve a broadcast by ID. Archived broadcasts return 404. */
    fun retrieve(broadcastId: String): Broadcast =
        retrieve(broadcastId, BroadcastRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        broadcastId: String,
        params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Broadcast = retrieve(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        broadcastId: String,
        params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
    ): Broadcast = retrieve(broadcastId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BroadcastRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Broadcast

    /** @see retrieve */
    fun retrieve(params: BroadcastRetrieveParams): Broadcast =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(broadcastId: String, requestOptions: RequestOptions): Broadcast =
        retrieve(broadcastId, BroadcastRetrieveParams.none(), requestOptions)

    /**
     * Update a broadcast's name. Content is edited via the broadcast's notification template, not
     * this endpoint.
     */
    fun update(broadcastId: String, params: BroadcastUpdateParams): Broadcast =
        update(broadcastId, params, RequestOptions.none())

    /** @see update */
    fun update(
        broadcastId: String,
        params: BroadcastUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Broadcast = update(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see update */
    fun update(params: BroadcastUpdateParams): Broadcast = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BroadcastUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Broadcast

    /** List broadcasts in your workspace. Cursor-paginated; returns broadcasts newest-first. */
    fun list(): BroadcastListResponse = list(BroadcastListParams.none())

    /** @see list */
    fun list(
        params: BroadcastListParams = BroadcastListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BroadcastListResponse

    /** @see list */
    fun list(params: BroadcastListParams = BroadcastListParams.none()): BroadcastListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BroadcastListResponse =
        list(BroadcastListParams.none(), requestOptions)

    /**
     * Archive a broadcast. This is a soft delete — the archived broadcast is returned and no longer
     * appears in list results.
     */
    fun archive(broadcastId: String): Broadcast =
        archive(broadcastId, BroadcastArchiveParams.none())

    /** @see archive */
    fun archive(
        broadcastId: String,
        params: BroadcastArchiveParams = BroadcastArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Broadcast = archive(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see archive */
    fun archive(
        broadcastId: String,
        params: BroadcastArchiveParams = BroadcastArchiveParams.none(),
    ): Broadcast = archive(broadcastId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: BroadcastArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Broadcast

    /** @see archive */
    fun archive(params: BroadcastArchiveParams): Broadcast = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(broadcastId: String, requestOptions: RequestOptions): Broadcast =
        archive(broadcastId, BroadcastArchiveParams.none(), requestOptions)

    /**
     * Cancel a broadcast's pending schedule, returning it to the draft state. Only valid for a
     * scheduled broadcast.
     */
    fun cancel(broadcastId: String): Broadcast = cancel(broadcastId, BroadcastCancelParams.none())

    /** @see cancel */
    fun cancel(
        broadcastId: String,
        params: BroadcastCancelParams = BroadcastCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Broadcast = cancel(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        broadcastId: String,
        params: BroadcastCancelParams = BroadcastCancelParams.none(),
    ): Broadcast = cancel(broadcastId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: BroadcastCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Broadcast

    /** @see cancel */
    fun cancel(params: BroadcastCancelParams): Broadcast = cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(broadcastId: String, requestOptions: RequestOptions): Broadcast =
        cancel(broadcastId, BroadcastCancelParams.none(), requestOptions)

    /** Duplicate a broadcast (and its template) into a new draft named "{source name} (copy)". */
    fun duplicate(broadcastId: String): Broadcast =
        duplicate(broadcastId, BroadcastDuplicateParams.none())

    /** @see duplicate */
    fun duplicate(
        broadcastId: String,
        params: BroadcastDuplicateParams = BroadcastDuplicateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Broadcast = duplicate(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see duplicate */
    fun duplicate(
        broadcastId: String,
        params: BroadcastDuplicateParams = BroadcastDuplicateParams.none(),
    ): Broadcast = duplicate(broadcastId, params, RequestOptions.none())

    /** @see duplicate */
    fun duplicate(
        params: BroadcastDuplicateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Broadcast

    /** @see duplicate */
    fun duplicate(params: BroadcastDuplicateParams): Broadcast =
        duplicate(params, RequestOptions.none())

    /** @see duplicate */
    fun duplicate(broadcastId: String, requestOptions: RequestOptions): Broadcast =
        duplicate(broadcastId, BroadcastDuplicateParams.none(), requestOptions)

    /**
     * Author the broadcast's content by replacing the draft elemental content of its private
     * notification template. The draft is published automatically when the broadcast is sent or
     * scheduled.
     */
    fun putContent(
        broadcastId: String,
        params: BroadcastPutContentParams,
    ): NotificationContentMutationResponse = putContent(broadcastId, params, RequestOptions.none())

    /** @see putContent */
    fun putContent(
        broadcastId: String,
        params: BroadcastPutContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationContentMutationResponse =
        putContent(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see putContent */
    fun putContent(params: BroadcastPutContentParams): NotificationContentMutationResponse =
        putContent(params, RequestOptions.none())

    /** @see putContent */
    fun putContent(
        params: BroadcastPutContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationContentMutationResponse

    /**
     * Retrieve the broadcast's content — the elemental content of its private notification
     * template. Defaults to the working draft, since broadcast content is authored as a draft until
     * the broadcast is sent.
     */
    fun retrieveContent(broadcastId: String): NotificationContentGetResponse =
        retrieveContent(broadcastId, BroadcastRetrieveContentParams.none())

    /** @see retrieveContent */
    fun retrieveContent(
        broadcastId: String,
        params: BroadcastRetrieveContentParams = BroadcastRetrieveContentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationContentGetResponse =
        retrieveContent(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see retrieveContent */
    fun retrieveContent(
        broadcastId: String,
        params: BroadcastRetrieveContentParams = BroadcastRetrieveContentParams.none(),
    ): NotificationContentGetResponse = retrieveContent(broadcastId, params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(
        params: BroadcastRetrieveContentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NotificationContentGetResponse

    /** @see retrieveContent */
    fun retrieveContent(params: BroadcastRetrieveContentParams): NotificationContentGetResponse =
        retrieveContent(params, RequestOptions.none())

    /** @see retrieveContent */
    fun retrieveContent(
        broadcastId: String,
        requestOptions: RequestOptions,
    ): NotificationContentGetResponse =
        retrieveContent(broadcastId, BroadcastRetrieveContentParams.none(), requestOptions)

    /**
     * Schedule a broadcast for a future send to a list or audience. Publishes the broadcast
     * template first. Not allowed once the broadcast is sending or sent. For an immediate send use
     * POST /broadcasts/{broadcastId}/send.
     */
    fun schedule(broadcastId: String, params: BroadcastScheduleParams): Broadcast =
        schedule(broadcastId, params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        broadcastId: String,
        params: BroadcastScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Broadcast = schedule(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see schedule */
    fun schedule(params: BroadcastScheduleParams): Broadcast =
        schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        params: BroadcastScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Broadcast

    /**
     * Send a broadcast immediately to a list or audience. Publishes the broadcast template first.
     * Not allowed once the broadcast is sending or sent.
     */
    fun send(broadcastId: String, params: BroadcastSendParams): Broadcast =
        send(broadcastId, params, RequestOptions.none())

    /** @see send */
    fun send(
        broadcastId: String,
        params: BroadcastSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Broadcast = send(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

    /** @see send */
    fun send(params: BroadcastSendParams): Broadcast = send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: BroadcastSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Broadcast

    /** A view of [BroadcastService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BroadcastService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /broadcasts`, but is otherwise the same as
         * [BroadcastService.create].
         */
        @MustBeClosed
        fun create(params: BroadcastCreateParams): HttpResponseFor<Broadcast> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BroadcastCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Broadcast>

        /** @see create */
        @MustBeClosed
        fun create(
            createBroadcastRequest: CreateBroadcastRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Broadcast> =
            create(
                BroadcastCreateParams.builder()
                    .createBroadcastRequest(createBroadcastRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(createBroadcastRequest: CreateBroadcastRequest): HttpResponseFor<Broadcast> =
            create(createBroadcastRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /broadcasts/{broadcastId}`, but is otherwise the
         * same as [BroadcastService.retrieve].
         */
        @MustBeClosed
        fun retrieve(broadcastId: String): HttpResponseFor<Broadcast> =
            retrieve(broadcastId, BroadcastRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            broadcastId: String,
            params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Broadcast> =
            retrieve(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            broadcastId: String,
            params: BroadcastRetrieveParams = BroadcastRetrieveParams.none(),
        ): HttpResponseFor<Broadcast> = retrieve(broadcastId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BroadcastRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Broadcast>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BroadcastRetrieveParams): HttpResponseFor<Broadcast> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Broadcast> =
            retrieve(broadcastId, BroadcastRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /broadcasts/{broadcastId}`, but is otherwise the
         * same as [BroadcastService.update].
         */
        @MustBeClosed
        fun update(broadcastId: String, params: BroadcastUpdateParams): HttpResponseFor<Broadcast> =
            update(broadcastId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            broadcastId: String,
            params: BroadcastUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Broadcast> =
            update(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: BroadcastUpdateParams): HttpResponseFor<Broadcast> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BroadcastUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Broadcast>

        /**
         * Returns a raw HTTP response for `get /broadcasts`, but is otherwise the same as
         * [BroadcastService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BroadcastListResponse> = list(BroadcastListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BroadcastListParams = BroadcastListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BroadcastListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BroadcastListParams = BroadcastListParams.none()
        ): HttpResponseFor<BroadcastListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BroadcastListResponse> =
            list(BroadcastListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /broadcasts/{broadcastId}`, but is otherwise the
         * same as [BroadcastService.archive].
         */
        @MustBeClosed
        fun archive(broadcastId: String): HttpResponseFor<Broadcast> =
            archive(broadcastId, BroadcastArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            broadcastId: String,
            params: BroadcastArchiveParams = BroadcastArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Broadcast> =
            archive(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            broadcastId: String,
            params: BroadcastArchiveParams = BroadcastArchiveParams.none(),
        ): HttpResponseFor<Broadcast> = archive(broadcastId, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: BroadcastArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Broadcast>

        /** @see archive */
        @MustBeClosed
        fun archive(params: BroadcastArchiveParams): HttpResponseFor<Broadcast> =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Broadcast> =
            archive(broadcastId, BroadcastArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /broadcasts/{broadcastId}/cancel`, but is otherwise
         * the same as [BroadcastService.cancel].
         */
        @MustBeClosed
        fun cancel(broadcastId: String): HttpResponseFor<Broadcast> =
            cancel(broadcastId, BroadcastCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            broadcastId: String,
            params: BroadcastCancelParams = BroadcastCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Broadcast> =
            cancel(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            broadcastId: String,
            params: BroadcastCancelParams = BroadcastCancelParams.none(),
        ): HttpResponseFor<Broadcast> = cancel(broadcastId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: BroadcastCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Broadcast>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: BroadcastCancelParams): HttpResponseFor<Broadcast> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Broadcast> =
            cancel(broadcastId, BroadcastCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /broadcasts/{broadcastId}/duplicate`, but is
         * otherwise the same as [BroadcastService.duplicate].
         */
        @MustBeClosed
        fun duplicate(broadcastId: String): HttpResponseFor<Broadcast> =
            duplicate(broadcastId, BroadcastDuplicateParams.none())

        /** @see duplicate */
        @MustBeClosed
        fun duplicate(
            broadcastId: String,
            params: BroadcastDuplicateParams = BroadcastDuplicateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Broadcast> =
            duplicate(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see duplicate */
        @MustBeClosed
        fun duplicate(
            broadcastId: String,
            params: BroadcastDuplicateParams = BroadcastDuplicateParams.none(),
        ): HttpResponseFor<Broadcast> = duplicate(broadcastId, params, RequestOptions.none())

        /** @see duplicate */
        @MustBeClosed
        fun duplicate(
            params: BroadcastDuplicateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Broadcast>

        /** @see duplicate */
        @MustBeClosed
        fun duplicate(params: BroadcastDuplicateParams): HttpResponseFor<Broadcast> =
            duplicate(params, RequestOptions.none())

        /** @see duplicate */
        @MustBeClosed
        fun duplicate(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Broadcast> =
            duplicate(broadcastId, BroadcastDuplicateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /broadcasts/{broadcastId}/content`, but is otherwise
         * the same as [BroadcastService.putContent].
         */
        @MustBeClosed
        fun putContent(
            broadcastId: String,
            params: BroadcastPutContentParams,
        ): HttpResponseFor<NotificationContentMutationResponse> =
            putContent(broadcastId, params, RequestOptions.none())

        /** @see putContent */
        @MustBeClosed
        fun putContent(
            broadcastId: String,
            params: BroadcastPutContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationContentMutationResponse> =
            putContent(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see putContent */
        @MustBeClosed
        fun putContent(
            params: BroadcastPutContentParams
        ): HttpResponseFor<NotificationContentMutationResponse> =
            putContent(params, RequestOptions.none())

        /** @see putContent */
        @MustBeClosed
        fun putContent(
            params: BroadcastPutContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationContentMutationResponse>

        /**
         * Returns a raw HTTP response for `get /broadcasts/{broadcastId}/content`, but is otherwise
         * the same as [BroadcastService.retrieveContent].
         */
        @MustBeClosed
        fun retrieveContent(broadcastId: String): HttpResponseFor<NotificationContentGetResponse> =
            retrieveContent(broadcastId, BroadcastRetrieveContentParams.none())

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            broadcastId: String,
            params: BroadcastRetrieveContentParams = BroadcastRetrieveContentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationContentGetResponse> =
            retrieveContent(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            broadcastId: String,
            params: BroadcastRetrieveContentParams = BroadcastRetrieveContentParams.none(),
        ): HttpResponseFor<NotificationContentGetResponse> =
            retrieveContent(broadcastId, params, RequestOptions.none())

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            params: BroadcastRetrieveContentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NotificationContentGetResponse>

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            params: BroadcastRetrieveContentParams
        ): HttpResponseFor<NotificationContentGetResponse> =
            retrieveContent(params, RequestOptions.none())

        /** @see retrieveContent */
        @MustBeClosed
        fun retrieveContent(
            broadcastId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NotificationContentGetResponse> =
            retrieveContent(broadcastId, BroadcastRetrieveContentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /broadcasts/{broadcastId}/schedule`, but is
         * otherwise the same as [BroadcastService.schedule].
         */
        @MustBeClosed
        fun schedule(
            broadcastId: String,
            params: BroadcastScheduleParams,
        ): HttpResponseFor<Broadcast> = schedule(broadcastId, params, RequestOptions.none())

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            broadcastId: String,
            params: BroadcastScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Broadcast> =
            schedule(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see schedule */
        @MustBeClosed
        fun schedule(params: BroadcastScheduleParams): HttpResponseFor<Broadcast> =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            params: BroadcastScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Broadcast>

        /**
         * Returns a raw HTTP response for `post /broadcasts/{broadcastId}/send`, but is otherwise
         * the same as [BroadcastService.send].
         */
        @MustBeClosed
        fun send(broadcastId: String, params: BroadcastSendParams): HttpResponseFor<Broadcast> =
            send(broadcastId, params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            broadcastId: String,
            params: BroadcastSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Broadcast> =
            send(params.toBuilder().broadcastId(broadcastId).build(), requestOptions)

        /** @see send */
        @MustBeClosed
        fun send(params: BroadcastSendParams): HttpResponseFor<Broadcast> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: BroadcastSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Broadcast>
    }
}

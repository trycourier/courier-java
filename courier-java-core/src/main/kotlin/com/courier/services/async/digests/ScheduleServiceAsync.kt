// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.digests

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.digests.DigestInstanceListResponse
import com.courier.models.digests.schedules.ScheduleListInstancesParams
import com.courier.models.digests.schedules.ScheduleReleaseParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ScheduleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduleServiceAsync

    /**
     * List the digest instances for a schedule. Each instance represents the events accumulated for
     * a single user against the schedule, and can be used to monitor digest accumulation before the
     * digest is released.
     */
    fun listInstances(scheduleId: String): CompletableFuture<DigestInstanceListResponse> =
        listInstances(scheduleId, ScheduleListInstancesParams.none())

    /** @see listInstances */
    fun listInstances(
        scheduleId: String,
        params: ScheduleListInstancesParams = ScheduleListInstancesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigestInstanceListResponse> =
        listInstances(params.toBuilder().scheduleId(scheduleId).build(), requestOptions)

    /** @see listInstances */
    fun listInstances(
        scheduleId: String,
        params: ScheduleListInstancesParams = ScheduleListInstancesParams.none(),
    ): CompletableFuture<DigestInstanceListResponse> =
        listInstances(scheduleId, params, RequestOptions.none())

    /** @see listInstances */
    fun listInstances(
        params: ScheduleListInstancesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigestInstanceListResponse>

    /** @see listInstances */
    fun listInstances(
        params: ScheduleListInstancesParams
    ): CompletableFuture<DigestInstanceListResponse> = listInstances(params, RequestOptions.none())

    /** @see listInstances */
    fun listInstances(
        scheduleId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DigestInstanceListResponse> =
        listInstances(scheduleId, ScheduleListInstancesParams.none(), requestOptions)

    /**
     * Send a digest now instead of waiting for its scheduled time, so your users get what they have
     * collected so far right away.
     */
    fun release(scheduleId: String): CompletableFuture<Void?> =
        release(scheduleId, ScheduleReleaseParams.none())

    /** @see release */
    fun release(
        scheduleId: String,
        params: ScheduleReleaseParams = ScheduleReleaseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        release(params.toBuilder().scheduleId(scheduleId).build(), requestOptions)

    /** @see release */
    fun release(
        scheduleId: String,
        params: ScheduleReleaseParams = ScheduleReleaseParams.none(),
    ): CompletableFuture<Void?> = release(scheduleId, params, RequestOptions.none())

    /** @see release */
    fun release(
        params: ScheduleReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see release */
    fun release(params: ScheduleReleaseParams): CompletableFuture<Void?> =
        release(params, RequestOptions.none())

    /** @see release */
    fun release(scheduleId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        release(scheduleId, ScheduleReleaseParams.none(), requestOptions)

    /**
     * A view of [ScheduleServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScheduleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /digests/schedules/{schedule_id}/instances`, but is
         * otherwise the same as [ScheduleServiceAsync.listInstances].
         */
        fun listInstances(
            scheduleId: String
        ): CompletableFuture<HttpResponseFor<DigestInstanceListResponse>> =
            listInstances(scheduleId, ScheduleListInstancesParams.none())

        /** @see listInstances */
        fun listInstances(
            scheduleId: String,
            params: ScheduleListInstancesParams = ScheduleListInstancesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigestInstanceListResponse>> =
            listInstances(params.toBuilder().scheduleId(scheduleId).build(), requestOptions)

        /** @see listInstances */
        fun listInstances(
            scheduleId: String,
            params: ScheduleListInstancesParams = ScheduleListInstancesParams.none(),
        ): CompletableFuture<HttpResponseFor<DigestInstanceListResponse>> =
            listInstances(scheduleId, params, RequestOptions.none())

        /** @see listInstances */
        fun listInstances(
            params: ScheduleListInstancesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigestInstanceListResponse>>

        /** @see listInstances */
        fun listInstances(
            params: ScheduleListInstancesParams
        ): CompletableFuture<HttpResponseFor<DigestInstanceListResponse>> =
            listInstances(params, RequestOptions.none())

        /** @see listInstances */
        fun listInstances(
            scheduleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DigestInstanceListResponse>> =
            listInstances(scheduleId, ScheduleListInstancesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /digests/schedules/{schedule_id}/trigger`, but is
         * otherwise the same as [ScheduleServiceAsync.release].
         */
        fun release(scheduleId: String): CompletableFuture<HttpResponse> =
            release(scheduleId, ScheduleReleaseParams.none())

        /** @see release */
        fun release(
            scheduleId: String,
            params: ScheduleReleaseParams = ScheduleReleaseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            release(params.toBuilder().scheduleId(scheduleId).build(), requestOptions)

        /** @see release */
        fun release(
            scheduleId: String,
            params: ScheduleReleaseParams = ScheduleReleaseParams.none(),
        ): CompletableFuture<HttpResponse> = release(scheduleId, params, RequestOptions.none())

        /** @see release */
        fun release(
            params: ScheduleReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see release */
        fun release(params: ScheduleReleaseParams): CompletableFuture<HttpResponse> =
            release(params, RequestOptions.none())

        /** @see release */
        fun release(
            scheduleId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            release(scheduleId, ScheduleReleaseParams.none(), requestOptions)
    }
}

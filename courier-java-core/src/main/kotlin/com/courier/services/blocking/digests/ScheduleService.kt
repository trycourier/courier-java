// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.digests

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.digests.DigestInstanceListResponse
import com.courier.models.digests.schedules.ScheduleListInstancesParams
import com.courier.models.digests.schedules.ScheduleReleaseParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ScheduleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduleService

    /**
     * List the digest instances for a schedule. Each instance represents the events accumulated for
     * a single user against the schedule, and can be used to monitor digest accumulation before the
     * digest is released.
     */
    fun listInstances(scheduleId: String): DigestInstanceListResponse =
        listInstances(scheduleId, ScheduleListInstancesParams.none())

    /** @see listInstances */
    fun listInstances(
        scheduleId: String,
        params: ScheduleListInstancesParams = ScheduleListInstancesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigestInstanceListResponse =
        listInstances(params.toBuilder().scheduleId(scheduleId).build(), requestOptions)

    /** @see listInstances */
    fun listInstances(
        scheduleId: String,
        params: ScheduleListInstancesParams = ScheduleListInstancesParams.none(),
    ): DigestInstanceListResponse = listInstances(scheduleId, params, RequestOptions.none())

    /** @see listInstances */
    fun listInstances(
        params: ScheduleListInstancesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigestInstanceListResponse

    /** @see listInstances */
    fun listInstances(params: ScheduleListInstancesParams): DigestInstanceListResponse =
        listInstances(params, RequestOptions.none())

    /** @see listInstances */
    fun listInstances(
        scheduleId: String,
        requestOptions: RequestOptions,
    ): DigestInstanceListResponse =
        listInstances(scheduleId, ScheduleListInstancesParams.none(), requestOptions)

    /**
     * Send a digest now instead of waiting for its scheduled time, so your users get what they have
     * collected so far right away.
     */
    fun release(scheduleId: String) = release(scheduleId, ScheduleReleaseParams.none())

    /** @see release */
    fun release(
        scheduleId: String,
        params: ScheduleReleaseParams = ScheduleReleaseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = release(params.toBuilder().scheduleId(scheduleId).build(), requestOptions)

    /** @see release */
    fun release(scheduleId: String, params: ScheduleReleaseParams = ScheduleReleaseParams.none()) =
        release(scheduleId, params, RequestOptions.none())

    /** @see release */
    fun release(
        params: ScheduleReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see release */
    fun release(params: ScheduleReleaseParams) = release(params, RequestOptions.none())

    /** @see release */
    fun release(scheduleId: String, requestOptions: RequestOptions) =
        release(scheduleId, ScheduleReleaseParams.none(), requestOptions)

    /** A view of [ScheduleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScheduleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /digests/schedules/{schedule_id}/instances`, but is
         * otherwise the same as [ScheduleService.listInstances].
         */
        @MustBeClosed
        fun listInstances(scheduleId: String): HttpResponseFor<DigestInstanceListResponse> =
            listInstances(scheduleId, ScheduleListInstancesParams.none())

        /** @see listInstances */
        @MustBeClosed
        fun listInstances(
            scheduleId: String,
            params: ScheduleListInstancesParams = ScheduleListInstancesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigestInstanceListResponse> =
            listInstances(params.toBuilder().scheduleId(scheduleId).build(), requestOptions)

        /** @see listInstances */
        @MustBeClosed
        fun listInstances(
            scheduleId: String,
            params: ScheduleListInstancesParams = ScheduleListInstancesParams.none(),
        ): HttpResponseFor<DigestInstanceListResponse> =
            listInstances(scheduleId, params, RequestOptions.none())

        /** @see listInstances */
        @MustBeClosed
        fun listInstances(
            params: ScheduleListInstancesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigestInstanceListResponse>

        /** @see listInstances */
        @MustBeClosed
        fun listInstances(
            params: ScheduleListInstancesParams
        ): HttpResponseFor<DigestInstanceListResponse> =
            listInstances(params, RequestOptions.none())

        /** @see listInstances */
        @MustBeClosed
        fun listInstances(
            scheduleId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigestInstanceListResponse> =
            listInstances(scheduleId, ScheduleListInstancesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /digests/schedules/{schedule_id}/trigger`, but is
         * otherwise the same as [ScheduleService.release].
         */
        @MustBeClosed
        fun release(scheduleId: String): HttpResponse =
            release(scheduleId, ScheduleReleaseParams.none())

        /** @see release */
        @MustBeClosed
        fun release(
            scheduleId: String,
            params: ScheduleReleaseParams = ScheduleReleaseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = release(params.toBuilder().scheduleId(scheduleId).build(), requestOptions)

        /** @see release */
        @MustBeClosed
        fun release(
            scheduleId: String,
            params: ScheduleReleaseParams = ScheduleReleaseParams.none(),
        ): HttpResponse = release(scheduleId, params, RequestOptions.none())

        /** @see release */
        @MustBeClosed
        fun release(
            params: ScheduleReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see release */
        @MustBeClosed
        fun release(params: ScheduleReleaseParams): HttpResponse =
            release(params, RequestOptions.none())

        /** @see release */
        @MustBeClosed
        fun release(scheduleId: String, requestOptions: RequestOptions): HttpResponse =
            release(scheduleId, ScheduleReleaseParams.none(), requestOptions)
    }
}

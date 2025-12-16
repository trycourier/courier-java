// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.bulk.BulkAddUsersParams
import com.courier.models.bulk.BulkCreateJobParams
import com.courier.models.bulk.BulkCreateJobResponse
import com.courier.models.bulk.BulkListUsersParams
import com.courier.models.bulk.BulkListUsersResponse
import com.courier.models.bulk.BulkRetrieveJobParams
import com.courier.models.bulk.BulkRetrieveJobResponse
import com.courier.models.bulk.BulkRunJobParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface BulkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkService

    /**
     * Ingest user data into a Bulk Job.
     *
     * **Important**: For email-based bulk jobs, each user must include `profile.email` for provider
     * routing to work correctly. The `to.email` field is not sufficient for email provider routing.
     */
    fun addUsers(jobId: String, params: BulkAddUsersParams) =
        addUsers(jobId, params, RequestOptions.none())

    /** @see addUsers */
    fun addUsers(
        jobId: String,
        params: BulkAddUsersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = addUsers(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see addUsers */
    fun addUsers(params: BulkAddUsersParams) = addUsers(params, RequestOptions.none())

    /** @see addUsers */
    fun addUsers(params: BulkAddUsersParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Creates a new bulk job for sending messages to multiple recipients.
     *
     * **Required**: `message.event` (event ID or notification ID)
     *
     * **Optional (V2 format)**: `message.template` (notification ID) or `message.content`
     * (Elemental content) can be provided to override the notification associated with the event.
     */
    fun createJob(params: BulkCreateJobParams): BulkCreateJobResponse =
        createJob(params, RequestOptions.none())

    /** @see createJob */
    fun createJob(
        params: BulkCreateJobParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkCreateJobResponse

    /** Get Bulk Job Users */
    fun listUsers(jobId: String): BulkListUsersResponse =
        listUsers(jobId, BulkListUsersParams.none())

    /** @see listUsers */
    fun listUsers(
        jobId: String,
        params: BulkListUsersParams = BulkListUsersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkListUsersResponse = listUsers(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see listUsers */
    fun listUsers(
        jobId: String,
        params: BulkListUsersParams = BulkListUsersParams.none(),
    ): BulkListUsersResponse = listUsers(jobId, params, RequestOptions.none())

    /** @see listUsers */
    fun listUsers(
        params: BulkListUsersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkListUsersResponse

    /** @see listUsers */
    fun listUsers(params: BulkListUsersParams): BulkListUsersResponse =
        listUsers(params, RequestOptions.none())

    /** @see listUsers */
    fun listUsers(jobId: String, requestOptions: RequestOptions): BulkListUsersResponse =
        listUsers(jobId, BulkListUsersParams.none(), requestOptions)

    /** Get a bulk job */
    fun retrieveJob(jobId: String): BulkRetrieveJobResponse =
        retrieveJob(jobId, BulkRetrieveJobParams.none())

    /** @see retrieveJob */
    fun retrieveJob(
        jobId: String,
        params: BulkRetrieveJobParams = BulkRetrieveJobParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkRetrieveJobResponse =
        retrieveJob(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see retrieveJob */
    fun retrieveJob(
        jobId: String,
        params: BulkRetrieveJobParams = BulkRetrieveJobParams.none(),
    ): BulkRetrieveJobResponse = retrieveJob(jobId, params, RequestOptions.none())

    /** @see retrieveJob */
    fun retrieveJob(
        params: BulkRetrieveJobParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkRetrieveJobResponse

    /** @see retrieveJob */
    fun retrieveJob(params: BulkRetrieveJobParams): BulkRetrieveJobResponse =
        retrieveJob(params, RequestOptions.none())

    /** @see retrieveJob */
    fun retrieveJob(jobId: String, requestOptions: RequestOptions): BulkRetrieveJobResponse =
        retrieveJob(jobId, BulkRetrieveJobParams.none(), requestOptions)

    /** Run a bulk job */
    fun runJob(jobId: String) = runJob(jobId, BulkRunJobParams.none())

    /** @see runJob */
    fun runJob(
        jobId: String,
        params: BulkRunJobParams = BulkRunJobParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = runJob(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see runJob */
    fun runJob(jobId: String, params: BulkRunJobParams = BulkRunJobParams.none()) =
        runJob(jobId, params, RequestOptions.none())

    /** @see runJob */
    fun runJob(params: BulkRunJobParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see runJob */
    fun runJob(params: BulkRunJobParams) = runJob(params, RequestOptions.none())

    /** @see runJob */
    fun runJob(jobId: String, requestOptions: RequestOptions) =
        runJob(jobId, BulkRunJobParams.none(), requestOptions)

    /** A view of [BulkService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /bulk/{job_id}`, but is otherwise the same as
         * [BulkService.addUsers].
         */
        @MustBeClosed
        fun addUsers(jobId: String, params: BulkAddUsersParams): HttpResponse =
            addUsers(jobId, params, RequestOptions.none())

        /** @see addUsers */
        @MustBeClosed
        fun addUsers(
            jobId: String,
            params: BulkAddUsersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = addUsers(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see addUsers */
        @MustBeClosed
        fun addUsers(params: BulkAddUsersParams): HttpResponse =
            addUsers(params, RequestOptions.none())

        /** @see addUsers */
        @MustBeClosed
        fun addUsers(
            params: BulkAddUsersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /bulk`, but is otherwise the same as
         * [BulkService.createJob].
         */
        @MustBeClosed
        fun createJob(params: BulkCreateJobParams): HttpResponseFor<BulkCreateJobResponse> =
            createJob(params, RequestOptions.none())

        /** @see createJob */
        @MustBeClosed
        fun createJob(
            params: BulkCreateJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkCreateJobResponse>

        /**
         * Returns a raw HTTP response for `get /bulk/{job_id}/users`, but is otherwise the same as
         * [BulkService.listUsers].
         */
        @MustBeClosed
        fun listUsers(jobId: String): HttpResponseFor<BulkListUsersResponse> =
            listUsers(jobId, BulkListUsersParams.none())

        /** @see listUsers */
        @MustBeClosed
        fun listUsers(
            jobId: String,
            params: BulkListUsersParams = BulkListUsersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkListUsersResponse> =
            listUsers(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see listUsers */
        @MustBeClosed
        fun listUsers(
            jobId: String,
            params: BulkListUsersParams = BulkListUsersParams.none(),
        ): HttpResponseFor<BulkListUsersResponse> = listUsers(jobId, params, RequestOptions.none())

        /** @see listUsers */
        @MustBeClosed
        fun listUsers(
            params: BulkListUsersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkListUsersResponse>

        /** @see listUsers */
        @MustBeClosed
        fun listUsers(params: BulkListUsersParams): HttpResponseFor<BulkListUsersResponse> =
            listUsers(params, RequestOptions.none())

        /** @see listUsers */
        @MustBeClosed
        fun listUsers(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkListUsersResponse> =
            listUsers(jobId, BulkListUsersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /bulk/{job_id}`, but is otherwise the same as
         * [BulkService.retrieveJob].
         */
        @MustBeClosed
        fun retrieveJob(jobId: String): HttpResponseFor<BulkRetrieveJobResponse> =
            retrieveJob(jobId, BulkRetrieveJobParams.none())

        /** @see retrieveJob */
        @MustBeClosed
        fun retrieveJob(
            jobId: String,
            params: BulkRetrieveJobParams = BulkRetrieveJobParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkRetrieveJobResponse> =
            retrieveJob(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see retrieveJob */
        @MustBeClosed
        fun retrieveJob(
            jobId: String,
            params: BulkRetrieveJobParams = BulkRetrieveJobParams.none(),
        ): HttpResponseFor<BulkRetrieveJobResponse> =
            retrieveJob(jobId, params, RequestOptions.none())

        /** @see retrieveJob */
        @MustBeClosed
        fun retrieveJob(
            params: BulkRetrieveJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkRetrieveJobResponse>

        /** @see retrieveJob */
        @MustBeClosed
        fun retrieveJob(params: BulkRetrieveJobParams): HttpResponseFor<BulkRetrieveJobResponse> =
            retrieveJob(params, RequestOptions.none())

        /** @see retrieveJob */
        @MustBeClosed
        fun retrieveJob(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkRetrieveJobResponse> =
            retrieveJob(jobId, BulkRetrieveJobParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /bulk/{job_id}/run`, but is otherwise the same as
         * [BulkService.runJob].
         */
        @MustBeClosed
        fun runJob(jobId: String): HttpResponse = runJob(jobId, BulkRunJobParams.none())

        /** @see runJob */
        @MustBeClosed
        fun runJob(
            jobId: String,
            params: BulkRunJobParams = BulkRunJobParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = runJob(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see runJob */
        @MustBeClosed
        fun runJob(
            jobId: String,
            params: BulkRunJobParams = BulkRunJobParams.none(),
        ): HttpResponse = runJob(jobId, params, RequestOptions.none())

        /** @see runJob */
        @MustBeClosed
        fun runJob(
            params: BulkRunJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see runJob */
        @MustBeClosed
        fun runJob(params: BulkRunJobParams): HttpResponse = runJob(params, RequestOptions.none())

        /** @see runJob */
        @MustBeClosed
        fun runJob(jobId: String, requestOptions: RequestOptions): HttpResponse =
            runJob(jobId, BulkRunJobParams.none(), requestOptions)
    }
}

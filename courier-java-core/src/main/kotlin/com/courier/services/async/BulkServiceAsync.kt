// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BulkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkServiceAsync

    /** Ingest user data into a Bulk Job */
    fun addUsers(jobId: String, params: BulkAddUsersParams): CompletableFuture<Void?> =
        addUsers(jobId, params, RequestOptions.none())

    /** @see addUsers */
    fun addUsers(
        jobId: String,
        params: BulkAddUsersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = addUsers(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see addUsers */
    fun addUsers(params: BulkAddUsersParams): CompletableFuture<Void?> =
        addUsers(params, RequestOptions.none())

    /** @see addUsers */
    fun addUsers(
        params: BulkAddUsersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Create a bulk job */
    fun createJob(params: BulkCreateJobParams): CompletableFuture<BulkCreateJobResponse> =
        createJob(params, RequestOptions.none())

    /** @see createJob */
    fun createJob(
        params: BulkCreateJobParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkCreateJobResponse>

    /** Get Bulk Job Users */
    fun listUsers(jobId: String): CompletableFuture<BulkListUsersResponse> =
        listUsers(jobId, BulkListUsersParams.none())

    /** @see listUsers */
    fun listUsers(
        jobId: String,
        params: BulkListUsersParams = BulkListUsersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkListUsersResponse> =
        listUsers(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see listUsers */
    fun listUsers(
        jobId: String,
        params: BulkListUsersParams = BulkListUsersParams.none(),
    ): CompletableFuture<BulkListUsersResponse> = listUsers(jobId, params, RequestOptions.none())

    /** @see listUsers */
    fun listUsers(
        params: BulkListUsersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkListUsersResponse>

    /** @see listUsers */
    fun listUsers(params: BulkListUsersParams): CompletableFuture<BulkListUsersResponse> =
        listUsers(params, RequestOptions.none())

    /** @see listUsers */
    fun listUsers(
        jobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkListUsersResponse> =
        listUsers(jobId, BulkListUsersParams.none(), requestOptions)

    /** Get a bulk job */
    fun retrieveJob(jobId: String): CompletableFuture<BulkRetrieveJobResponse> =
        retrieveJob(jobId, BulkRetrieveJobParams.none())

    /** @see retrieveJob */
    fun retrieveJob(
        jobId: String,
        params: BulkRetrieveJobParams = BulkRetrieveJobParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkRetrieveJobResponse> =
        retrieveJob(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see retrieveJob */
    fun retrieveJob(
        jobId: String,
        params: BulkRetrieveJobParams = BulkRetrieveJobParams.none(),
    ): CompletableFuture<BulkRetrieveJobResponse> =
        retrieveJob(jobId, params, RequestOptions.none())

    /** @see retrieveJob */
    fun retrieveJob(
        params: BulkRetrieveJobParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkRetrieveJobResponse>

    /** @see retrieveJob */
    fun retrieveJob(params: BulkRetrieveJobParams): CompletableFuture<BulkRetrieveJobResponse> =
        retrieveJob(params, RequestOptions.none())

    /** @see retrieveJob */
    fun retrieveJob(
        jobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkRetrieveJobResponse> =
        retrieveJob(jobId, BulkRetrieveJobParams.none(), requestOptions)

    /** Run a bulk job */
    fun runJob(jobId: String): CompletableFuture<Void?> = runJob(jobId, BulkRunJobParams.none())

    /** @see runJob */
    fun runJob(
        jobId: String,
        params: BulkRunJobParams = BulkRunJobParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = runJob(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see runJob */
    fun runJob(
        jobId: String,
        params: BulkRunJobParams = BulkRunJobParams.none(),
    ): CompletableFuture<Void?> = runJob(jobId, params, RequestOptions.none())

    /** @see runJob */
    fun runJob(
        params: BulkRunJobParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see runJob */
    fun runJob(params: BulkRunJobParams): CompletableFuture<Void?> =
        runJob(params, RequestOptions.none())

    /** @see runJob */
    fun runJob(jobId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        runJob(jobId, BulkRunJobParams.none(), requestOptions)

    /** A view of [BulkServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /bulk/{job_id}`, but is otherwise the same as
         * [BulkServiceAsync.addUsers].
         */
        fun addUsers(jobId: String, params: BulkAddUsersParams): CompletableFuture<HttpResponse> =
            addUsers(jobId, params, RequestOptions.none())

        /** @see addUsers */
        fun addUsers(
            jobId: String,
            params: BulkAddUsersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            addUsers(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see addUsers */
        fun addUsers(params: BulkAddUsersParams): CompletableFuture<HttpResponse> =
            addUsers(params, RequestOptions.none())

        /** @see addUsers */
        fun addUsers(
            params: BulkAddUsersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /bulk`, but is otherwise the same as
         * [BulkServiceAsync.createJob].
         */
        fun createJob(
            params: BulkCreateJobParams
        ): CompletableFuture<HttpResponseFor<BulkCreateJobResponse>> =
            createJob(params, RequestOptions.none())

        /** @see createJob */
        fun createJob(
            params: BulkCreateJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkCreateJobResponse>>

        /**
         * Returns a raw HTTP response for `get /bulk/{job_id}/users`, but is otherwise the same as
         * [BulkServiceAsync.listUsers].
         */
        fun listUsers(jobId: String): CompletableFuture<HttpResponseFor<BulkListUsersResponse>> =
            listUsers(jobId, BulkListUsersParams.none())

        /** @see listUsers */
        fun listUsers(
            jobId: String,
            params: BulkListUsersParams = BulkListUsersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkListUsersResponse>> =
            listUsers(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see listUsers */
        fun listUsers(
            jobId: String,
            params: BulkListUsersParams = BulkListUsersParams.none(),
        ): CompletableFuture<HttpResponseFor<BulkListUsersResponse>> =
            listUsers(jobId, params, RequestOptions.none())

        /** @see listUsers */
        fun listUsers(
            params: BulkListUsersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkListUsersResponse>>

        /** @see listUsers */
        fun listUsers(
            params: BulkListUsersParams
        ): CompletableFuture<HttpResponseFor<BulkListUsersResponse>> =
            listUsers(params, RequestOptions.none())

        /** @see listUsers */
        fun listUsers(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkListUsersResponse>> =
            listUsers(jobId, BulkListUsersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /bulk/{job_id}`, but is otherwise the same as
         * [BulkServiceAsync.retrieveJob].
         */
        fun retrieveJob(
            jobId: String
        ): CompletableFuture<HttpResponseFor<BulkRetrieveJobResponse>> =
            retrieveJob(jobId, BulkRetrieveJobParams.none())

        /** @see retrieveJob */
        fun retrieveJob(
            jobId: String,
            params: BulkRetrieveJobParams = BulkRetrieveJobParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkRetrieveJobResponse>> =
            retrieveJob(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see retrieveJob */
        fun retrieveJob(
            jobId: String,
            params: BulkRetrieveJobParams = BulkRetrieveJobParams.none(),
        ): CompletableFuture<HttpResponseFor<BulkRetrieveJobResponse>> =
            retrieveJob(jobId, params, RequestOptions.none())

        /** @see retrieveJob */
        fun retrieveJob(
            params: BulkRetrieveJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkRetrieveJobResponse>>

        /** @see retrieveJob */
        fun retrieveJob(
            params: BulkRetrieveJobParams
        ): CompletableFuture<HttpResponseFor<BulkRetrieveJobResponse>> =
            retrieveJob(params, RequestOptions.none())

        /** @see retrieveJob */
        fun retrieveJob(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkRetrieveJobResponse>> =
            retrieveJob(jobId, BulkRetrieveJobParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /bulk/{job_id}/run`, but is otherwise the same as
         * [BulkServiceAsync.runJob].
         */
        fun runJob(jobId: String): CompletableFuture<HttpResponse> =
            runJob(jobId, BulkRunJobParams.none())

        /** @see runJob */
        fun runJob(
            jobId: String,
            params: BulkRunJobParams = BulkRunJobParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            runJob(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see runJob */
        fun runJob(
            jobId: String,
            params: BulkRunJobParams = BulkRunJobParams.none(),
        ): CompletableFuture<HttpResponse> = runJob(jobId, params, RequestOptions.none())

        /** @see runJob */
        fun runJob(
            params: BulkRunJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see runJob */
        fun runJob(params: BulkRunJobParams): CompletableFuture<HttpResponse> =
            runJob(params, RequestOptions.none())

        /** @see runJob */
        fun runJob(jobId: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            runJob(jobId, BulkRunJobParams.none(), requestOptions)
    }
}

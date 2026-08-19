// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.journeys

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.journeys.JourneyRunListResponse
import com.courier.models.journeys.JourneyRunResponse
import com.courier.models.journeys.JourneyRunStepsResponse
import com.courier.models.journeys.runs.RunListParams
import com.courier.models.journeys.runs.RunListStepsParams
import com.courier.models.journeys.runs.RunRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Build, version, publish, invoke, and cancel multi-step notification workflows, along with the
 * templates scoped to them.
 */
interface RunServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync

    /**
     * Fetch one Journey run by id. Returns `404` for an unknown run, a run belonging to another
     * workspace, a run past the 95-day retention window, or an Automation run id — the same body in
     * every case, so the response never reveals whether a run exists elsewhere.
     */
    fun retrieve(runId: String): CompletableFuture<JourneyRunResponse> =
        retrieve(runId, RunRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams = RunRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyRunResponse> =
        retrieve(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams = RunRetrieveParams.none(),
    ): CompletableFuture<JourneyRunResponse> = retrieve(runId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyRunResponse>

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams): CompletableFuture<JourneyRunResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        runId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<JourneyRunResponse> =
        retrieve(runId, RunRetrieveParams.none(), requestOptions)

    /**
     * List runs of the workspace's Journeys, newest first, filtered by status, Journey, or date
     * range and paged by cursor. Runs of v2 Automations are listed by `GET /automations/runs`
     * instead — the two surfaces never return each other's runs. Runs are retained for 95 days.
     */
    fun list(): CompletableFuture<JourneyRunListResponse> = list(RunListParams.none())

    /** @see list */
    fun list(
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyRunListResponse>

    /** @see list */
    fun list(
        params: RunListParams = RunListParams.none()
    ): CompletableFuture<JourneyRunListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<JourneyRunListResponse> =
        list(RunListParams.none(), requestOptions)

    /**
     * List the per-node state of one Journey run, in full — this endpoint is not paginated. Each
     * step's `node_id` is the id of the node in the published Journey, so a step maps directly onto
     * the Journey graph. `message_id` is present on send steps that produced a message; follow it
     * to `GET /messages/{message_id}` for delivery status.
     */
    fun listSteps(runId: String): CompletableFuture<JourneyRunStepsResponse> =
        listSteps(runId, RunListStepsParams.none())

    /** @see listSteps */
    fun listSteps(
        runId: String,
        params: RunListStepsParams = RunListStepsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyRunStepsResponse> =
        listSteps(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see listSteps */
    fun listSteps(
        runId: String,
        params: RunListStepsParams = RunListStepsParams.none(),
    ): CompletableFuture<JourneyRunStepsResponse> = listSteps(runId, params, RequestOptions.none())

    /** @see listSteps */
    fun listSteps(
        params: RunListStepsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyRunStepsResponse>

    /** @see listSteps */
    fun listSteps(params: RunListStepsParams): CompletableFuture<JourneyRunStepsResponse> =
        listSteps(params, RequestOptions.none())

    /** @see listSteps */
    fun listSteps(
        runId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<JourneyRunStepsResponse> =
        listSteps(runId, RunListStepsParams.none(), requestOptions)

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /journeys/runs/{run_id}`, but is otherwise the same
         * as [RunServiceAsync.retrieve].
         */
        fun retrieve(runId: String): CompletableFuture<HttpResponseFor<JourneyRunResponse>> =
            retrieve(runId, RunRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            runId: String,
            params: RunRetrieveParams = RunRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyRunResponse>> =
            retrieve(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            runId: String,
            params: RunRetrieveParams = RunRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<JourneyRunResponse>> =
            retrieve(runId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyRunResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RunRetrieveParams
        ): CompletableFuture<HttpResponseFor<JourneyRunResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            runId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JourneyRunResponse>> =
            retrieve(runId, RunRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /journeys/runs`, but is otherwise the same as
         * [RunServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<JourneyRunListResponse>> =
            list(RunListParams.none())

        /** @see list */
        fun list(
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyRunListResponse>>

        /** @see list */
        fun list(
            params: RunListParams = RunListParams.none()
        ): CompletableFuture<HttpResponseFor<JourneyRunListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<JourneyRunListResponse>> =
            list(RunListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /journeys/runs/{run_id}/steps`, but is otherwise the
         * same as [RunServiceAsync.listSteps].
         */
        fun listSteps(runId: String): CompletableFuture<HttpResponseFor<JourneyRunStepsResponse>> =
            listSteps(runId, RunListStepsParams.none())

        /** @see listSteps */
        fun listSteps(
            runId: String,
            params: RunListStepsParams = RunListStepsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyRunStepsResponse>> =
            listSteps(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see listSteps */
        fun listSteps(
            runId: String,
            params: RunListStepsParams = RunListStepsParams.none(),
        ): CompletableFuture<HttpResponseFor<JourneyRunStepsResponse>> =
            listSteps(runId, params, RequestOptions.none())

        /** @see listSteps */
        fun listSteps(
            params: RunListStepsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyRunStepsResponse>>

        /** @see listSteps */
        fun listSteps(
            params: RunListStepsParams
        ): CompletableFuture<HttpResponseFor<JourneyRunStepsResponse>> =
            listSteps(params, RequestOptions.none())

        /** @see listSteps */
        fun listSteps(
            runId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JourneyRunStepsResponse>> =
            listSteps(runId, RunListStepsParams.none(), requestOptions)
    }
}

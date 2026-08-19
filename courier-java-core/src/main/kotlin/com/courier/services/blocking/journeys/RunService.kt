// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.journeys

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.journeys.JourneyRunListResponse
import com.courier.models.journeys.JourneyRunResponse
import com.courier.models.journeys.JourneyRunStepsResponse
import com.courier.models.journeys.runs.RunListParams
import com.courier.models.journeys.runs.RunListStepsParams
import com.courier.models.journeys.runs.RunRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Build, version, publish, invoke, and cancel multi-step notification workflows, along with the
 * templates scoped to them.
 */
interface RunService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService

    /**
     * Fetch one Journey run by id. Returns `404` for an unknown run, a run belonging to another
     * workspace, a run past the 95-day retention window, or an Automation run id — the same body in
     * every case, so the response never reveals whether a run exists elsewhere.
     */
    fun retrieve(runId: String): JourneyRunResponse = retrieve(runId, RunRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams = RunRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyRunResponse = retrieve(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        runId: String,
        params: RunRetrieveParams = RunRetrieveParams.none(),
    ): JourneyRunResponse = retrieve(runId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyRunResponse

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams): JourneyRunResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(runId: String, requestOptions: RequestOptions): JourneyRunResponse =
        retrieve(runId, RunRetrieveParams.none(), requestOptions)

    /**
     * List runs of the workspace's Journeys, newest first, filtered by status, Journey, or date
     * range and paged by cursor. Runs of v2 Automations are listed by `GET /automations/runs`
     * instead — the two surfaces never return each other's runs. Runs are retained for 95 days.
     */
    fun list(): JourneyRunListResponse = list(RunListParams.none())

    /** @see list */
    fun list(
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyRunListResponse

    /** @see list */
    fun list(params: RunListParams = RunListParams.none()): JourneyRunListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): JourneyRunListResponse =
        list(RunListParams.none(), requestOptions)

    /**
     * List the per-node state of one Journey run, in full — this endpoint is not paginated. Each
     * step's `node_id` is the id of the node in the published Journey, so a step maps directly onto
     * the Journey graph. `message_id` is present on send steps that produced a message; follow it
     * to `GET /messages/{message_id}` for delivery status.
     */
    fun listSteps(runId: String): JourneyRunStepsResponse =
        listSteps(runId, RunListStepsParams.none())

    /** @see listSteps */
    fun listSteps(
        runId: String,
        params: RunListStepsParams = RunListStepsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyRunStepsResponse = listSteps(params.toBuilder().runId(runId).build(), requestOptions)

    /** @see listSteps */
    fun listSteps(
        runId: String,
        params: RunListStepsParams = RunListStepsParams.none(),
    ): JourneyRunStepsResponse = listSteps(runId, params, RequestOptions.none())

    /** @see listSteps */
    fun listSteps(
        params: RunListStepsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyRunStepsResponse

    /** @see listSteps */
    fun listSteps(params: RunListStepsParams): JourneyRunStepsResponse =
        listSteps(params, RequestOptions.none())

    /** @see listSteps */
    fun listSteps(runId: String, requestOptions: RequestOptions): JourneyRunStepsResponse =
        listSteps(runId, RunListStepsParams.none(), requestOptions)

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /journeys/runs/{run_id}`, but is otherwise the same
         * as [RunService.retrieve].
         */
        @MustBeClosed
        fun retrieve(runId: String): HttpResponseFor<JourneyRunResponse> =
            retrieve(runId, RunRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            runId: String,
            params: RunRetrieveParams = RunRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyRunResponse> =
            retrieve(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            runId: String,
            params: RunRetrieveParams = RunRetrieveParams.none(),
        ): HttpResponseFor<JourneyRunResponse> = retrieve(runId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyRunResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RunRetrieveParams): HttpResponseFor<JourneyRunResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            runId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyRunResponse> =
            retrieve(runId, RunRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /journeys/runs`, but is otherwise the same as
         * [RunService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<JourneyRunListResponse> = list(RunListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyRunListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RunListParams = RunListParams.none()
        ): HttpResponseFor<JourneyRunListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<JourneyRunListResponse> =
            list(RunListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /journeys/runs/{run_id}/steps`, but is otherwise the
         * same as [RunService.listSteps].
         */
        @MustBeClosed
        fun listSteps(runId: String): HttpResponseFor<JourneyRunStepsResponse> =
            listSteps(runId, RunListStepsParams.none())

        /** @see listSteps */
        @MustBeClosed
        fun listSteps(
            runId: String,
            params: RunListStepsParams = RunListStepsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyRunStepsResponse> =
            listSteps(params.toBuilder().runId(runId).build(), requestOptions)

        /** @see listSteps */
        @MustBeClosed
        fun listSteps(
            runId: String,
            params: RunListStepsParams = RunListStepsParams.none(),
        ): HttpResponseFor<JourneyRunStepsResponse> =
            listSteps(runId, params, RequestOptions.none())

        /** @see listSteps */
        @MustBeClosed
        fun listSteps(
            params: RunListStepsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyRunStepsResponse>

        /** @see listSteps */
        @MustBeClosed
        fun listSteps(params: RunListStepsParams): HttpResponseFor<JourneyRunStepsResponse> =
            listSteps(params, RequestOptions.none())

        /** @see listSteps */
        @MustBeClosed
        fun listSteps(
            runId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyRunStepsResponse> =
            listSteps(runId, RunListStepsParams.none(), requestOptions)
    }
}

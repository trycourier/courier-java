// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.automations

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.automations.AutomationRunListResponse
import com.courier.models.automations.AutomationRunStepsResponse
import com.courier.models.automations.runs.RunListParams
import com.courier.models.automations.runs.RunListStepsParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Invoke a stored automation template or an ad hoc automation defined in the request. */
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
     * List runs of the workspace's v2 Automations, newest first, filtered by status, Template, or
     * date range and paged by cursor. Journey (v3) runs are listed by `GET /journeys/runs` instead
     * — the two surfaces never return each other's runs. Runs are retained for 95 days.
     */
    fun list(): AutomationRunListResponse = list(RunListParams.none())

    /** @see list */
    fun list(
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomationRunListResponse

    /** @see list */
    fun list(params: RunListParams = RunListParams.none()): AutomationRunListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AutomationRunListResponse =
        list(RunListParams.none(), requestOptions)

    /**
     * List the per-step state of one Automation run, in full — this endpoint is not paginated.
     * `message_id` is present on send steps that produced a message; follow it to `GET
     * /messages/{message_id}` for delivery status. A send to a List or an Audience yields one
     * `message_id` for the request, not one per recipient.
     */
    fun listSteps(id: String): AutomationRunStepsResponse = listSteps(id, RunListStepsParams.none())

    /** @see listSteps */
    fun listSteps(
        id: String,
        params: RunListStepsParams = RunListStepsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomationRunStepsResponse = listSteps(params.toBuilder().id(id).build(), requestOptions)

    /** @see listSteps */
    fun listSteps(
        id: String,
        params: RunListStepsParams = RunListStepsParams.none(),
    ): AutomationRunStepsResponse = listSteps(id, params, RequestOptions.none())

    /** @see listSteps */
    fun listSteps(
        params: RunListStepsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomationRunStepsResponse

    /** @see listSteps */
    fun listSteps(params: RunListStepsParams): AutomationRunStepsResponse =
        listSteps(params, RequestOptions.none())

    /** @see listSteps */
    fun listSteps(id: String, requestOptions: RequestOptions): AutomationRunStepsResponse =
        listSteps(id, RunListStepsParams.none(), requestOptions)

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /automations/runs`, but is otherwise the same as
         * [RunService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AutomationRunListResponse> = list(RunListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomationRunListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RunListParams = RunListParams.none()
        ): HttpResponseFor<AutomationRunListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AutomationRunListResponse> =
            list(RunListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /automations/runs/{id}/steps`, but is otherwise the
         * same as [RunService.listSteps].
         */
        @MustBeClosed
        fun listSteps(id: String): HttpResponseFor<AutomationRunStepsResponse> =
            listSteps(id, RunListStepsParams.none())

        /** @see listSteps */
        @MustBeClosed
        fun listSteps(
            id: String,
            params: RunListStepsParams = RunListStepsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomationRunStepsResponse> =
            listSteps(params.toBuilder().id(id).build(), requestOptions)

        /** @see listSteps */
        @MustBeClosed
        fun listSteps(
            id: String,
            params: RunListStepsParams = RunListStepsParams.none(),
        ): HttpResponseFor<AutomationRunStepsResponse> =
            listSteps(id, params, RequestOptions.none())

        /** @see listSteps */
        @MustBeClosed
        fun listSteps(
            params: RunListStepsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomationRunStepsResponse>

        /** @see listSteps */
        @MustBeClosed
        fun listSteps(params: RunListStepsParams): HttpResponseFor<AutomationRunStepsResponse> =
            listSteps(params, RequestOptions.none())

        /** @see listSteps */
        @MustBeClosed
        fun listSteps(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AutomationRunStepsResponse> =
            listSteps(id, RunListStepsParams.none(), requestOptions)
    }
}

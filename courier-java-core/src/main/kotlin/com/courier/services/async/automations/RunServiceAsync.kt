// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.automations

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.automations.AutomationRunListResponse
import com.courier.models.automations.AutomationRunStepsResponse
import com.courier.models.automations.runs.RunListParams
import com.courier.models.automations.runs.RunListStepsParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Invoke a stored automation template or an ad hoc automation defined in the request. */
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
     * List runs of the workspace's v2 Automations, newest first, filtered by status, Template, or
     * date range and paged by cursor. Journey (v3) runs are listed by `GET /journeys/runs` instead
     * — the two surfaces never return each other's runs. Runs are retained for 95 days.
     */
    fun list(): CompletableFuture<AutomationRunListResponse> = list(RunListParams.none())

    /** @see list */
    fun list(
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutomationRunListResponse>

    /** @see list */
    fun list(
        params: RunListParams = RunListParams.none()
    ): CompletableFuture<AutomationRunListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AutomationRunListResponse> =
        list(RunListParams.none(), requestOptions)

    /**
     * List the per-step state of one Automation run, in full — this endpoint is not paginated.
     * `message_id` is present on send steps that produced a message; follow it to `GET
     * /messages/{message_id}` for delivery status. A send to a List or an Audience yields one
     * `message_id` for the request, not one per recipient.
     */
    fun listSteps(id: String): CompletableFuture<AutomationRunStepsResponse> =
        listSteps(id, RunListStepsParams.none())

    /** @see listSteps */
    fun listSteps(
        id: String,
        params: RunListStepsParams = RunListStepsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutomationRunStepsResponse> =
        listSteps(params.toBuilder().id(id).build(), requestOptions)

    /** @see listSteps */
    fun listSteps(
        id: String,
        params: RunListStepsParams = RunListStepsParams.none(),
    ): CompletableFuture<AutomationRunStepsResponse> = listSteps(id, params, RequestOptions.none())

    /** @see listSteps */
    fun listSteps(
        params: RunListStepsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutomationRunStepsResponse>

    /** @see listSteps */
    fun listSteps(params: RunListStepsParams): CompletableFuture<AutomationRunStepsResponse> =
        listSteps(params, RequestOptions.none())

    /** @see listSteps */
    fun listSteps(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AutomationRunStepsResponse> =
        listSteps(id, RunListStepsParams.none(), requestOptions)

    /** A view of [RunServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /automations/runs`, but is otherwise the same as
         * [RunServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AutomationRunListResponse>> =
            list(RunListParams.none())

        /** @see list */
        fun list(
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutomationRunListResponse>>

        /** @see list */
        fun list(
            params: RunListParams = RunListParams.none()
        ): CompletableFuture<HttpResponseFor<AutomationRunListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AutomationRunListResponse>> =
            list(RunListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /automations/runs/{id}/steps`, but is otherwise the
         * same as [RunServiceAsync.listSteps].
         */
        fun listSteps(id: String): CompletableFuture<HttpResponseFor<AutomationRunStepsResponse>> =
            listSteps(id, RunListStepsParams.none())

        /** @see listSteps */
        fun listSteps(
            id: String,
            params: RunListStepsParams = RunListStepsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutomationRunStepsResponse>> =
            listSteps(params.toBuilder().id(id).build(), requestOptions)

        /** @see listSteps */
        fun listSteps(
            id: String,
            params: RunListStepsParams = RunListStepsParams.none(),
        ): CompletableFuture<HttpResponseFor<AutomationRunStepsResponse>> =
            listSteps(id, params, RequestOptions.none())

        /** @see listSteps */
        fun listSteps(
            params: RunListStepsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutomationRunStepsResponse>>

        /** @see listSteps */
        fun listSteps(
            params: RunListStepsParams
        ): CompletableFuture<HttpResponseFor<AutomationRunStepsResponse>> =
            listSteps(params, RequestOptions.none())

        /** @see listSteps */
        fun listSteps(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AutomationRunStepsResponse>> =
            listSteps(id, RunListStepsParams.none(), requestOptions)
    }
}

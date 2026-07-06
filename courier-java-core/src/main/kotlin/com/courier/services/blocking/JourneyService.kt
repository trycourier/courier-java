// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.journeys.CancelJourneyRequest
import com.courier.models.journeys.CancelJourneyResponse
import com.courier.models.journeys.CreateJourneyRequest
import com.courier.models.journeys.JourneyArchiveParams
import com.courier.models.journeys.JourneyCancelParams
import com.courier.models.journeys.JourneyCreateParams
import com.courier.models.journeys.JourneyInvokeParams
import com.courier.models.journeys.JourneyListParams
import com.courier.models.journeys.JourneyListVersionsParams
import com.courier.models.journeys.JourneyPublishParams
import com.courier.models.journeys.JourneyReplaceParams
import com.courier.models.journeys.JourneyResponse
import com.courier.models.journeys.JourneyRetrieveParams
import com.courier.models.journeys.JourneyVersionsListResponse
import com.courier.models.journeys.JourneysInvokeResponse
import com.courier.models.journeys.JourneysListResponse
import com.courier.services.blocking.journeys.TemplateService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface JourneyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JourneyService

    fun templates(): TemplateService

    /**
     * Create a journey. Defaults to `DRAFT` state; pass `state: "PUBLISHED"` to publish on create.
     * Send nodes are not allowed on `POST`. The standard flow is: create the journey shell here,
     * add notification templates with `POST /journeys/{templateId}/templates`, then wire them into
     * the journey with `PUT /journeys/{templateId}`. Call `POST /journeys/{templateId}/publish` to
     * publish a draft after the fact.
     */
    fun create(params: JourneyCreateParams): JourneyResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: JourneyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyResponse

    /** @see create */
    fun create(
        createJourneyRequest: CreateJourneyRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyResponse =
        create(
            JourneyCreateParams.builder().createJourneyRequest(createJourneyRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(createJourneyRequest: CreateJourneyRequest): JourneyResponse =
        create(createJourneyRequest, RequestOptions.none())

    /**
     * Fetch a journey by id. Pass `?version=draft` (default `published`) to retrieve the working
     * draft, or `?version=vN` to retrieve a historical version.
     */
    fun retrieve(templateId: String): JourneyResponse =
        retrieve(templateId, JourneyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: JourneyRetrieveParams = JourneyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyResponse = retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: JourneyRetrieveParams = JourneyRetrieveParams.none(),
    ): JourneyResponse = retrieve(templateId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: JourneyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyResponse

    /** @see retrieve */
    fun retrieve(params: JourneyRetrieveParams): JourneyResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(templateId: String, requestOptions: RequestOptions): JourneyResponse =
        retrieve(templateId, JourneyRetrieveParams.none(), requestOptions)

    /** Get the list of journeys. */
    fun list(): JourneysListResponse = list(JourneyListParams.none())

    /** @see list */
    fun list(
        params: JourneyListParams = JourneyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneysListResponse

    /** @see list */
    fun list(params: JourneyListParams = JourneyListParams.none()): JourneysListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): JourneysListResponse =
        list(JourneyListParams.none(), requestOptions)

    /**
     * Archive a journey. Archived journeys cannot be invoked. Existing journey runs continue to
     * completion.
     */
    fun archive(templateId: String) = archive(templateId, JourneyArchiveParams.none())

    /** @see archive */
    fun archive(
        templateId: String,
        params: JourneyArchiveParams = JourneyArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archive(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see archive */
    fun archive(templateId: String, params: JourneyArchiveParams = JourneyArchiveParams.none()) =
        archive(templateId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: JourneyArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see archive */
    fun archive(params: JourneyArchiveParams) = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(templateId: String, requestOptions: RequestOptions) =
        archive(templateId, JourneyArchiveParams.none(), requestOptions)

    /**
     * Cancel journey runs. The request body must include EXACTLY ONE of `cancelation_token`
     * (cancels every run associated with the token) or `run_id` (cancels a single tenant-scoped
     * run). Supplying both or neither returns a `400`. A `run_id` that does not match a run for the
     * tenant returns `404`. Cancelation is idempotent: a run that has already finished
     * (`PROCESSED`/`ERROR`) or was already `CANCELED` is left unchanged and its current status is
     * returned.
     */
    fun cancel(params: JourneyCancelParams): CancelJourneyResponse =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: JourneyCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CancelJourneyResponse

    /** @see cancel */
    fun cancel(
        cancelJourneyRequest: CancelJourneyRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CancelJourneyResponse =
        cancel(
            JourneyCancelParams.builder().cancelJourneyRequest(cancelJourneyRequest).build(),
            requestOptions,
        )

    /** @see cancel */
    fun cancel(cancelJourneyRequest: CancelJourneyRequest): CancelJourneyResponse =
        cancel(cancelJourneyRequest, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        byCancelationToken: CancelJourneyRequest.ByCancelationToken,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CancelJourneyResponse =
        cancel(CancelJourneyRequest.ofByCancelationToken(byCancelationToken), requestOptions)

    /** @see cancel */
    fun cancel(byCancelationToken: CancelJourneyRequest.ByCancelationToken): CancelJourneyResponse =
        cancel(byCancelationToken, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        byRunId: CancelJourneyRequest.ByRunId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CancelJourneyResponse = cancel(CancelJourneyRequest.ofByRunId(byRunId), requestOptions)

    /** @see cancel */
    fun cancel(byRunId: CancelJourneyRequest.ByRunId): CancelJourneyResponse =
        cancel(byRunId, RequestOptions.none())

    /**
     * Invoke a journey by id or alias to start a new run. The response includes a `runId`
     * identifying the run.
     */
    fun invoke(templateId: String, params: JourneyInvokeParams): JourneysInvokeResponse =
        invoke(templateId, params, RequestOptions.none())

    /** @see invoke */
    fun invoke(
        templateId: String,
        params: JourneyInvokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneysInvokeResponse =
        invoke(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see invoke */
    fun invoke(params: JourneyInvokeParams): JourneysInvokeResponse =
        invoke(params, RequestOptions.none())

    /** @see invoke */
    fun invoke(
        params: JourneyInvokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneysInvokeResponse

    /** List published versions of a journey, ordered most recent first. */
    fun listVersions(templateId: String): JourneyVersionsListResponse =
        listVersions(templateId, JourneyListVersionsParams.none())

    /** @see listVersions */
    fun listVersions(
        templateId: String,
        params: JourneyListVersionsParams = JourneyListVersionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyVersionsListResponse =
        listVersions(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see listVersions */
    fun listVersions(
        templateId: String,
        params: JourneyListVersionsParams = JourneyListVersionsParams.none(),
    ): JourneyVersionsListResponse = listVersions(templateId, params, RequestOptions.none())

    /** @see listVersions */
    fun listVersions(
        params: JourneyListVersionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyVersionsListResponse

    /** @see listVersions */
    fun listVersions(params: JourneyListVersionsParams): JourneyVersionsListResponse =
        listVersions(params, RequestOptions.none())

    /** @see listVersions */
    fun listVersions(
        templateId: String,
        requestOptions: RequestOptions,
    ): JourneyVersionsListResponse =
        listVersions(templateId, JourneyListVersionsParams.none(), requestOptions)

    /**
     * Publish the current draft as a new version. Body is optional; pass `{ "version": "vN" }` to
     * roll back to a prior version instead. Returns 404 if the journey has no draft to publish.
     */
    fun publish(templateId: String): JourneyResponse =
        publish(templateId, JourneyPublishParams.none())

    /** @see publish */
    fun publish(
        templateId: String,
        params: JourneyPublishParams = JourneyPublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyResponse = publish(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see publish */
    fun publish(
        templateId: String,
        params: JourneyPublishParams = JourneyPublishParams.none(),
    ): JourneyResponse = publish(templateId, params, RequestOptions.none())

    /** @see publish */
    fun publish(
        params: JourneyPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyResponse

    /** @see publish */
    fun publish(params: JourneyPublishParams): JourneyResponse =
        publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(templateId: String, requestOptions: RequestOptions): JourneyResponse =
        publish(templateId, JourneyPublishParams.none(), requestOptions)

    /**
     * Replace the journey draft. Updates the working draft only; call `POST
     * /journeys/{templateId}/publish` to make it live, or pass `state: "PUBLISHED"` in this request
     * to publish immediately. Send-node `template` ids must already exist and be scoped to this
     * journey, and node ids must not be claimed by another journey.
     */
    fun replace(templateId: String, params: JourneyReplaceParams): JourneyResponse =
        replace(templateId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        templateId: String,
        params: JourneyReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyResponse = replace(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see replace */
    fun replace(params: JourneyReplaceParams): JourneyResponse =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: JourneyReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JourneyResponse

    /** A view of [JourneyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JourneyService.WithRawResponse

        fun templates(): TemplateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /journeys`, but is otherwise the same as
         * [JourneyService.create].
         */
        @MustBeClosed
        fun create(params: JourneyCreateParams): HttpResponseFor<JourneyResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: JourneyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            createJourneyRequest: CreateJourneyRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyResponse> =
            create(
                JourneyCreateParams.builder().createJourneyRequest(createJourneyRequest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(createJourneyRequest: CreateJourneyRequest): HttpResponseFor<JourneyResponse> =
            create(createJourneyRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /journeys/{templateId}`, but is otherwise the same
         * as [JourneyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(templateId: String): HttpResponseFor<JourneyResponse> =
            retrieve(templateId, JourneyRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            templateId: String,
            params: JourneyRetrieveParams = JourneyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyResponse> =
            retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            templateId: String,
            params: JourneyRetrieveParams = JourneyRetrieveParams.none(),
        ): HttpResponseFor<JourneyResponse> = retrieve(templateId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: JourneyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: JourneyRetrieveParams): HttpResponseFor<JourneyResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            templateId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyResponse> =
            retrieve(templateId, JourneyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /journeys`, but is otherwise the same as
         * [JourneyService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<JourneysListResponse> = list(JourneyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: JourneyListParams = JourneyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneysListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: JourneyListParams = JourneyListParams.none()
        ): HttpResponseFor<JourneysListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<JourneysListResponse> =
            list(JourneyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /journeys/{templateId}`, but is otherwise the
         * same as [JourneyService.archive].
         */
        @MustBeClosed
        fun archive(templateId: String): HttpResponse =
            archive(templateId, JourneyArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            templateId: String,
            params: JourneyArchiveParams = JourneyArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = archive(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            templateId: String,
            params: JourneyArchiveParams = JourneyArchiveParams.none(),
        ): HttpResponse = archive(templateId, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: JourneyArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see archive */
        @MustBeClosed
        fun archive(params: JourneyArchiveParams): HttpResponse =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(templateId: String, requestOptions: RequestOptions): HttpResponse =
            archive(templateId, JourneyArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /journeys/cancel`, but is otherwise the same as
         * [JourneyService.cancel].
         */
        @MustBeClosed
        fun cancel(params: JourneyCancelParams): HttpResponseFor<CancelJourneyResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: JourneyCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CancelJourneyResponse>

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            cancelJourneyRequest: CancelJourneyRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CancelJourneyResponse> =
            cancel(
                JourneyCancelParams.builder().cancelJourneyRequest(cancelJourneyRequest).build(),
                requestOptions,
            )

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            cancelJourneyRequest: CancelJourneyRequest
        ): HttpResponseFor<CancelJourneyResponse> =
            cancel(cancelJourneyRequest, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            byCancelationToken: CancelJourneyRequest.ByCancelationToken,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CancelJourneyResponse> =
            cancel(CancelJourneyRequest.ofByCancelationToken(byCancelationToken), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            byCancelationToken: CancelJourneyRequest.ByCancelationToken
        ): HttpResponseFor<CancelJourneyResponse> =
            cancel(byCancelationToken, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            byRunId: CancelJourneyRequest.ByRunId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CancelJourneyResponse> =
            cancel(CancelJourneyRequest.ofByRunId(byRunId), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(byRunId: CancelJourneyRequest.ByRunId): HttpResponseFor<CancelJourneyResponse> =
            cancel(byRunId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /journeys/{templateId}/invoke`, but is otherwise
         * the same as [JourneyService.invoke].
         */
        @MustBeClosed
        fun invoke(
            templateId: String,
            params: JourneyInvokeParams,
        ): HttpResponseFor<JourneysInvokeResponse> =
            invoke(templateId, params, RequestOptions.none())

        /** @see invoke */
        @MustBeClosed
        fun invoke(
            templateId: String,
            params: JourneyInvokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneysInvokeResponse> =
            invoke(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see invoke */
        @MustBeClosed
        fun invoke(params: JourneyInvokeParams): HttpResponseFor<JourneysInvokeResponse> =
            invoke(params, RequestOptions.none())

        /** @see invoke */
        @MustBeClosed
        fun invoke(
            params: JourneyInvokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneysInvokeResponse>

        /**
         * Returns a raw HTTP response for `get /journeys/{templateId}/versions`, but is otherwise
         * the same as [JourneyService.listVersions].
         */
        @MustBeClosed
        fun listVersions(templateId: String): HttpResponseFor<JourneyVersionsListResponse> =
            listVersions(templateId, JourneyListVersionsParams.none())

        /** @see listVersions */
        @MustBeClosed
        fun listVersions(
            templateId: String,
            params: JourneyListVersionsParams = JourneyListVersionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyVersionsListResponse> =
            listVersions(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see listVersions */
        @MustBeClosed
        fun listVersions(
            templateId: String,
            params: JourneyListVersionsParams = JourneyListVersionsParams.none(),
        ): HttpResponseFor<JourneyVersionsListResponse> =
            listVersions(templateId, params, RequestOptions.none())

        /** @see listVersions */
        @MustBeClosed
        fun listVersions(
            params: JourneyListVersionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyVersionsListResponse>

        /** @see listVersions */
        @MustBeClosed
        fun listVersions(
            params: JourneyListVersionsParams
        ): HttpResponseFor<JourneyVersionsListResponse> =
            listVersions(params, RequestOptions.none())

        /** @see listVersions */
        @MustBeClosed
        fun listVersions(
            templateId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyVersionsListResponse> =
            listVersions(templateId, JourneyListVersionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /journeys/{templateId}/publish`, but is otherwise
         * the same as [JourneyService.publish].
         */
        @MustBeClosed
        fun publish(templateId: String): HttpResponseFor<JourneyResponse> =
            publish(templateId, JourneyPublishParams.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            templateId: String,
            params: JourneyPublishParams = JourneyPublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyResponse> =
            publish(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see publish */
        @MustBeClosed
        fun publish(
            templateId: String,
            params: JourneyPublishParams = JourneyPublishParams.none(),
        ): HttpResponseFor<JourneyResponse> = publish(templateId, params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            params: JourneyPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyResponse>

        /** @see publish */
        @MustBeClosed
        fun publish(params: JourneyPublishParams): HttpResponseFor<JourneyResponse> =
            publish(params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            templateId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<JourneyResponse> =
            publish(templateId, JourneyPublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /journeys/{templateId}`, but is otherwise the same
         * as [JourneyService.replace].
         */
        @MustBeClosed
        fun replace(
            templateId: String,
            params: JourneyReplaceParams,
        ): HttpResponseFor<JourneyResponse> = replace(templateId, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            templateId: String,
            params: JourneyReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyResponse> =
            replace(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(params: JourneyReplaceParams): HttpResponseFor<JourneyResponse> =
            replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: JourneyReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JourneyResponse>
    }
}

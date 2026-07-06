// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

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
import com.courier.services.async.journeys.TemplateServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface JourneyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JourneyServiceAsync

    fun templates(): TemplateServiceAsync

    /**
     * Create a journey. Defaults to `DRAFT` state; pass `state: "PUBLISHED"` to publish on create.
     * Send nodes are not allowed on `POST`. The standard flow is: create the journey shell here,
     * add notification templates with `POST /journeys/{templateId}/templates`, then wire them into
     * the journey with `PUT /journeys/{templateId}`. Call `POST /journeys/{templateId}/publish` to
     * publish a draft after the fact.
     */
    fun create(params: JourneyCreateParams): CompletableFuture<JourneyResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: JourneyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyResponse>

    /** @see create */
    fun create(
        createJourneyRequest: CreateJourneyRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyResponse> =
        create(
            JourneyCreateParams.builder().createJourneyRequest(createJourneyRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(createJourneyRequest: CreateJourneyRequest): CompletableFuture<JourneyResponse> =
        create(createJourneyRequest, RequestOptions.none())

    /**
     * Fetch a journey by id. Pass `?version=draft` (default `published`) to retrieve the working
     * draft, or `?version=vN` to retrieve a historical version.
     */
    fun retrieve(templateId: String): CompletableFuture<JourneyResponse> =
        retrieve(templateId, JourneyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: JourneyRetrieveParams = JourneyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyResponse> =
        retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: JourneyRetrieveParams = JourneyRetrieveParams.none(),
    ): CompletableFuture<JourneyResponse> = retrieve(templateId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: JourneyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyResponse>

    /** @see retrieve */
    fun retrieve(params: JourneyRetrieveParams): CompletableFuture<JourneyResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<JourneyResponse> =
        retrieve(templateId, JourneyRetrieveParams.none(), requestOptions)

    /** Get the list of journeys. */
    fun list(): CompletableFuture<JourneysListResponse> = list(JourneyListParams.none())

    /** @see list */
    fun list(
        params: JourneyListParams = JourneyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneysListResponse>

    /** @see list */
    fun list(
        params: JourneyListParams = JourneyListParams.none()
    ): CompletableFuture<JourneysListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<JourneysListResponse> =
        list(JourneyListParams.none(), requestOptions)

    /**
     * Archive a journey. Archived journeys cannot be invoked. Existing journey runs continue to
     * completion.
     */
    fun archive(templateId: String): CompletableFuture<Void?> =
        archive(templateId, JourneyArchiveParams.none())

    /** @see archive */
    fun archive(
        templateId: String,
        params: JourneyArchiveParams = JourneyArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        archive(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see archive */
    fun archive(
        templateId: String,
        params: JourneyArchiveParams = JourneyArchiveParams.none(),
    ): CompletableFuture<Void?> = archive(templateId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: JourneyArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see archive */
    fun archive(params: JourneyArchiveParams): CompletableFuture<Void?> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(templateId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        archive(templateId, JourneyArchiveParams.none(), requestOptions)

    /**
     * Cancel journey runs. The request body must contain EXACTLY ONE of `cancelation_token`
     * (cancels every run associated with the token) or `run_id` (cancels a single tenant-scoped
     * run). Supplying both or neither is a `400`. A `run_id` that does not match a run for the
     * tenant returns `404`. Cancelation is idempotent: a run that has already finished
     * (`PROCESSED`/`ERROR`) or was already `CANCELED` is left unchanged and its current status is
     * returned.
     */
    fun cancel(params: JourneyCancelParams): CompletableFuture<CancelJourneyResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: JourneyCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CancelJourneyResponse>

    /** @see cancel */
    fun cancel(
        cancelJourneyRequest: CancelJourneyRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CancelJourneyResponse> =
        cancel(
            JourneyCancelParams.builder().cancelJourneyRequest(cancelJourneyRequest).build(),
            requestOptions,
        )

    /** @see cancel */
    fun cancel(
        cancelJourneyRequest: CancelJourneyRequest
    ): CompletableFuture<CancelJourneyResponse> =
        cancel(cancelJourneyRequest, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        byCancelationToken: CancelJourneyRequest.ByCancelationToken,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CancelJourneyResponse> =
        cancel(CancelJourneyRequest.ofByCancelationToken(byCancelationToken), requestOptions)

    /** @see cancel */
    fun cancel(
        byCancelationToken: CancelJourneyRequest.ByCancelationToken
    ): CompletableFuture<CancelJourneyResponse> = cancel(byCancelationToken, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        byRunId: CancelJourneyRequest.ByRunId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CancelJourneyResponse> =
        cancel(CancelJourneyRequest.ofByRunId(byRunId), requestOptions)

    /** @see cancel */
    fun cancel(byRunId: CancelJourneyRequest.ByRunId): CompletableFuture<CancelJourneyResponse> =
        cancel(byRunId, RequestOptions.none())

    /**
     * Invoke a journey by id or alias to start a new run. The response includes a `runId`
     * identifying the run.
     */
    fun invoke(
        templateId: String,
        params: JourneyInvokeParams,
    ): CompletableFuture<JourneysInvokeResponse> = invoke(templateId, params, RequestOptions.none())

    /** @see invoke */
    fun invoke(
        templateId: String,
        params: JourneyInvokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneysInvokeResponse> =
        invoke(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see invoke */
    fun invoke(params: JourneyInvokeParams): CompletableFuture<JourneysInvokeResponse> =
        invoke(params, RequestOptions.none())

    /** @see invoke */
    fun invoke(
        params: JourneyInvokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneysInvokeResponse>

    /** List published versions of a journey, ordered most recent first. */
    fun listVersions(templateId: String): CompletableFuture<JourneyVersionsListResponse> =
        listVersions(templateId, JourneyListVersionsParams.none())

    /** @see listVersions */
    fun listVersions(
        templateId: String,
        params: JourneyListVersionsParams = JourneyListVersionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyVersionsListResponse> =
        listVersions(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see listVersions */
    fun listVersions(
        templateId: String,
        params: JourneyListVersionsParams = JourneyListVersionsParams.none(),
    ): CompletableFuture<JourneyVersionsListResponse> =
        listVersions(templateId, params, RequestOptions.none())

    /** @see listVersions */
    fun listVersions(
        params: JourneyListVersionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyVersionsListResponse>

    /** @see listVersions */
    fun listVersions(
        params: JourneyListVersionsParams
    ): CompletableFuture<JourneyVersionsListResponse> = listVersions(params, RequestOptions.none())

    /** @see listVersions */
    fun listVersions(
        templateId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<JourneyVersionsListResponse> =
        listVersions(templateId, JourneyListVersionsParams.none(), requestOptions)

    /**
     * Publish the current draft as a new version. Body is optional; pass `{ "version": "vN" }` to
     * roll back to a prior version instead. Returns 404 if the journey has no draft to publish.
     */
    fun publish(templateId: String): CompletableFuture<JourneyResponse> =
        publish(templateId, JourneyPublishParams.none())

    /** @see publish */
    fun publish(
        templateId: String,
        params: JourneyPublishParams = JourneyPublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyResponse> =
        publish(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see publish */
    fun publish(
        templateId: String,
        params: JourneyPublishParams = JourneyPublishParams.none(),
    ): CompletableFuture<JourneyResponse> = publish(templateId, params, RequestOptions.none())

    /** @see publish */
    fun publish(
        params: JourneyPublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyResponse>

    /** @see publish */
    fun publish(params: JourneyPublishParams): CompletableFuture<JourneyResponse> =
        publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(
        templateId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<JourneyResponse> =
        publish(templateId, JourneyPublishParams.none(), requestOptions)

    /**
     * Replace the journey draft. Updates the working draft only; call `POST
     * /journeys/{templateId}/publish` to make it live, or pass `state: "PUBLISHED"` in this request
     * to publish immediately. Send-node `template` ids must already exist and be scoped to this
     * journey, and node ids must not be claimed by another journey.
     */
    fun replace(
        templateId: String,
        params: JourneyReplaceParams,
    ): CompletableFuture<JourneyResponse> = replace(templateId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        templateId: String,
        params: JourneyReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyResponse> =
        replace(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see replace */
    fun replace(params: JourneyReplaceParams): CompletableFuture<JourneyResponse> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: JourneyReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JourneyResponse>

    /**
     * A view of [JourneyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JourneyServiceAsync.WithRawResponse

        fun templates(): TemplateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /journeys`, but is otherwise the same as
         * [JourneyServiceAsync.create].
         */
        fun create(
            params: JourneyCreateParams
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: JourneyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyResponse>>

        /** @see create */
        fun create(
            createJourneyRequest: CreateJourneyRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> =
            create(
                JourneyCreateParams.builder().createJourneyRequest(createJourneyRequest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            createJourneyRequest: CreateJourneyRequest
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> =
            create(createJourneyRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /journeys/{templateId}`, but is otherwise the same
         * as [JourneyServiceAsync.retrieve].
         */
        fun retrieve(templateId: String): CompletableFuture<HttpResponseFor<JourneyResponse>> =
            retrieve(templateId, JourneyRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            templateId: String,
            params: JourneyRetrieveParams = JourneyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> =
            retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            templateId: String,
            params: JourneyRetrieveParams = JourneyRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> =
            retrieve(templateId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: JourneyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyResponse>>

        /** @see retrieve */
        fun retrieve(
            params: JourneyRetrieveParams
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            templateId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> =
            retrieve(templateId, JourneyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /journeys`, but is otherwise the same as
         * [JourneyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<JourneysListResponse>> =
            list(JourneyListParams.none())

        /** @see list */
        fun list(
            params: JourneyListParams = JourneyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneysListResponse>>

        /** @see list */
        fun list(
            params: JourneyListParams = JourneyListParams.none()
        ): CompletableFuture<HttpResponseFor<JourneysListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<JourneysListResponse>> =
            list(JourneyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /journeys/{templateId}`, but is otherwise the
         * same as [JourneyServiceAsync.archive].
         */
        fun archive(templateId: String): CompletableFuture<HttpResponse> =
            archive(templateId, JourneyArchiveParams.none())

        /** @see archive */
        fun archive(
            templateId: String,
            params: JourneyArchiveParams = JourneyArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            archive(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see archive */
        fun archive(
            templateId: String,
            params: JourneyArchiveParams = JourneyArchiveParams.none(),
        ): CompletableFuture<HttpResponse> = archive(templateId, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: JourneyArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see archive */
        fun archive(params: JourneyArchiveParams): CompletableFuture<HttpResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            templateId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            archive(templateId, JourneyArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /journeys/cancel`, but is otherwise the same as
         * [JourneyServiceAsync.cancel].
         */
        fun cancel(
            params: JourneyCancelParams
        ): CompletableFuture<HttpResponseFor<CancelJourneyResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: JourneyCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CancelJourneyResponse>>

        /** @see cancel */
        fun cancel(
            cancelJourneyRequest: CancelJourneyRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CancelJourneyResponse>> =
            cancel(
                JourneyCancelParams.builder().cancelJourneyRequest(cancelJourneyRequest).build(),
                requestOptions,
            )

        /** @see cancel */
        fun cancel(
            cancelJourneyRequest: CancelJourneyRequest
        ): CompletableFuture<HttpResponseFor<CancelJourneyResponse>> =
            cancel(cancelJourneyRequest, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            byCancelationToken: CancelJourneyRequest.ByCancelationToken,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CancelJourneyResponse>> =
            cancel(CancelJourneyRequest.ofByCancelationToken(byCancelationToken), requestOptions)

        /** @see cancel */
        fun cancel(
            byCancelationToken: CancelJourneyRequest.ByCancelationToken
        ): CompletableFuture<HttpResponseFor<CancelJourneyResponse>> =
            cancel(byCancelationToken, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            byRunId: CancelJourneyRequest.ByRunId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CancelJourneyResponse>> =
            cancel(CancelJourneyRequest.ofByRunId(byRunId), requestOptions)

        /** @see cancel */
        fun cancel(
            byRunId: CancelJourneyRequest.ByRunId
        ): CompletableFuture<HttpResponseFor<CancelJourneyResponse>> =
            cancel(byRunId, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /journeys/{templateId}/invoke`, but is otherwise
         * the same as [JourneyServiceAsync.invoke].
         */
        fun invoke(
            templateId: String,
            params: JourneyInvokeParams,
        ): CompletableFuture<HttpResponseFor<JourneysInvokeResponse>> =
            invoke(templateId, params, RequestOptions.none())

        /** @see invoke */
        fun invoke(
            templateId: String,
            params: JourneyInvokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneysInvokeResponse>> =
            invoke(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see invoke */
        fun invoke(
            params: JourneyInvokeParams
        ): CompletableFuture<HttpResponseFor<JourneysInvokeResponse>> =
            invoke(params, RequestOptions.none())

        /** @see invoke */
        fun invoke(
            params: JourneyInvokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneysInvokeResponse>>

        /**
         * Returns a raw HTTP response for `get /journeys/{templateId}/versions`, but is otherwise
         * the same as [JourneyServiceAsync.listVersions].
         */
        fun listVersions(
            templateId: String
        ): CompletableFuture<HttpResponseFor<JourneyVersionsListResponse>> =
            listVersions(templateId, JourneyListVersionsParams.none())

        /** @see listVersions */
        fun listVersions(
            templateId: String,
            params: JourneyListVersionsParams = JourneyListVersionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyVersionsListResponse>> =
            listVersions(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see listVersions */
        fun listVersions(
            templateId: String,
            params: JourneyListVersionsParams = JourneyListVersionsParams.none(),
        ): CompletableFuture<HttpResponseFor<JourneyVersionsListResponse>> =
            listVersions(templateId, params, RequestOptions.none())

        /** @see listVersions */
        fun listVersions(
            params: JourneyListVersionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyVersionsListResponse>>

        /** @see listVersions */
        fun listVersions(
            params: JourneyListVersionsParams
        ): CompletableFuture<HttpResponseFor<JourneyVersionsListResponse>> =
            listVersions(params, RequestOptions.none())

        /** @see listVersions */
        fun listVersions(
            templateId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JourneyVersionsListResponse>> =
            listVersions(templateId, JourneyListVersionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /journeys/{templateId}/publish`, but is otherwise
         * the same as [JourneyServiceAsync.publish].
         */
        fun publish(templateId: String): CompletableFuture<HttpResponseFor<JourneyResponse>> =
            publish(templateId, JourneyPublishParams.none())

        /** @see publish */
        fun publish(
            templateId: String,
            params: JourneyPublishParams = JourneyPublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> =
            publish(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see publish */
        fun publish(
            templateId: String,
            params: JourneyPublishParams = JourneyPublishParams.none(),
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> =
            publish(templateId, params, RequestOptions.none())

        /** @see publish */
        fun publish(
            params: JourneyPublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyResponse>>

        /** @see publish */
        fun publish(
            params: JourneyPublishParams
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> =
            publish(params, RequestOptions.none())

        /** @see publish */
        fun publish(
            templateId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> =
            publish(templateId, JourneyPublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /journeys/{templateId}`, but is otherwise the same
         * as [JourneyServiceAsync.replace].
         */
        fun replace(
            templateId: String,
            params: JourneyReplaceParams,
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> =
            replace(templateId, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            templateId: String,
            params: JourneyReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> =
            replace(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see replace */
        fun replace(
            params: JourneyReplaceParams
        ): CompletableFuture<HttpResponseFor<JourneyResponse>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: JourneyReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JourneyResponse>>
    }
}

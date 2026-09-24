// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.notifications.previews

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.notifications.previews.runs.PreviewRun
import com.courier.models.notifications.previews.runs.PreviewRunDetail
import com.courier.models.notifications.previews.runs.PreviewRunListResponse
import com.courier.models.notifications.previews.runs.RunCreateParams
import com.courier.models.notifications.previews.runs.RunListParams
import com.courier.models.notifications.previews.runs.RunRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Render a template's email content on real email clients and read back the screenshots, so you can
 * check how it looks before you send it.
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
     * Render this template's email content on each of the requested devices.
     *
     * Returns as soon as the run exists and its render is queued — the screenshots are produced
     * asynchronously. Poll `GET /notifications/{id}/previews/runs/{previewRunId}` until every
     * result reaches a terminal status.
     *
     * Name the devices either with `device_set_id`, for a saved set, or with `device_ids`, for a
     * one-off list. Exactly one of the two is required. Inline `device_ids` must be ids listed by
     * `GET /previews/devices`; any other id is a 422, refused before the run exists or is billed.
     *
     * A template that does not exist is a 404. One that exists but cannot be previewed — not a
     * Design Studio template, no email channel, or no such `template_version` — is a 422, also
     * refused before the run exists or is billed.
     *
     * Preview runs are a metered add-on. A workspace without it, or with its billing suspended,
     * receives a 402.
     */
    fun create(id: String, params: RunCreateParams): PreviewRun =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreviewRun = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: RunCreateParams): PreviewRun = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreviewRun

    /**
     * Retrieve one of this template's preview runs together with its per-device results.
     *
     * A run is only readable under the template it previewed: under any other template it is a 404,
     * the same as a run that does not exist.
     *
     * `thumbnail_url` and `screenshot_url` are short-lived signed URLs, re-signed on every read.
     * Fetch them now rather than storing them. Both are null until Courier's own copy of the image
     * exists, which is what `status: COMPLETED` on a result means.
     */
    fun retrieve(previewRunId: String, params: RunRetrieveParams): PreviewRunDetail =
        retrieve(previewRunId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        previewRunId: String,
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreviewRunDetail =
        retrieve(params.toBuilder().previewRunId(previewRunId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams): PreviewRunDetail =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreviewRunDetail

    /**
     * List this template's preview runs, newest first. Cursor-paginated.
     *
     * A template that does not exist is a 404, the same as every other `/notifications/{id}` route.
     */
    fun list(id: String): PreviewRunListResponse = list(id, RunListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreviewRunListResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(id: String, params: RunListParams = RunListParams.none()): PreviewRunListResponse =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RunListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreviewRunListResponse

    /** @see list */
    fun list(params: RunListParams): PreviewRunListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): PreviewRunListResponse =
        list(id, RunListParams.none(), requestOptions)

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /notifications/{id}/previews/runs`, but is
         * otherwise the same as [RunService.create].
         */
        @MustBeClosed
        fun create(id: String, params: RunCreateParams): HttpResponseFor<PreviewRun> =
            create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreviewRun> = create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: RunCreateParams): HttpResponseFor<PreviewRun> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreviewRun>

        /**
         * Returns a raw HTTP response for `get /notifications/{id}/previews/runs/{previewRunId}`,
         * but is otherwise the same as [RunService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            previewRunId: String,
            params: RunRetrieveParams,
        ): HttpResponseFor<PreviewRunDetail> = retrieve(previewRunId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            previewRunId: String,
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreviewRunDetail> =
            retrieve(params.toBuilder().previewRunId(previewRunId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RunRetrieveParams): HttpResponseFor<PreviewRunDetail> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreviewRunDetail>

        /**
         * Returns a raw HTTP response for `get /notifications/{id}/previews/runs`, but is otherwise
         * the same as [RunService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<PreviewRunListResponse> =
            list(id, RunListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreviewRunListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: RunListParams = RunListParams.none(),
        ): HttpResponseFor<PreviewRunListResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RunListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreviewRunListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: RunListParams): HttpResponseFor<PreviewRunListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PreviewRunListResponse> = list(id, RunListParams.none(), requestOptions)
    }
}

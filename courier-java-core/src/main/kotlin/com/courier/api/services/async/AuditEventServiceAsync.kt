// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.AuditEvent
import com.courier.api.models.auditevents.AuditEventListParams
import com.courier.api.models.auditevents.AuditEventListResponse
import com.courier.api.models.auditevents.AuditEventRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AuditEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuditEventServiceAsync

    /** Fetch a specific audit event by ID. */
    fun retrieve(auditEventId: String): CompletableFuture<AuditEvent> =
        retrieve(auditEventId, AuditEventRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        auditEventId: String,
        params: AuditEventRetrieveParams = AuditEventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuditEvent> =
        retrieve(params.toBuilder().auditEventId(auditEventId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        auditEventId: String,
        params: AuditEventRetrieveParams = AuditEventRetrieveParams.none(),
    ): CompletableFuture<AuditEvent> = retrieve(auditEventId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AuditEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuditEvent>

    /** @see retrieve */
    fun retrieve(params: AuditEventRetrieveParams): CompletableFuture<AuditEvent> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        auditEventId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuditEvent> =
        retrieve(auditEventId, AuditEventRetrieveParams.none(), requestOptions)

    /** Fetch the list of audit events */
    fun list(): CompletableFuture<AuditEventListResponse> = list(AuditEventListParams.none())

    /** @see list */
    fun list(
        params: AuditEventListParams = AuditEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuditEventListResponse>

    /** @see list */
    fun list(
        params: AuditEventListParams = AuditEventListParams.none()
    ): CompletableFuture<AuditEventListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AuditEventListResponse> =
        list(AuditEventListParams.none(), requestOptions)

    /**
     * A view of [AuditEventServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuditEventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /audit-events/{audit-event-id}`, but is otherwise
         * the same as [AuditEventServiceAsync.retrieve].
         */
        fun retrieve(auditEventId: String): CompletableFuture<HttpResponseFor<AuditEvent>> =
            retrieve(auditEventId, AuditEventRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            auditEventId: String,
            params: AuditEventRetrieveParams = AuditEventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuditEvent>> =
            retrieve(params.toBuilder().auditEventId(auditEventId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            auditEventId: String,
            params: AuditEventRetrieveParams = AuditEventRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AuditEvent>> =
            retrieve(auditEventId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AuditEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuditEvent>>

        /** @see retrieve */
        fun retrieve(
            params: AuditEventRetrieveParams
        ): CompletableFuture<HttpResponseFor<AuditEvent>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            auditEventId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuditEvent>> =
            retrieve(auditEventId, AuditEventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /audit-events`, but is otherwise the same as
         * [AuditEventServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AuditEventListResponse>> =
            list(AuditEventListParams.none())

        /** @see list */
        fun list(
            params: AuditEventListParams = AuditEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuditEventListResponse>>

        /** @see list */
        fun list(
            params: AuditEventListParams = AuditEventListParams.none()
        ): CompletableFuture<HttpResponseFor<AuditEventListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AuditEventListResponse>> =
            list(AuditEventListParams.none(), requestOptions)
    }
}

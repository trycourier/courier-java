// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.auditevents.AuditEvent
import com.courier.models.auditevents.AuditEventListParams
import com.courier.models.auditevents.AuditEventListResponse
import com.courier.models.auditevents.AuditEventRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface AuditEventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuditEventService

    /** Fetch a specific audit event by ID. */
    fun retrieve(auditEventId: String): AuditEvent =
        retrieve(auditEventId, AuditEventRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        auditEventId: String,
        params: AuditEventRetrieveParams = AuditEventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuditEvent = retrieve(params.toBuilder().auditEventId(auditEventId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        auditEventId: String,
        params: AuditEventRetrieveParams = AuditEventRetrieveParams.none(),
    ): AuditEvent = retrieve(auditEventId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AuditEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuditEvent

    /** @see retrieve */
    fun retrieve(params: AuditEventRetrieveParams): AuditEvent =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(auditEventId: String, requestOptions: RequestOptions): AuditEvent =
        retrieve(auditEventId, AuditEventRetrieveParams.none(), requestOptions)

    /** Fetch the list of audit events */
    fun list(): AuditEventListResponse = list(AuditEventListParams.none())

    /** @see list */
    fun list(
        params: AuditEventListParams = AuditEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuditEventListResponse

    /** @see list */
    fun list(params: AuditEventListParams = AuditEventListParams.none()): AuditEventListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AuditEventListResponse =
        list(AuditEventListParams.none(), requestOptions)

    /** A view of [AuditEventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuditEventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /audit-events/{audit-event-id}`, but is otherwise
         * the same as [AuditEventService.retrieve].
         */
        @MustBeClosed
        fun retrieve(auditEventId: String): HttpResponseFor<AuditEvent> =
            retrieve(auditEventId, AuditEventRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            auditEventId: String,
            params: AuditEventRetrieveParams = AuditEventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuditEvent> =
            retrieve(params.toBuilder().auditEventId(auditEventId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            auditEventId: String,
            params: AuditEventRetrieveParams = AuditEventRetrieveParams.none(),
        ): HttpResponseFor<AuditEvent> = retrieve(auditEventId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AuditEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuditEvent>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AuditEventRetrieveParams): HttpResponseFor<AuditEvent> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            auditEventId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuditEvent> =
            retrieve(auditEventId, AuditEventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /audit-events`, but is otherwise the same as
         * [AuditEventService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AuditEventListResponse> = list(AuditEventListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuditEventListParams = AuditEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuditEventListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuditEventListParams = AuditEventListParams.none()
        ): HttpResponseFor<AuditEventListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AuditEventListResponse> =
            list(AuditEventListParams.none(), requestOptions)
    }
}

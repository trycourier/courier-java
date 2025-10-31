// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.notifications

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.notifications.checks.CheckDeleteParams
import com.courier.models.notifications.checks.CheckListParams
import com.courier.models.notifications.checks.CheckListResponse
import com.courier.models.notifications.checks.CheckUpdateParams
import com.courier.models.notifications.checks.CheckUpdateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface CheckService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckService

    fun update(submissionId: String, params: CheckUpdateParams): CheckUpdateResponse =
        update(submissionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        submissionId: String,
        params: CheckUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckUpdateResponse =
        update(params.toBuilder().submissionId(submissionId).build(), requestOptions)

    /** @see update */
    fun update(params: CheckUpdateParams): CheckUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CheckUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckUpdateResponse

    fun list(submissionId: String, params: CheckListParams): CheckListResponse =
        list(submissionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        submissionId: String,
        params: CheckListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckListResponse =
        list(params.toBuilder().submissionId(submissionId).build(), requestOptions)

    /** @see list */
    fun list(params: CheckListParams): CheckListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CheckListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckListResponse

    fun delete(submissionId: String, params: CheckDeleteParams) =
        delete(submissionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        submissionId: String,
        params: CheckDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().submissionId(submissionId).build(), requestOptions)

    /** @see delete */
    fun delete(params: CheckDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: CheckDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [CheckService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /notifications/{id}/{submissionId}/checks`, but is
         * otherwise the same as [CheckService.update].
         */
        @MustBeClosed
        fun update(
            submissionId: String,
            params: CheckUpdateParams,
        ): HttpResponseFor<CheckUpdateResponse> =
            update(submissionId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            submissionId: String,
            params: CheckUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckUpdateResponse> =
            update(params.toBuilder().submissionId(submissionId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CheckUpdateParams): HttpResponseFor<CheckUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CheckUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /notifications/{id}/{submissionId}/checks`, but is
         * otherwise the same as [CheckService.list].
         */
        @MustBeClosed
        fun list(
            submissionId: String,
            params: CheckListParams,
        ): HttpResponseFor<CheckListResponse> = list(submissionId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            submissionId: String,
            params: CheckListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckListResponse> =
            list(params.toBuilder().submissionId(submissionId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: CheckListParams): HttpResponseFor<CheckListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CheckListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckListResponse>

        /**
         * Returns a raw HTTP response for `delete /notifications/{id}/{submissionId}/checks`, but
         * is otherwise the same as [CheckService.delete].
         */
        @MustBeClosed
        fun delete(submissionId: String, params: CheckDeleteParams): HttpResponse =
            delete(submissionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            submissionId: String,
            params: CheckDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().submissionId(submissionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: CheckDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CheckDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}

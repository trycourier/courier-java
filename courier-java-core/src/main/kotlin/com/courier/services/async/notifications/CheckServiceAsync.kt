// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.notifications

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.notifications.checks.CheckDeleteParams
import com.courier.models.notifications.checks.CheckListParams
import com.courier.models.notifications.checks.CheckListResponse
import com.courier.models.notifications.checks.CheckUpdateParams
import com.courier.models.notifications.checks.CheckUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CheckServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckServiceAsync

    fun update(
        submissionId: String,
        params: CheckUpdateParams,
    ): CompletableFuture<CheckUpdateResponse> = update(submissionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        submissionId: String,
        params: CheckUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckUpdateResponse> =
        update(params.toBuilder().submissionId(submissionId).build(), requestOptions)

    /** @see update */
    fun update(params: CheckUpdateParams): CompletableFuture<CheckUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CheckUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckUpdateResponse>

    fun list(submissionId: String, params: CheckListParams): CompletableFuture<CheckListResponse> =
        list(submissionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        submissionId: String,
        params: CheckListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckListResponse> =
        list(params.toBuilder().submissionId(submissionId).build(), requestOptions)

    /** @see list */
    fun list(params: CheckListParams): CompletableFuture<CheckListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CheckListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckListResponse>

    fun delete(submissionId: String, params: CheckDeleteParams): CompletableFuture<Void?> =
        delete(submissionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        submissionId: String,
        params: CheckDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().submissionId(submissionId).build(), requestOptions)

    /** @see delete */
    fun delete(params: CheckDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CheckDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [CheckServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CheckServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /notifications/{id}/{submissionId}/checks`, but is
         * otherwise the same as [CheckServiceAsync.update].
         */
        fun update(
            submissionId: String,
            params: CheckUpdateParams,
        ): CompletableFuture<HttpResponseFor<CheckUpdateResponse>> =
            update(submissionId, params, RequestOptions.none())

        /** @see update */
        fun update(
            submissionId: String,
            params: CheckUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckUpdateResponse>> =
            update(params.toBuilder().submissionId(submissionId).build(), requestOptions)

        /** @see update */
        fun update(
            params: CheckUpdateParams
        ): CompletableFuture<HttpResponseFor<CheckUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CheckUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /notifications/{id}/{submissionId}/checks`, but is
         * otherwise the same as [CheckServiceAsync.list].
         */
        fun list(
            submissionId: String,
            params: CheckListParams,
        ): CompletableFuture<HttpResponseFor<CheckListResponse>> =
            list(submissionId, params, RequestOptions.none())

        /** @see list */
        fun list(
            submissionId: String,
            params: CheckListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckListResponse>> =
            list(params.toBuilder().submissionId(submissionId).build(), requestOptions)

        /** @see list */
        fun list(params: CheckListParams): CompletableFuture<HttpResponseFor<CheckListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: CheckListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckListResponse>>

        /**
         * Returns a raw HTTP response for `delete /notifications/{id}/{submissionId}/checks`, but
         * is otherwise the same as [CheckServiceAsync.delete].
         */
        fun delete(
            submissionId: String,
            params: CheckDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(submissionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            submissionId: String,
            params: CheckDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().submissionId(submissionId).build(), requestOptions)

        /** @see delete */
        fun delete(params: CheckDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CheckDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}

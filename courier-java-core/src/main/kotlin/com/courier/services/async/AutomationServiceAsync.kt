// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.automations.AutomationListParams
import com.courier.models.automations.AutomationTemplateListResponse
import com.courier.services.async.automations.InvokeServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Invoke a stored automation template or an ad hoc automation defined in the request. */
interface AutomationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutomationServiceAsync

    /** Invoke a stored automation template or an ad hoc automation defined in the request. */
    fun invoke(): InvokeServiceAsync

    /**
     * Lists the workspace's saved automation templates, each with its id and a cursor for paging to
     * the next page of results.
     */
    fun list(): CompletableFuture<AutomationTemplateListResponse> =
        list(AutomationListParams.none())

    /** @see list */
    fun list(
        params: AutomationListParams = AutomationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AutomationTemplateListResponse>

    /** @see list */
    fun list(
        params: AutomationListParams = AutomationListParams.none()
    ): CompletableFuture<AutomationTemplateListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AutomationTemplateListResponse> =
        list(AutomationListParams.none(), requestOptions)

    /**
     * A view of [AutomationServiceAsync] that provides access to raw HTTP responses for each
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
        ): AutomationServiceAsync.WithRawResponse

        /** Invoke a stored automation template or an ad hoc automation defined in the request. */
        fun invoke(): InvokeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /automations`, but is otherwise the same as
         * [AutomationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AutomationTemplateListResponse>> =
            list(AutomationListParams.none())

        /** @see list */
        fun list(
            params: AutomationListParams = AutomationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AutomationTemplateListResponse>>

        /** @see list */
        fun list(
            params: AutomationListParams = AutomationListParams.none()
        ): CompletableFuture<HttpResponseFor<AutomationTemplateListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AutomationTemplateListResponse>> =
            list(AutomationListParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.providers

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.providers.catalog.CatalogListParams
import com.courier.models.providers.catalog.CatalogListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CatalogServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CatalogServiceAsync

    /**
     * Returns the catalog of available provider types with their display names, descriptions, and
     * configuration schema fields (snake_case, with `type` and `required`). Providers with no
     * configurable schema return only `provider`, `name`, and `description`.
     */
    fun list(): CompletableFuture<CatalogListResponse> = list(CatalogListParams.none())

    /** @see list */
    fun list(
        params: CatalogListParams = CatalogListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CatalogListResponse>

    /** @see list */
    fun list(
        params: CatalogListParams = CatalogListParams.none()
    ): CompletableFuture<CatalogListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CatalogListResponse> =
        list(CatalogListParams.none(), requestOptions)

    /**
     * A view of [CatalogServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CatalogServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /providers/catalog`, but is otherwise the same as
         * [CatalogServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CatalogListResponse>> =
            list(CatalogListParams.none())

        /** @see list */
        fun list(
            params: CatalogListParams = CatalogListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CatalogListResponse>>

        /** @see list */
        fun list(
            params: CatalogListParams = CatalogListParams.none()
        ): CompletableFuture<HttpResponseFor<CatalogListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CatalogListResponse>> =
            list(CatalogListParams.none(), requestOptions)
    }
}

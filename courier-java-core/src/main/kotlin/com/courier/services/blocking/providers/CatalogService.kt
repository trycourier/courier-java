// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.providers

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.providers.catalog.CatalogListParams
import com.courier.models.providers.catalog.CatalogListResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface CatalogService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CatalogService

    /**
     * Returns the catalog of available provider types with their display names, descriptions, and
     * configuration schema fields (snake_case, with `type` and `required`). Providers with no
     * configurable schema return only `provider`, `name`, and `description`.
     */
    fun list(): CatalogListResponse = list(CatalogListParams.none())

    /** @see list */
    fun list(
        params: CatalogListParams = CatalogListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CatalogListResponse

    /** @see list */
    fun list(params: CatalogListParams = CatalogListParams.none()): CatalogListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CatalogListResponse =
        list(CatalogListParams.none(), requestOptions)

    /** A view of [CatalogService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CatalogService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /providers/catalog`, but is otherwise the same as
         * [CatalogService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CatalogListResponse> = list(CatalogListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CatalogListParams = CatalogListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CatalogListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CatalogListParams = CatalogListParams.none()
        ): HttpResponseFor<CatalogListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CatalogListResponse> =
            list(CatalogListParams.none(), requestOptions)
    }
}

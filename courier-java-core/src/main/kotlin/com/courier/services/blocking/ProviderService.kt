// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.providers.Provider
import com.courier.models.providers.ProviderCreateParams
import com.courier.models.providers.ProviderDeleteParams
import com.courier.models.providers.ProviderListParams
import com.courier.models.providers.ProviderListResponse
import com.courier.models.providers.ProviderRetrieveParams
import com.courier.models.providers.ProviderUpdateParams
import com.courier.services.blocking.providers.CatalogService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Configure the channel providers Courier delivers through, and browse the provider types it
 * supports.
 */
interface ProviderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProviderService

    /**
     * Configure the channel providers Courier delivers through, and browse the provider types it
     * supports.
     */
    fun catalog(): CatalogService

    /**
     * Configures a provider integration from a Courier provider key and its settings. Check the
     * catalog endpoint for the schema each provider expects.
     */
    fun create(params: ProviderCreateParams): Provider = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProviderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Provider

    /**
     * Returns one configured provider by id, including its channel, provider key, alias, title, and
     * current settings.
     */
    fun retrieve(id: String): Provider = retrieve(id, ProviderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProviderRetrieveParams = ProviderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Provider = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProviderRetrieveParams = ProviderRetrieveParams.none(),
    ): Provider = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProviderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Provider

    /** @see retrieve */
    fun retrieve(params: ProviderRetrieveParams): Provider = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Provider =
        retrieve(id, ProviderRetrieveParams.none(), requestOptions)

    /**
     * Replaces a provider's configuration in full, clearing any field you omit rather than merging
     * it. Send the complete settings object.
     */
    fun update(id: String, params: ProviderUpdateParams): Provider =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: ProviderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Provider = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: ProviderUpdateParams): Provider = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ProviderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Provider

    /**
     * Lists the provider integrations configured in the workspace, one entry per channel and
     * provider key with its alias and settings.
     */
    fun list(): ProviderListResponse = list(ProviderListParams.none())

    /** @see list */
    fun list(
        params: ProviderListParams = ProviderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProviderListResponse

    /** @see list */
    fun list(params: ProviderListParams = ProviderListParams.none()): ProviderListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ProviderListResponse =
        list(ProviderListParams.none(), requestOptions)

    /**
     * Deletes a provider configuration, which fails while routing strategies or templates still
     * reference it. Update those references first.
     */
    fun delete(id: String) = delete(id, ProviderDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ProviderDeleteParams = ProviderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: ProviderDeleteParams = ProviderDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ProviderDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ProviderDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, ProviderDeleteParams.none(), requestOptions)

    /** A view of [ProviderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProviderService.WithRawResponse

        /**
         * Configure the channel providers Courier delivers through, and browse the provider types
         * it supports.
         */
        fun catalog(): CatalogService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /providers`, but is otherwise the same as
         * [ProviderService.create].
         */
        @MustBeClosed
        fun create(params: ProviderCreateParams): HttpResponseFor<Provider> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ProviderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Provider>

        /**
         * Returns a raw HTTP response for `get /providers/{id}`, but is otherwise the same as
         * [ProviderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<Provider> =
            retrieve(id, ProviderRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ProviderRetrieveParams = ProviderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Provider> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ProviderRetrieveParams = ProviderRetrieveParams.none(),
        ): HttpResponseFor<Provider> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ProviderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Provider>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ProviderRetrieveParams): HttpResponseFor<Provider> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Provider> =
            retrieve(id, ProviderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /providers/{id}`, but is otherwise the same as
         * [ProviderService.update].
         */
        @MustBeClosed
        fun update(id: String, params: ProviderUpdateParams): HttpResponseFor<Provider> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: ProviderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Provider> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ProviderUpdateParams): HttpResponseFor<Provider> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ProviderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Provider>

        /**
         * Returns a raw HTTP response for `get /providers`, but is otherwise the same as
         * [ProviderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ProviderListResponse> = list(ProviderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProviderListParams = ProviderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProviderListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProviderListParams = ProviderListParams.none()
        ): HttpResponseFor<ProviderListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProviderListResponse> =
            list(ProviderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /providers/{id}`, but is otherwise the same as
         * [ProviderService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, ProviderDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ProviderDeleteParams = ProviderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ProviderDeleteParams = ProviderDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ProviderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ProviderDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, ProviderDeleteParams.none(), requestOptions)
    }
}

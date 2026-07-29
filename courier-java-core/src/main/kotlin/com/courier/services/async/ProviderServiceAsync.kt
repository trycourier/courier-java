// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

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
import com.courier.services.async.providers.CatalogServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Configure the channel providers Courier delivers through, and browse the provider types it
 * supports.
 */
interface ProviderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProviderServiceAsync

    /**
     * Configure the channel providers Courier delivers through, and browse the provider types it
     * supports.
     */
    fun catalog(): CatalogServiceAsync

    /**
     * Configures a provider integration from a Courier provider key and its settings. Check the
     * catalog endpoint for the schema each provider expects.
     */
    fun create(params: ProviderCreateParams): CompletableFuture<Provider> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProviderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Provider>

    /**
     * Returns one configured provider by id, including its channel, provider key, alias, title, and
     * current settings.
     */
    fun retrieve(id: String): CompletableFuture<Provider> =
        retrieve(id, ProviderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProviderRetrieveParams = ProviderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Provider> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProviderRetrieveParams = ProviderRetrieveParams.none(),
    ): CompletableFuture<Provider> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProviderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Provider>

    /** @see retrieve */
    fun retrieve(params: ProviderRetrieveParams): CompletableFuture<Provider> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Provider> =
        retrieve(id, ProviderRetrieveParams.none(), requestOptions)

    /**
     * Replaces a provider's configuration in full, clearing any field you omit rather than merging
     * it. Send the complete settings object.
     */
    fun update(id: String, params: ProviderUpdateParams): CompletableFuture<Provider> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: ProviderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Provider> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: ProviderUpdateParams): CompletableFuture<Provider> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ProviderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Provider>

    /**
     * Lists the provider integrations configured in the workspace, one entry per channel and
     * provider key with its alias and settings.
     */
    fun list(): CompletableFuture<ProviderListResponse> = list(ProviderListParams.none())

    /** @see list */
    fun list(
        params: ProviderListParams = ProviderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProviderListResponse>

    /** @see list */
    fun list(
        params: ProviderListParams = ProviderListParams.none()
    ): CompletableFuture<ProviderListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProviderListResponse> =
        list(ProviderListParams.none(), requestOptions)

    /**
     * Deletes a provider configuration, which fails while routing strategies or templates still
     * reference it. Update those references first.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, ProviderDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ProviderDeleteParams = ProviderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ProviderDeleteParams = ProviderDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ProviderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ProviderDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, ProviderDeleteParams.none(), requestOptions)

    /**
     * A view of [ProviderServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProviderServiceAsync.WithRawResponse

        /**
         * Configure the channel providers Courier delivers through, and browse the provider types
         * it supports.
         */
        fun catalog(): CatalogServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /providers`, but is otherwise the same as
         * [ProviderServiceAsync.create].
         */
        fun create(params: ProviderCreateParams): CompletableFuture<HttpResponseFor<Provider>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ProviderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Provider>>

        /**
         * Returns a raw HTTP response for `get /providers/{id}`, but is otherwise the same as
         * [ProviderServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Provider>> =
            retrieve(id, ProviderRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ProviderRetrieveParams = ProviderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Provider>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ProviderRetrieveParams = ProviderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Provider>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ProviderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Provider>>

        /** @see retrieve */
        fun retrieve(params: ProviderRetrieveParams): CompletableFuture<HttpResponseFor<Provider>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Provider>> =
            retrieve(id, ProviderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /providers/{id}`, but is otherwise the same as
         * [ProviderServiceAsync.update].
         */
        fun update(
            id: String,
            params: ProviderUpdateParams,
        ): CompletableFuture<HttpResponseFor<Provider>> = update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: ProviderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Provider>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(params: ProviderUpdateParams): CompletableFuture<HttpResponseFor<Provider>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ProviderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Provider>>

        /**
         * Returns a raw HTTP response for `get /providers`, but is otherwise the same as
         * [ProviderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ProviderListResponse>> =
            list(ProviderListParams.none())

        /** @see list */
        fun list(
            params: ProviderListParams = ProviderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProviderListResponse>>

        /** @see list */
        fun list(
            params: ProviderListParams = ProviderListParams.none()
        ): CompletableFuture<HttpResponseFor<ProviderListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProviderListResponse>> =
            list(ProviderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /providers/{id}`, but is otherwise the same as
         * [ProviderServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, ProviderDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: ProviderDeleteParams = ProviderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: ProviderDeleteParams = ProviderDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ProviderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ProviderDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, ProviderDeleteParams.none(), requestOptions)
    }
}

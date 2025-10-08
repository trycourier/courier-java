// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponse
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.Brand
import com.courier.api.models.brands.BrandCreateParams
import com.courier.api.models.brands.BrandDeleteParams
import com.courier.api.models.brands.BrandListParams
import com.courier.api.models.brands.BrandListResponse
import com.courier.api.models.brands.BrandRetrieveParams
import com.courier.api.models.brands.BrandUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BrandServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandServiceAsync

    /** Create a new brand */
    fun create(params: BrandCreateParams): CompletableFuture<Brand> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BrandCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Brand>

    /** Fetch a specific brand by brand ID. */
    fun retrieve(brandId: String): CompletableFuture<Brand> =
        retrieve(brandId, BrandRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        brandId: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Brand> =
        retrieve(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        brandId: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
    ): CompletableFuture<Brand> = retrieve(brandId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Brand>

    /** @see retrieve */
    fun retrieve(params: BrandRetrieveParams): CompletableFuture<Brand> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(brandId: String, requestOptions: RequestOptions): CompletableFuture<Brand> =
        retrieve(brandId, BrandRetrieveParams.none(), requestOptions)

    /** Replace an existing brand with the supplied values. */
    fun update(brandId: String, params: BrandUpdateParams): CompletableFuture<Brand> =
        update(brandId, params, RequestOptions.none())

    /** @see update */
    fun update(
        brandId: String,
        params: BrandUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Brand> =
        update(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see update */
    fun update(params: BrandUpdateParams): CompletableFuture<Brand> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BrandUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Brand>

    /** Get the list of brands. */
    fun list(): CompletableFuture<BrandListResponse> = list(BrandListParams.none())

    /** @see list */
    fun list(
        params: BrandListParams = BrandListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandListResponse>

    /** @see list */
    fun list(
        params: BrandListParams = BrandListParams.none()
    ): CompletableFuture<BrandListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BrandListResponse> =
        list(BrandListParams.none(), requestOptions)

    /** Delete a brand by brand ID. */
    fun delete(brandId: String): CompletableFuture<Void?> =
        delete(brandId, BrandDeleteParams.none())

    /** @see delete */
    fun delete(
        brandId: String,
        params: BrandDeleteParams = BrandDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see delete */
    fun delete(
        brandId: String,
        params: BrandDeleteParams = BrandDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(brandId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BrandDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: BrandDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(brandId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(brandId, BrandDeleteParams.none(), requestOptions)

    /** A view of [BrandServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /brands`, but is otherwise the same as
         * [BrandServiceAsync.create].
         */
        fun create(params: BrandCreateParams): CompletableFuture<HttpResponseFor<Brand>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BrandCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Brand>>

        /**
         * Returns a raw HTTP response for `get /brands/{brand_id}`, but is otherwise the same as
         * [BrandServiceAsync.retrieve].
         */
        fun retrieve(brandId: String): CompletableFuture<HttpResponseFor<Brand>> =
            retrieve(brandId, BrandRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            brandId: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Brand>> =
            retrieve(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            brandId: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Brand>> =
            retrieve(brandId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Brand>>

        /** @see retrieve */
        fun retrieve(params: BrandRetrieveParams): CompletableFuture<HttpResponseFor<Brand>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            brandId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Brand>> =
            retrieve(brandId, BrandRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /brands/{brand_id}`, but is otherwise the same as
         * [BrandServiceAsync.update].
         */
        fun update(
            brandId: String,
            params: BrandUpdateParams,
        ): CompletableFuture<HttpResponseFor<Brand>> =
            update(brandId, params, RequestOptions.none())

        /** @see update */
        fun update(
            brandId: String,
            params: BrandUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Brand>> =
            update(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see update */
        fun update(params: BrandUpdateParams): CompletableFuture<HttpResponseFor<Brand>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BrandUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Brand>>

        /**
         * Returns a raw HTTP response for `get /brands`, but is otherwise the same as
         * [BrandServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BrandListResponse>> =
            list(BrandListParams.none())

        /** @see list */
        fun list(
            params: BrandListParams = BrandListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandListResponse>>

        /** @see list */
        fun list(
            params: BrandListParams = BrandListParams.none()
        ): CompletableFuture<HttpResponseFor<BrandListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BrandListResponse>> =
            list(BrandListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /brands/{brand_id}`, but is otherwise the same as
         * [BrandServiceAsync.delete].
         */
        fun delete(brandId: String): CompletableFuture<HttpResponse> =
            delete(brandId, BrandDeleteParams.none())

        /** @see delete */
        fun delete(
            brandId: String,
            params: BrandDeleteParams = BrandDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see delete */
        fun delete(
            brandId: String,
            params: BrandDeleteParams = BrandDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(brandId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BrandDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: BrandDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            brandId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(brandId, BrandDeleteParams.none(), requestOptions)
    }
}

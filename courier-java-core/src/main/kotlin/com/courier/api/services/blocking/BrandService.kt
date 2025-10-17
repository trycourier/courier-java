// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponse
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.brands.Brand
import com.courier.api.models.brands.BrandCreateParams
import com.courier.api.models.brands.BrandDeleteParams
import com.courier.api.models.brands.BrandListParams
import com.courier.api.models.brands.BrandListResponse
import com.courier.api.models.brands.BrandRetrieveParams
import com.courier.api.models.brands.BrandUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface BrandService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService

    /** Create a new brand */
    fun create(params: BrandCreateParams): Brand = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BrandCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Brand

    /** Fetch a specific brand by brand ID. */
    fun retrieve(brandId: String): Brand = retrieve(brandId, BrandRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        brandId: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Brand = retrieve(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(brandId: String, params: BrandRetrieveParams = BrandRetrieveParams.none()): Brand =
        retrieve(brandId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Brand

    /** @see retrieve */
    fun retrieve(params: BrandRetrieveParams): Brand = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(brandId: String, requestOptions: RequestOptions): Brand =
        retrieve(brandId, BrandRetrieveParams.none(), requestOptions)

    /** Replace an existing brand with the supplied values. */
    fun update(brandId: String, params: BrandUpdateParams): Brand =
        update(brandId, params, RequestOptions.none())

    /** @see update */
    fun update(
        brandId: String,
        params: BrandUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Brand = update(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see update */
    fun update(params: BrandUpdateParams): Brand = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BrandUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Brand

    /** Get the list of brands. */
    fun list(): BrandListResponse = list(BrandListParams.none())

    /** @see list */
    fun list(
        params: BrandListParams = BrandListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandListResponse

    /** @see list */
    fun list(params: BrandListParams = BrandListParams.none()): BrandListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BrandListResponse =
        list(BrandListParams.none(), requestOptions)

    /** Delete a brand by brand ID. */
    fun delete(brandId: String) = delete(brandId, BrandDeleteParams.none())

    /** @see delete */
    fun delete(
        brandId: String,
        params: BrandDeleteParams = BrandDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see delete */
    fun delete(brandId: String, params: BrandDeleteParams = BrandDeleteParams.none()) =
        delete(brandId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: BrandDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: BrandDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(brandId: String, requestOptions: RequestOptions) =
        delete(brandId, BrandDeleteParams.none(), requestOptions)

    /** A view of [BrandService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /brands`, but is otherwise the same as
         * [BrandService.create].
         */
        @MustBeClosed
        fun create(params: BrandCreateParams): HttpResponseFor<Brand> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BrandCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Brand>

        /**
         * Returns a raw HTTP response for `get /brands/{brand_id}`, but is otherwise the same as
         * [BrandService.retrieve].
         */
        @MustBeClosed
        fun retrieve(brandId: String): HttpResponseFor<Brand> =
            retrieve(brandId, BrandRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            brandId: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Brand> =
            retrieve(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            brandId: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
        ): HttpResponseFor<Brand> = retrieve(brandId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Brand>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BrandRetrieveParams): HttpResponseFor<Brand> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(brandId: String, requestOptions: RequestOptions): HttpResponseFor<Brand> =
            retrieve(brandId, BrandRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /brands/{brand_id}`, but is otherwise the same as
         * [BrandService.update].
         */
        @MustBeClosed
        fun update(brandId: String, params: BrandUpdateParams): HttpResponseFor<Brand> =
            update(brandId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            brandId: String,
            params: BrandUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Brand> =
            update(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: BrandUpdateParams): HttpResponseFor<Brand> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BrandUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Brand>

        /**
         * Returns a raw HTTP response for `get /brands`, but is otherwise the same as
         * [BrandService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<BrandListResponse> = list(BrandListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BrandListParams = BrandListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BrandListParams = BrandListParams.none()
        ): HttpResponseFor<BrandListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BrandListResponse> =
            list(BrandListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /brands/{brand_id}`, but is otherwise the same as
         * [BrandService.delete].
         */
        @MustBeClosed
        fun delete(brandId: String): HttpResponse = delete(brandId, BrandDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            brandId: String,
            params: BrandDeleteParams = BrandDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            brandId: String,
            params: BrandDeleteParams = BrandDeleteParams.none(),
        ): HttpResponse = delete(brandId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BrandDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: BrandDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(brandId: String, requestOptions: RequestOptions): HttpResponse =
            delete(brandId, BrandDeleteParams.none(), requestOptions)
    }
}

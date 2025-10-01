// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponse
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.translations.TranslationRetrieveParams
import com.courier.api.models.translations.TranslationUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface TranslationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TranslationService

    /** Get translations by locale */
    fun retrieve(locale: String, params: TranslationRetrieveParams): String =
        retrieve(locale, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        locale: String,
        params: TranslationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String = retrieve(params.toBuilder().locale(locale).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TranslationRetrieveParams): String =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TranslationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** Update a translation */
    fun update(locale: String, params: TranslationUpdateParams) =
        update(locale, params, RequestOptions.none())

    /** @see update */
    fun update(
        locale: String,
        params: TranslationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().locale(locale).build(), requestOptions)

    /** @see update */
    fun update(params: TranslationUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TranslationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [TranslationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TranslationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /translations/{domain}/{locale}`, but is otherwise
         * the same as [TranslationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(locale: String, params: TranslationRetrieveParams): HttpResponseFor<String> =
            retrieve(locale, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            locale: String,
            params: TranslationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String> =
            retrieve(params.toBuilder().locale(locale).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TranslationRetrieveParams): HttpResponseFor<String> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TranslationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `put /translations/{domain}/{locale}`, but is otherwise
         * the same as [TranslationService.update].
         */
        @MustBeClosed
        fun update(locale: String, params: TranslationUpdateParams): HttpResponse =
            update(locale, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            locale: String,
            params: TranslationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().locale(locale).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TranslationUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TranslationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponse
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.translations.TranslationRetrieveParams
import com.courier.api.models.translations.TranslationUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TranslationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TranslationServiceAsync

    /** Get translations by locale */
    fun retrieve(locale: String, params: TranslationRetrieveParams): CompletableFuture<String> =
        retrieve(locale, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        locale: String,
        params: TranslationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String> =
        retrieve(params.toBuilder().locale(locale).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TranslationRetrieveParams): CompletableFuture<String> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TranslationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** Update a translation */
    fun update(locale: String, params: TranslationUpdateParams): CompletableFuture<Void?> =
        update(locale, params, RequestOptions.none())

    /** @see update */
    fun update(
        locale: String,
        params: TranslationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().locale(locale).build(), requestOptions)

    /** @see update */
    fun update(params: TranslationUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TranslationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [TranslationServiceAsync] that provides access to raw HTTP responses for each
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
        ): TranslationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /translations/{domain}/{locale}`, but is otherwise
         * the same as [TranslationServiceAsync.retrieve].
         */
        fun retrieve(
            locale: String,
            params: TranslationRetrieveParams,
        ): CompletableFuture<HttpResponseFor<String>> =
            retrieve(locale, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            locale: String,
            params: TranslationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            retrieve(params.toBuilder().locale(locale).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: TranslationRetrieveParams
        ): CompletableFuture<HttpResponseFor<String>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TranslationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `put /translations/{domain}/{locale}`, but is otherwise
         * the same as [TranslationServiceAsync.update].
         */
        fun update(
            locale: String,
            params: TranslationUpdateParams,
        ): CompletableFuture<HttpResponse> = update(locale, params, RequestOptions.none())

        /** @see update */
        fun update(
            locale: String,
            params: TranslationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().locale(locale).build(), requestOptions)

        /** @see update */
        fun update(params: TranslationUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TranslationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}

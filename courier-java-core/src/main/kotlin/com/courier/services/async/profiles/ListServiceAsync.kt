// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.profiles

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.profiles.lists.ListDeleteParams
import com.courier.models.profiles.lists.ListDeleteResponse
import com.courier.models.profiles.lists.ListRetrieveParams
import com.courier.models.profiles.lists.ListRetrieveResponse
import com.courier.models.profiles.lists.ListSubscribeParams
import com.courier.models.profiles.lists.ListSubscribeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ListServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListServiceAsync

    /** Returns the subscribed lists for a specified user. */
    fun retrieve(userId: String): CompletableFuture<ListRetrieveResponse> =
        retrieve(userId, ListRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: ListRetrieveParams = ListRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListRetrieveResponse> =
        retrieve(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: ListRetrieveParams = ListRetrieveParams.none(),
    ): CompletableFuture<ListRetrieveResponse> = retrieve(userId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ListRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ListRetrieveParams): CompletableFuture<ListRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        userId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListRetrieveResponse> =
        retrieve(userId, ListRetrieveParams.none(), requestOptions)

    /** Removes all list subscriptions for given user. */
    fun delete(userId: String): CompletableFuture<ListDeleteResponse> =
        delete(userId, ListDeleteParams.none())

    /** @see delete */
    fun delete(
        userId: String,
        params: ListDeleteParams = ListDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListDeleteResponse> =
        delete(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see delete */
    fun delete(
        userId: String,
        params: ListDeleteParams = ListDeleteParams.none(),
    ): CompletableFuture<ListDeleteResponse> = delete(userId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ListDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListDeleteResponse>

    /** @see delete */
    fun delete(params: ListDeleteParams): CompletableFuture<ListDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        userId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ListDeleteResponse> =
        delete(userId, ListDeleteParams.none(), requestOptions)

    /**
     * Subscribes the given user to one or more lists. If the list does not exist, it will be
     * created.
     */
    fun subscribe(
        userId: String,
        params: ListSubscribeParams,
    ): CompletableFuture<ListSubscribeResponse> = subscribe(userId, params, RequestOptions.none())

    /** @see subscribe */
    fun subscribe(
        userId: String,
        params: ListSubscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListSubscribeResponse> =
        subscribe(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see subscribe */
    fun subscribe(params: ListSubscribeParams): CompletableFuture<ListSubscribeResponse> =
        subscribe(params, RequestOptions.none())

    /** @see subscribe */
    fun subscribe(
        params: ListSubscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListSubscribeResponse>

    /** A view of [ListServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /profiles/{user_id}/lists`, but is otherwise the
         * same as [ListServiceAsync.retrieve].
         */
        fun retrieve(userId: String): CompletableFuture<HttpResponseFor<ListRetrieveResponse>> =
            retrieve(userId, ListRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            userId: String,
            params: ListRetrieveParams = ListRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListRetrieveResponse>> =
            retrieve(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            userId: String,
            params: ListRetrieveParams = ListRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ListRetrieveResponse>> =
            retrieve(userId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ListRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ListRetrieveParams
        ): CompletableFuture<HttpResponseFor<ListRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListRetrieveResponse>> =
            retrieve(userId, ListRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /profiles/{user_id}/lists`, but is otherwise the
         * same as [ListServiceAsync.delete].
         */
        fun delete(userId: String): CompletableFuture<HttpResponseFor<ListDeleteResponse>> =
            delete(userId, ListDeleteParams.none())

        /** @see delete */
        fun delete(
            userId: String,
            params: ListDeleteParams = ListDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListDeleteResponse>> =
            delete(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see delete */
        fun delete(
            userId: String,
            params: ListDeleteParams = ListDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ListDeleteResponse>> =
            delete(userId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ListDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ListDeleteParams
        ): CompletableFuture<HttpResponseFor<ListDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ListDeleteResponse>> =
            delete(userId, ListDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /profiles/{user_id}/lists`, but is otherwise the
         * same as [ListServiceAsync.subscribe].
         */
        fun subscribe(
            userId: String,
            params: ListSubscribeParams,
        ): CompletableFuture<HttpResponseFor<ListSubscribeResponse>> =
            subscribe(userId, params, RequestOptions.none())

        /** @see subscribe */
        fun subscribe(
            userId: String,
            params: ListSubscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListSubscribeResponse>> =
            subscribe(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see subscribe */
        fun subscribe(
            params: ListSubscribeParams
        ): CompletableFuture<HttpResponseFor<ListSubscribeResponse>> =
            subscribe(params, RequestOptions.none())

        /** @see subscribe */
        fun subscribe(
            params: ListSubscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListSubscribeResponse>>
    }
}

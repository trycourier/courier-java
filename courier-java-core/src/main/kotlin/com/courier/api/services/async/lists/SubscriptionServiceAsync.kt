// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.lists

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponse
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.lists.subscriptions.SubscriptionAddParams
import com.courier.api.models.lists.subscriptions.SubscriptionListParams
import com.courier.api.models.lists.subscriptions.SubscriptionListResponse
import com.courier.api.models.lists.subscriptions.SubscriptionSubscribeParams
import com.courier.api.models.lists.subscriptions.SubscriptionSubscribeUserParams
import com.courier.api.models.lists.subscriptions.SubscriptionUnsubscribeUserParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionServiceAsync

    /** Get the list's subscriptions. */
    fun list(listId: String): CompletableFuture<SubscriptionListResponse> =
        list(listId, SubscriptionListParams.none())

    /** @see list */
    fun list(
        listId: String,
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionListResponse> =
        list(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see list */
    fun list(
        listId: String,
        params: SubscriptionListParams = SubscriptionListParams.none(),
    ): CompletableFuture<SubscriptionListResponse> = list(listId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionListResponse>

    /** @see list */
    fun list(params: SubscriptionListParams): CompletableFuture<SubscriptionListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        listId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionListResponse> =
        list(listId, SubscriptionListParams.none(), requestOptions)

    /**
     * Subscribes additional users to the list, without modifying existing subscriptions. If the
     * list does not exist, it will be automatically created.
     */
    fun add(listId: String, params: SubscriptionAddParams): CompletableFuture<Void?> =
        add(listId, params, RequestOptions.none())

    /** @see add */
    fun add(
        listId: String,
        params: SubscriptionAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = add(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see add */
    fun add(params: SubscriptionAddParams): CompletableFuture<Void?> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: SubscriptionAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Subscribes the users to the list, overwriting existing subscriptions. If the list does not
     * exist, it will be automatically created.
     */
    fun subscribe(listId: String, params: SubscriptionSubscribeParams): CompletableFuture<Void?> =
        subscribe(listId, params, RequestOptions.none())

    /** @see subscribe */
    fun subscribe(
        listId: String,
        params: SubscriptionSubscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        subscribe(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see subscribe */
    fun subscribe(params: SubscriptionSubscribeParams): CompletableFuture<Void?> =
        subscribe(params, RequestOptions.none())

    /** @see subscribe */
    fun subscribe(
        params: SubscriptionSubscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Subscribe a user to an existing list (note: if the List does not exist, it will be
     * automatically created).
     */
    fun subscribeUser(
        userId: String,
        params: SubscriptionSubscribeUserParams,
    ): CompletableFuture<Void?> = subscribeUser(userId, params, RequestOptions.none())

    /** @see subscribeUser */
    fun subscribeUser(
        userId: String,
        params: SubscriptionSubscribeUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        subscribeUser(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see subscribeUser */
    fun subscribeUser(params: SubscriptionSubscribeUserParams): CompletableFuture<Void?> =
        subscribeUser(params, RequestOptions.none())

    /** @see subscribeUser */
    fun subscribeUser(
        params: SubscriptionSubscribeUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Delete a subscription to a list by list ID and user ID. */
    fun unsubscribeUser(
        userId: String,
        params: SubscriptionUnsubscribeUserParams,
    ): CompletableFuture<Void?> = unsubscribeUser(userId, params, RequestOptions.none())

    /** @see unsubscribeUser */
    fun unsubscribeUser(
        userId: String,
        params: SubscriptionUnsubscribeUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        unsubscribeUser(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see unsubscribeUser */
    fun unsubscribeUser(params: SubscriptionUnsubscribeUserParams): CompletableFuture<Void?> =
        unsubscribeUser(params, RequestOptions.none())

    /** @see unsubscribeUser */
    fun unsubscribeUser(
        params: SubscriptionUnsubscribeUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
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
        ): SubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /lists/{list_id}/subscriptions`, but is otherwise
         * the same as [SubscriptionServiceAsync.list].
         */
        fun list(listId: String): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            list(listId, SubscriptionListParams.none())

        /** @see list */
        fun list(
            listId: String,
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            list(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see list */
        fun list(
            listId: String,
            params: SubscriptionListParams = SubscriptionListParams.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            list(listId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>>

        /** @see list */
        fun list(
            params: SubscriptionListParams
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            list(listId, SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /lists/{list_id}/subscriptions`, but is otherwise
         * the same as [SubscriptionServiceAsync.add].
         */
        fun add(listId: String, params: SubscriptionAddParams): CompletableFuture<HttpResponse> =
            add(listId, params, RequestOptions.none())

        /** @see add */
        fun add(
            listId: String,
            params: SubscriptionAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            add(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see add */
        fun add(params: SubscriptionAddParams): CompletableFuture<HttpResponse> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: SubscriptionAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /lists/{list_id}/subscriptions`, but is otherwise
         * the same as [SubscriptionServiceAsync.subscribe].
         */
        fun subscribe(
            listId: String,
            params: SubscriptionSubscribeParams,
        ): CompletableFuture<HttpResponse> = subscribe(listId, params, RequestOptions.none())

        /** @see subscribe */
        fun subscribe(
            listId: String,
            params: SubscriptionSubscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            subscribe(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see subscribe */
        fun subscribe(params: SubscriptionSubscribeParams): CompletableFuture<HttpResponse> =
            subscribe(params, RequestOptions.none())

        /** @see subscribe */
        fun subscribe(
            params: SubscriptionSubscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /lists/{list_id}/subscriptions/{user_id}`, but is
         * otherwise the same as [SubscriptionServiceAsync.subscribeUser].
         */
        fun subscribeUser(
            userId: String,
            params: SubscriptionSubscribeUserParams,
        ): CompletableFuture<HttpResponse> = subscribeUser(userId, params, RequestOptions.none())

        /** @see subscribeUser */
        fun subscribeUser(
            userId: String,
            params: SubscriptionSubscribeUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            subscribeUser(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see subscribeUser */
        fun subscribeUser(
            params: SubscriptionSubscribeUserParams
        ): CompletableFuture<HttpResponse> = subscribeUser(params, RequestOptions.none())

        /** @see subscribeUser */
        fun subscribeUser(
            params: SubscriptionSubscribeUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete /lists/{list_id}/subscriptions/{user_id}`, but is
         * otherwise the same as [SubscriptionServiceAsync.unsubscribeUser].
         */
        fun unsubscribeUser(
            userId: String,
            params: SubscriptionUnsubscribeUserParams,
        ): CompletableFuture<HttpResponse> = unsubscribeUser(userId, params, RequestOptions.none())

        /** @see unsubscribeUser */
        fun unsubscribeUser(
            userId: String,
            params: SubscriptionUnsubscribeUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            unsubscribeUser(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see unsubscribeUser */
        fun unsubscribeUser(
            params: SubscriptionUnsubscribeUserParams
        ): CompletableFuture<HttpResponse> = unsubscribeUser(params, RequestOptions.none())

        /** @see unsubscribeUser */
        fun unsubscribeUser(
            params: SubscriptionUnsubscribeUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}

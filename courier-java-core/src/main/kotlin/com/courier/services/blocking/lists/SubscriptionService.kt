// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.lists

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.lists.subscriptions.SubscriptionAddParams
import com.courier.models.lists.subscriptions.SubscriptionListParams
import com.courier.models.lists.subscriptions.SubscriptionListResponse
import com.courier.models.lists.subscriptions.SubscriptionSubscribeParams
import com.courier.models.lists.subscriptions.SubscriptionSubscribeUserParams
import com.courier.models.lists.subscriptions.SubscriptionUnsubscribeUserParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface SubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionService

    /** Get the list's subscriptions. */
    fun list(listId: String): SubscriptionListResponse = list(listId, SubscriptionListParams.none())

    /** @see list */
    fun list(
        listId: String,
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse = list(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see list */
    fun list(
        listId: String,
        params: SubscriptionListParams = SubscriptionListParams.none(),
    ): SubscriptionListResponse = list(listId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse

    /** @see list */
    fun list(params: SubscriptionListParams): SubscriptionListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(listId: String, requestOptions: RequestOptions): SubscriptionListResponse =
        list(listId, SubscriptionListParams.none(), requestOptions)

    /**
     * Subscribes additional users to the list, without modifying existing subscriptions. If the
     * list does not exist, it will be automatically created.
     */
    fun add(listId: String, params: SubscriptionAddParams) =
        add(listId, params, RequestOptions.none())

    /** @see add */
    fun add(
        listId: String,
        params: SubscriptionAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = add(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see add */
    fun add(params: SubscriptionAddParams) = add(params, RequestOptions.none())

    /** @see add */
    fun add(params: SubscriptionAddParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Subscribes the users to the list, overwriting existing subscriptions. If the list does not
     * exist, it will be automatically created.
     */
    fun subscribe(listId: String, params: SubscriptionSubscribeParams) =
        subscribe(listId, params, RequestOptions.none())

    /** @see subscribe */
    fun subscribe(
        listId: String,
        params: SubscriptionSubscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = subscribe(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see subscribe */
    fun subscribe(params: SubscriptionSubscribeParams) = subscribe(params, RequestOptions.none())

    /** @see subscribe */
    fun subscribe(
        params: SubscriptionSubscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Subscribe a user to an existing list (note: if the List does not exist, it will be
     * automatically created).
     */
    fun subscribeUser(userId: String, params: SubscriptionSubscribeUserParams) =
        subscribeUser(userId, params, RequestOptions.none())

    /** @see subscribeUser */
    fun subscribeUser(
        userId: String,
        params: SubscriptionSubscribeUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = subscribeUser(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see subscribeUser */
    fun subscribeUser(params: SubscriptionSubscribeUserParams) =
        subscribeUser(params, RequestOptions.none())

    /** @see subscribeUser */
    fun subscribeUser(
        params: SubscriptionSubscribeUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Delete a subscription to a list by list ID and user ID. */
    fun unsubscribeUser(userId: String, params: SubscriptionUnsubscribeUserParams) =
        unsubscribeUser(userId, params, RequestOptions.none())

    /** @see unsubscribeUser */
    fun unsubscribeUser(
        userId: String,
        params: SubscriptionUnsubscribeUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = unsubscribeUser(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see unsubscribeUser */
    fun unsubscribeUser(params: SubscriptionUnsubscribeUserParams) =
        unsubscribeUser(params, RequestOptions.none())

    /** @see unsubscribeUser */
    fun unsubscribeUser(
        params: SubscriptionUnsubscribeUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [SubscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /lists/{list_id}/subscriptions`, but is otherwise
         * the same as [SubscriptionService.list].
         */
        @MustBeClosed
        fun list(listId: String): HttpResponseFor<SubscriptionListResponse> =
            list(listId, SubscriptionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            listId: String,
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListResponse> =
            list(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            listId: String,
            params: SubscriptionListParams = SubscriptionListParams.none(),
        ): HttpResponseFor<SubscriptionListResponse> = list(listId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: SubscriptionListParams): HttpResponseFor<SubscriptionListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            listId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionListResponse> =
            list(listId, SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /lists/{list_id}/subscriptions`, but is otherwise
         * the same as [SubscriptionService.add].
         */
        @MustBeClosed
        fun add(listId: String, params: SubscriptionAddParams): HttpResponse =
            add(listId, params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            listId: String,
            params: SubscriptionAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = add(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see add */
        @MustBeClosed
        fun add(params: SubscriptionAddParams): HttpResponse = add(params, RequestOptions.none())

        /** @see add */
        @MustBeClosed
        fun add(
            params: SubscriptionAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /lists/{list_id}/subscriptions`, but is otherwise
         * the same as [SubscriptionService.subscribe].
         */
        @MustBeClosed
        fun subscribe(listId: String, params: SubscriptionSubscribeParams): HttpResponse =
            subscribe(listId, params, RequestOptions.none())

        /** @see subscribe */
        @MustBeClosed
        fun subscribe(
            listId: String,
            params: SubscriptionSubscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = subscribe(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see subscribe */
        @MustBeClosed
        fun subscribe(params: SubscriptionSubscribeParams): HttpResponse =
            subscribe(params, RequestOptions.none())

        /** @see subscribe */
        @MustBeClosed
        fun subscribe(
            params: SubscriptionSubscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /lists/{list_id}/subscriptions/{user_id}`, but is
         * otherwise the same as [SubscriptionService.subscribeUser].
         */
        @MustBeClosed
        fun subscribeUser(userId: String, params: SubscriptionSubscribeUserParams): HttpResponse =
            subscribeUser(userId, params, RequestOptions.none())

        /** @see subscribeUser */
        @MustBeClosed
        fun subscribeUser(
            userId: String,
            params: SubscriptionSubscribeUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = subscribeUser(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see subscribeUser */
        @MustBeClosed
        fun subscribeUser(params: SubscriptionSubscribeUserParams): HttpResponse =
            subscribeUser(params, RequestOptions.none())

        /** @see subscribeUser */
        @MustBeClosed
        fun subscribeUser(
            params: SubscriptionSubscribeUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /lists/{list_id}/subscriptions/{user_id}`, but is
         * otherwise the same as [SubscriptionService.unsubscribeUser].
         */
        @MustBeClosed
        fun unsubscribeUser(
            userId: String,
            params: SubscriptionUnsubscribeUserParams,
        ): HttpResponse = unsubscribeUser(userId, params, RequestOptions.none())

        /** @see unsubscribeUser */
        @MustBeClosed
        fun unsubscribeUser(
            userId: String,
            params: SubscriptionUnsubscribeUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = unsubscribeUser(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see unsubscribeUser */
        @MustBeClosed
        fun unsubscribeUser(params: SubscriptionUnsubscribeUserParams): HttpResponse =
            unsubscribeUser(params, RequestOptions.none())

        /** @see unsubscribeUser */
        @MustBeClosed
        fun unsubscribeUser(
            params: SubscriptionUnsubscribeUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}

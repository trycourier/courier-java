// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponse
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.SubscriptionList
import com.courier.api.models.lists.ListDeleteParams
import com.courier.api.models.lists.ListListParams
import com.courier.api.models.lists.ListListResponse
import com.courier.api.models.lists.ListRestoreParams
import com.courier.api.models.lists.ListRetrieveParams
import com.courier.api.models.lists.ListUpdateParams
import com.courier.api.services.async.lists.SubscriptionServiceAsync
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

    fun subscriptions(): SubscriptionServiceAsync

    /** Returns a list based on the list ID provided. */
    fun retrieve(listId: String): CompletableFuture<SubscriptionList> =
        retrieve(listId, ListRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        listId: String,
        params: ListRetrieveParams = ListRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionList> =
        retrieve(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        listId: String,
        params: ListRetrieveParams = ListRetrieveParams.none(),
    ): CompletableFuture<SubscriptionList> = retrieve(listId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ListRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionList>

    /** @see retrieve */
    fun retrieve(params: ListRetrieveParams): CompletableFuture<SubscriptionList> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        listId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionList> =
        retrieve(listId, ListRetrieveParams.none(), requestOptions)

    /** Create or replace an existing list with the supplied values. */
    fun update(listId: String, params: ListUpdateParams): CompletableFuture<Void?> =
        update(listId, params, RequestOptions.none())

    /** @see update */
    fun update(
        listId: String,
        params: ListUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see update */
    fun update(params: ListUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ListUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Returns all of the lists, with the ability to filter based on a pattern. */
    fun list(): CompletableFuture<ListListResponse> = list(ListListParams.none())

    /** @see list */
    fun list(
        params: ListListParams = ListListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ListListResponse>

    /** @see list */
    fun list(params: ListListParams = ListListParams.none()): CompletableFuture<ListListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ListListResponse> =
        list(ListListParams.none(), requestOptions)

    /** Delete a list by list ID. */
    fun delete(listId: String): CompletableFuture<Void?> = delete(listId, ListDeleteParams.none())

    /** @see delete */
    fun delete(
        listId: String,
        params: ListDeleteParams = ListDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see delete */
    fun delete(
        listId: String,
        params: ListDeleteParams = ListDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(listId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ListDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ListDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(listId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(listId, ListDeleteParams.none(), requestOptions)

    /** Restore a previously deleted list. */
    fun restore(listId: String, params: ListRestoreParams): CompletableFuture<Void?> =
        restore(listId, params, RequestOptions.none())

    /** @see restore */
    fun restore(
        listId: String,
        params: ListRestoreParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = restore(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see restore */
    fun restore(params: ListRestoreParams): CompletableFuture<Void?> =
        restore(params, RequestOptions.none())

    /** @see restore */
    fun restore(
        params: ListRestoreParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [ListServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListServiceAsync.WithRawResponse

        fun subscriptions(): SubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /lists/{list_id}`, but is otherwise the same as
         * [ListServiceAsync.retrieve].
         */
        fun retrieve(listId: String): CompletableFuture<HttpResponseFor<SubscriptionList>> =
            retrieve(listId, ListRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            listId: String,
            params: ListRetrieveParams = ListRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionList>> =
            retrieve(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            listId: String,
            params: ListRetrieveParams = ListRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionList>> =
            retrieve(listId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ListRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionList>>

        /** @see retrieve */
        fun retrieve(
            params: ListRetrieveParams
        ): CompletableFuture<HttpResponseFor<SubscriptionList>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionList>> =
            retrieve(listId, ListRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /lists/{list_id}`, but is otherwise the same as
         * [ListServiceAsync.update].
         */
        fun update(listId: String, params: ListUpdateParams): CompletableFuture<HttpResponse> =
            update(listId, params, RequestOptions.none())

        /** @see update */
        fun update(
            listId: String,
            params: ListUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see update */
        fun update(params: ListUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ListUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /lists`, but is otherwise the same as
         * [ListServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ListListResponse>> =
            list(ListListParams.none())

        /** @see list */
        fun list(
            params: ListListParams = ListListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ListListResponse>>

        /** @see list */
        fun list(
            params: ListListParams = ListListParams.none()
        ): CompletableFuture<HttpResponseFor<ListListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ListListResponse>> =
            list(ListListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /lists/{list_id}`, but is otherwise the same as
         * [ListServiceAsync.delete].
         */
        fun delete(listId: String): CompletableFuture<HttpResponse> =
            delete(listId, ListDeleteParams.none())

        /** @see delete */
        fun delete(
            listId: String,
            params: ListDeleteParams = ListDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see delete */
        fun delete(
            listId: String,
            params: ListDeleteParams = ListDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(listId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ListDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ListDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            listId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> = delete(listId, ListDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /lists/{list_id}/restore`, but is otherwise the same
         * as [ListServiceAsync.restore].
         */
        fun restore(listId: String, params: ListRestoreParams): CompletableFuture<HttpResponse> =
            restore(listId, params, RequestOptions.none())

        /** @see restore */
        fun restore(
            listId: String,
            params: ListRestoreParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            restore(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see restore */
        fun restore(params: ListRestoreParams): CompletableFuture<HttpResponse> =
            restore(params, RequestOptions.none())

        /** @see restore */
        fun restore(
            params: ListRestoreParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}

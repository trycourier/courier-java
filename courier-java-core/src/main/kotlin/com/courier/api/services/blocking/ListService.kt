// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponse
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.List
import com.courier.api.models.lists.ListDeleteParams
import com.courier.api.models.lists.ListListParams
import com.courier.api.models.lists.ListListResponse
import com.courier.api.models.lists.ListRestoreParams
import com.courier.api.models.lists.ListRetrieveParams
import com.courier.api.models.lists.ListUpdateParams
import com.courier.api.services.blocking.lists.SubscriptionService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ListService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListService

    fun subscriptions(): SubscriptionService

    /** Returns a list based on the list ID provided. */
    fun retrieve(listId: String): List = retrieve(listId, ListRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        listId: String,
        params: ListRetrieveParams = ListRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List = retrieve(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(listId: String, params: ListRetrieveParams = ListRetrieveParams.none()): List =
        retrieve(listId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ListRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List

    /** @see retrieve */
    fun retrieve(params: ListRetrieveParams): List = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(listId: String, requestOptions: RequestOptions): List =
        retrieve(listId, ListRetrieveParams.none(), requestOptions)

    /** Create or replace an existing list with the supplied values. */
    fun update(listId: String, params: ListUpdateParams) =
        update(listId, params, RequestOptions.none())

    /** @see update */
    fun update(
        listId: String,
        params: ListUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see update */
    fun update(params: ListUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: ListUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Returns all of the lists, with the ability to filter based on a pattern. */
    fun list(): ListListResponse = list(ListListParams.none())

    /** @see list */
    fun list(
        params: ListListParams = ListListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListListResponse

    /** @see list */
    fun list(params: ListListParams = ListListParams.none()): ListListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ListListResponse =
        list(ListListParams.none(), requestOptions)

    /** Delete a list by list ID. */
    fun delete(listId: String) = delete(listId, ListDeleteParams.none())

    /** @see delete */
    fun delete(
        listId: String,
        params: ListDeleteParams = ListDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see delete */
    fun delete(listId: String, params: ListDeleteParams = ListDeleteParams.none()) =
        delete(listId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ListDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ListDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(listId: String, requestOptions: RequestOptions) =
        delete(listId, ListDeleteParams.none(), requestOptions)

    /** Restore a previously deleted list. */
    fun restore(listId: String, params: ListRestoreParams) =
        restore(listId, params, RequestOptions.none())

    /** @see restore */
    fun restore(
        listId: String,
        params: ListRestoreParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = restore(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see restore */
    fun restore(params: ListRestoreParams) = restore(params, RequestOptions.none())

    /** @see restore */
    fun restore(params: ListRestoreParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [ListService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListService.WithRawResponse

        fun subscriptions(): SubscriptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /lists/{list_id}`, but is otherwise the same as
         * [ListService.retrieve].
         */
        @MustBeClosed
        fun retrieve(listId: String): HttpResponseFor<List> =
            retrieve(listId, ListRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            listId: String,
            params: ListRetrieveParams = ListRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List> =
            retrieve(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            listId: String,
            params: ListRetrieveParams = ListRetrieveParams.none(),
        ): HttpResponseFor<List> = retrieve(listId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ListRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ListRetrieveParams): HttpResponseFor<List> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(listId: String, requestOptions: RequestOptions): HttpResponseFor<List> =
            retrieve(listId, ListRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /lists/{list_id}`, but is otherwise the same as
         * [ListService.update].
         */
        @MustBeClosed
        fun update(listId: String, params: ListUpdateParams): HttpResponse =
            update(listId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            listId: String,
            params: ListUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ListUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ListUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /lists`, but is otherwise the same as
         * [ListService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ListListResponse> = list(ListListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ListListParams = ListListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ListListParams = ListListParams.none()
        ): HttpResponseFor<ListListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ListListResponse> =
            list(ListListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /lists/{list_id}`, but is otherwise the same as
         * [ListService.delete].
         */
        @MustBeClosed
        fun delete(listId: String): HttpResponse = delete(listId, ListDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            listId: String,
            params: ListDeleteParams = ListDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            listId: String,
            params: ListDeleteParams = ListDeleteParams.none(),
        ): HttpResponse = delete(listId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ListDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ListDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(listId: String, requestOptions: RequestOptions): HttpResponse =
            delete(listId, ListDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /lists/{list_id}/restore`, but is otherwise the same
         * as [ListService.restore].
         */
        @MustBeClosed
        fun restore(listId: String, params: ListRestoreParams): HttpResponse =
            restore(listId, params, RequestOptions.none())

        /** @see restore */
        @MustBeClosed
        fun restore(
            listId: String,
            params: ListRestoreParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = restore(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see restore */
        @MustBeClosed
        fun restore(params: ListRestoreParams): HttpResponse =
            restore(params, RequestOptions.none())

        /** @see restore */
        @MustBeClosed
        fun restore(
            params: ListRestoreParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}

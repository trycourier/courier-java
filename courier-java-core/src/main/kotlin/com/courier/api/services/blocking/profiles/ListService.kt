// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking.profiles

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.profiles.lists.ListDeleteParams
import com.courier.api.models.profiles.lists.ListDeleteResponse
import com.courier.api.models.profiles.lists.ListRetrieveParams
import com.courier.api.models.profiles.lists.ListRetrieveResponse
import com.courier.api.models.profiles.lists.ListSubscribeParams
import com.courier.api.models.profiles.lists.ListSubscribeResponse
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

    /** Returns the subscribed lists for a specified user. */
    fun retrieve(userId: String): ListRetrieveResponse = retrieve(userId, ListRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: ListRetrieveParams = ListRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListRetrieveResponse = retrieve(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: ListRetrieveParams = ListRetrieveParams.none(),
    ): ListRetrieveResponse = retrieve(userId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ListRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ListRetrieveParams): ListRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(userId: String, requestOptions: RequestOptions): ListRetrieveResponse =
        retrieve(userId, ListRetrieveParams.none(), requestOptions)

    /** Removes all list subscriptions for given user. */
    fun delete(userId: String): ListDeleteResponse = delete(userId, ListDeleteParams.none())

    /** @see delete */
    fun delete(
        userId: String,
        params: ListDeleteParams = ListDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListDeleteResponse = delete(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see delete */
    fun delete(
        userId: String,
        params: ListDeleteParams = ListDeleteParams.none(),
    ): ListDeleteResponse = delete(userId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ListDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListDeleteResponse

    /** @see delete */
    fun delete(params: ListDeleteParams): ListDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(userId: String, requestOptions: RequestOptions): ListDeleteResponse =
        delete(userId, ListDeleteParams.none(), requestOptions)

    /**
     * Subscribes the given user to one or more lists. If the list does not exist, it will be
     * created.
     */
    fun subscribe(userId: String, params: ListSubscribeParams): ListSubscribeResponse =
        subscribe(userId, params, RequestOptions.none())

    /** @see subscribe */
    fun subscribe(
        userId: String,
        params: ListSubscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListSubscribeResponse = subscribe(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see subscribe */
    fun subscribe(params: ListSubscribeParams): ListSubscribeResponse =
        subscribe(params, RequestOptions.none())

    /** @see subscribe */
    fun subscribe(
        params: ListSubscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListSubscribeResponse

    /** A view of [ListService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /profiles/{user_id}/lists`, but is otherwise the
         * same as [ListService.retrieve].
         */
        @MustBeClosed
        fun retrieve(userId: String): HttpResponseFor<ListRetrieveResponse> =
            retrieve(userId, ListRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userId: String,
            params: ListRetrieveParams = ListRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListRetrieveResponse> =
            retrieve(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userId: String,
            params: ListRetrieveParams = ListRetrieveParams.none(),
        ): HttpResponseFor<ListRetrieveResponse> = retrieve(userId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ListRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ListRetrieveParams): HttpResponseFor<ListRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListRetrieveResponse> =
            retrieve(userId, ListRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /profiles/{user_id}/lists`, but is otherwise the
         * same as [ListService.delete].
         */
        @MustBeClosed
        fun delete(userId: String): HttpResponseFor<ListDeleteResponse> =
            delete(userId, ListDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            userId: String,
            params: ListDeleteParams = ListDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListDeleteResponse> =
            delete(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            userId: String,
            params: ListDeleteParams = ListDeleteParams.none(),
        ): HttpResponseFor<ListDeleteResponse> = delete(userId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ListDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ListDeleteParams): HttpResponseFor<ListDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListDeleteResponse> =
            delete(userId, ListDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /profiles/{user_id}/lists`, but is otherwise the
         * same as [ListService.subscribe].
         */
        @MustBeClosed
        fun subscribe(
            userId: String,
            params: ListSubscribeParams,
        ): HttpResponseFor<ListSubscribeResponse> = subscribe(userId, params, RequestOptions.none())

        /** @see subscribe */
        @MustBeClosed
        fun subscribe(
            userId: String,
            params: ListSubscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListSubscribeResponse> =
            subscribe(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see subscribe */
        @MustBeClosed
        fun subscribe(params: ListSubscribeParams): HttpResponseFor<ListSubscribeResponse> =
            subscribe(params, RequestOptions.none())

        /** @see subscribe */
        @MustBeClosed
        fun subscribe(
            params: ListSubscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListSubscribeResponse>
    }
}

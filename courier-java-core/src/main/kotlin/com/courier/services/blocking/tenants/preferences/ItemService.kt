// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.tenants.preferences

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.models.tenants.preferences.items.ItemDeleteParams
import com.courier.models.tenants.preferences.items.ItemUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemService

    /** Create or Replace Default Preferences For Topic */
    fun update(topicId: String, params: ItemUpdateParams) =
        update(topicId, params, RequestOptions.none())

    /** @see update */
    fun update(
        topicId: String,
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see update */
    fun update(params: ItemUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: ItemUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Remove Default Preferences For Topic */
    fun delete(topicId: String, params: ItemDeleteParams) =
        delete(topicId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        topicId: String,
        params: ItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ItemDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ItemDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [ItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /tenants/{tenant_id}/default_preferences/items/{topic_id}`, but is otherwise the same as
         * [ItemService.update].
         */
        @MustBeClosed
        fun update(topicId: String, params: ItemUpdateParams): HttpResponse =
            update(topicId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            topicId: String,
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ItemUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /tenants/{tenant_id}/default_preferences/items/{topic_id}`, but is otherwise the same as
         * [ItemService.delete].
         */
        @MustBeClosed
        fun delete(topicId: String, params: ItemDeleteParams): HttpResponse =
            delete(topicId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            topicId: String,
            params: ItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: ItemDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}

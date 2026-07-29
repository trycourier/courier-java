// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.tenants.preferences

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.models.tenants.preferences.items.ItemDeleteParams
import com.courier.models.tenants.preferences.items.ItemUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Manage tenants — the organizations, teams, or accounts your users belong to — along with their
 * users and default preferences.
 */
interface ItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemServiceAsync

    /**
     * Sets a tenant's default opt-in status for one subscription topic, which applies to every
     * member unless a user sets their own override.
     */
    fun update(topicId: String, params: ItemUpdateParams): CompletableFuture<Void?> =
        update(topicId, params, RequestOptions.none())

    /** @see update */
    fun update(
        topicId: String,
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        update(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see update */
    fun update(params: ItemUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Removes a tenant's default preference for one subscription topic, addressed by tenant id and
     * topic id.
     */
    fun delete(topicId: String, params: ItemDeleteParams): CompletableFuture<Void?> =
        delete(topicId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        topicId: String,
        params: ItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().topicId(topicId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ItemDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [ItemServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /tenants/{tenant_id}/default_preferences/items/{topic_id}`, but is otherwise the same as
         * [ItemServiceAsync.update].
         */
        fun update(topicId: String, params: ItemUpdateParams): CompletableFuture<HttpResponse> =
            update(topicId, params, RequestOptions.none())

        /** @see update */
        fun update(
            topicId: String,
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see update */
        fun update(params: ItemUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /tenants/{tenant_id}/default_preferences/items/{topic_id}`, but is otherwise the same as
         * [ItemServiceAsync.delete].
         */
        fun delete(topicId: String, params: ItemDeleteParams): CompletableFuture<HttpResponse> =
            delete(topicId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            topicId: String,
            params: ItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().topicId(topicId).build(), requestOptions)

        /** @see delete */
        fun delete(params: ItemDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}

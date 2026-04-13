// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.routingstrategies.AssociatedNotificationListResponse
import com.courier.models.routingstrategies.RoutingStrategyArchiveParams
import com.courier.models.routingstrategies.RoutingStrategyCreateParams
import com.courier.models.routingstrategies.RoutingStrategyCreateRequest
import com.courier.models.routingstrategies.RoutingStrategyGetResponse
import com.courier.models.routingstrategies.RoutingStrategyListNotificationsParams
import com.courier.models.routingstrategies.RoutingStrategyListParams
import com.courier.models.routingstrategies.RoutingStrategyListResponse
import com.courier.models.routingstrategies.RoutingStrategyReplaceParams
import com.courier.models.routingstrategies.RoutingStrategyRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RoutingStrategyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoutingStrategyServiceAsync

    /**
     * Create a routing strategy. Requires a name and routing configuration at minimum. Channels and
     * providers default to empty if omitted.
     */
    fun create(params: RoutingStrategyCreateParams): CompletableFuture<RoutingStrategyGetResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RoutingStrategyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoutingStrategyGetResponse>

    /** @see create */
    fun create(
        routingStrategyCreateRequest: RoutingStrategyCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoutingStrategyGetResponse> =
        create(
            RoutingStrategyCreateParams.builder()
                .routingStrategyCreateRequest(routingStrategyCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        routingStrategyCreateRequest: RoutingStrategyCreateRequest
    ): CompletableFuture<RoutingStrategyGetResponse> =
        create(routingStrategyCreateRequest, RequestOptions.none())

    /**
     * Retrieve a routing strategy by ID. Returns the full entity including routing content and
     * metadata.
     */
    fun retrieve(id: String): CompletableFuture<RoutingStrategyGetResponse> =
        retrieve(id, RoutingStrategyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RoutingStrategyRetrieveParams = RoutingStrategyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoutingStrategyGetResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RoutingStrategyRetrieveParams = RoutingStrategyRetrieveParams.none(),
    ): CompletableFuture<RoutingStrategyGetResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RoutingStrategyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoutingStrategyGetResponse>

    /** @see retrieve */
    fun retrieve(
        params: RoutingStrategyRetrieveParams
    ): CompletableFuture<RoutingStrategyGetResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RoutingStrategyGetResponse> =
        retrieve(id, RoutingStrategyRetrieveParams.none(), requestOptions)

    /**
     * List routing strategies in your workspace. Returns metadata only (no
     * routing/channels/providers content). Use GET /routing-strategies/{id} for full details.
     */
    fun list(): CompletableFuture<RoutingStrategyListResponse> =
        list(RoutingStrategyListParams.none())

    /** @see list */
    fun list(
        params: RoutingStrategyListParams = RoutingStrategyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoutingStrategyListResponse>

    /** @see list */
    fun list(
        params: RoutingStrategyListParams = RoutingStrategyListParams.none()
    ): CompletableFuture<RoutingStrategyListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RoutingStrategyListResponse> =
        list(RoutingStrategyListParams.none(), requestOptions)

    /**
     * Archive a routing strategy. The strategy must not have associated notification templates.
     * Unlink all templates before archiving.
     */
    fun archive(id: String): CompletableFuture<Void?> =
        archive(id, RoutingStrategyArchiveParams.none())

    /** @see archive */
    fun archive(
        id: String,
        params: RoutingStrategyArchiveParams = RoutingStrategyArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(
        id: String,
        params: RoutingStrategyArchiveParams = RoutingStrategyArchiveParams.none(),
    ): CompletableFuture<Void?> = archive(id, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: RoutingStrategyArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see archive */
    fun archive(params: RoutingStrategyArchiveParams): CompletableFuture<Void?> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        archive(id, RoutingStrategyArchiveParams.none(), requestOptions)

    /**
     * List notification templates associated with a routing strategy. Includes template metadata
     * only, not full content.
     */
    fun listNotifications(id: String): CompletableFuture<AssociatedNotificationListResponse> =
        listNotifications(id, RoutingStrategyListNotificationsParams.none())

    /** @see listNotifications */
    fun listNotifications(
        id: String,
        params: RoutingStrategyListNotificationsParams =
            RoutingStrategyListNotificationsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociatedNotificationListResponse> =
        listNotifications(params.toBuilder().id(id).build(), requestOptions)

    /** @see listNotifications */
    fun listNotifications(
        id: String,
        params: RoutingStrategyListNotificationsParams =
            RoutingStrategyListNotificationsParams.none(),
    ): CompletableFuture<AssociatedNotificationListResponse> =
        listNotifications(id, params, RequestOptions.none())

    /** @see listNotifications */
    fun listNotifications(
        params: RoutingStrategyListNotificationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociatedNotificationListResponse>

    /** @see listNotifications */
    fun listNotifications(
        params: RoutingStrategyListNotificationsParams
    ): CompletableFuture<AssociatedNotificationListResponse> =
        listNotifications(params, RequestOptions.none())

    /** @see listNotifications */
    fun listNotifications(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssociatedNotificationListResponse> =
        listNotifications(id, RoutingStrategyListNotificationsParams.none(), requestOptions)

    /**
     * Replace a routing strategy. Full document replacement; the caller must send the complete
     * desired state. Missing optional fields are cleared.
     */
    fun replace(
        id: String,
        params: RoutingStrategyReplaceParams,
    ): CompletableFuture<RoutingStrategyGetResponse> = replace(id, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        id: String,
        params: RoutingStrategyReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoutingStrategyGetResponse> =
        replace(params.toBuilder().id(id).build(), requestOptions)

    /** @see replace */
    fun replace(
        params: RoutingStrategyReplaceParams
    ): CompletableFuture<RoutingStrategyGetResponse> = replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: RoutingStrategyReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoutingStrategyGetResponse>

    /**
     * A view of [RoutingStrategyServiceAsync] that provides access to raw HTTP responses for each
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
        ): RoutingStrategyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /routing-strategies`, but is otherwise the same as
         * [RoutingStrategyServiceAsync.create].
         */
        fun create(
            params: RoutingStrategyCreateParams
        ): CompletableFuture<HttpResponseFor<RoutingStrategyGetResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RoutingStrategyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoutingStrategyGetResponse>>

        /** @see create */
        fun create(
            routingStrategyCreateRequest: RoutingStrategyCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoutingStrategyGetResponse>> =
            create(
                RoutingStrategyCreateParams.builder()
                    .routingStrategyCreateRequest(routingStrategyCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            routingStrategyCreateRequest: RoutingStrategyCreateRequest
        ): CompletableFuture<HttpResponseFor<RoutingStrategyGetResponse>> =
            create(routingStrategyCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /routing-strategies/{id}`, but is otherwise the same
         * as [RoutingStrategyServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<RoutingStrategyGetResponse>> =
            retrieve(id, RoutingStrategyRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: RoutingStrategyRetrieveParams = RoutingStrategyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoutingStrategyGetResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: RoutingStrategyRetrieveParams = RoutingStrategyRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RoutingStrategyGetResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RoutingStrategyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoutingStrategyGetResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RoutingStrategyRetrieveParams
        ): CompletableFuture<HttpResponseFor<RoutingStrategyGetResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RoutingStrategyGetResponse>> =
            retrieve(id, RoutingStrategyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /routing-strategies`, but is otherwise the same as
         * [RoutingStrategyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RoutingStrategyListResponse>> =
            list(RoutingStrategyListParams.none())

        /** @see list */
        fun list(
            params: RoutingStrategyListParams = RoutingStrategyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoutingStrategyListResponse>>

        /** @see list */
        fun list(
            params: RoutingStrategyListParams = RoutingStrategyListParams.none()
        ): CompletableFuture<HttpResponseFor<RoutingStrategyListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RoutingStrategyListResponse>> =
            list(RoutingStrategyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /routing-strategies/{id}`, but is otherwise the
         * same as [RoutingStrategyServiceAsync.archive].
         */
        fun archive(id: String): CompletableFuture<HttpResponse> =
            archive(id, RoutingStrategyArchiveParams.none())

        /** @see archive */
        fun archive(
            id: String,
            params: RoutingStrategyArchiveParams = RoutingStrategyArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        fun archive(
            id: String,
            params: RoutingStrategyArchiveParams = RoutingStrategyArchiveParams.none(),
        ): CompletableFuture<HttpResponse> = archive(id, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: RoutingStrategyArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see archive */
        fun archive(params: RoutingStrategyArchiveParams): CompletableFuture<HttpResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            archive(id, RoutingStrategyArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /routing-strategies/{id}/notifications`, but is
         * otherwise the same as [RoutingStrategyServiceAsync.listNotifications].
         */
        fun listNotifications(
            id: String
        ): CompletableFuture<HttpResponseFor<AssociatedNotificationListResponse>> =
            listNotifications(id, RoutingStrategyListNotificationsParams.none())

        /** @see listNotifications */
        fun listNotifications(
            id: String,
            params: RoutingStrategyListNotificationsParams =
                RoutingStrategyListNotificationsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociatedNotificationListResponse>> =
            listNotifications(params.toBuilder().id(id).build(), requestOptions)

        /** @see listNotifications */
        fun listNotifications(
            id: String,
            params: RoutingStrategyListNotificationsParams =
                RoutingStrategyListNotificationsParams.none(),
        ): CompletableFuture<HttpResponseFor<AssociatedNotificationListResponse>> =
            listNotifications(id, params, RequestOptions.none())

        /** @see listNotifications */
        fun listNotifications(
            params: RoutingStrategyListNotificationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociatedNotificationListResponse>>

        /** @see listNotifications */
        fun listNotifications(
            params: RoutingStrategyListNotificationsParams
        ): CompletableFuture<HttpResponseFor<AssociatedNotificationListResponse>> =
            listNotifications(params, RequestOptions.none())

        /** @see listNotifications */
        fun listNotifications(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssociatedNotificationListResponse>> =
            listNotifications(id, RoutingStrategyListNotificationsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /routing-strategies/{id}`, but is otherwise the same
         * as [RoutingStrategyServiceAsync.replace].
         */
        fun replace(
            id: String,
            params: RoutingStrategyReplaceParams,
        ): CompletableFuture<HttpResponseFor<RoutingStrategyGetResponse>> =
            replace(id, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            id: String,
            params: RoutingStrategyReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoutingStrategyGetResponse>> =
            replace(params.toBuilder().id(id).build(), requestOptions)

        /** @see replace */
        fun replace(
            params: RoutingStrategyReplaceParams
        ): CompletableFuture<HttpResponseFor<RoutingStrategyGetResponse>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: RoutingStrategyReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoutingStrategyGetResponse>>
    }
}

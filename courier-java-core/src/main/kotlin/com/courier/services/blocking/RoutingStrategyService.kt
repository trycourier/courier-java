// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

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
import com.courier.models.routingstrategies.RoutingStrategyMutationResponse
import com.courier.models.routingstrategies.RoutingStrategyReplaceParams
import com.courier.models.routingstrategies.RoutingStrategyRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface RoutingStrategyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoutingStrategyService

    /**
     * Create a routing strategy. Requires a name and routing configuration at minimum. Channels and
     * providers default to empty if omitted.
     */
    fun create(params: RoutingStrategyCreateParams): RoutingStrategyMutationResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RoutingStrategyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingStrategyMutationResponse

    /** @see create */
    fun create(
        routingStrategyCreateRequest: RoutingStrategyCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingStrategyMutationResponse =
        create(
            RoutingStrategyCreateParams.builder()
                .routingStrategyCreateRequest(routingStrategyCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        routingStrategyCreateRequest: RoutingStrategyCreateRequest
    ): RoutingStrategyMutationResponse = create(routingStrategyCreateRequest, RequestOptions.none())

    /**
     * Retrieve a routing strategy by ID. Returns the full entity including routing content and
     * metadata.
     */
    fun retrieve(id: String): RoutingStrategyGetResponse =
        retrieve(id, RoutingStrategyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RoutingStrategyRetrieveParams = RoutingStrategyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingStrategyGetResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RoutingStrategyRetrieveParams = RoutingStrategyRetrieveParams.none(),
    ): RoutingStrategyGetResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RoutingStrategyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingStrategyGetResponse

    /** @see retrieve */
    fun retrieve(params: RoutingStrategyRetrieveParams): RoutingStrategyGetResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): RoutingStrategyGetResponse =
        retrieve(id, RoutingStrategyRetrieveParams.none(), requestOptions)

    /**
     * List routing strategies in your workspace. Returns metadata only (no
     * routing/channels/providers content). Use GET /routing-strategies/{id} for full details.
     */
    fun list(): RoutingStrategyListResponse = list(RoutingStrategyListParams.none())

    /** @see list */
    fun list(
        params: RoutingStrategyListParams = RoutingStrategyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingStrategyListResponse

    /** @see list */
    fun list(
        params: RoutingStrategyListParams = RoutingStrategyListParams.none()
    ): RoutingStrategyListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): RoutingStrategyListResponse =
        list(RoutingStrategyListParams.none(), requestOptions)

    /**
     * Archive a routing strategy. The strategy must not have associated notification templates.
     * Unlink all templates before archiving.
     */
    fun archive(id: String) = archive(id, RoutingStrategyArchiveParams.none())

    /** @see archive */
    fun archive(
        id: String,
        params: RoutingStrategyArchiveParams = RoutingStrategyArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archive(params.toBuilder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(
        id: String,
        params: RoutingStrategyArchiveParams = RoutingStrategyArchiveParams.none(),
    ) = archive(id, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: RoutingStrategyArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see archive */
    fun archive(params: RoutingStrategyArchiveParams) = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(id: String, requestOptions: RequestOptions) =
        archive(id, RoutingStrategyArchiveParams.none(), requestOptions)

    /**
     * List notification templates associated with a routing strategy. Includes template metadata
     * only, not full content.
     */
    fun listNotifications(id: String): AssociatedNotificationListResponse =
        listNotifications(id, RoutingStrategyListNotificationsParams.none())

    /** @see listNotifications */
    fun listNotifications(
        id: String,
        params: RoutingStrategyListNotificationsParams =
            RoutingStrategyListNotificationsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociatedNotificationListResponse =
        listNotifications(params.toBuilder().id(id).build(), requestOptions)

    /** @see listNotifications */
    fun listNotifications(
        id: String,
        params: RoutingStrategyListNotificationsParams =
            RoutingStrategyListNotificationsParams.none(),
    ): AssociatedNotificationListResponse = listNotifications(id, params, RequestOptions.none())

    /** @see listNotifications */
    fun listNotifications(
        params: RoutingStrategyListNotificationsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociatedNotificationListResponse

    /** @see listNotifications */
    fun listNotifications(
        params: RoutingStrategyListNotificationsParams
    ): AssociatedNotificationListResponse = listNotifications(params, RequestOptions.none())

    /** @see listNotifications */
    fun listNotifications(
        id: String,
        requestOptions: RequestOptions,
    ): AssociatedNotificationListResponse =
        listNotifications(id, RoutingStrategyListNotificationsParams.none(), requestOptions)

    /**
     * Replace a routing strategy. Full document replacement; the caller must send the complete
     * desired state. Missing optional fields are cleared.
     */
    fun replace(id: String, params: RoutingStrategyReplaceParams): RoutingStrategyMutationResponse =
        replace(id, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        id: String,
        params: RoutingStrategyReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingStrategyMutationResponse = replace(params.toBuilder().id(id).build(), requestOptions)

    /** @see replace */
    fun replace(params: RoutingStrategyReplaceParams): RoutingStrategyMutationResponse =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: RoutingStrategyReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingStrategyMutationResponse

    /**
     * A view of [RoutingStrategyService] that provides access to raw HTTP responses for each
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
        ): RoutingStrategyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /routing-strategies`, but is otherwise the same as
         * [RoutingStrategyService.create].
         */
        @MustBeClosed
        fun create(
            params: RoutingStrategyCreateParams
        ): HttpResponseFor<RoutingStrategyMutationResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RoutingStrategyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingStrategyMutationResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            routingStrategyCreateRequest: RoutingStrategyCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingStrategyMutationResponse> =
            create(
                RoutingStrategyCreateParams.builder()
                    .routingStrategyCreateRequest(routingStrategyCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            routingStrategyCreateRequest: RoutingStrategyCreateRequest
        ): HttpResponseFor<RoutingStrategyMutationResponse> =
            create(routingStrategyCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /routing-strategies/{id}`, but is otherwise the same
         * as [RoutingStrategyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<RoutingStrategyGetResponse> =
            retrieve(id, RoutingStrategyRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RoutingStrategyRetrieveParams = RoutingStrategyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingStrategyGetResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RoutingStrategyRetrieveParams = RoutingStrategyRetrieveParams.none(),
        ): HttpResponseFor<RoutingStrategyGetResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RoutingStrategyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingStrategyGetResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RoutingStrategyRetrieveParams
        ): HttpResponseFor<RoutingStrategyGetResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoutingStrategyGetResponse> =
            retrieve(id, RoutingStrategyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /routing-strategies`, but is otherwise the same as
         * [RoutingStrategyService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<RoutingStrategyListResponse> =
            list(RoutingStrategyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RoutingStrategyListParams = RoutingStrategyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingStrategyListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RoutingStrategyListParams = RoutingStrategyListParams.none()
        ): HttpResponseFor<RoutingStrategyListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RoutingStrategyListResponse> =
            list(RoutingStrategyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /routing-strategies/{id}`, but is otherwise the
         * same as [RoutingStrategyService.archive].
         */
        @MustBeClosed
        fun archive(id: String): HttpResponse = archive(id, RoutingStrategyArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            id: String,
            params: RoutingStrategyArchiveParams = RoutingStrategyArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = archive(params.toBuilder().id(id).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            id: String,
            params: RoutingStrategyArchiveParams = RoutingStrategyArchiveParams.none(),
        ): HttpResponse = archive(id, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: RoutingStrategyArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see archive */
        @MustBeClosed
        fun archive(params: RoutingStrategyArchiveParams): HttpResponse =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(id: String, requestOptions: RequestOptions): HttpResponse =
            archive(id, RoutingStrategyArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /routing-strategies/{id}/notifications`, but is
         * otherwise the same as [RoutingStrategyService.listNotifications].
         */
        @MustBeClosed
        fun listNotifications(id: String): HttpResponseFor<AssociatedNotificationListResponse> =
            listNotifications(id, RoutingStrategyListNotificationsParams.none())

        /** @see listNotifications */
        @MustBeClosed
        fun listNotifications(
            id: String,
            params: RoutingStrategyListNotificationsParams =
                RoutingStrategyListNotificationsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociatedNotificationListResponse> =
            listNotifications(params.toBuilder().id(id).build(), requestOptions)

        /** @see listNotifications */
        @MustBeClosed
        fun listNotifications(
            id: String,
            params: RoutingStrategyListNotificationsParams =
                RoutingStrategyListNotificationsParams.none(),
        ): HttpResponseFor<AssociatedNotificationListResponse> =
            listNotifications(id, params, RequestOptions.none())

        /** @see listNotifications */
        @MustBeClosed
        fun listNotifications(
            params: RoutingStrategyListNotificationsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociatedNotificationListResponse>

        /** @see listNotifications */
        @MustBeClosed
        fun listNotifications(
            params: RoutingStrategyListNotificationsParams
        ): HttpResponseFor<AssociatedNotificationListResponse> =
            listNotifications(params, RequestOptions.none())

        /** @see listNotifications */
        @MustBeClosed
        fun listNotifications(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssociatedNotificationListResponse> =
            listNotifications(id, RoutingStrategyListNotificationsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /routing-strategies/{id}`, but is otherwise the same
         * as [RoutingStrategyService.replace].
         */
        @MustBeClosed
        fun replace(
            id: String,
            params: RoutingStrategyReplaceParams,
        ): HttpResponseFor<RoutingStrategyMutationResponse> =
            replace(id, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            id: String,
            params: RoutingStrategyReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingStrategyMutationResponse> =
            replace(params.toBuilder().id(id).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: RoutingStrategyReplaceParams
        ): HttpResponseFor<RoutingStrategyMutationResponse> = replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: RoutingStrategyReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingStrategyMutationResponse>
    }
}

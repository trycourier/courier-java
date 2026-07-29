// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.users

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.users.tenants.TenantAddMultipleParams
import com.courier.models.users.tenants.TenantAddSingleParams
import com.courier.models.users.tenants.TenantListParams
import com.courier.models.users.tenants.TenantListResponse
import com.courier.models.users.tenants.TenantRemoveAllParams
import com.courier.models.users.tenants.TenantRemoveSingleParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Associate a user with one or more tenants, and read or remove those associations. */
interface TenantService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TenantService

    /**
     * Returns the tenants a user belongs to, with cursor paging. A user can belong to many tenants,
     * each with its own profile and preferences.
     */
    fun list(userId: String): TenantListResponse = list(userId, TenantListParams.none())

    /** @see list */
    fun list(
        userId: String,
        params: TenantListParams = TenantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TenantListResponse = list(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see list */
    fun list(
        userId: String,
        params: TenantListParams = TenantListParams.none(),
    ): TenantListResponse = list(userId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TenantListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TenantListResponse

    /** @see list */
    fun list(params: TenantListParams): TenantListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(userId: String, requestOptions: RequestOptions): TenantListResponse =
        list(userId, TenantListParams.none(), requestOptions)

    /**
     * Adds a user to several tenants in one call, each optionally with a per-tenant profile that
     * overrides their workspace profile.
     */
    fun addMultiple(userId: String, params: TenantAddMultipleParams) =
        addMultiple(userId, params, RequestOptions.none())

    /** @see addMultiple */
    fun addMultiple(
        userId: String,
        params: TenantAddMultipleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = addMultiple(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see addMultiple */
    fun addMultiple(params: TenantAddMultipleParams) = addMultiple(params, RequestOptions.none())

    /** @see addMultiple */
    fun addMultiple(
        params: TenantAddMultipleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Adds a user to one tenant, optionally with a tenant-specific profile that overrides their
     * workspace profile for sends in that tenant.
     */
    fun addSingle(tenantId: String, params: TenantAddSingleParams) =
        addSingle(tenantId, params, RequestOptions.none())

    /** @see addSingle */
    fun addSingle(
        tenantId: String,
        params: TenantAddSingleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = addSingle(params.toBuilder().tenantId(tenantId).build(), requestOptions)

    /** @see addSingle */
    fun addSingle(params: TenantAddSingleParams) = addSingle(params, RequestOptions.none())

    /** @see addSingle */
    fun addSingle(
        params: TenantAddSingleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Removes a user from every tenant they belong to in one call. Their workspace-level profile is
     * a separate resource.
     */
    fun removeAll(userId: String) = removeAll(userId, TenantRemoveAllParams.none())

    /** @see removeAll */
    fun removeAll(
        userId: String,
        params: TenantRemoveAllParams = TenantRemoveAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = removeAll(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see removeAll */
    fun removeAll(userId: String, params: TenantRemoveAllParams = TenantRemoveAllParams.none()) =
        removeAll(userId, params, RequestOptions.none())

    /** @see removeAll */
    fun removeAll(
        params: TenantRemoveAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see removeAll */
    fun removeAll(params: TenantRemoveAllParams) = removeAll(params, RequestOptions.none())

    /** @see removeAll */
    fun removeAll(userId: String, requestOptions: RequestOptions) =
        removeAll(userId, TenantRemoveAllParams.none(), requestOptions)

    /**
     * Removes a user from one tenant. Their other tenant memberships and workspace profile are
     * managed through separate endpoints.
     */
    fun removeSingle(tenantId: String, params: TenantRemoveSingleParams) =
        removeSingle(tenantId, params, RequestOptions.none())

    /** @see removeSingle */
    fun removeSingle(
        tenantId: String,
        params: TenantRemoveSingleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = removeSingle(params.toBuilder().tenantId(tenantId).build(), requestOptions)

    /** @see removeSingle */
    fun removeSingle(params: TenantRemoveSingleParams) = removeSingle(params, RequestOptions.none())

    /** @see removeSingle */
    fun removeSingle(
        params: TenantRemoveSingleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [TenantService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TenantService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /users/{user_id}/tenants`, but is otherwise the same
         * as [TenantService.list].
         */
        @MustBeClosed
        fun list(userId: String): HttpResponseFor<TenantListResponse> =
            list(userId, TenantListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            userId: String,
            params: TenantListParams = TenantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TenantListResponse> =
            list(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            userId: String,
            params: TenantListParams = TenantListParams.none(),
        ): HttpResponseFor<TenantListResponse> = list(userId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TenantListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TenantListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: TenantListParams): HttpResponseFor<TenantListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TenantListResponse> =
            list(userId, TenantListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /users/{user_id}/tenants`, but is otherwise the same
         * as [TenantService.addMultiple].
         */
        @MustBeClosed
        fun addMultiple(userId: String, params: TenantAddMultipleParams): HttpResponse =
            addMultiple(userId, params, RequestOptions.none())

        /** @see addMultiple */
        @MustBeClosed
        fun addMultiple(
            userId: String,
            params: TenantAddMultipleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = addMultiple(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see addMultiple */
        @MustBeClosed
        fun addMultiple(params: TenantAddMultipleParams): HttpResponse =
            addMultiple(params, RequestOptions.none())

        /** @see addMultiple */
        @MustBeClosed
        fun addMultiple(
            params: TenantAddMultipleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /users/{user_id}/tenants/{tenant_id}`, but is
         * otherwise the same as [TenantService.addSingle].
         */
        @MustBeClosed
        fun addSingle(tenantId: String, params: TenantAddSingleParams): HttpResponse =
            addSingle(tenantId, params, RequestOptions.none())

        /** @see addSingle */
        @MustBeClosed
        fun addSingle(
            tenantId: String,
            params: TenantAddSingleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = addSingle(params.toBuilder().tenantId(tenantId).build(), requestOptions)

        /** @see addSingle */
        @MustBeClosed
        fun addSingle(params: TenantAddSingleParams): HttpResponse =
            addSingle(params, RequestOptions.none())

        /** @see addSingle */
        @MustBeClosed
        fun addSingle(
            params: TenantAddSingleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /users/{user_id}/tenants`, but is otherwise the
         * same as [TenantService.removeAll].
         */
        @MustBeClosed
        fun removeAll(userId: String): HttpResponse =
            removeAll(userId, TenantRemoveAllParams.none())

        /** @see removeAll */
        @MustBeClosed
        fun removeAll(
            userId: String,
            params: TenantRemoveAllParams = TenantRemoveAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = removeAll(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see removeAll */
        @MustBeClosed
        fun removeAll(
            userId: String,
            params: TenantRemoveAllParams = TenantRemoveAllParams.none(),
        ): HttpResponse = removeAll(userId, params, RequestOptions.none())

        /** @see removeAll */
        @MustBeClosed
        fun removeAll(
            params: TenantRemoveAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see removeAll */
        @MustBeClosed
        fun removeAll(params: TenantRemoveAllParams): HttpResponse =
            removeAll(params, RequestOptions.none())

        /** @see removeAll */
        @MustBeClosed
        fun removeAll(userId: String, requestOptions: RequestOptions): HttpResponse =
            removeAll(userId, TenantRemoveAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /users/{user_id}/tenants/{tenant_id}`, but is
         * otherwise the same as [TenantService.removeSingle].
         */
        @MustBeClosed
        fun removeSingle(tenantId: String, params: TenantRemoveSingleParams): HttpResponse =
            removeSingle(tenantId, params, RequestOptions.none())

        /** @see removeSingle */
        @MustBeClosed
        fun removeSingle(
            tenantId: String,
            params: TenantRemoveSingleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            removeSingle(params.toBuilder().tenantId(tenantId).build(), requestOptions)

        /** @see removeSingle */
        @MustBeClosed
        fun removeSingle(params: TenantRemoveSingleParams): HttpResponse =
            removeSingle(params, RequestOptions.none())

        /** @see removeSingle */
        @MustBeClosed
        fun removeSingle(
            params: TenantRemoveSingleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}

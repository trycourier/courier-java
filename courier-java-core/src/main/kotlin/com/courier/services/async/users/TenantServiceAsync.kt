// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.users

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TenantServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TenantServiceAsync

    /**
     * Returns the tenants a user belongs to, with cursor paging. A user can belong to many tenants,
     * each with its own profile and preferences.
     */
    fun list(userId: String): CompletableFuture<TenantListResponse> =
        list(userId, TenantListParams.none())

    /** @see list */
    fun list(
        userId: String,
        params: TenantListParams = TenantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TenantListResponse> =
        list(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see list */
    fun list(
        userId: String,
        params: TenantListParams = TenantListParams.none(),
    ): CompletableFuture<TenantListResponse> = list(userId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TenantListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TenantListResponse>

    /** @see list */
    fun list(params: TenantListParams): CompletableFuture<TenantListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        userId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TenantListResponse> = list(userId, TenantListParams.none(), requestOptions)

    /**
     * Adds a user to several tenants in one call, each optionally with a per-tenant profile that
     * overrides their workspace profile.
     */
    fun addMultiple(userId: String, params: TenantAddMultipleParams): CompletableFuture<Void?> =
        addMultiple(userId, params, RequestOptions.none())

    /** @see addMultiple */
    fun addMultiple(
        userId: String,
        params: TenantAddMultipleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        addMultiple(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see addMultiple */
    fun addMultiple(params: TenantAddMultipleParams): CompletableFuture<Void?> =
        addMultiple(params, RequestOptions.none())

    /** @see addMultiple */
    fun addMultiple(
        params: TenantAddMultipleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Adds a user to one tenant, optionally with a tenant-specific profile that overrides their
     * workspace profile for sends in that tenant.
     */
    fun addSingle(tenantId: String, params: TenantAddSingleParams): CompletableFuture<Void?> =
        addSingle(tenantId, params, RequestOptions.none())

    /** @see addSingle */
    fun addSingle(
        tenantId: String,
        params: TenantAddSingleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        addSingle(params.toBuilder().tenantId(tenantId).build(), requestOptions)

    /** @see addSingle */
    fun addSingle(params: TenantAddSingleParams): CompletableFuture<Void?> =
        addSingle(params, RequestOptions.none())

    /** @see addSingle */
    fun addSingle(
        params: TenantAddSingleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Removes a user from every tenant they belong to in one call. Their workspace-level profile is
     * a separate resource.
     */
    fun removeAll(userId: String): CompletableFuture<Void?> =
        removeAll(userId, TenantRemoveAllParams.none())

    /** @see removeAll */
    fun removeAll(
        userId: String,
        params: TenantRemoveAllParams = TenantRemoveAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        removeAll(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see removeAll */
    fun removeAll(
        userId: String,
        params: TenantRemoveAllParams = TenantRemoveAllParams.none(),
    ): CompletableFuture<Void?> = removeAll(userId, params, RequestOptions.none())

    /** @see removeAll */
    fun removeAll(
        params: TenantRemoveAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see removeAll */
    fun removeAll(params: TenantRemoveAllParams): CompletableFuture<Void?> =
        removeAll(params, RequestOptions.none())

    /** @see removeAll */
    fun removeAll(userId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        removeAll(userId, TenantRemoveAllParams.none(), requestOptions)

    /**
     * Removes a user from one tenant. Their other tenant memberships and workspace profile are
     * managed through separate endpoints.
     */
    fun removeSingle(tenantId: String, params: TenantRemoveSingleParams): CompletableFuture<Void?> =
        removeSingle(tenantId, params, RequestOptions.none())

    /** @see removeSingle */
    fun removeSingle(
        tenantId: String,
        params: TenantRemoveSingleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        removeSingle(params.toBuilder().tenantId(tenantId).build(), requestOptions)

    /** @see removeSingle */
    fun removeSingle(params: TenantRemoveSingleParams): CompletableFuture<Void?> =
        removeSingle(params, RequestOptions.none())

    /** @see removeSingle */
    fun removeSingle(
        params: TenantRemoveSingleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [TenantServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TenantServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /users/{user_id}/tenants`, but is otherwise the same
         * as [TenantServiceAsync.list].
         */
        fun list(userId: String): CompletableFuture<HttpResponseFor<TenantListResponse>> =
            list(userId, TenantListParams.none())

        /** @see list */
        fun list(
            userId: String,
            params: TenantListParams = TenantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TenantListResponse>> =
            list(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see list */
        fun list(
            userId: String,
            params: TenantListParams = TenantListParams.none(),
        ): CompletableFuture<HttpResponseFor<TenantListResponse>> =
            list(userId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TenantListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TenantListResponse>>

        /** @see list */
        fun list(params: TenantListParams): CompletableFuture<HttpResponseFor<TenantListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TenantListResponse>> =
            list(userId, TenantListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /users/{user_id}/tenants`, but is otherwise the same
         * as [TenantServiceAsync.addMultiple].
         */
        fun addMultiple(
            userId: String,
            params: TenantAddMultipleParams,
        ): CompletableFuture<HttpResponse> = addMultiple(userId, params, RequestOptions.none())

        /** @see addMultiple */
        fun addMultiple(
            userId: String,
            params: TenantAddMultipleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            addMultiple(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see addMultiple */
        fun addMultiple(params: TenantAddMultipleParams): CompletableFuture<HttpResponse> =
            addMultiple(params, RequestOptions.none())

        /** @see addMultiple */
        fun addMultiple(
            params: TenantAddMultipleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /users/{user_id}/tenants/{tenant_id}`, but is
         * otherwise the same as [TenantServiceAsync.addSingle].
         */
        fun addSingle(
            tenantId: String,
            params: TenantAddSingleParams,
        ): CompletableFuture<HttpResponse> = addSingle(tenantId, params, RequestOptions.none())

        /** @see addSingle */
        fun addSingle(
            tenantId: String,
            params: TenantAddSingleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            addSingle(params.toBuilder().tenantId(tenantId).build(), requestOptions)

        /** @see addSingle */
        fun addSingle(params: TenantAddSingleParams): CompletableFuture<HttpResponse> =
            addSingle(params, RequestOptions.none())

        /** @see addSingle */
        fun addSingle(
            params: TenantAddSingleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete /users/{user_id}/tenants`, but is otherwise the
         * same as [TenantServiceAsync.removeAll].
         */
        fun removeAll(userId: String): CompletableFuture<HttpResponse> =
            removeAll(userId, TenantRemoveAllParams.none())

        /** @see removeAll */
        fun removeAll(
            userId: String,
            params: TenantRemoveAllParams = TenantRemoveAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            removeAll(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see removeAll */
        fun removeAll(
            userId: String,
            params: TenantRemoveAllParams = TenantRemoveAllParams.none(),
        ): CompletableFuture<HttpResponse> = removeAll(userId, params, RequestOptions.none())

        /** @see removeAll */
        fun removeAll(
            params: TenantRemoveAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see removeAll */
        fun removeAll(params: TenantRemoveAllParams): CompletableFuture<HttpResponse> =
            removeAll(params, RequestOptions.none())

        /** @see removeAll */
        fun removeAll(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            removeAll(userId, TenantRemoveAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /users/{user_id}/tenants/{tenant_id}`, but is
         * otherwise the same as [TenantServiceAsync.removeSingle].
         */
        fun removeSingle(
            tenantId: String,
            params: TenantRemoveSingleParams,
        ): CompletableFuture<HttpResponse> = removeSingle(tenantId, params, RequestOptions.none())

        /** @see removeSingle */
        fun removeSingle(
            tenantId: String,
            params: TenantRemoveSingleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            removeSingle(params.toBuilder().tenantId(tenantId).build(), requestOptions)

        /** @see removeSingle */
        fun removeSingle(params: TenantRemoveSingleParams): CompletableFuture<HttpResponse> =
            removeSingle(params, RequestOptions.none())

        /** @see removeSingle */
        fun removeSingle(
            params: TenantRemoveSingleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}

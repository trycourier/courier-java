// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.tenants.Tenant
import com.courier.models.tenants.TenantDeleteParams
import com.courier.models.tenants.TenantListParams
import com.courier.models.tenants.TenantListResponse
import com.courier.models.tenants.TenantListUsersParams
import com.courier.models.tenants.TenantListUsersResponse
import com.courier.models.tenants.TenantRetrieveParams
import com.courier.models.tenants.TenantUpdateParams
import com.courier.services.async.tenants.TemplateServiceAsync
import com.courier.services.async.tenants.TenantDefaultPreferenceServiceAsync
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

    fun tenantDefaultPreferences(): TenantDefaultPreferenceServiceAsync

    fun templates(): TemplateServiceAsync

    /** Get a Tenant */
    fun retrieve(tenantId: String): CompletableFuture<Tenant> =
        retrieve(tenantId, TenantRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        tenantId: String,
        params: TenantRetrieveParams = TenantRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Tenant> =
        retrieve(params.toBuilder().tenantId(tenantId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        tenantId: String,
        params: TenantRetrieveParams = TenantRetrieveParams.none(),
    ): CompletableFuture<Tenant> = retrieve(tenantId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TenantRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Tenant>

    /** @see retrieve */
    fun retrieve(params: TenantRetrieveParams): CompletableFuture<Tenant> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(tenantId: String, requestOptions: RequestOptions): CompletableFuture<Tenant> =
        retrieve(tenantId, TenantRetrieveParams.none(), requestOptions)

    /** Create or Replace a Tenant */
    fun update(tenantId: String, params: TenantUpdateParams): CompletableFuture<Tenant> =
        update(tenantId, params, RequestOptions.none())

    /** @see update */
    fun update(
        tenantId: String,
        params: TenantUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Tenant> =
        update(params.toBuilder().tenantId(tenantId).build(), requestOptions)

    /** @see update */
    fun update(params: TenantUpdateParams): CompletableFuture<Tenant> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TenantUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Tenant>

    /** Get a List of Tenants */
    fun list(): CompletableFuture<TenantListResponse> = list(TenantListParams.none())

    /** @see list */
    fun list(
        params: TenantListParams = TenantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TenantListResponse>

    /** @see list */
    fun list(
        params: TenantListParams = TenantListParams.none()
    ): CompletableFuture<TenantListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TenantListResponse> =
        list(TenantListParams.none(), requestOptions)

    /** Delete a Tenant */
    fun delete(tenantId: String): CompletableFuture<Void?> =
        delete(tenantId, TenantDeleteParams.none())

    /** @see delete */
    fun delete(
        tenantId: String,
        params: TenantDeleteParams = TenantDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().tenantId(tenantId).build(), requestOptions)

    /** @see delete */
    fun delete(
        tenantId: String,
        params: TenantDeleteParams = TenantDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(tenantId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TenantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TenantDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(tenantId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(tenantId, TenantDeleteParams.none(), requestOptions)

    /** Get Users in Tenant */
    fun listUsers(tenantId: String): CompletableFuture<TenantListUsersResponse> =
        listUsers(tenantId, TenantListUsersParams.none())

    /** @see listUsers */
    fun listUsers(
        tenantId: String,
        params: TenantListUsersParams = TenantListUsersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TenantListUsersResponse> =
        listUsers(params.toBuilder().tenantId(tenantId).build(), requestOptions)

    /** @see listUsers */
    fun listUsers(
        tenantId: String,
        params: TenantListUsersParams = TenantListUsersParams.none(),
    ): CompletableFuture<TenantListUsersResponse> =
        listUsers(tenantId, params, RequestOptions.none())

    /** @see listUsers */
    fun listUsers(
        params: TenantListUsersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TenantListUsersResponse>

    /** @see listUsers */
    fun listUsers(params: TenantListUsersParams): CompletableFuture<TenantListUsersResponse> =
        listUsers(params, RequestOptions.none())

    /** @see listUsers */
    fun listUsers(
        tenantId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TenantListUsersResponse> =
        listUsers(tenantId, TenantListUsersParams.none(), requestOptions)

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

        fun tenantDefaultPreferences(): TenantDefaultPreferenceServiceAsync.WithRawResponse

        fun templates(): TemplateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /tenants/{tenant_id}`, but is otherwise the same as
         * [TenantServiceAsync.retrieve].
         */
        fun retrieve(tenantId: String): CompletableFuture<HttpResponseFor<Tenant>> =
            retrieve(tenantId, TenantRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            tenantId: String,
            params: TenantRetrieveParams = TenantRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Tenant>> =
            retrieve(params.toBuilder().tenantId(tenantId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            tenantId: String,
            params: TenantRetrieveParams = TenantRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Tenant>> =
            retrieve(tenantId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TenantRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Tenant>>

        /** @see retrieve */
        fun retrieve(params: TenantRetrieveParams): CompletableFuture<HttpResponseFor<Tenant>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            tenantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Tenant>> =
            retrieve(tenantId, TenantRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /tenants/{tenant_id}`, but is otherwise the same as
         * [TenantServiceAsync.update].
         */
        fun update(
            tenantId: String,
            params: TenantUpdateParams,
        ): CompletableFuture<HttpResponseFor<Tenant>> =
            update(tenantId, params, RequestOptions.none())

        /** @see update */
        fun update(
            tenantId: String,
            params: TenantUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Tenant>> =
            update(params.toBuilder().tenantId(tenantId).build(), requestOptions)

        /** @see update */
        fun update(params: TenantUpdateParams): CompletableFuture<HttpResponseFor<Tenant>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TenantUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Tenant>>

        /**
         * Returns a raw HTTP response for `get /tenants`, but is otherwise the same as
         * [TenantServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TenantListResponse>> =
            list(TenantListParams.none())

        /** @see list */
        fun list(
            params: TenantListParams = TenantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TenantListResponse>>

        /** @see list */
        fun list(
            params: TenantListParams = TenantListParams.none()
        ): CompletableFuture<HttpResponseFor<TenantListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TenantListResponse>> =
            list(TenantListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /tenants/{tenant_id}`, but is otherwise the same
         * as [TenantServiceAsync.delete].
         */
        fun delete(tenantId: String): CompletableFuture<HttpResponse> =
            delete(tenantId, TenantDeleteParams.none())

        /** @see delete */
        fun delete(
            tenantId: String,
            params: TenantDeleteParams = TenantDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().tenantId(tenantId).build(), requestOptions)

        /** @see delete */
        fun delete(
            tenantId: String,
            params: TenantDeleteParams = TenantDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(tenantId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TenantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TenantDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            tenantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(tenantId, TenantDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /tenants/{tenant_id}/users`, but is otherwise the
         * same as [TenantServiceAsync.listUsers].
         */
        fun listUsers(
            tenantId: String
        ): CompletableFuture<HttpResponseFor<TenantListUsersResponse>> =
            listUsers(tenantId, TenantListUsersParams.none())

        /** @see listUsers */
        fun listUsers(
            tenantId: String,
            params: TenantListUsersParams = TenantListUsersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TenantListUsersResponse>> =
            listUsers(params.toBuilder().tenantId(tenantId).build(), requestOptions)

        /** @see listUsers */
        fun listUsers(
            tenantId: String,
            params: TenantListUsersParams = TenantListUsersParams.none(),
        ): CompletableFuture<HttpResponseFor<TenantListUsersResponse>> =
            listUsers(tenantId, params, RequestOptions.none())

        /** @see listUsers */
        fun listUsers(
            params: TenantListUsersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TenantListUsersResponse>>

        /** @see listUsers */
        fun listUsers(
            params: TenantListUsersParams
        ): CompletableFuture<HttpResponseFor<TenantListUsersResponse>> =
            listUsers(params, RequestOptions.none())

        /** @see listUsers */
        fun listUsers(
            tenantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TenantListUsersResponse>> =
            listUsers(tenantId, TenantListUsersParams.none(), requestOptions)
    }
}

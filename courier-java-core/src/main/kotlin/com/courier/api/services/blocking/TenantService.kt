// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponse
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.tenants.Tenant
import com.courier.api.models.tenants.TenantDeleteParams
import com.courier.api.models.tenants.TenantListParams
import com.courier.api.models.tenants.TenantListResponse
import com.courier.api.models.tenants.TenantListUsersParams
import com.courier.api.models.tenants.TenantListUsersResponse
import com.courier.api.models.tenants.TenantRetrieveParams
import com.courier.api.models.tenants.TenantUpdateParams
import com.courier.api.services.blocking.tenants.TemplateService
import com.courier.api.services.blocking.tenants.TenantDefaultPreferenceService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

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

    fun tenantDefaultPreferences(): TenantDefaultPreferenceService

    fun templates(): TemplateService

    /** Get a Tenant */
    fun retrieve(tenantId: String): Tenant = retrieve(tenantId, TenantRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        tenantId: String,
        params: TenantRetrieveParams = TenantRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Tenant = retrieve(params.toBuilder().tenantId(tenantId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        tenantId: String,
        params: TenantRetrieveParams = TenantRetrieveParams.none(),
    ): Tenant = retrieve(tenantId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TenantRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Tenant

    /** @see retrieve */
    fun retrieve(params: TenantRetrieveParams): Tenant = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(tenantId: String, requestOptions: RequestOptions): Tenant =
        retrieve(tenantId, TenantRetrieveParams.none(), requestOptions)

    /** Create or Replace a Tenant */
    fun update(tenantId: String, params: TenantUpdateParams): Tenant =
        update(tenantId, params, RequestOptions.none())

    /** @see update */
    fun update(
        tenantId: String,
        params: TenantUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Tenant = update(params.toBuilder().tenantId(tenantId).build(), requestOptions)

    /** @see update */
    fun update(params: TenantUpdateParams): Tenant = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TenantUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Tenant

    /** Get a List of Tenants */
    fun list(): TenantListResponse = list(TenantListParams.none())

    /** @see list */
    fun list(
        params: TenantListParams = TenantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TenantListResponse

    /** @see list */
    fun list(params: TenantListParams = TenantListParams.none()): TenantListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TenantListResponse =
        list(TenantListParams.none(), requestOptions)

    /** Delete a Tenant */
    fun delete(tenantId: String) = delete(tenantId, TenantDeleteParams.none())

    /** @see delete */
    fun delete(
        tenantId: String,
        params: TenantDeleteParams = TenantDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().tenantId(tenantId).build(), requestOptions)

    /** @see delete */
    fun delete(tenantId: String, params: TenantDeleteParams = TenantDeleteParams.none()) =
        delete(tenantId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: TenantDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: TenantDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(tenantId: String, requestOptions: RequestOptions) =
        delete(tenantId, TenantDeleteParams.none(), requestOptions)

    /** Get Users in Tenant */
    fun listUsers(tenantId: String): TenantListUsersResponse =
        listUsers(tenantId, TenantListUsersParams.none())

    /** @see listUsers */
    fun listUsers(
        tenantId: String,
        params: TenantListUsersParams = TenantListUsersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TenantListUsersResponse =
        listUsers(params.toBuilder().tenantId(tenantId).build(), requestOptions)

    /** @see listUsers */
    fun listUsers(
        tenantId: String,
        params: TenantListUsersParams = TenantListUsersParams.none(),
    ): TenantListUsersResponse = listUsers(tenantId, params, RequestOptions.none())

    /** @see listUsers */
    fun listUsers(
        params: TenantListUsersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TenantListUsersResponse

    /** @see listUsers */
    fun listUsers(params: TenantListUsersParams): TenantListUsersResponse =
        listUsers(params, RequestOptions.none())

    /** @see listUsers */
    fun listUsers(tenantId: String, requestOptions: RequestOptions): TenantListUsersResponse =
        listUsers(tenantId, TenantListUsersParams.none(), requestOptions)

    /** A view of [TenantService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TenantService.WithRawResponse

        fun tenantDefaultPreferences(): TenantDefaultPreferenceService.WithRawResponse

        fun templates(): TemplateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /tenants/{tenant_id}`, but is otherwise the same as
         * [TenantService.retrieve].
         */
        @MustBeClosed
        fun retrieve(tenantId: String): HttpResponseFor<Tenant> =
            retrieve(tenantId, TenantRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            tenantId: String,
            params: TenantRetrieveParams = TenantRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Tenant> =
            retrieve(params.toBuilder().tenantId(tenantId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            tenantId: String,
            params: TenantRetrieveParams = TenantRetrieveParams.none(),
        ): HttpResponseFor<Tenant> = retrieve(tenantId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TenantRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Tenant>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TenantRetrieveParams): HttpResponseFor<Tenant> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(tenantId: String, requestOptions: RequestOptions): HttpResponseFor<Tenant> =
            retrieve(tenantId, TenantRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /tenants/{tenant_id}`, but is otherwise the same as
         * [TenantService.update].
         */
        @MustBeClosed
        fun update(tenantId: String, params: TenantUpdateParams): HttpResponseFor<Tenant> =
            update(tenantId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            tenantId: String,
            params: TenantUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Tenant> =
            update(params.toBuilder().tenantId(tenantId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TenantUpdateParams): HttpResponseFor<Tenant> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TenantUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Tenant>

        /**
         * Returns a raw HTTP response for `get /tenants`, but is otherwise the same as
         * [TenantService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TenantListResponse> = list(TenantListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TenantListParams = TenantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TenantListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TenantListParams = TenantListParams.none()
        ): HttpResponseFor<TenantListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TenantListResponse> =
            list(TenantListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /tenants/{tenant_id}`, but is otherwise the same
         * as [TenantService.delete].
         */
        @MustBeClosed
        fun delete(tenantId: String): HttpResponse = delete(tenantId, TenantDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            tenantId: String,
            params: TenantDeleteParams = TenantDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().tenantId(tenantId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            tenantId: String,
            params: TenantDeleteParams = TenantDeleteParams.none(),
        ): HttpResponse = delete(tenantId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TenantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: TenantDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(tenantId: String, requestOptions: RequestOptions): HttpResponse =
            delete(tenantId, TenantDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /tenants/{tenant_id}/users`, but is otherwise the
         * same as [TenantService.listUsers].
         */
        @MustBeClosed
        fun listUsers(tenantId: String): HttpResponseFor<TenantListUsersResponse> =
            listUsers(tenantId, TenantListUsersParams.none())

        /** @see listUsers */
        @MustBeClosed
        fun listUsers(
            tenantId: String,
            params: TenantListUsersParams = TenantListUsersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TenantListUsersResponse> =
            listUsers(params.toBuilder().tenantId(tenantId).build(), requestOptions)

        /** @see listUsers */
        @MustBeClosed
        fun listUsers(
            tenantId: String,
            params: TenantListUsersParams = TenantListUsersParams.none(),
        ): HttpResponseFor<TenantListUsersResponse> =
            listUsers(tenantId, params, RequestOptions.none())

        /** @see listUsers */
        @MustBeClosed
        fun listUsers(
            params: TenantListUsersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TenantListUsersResponse>

        /** @see listUsers */
        @MustBeClosed
        fun listUsers(params: TenantListUsersParams): HttpResponseFor<TenantListUsersResponse> =
            listUsers(params, RequestOptions.none())

        /** @see listUsers */
        @MustBeClosed
        fun listUsers(
            tenantId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TenantListUsersResponse> =
            listUsers(tenantId, TenantListUsersParams.none(), requestOptions)
    }
}

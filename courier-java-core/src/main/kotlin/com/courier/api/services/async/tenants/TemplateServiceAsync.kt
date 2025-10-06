// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.tenants

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.tenants.templates.BaseTemplateTenantAssociation
import com.courier.api.models.tenants.templates.TemplateListParams
import com.courier.api.models.tenants.templates.TemplateListResponse
import com.courier.api.models.tenants.templates.TemplateRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TemplateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateServiceAsync

    /** Get a Template in Tenant */
    fun retrieve(
        templateId: String,
        params: TemplateRetrieveParams,
    ): CompletableFuture<BaseTemplateTenantAssociation> =
        retrieve(templateId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseTemplateTenantAssociation> =
        retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TemplateRetrieveParams): CompletableFuture<BaseTemplateTenantAssociation> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseTemplateTenantAssociation>

    /** List Templates in Tenant */
    fun list(tenantId: String): CompletableFuture<TemplateListResponse> =
        list(tenantId, TemplateListParams.none())

    /** @see list */
    fun list(
        tenantId: String,
        params: TemplateListParams = TemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TemplateListResponse> =
        list(params.toBuilder().tenantId(tenantId).build(), requestOptions)

    /** @see list */
    fun list(
        tenantId: String,
        params: TemplateListParams = TemplateListParams.none(),
    ): CompletableFuture<TemplateListResponse> = list(tenantId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TemplateListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TemplateListResponse>

    /** @see list */
    fun list(params: TemplateListParams): CompletableFuture<TemplateListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        tenantId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TemplateListResponse> =
        list(tenantId, TemplateListParams.none(), requestOptions)

    /**
     * A view of [TemplateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TemplateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /tenants/{tenant_id}/templates/{template_id}`, but
         * is otherwise the same as [TemplateServiceAsync.retrieve].
         */
        fun retrieve(
            templateId: String,
            params: TemplateRetrieveParams,
        ): CompletableFuture<HttpResponseFor<BaseTemplateTenantAssociation>> =
            retrieve(templateId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            templateId: String,
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseTemplateTenantAssociation>> =
            retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: TemplateRetrieveParams
        ): CompletableFuture<HttpResponseFor<BaseTemplateTenantAssociation>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseTemplateTenantAssociation>>

        /**
         * Returns a raw HTTP response for `get /tenants/{tenant_id}/templates`, but is otherwise
         * the same as [TemplateServiceAsync.list].
         */
        fun list(tenantId: String): CompletableFuture<HttpResponseFor<TemplateListResponse>> =
            list(tenantId, TemplateListParams.none())

        /** @see list */
        fun list(
            tenantId: String,
            params: TemplateListParams = TemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TemplateListResponse>> =
            list(params.toBuilder().tenantId(tenantId).build(), requestOptions)

        /** @see list */
        fun list(
            tenantId: String,
            params: TemplateListParams = TemplateListParams.none(),
        ): CompletableFuture<HttpResponseFor<TemplateListResponse>> =
            list(tenantId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TemplateListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TemplateListResponse>>

        /** @see list */
        fun list(
            params: TemplateListParams
        ): CompletableFuture<HttpResponseFor<TemplateListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            tenantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TemplateListResponse>> =
            list(tenantId, TemplateListParams.none(), requestOptions)
    }
}

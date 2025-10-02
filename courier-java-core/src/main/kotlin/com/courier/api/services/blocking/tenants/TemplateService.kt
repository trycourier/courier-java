// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking.tenants

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.tenants.templates.BaseTemplateTenantAssociation
import com.courier.api.models.tenants.templates.TemplateListParams
import com.courier.api.models.tenants.templates.TemplateListResponse
import com.courier.api.models.tenants.templates.TemplateRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface TemplateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService

    /** Get a Template in Tenant */
    fun retrieve(
        templateId: String,
        params: TemplateRetrieveParams,
    ): BaseTemplateTenantAssociation = retrieve(templateId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        templateId: String,
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BaseTemplateTenantAssociation =
        retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TemplateRetrieveParams): BaseTemplateTenantAssociation =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BaseTemplateTenantAssociation

    /** List Templates in Tenant */
    fun list(tenantId: String): TemplateListResponse = list(tenantId, TemplateListParams.none())

    /** @see list */
    fun list(
        tenantId: String,
        params: TemplateListParams = TemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TemplateListResponse = list(params.toBuilder().tenantId(tenantId).build(), requestOptions)

    /** @see list */
    fun list(
        tenantId: String,
        params: TemplateListParams = TemplateListParams.none(),
    ): TemplateListResponse = list(tenantId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TemplateListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TemplateListResponse

    /** @see list */
    fun list(params: TemplateListParams): TemplateListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(tenantId: String, requestOptions: RequestOptions): TemplateListResponse =
        list(tenantId, TemplateListParams.none(), requestOptions)

    /** A view of [TemplateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /tenants/{tenant_id}/templates/{template_id}`, but
         * is otherwise the same as [TemplateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            templateId: String,
            params: TemplateRetrieveParams,
        ): HttpResponseFor<BaseTemplateTenantAssociation> =
            retrieve(templateId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            templateId: String,
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BaseTemplateTenantAssociation> =
            retrieve(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TemplateRetrieveParams
        ): HttpResponseFor<BaseTemplateTenantAssociation> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BaseTemplateTenantAssociation>

        /**
         * Returns a raw HTTP response for `get /tenants/{tenant_id}/templates`, but is otherwise
         * the same as [TemplateService.list].
         */
        @MustBeClosed
        fun list(tenantId: String): HttpResponseFor<TemplateListResponse> =
            list(tenantId, TemplateListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            tenantId: String,
            params: TemplateListParams = TemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TemplateListResponse> =
            list(params.toBuilder().tenantId(tenantId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            tenantId: String,
            params: TemplateListParams = TemplateListParams.none(),
        ): HttpResponseFor<TemplateListResponse> = list(tenantId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TemplateListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TemplateListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: TemplateListParams): HttpResponseFor<TemplateListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            tenantId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TemplateListResponse> =
            list(tenantId, TemplateListParams.none(), requestOptions)
    }
}

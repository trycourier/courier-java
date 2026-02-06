// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.tenants

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.tenants.BaseTemplateTenantAssociation
import com.courier.models.tenants.PostTenantTemplatePublishResponse
import com.courier.models.tenants.PutTenantTemplateResponse
import com.courier.models.tenants.templates.TemplateListParams
import com.courier.models.tenants.templates.TemplateListResponse
import com.courier.models.tenants.templates.TemplatePublishParams
import com.courier.models.tenants.templates.TemplateReplaceParams
import com.courier.models.tenants.templates.TemplateRetrieveParams
import com.courier.services.async.tenants.templates.VersionServiceAsync
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

    fun versions(): VersionServiceAsync

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
     * Publishes a specific version of a notification template for a tenant.
     *
     * The template must already exist in the tenant's notification map. If no version is specified,
     * defaults to publishing the "latest" version.
     */
    fun publish(
        templateId: String,
        params: TemplatePublishParams,
    ): CompletableFuture<PostTenantTemplatePublishResponse> =
        publish(templateId, params, RequestOptions.none())

    /** @see publish */
    fun publish(
        templateId: String,
        params: TemplatePublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostTenantTemplatePublishResponse> =
        publish(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see publish */
    fun publish(
        params: TemplatePublishParams
    ): CompletableFuture<PostTenantTemplatePublishResponse> = publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(
        params: TemplatePublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostTenantTemplatePublishResponse>

    /**
     * Creates or updates a notification template for a tenant.
     *
     * If the template already exists for the tenant, it will be updated (200). Otherwise, a new
     * template is created (201).
     *
     * Optionally publishes the template immediately if the `published` flag is set to true.
     */
    fun replace(
        templateId: String,
        params: TemplateReplaceParams,
    ): CompletableFuture<PutTenantTemplateResponse> =
        replace(templateId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        templateId: String,
        params: TemplateReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PutTenantTemplateResponse> =
        replace(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see replace */
    fun replace(params: TemplateReplaceParams): CompletableFuture<PutTenantTemplateResponse> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: TemplateReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PutTenantTemplateResponse>

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

        fun versions(): VersionServiceAsync.WithRawResponse

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

        /**
         * Returns a raw HTTP response for `post
         * /tenants/{tenant_id}/templates/{template_id}/publish`, but is otherwise the same as
         * [TemplateServiceAsync.publish].
         */
        fun publish(
            templateId: String,
            params: TemplatePublishParams,
        ): CompletableFuture<HttpResponseFor<PostTenantTemplatePublishResponse>> =
            publish(templateId, params, RequestOptions.none())

        /** @see publish */
        fun publish(
            templateId: String,
            params: TemplatePublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostTenantTemplatePublishResponse>> =
            publish(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see publish */
        fun publish(
            params: TemplatePublishParams
        ): CompletableFuture<HttpResponseFor<PostTenantTemplatePublishResponse>> =
            publish(params, RequestOptions.none())

        /** @see publish */
        fun publish(
            params: TemplatePublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostTenantTemplatePublishResponse>>

        /**
         * Returns a raw HTTP response for `put /tenants/{tenant_id}/templates/{template_id}`, but
         * is otherwise the same as [TemplateServiceAsync.replace].
         */
        fun replace(
            templateId: String,
            params: TemplateReplaceParams,
        ): CompletableFuture<HttpResponseFor<PutTenantTemplateResponse>> =
            replace(templateId, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            templateId: String,
            params: TemplateReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PutTenantTemplateResponse>> =
            replace(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see replace */
        fun replace(
            params: TemplateReplaceParams
        ): CompletableFuture<HttpResponseFor<PutTenantTemplateResponse>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: TemplateReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PutTenantTemplateResponse>>
    }
}

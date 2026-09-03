// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.tenants

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.tenants.BaseTemplateTenantAssociation
import com.courier.models.tenants.PostTenantTemplatePublishResponse
import com.courier.models.tenants.PutTenantTemplateResponse
import com.courier.models.tenants.templates.TemplateDeleteParams
import com.courier.models.tenants.templates.TemplateListParams
import com.courier.models.tenants.templates.TemplateListResponse
import com.courier.models.tenants.templates.TemplatePublishParams
import com.courier.models.tenants.templates.TemplateReplaceParams
import com.courier.models.tenants.templates.TemplateRetrieveParams
import com.courier.services.blocking.tenants.templates.VersionService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Manage the templates and template versions scoped to a single tenant, including the ones authored
 * in the embedded designer.
 */
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

    /**
     * Manage the templates and template versions scoped to a single tenant, including the ones
     * authored in the embedded designer.
     */
    fun versions(): VersionService

    /**
     * Returns a tenant's notification template with its content, version, and created, updated, and
     * published timestamps.
     */
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

    /**
     * Lists a tenant's notification templates, each carrying its version and published timestamp.
     * Paged.
     */
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

    /**
     * Deletes a tenant's notification template by id. Sends for that tenant then use the workspace
     * template registered under the same id.
     */
    fun delete(templateId: String, params: TemplateDeleteParams) =
        delete(templateId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        templateId: String,
        params: TemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see delete */
    fun delete(params: TemplateDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: TemplateDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Publishes a version of a tenant's notification template, making it the content that tenant's
     * sends render from until you publish another.
     */
    fun publish(
        templateId: String,
        params: TemplatePublishParams,
    ): PostTenantTemplatePublishResponse = publish(templateId, params, RequestOptions.none())

    /** @see publish */
    fun publish(
        templateId: String,
        params: TemplatePublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostTenantTemplatePublishResponse =
        publish(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see publish */
    fun publish(params: TemplatePublishParams): PostTenantTemplatePublishResponse =
        publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(
        params: TemplatePublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostTenantTemplatePublishResponse

    /**
     * Creates or updates a notification template scoped to one tenant, letting a tenant override
     * the content the workspace template would send.
     *
     * This is an upsert: it creates when the tenant has no template under `template_id`, and
     * updates when it does. On the create half, content must place its elements inside a channel
     * block — `{ "type": "channel", "channel": "email", "elements": [...] }` — or the request
     * returns `400`. The template designer renders only the channel block matching the tab it
     * draws, so content stored without one cannot be opened. An empty `elements` array is accepted,
     * as is the `{ title, body }` shorthand, which has no elements to wrap. Updates are not
     * checked, so tenant templates already stored without a wrapper stay editable.
     */
    fun replace(templateId: String, params: TemplateReplaceParams): PutTenantTemplateResponse =
        replace(templateId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        templateId: String,
        params: TemplateReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PutTenantTemplateResponse =
        replace(params.toBuilder().templateId(templateId).build(), requestOptions)

    /** @see replace */
    fun replace(params: TemplateReplaceParams): PutTenantTemplateResponse =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: TemplateReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PutTenantTemplateResponse

    /** A view of [TemplateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateService.WithRawResponse

        /**
         * Manage the templates and template versions scoped to a single tenant, including the ones
         * authored in the embedded designer.
         */
        fun versions(): VersionService.WithRawResponse

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

        /**
         * Returns a raw HTTP response for `delete /tenants/{tenant_id}/templates/{template_id}`,
         * but is otherwise the same as [TemplateService.delete].
         */
        @MustBeClosed
        fun delete(templateId: String, params: TemplateDeleteParams): HttpResponse =
            delete(templateId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            templateId: String,
            params: TemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: TemplateDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /tenants/{tenant_id}/templates/{template_id}/publish`, but is otherwise the same as
         * [TemplateService.publish].
         */
        @MustBeClosed
        fun publish(
            templateId: String,
            params: TemplatePublishParams,
        ): HttpResponseFor<PostTenantTemplatePublishResponse> =
            publish(templateId, params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            templateId: String,
            params: TemplatePublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostTenantTemplatePublishResponse> =
            publish(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see publish */
        @MustBeClosed
        fun publish(
            params: TemplatePublishParams
        ): HttpResponseFor<PostTenantTemplatePublishResponse> =
            publish(params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            params: TemplatePublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostTenantTemplatePublishResponse>

        /**
         * Returns a raw HTTP response for `put /tenants/{tenant_id}/templates/{template_id}`, but
         * is otherwise the same as [TemplateService.replace].
         */
        @MustBeClosed
        fun replace(
            templateId: String,
            params: TemplateReplaceParams,
        ): HttpResponseFor<PutTenantTemplateResponse> =
            replace(templateId, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            templateId: String,
            params: TemplateReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PutTenantTemplateResponse> =
            replace(params.toBuilder().templateId(templateId).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(params: TemplateReplaceParams): HttpResponseFor<PutTenantTemplateResponse> =
            replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: TemplateReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PutTenantTemplateResponse>
    }
}

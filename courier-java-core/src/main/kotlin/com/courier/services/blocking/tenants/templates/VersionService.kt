// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.tenants.templates

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.tenants.BaseTemplateTenantAssociation
import com.courier.models.tenants.templates.versions.VersionRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Manage the templates and template versions scoped to a single tenant, including the ones authored
 * in the embedded designer.
 */
interface VersionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionService

    /**
     * Returns one version of a tenant template, addressed by version number or by latest, with its
     * content and publish timestamp.
     */
    fun retrieve(version: String, params: VersionRetrieveParams): BaseTemplateTenantAssociation =
        retrieve(version, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        version: String,
        params: VersionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BaseTemplateTenantAssociation =
        retrieve(params.toBuilder().version(version).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: VersionRetrieveParams): BaseTemplateTenantAssociation =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VersionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BaseTemplateTenantAssociation

    /** A view of [VersionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /tenants/{tenant_id}/templates/{template_id}/versions/{version}`, but is otherwise the
         * same as [VersionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            version: String,
            params: VersionRetrieveParams,
        ): HttpResponseFor<BaseTemplateTenantAssociation> =
            retrieve(version, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            version: String,
            params: VersionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BaseTemplateTenantAssociation> =
            retrieve(params.toBuilder().version(version).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VersionRetrieveParams
        ): HttpResponseFor<BaseTemplateTenantAssociation> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VersionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BaseTemplateTenantAssociation>
    }
}

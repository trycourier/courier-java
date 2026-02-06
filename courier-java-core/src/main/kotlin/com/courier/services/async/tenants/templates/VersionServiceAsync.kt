// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.tenants.templates

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.tenants.BaseTemplateTenantAssociation
import com.courier.models.tenants.templates.versions.VersionRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VersionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionServiceAsync

    /**
     * Fetches a specific version of a tenant template.
     *
     * Supports the following version formats:
     * - `latest` - The most recent version of the template
     * - `published` - The currently published version
     * - `v{version}` - A specific version (e.g., "v1", "v2", "v1.0.0")
     */
    fun retrieve(
        version: String,
        params: VersionRetrieveParams,
    ): CompletableFuture<BaseTemplateTenantAssociation> =
        retrieve(version, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        version: String,
        params: VersionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseTemplateTenantAssociation> =
        retrieve(params.toBuilder().version(version).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: VersionRetrieveParams): CompletableFuture<BaseTemplateTenantAssociation> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VersionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BaseTemplateTenantAssociation>

    /**
     * A view of [VersionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VersionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /tenants/{tenant_id}/templates/{template_id}/versions/{version}`, but is otherwise the
         * same as [VersionServiceAsync.retrieve].
         */
        fun retrieve(
            version: String,
            params: VersionRetrieveParams,
        ): CompletableFuture<HttpResponseFor<BaseTemplateTenantAssociation>> =
            retrieve(version, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            version: String,
            params: VersionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseTemplateTenantAssociation>> =
            retrieve(params.toBuilder().version(version).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: VersionRetrieveParams
        ): CompletableFuture<HttpResponseFor<BaseTemplateTenantAssociation>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: VersionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BaseTemplateTenantAssociation>>
    }
}

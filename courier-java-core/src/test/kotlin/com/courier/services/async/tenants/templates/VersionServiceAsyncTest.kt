// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.tenants.templates

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.tenants.templates.versions.VersionRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VersionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val versionServiceAsync = client.tenants().templates().versions()

        val baseTemplateTenantAssociationFuture =
            versionServiceAsync.retrieve(
                VersionRetrieveParams.builder()
                    .tenantId("tenant_id")
                    .templateId("template_id")
                    .version("version")
                    .build()
            )

        val baseTemplateTenantAssociation = baseTemplateTenantAssociationFuture.get()
        baseTemplateTenantAssociation.validate()
    }
}

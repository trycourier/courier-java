// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.tenants.templates

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.tenants.templates.versions.VersionRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VersionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val versionService = client.tenants().templates().versions()

        val baseTemplateTenantAssociation =
            versionService.retrieve(
                VersionRetrieveParams.builder()
                    .tenantId("tenant_id")
                    .templateId("template_id")
                    .version("version")
                    .build()
            )

        baseTemplateTenantAssociation.validate()
    }
}

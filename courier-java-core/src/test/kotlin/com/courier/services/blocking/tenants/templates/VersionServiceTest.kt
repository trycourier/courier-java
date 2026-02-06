// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.tenants.templates

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.tenants.templates.versions.VersionRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VersionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

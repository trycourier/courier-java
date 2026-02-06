// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.tenants.templates

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.tenants.templates.versions.VersionRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VersionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

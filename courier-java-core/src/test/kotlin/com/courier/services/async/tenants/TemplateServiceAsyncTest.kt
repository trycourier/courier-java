// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.tenants

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.tenants.templates.TemplateListParams
import com.courier.models.tenants.templates.TemplateRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TemplateServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateServiceAsync = client.tenants().templates()

        val baseTemplateTenantAssociationFuture =
            templateServiceAsync.retrieve(
                TemplateRetrieveParams.builder()
                    .tenantId("tenant_id")
                    .templateId("template_id")
                    .build()
            )

        val baseTemplateTenantAssociation = baseTemplateTenantAssociationFuture.get()
        baseTemplateTenantAssociation.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val templateServiceAsync = client.tenants().templates()

        val templatesFuture =
            templateServiceAsync.list(
                TemplateListParams.builder()
                    .tenantId("tenant_id")
                    .cursor("cursor")
                    .limit(0L)
                    .build()
            )

        val templates = templatesFuture.get()
        templates.validate()
    }
}

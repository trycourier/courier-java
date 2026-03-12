// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.tenants

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.core.JsonValue
import com.courier.models.ElementalContent
import com.courier.models.ElementalTextNodeWithType
import com.courier.models.MessageRouting
import com.courier.models.tenants.PostTenantTemplatePublishRequest
import com.courier.models.tenants.PutTenantTemplateRequest
import com.courier.models.tenants.TenantTemplateInput
import com.courier.models.tenants.templates.TemplateListParams
import com.courier.models.tenants.templates.TemplatePublishParams
import com.courier.models.tenants.templates.TemplateReplaceParams
import com.courier.models.tenants.templates.TemplateRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TemplateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun publish() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.tenants().templates()

        val postTenantTemplatePublishResponseFuture =
            templateServiceAsync.publish(
                TemplatePublishParams.builder()
                    .tenantId("tenant_id")
                    .templateId("template_id")
                    .postTenantTemplatePublishRequest(
                        PostTenantTemplatePublishRequest.builder().version("version").build()
                    )
                    .build()
            )

        val postTenantTemplatePublishResponse = postTenantTemplatePublishResponseFuture.get()
        postTenantTemplatePublishResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.tenants().templates()

        val putTenantTemplateResponseFuture =
            templateServiceAsync.replace(
                TemplateReplaceParams.builder()
                    .tenantId("tenant_id")
                    .templateId("template_id")
                    .putTenantTemplateRequest(
                        PutTenantTemplateRequest.builder()
                            .template(
                                TenantTemplateInput.builder()
                                    .content(
                                        ElementalContent.builder()
                                            .addElement(
                                                ElementalTextNodeWithType.builder()
                                                    .addChannel("string")
                                                    .if_("if")
                                                    .loop("loop")
                                                    .ref("ref")
                                                    .type(ElementalTextNodeWithType.Type.TEXT)
                                                    .build()
                                            )
                                            .version("version")
                                            .build()
                                    )
                                    .channels(
                                        TenantTemplateInput.Channels.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(
                                                    mapOf(
                                                        "brand_id" to "brand_id",
                                                        "if" to "if",
                                                        "metadata" to
                                                            mapOf(
                                                                "utm" to
                                                                    mapOf(
                                                                        "campaign" to "campaign",
                                                                        "content" to "content",
                                                                        "medium" to "medium",
                                                                        "source" to "source",
                                                                        "term" to "term",
                                                                    )
                                                            ),
                                                        "override" to mapOf("foo" to "bar"),
                                                        "providers" to listOf("string"),
                                                        "routing_method" to "all",
                                                        "timeouts" to
                                                            mapOf("channel" to 0, "provider" to 0),
                                                    )
                                                ),
                                            )
                                            .build()
                                    )
                                    .providers(
                                        TenantTemplateInput.Providers.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(
                                                    mapOf(
                                                        "if" to "if",
                                                        "metadata" to
                                                            mapOf(
                                                                "utm" to
                                                                    mapOf(
                                                                        "campaign" to "campaign",
                                                                        "content" to "content",
                                                                        "medium" to "medium",
                                                                        "source" to "source",
                                                                        "term" to "term",
                                                                    )
                                                            ),
                                                        "override" to mapOf("foo" to "bar"),
                                                        "timeouts" to 0,
                                                    )
                                                ),
                                            )
                                            .build()
                                    )
                                    .routing(
                                        MessageRouting.builder()
                                            .addChannel("string")
                                            .method(MessageRouting.Method.ALL)
                                            .build()
                                    )
                                    .build()
                            )
                            .published(true)
                            .build()
                    )
                    .build()
            )

        val putTenantTemplateResponse = putTenantTemplateResponseFuture.get()
        putTenantTemplateResponse.validate()
    }
}

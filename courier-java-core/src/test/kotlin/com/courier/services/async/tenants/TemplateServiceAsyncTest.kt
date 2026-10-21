// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.tenants

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.core.JsonValue
import com.courier.models.ElementalChannelNode
import com.courier.models.ElementalChannelNodeWithType
import com.courier.models.ElementalContent
import com.courier.models.ElementalNodeNonChannel
import com.courier.models.ElementalTextNode
import com.courier.models.Locales
import com.courier.models.MessageChannels
import com.courier.models.MessageProviders
import com.courier.models.MessageRouting
import com.courier.models.TextStyle
import com.courier.models.tenants.PostTenantTemplatePublishRequest
import com.courier.models.tenants.PutTenantTemplateRequest
import com.courier.models.tenants.TenantTemplateInput
import com.courier.models.tenants.templates.TemplateDeleteParams
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
    fun delete() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val templateServiceAsync = client.tenants().templates()

        val future =
            templateServiceAsync.delete(
                TemplateDeleteParams.builder()
                    .tenantId("tenant_id")
                    .templateId("template_id")
                    .build()
            )

        val response = future.get()
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
                        PostTenantTemplatePublishRequest.builder().version("latest").build()
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
                                                ElementalChannelNodeWithType.builder()
                                                    .addChannel("string")
                                                    .if_("if")
                                                    .loop("loop")
                                                    .ref("ref")
                                                    .channel("email")
                                                    .addElement(
                                                        ElementalNodeNonChannel.UnionMember0
                                                            .builder()
                                                            .addChannel("string")
                                                            .if_("if")
                                                            .loop("loop")
                                                            .ref("ref")
                                                            .align(ElementalTextNode.Align.LEFT)
                                                            .bold("bold")
                                                            .color("color")
                                                            .content("Hello {{name}}")
                                                            .fontSize("font_size")
                                                            .format(
                                                                ElementalTextNode.Format.MARKDOWN
                                                            )
                                                            .italic("italic")
                                                            .lineHeight("line_height")
                                                            .locales(
                                                                Locales.builder()
                                                                    .putAdditionalProperty(
                                                                        "foo",
                                                                        JsonValue.from(
                                                                            mapOf(
                                                                                "content" to
                                                                                    "content"
                                                                            )
                                                                        ),
                                                                    )
                                                                    .build()
                                                            )
                                                            .strikethrough("strikethrough")
                                                            .textStyle(TextStyle.TEXT)
                                                            .underline("underline")
                                                            .type(
                                                                ElementalNodeNonChannel.UnionMember0
                                                                    .Type
                                                                    .TEXT
                                                            )
                                                            .build()
                                                    )
                                                    .fontSize("font_size")
                                                    .lineHeight("line_height")
                                                    .padding("padding")
                                                    .raw(
                                                        ElementalChannelNode.Raw.builder()
                                                            .putAdditionalProperty(
                                                                "foo",
                                                                JsonValue.from("bar"),
                                                            )
                                                            .build()
                                                    )
                                                    .type(ElementalChannelNodeWithType.Type.CHANNEL)
                                                    .build()
                                            )
                                            .version("2022-01-01")
                                            .build()
                                    )
                                    .channels(
                                        MessageChannels.builder()
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
                                        MessageProviders.builder()
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
                                            .addChannel("email")
                                            .method(MessageRouting.Method.SINGLE)
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

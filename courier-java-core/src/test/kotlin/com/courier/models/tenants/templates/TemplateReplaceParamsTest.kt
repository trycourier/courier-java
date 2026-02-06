// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants.templates

import com.courier.core.JsonValue
import com.courier.models.ElementalContent
import com.courier.models.ElementalTextNodeWithType
import com.courier.models.MessageRouting
import com.courier.models.tenants.PutTenantTemplateRequest
import com.courier.models.tenants.TenantTemplateInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateReplaceParamsTest {

    @Test
    fun create() {
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
                                    .brand("brand")
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
                                                "timeouts" to mapOf("channel" to 0, "provider" to 0),
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
    }

    @Test
    fun pathParams() {
        val params =
            TemplateReplaceParams.builder()
                .tenantId("tenant_id")
                .templateId("template_id")
                .putTenantTemplateRequest(
                    PutTenantTemplateRequest.builder()
                        .template(
                            TenantTemplateInput.builder()
                                .content(
                                    ElementalContent.builder()
                                        .addElement(ElementalTextNodeWithType.builder().build())
                                        .version("version")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("tenant_id")
        assertThat(params._pathParam(1)).isEqualTo("template_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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
                                        .brand("brand")
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                                    .brand("brand")
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
                                                "timeouts" to mapOf("channel" to 0, "provider" to 0),
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TemplateReplaceParams.builder()
                .tenantId("tenant_id")
                .templateId("template_id")
                .putTenantTemplateRequest(
                    PutTenantTemplateRequest.builder()
                        .template(
                            TenantTemplateInput.builder()
                                .content(
                                    ElementalContent.builder()
                                        .addElement(ElementalTextNodeWithType.builder().build())
                                        .version("version")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PutTenantTemplateRequest.builder()
                    .template(
                        TenantTemplateInput.builder()
                            .content(
                                ElementalContent.builder()
                                    .addElement(ElementalTextNodeWithType.builder().build())
                                    .version("version")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }
}

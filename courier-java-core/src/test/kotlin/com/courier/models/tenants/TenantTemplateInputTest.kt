// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.ElementalContent
import com.courier.models.ElementalTextNodeWithType
import com.courier.models.MessageRouting
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenantTemplateInputTest {

    @Test
    fun create() {
        val tenantTemplateInput =
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

        assertThat(tenantTemplateInput.content())
            .isEqualTo(
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
        assertThat(tenantTemplateInput.channels())
            .contains(
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
        assertThat(tenantTemplateInput.providers())
            .contains(
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
        assertThat(tenantTemplateInput.routing())
            .contains(
                MessageRouting.builder()
                    .addChannel("string")
                    .method(MessageRouting.Method.ALL)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tenantTemplateInput =
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

        val roundtrippedTenantTemplateInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tenantTemplateInput),
                jacksonTypeRef<TenantTemplateInput>(),
            )

        assertThat(roundtrippedTenantTemplateInput).isEqualTo(tenantTemplateInput)
    }
}

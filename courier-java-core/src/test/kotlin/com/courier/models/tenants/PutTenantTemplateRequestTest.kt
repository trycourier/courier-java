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

internal class PutTenantTemplateRequestTest {

    @Test
    fun create() {
        val putTenantTemplateRequest =
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

        assertThat(putTenantTemplateRequest.template())
            .isEqualTo(
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
        assertThat(putTenantTemplateRequest.published()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val putTenantTemplateRequest =
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

        val roundtrippedPutTenantTemplateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(putTenantTemplateRequest),
                jacksonTypeRef<PutTenantTemplateRequest>(),
            )

        assertThat(roundtrippedPutTenantTemplateRequest).isEqualTo(putTenantTemplateRequest)
    }
}

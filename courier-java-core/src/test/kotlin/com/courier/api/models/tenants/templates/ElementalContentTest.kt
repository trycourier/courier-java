// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.tenants.templates

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalContentTest {

    @Test
    fun create() {
        val elementalContent =
            ElementalContent.builder()
                .addElement(
                    ElementalNode.UnionMember0.builder()
                        .addChannel("string")
                        .if_("if")
                        .loop("loop")
                        .ref("ref")
                        .type(ElementalNode.UnionMember0.Type.TEXT)
                        .build()
                )
                .version("version")
                .brand(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(elementalContent.elements())
            .containsExactly(
                ElementalNode.ofUnionMember0(
                    ElementalNode.UnionMember0.builder()
                        .addChannel("string")
                        .if_("if")
                        .loop("loop")
                        .ref("ref")
                        .type(ElementalNode.UnionMember0.Type.TEXT)
                        .build()
                )
            )
        assertThat(elementalContent.version()).isEqualTo("version")
        assertThat(elementalContent._brand()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalContent =
            ElementalContent.builder()
                .addElement(
                    ElementalNode.UnionMember0.builder()
                        .addChannel("string")
                        .if_("if")
                        .loop("loop")
                        .ref("ref")
                        .type(ElementalNode.UnionMember0.Type.TEXT)
                        .build()
                )
                .version("version")
                .brand(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedElementalContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalContent),
                jacksonTypeRef<ElementalContent>(),
            )

        assertThat(roundtrippedElementalContent).isEqualTo(elementalContent)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.tenants.templates

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
                    ElementalContent.Element.UnionMember0.builder()
                        .addChannel("string")
                        .if_("if")
                        .loop("loop")
                        .ref("ref")
                        .type(ElementalContent.Element.UnionMember0.Type.TEXT)
                        .build()
                )
                .version("version")
                .brand("brand")
                .build()

        assertThat(elementalContent.elements())
            .containsExactly(
                ElementalContent.Element.ofUnionMember0(
                    ElementalContent.Element.UnionMember0.builder()
                        .addChannel("string")
                        .if_("if")
                        .loop("loop")
                        .ref("ref")
                        .type(ElementalContent.Element.UnionMember0.Type.TEXT)
                        .build()
                )
            )
        assertThat(elementalContent.version()).isEqualTo("version")
        assertThat(elementalContent.brand()).contains("brand")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalContent =
            ElementalContent.builder()
                .addElement(
                    ElementalContent.Element.UnionMember0.builder()
                        .addChannel("string")
                        .if_("if")
                        .loop("loop")
                        .ref("ref")
                        .type(ElementalContent.Element.UnionMember0.Type.TEXT)
                        .build()
                )
                .version("version")
                .brand("brand")
                .build()

        val roundtrippedElementalContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalContent),
                jacksonTypeRef<ElementalContent>(),
            )

        assertThat(roundtrippedElementalContent).isEqualTo(elementalContent)
    }
}

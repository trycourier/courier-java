// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.tenants.templates

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalGroupNodeTest {

    @Test
    fun create() {
        val elementalGroupNode =
            ElementalGroupNode.builder()
                .addElement(
                    ElementalNode.UnionMember0.builder()
                        .addChannel("string")
                        .if_("if")
                        .loop("loop")
                        .ref("ref")
                        .type(ElementalNode.UnionMember0.Type.TEXT)
                        .build()
                )
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .build()

        assertThat(elementalGroupNode.elements())
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
        assertThat(elementalGroupNode.channels().getOrNull()).containsExactly("string")
        assertThat(elementalGroupNode.if_()).contains("if")
        assertThat(elementalGroupNode.loop()).contains("loop")
        assertThat(elementalGroupNode.ref()).contains("ref")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalGroupNode =
            ElementalGroupNode.builder()
                .addElement(
                    ElementalNode.UnionMember0.builder()
                        .addChannel("string")
                        .if_("if")
                        .loop("loop")
                        .ref("ref")
                        .type(ElementalNode.UnionMember0.Type.TEXT)
                        .build()
                )
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .build()

        val roundtrippedElementalGroupNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalGroupNode),
                jacksonTypeRef<ElementalGroupNode>(),
            )

        assertThat(roundtrippedElementalGroupNode).isEqualTo(elementalGroupNode)
    }
}

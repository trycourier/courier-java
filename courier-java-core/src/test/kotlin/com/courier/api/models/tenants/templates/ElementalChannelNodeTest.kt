// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.tenants.templates

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalChannelNodeTest {

    @Test
    fun create() {
        val elementalChannelNode =
            ElementalChannelNode.builder()
                .channel("channel")
                .addChannel("string")
                .addElement(
                    ElementalNode.UnionMember0.builder()
                        .addChannel("string")
                        .if_("if")
                        .loop("loop")
                        .ref("ref")
                        .type(ElementalNode.UnionMember0.Type.TEXT)
                        .build()
                )
                .if_("if")
                .loop("loop")
                .raw(
                    ElementalChannelNode.Raw.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .ref("ref")
                .build()

        assertThat(elementalChannelNode.channel()).isEqualTo("channel")
        assertThat(elementalChannelNode.channels().getOrNull()).containsExactly("string")
        assertThat(elementalChannelNode.elements().getOrNull())
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
        assertThat(elementalChannelNode.if_()).contains("if")
        assertThat(elementalChannelNode.loop()).contains("loop")
        assertThat(elementalChannelNode.raw())
            .contains(
                ElementalChannelNode.Raw.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(elementalChannelNode.ref()).contains("ref")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalChannelNode =
            ElementalChannelNode.builder()
                .channel("channel")
                .addChannel("string")
                .addElement(
                    ElementalNode.UnionMember0.builder()
                        .addChannel("string")
                        .if_("if")
                        .loop("loop")
                        .ref("ref")
                        .type(ElementalNode.UnionMember0.Type.TEXT)
                        .build()
                )
                .if_("if")
                .loop("loop")
                .raw(
                    ElementalChannelNode.Raw.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .ref("ref")
                .build()

        val roundtrippedElementalChannelNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalChannelNode),
                jacksonTypeRef<ElementalChannelNode>(),
            )

        assertThat(roundtrippedElementalChannelNode).isEqualTo(elementalChannelNode)
    }
}

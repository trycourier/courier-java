// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalChannelNodeTest {

    @Test
    fun create() {
        val elementalChannelNode =
            ElementalChannelNode.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .channel("email")
                .raw(
                    ElementalChannelNode.Raw.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(elementalChannelNode.channels().getOrNull()).containsExactly("string")
        assertThat(elementalChannelNode.if_()).contains("if")
        assertThat(elementalChannelNode.loop()).contains("loop")
        assertThat(elementalChannelNode.ref()).contains("ref")
        assertThat(elementalChannelNode.channel()).isEqualTo("email")
        assertThat(elementalChannelNode.raw())
            .contains(
                ElementalChannelNode.Raw.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalChannelNode =
            ElementalChannelNode.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .channel("email")
                .raw(
                    ElementalChannelNode.Raw.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedElementalChannelNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalChannelNode),
                jacksonTypeRef<ElementalChannelNode>(),
            )

        assertThat(roundtrippedElementalChannelNode).isEqualTo(elementalChannelNode)
    }
}

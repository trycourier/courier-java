// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalDividerNodeTest {

    @Test
    fun create() {
        val elementalDividerNode =
            ElementalDividerNode.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .color("color")
                .build()

        assertThat(elementalDividerNode.channels().getOrNull()).containsExactly("string")
        assertThat(elementalDividerNode.if_()).contains("if")
        assertThat(elementalDividerNode.loop()).contains("loop")
        assertThat(elementalDividerNode.ref()).contains("ref")
        assertThat(elementalDividerNode.color()).contains("color")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalDividerNode =
            ElementalDividerNode.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .color("color")
                .build()

        val roundtrippedElementalDividerNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalDividerNode),
                jacksonTypeRef<ElementalDividerNode>(),
            )

        assertThat(roundtrippedElementalDividerNode).isEqualTo(elementalDividerNode)
    }
}

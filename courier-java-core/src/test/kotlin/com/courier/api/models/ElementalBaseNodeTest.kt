// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalBaseNodeTest {

    @Test
    fun create() {
        val elementalBaseNode =
            ElementalBaseNode.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .build()

        assertThat(elementalBaseNode.channels().getOrNull()).containsExactly("string")
        assertThat(elementalBaseNode.if_()).contains("if")
        assertThat(elementalBaseNode.loop()).contains("loop")
        assertThat(elementalBaseNode.ref()).contains("ref")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalBaseNode =
            ElementalBaseNode.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .build()

        val roundtrippedElementalBaseNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalBaseNode),
                jacksonTypeRef<ElementalBaseNode>(),
            )

        assertThat(roundtrippedElementalBaseNode).isEqualTo(elementalBaseNode)
    }
}

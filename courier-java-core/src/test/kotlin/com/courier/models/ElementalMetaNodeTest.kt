// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalMetaNodeTest {

    @Test
    fun create() {
        val elementalMetaNode =
            ElementalMetaNode.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .title("title")
                .build()

        assertThat(elementalMetaNode.channels().getOrNull()).containsExactly("string")
        assertThat(elementalMetaNode.if_()).contains("if")
        assertThat(elementalMetaNode.loop()).contains("loop")
        assertThat(elementalMetaNode.ref()).contains("ref")
        assertThat(elementalMetaNode.title()).contains("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalMetaNode =
            ElementalMetaNode.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .title("title")
                .build()

        val roundtrippedElementalMetaNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalMetaNode),
                jacksonTypeRef<ElementalMetaNode>(),
            )

        assertThat(roundtrippedElementalMetaNode).isEqualTo(elementalMetaNode)
    }
}

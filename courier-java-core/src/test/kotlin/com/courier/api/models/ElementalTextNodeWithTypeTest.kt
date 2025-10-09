// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalTextNodeWithTypeTest {

    @Test
    fun create() {
        val elementalTextNodeWithType =
            ElementalTextNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .type(ElementalTextNodeWithType.Type.TEXT)
                .build()

        assertThat(elementalTextNodeWithType.channels().getOrNull()).containsExactly("string")
        assertThat(elementalTextNodeWithType.if_()).contains("if")
        assertThat(elementalTextNodeWithType.loop()).contains("loop")
        assertThat(elementalTextNodeWithType.ref()).contains("ref")
        assertThat(elementalTextNodeWithType.type()).contains(ElementalTextNodeWithType.Type.TEXT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalTextNodeWithType =
            ElementalTextNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .type(ElementalTextNodeWithType.Type.TEXT)
                .build()

        val roundtrippedElementalTextNodeWithType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalTextNodeWithType),
                jacksonTypeRef<ElementalTextNodeWithType>(),
            )

        assertThat(roundtrippedElementalTextNodeWithType).isEqualTo(elementalTextNodeWithType)
    }
}

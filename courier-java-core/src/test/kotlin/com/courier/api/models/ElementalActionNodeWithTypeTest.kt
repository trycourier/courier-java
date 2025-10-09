// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalActionNodeWithTypeTest {

    @Test
    fun create() {
        val elementalActionNodeWithType =
            ElementalActionNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .type(ElementalActionNodeWithType.Type.ACTION)
                .build()

        assertThat(elementalActionNodeWithType.channels().getOrNull()).containsExactly("string")
        assertThat(elementalActionNodeWithType.if_()).contains("if")
        assertThat(elementalActionNodeWithType.loop()).contains("loop")
        assertThat(elementalActionNodeWithType.ref()).contains("ref")
        assertThat(elementalActionNodeWithType.type())
            .contains(ElementalActionNodeWithType.Type.ACTION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalActionNodeWithType =
            ElementalActionNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .type(ElementalActionNodeWithType.Type.ACTION)
                .build()

        val roundtrippedElementalActionNodeWithType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalActionNodeWithType),
                jacksonTypeRef<ElementalActionNodeWithType>(),
            )

        assertThat(roundtrippedElementalActionNodeWithType).isEqualTo(elementalActionNodeWithType)
    }
}

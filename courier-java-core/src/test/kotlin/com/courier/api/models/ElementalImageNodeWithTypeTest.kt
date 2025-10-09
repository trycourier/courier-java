// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalImageNodeWithTypeTest {

    @Test
    fun create() {
        val elementalImageNodeWithType =
            ElementalImageNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .type(ElementalImageNodeWithType.Type.IMAGE)
                .build()

        assertThat(elementalImageNodeWithType.channels().getOrNull()).containsExactly("string")
        assertThat(elementalImageNodeWithType.if_()).contains("if")
        assertThat(elementalImageNodeWithType.loop()).contains("loop")
        assertThat(elementalImageNodeWithType.ref()).contains("ref")
        assertThat(elementalImageNodeWithType.type())
            .contains(ElementalImageNodeWithType.Type.IMAGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalImageNodeWithType =
            ElementalImageNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .type(ElementalImageNodeWithType.Type.IMAGE)
                .build()

        val roundtrippedElementalImageNodeWithType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalImageNodeWithType),
                jacksonTypeRef<ElementalImageNodeWithType>(),
            )

        assertThat(roundtrippedElementalImageNodeWithType).isEqualTo(elementalImageNodeWithType)
    }
}

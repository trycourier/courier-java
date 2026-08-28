// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalActionNodeWithTypeTest {

    @Test
    fun create() {
        val elementalActionNodeWithType =
            ElementalActionNodeWithType.builder()
                .type(ElementalActionNodeWithType.Type.ACTION)
                .build()

        assertThat(elementalActionNodeWithType.type())
            .contains(ElementalActionNodeWithType.Type.ACTION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalActionNodeWithType =
            ElementalActionNodeWithType.builder()
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

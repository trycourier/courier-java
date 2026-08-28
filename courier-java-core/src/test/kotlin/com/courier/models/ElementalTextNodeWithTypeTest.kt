// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalTextNodeWithTypeTest {

    @Test
    fun create() {
        val elementalTextNodeWithType =
            ElementalTextNodeWithType.builder().type(ElementalTextNodeWithType.Type.TEXT).build()

        assertThat(elementalTextNodeWithType.type()).contains(ElementalTextNodeWithType.Type.TEXT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalTextNodeWithType =
            ElementalTextNodeWithType.builder().type(ElementalTextNodeWithType.Type.TEXT).build()

        val roundtrippedElementalTextNodeWithType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalTextNodeWithType),
                jacksonTypeRef<ElementalTextNodeWithType>(),
            )

        assertThat(roundtrippedElementalTextNodeWithType).isEqualTo(elementalTextNodeWithType)
    }
}

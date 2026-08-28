// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalImageNodeWithTypeTest {

    @Test
    fun create() {
        val elementalImageNodeWithType =
            ElementalImageNodeWithType.builder().type(ElementalImageNodeWithType.Type.IMAGE).build()

        assertThat(elementalImageNodeWithType.type())
            .contains(ElementalImageNodeWithType.Type.IMAGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalImageNodeWithType =
            ElementalImageNodeWithType.builder().type(ElementalImageNodeWithType.Type.IMAGE).build()

        val roundtrippedElementalImageNodeWithType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalImageNodeWithType),
                jacksonTypeRef<ElementalImageNodeWithType>(),
            )

        assertThat(roundtrippedElementalImageNodeWithType).isEqualTo(elementalImageNodeWithType)
    }
}

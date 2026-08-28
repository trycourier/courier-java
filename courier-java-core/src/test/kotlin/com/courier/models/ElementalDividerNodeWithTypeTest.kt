// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalDividerNodeWithTypeTest {

    @Test
    fun create() {
        val elementalDividerNodeWithType =
            ElementalDividerNodeWithType.builder()
                .type(ElementalDividerNodeWithType.Type.DIVIDER)
                .build()

        assertThat(elementalDividerNodeWithType.type())
            .contains(ElementalDividerNodeWithType.Type.DIVIDER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalDividerNodeWithType =
            ElementalDividerNodeWithType.builder()
                .type(ElementalDividerNodeWithType.Type.DIVIDER)
                .build()

        val roundtrippedElementalDividerNodeWithType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalDividerNodeWithType),
                jacksonTypeRef<ElementalDividerNodeWithType>(),
            )

        assertThat(roundtrippedElementalDividerNodeWithType).isEqualTo(elementalDividerNodeWithType)
    }
}

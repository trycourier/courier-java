// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalMetaNodeWithTypeTest {

    @Test
    fun create() {
        val elementalMetaNodeWithType =
            ElementalMetaNodeWithType.builder().type(ElementalMetaNodeWithType.Type.META).build()

        assertThat(elementalMetaNodeWithType.type()).contains(ElementalMetaNodeWithType.Type.META)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalMetaNodeWithType =
            ElementalMetaNodeWithType.builder().type(ElementalMetaNodeWithType.Type.META).build()

        val roundtrippedElementalMetaNodeWithType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalMetaNodeWithType),
                jacksonTypeRef<ElementalMetaNodeWithType>(),
            )

        assertThat(roundtrippedElementalMetaNodeWithType).isEqualTo(elementalMetaNodeWithType)
    }
}

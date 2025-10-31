// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalChannelNodeWithTypeTest {

    @Test
    fun create() {
        val elementalChannelNodeWithType =
            ElementalChannelNodeWithType.builder()
                .type(ElementalChannelNodeWithType.Type.CHANNEL)
                .build()

        assertThat(elementalChannelNodeWithType.type())
            .contains(ElementalChannelNodeWithType.Type.CHANNEL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalChannelNodeWithType =
            ElementalChannelNodeWithType.builder()
                .type(ElementalChannelNodeWithType.Type.CHANNEL)
                .build()

        val roundtrippedElementalChannelNodeWithType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalChannelNodeWithType),
                jacksonTypeRef<ElementalChannelNodeWithType>(),
            )

        assertThat(roundtrippedElementalChannelNodeWithType).isEqualTo(elementalChannelNodeWithType)
    }
}

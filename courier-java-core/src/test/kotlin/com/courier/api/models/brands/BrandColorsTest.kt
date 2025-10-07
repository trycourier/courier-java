// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandColorsTest {

    @Test
    fun create() {
        val brandColors = BrandColors.builder().primary("primary").secondary("secondary").build()

        assertThat(brandColors.primary()).contains("primary")
        assertThat(brandColors.secondary()).contains("secondary")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandColors = BrandColors.builder().primary("primary").secondary("secondary").build()

        val roundtrippedBrandColors =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandColors),
                jacksonTypeRef<BrandColors>(),
            )

        assertThat(roundtrippedBrandColors).isEqualTo(brandColors)
    }
}

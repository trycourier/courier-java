// File generated from our OpenAPI spec by Stainless.

package com.courier.models.brands

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IconsTest {

    @Test
    fun create() {
        val icons = Icons.builder().bell("bell").message("message").build()

        assertThat(icons.bell()).contains("bell")
        assertThat(icons.message()).contains("message")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val icons = Icons.builder().bell("bell").message("message").build()

        val roundtrippedIcons =
            jsonMapper.readValue(jsonMapper.writeValueAsString(icons), jacksonTypeRef<Icons>())

        assertThat(roundtrippedIcons).isEqualTo(icons)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.brands

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogoTest {

    @Test
    fun create() {
        val logo = Logo.builder().href("href").image("image").build()

        assertThat(logo.href()).contains("href")
        assertThat(logo.image()).contains("image")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logo = Logo.builder().href("href").image("image").build()

        val roundtrippedLogo =
            jsonMapper.readValue(jsonMapper.writeValueAsString(logo), jacksonTypeRef<Logo>())

        assertThat(roundtrippedLogo).isEqualTo(logo)
    }
}

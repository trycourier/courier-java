// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailHeaderTest {

    @Test
    fun create() {
        val emailHeader =
            EmailHeader.builder()
                .logo(Logo.builder().href("href").image("image").build())
                .barColor("barColor")
                .inheritDefault(true)
                .build()

        assertThat(emailHeader.logo()).isEqualTo(Logo.builder().href("href").image("image").build())
        assertThat(emailHeader.barColor()).contains("barColor")
        assertThat(emailHeader.inheritDefault()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailHeader =
            EmailHeader.builder()
                .logo(Logo.builder().href("href").image("image").build())
                .barColor("barColor")
                .inheritDefault(true)
                .build()

        val roundtrippedEmailHeader =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailHeader),
                jacksonTypeRef<EmailHeader>(),
            )

        assertThat(roundtrippedEmailHeader).isEqualTo(emailHeader)
    }
}

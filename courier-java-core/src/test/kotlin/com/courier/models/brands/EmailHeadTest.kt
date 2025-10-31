// File generated from our OpenAPI spec by Stainless.

package com.courier.models.brands

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailHeadTest {

    @Test
    fun create() {
        val emailHead = EmailHead.builder().inheritDefault(true).content("content").build()

        assertThat(emailHead.inheritDefault()).isEqualTo(true)
        assertThat(emailHead.content()).contains("content")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailHead = EmailHead.builder().inheritDefault(true).content("content").build()

        val roundtrippedEmailHead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailHead),
                jacksonTypeRef<EmailHead>(),
            )

        assertThat(roundtrippedEmailHead).isEqualTo(emailHead)
    }
}

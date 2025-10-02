// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailTest {

    @Test
    fun create() {
        val email =
            Email.builder()
                .footer(JsonValue.from(mapOf<String, Any>()))
                .header(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(email._footer()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(email._header()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val email =
            Email.builder()
                .footer(JsonValue.from(mapOf<String, Any>()))
                .header(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedEmail =
            jsonMapper.readValue(jsonMapper.writeValueAsString(email), jacksonTypeRef<Email>())

        assertThat(roundtrippedEmail).isEqualTo(email)
    }
}

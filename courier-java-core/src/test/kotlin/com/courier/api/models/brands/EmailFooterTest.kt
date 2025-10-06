// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailFooterTest {

    @Test
    fun create() {
        val emailFooter =
            EmailFooter.builder()
                .content(JsonValue.from(mapOf<String, Any>()))
                .inheritDefault(true)
                .build()

        assertThat(emailFooter._content()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(emailFooter.inheritDefault()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailFooter =
            EmailFooter.builder()
                .content(JsonValue.from(mapOf<String, Any>()))
                .inheritDefault(true)
                .build()

        val roundtrippedEmailFooter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailFooter),
                jacksonTypeRef<EmailFooter>(),
            )

        assertThat(roundtrippedEmailFooter).isEqualTo(emailFooter)
    }
}

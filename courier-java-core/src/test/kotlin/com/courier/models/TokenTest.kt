// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenTest {

    @Test
    fun create() {
        val token = Token.builder().token("token").build()

        assertThat(token.token()).isEqualTo("token")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val token = Token.builder().token("token").build()

        val roundtrippedToken =
            jsonMapper.readValue(jsonMapper.writeValueAsString(token), jacksonTypeRef<Token>())

        assertThat(roundtrippedToken).isEqualTo(token)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.auth

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthIssueTokenResponseTest {

    @Test
    fun create() {
        val authIssueTokenResponse = AuthIssueTokenResponse.builder().token("token").build()

        assertThat(authIssueTokenResponse.token()).isEqualTo("token")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authIssueTokenResponse = AuthIssueTokenResponse.builder().token("token").build()

        val roundtrippedAuthIssueTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authIssueTokenResponse),
                jacksonTypeRef<AuthIssueTokenResponse>(),
            )

        assertThat(roundtrippedAuthIssueTokenResponse).isEqualTo(authIssueTokenResponse)
    }
}

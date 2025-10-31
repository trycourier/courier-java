// File generated from our OpenAPI spec by Stainless.

package com.courier.models.auth

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthIssueTokenParamsTest {

    @Test
    fun create() {
        AuthIssueTokenParams.builder().expiresIn("expires_in").scope("scope").build()
    }

    @Test
    fun body() {
        val params = AuthIssueTokenParams.builder().expiresIn("expires_in").scope("scope").build()

        val body = params._body()

        assertThat(body.expiresIn()).isEqualTo("expires_in")
        assertThat(body.scope()).isEqualTo("scope")
    }
}

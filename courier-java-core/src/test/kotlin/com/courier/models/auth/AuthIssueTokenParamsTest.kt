// File generated from our OpenAPI spec by Stainless.

package com.courier.models.auth

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthIssueTokenParamsTest {

    @Test
    fun create() {
        AuthIssueTokenParams.builder()
            .expiresIn("\$YOUR_NUMBER days")
            .scope(
                "user_id:\$YOUR_USER_ID write:user-tokens inbox:read:messages inbox:write:events read:preferences write:preferences read:brands"
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthIssueTokenParams.builder()
                .expiresIn("\$YOUR_NUMBER days")
                .scope(
                    "user_id:\$YOUR_USER_ID write:user-tokens inbox:read:messages inbox:write:events read:preferences write:preferences read:brands"
                )
                .build()

        val body = params._body()

        assertThat(body.expiresIn()).isEqualTo("\$YOUR_NUMBER days")
        assertThat(body.scope())
            .isEqualTo(
                "user_id:\$YOUR_USER_ID write:user-tokens inbox:read:messages inbox:write:events read:preferences write:preferences read:brands"
            )
    }
}

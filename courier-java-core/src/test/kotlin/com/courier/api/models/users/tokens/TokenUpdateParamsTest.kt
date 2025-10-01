// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.tokens

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenUpdateParamsTest {

    @Test
    fun create() {
        TokenUpdateParams.builder()
            .userId("user_id")
            .token("token")
            .addPatch(
                TokenUpdateParams.Patch.builder().op("op").path("path").value("value").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TokenUpdateParams.builder()
                .userId("user_id")
                .token("token")
                .addPatch(TokenUpdateParams.Patch.builder().op("op").path("path").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        assertThat(params._pathParam(1)).isEqualTo("token")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TokenUpdateParams.builder()
                .userId("user_id")
                .token("token")
                .addPatch(
                    TokenUpdateParams.Patch.builder().op("op").path("path").value("value").build()
                )
                .build()

        val body = params._body()

        assertThat(body.patch())
            .containsExactly(
                TokenUpdateParams.Patch.builder().op("op").path("path").value("value").build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TokenUpdateParams.builder()
                .userId("user_id")
                .token("token")
                .addPatch(TokenUpdateParams.Patch.builder().op("op").path("path").build())
                .build()

        val body = params._body()

        assertThat(body.patch())
            .containsExactly(TokenUpdateParams.Patch.builder().op("op").path("path").build())
    }
}

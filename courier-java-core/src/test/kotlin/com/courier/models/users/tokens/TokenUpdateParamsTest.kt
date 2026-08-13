// File generated from our OpenAPI spec by Stainless.

package com.courier.models.users.tokens

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenUpdateParamsTest {

    @Test
    fun create() {
        TokenUpdateParams.builder()
            .userId("user_id")
            .token("token")
            .addPatch(
                TokenUpdateParams.Patch.builder()
                    .op("replace")
                    .path("/expiry_date")
                    .value("2024-12-31T00:00:00.000Z")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TokenUpdateParams.builder()
                .userId("user_id")
                .token("token")
                .addPatch(
                    TokenUpdateParams.Patch.builder().op("replace").path("/expiry_date").build()
                )
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
                    TokenUpdateParams.Patch.builder()
                        .op("replace")
                        .path("/expiry_date")
                        .value("2024-12-31T00:00:00.000Z")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.patch())
            .containsExactly(
                TokenUpdateParams.Patch.builder()
                    .op("replace")
                    .path("/expiry_date")
                    .value("2024-12-31T00:00:00.000Z")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TokenUpdateParams.builder()
                .userId("user_id")
                .token("token")
                .addPatch(
                    TokenUpdateParams.Patch.builder().op("replace").path("/expiry_date").build()
                )
                .build()

        val body = params._body()

        assertThat(body.patch())
            .containsExactly(
                TokenUpdateParams.Patch.builder().op("replace").path("/expiry_date").build()
            )
    }
}

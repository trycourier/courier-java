// File generated from our OpenAPI spec by Stainless.

package com.courier.models.profiles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileUpdateParamsTest {

    @Test
    fun create() {
        ProfileUpdateParams.builder()
            .userId("user_id")
            .addPatch(
                ProfileUpdateParams.Patch.builder().op("op").path("path").value("value").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProfileUpdateParams.builder()
                .userId("user_id")
                .addPatch(
                    ProfileUpdateParams.Patch.builder().op("op").path("path").value("value").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProfileUpdateParams.builder()
                .userId("user_id")
                .addPatch(
                    ProfileUpdateParams.Patch.builder().op("op").path("path").value("value").build()
                )
                .build()

        val body = params._body()

        assertThat(body.patch())
            .containsExactly(
                ProfileUpdateParams.Patch.builder().op("op").path("path").value("value").build()
            )
    }
}

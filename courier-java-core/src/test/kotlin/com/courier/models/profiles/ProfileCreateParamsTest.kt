// File generated from our OpenAPI spec by Stainless.

package com.courier.models.profiles

import com.courier.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileCreateParamsTest {

    @Test
    fun create() {
        ProfileCreateParams.builder()
            .userId("user_id")
            .profile(
                ProfileCreateParams.Profile.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProfileCreateParams.builder()
                .userId("user_id")
                .profile(
                    ProfileCreateParams.Profile.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProfileCreateParams.builder()
                .userId("user_id")
                .profile(
                    ProfileCreateParams.Profile.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.profile())
            .isEqualTo(
                ProfileCreateParams.Profile.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }
}

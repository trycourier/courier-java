// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.profiles

import com.courier.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileReplaceParamsTest {

    @Test
    fun create() {
        ProfileReplaceParams.builder()
            .userId("user_id")
            .profile(
                ProfileReplaceParams.Profile.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProfileReplaceParams.builder()
                .userId("user_id")
                .profile(
                    ProfileReplaceParams.Profile.builder()
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
            ProfileReplaceParams.builder()
                .userId("user_id")
                .profile(
                    ProfileReplaceParams.Profile.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.profile())
            .isEqualTo(
                ProfileReplaceParams.Profile.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }
}

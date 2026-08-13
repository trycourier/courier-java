// File generated from our OpenAPI spec by Stainless.

package com.courier.models.profiles

import com.courier.core.JsonValue
import com.courier.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileCreateParamsTest {

    @Test
    fun create() {
        ProfileCreateParams.builder()
            .userId("user_id")
            .idempotencyKey("order-ORD-456-user-123")
            .xIdempotencyExpiration("1785312000")
            .profile(
                ProfileCreateParams.Profile.builder()
                    .putAdditionalProperty("email", JsonValue.from("bar"))
                    .putAdditionalProperty("phone_number", JsonValue.from("bar"))
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
                        .putAdditionalProperty("email", JsonValue.from("bar"))
                        .putAdditionalProperty("phone_number", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            ProfileCreateParams.builder()
                .userId("user_id")
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .profile(
                    ProfileCreateParams.Profile.builder()
                        .putAdditionalProperty("email", JsonValue.from("bar"))
                        .putAdditionalProperty("phone_number", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("Idempotency-Key", "order-ORD-456-user-123")
                    .put("x-idempotency-expiration", "1785312000")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            ProfileCreateParams.builder()
                .userId("user_id")
                .profile(
                    ProfileCreateParams.Profile.builder()
                        .putAdditionalProperty("email", JsonValue.from("bar"))
                        .putAdditionalProperty("phone_number", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            ProfileCreateParams.builder()
                .userId("user_id")
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .profile(
                    ProfileCreateParams.Profile.builder()
                        .putAdditionalProperty("email", JsonValue.from("bar"))
                        .putAdditionalProperty("phone_number", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.profile())
            .isEqualTo(
                ProfileCreateParams.Profile.builder()
                    .putAdditionalProperty("email", JsonValue.from("bar"))
                    .putAdditionalProperty("phone_number", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProfileCreateParams.builder()
                .userId("user_id")
                .profile(
                    ProfileCreateParams.Profile.builder()
                        .putAdditionalProperty("email", JsonValue.from("bar"))
                        .putAdditionalProperty("phone_number", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.profile())
            .isEqualTo(
                ProfileCreateParams.Profile.builder()
                    .putAdditionalProperty("email", JsonValue.from("bar"))
                    .putAdditionalProperty("phone_number", JsonValue.from("bar"))
                    .build()
            )
    }
}

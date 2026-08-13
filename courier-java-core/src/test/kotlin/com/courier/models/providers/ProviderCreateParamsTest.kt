// File generated from our OpenAPI spec by Stainless.

package com.courier.models.providers

import com.courier.core.JsonValue
import com.courier.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProviderCreateParamsTest {

    @Test
    fun create() {
        ProviderCreateParams.builder()
            .idempotencyKey("order-ORD-456-user-123")
            .xIdempotencyExpiration("1785312000")
            .provider("sendgrid")
            .alias("alias")
            .settings(
                ProviderCreateParams.Settings.builder()
                    .putAdditionalProperty("api_key", JsonValue.from("bar"))
                    .build()
            )
            .title("Production SendGrid")
            .build()
    }

    @Test
    fun headers() {
        val params =
            ProviderCreateParams.builder()
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .provider("sendgrid")
                .alias("alias")
                .settings(
                    ProviderCreateParams.Settings.builder()
                        .putAdditionalProperty("api_key", JsonValue.from("bar"))
                        .build()
                )
                .title("Production SendGrid")
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
        val params = ProviderCreateParams.builder().provider("sendgrid").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            ProviderCreateParams.builder()
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .provider("sendgrid")
                .alias("alias")
                .settings(
                    ProviderCreateParams.Settings.builder()
                        .putAdditionalProperty("api_key", JsonValue.from("bar"))
                        .build()
                )
                .title("Production SendGrid")
                .build()

        val body = params._body()

        assertThat(body.provider()).isEqualTo("sendgrid")
        assertThat(body.alias()).contains("alias")
        assertThat(body.settings())
            .contains(
                ProviderCreateParams.Settings.builder()
                    .putAdditionalProperty("api_key", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.title()).contains("Production SendGrid")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProviderCreateParams.builder().provider("sendgrid").build()

        val body = params._body()

        assertThat(body.provider()).isEqualTo("sendgrid")
    }
}

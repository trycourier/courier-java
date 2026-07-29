// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.http.Headers
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyPublishParamsTest {

    @Test
    fun create() {
        JourneyPublishParams.builder()
            .templateId("x")
            .idempotencyKey("order-ORD-456-user-123")
            .xIdempotencyExpiration("1785312000")
            .journeyPublishRequest(JourneyPublishRequest.builder().version("v321669910225").build())
            .build()
    }

    @Test
    fun pathParams() {
        val params = JourneyPublishParams.builder().templateId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            JourneyPublishParams.builder()
                .templateId("x")
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .journeyPublishRequest(
                    JourneyPublishRequest.builder().version("v321669910225").build()
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
        val params = JourneyPublishParams.builder().templateId("x").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            JourneyPublishParams.builder()
                .templateId("x")
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .journeyPublishRequest(
                    JourneyPublishRequest.builder().version("v321669910225").build()
                )
                .build()

        val body = params._body().getOrNull()

        assertThat(body).isEqualTo(JourneyPublishRequest.builder().version("v321669910225").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = JourneyPublishParams.builder().templateId("x").build()

        val body = params._body().getOrNull()
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys.templates

import com.courier.core.http.Headers
import com.courier.models.journeys.JourneyTemplatePublishRequest
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplatePublishParamsTest {

    @Test
    fun create() {
        TemplatePublishParams.builder()
            .templateId("x")
            .notificationId("x")
            .idempotencyKey("order-ORD-456-user-123")
            .xIdempotencyExpiration("1785312000")
            .journeyTemplatePublishRequest(
                JourneyTemplatePublishRequest.builder().version("v321669910225").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = TemplatePublishParams.builder().templateId("x").notificationId("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        assertThat(params._pathParam(1)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            TemplatePublishParams.builder()
                .templateId("x")
                .notificationId("x")
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .journeyTemplatePublishRequest(
                    JourneyTemplatePublishRequest.builder().version("v321669910225").build()
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
        val params = TemplatePublishParams.builder().templateId("x").notificationId("x").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            TemplatePublishParams.builder()
                .templateId("x")
                .notificationId("x")
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .journeyTemplatePublishRequest(
                    JourneyTemplatePublishRequest.builder().version("v321669910225").build()
                )
                .build()

        val body = params._body().getOrNull()

        assertThat(body)
            .isEqualTo(JourneyTemplatePublishRequest.builder().version("v321669910225").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TemplatePublishParams.builder().templateId("x").notificationId("x").build()

        val body = params._body().getOrNull()
    }
}

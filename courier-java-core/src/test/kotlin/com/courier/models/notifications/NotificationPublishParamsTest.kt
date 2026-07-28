// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.http.Headers
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationPublishParamsTest {

    @Test
    fun create() {
        NotificationPublishParams.builder()
            .id("id")
            .idempotencyKey("order-ORD-456-user-123")
            .xIdempotencyExpiration("1785312000")
            .notificationTemplatePublishRequest(
                NotificationTemplatePublishRequest.builder().version("v321669910225").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = NotificationPublishParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            NotificationPublishParams.builder()
                .id("id")
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .notificationTemplatePublishRequest(
                    NotificationTemplatePublishRequest.builder().version("v321669910225").build()
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
        val params = NotificationPublishParams.builder().id("id").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            NotificationPublishParams.builder()
                .id("id")
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .notificationTemplatePublishRequest(
                    NotificationTemplatePublishRequest.builder().version("v321669910225").build()
                )
                .build()

        val body = params._body().getOrNull()

        assertThat(body)
            .isEqualTo(
                NotificationTemplatePublishRequest.builder().version("v321669910225").build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = NotificationPublishParams.builder().id("id").build()

        val body = params._body().getOrNull()
    }
}

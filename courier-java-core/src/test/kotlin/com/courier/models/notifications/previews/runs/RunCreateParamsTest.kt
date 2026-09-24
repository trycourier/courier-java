// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications.previews.runs

import com.courier.core.JsonValue
import com.courier.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunCreateParamsTest {

    @Test
    fun create() {
        RunCreateParams.builder()
            .id("id")
            .idempotencyKey("order-ORD-456-user-123")
            .xIdempotencyExpiration("1785312000")
            .createPreviewRunRequest(
                CreatePreviewRunRequest.builder()
                    .data(
                        CreatePreviewRunRequest.Data.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addDeviceId("pvd_1w6dgafr3aaycvv9a8bm996pkc")
                    .addDeviceId("pvd_34qvmj6p4dbqaa5mpys1ekt9jx")
                    .deviceSetId("device_set_id")
                    .locale("locale")
                    .templateVersion("draft")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RunCreateParams.builder()
                .id("id")
                .createPreviewRunRequest(CreatePreviewRunRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            RunCreateParams.builder()
                .id("id")
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .createPreviewRunRequest(
                    CreatePreviewRunRequest.builder()
                        .data(
                            CreatePreviewRunRequest.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .addDeviceId("pvd_1w6dgafr3aaycvv9a8bm996pkc")
                        .addDeviceId("pvd_34qvmj6p4dbqaa5mpys1ekt9jx")
                        .deviceSetId("device_set_id")
                        .locale("locale")
                        .templateVersion("draft")
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
            RunCreateParams.builder()
                .id("id")
                .createPreviewRunRequest(CreatePreviewRunRequest.builder().build())
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            RunCreateParams.builder()
                .id("id")
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .createPreviewRunRequest(
                    CreatePreviewRunRequest.builder()
                        .data(
                            CreatePreviewRunRequest.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .addDeviceId("pvd_1w6dgafr3aaycvv9a8bm996pkc")
                        .addDeviceId("pvd_34qvmj6p4dbqaa5mpys1ekt9jx")
                        .deviceSetId("device_set_id")
                        .locale("locale")
                        .templateVersion("draft")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreatePreviewRunRequest.builder()
                    .data(
                        CreatePreviewRunRequest.Data.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addDeviceId("pvd_1w6dgafr3aaycvv9a8bm996pkc")
                    .addDeviceId("pvd_34qvmj6p4dbqaa5mpys1ekt9jx")
                    .deviceSetId("device_set_id")
                    .locale("locale")
                    .templateVersion("draft")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RunCreateParams.builder()
                .id("id")
                .createPreviewRunRequest(CreatePreviewRunRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(CreatePreviewRunRequest.builder().build())
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.http.Headers
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspacePreferencePublishParamsTest {

    @Test
    fun create() {
        WorkspacePreferencePublishParams.builder()
            .idempotencyKey("order-ORD-456-user-123")
            .xIdempotencyExpiration("1785312000")
            .publishPreferencesRequest(
                PublishPreferencesRequest.builder()
                    .brandId("brand_id")
                    .description("description")
                    .heading("heading")
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            WorkspacePreferencePublishParams.builder()
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .publishPreferencesRequest(
                    PublishPreferencesRequest.builder()
                        .brandId("brand_id")
                        .description("description")
                        .heading("heading")
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
        val params = WorkspacePreferencePublishParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            WorkspacePreferencePublishParams.builder()
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .publishPreferencesRequest(
                    PublishPreferencesRequest.builder()
                        .brandId("brand_id")
                        .description("description")
                        .heading("heading")
                        .build()
                )
                .build()

        val body = params._body().getOrNull()

        assertThat(body)
            .isEqualTo(
                PublishPreferencesRequest.builder()
                    .brandId("brand_id")
                    .description("description")
                    .heading("heading")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WorkspacePreferencePublishParams.builder().build()

        val body = params._body().getOrNull()
    }
}

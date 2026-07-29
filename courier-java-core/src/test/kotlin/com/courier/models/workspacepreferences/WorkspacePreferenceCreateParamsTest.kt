// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.http.Headers
import com.courier.models.ChannelClassification
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspacePreferenceCreateParamsTest {

    @Test
    fun create() {
        WorkspacePreferenceCreateParams.builder()
            .idempotencyKey("order-ORD-456-user-123")
            .xIdempotencyExpiration("1785312000")
            .workspacePreferenceCreateRequest(
                WorkspacePreferenceCreateRequest.builder()
                    .name("Account Notifications")
                    .description("description")
                    .hasCustomRouting(true)
                    .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            WorkspacePreferenceCreateParams.builder()
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .workspacePreferenceCreateRequest(
                    WorkspacePreferenceCreateRequest.builder()
                        .name("Account Notifications")
                        .description("description")
                        .hasCustomRouting(true)
                        .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
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
            WorkspacePreferenceCreateParams.builder()
                .workspacePreferenceCreateRequest(
                    WorkspacePreferenceCreateRequest.builder().name("Account Notifications").build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            WorkspacePreferenceCreateParams.builder()
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .workspacePreferenceCreateRequest(
                    WorkspacePreferenceCreateRequest.builder()
                        .name("Account Notifications")
                        .description("description")
                        .hasCustomRouting(true)
                        .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                WorkspacePreferenceCreateRequest.builder()
                    .name("Account Notifications")
                    .description("description")
                    .hasCustomRouting(true)
                    .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WorkspacePreferenceCreateParams.builder()
                .workspacePreferenceCreateRequest(
                    WorkspacePreferenceCreateRequest.builder().name("Account Notifications").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                WorkspacePreferenceCreateRequest.builder().name("Account Notifications").build()
            )
    }
}

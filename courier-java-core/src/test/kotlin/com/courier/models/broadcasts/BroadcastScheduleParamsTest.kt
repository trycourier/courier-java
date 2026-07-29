// File generated from our OpenAPI spec by Stainless.

package com.courier.models.broadcasts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastScheduleParamsTest {

    @Test
    fun create() {
        BroadcastScheduleParams.builder()
            .broadcastId("broadcastId")
            .scheduleBroadcastRequest(
                ScheduleBroadcastRequest.builder()
                    .recipientId("aud_01kx4h2jdafq8bk9amzvy6hbv0")
                    .recipientType(ScheduleBroadcastRequest.RecipientType.AUDIENCE)
                    .scheduledTo("2026-08-01T15:00:00")
                    .timezone("America/New_York")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BroadcastScheduleParams.builder()
                .broadcastId("broadcastId")
                .scheduleBroadcastRequest(
                    ScheduleBroadcastRequest.builder()
                        .recipientId("aud_01kx4h2jdafq8bk9amzvy6hbv0")
                        .recipientType(ScheduleBroadcastRequest.RecipientType.AUDIENCE)
                        .scheduledTo("2026-08-01T15:00:00")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("broadcastId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BroadcastScheduleParams.builder()
                .broadcastId("broadcastId")
                .scheduleBroadcastRequest(
                    ScheduleBroadcastRequest.builder()
                        .recipientId("aud_01kx4h2jdafq8bk9amzvy6hbv0")
                        .recipientType(ScheduleBroadcastRequest.RecipientType.AUDIENCE)
                        .scheduledTo("2026-08-01T15:00:00")
                        .timezone("America/New_York")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ScheduleBroadcastRequest.builder()
                    .recipientId("aud_01kx4h2jdafq8bk9amzvy6hbv0")
                    .recipientType(ScheduleBroadcastRequest.RecipientType.AUDIENCE)
                    .scheduledTo("2026-08-01T15:00:00")
                    .timezone("America/New_York")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BroadcastScheduleParams.builder()
                .broadcastId("broadcastId")
                .scheduleBroadcastRequest(
                    ScheduleBroadcastRequest.builder()
                        .recipientId("aud_01kx4h2jdafq8bk9amzvy6hbv0")
                        .recipientType(ScheduleBroadcastRequest.RecipientType.AUDIENCE)
                        .scheduledTo("2026-08-01T15:00:00")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ScheduleBroadcastRequest.builder()
                    .recipientId("aud_01kx4h2jdafq8bk9amzvy6hbv0")
                    .recipientType(ScheduleBroadcastRequest.RecipientType.AUDIENCE)
                    .scheduledTo("2026-08-01T15:00:00")
                    .build()
            )
    }
}

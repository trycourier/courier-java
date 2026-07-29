// File generated from our OpenAPI spec by Stainless.

package com.courier.models.broadcasts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastSendParamsTest {

    @Test
    fun create() {
        BroadcastSendParams.builder()
            .broadcastId("broadcastId")
            .sendBroadcastRequest(
                SendBroadcastRequest.builder()
                    .recipientId("cool-customers")
                    .recipientType(SendBroadcastRequest.RecipientType.LIST)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BroadcastSendParams.builder()
                .broadcastId("broadcastId")
                .sendBroadcastRequest(
                    SendBroadcastRequest.builder()
                        .recipientId("cool-customers")
                        .recipientType(SendBroadcastRequest.RecipientType.LIST)
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
            BroadcastSendParams.builder()
                .broadcastId("broadcastId")
                .sendBroadcastRequest(
                    SendBroadcastRequest.builder()
                        .recipientId("cool-customers")
                        .recipientType(SendBroadcastRequest.RecipientType.LIST)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SendBroadcastRequest.builder()
                    .recipientId("cool-customers")
                    .recipientType(SendBroadcastRequest.RecipientType.LIST)
                    .build()
            )
    }
}

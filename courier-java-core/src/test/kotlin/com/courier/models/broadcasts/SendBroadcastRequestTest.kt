// File generated from our OpenAPI spec by Stainless.

package com.courier.models.broadcasts

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendBroadcastRequestTest {

    @Test
    fun create() {
        val sendBroadcastRequest =
            SendBroadcastRequest.builder()
                .recipientId("recipient_id")
                .recipientType(SendBroadcastRequest.RecipientType.LIST)
                .build()

        assertThat(sendBroadcastRequest.recipientId()).isEqualTo("recipient_id")
        assertThat(sendBroadcastRequest.recipientType())
            .isEqualTo(SendBroadcastRequest.RecipientType.LIST)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sendBroadcastRequest =
            SendBroadcastRequest.builder()
                .recipientId("recipient_id")
                .recipientType(SendBroadcastRequest.RecipientType.LIST)
                .build()

        val roundtrippedSendBroadcastRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sendBroadcastRequest),
                jacksonTypeRef<SendBroadcastRequest>(),
            )

        assertThat(roundtrippedSendBroadcastRequest).isEqualTo(sendBroadcastRequest)
    }
}

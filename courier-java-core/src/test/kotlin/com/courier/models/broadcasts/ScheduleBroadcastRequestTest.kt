// File generated from our OpenAPI spec by Stainless.

package com.courier.models.broadcasts

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduleBroadcastRequestTest {

    @Test
    fun create() {
        val scheduleBroadcastRequest =
            ScheduleBroadcastRequest.builder()
                .recipientId("recipient_id")
                .recipientType(ScheduleBroadcastRequest.RecipientType.LIST)
                .scheduledTo("scheduled_to")
                .timezone("timezone")
                .build()

        assertThat(scheduleBroadcastRequest.recipientId()).isEqualTo("recipient_id")
        assertThat(scheduleBroadcastRequest.recipientType())
            .isEqualTo(ScheduleBroadcastRequest.RecipientType.LIST)
        assertThat(scheduleBroadcastRequest.scheduledTo()).isEqualTo("scheduled_to")
        assertThat(scheduleBroadcastRequest.timezone()).contains("timezone")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scheduleBroadcastRequest =
            ScheduleBroadcastRequest.builder()
                .recipientId("recipient_id")
                .recipientType(ScheduleBroadcastRequest.RecipientType.LIST)
                .scheduledTo("scheduled_to")
                .timezone("timezone")
                .build()

        val roundtrippedScheduleBroadcastRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduleBroadcastRequest),
                jacksonTypeRef<ScheduleBroadcastRequest>(),
            )

        assertThat(roundtrippedScheduleBroadcastRequest).isEqualTo(scheduleBroadcastRequest)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.broadcasts

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastScheduleTest {

    @Test
    fun create() {
        val broadcastSchedule =
            BroadcastSchedule.builder()
                .recipientId("recipient_id")
                .recipientType(BroadcastSchedule.RecipientType.LIST)
                .scheduledTo("scheduled_to")
                .timezone("timezone")
                .build()

        assertThat(broadcastSchedule.recipientId()).isEqualTo("recipient_id")
        assertThat(broadcastSchedule.recipientType())
            .isEqualTo(BroadcastSchedule.RecipientType.LIST)
        assertThat(broadcastSchedule.scheduledTo()).contains("scheduled_to")
        assertThat(broadcastSchedule.timezone()).contains("timezone")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val broadcastSchedule =
            BroadcastSchedule.builder()
                .recipientId("recipient_id")
                .recipientType(BroadcastSchedule.RecipientType.LIST)
                .scheduledTo("scheduled_to")
                .timezone("timezone")
                .build()

        val roundtrippedBroadcastSchedule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(broadcastSchedule),
                jacksonTypeRef<BroadcastSchedule>(),
            )

        assertThat(roundtrippedBroadcastSchedule).isEqualTo(broadcastSchedule)
    }
}

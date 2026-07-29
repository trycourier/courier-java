// File generated from our OpenAPI spec by Stainless.

package com.courier.models.broadcasts

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastTest {

    @Test
    fun create() {
        val broadcast =
            Broadcast.builder()
                .id("id")
                .channel(Broadcast.Channel.EMAIL)
                .createdAt("created_at")
                .createdBy("created_by")
                .name("name")
                .status(Broadcast.Status.DRAFT)
                .updatedAt("updated_at")
                .updatedBy("updated_by")
                .archivedAt("archived_at")
                .archivedBy("archived_by")
                .schedule(
                    BroadcastSchedule.builder()
                        .recipientId("recipient_id")
                        .recipientType(BroadcastSchedule.RecipientType.LIST)
                        .scheduledTo("scheduled_to")
                        .timezone("timezone")
                        .build()
                )
                .build()

        assertThat(broadcast.id()).isEqualTo("id")
        assertThat(broadcast.channel()).isEqualTo(Broadcast.Channel.EMAIL)
        assertThat(broadcast.createdAt()).isEqualTo("created_at")
        assertThat(broadcast.createdBy()).isEqualTo("created_by")
        assertThat(broadcast.name()).isEqualTo("name")
        assertThat(broadcast.status()).isEqualTo(Broadcast.Status.DRAFT)
        assertThat(broadcast.updatedAt()).isEqualTo("updated_at")
        assertThat(broadcast.updatedBy()).isEqualTo("updated_by")
        assertThat(broadcast.archivedAt()).contains("archived_at")
        assertThat(broadcast.archivedBy()).contains("archived_by")
        assertThat(broadcast.schedule())
            .contains(
                BroadcastSchedule.builder()
                    .recipientId("recipient_id")
                    .recipientType(BroadcastSchedule.RecipientType.LIST)
                    .scheduledTo("scheduled_to")
                    .timezone("timezone")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val broadcast =
            Broadcast.builder()
                .id("id")
                .channel(Broadcast.Channel.EMAIL)
                .createdAt("created_at")
                .createdBy("created_by")
                .name("name")
                .status(Broadcast.Status.DRAFT)
                .updatedAt("updated_at")
                .updatedBy("updated_by")
                .archivedAt("archived_at")
                .archivedBy("archived_by")
                .schedule(
                    BroadcastSchedule.builder()
                        .recipientId("recipient_id")
                        .recipientType(BroadcastSchedule.RecipientType.LIST)
                        .scheduledTo("scheduled_to")
                        .timezone("timezone")
                        .build()
                )
                .build()

        val roundtrippedBroadcast =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(broadcast),
                jacksonTypeRef<Broadcast>(),
            )

        assertThat(roundtrippedBroadcast).isEqualTo(broadcast)
    }
}

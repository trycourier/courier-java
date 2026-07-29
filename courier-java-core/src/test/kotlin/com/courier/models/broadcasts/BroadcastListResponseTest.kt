// File generated from our OpenAPI spec by Stainless.

package com.courier.models.broadcasts

import com.courier.core.jsonMapper
import com.courier.models.Paging
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BroadcastListResponseTest {

    @Test
    fun create() {
        val broadcastListResponse =
            BroadcastListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
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
                )
                .build()

        assertThat(broadcastListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
        assertThat(broadcastListResponse.results())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val broadcastListResponse =
            BroadcastListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
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
                )
                .build()

        val roundtrippedBroadcastListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(broadcastListResponse),
                jacksonTypeRef<BroadcastListResponse>(),
            )

        assertThat(roundtrippedBroadcastListResponse).isEqualTo(broadcastListResponse)
    }
}

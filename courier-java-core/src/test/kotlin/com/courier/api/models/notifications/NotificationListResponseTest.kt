// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.notifications

import com.courier.api.core.jsonMapper
import com.courier.api.models.audiences.Paging
import com.courier.api.models.send.MessageRouting
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationListResponseTest {

    @Test
    fun create() {
        val notificationListResponse =
            NotificationListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    NotificationListResponse.Result.builder()
                        .id("id")
                        .createdAt(0L)
                        .note("note")
                        .routing(
                            MessageRouting.builder()
                                .addChannel("string")
                                .method(MessageRouting.Method.ALL)
                                .build()
                        )
                        .topicId("topic_id")
                        .updatedAt(0L)
                        .tags(
                            NotificationListResponse.Result.Tags.builder()
                                .addData(
                                    NotificationListResponse.Result.Tags.Data.builder()
                                        .id("id")
                                        .name("name")
                                        .build()
                                )
                                .build()
                        )
                        .title("title")
                        .build()
                )
                .build()

        assertThat(notificationListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
        assertThat(notificationListResponse.results())
            .containsExactly(
                NotificationListResponse.Result.builder()
                    .id("id")
                    .createdAt(0L)
                    .note("note")
                    .routing(
                        MessageRouting.builder()
                            .addChannel("string")
                            .method(MessageRouting.Method.ALL)
                            .build()
                    )
                    .topicId("topic_id")
                    .updatedAt(0L)
                    .tags(
                        NotificationListResponse.Result.Tags.builder()
                            .addData(
                                NotificationListResponse.Result.Tags.Data.builder()
                                    .id("id")
                                    .name("name")
                                    .build()
                            )
                            .build()
                    )
                    .title("title")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationListResponse =
            NotificationListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    NotificationListResponse.Result.builder()
                        .id("id")
                        .createdAt(0L)
                        .note("note")
                        .routing(
                            MessageRouting.builder()
                                .addChannel("string")
                                .method(MessageRouting.Method.ALL)
                                .build()
                        )
                        .topicId("topic_id")
                        .updatedAt(0L)
                        .tags(
                            NotificationListResponse.Result.Tags.builder()
                                .addData(
                                    NotificationListResponse.Result.Tags.Data.builder()
                                        .id("id")
                                        .name("name")
                                        .build()
                                )
                                .build()
                        )
                        .title("title")
                        .build()
                )
                .build()

        val roundtrippedNotificationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationListResponse),
                jacksonTypeRef<NotificationListResponse>(),
            )

        assertThat(roundtrippedNotificationListResponse).isEqualTo(notificationListResponse)
    }
}

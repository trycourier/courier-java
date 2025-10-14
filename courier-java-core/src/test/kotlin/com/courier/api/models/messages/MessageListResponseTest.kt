// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.messages

import com.courier.api.core.jsonMapper
import com.courier.api.models.MessageDetails
import com.courier.api.models.Paging
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageListResponseTest {

    @Test
    fun create() {
        val messageListResponse =
            MessageListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    MessageDetails.builder()
                        .id("id")
                        .clicked(0L)
                        .delivered(0L)
                        .enqueued(0L)
                        .event("event")
                        .notification("notification")
                        .opened(0L)
                        .recipient("recipient")
                        .sent(0L)
                        .status(MessageDetails.Status.CANCELED)
                        .error("error")
                        .reason(MessageDetails.Reason.BOUNCED)
                        .build()
                )
                .build()

        assertThat(messageListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
        assertThat(messageListResponse.results())
            .containsExactly(
                MessageDetails.builder()
                    .id("id")
                    .clicked(0L)
                    .delivered(0L)
                    .enqueued(0L)
                    .event("event")
                    .notification("notification")
                    .opened(0L)
                    .recipient("recipient")
                    .sent(0L)
                    .status(MessageDetails.Status.CANCELED)
                    .error("error")
                    .reason(MessageDetails.Reason.BOUNCED)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageListResponse =
            MessageListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    MessageDetails.builder()
                        .id("id")
                        .clicked(0L)
                        .delivered(0L)
                        .enqueued(0L)
                        .event("event")
                        .notification("notification")
                        .opened(0L)
                        .recipient("recipient")
                        .sent(0L)
                        .status(MessageDetails.Status.CANCELED)
                        .error("error")
                        .reason(MessageDetails.Reason.BOUNCED)
                        .build()
                )
                .build()

        val roundtrippedMessageListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageListResponse),
                jacksonTypeRef<MessageListResponse>(),
            )

        assertThat(roundtrippedMessageListResponse).isEqualTo(messageListResponse)
    }
}

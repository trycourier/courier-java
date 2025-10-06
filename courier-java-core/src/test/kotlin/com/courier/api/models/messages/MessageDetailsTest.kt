// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.messages

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageDetailsTest {

    @Test
    fun create() {
        val messageDetails =
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

        assertThat(messageDetails.id()).isEqualTo("id")
        assertThat(messageDetails.clicked()).isEqualTo(0L)
        assertThat(messageDetails.delivered()).isEqualTo(0L)
        assertThat(messageDetails.enqueued()).isEqualTo(0L)
        assertThat(messageDetails.event()).isEqualTo("event")
        assertThat(messageDetails.notification()).isEqualTo("notification")
        assertThat(messageDetails.opened()).isEqualTo(0L)
        assertThat(messageDetails.recipient()).isEqualTo("recipient")
        assertThat(messageDetails.sent()).isEqualTo(0L)
        assertThat(messageDetails.status()).isEqualTo(MessageDetails.Status.CANCELED)
        assertThat(messageDetails.error()).contains("error")
        assertThat(messageDetails.reason()).contains(MessageDetails.Reason.BOUNCED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageDetails =
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

        val roundtrippedMessageDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageDetails),
                jacksonTypeRef<MessageDetails>(),
            )

        assertThat(roundtrippedMessageDetails).isEqualTo(messageDetails)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.messages

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageDetailsTest {

    @Test
    fun create() {
        val messageDetails =
            MessageDetails.builder()
                .id("id")
                .enqueued(0L)
                .event("event")
                .notification("notification")
                .recipient("recipient")
                .status(MessageDetails.Status.CANCELED)
                .clicked(0L)
                .delivered(0L)
                .error("error")
                .opened(0L)
                .reason(MessageDetails.Reason.BOUNCED)
                .sent(0L)
                .build()

        assertThat(messageDetails.id()).isEqualTo("id")
        assertThat(messageDetails.enqueued()).isEqualTo(0L)
        assertThat(messageDetails.event()).isEqualTo("event")
        assertThat(messageDetails.notification()).isEqualTo("notification")
        assertThat(messageDetails.recipient()).isEqualTo("recipient")
        assertThat(messageDetails.status()).isEqualTo(MessageDetails.Status.CANCELED)
        assertThat(messageDetails.clicked()).contains(0L)
        assertThat(messageDetails.delivered()).contains(0L)
        assertThat(messageDetails.error()).contains("error")
        assertThat(messageDetails.opened()).contains(0L)
        assertThat(messageDetails.reason()).contains(MessageDetails.Reason.BOUNCED)
        assertThat(messageDetails.sent()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageDetails =
            MessageDetails.builder()
                .id("id")
                .enqueued(0L)
                .event("event")
                .notification("notification")
                .recipient("recipient")
                .status(MessageDetails.Status.CANCELED)
                .clicked(0L)
                .delivered(0L)
                .error("error")
                .opened(0L)
                .reason(MessageDetails.Reason.BOUNCED)
                .sent(0L)
                .build()

        val roundtrippedMessageDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageDetails),
                jacksonTypeRef<MessageDetails>(),
            )

        assertThat(roundtrippedMessageDetails).isEqualTo(messageDetails)
    }
}

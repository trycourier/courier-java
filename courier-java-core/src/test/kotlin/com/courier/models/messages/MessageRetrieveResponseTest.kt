// File generated from our OpenAPI spec by Stainless.

package com.courier.models.messages

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageRetrieveResponseTest {

    @Test
    fun create() {
        val messageRetrieveResponse =
            MessageRetrieveResponse.builder()
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
                .addProvider(
                    MessageRetrieveResponse.Provider.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(messageRetrieveResponse.id()).isEqualTo("id")
        assertThat(messageRetrieveResponse.enqueued()).isEqualTo(0L)
        assertThat(messageRetrieveResponse.event()).isEqualTo("event")
        assertThat(messageRetrieveResponse.notification()).isEqualTo("notification")
        assertThat(messageRetrieveResponse.recipient()).isEqualTo("recipient")
        assertThat(messageRetrieveResponse.status()).isEqualTo(MessageDetails.Status.CANCELED)
        assertThat(messageRetrieveResponse.clicked()).contains(0L)
        assertThat(messageRetrieveResponse.delivered()).contains(0L)
        assertThat(messageRetrieveResponse.error()).contains("error")
        assertThat(messageRetrieveResponse.opened()).contains(0L)
        assertThat(messageRetrieveResponse.reason()).contains(MessageDetails.Reason.BOUNCED)
        assertThat(messageRetrieveResponse.sent()).contains(0L)
        assertThat(messageRetrieveResponse.providers().getOrNull())
            .containsExactly(
                MessageRetrieveResponse.Provider.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageRetrieveResponse =
            MessageRetrieveResponse.builder()
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
                .addProvider(
                    MessageRetrieveResponse.Provider.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedMessageRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageRetrieveResponse),
                jacksonTypeRef<MessageRetrieveResponse>(),
            )

        assertThat(roundtrippedMessageRetrieveResponse).isEqualTo(messageRetrieveResponse)
    }
}

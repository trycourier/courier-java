// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.messages

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
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
                .addProvider(
                    MessageRetrieveResponse.Provider.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(messageRetrieveResponse.id()).isEqualTo("id")
        assertThat(messageRetrieveResponse.clicked()).isEqualTo(0L)
        assertThat(messageRetrieveResponse.delivered()).isEqualTo(0L)
        assertThat(messageRetrieveResponse.enqueued()).isEqualTo(0L)
        assertThat(messageRetrieveResponse.event()).isEqualTo("event")
        assertThat(messageRetrieveResponse.notification()).isEqualTo("notification")
        assertThat(messageRetrieveResponse.opened()).isEqualTo(0L)
        assertThat(messageRetrieveResponse.recipient()).isEqualTo("recipient")
        assertThat(messageRetrieveResponse.sent()).isEqualTo(0L)
        assertThat(messageRetrieveResponse.status()).isEqualTo(MessageDetails.Status.CANCELED)
        assertThat(messageRetrieveResponse.error()).contains("error")
        assertThat(messageRetrieveResponse.reason()).contains(MessageDetails.Reason.BOUNCED)
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

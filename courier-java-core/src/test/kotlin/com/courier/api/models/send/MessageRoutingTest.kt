// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageRoutingTest {

    @Test
    fun create() {
        val messageRouting =
            MessageRouting.builder().addChannel("string").method(MessageRouting.Method.ALL).build()

        assertThat(messageRouting.channels())
            .containsExactly(MessageRoutingChannel.ofString("string"))
        assertThat(messageRouting.method()).isEqualTo(MessageRouting.Method.ALL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageRouting =
            MessageRouting.builder().addChannel("string").method(MessageRouting.Method.ALL).build()

        val roundtrippedMessageRouting =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageRouting),
                jacksonTypeRef<MessageRouting>(),
            )

        assertThat(roundtrippedMessageRouting).isEqualTo(messageRouting)
    }
}

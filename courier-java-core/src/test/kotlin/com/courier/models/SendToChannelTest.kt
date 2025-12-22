// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendToChannelTest {

    @Test
    fun create() {
        val sendToChannel = SendToChannel.builder().channelId("channel_id").build()

        assertThat(sendToChannel.channelId()).isEqualTo("channel_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sendToChannel = SendToChannel.builder().channelId("channel_id").build()

        val roundtrippedSendToChannel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sendToChannel),
                jacksonTypeRef<SendToChannel>(),
            )

        assertThat(roundtrippedSendToChannel).isEqualTo(sendToChannel)
    }
}

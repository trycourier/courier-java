// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendToSlackChannelTest {

    @Test
    fun create() {
        val sendToSlackChannel =
            SendToSlackChannel.builder().accessToken("access_token").channel("channel").build()

        assertThat(sendToSlackChannel.accessToken()).isEqualTo("access_token")
        assertThat(sendToSlackChannel.channel()).isEqualTo("channel")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sendToSlackChannel =
            SendToSlackChannel.builder().accessToken("access_token").channel("channel").build()

        val roundtrippedSendToSlackChannel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sendToSlackChannel),
                jacksonTypeRef<SendToSlackChannel>(),
            )

        assertThat(roundtrippedSendToSlackChannel).isEqualTo(sendToSlackChannel)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendDirectMessageTest {

    @Test
    fun create() {
        val sendDirectMessage = SendDirectMessage.builder().userId("user_id").build()

        assertThat(sendDirectMessage.userId()).isEqualTo("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sendDirectMessage = SendDirectMessage.builder().userId("user_id").build()

        val roundtrippedSendDirectMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sendDirectMessage),
                jacksonTypeRef<SendDirectMessage>(),
            )

        assertThat(roundtrippedSendDirectMessage).isEqualTo(sendDirectMessage)
    }
}

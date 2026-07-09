// File generated from our OpenAPI spec by Stainless.

package com.courier.models.messages

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageResendResponseTest {

    @Test
    fun create() {
        val messageResendResponse =
            MessageResendResponse.builder().messageId("1-5e2b2615-05efbb3acab9172f88dd3f6f").build()

        assertThat(messageResendResponse.messageId())
            .isEqualTo("1-5e2b2615-05efbb3acab9172f88dd3f6f")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageResendResponse =
            MessageResendResponse.builder().messageId("1-5e2b2615-05efbb3acab9172f88dd3f6f").build()

        val roundtrippedMessageResendResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageResendResponse),
                jacksonTypeRef<MessageResendResponse>(),
            )

        assertThat(roundtrippedMessageResendResponse).isEqualTo(messageResendResponse)
    }
}

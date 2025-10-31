// File generated from our OpenAPI spec by Stainless.

package com.courier.models.send

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendMessageResponseTest {

    @Test
    fun create() {
        val sendMessageResponse =
            SendMessageResponse.builder().requestId("1-65f240a0-47a6a120c8374de9bcf9f22c").build()

        assertThat(sendMessageResponse.requestId()).isEqualTo("1-65f240a0-47a6a120c8374de9bcf9f22c")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sendMessageResponse =
            SendMessageResponse.builder().requestId("1-65f240a0-47a6a120c8374de9bcf9f22c").build()

        val roundtrippedSendMessageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sendMessageResponse),
                jacksonTypeRef<SendMessageResponse>(),
            )

        assertThat(roundtrippedSendMessageResponse).isEqualTo(sendMessageResponse)
    }
}

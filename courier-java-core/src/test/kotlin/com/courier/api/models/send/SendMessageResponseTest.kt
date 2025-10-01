// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendMessageResponseTest {

    @Test
    fun create() {
        val sendMessageResponse = SendMessageResponse.builder().requestId("requestId").build()

        assertThat(sendMessageResponse.requestId()).isEqualTo("requestId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sendMessageResponse = SendMessageResponse.builder().requestId("requestId").build()

        val roundtrippedSendMessageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sendMessageResponse),
                jacksonTypeRef<SendMessageResponse>(),
            )

        assertThat(roundtrippedSendMessageResponse).isEqualTo(sendMessageResponse)
    }
}

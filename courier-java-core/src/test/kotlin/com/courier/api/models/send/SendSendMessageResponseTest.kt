// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendSendMessageResponseTest {

    @Test
    fun create() {
        val sendSendMessageResponse =
            SendSendMessageResponse.builder().requestId("requestId").build()

        assertThat(sendSendMessageResponse.requestId()).isEqualTo("requestId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sendSendMessageResponse =
            SendSendMessageResponse.builder().requestId("requestId").build()

        val roundtrippedSendSendMessageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sendSendMessageResponse),
                jacksonTypeRef<SendSendMessageResponse>(),
            )

        assertThat(roundtrippedSendSendMessageResponse).isEqualTo(sendSendMessageResponse)
    }
}

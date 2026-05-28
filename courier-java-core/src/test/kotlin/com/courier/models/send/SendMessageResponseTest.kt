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
            SendMessageResponse.builder().requestId("1-69f561d3-7ad9d453fb6a7012efc2c5ad").build()

        assertThat(sendMessageResponse.requestId()).isEqualTo("1-69f561d3-7ad9d453fb6a7012efc2c5ad")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sendMessageResponse =
            SendMessageResponse.builder().requestId("1-69f561d3-7ad9d453fb6a7012efc2c5ad").build()

        val roundtrippedSendMessageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sendMessageResponse),
                jacksonTypeRef<SendMessageResponse>(),
            )

        assertThat(roundtrippedSendMessageResponse).isEqualTo(sendMessageResponse)
    }
}

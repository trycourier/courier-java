// File generated from our OpenAPI spec by Stainless.

package com.courier.models.inbound

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundTrackEventResponseTest {

    @Test
    fun create() {
        val inboundTrackEventResponse =
            InboundTrackEventResponse.builder()
                .messageId("1-65f240a0-47a6a120c8374de9bcf9f22c")
                .build()

        assertThat(inboundTrackEventResponse.messageId())
            .isEqualTo("1-65f240a0-47a6a120c8374de9bcf9f22c")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundTrackEventResponse =
            InboundTrackEventResponse.builder()
                .messageId("1-65f240a0-47a6a120c8374de9bcf9f22c")
                .build()

        val roundtrippedInboundTrackEventResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundTrackEventResponse),
                jacksonTypeRef<InboundTrackEventResponse>(),
            )

        assertThat(roundtrippedInboundTrackEventResponse).isEqualTo(inboundTrackEventResponse)
    }
}

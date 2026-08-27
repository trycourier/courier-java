// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneySendNodeToSlackChannelTest {

    @Test
    fun create() {
        val journeySendNodeToSlackChannel =
            JourneySendNodeToSlackChannel.builder().channel("x").accessToken("x").build()

        assertThat(journeySendNodeToSlackChannel.channel()).isEqualTo("x")
        assertThat(journeySendNodeToSlackChannel.accessToken()).contains("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeySendNodeToSlackChannel =
            JourneySendNodeToSlackChannel.builder().channel("x").accessToken("x").build()

        val roundtrippedJourneySendNodeToSlackChannel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeySendNodeToSlackChannel),
                jacksonTypeRef<JourneySendNodeToSlackChannel>(),
            )

        assertThat(roundtrippedJourneySendNodeToSlackChannel)
            .isEqualTo(journeySendNodeToSlackChannel)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneySendNodeToSlackUserIdTest {

    @Test
    fun create() {
        val journeySendNodeToSlackUserId =
            JourneySendNodeToSlackUserId.builder().userId("x").accessToken("x").build()

        assertThat(journeySendNodeToSlackUserId.userId()).isEqualTo("x")
        assertThat(journeySendNodeToSlackUserId.accessToken()).contains("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeySendNodeToSlackUserId =
            JourneySendNodeToSlackUserId.builder().userId("x").accessToken("x").build()

        val roundtrippedJourneySendNodeToSlackUserId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeySendNodeToSlackUserId),
                jacksonTypeRef<JourneySendNodeToSlackUserId>(),
            )

        assertThat(roundtrippedJourneySendNodeToSlackUserId).isEqualTo(journeySendNodeToSlackUserId)
    }
}

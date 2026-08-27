// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneySendNodeToSlackEmailTest {

    @Test
    fun create() {
        val journeySendNodeToSlackEmail =
            JourneySendNodeToSlackEmail.builder().email("x").accessToken("x").build()

        assertThat(journeySendNodeToSlackEmail.email()).isEqualTo("x")
        assertThat(journeySendNodeToSlackEmail.accessToken()).contains("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeySendNodeToSlackEmail =
            JourneySendNodeToSlackEmail.builder().email("x").accessToken("x").build()

        val roundtrippedJourneySendNodeToSlackEmail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeySendNodeToSlackEmail),
                jacksonTypeRef<JourneySendNodeToSlackEmail>(),
            )

        assertThat(roundtrippedJourneySendNodeToSlackEmail).isEqualTo(journeySendNodeToSlackEmail)
    }
}

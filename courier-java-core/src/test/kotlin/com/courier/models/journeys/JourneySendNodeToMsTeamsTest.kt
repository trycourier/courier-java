// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneySendNodeToMsTeamsTest {

    @Test
    fun create() {
        val journeySendNodeToMsTeams =
            JourneySendNodeToMsTeams.builder()
                .channelId("x")
                .channelName("x")
                .email("x")
                .serviceUrl("x")
                .teamId("x")
                .tenantId("x")
                .userId("x")
                .build()

        assertThat(journeySendNodeToMsTeams.channelId()).contains("x")
        assertThat(journeySendNodeToMsTeams.channelName()).contains("x")
        assertThat(journeySendNodeToMsTeams.email()).contains("x")
        assertThat(journeySendNodeToMsTeams.serviceUrl()).contains("x")
        assertThat(journeySendNodeToMsTeams.teamId()).contains("x")
        assertThat(journeySendNodeToMsTeams.tenantId()).contains("x")
        assertThat(journeySendNodeToMsTeams.userId()).contains("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeySendNodeToMsTeams =
            JourneySendNodeToMsTeams.builder()
                .channelId("x")
                .channelName("x")
                .email("x")
                .serviceUrl("x")
                .teamId("x")
                .tenantId("x")
                .userId("x")
                .build()

        val roundtrippedJourneySendNodeToMsTeams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeySendNodeToMsTeams),
                jacksonTypeRef<JourneySendNodeToMsTeams>(),
            )

        assertThat(roundtrippedJourneySendNodeToMsTeams).isEqualTo(journeySendNodeToMsTeams)
    }
}

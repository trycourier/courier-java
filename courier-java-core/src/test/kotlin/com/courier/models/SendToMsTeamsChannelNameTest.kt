// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendToMsTeamsChannelNameTest {

    @Test
    fun create() {
        val sendToMsTeamsChannelName =
            SendToMsTeamsChannelName.builder()
                .channelName("channel_name")
                .serviceUrl("service_url")
                .teamId("team_id")
                .tenantId("tenant_id")
                .build()

        assertThat(sendToMsTeamsChannelName.channelName()).isEqualTo("channel_name")
        assertThat(sendToMsTeamsChannelName.serviceUrl()).isEqualTo("service_url")
        assertThat(sendToMsTeamsChannelName.teamId()).isEqualTo("team_id")
        assertThat(sendToMsTeamsChannelName.tenantId()).isEqualTo("tenant_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sendToMsTeamsChannelName =
            SendToMsTeamsChannelName.builder()
                .channelName("channel_name")
                .serviceUrl("service_url")
                .teamId("team_id")
                .tenantId("tenant_id")
                .build()

        val roundtrippedSendToMsTeamsChannelName =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sendToMsTeamsChannelName),
                jacksonTypeRef<SendToMsTeamsChannelName>(),
            )

        assertThat(roundtrippedSendToMsTeamsChannelName).isEqualTo(sendToMsTeamsChannelName)
    }
}

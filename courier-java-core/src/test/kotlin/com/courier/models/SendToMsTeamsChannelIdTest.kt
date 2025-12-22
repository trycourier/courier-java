// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendToMsTeamsChannelIdTest {

    @Test
    fun create() {
        val sendToMsTeamsChannelId =
            SendToMsTeamsChannelId.builder()
                .channelId("channel_id")
                .serviceUrl("service_url")
                .tenantId("tenant_id")
                .build()

        assertThat(sendToMsTeamsChannelId.channelId()).isEqualTo("channel_id")
        assertThat(sendToMsTeamsChannelId.serviceUrl()).isEqualTo("service_url")
        assertThat(sendToMsTeamsChannelId.tenantId()).isEqualTo("tenant_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sendToMsTeamsChannelId =
            SendToMsTeamsChannelId.builder()
                .channelId("channel_id")
                .serviceUrl("service_url")
                .tenantId("tenant_id")
                .build()

        val roundtrippedSendToMsTeamsChannelId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sendToMsTeamsChannelId),
                jacksonTypeRef<SendToMsTeamsChannelId>(),
            )

        assertThat(roundtrippedSendToMsTeamsChannelId).isEqualTo(sendToMsTeamsChannelId)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendToMsTeamsConversationIdTest {

    @Test
    fun create() {
        val sendToMsTeamsConversationId =
            SendToMsTeamsConversationId.builder()
                .conversationId("conversation_id")
                .serviceUrl("service_url")
                .tenantId("tenant_id")
                .build()

        assertThat(sendToMsTeamsConversationId.conversationId()).isEqualTo("conversation_id")
        assertThat(sendToMsTeamsConversationId.serviceUrl()).isEqualTo("service_url")
        assertThat(sendToMsTeamsConversationId.tenantId()).isEqualTo("tenant_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sendToMsTeamsConversationId =
            SendToMsTeamsConversationId.builder()
                .conversationId("conversation_id")
                .serviceUrl("service_url")
                .tenantId("tenant_id")
                .build()

        val roundtrippedSendToMsTeamsConversationId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sendToMsTeamsConversationId),
                jacksonTypeRef<SendToMsTeamsConversationId>(),
            )

        assertThat(roundtrippedSendToMsTeamsConversationId).isEqualTo(sendToMsTeamsConversationId)
    }
}

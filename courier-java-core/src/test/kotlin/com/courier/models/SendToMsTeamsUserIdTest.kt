// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendToMsTeamsUserIdTest {

    @Test
    fun create() {
        val sendToMsTeamsUserId =
            SendToMsTeamsUserId.builder()
                .serviceUrl("service_url")
                .tenantId("tenant_id")
                .userId("user_id")
                .build()

        assertThat(sendToMsTeamsUserId.serviceUrl()).isEqualTo("service_url")
        assertThat(sendToMsTeamsUserId.tenantId()).isEqualTo("tenant_id")
        assertThat(sendToMsTeamsUserId.userId()).isEqualTo("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sendToMsTeamsUserId =
            SendToMsTeamsUserId.builder()
                .serviceUrl("service_url")
                .tenantId("tenant_id")
                .userId("user_id")
                .build()

        val roundtrippedSendToMsTeamsUserId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sendToMsTeamsUserId),
                jacksonTypeRef<SendToMsTeamsUserId>(),
            )

        assertThat(roundtrippedSendToMsTeamsUserId).isEqualTo(sendToMsTeamsUserId)
    }
}

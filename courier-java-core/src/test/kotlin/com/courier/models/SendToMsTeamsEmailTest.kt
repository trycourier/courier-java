// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendToMsTeamsEmailTest {

    @Test
    fun create() {
        val sendToMsTeamsEmail =
            SendToMsTeamsEmail.builder()
                .email("email")
                .serviceUrl("service_url")
                .tenantId("tenant_id")
                .build()

        assertThat(sendToMsTeamsEmail.email()).isEqualTo("email")
        assertThat(sendToMsTeamsEmail.serviceUrl()).isEqualTo("service_url")
        assertThat(sendToMsTeamsEmail.tenantId()).isEqualTo("tenant_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sendToMsTeamsEmail =
            SendToMsTeamsEmail.builder()
                .email("email")
                .serviceUrl("service_url")
                .tenantId("tenant_id")
                .build()

        val roundtrippedSendToMsTeamsEmail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sendToMsTeamsEmail),
                jacksonTypeRef<SendToMsTeamsEmail>(),
            )

        assertThat(roundtrippedSendToMsTeamsEmail).isEqualTo(sendToMsTeamsEmail)
    }
}

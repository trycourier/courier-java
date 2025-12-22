// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MsTeamsRecipientTest {

    @Test
    fun create() {
        val msTeamsRecipient =
            MsTeamsRecipient.builder()
                .msTeams(
                    SendToMsTeamsUserId.builder()
                        .serviceUrl("service_url")
                        .tenantId("tenant_id")
                        .userId("user_id")
                        .build()
                )
                .build()

        assertThat(msTeamsRecipient.msTeams())
            .isEqualTo(
                MsTeams.ofSendToMsTeamsUserId(
                    SendToMsTeamsUserId.builder()
                        .serviceUrl("service_url")
                        .tenantId("tenant_id")
                        .userId("user_id")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val msTeamsRecipient =
            MsTeamsRecipient.builder()
                .msTeams(
                    SendToMsTeamsUserId.builder()
                        .serviceUrl("service_url")
                        .tenantId("tenant_id")
                        .userId("user_id")
                        .build()
                )
                .build()

        val roundtrippedMsTeamsRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(msTeamsRecipient),
                jacksonTypeRef<MsTeamsRecipient>(),
            )

        assertThat(roundtrippedMsTeamsRecipient).isEqualTo(msTeamsRecipient)
    }
}

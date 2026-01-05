// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class MsTeamsTest {

    @Test
    fun ofSendToMsTeamsUserId() {
        val sendToMsTeamsUserId =
            SendToMsTeamsUserId.builder()
                .serviceUrl("service_url")
                .tenantId("tenant_id")
                .userId("user_id")
                .build()

        val msTeams = MsTeams.ofSendToMsTeamsUserId(sendToMsTeamsUserId)

        assertThat(msTeams.sendToMsTeamsUserId()).contains(sendToMsTeamsUserId)
        assertThat(msTeams.sendToMsTeamsEmail()).isEmpty
        assertThat(msTeams.sendToMsTeamsChannelId()).isEmpty
        assertThat(msTeams.sendToMsTeamsConversationId()).isEmpty
        assertThat(msTeams.sendToMsTeamsChannelName()).isEmpty
    }

    @Test
    fun ofSendToMsTeamsUserIdRoundtrip() {
        val jsonMapper = jsonMapper()
        val msTeams =
            MsTeams.ofSendToMsTeamsUserId(
                SendToMsTeamsUserId.builder()
                    .serviceUrl("service_url")
                    .tenantId("tenant_id")
                    .userId("user_id")
                    .build()
            )

        val roundtrippedMsTeams =
            jsonMapper.readValue(jsonMapper.writeValueAsString(msTeams), jacksonTypeRef<MsTeams>())

        assertThat(roundtrippedMsTeams).isEqualTo(msTeams)
    }

    @Test
    fun ofSendToMsTeamsEmail() {
        val sendToMsTeamsEmail =
            SendToMsTeamsEmail.builder()
                .email("email")
                .serviceUrl("service_url")
                .tenantId("tenant_id")
                .build()

        val msTeams = MsTeams.ofSendToMsTeamsEmail(sendToMsTeamsEmail)

        assertThat(msTeams.sendToMsTeamsUserId()).isEmpty
        assertThat(msTeams.sendToMsTeamsEmail()).contains(sendToMsTeamsEmail)
        assertThat(msTeams.sendToMsTeamsChannelId()).isEmpty
        assertThat(msTeams.sendToMsTeamsConversationId()).isEmpty
        assertThat(msTeams.sendToMsTeamsChannelName()).isEmpty
    }

    @Test
    fun ofSendToMsTeamsEmailRoundtrip() {
        val jsonMapper = jsonMapper()
        val msTeams =
            MsTeams.ofSendToMsTeamsEmail(
                SendToMsTeamsEmail.builder()
                    .email("email")
                    .serviceUrl("service_url")
                    .tenantId("tenant_id")
                    .build()
            )

        val roundtrippedMsTeams =
            jsonMapper.readValue(jsonMapper.writeValueAsString(msTeams), jacksonTypeRef<MsTeams>())

        assertThat(roundtrippedMsTeams).isEqualTo(msTeams)
    }

    @Test
    fun ofSendToMsTeamsChannelId() {
        val sendToMsTeamsChannelId =
            SendToMsTeamsChannelId.builder()
                .channelId("channel_id")
                .serviceUrl("service_url")
                .tenantId("tenant_id")
                .build()

        val msTeams = MsTeams.ofSendToMsTeamsChannelId(sendToMsTeamsChannelId)

        assertThat(msTeams.sendToMsTeamsUserId()).isEmpty
        assertThat(msTeams.sendToMsTeamsEmail()).isEmpty
        assertThat(msTeams.sendToMsTeamsChannelId()).contains(sendToMsTeamsChannelId)
        assertThat(msTeams.sendToMsTeamsConversationId()).isEmpty
        assertThat(msTeams.sendToMsTeamsChannelName()).isEmpty
    }

    @Test
    fun ofSendToMsTeamsChannelIdRoundtrip() {
        val jsonMapper = jsonMapper()
        val msTeams =
            MsTeams.ofSendToMsTeamsChannelId(
                SendToMsTeamsChannelId.builder()
                    .channelId("channel_id")
                    .serviceUrl("service_url")
                    .tenantId("tenant_id")
                    .build()
            )

        val roundtrippedMsTeams =
            jsonMapper.readValue(jsonMapper.writeValueAsString(msTeams), jacksonTypeRef<MsTeams>())

        assertThat(roundtrippedMsTeams).isEqualTo(msTeams)
    }

    @Test
    fun ofSendToMsTeamsConversationId() {
        val sendToMsTeamsConversationId =
            SendToMsTeamsConversationId.builder()
                .conversationId("conversation_id")
                .serviceUrl("service_url")
                .tenantId("tenant_id")
                .build()

        val msTeams = MsTeams.ofSendToMsTeamsConversationId(sendToMsTeamsConversationId)

        assertThat(msTeams.sendToMsTeamsUserId()).isEmpty
        assertThat(msTeams.sendToMsTeamsEmail()).isEmpty
        assertThat(msTeams.sendToMsTeamsChannelId()).isEmpty
        assertThat(msTeams.sendToMsTeamsConversationId()).contains(sendToMsTeamsConversationId)
        assertThat(msTeams.sendToMsTeamsChannelName()).isEmpty
    }

    @Test
    fun ofSendToMsTeamsConversationIdRoundtrip() {
        val jsonMapper = jsonMapper()
        val msTeams =
            MsTeams.ofSendToMsTeamsConversationId(
                SendToMsTeamsConversationId.builder()
                    .conversationId("conversation_id")
                    .serviceUrl("service_url")
                    .tenantId("tenant_id")
                    .build()
            )

        val roundtrippedMsTeams =
            jsonMapper.readValue(jsonMapper.writeValueAsString(msTeams), jacksonTypeRef<MsTeams>())

        assertThat(roundtrippedMsTeams).isEqualTo(msTeams)
    }

    @Test
    fun ofSendToMsTeamsChannelName() {
        val sendToMsTeamsChannelName =
            SendToMsTeamsChannelName.builder()
                .channelName("channel_name")
                .serviceUrl("service_url")
                .teamId("team_id")
                .tenantId("tenant_id")
                .build()

        val msTeams = MsTeams.ofSendToMsTeamsChannelName(sendToMsTeamsChannelName)

        assertThat(msTeams.sendToMsTeamsUserId()).isEmpty
        assertThat(msTeams.sendToMsTeamsEmail()).isEmpty
        assertThat(msTeams.sendToMsTeamsChannelId()).isEmpty
        assertThat(msTeams.sendToMsTeamsConversationId()).isEmpty
        assertThat(msTeams.sendToMsTeamsChannelName()).contains(sendToMsTeamsChannelName)
    }

    @Test
    fun ofSendToMsTeamsChannelNameRoundtrip() {
        val jsonMapper = jsonMapper()
        val msTeams =
            MsTeams.ofSendToMsTeamsChannelName(
                SendToMsTeamsChannelName.builder()
                    .channelName("channel_name")
                    .serviceUrl("service_url")
                    .teamId("team_id")
                    .tenantId("tenant_id")
                    .build()
            )

        val roundtrippedMsTeams =
            jsonMapper.readValue(jsonMapper.writeValueAsString(msTeams), jacksonTypeRef<MsTeams>())

        assertThat(roundtrippedMsTeams).isEqualTo(msTeams)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val msTeams = jsonMapper().convertValue(testCase.value, jacksonTypeRef<MsTeams>())

        val e = assertThrows<CourierInvalidDataException> { msTeams.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}

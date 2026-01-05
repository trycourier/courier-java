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

internal class SlackTest {

    @Test
    fun ofSendToSlackChannel() {
        val sendToSlackChannel =
            SendToSlackChannel.builder().accessToken("access_token").channel("channel").build()

        val slack = Slack.ofSendToSlackChannel(sendToSlackChannel)

        assertThat(slack.sendToSlackChannel()).contains(sendToSlackChannel)
        assertThat(slack.sendToSlackEmail()).isEmpty
        assertThat(slack.sendToSlackUserId()).isEmpty
    }

    @Test
    fun ofSendToSlackChannelRoundtrip() {
        val jsonMapper = jsonMapper()
        val slack =
            Slack.ofSendToSlackChannel(
                SendToSlackChannel.builder().accessToken("access_token").channel("channel").build()
            )

        val roundtrippedSlack =
            jsonMapper.readValue(jsonMapper.writeValueAsString(slack), jacksonTypeRef<Slack>())

        assertThat(roundtrippedSlack).isEqualTo(slack)
    }

    @Test
    fun ofSendToSlackEmail() {
        val sendToSlackEmail =
            SendToSlackEmail.builder().accessToken("access_token").email("email").build()

        val slack = Slack.ofSendToSlackEmail(sendToSlackEmail)

        assertThat(slack.sendToSlackChannel()).isEmpty
        assertThat(slack.sendToSlackEmail()).contains(sendToSlackEmail)
        assertThat(slack.sendToSlackUserId()).isEmpty
    }

    @Test
    fun ofSendToSlackEmailRoundtrip() {
        val jsonMapper = jsonMapper()
        val slack =
            Slack.ofSendToSlackEmail(
                SendToSlackEmail.builder().accessToken("access_token").email("email").build()
            )

        val roundtrippedSlack =
            jsonMapper.readValue(jsonMapper.writeValueAsString(slack), jacksonTypeRef<Slack>())

        assertThat(roundtrippedSlack).isEqualTo(slack)
    }

    @Test
    fun ofSendToSlackUserId() {
        val sendToSlackUserId =
            SendToSlackUserId.builder().accessToken("access_token").userId("user_id").build()

        val slack = Slack.ofSendToSlackUserId(sendToSlackUserId)

        assertThat(slack.sendToSlackChannel()).isEmpty
        assertThat(slack.sendToSlackEmail()).isEmpty
        assertThat(slack.sendToSlackUserId()).contains(sendToSlackUserId)
    }

    @Test
    fun ofSendToSlackUserIdRoundtrip() {
        val jsonMapper = jsonMapper()
        val slack =
            Slack.ofSendToSlackUserId(
                SendToSlackUserId.builder().accessToken("access_token").userId("user_id").build()
            )

        val roundtrippedSlack =
            jsonMapper.readValue(jsonMapper.writeValueAsString(slack), jacksonTypeRef<Slack>())

        assertThat(roundtrippedSlack).isEqualTo(slack)
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
        val slack = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Slack>())

        val e = assertThrows<CourierInvalidDataException> { slack.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}

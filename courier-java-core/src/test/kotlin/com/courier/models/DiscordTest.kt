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

internal class DiscordTest {

    @Test
    fun ofSendToChannel() {
        val sendToChannel = SendToChannel.builder().channelId("channel_id").build()

        val discord = Discord.ofSendToChannel(sendToChannel)

        assertThat(discord.sendToChannel()).contains(sendToChannel)
        assertThat(discord.sendDirectMessage()).isEmpty
    }

    @Test
    fun ofSendToChannelRoundtrip() {
        val jsonMapper = jsonMapper()
        val discord =
            Discord.ofSendToChannel(SendToChannel.builder().channelId("channel_id").build())

        val roundtrippedDiscord =
            jsonMapper.readValue(jsonMapper.writeValueAsString(discord), jacksonTypeRef<Discord>())

        assertThat(roundtrippedDiscord).isEqualTo(discord)
    }

    @Test
    fun ofSendDirectMessage() {
        val sendDirectMessage = SendDirectMessage.builder().userId("user_id").build()

        val discord = Discord.ofSendDirectMessage(sendDirectMessage)

        assertThat(discord.sendToChannel()).isEmpty
        assertThat(discord.sendDirectMessage()).contains(sendDirectMessage)
    }

    @Test
    fun ofSendDirectMessageRoundtrip() {
        val jsonMapper = jsonMapper()
        val discord =
            Discord.ofSendDirectMessage(SendDirectMessage.builder().userId("user_id").build())

        val roundtrippedDiscord =
            jsonMapper.readValue(jsonMapper.writeValueAsString(discord), jacksonTypeRef<Discord>())

        assertThat(roundtrippedDiscord).isEqualTo(discord)
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
        val discord = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Discord>())

        val e = assertThrows<CourierInvalidDataException> { discord.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}

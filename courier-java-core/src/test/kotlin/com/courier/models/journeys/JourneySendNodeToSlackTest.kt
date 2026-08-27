// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class JourneySendNodeToSlackTest {

    @Test
    fun ofChannel() {
        val channel = JourneySendNodeToSlackChannel.builder().channel("x").accessToken("x").build()

        val journeySendNodeToSlack = JourneySendNodeToSlack.ofChannel(channel)

        assertThat(journeySendNodeToSlack.channel()).contains(channel)
        assertThat(journeySendNodeToSlack.userId()).isEmpty
        assertThat(journeySendNodeToSlack.email()).isEmpty
    }

    @Test
    fun ofChannelRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeySendNodeToSlack =
            JourneySendNodeToSlack.ofChannel(
                JourneySendNodeToSlackChannel.builder().channel("x").accessToken("x").build()
            )

        val roundtrippedJourneySendNodeToSlack =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeySendNodeToSlack),
                jacksonTypeRef<JourneySendNodeToSlack>(),
            )

        assertThat(roundtrippedJourneySendNodeToSlack).isEqualTo(journeySendNodeToSlack)
    }

    @Test
    fun ofUserId() {
        val userId = JourneySendNodeToSlackUserId.builder().userId("x").accessToken("x").build()

        val journeySendNodeToSlack = JourneySendNodeToSlack.ofUserId(userId)

        assertThat(journeySendNodeToSlack.channel()).isEmpty
        assertThat(journeySendNodeToSlack.userId()).contains(userId)
        assertThat(journeySendNodeToSlack.email()).isEmpty
    }

    @Test
    fun ofUserIdRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeySendNodeToSlack =
            JourneySendNodeToSlack.ofUserId(
                JourneySendNodeToSlackUserId.builder().userId("x").accessToken("x").build()
            )

        val roundtrippedJourneySendNodeToSlack =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeySendNodeToSlack),
                jacksonTypeRef<JourneySendNodeToSlack>(),
            )

        assertThat(roundtrippedJourneySendNodeToSlack).isEqualTo(journeySendNodeToSlack)
    }

    @Test
    fun ofEmail() {
        val email = JourneySendNodeToSlackEmail.builder().email("x").accessToken("x").build()

        val journeySendNodeToSlack = JourneySendNodeToSlack.ofEmail(email)

        assertThat(journeySendNodeToSlack.channel()).isEmpty
        assertThat(journeySendNodeToSlack.userId()).isEmpty
        assertThat(journeySendNodeToSlack.email()).contains(email)
    }

    @Test
    fun ofEmailRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeySendNodeToSlack =
            JourneySendNodeToSlack.ofEmail(
                JourneySendNodeToSlackEmail.builder().email("x").accessToken("x").build()
            )

        val roundtrippedJourneySendNodeToSlack =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeySendNodeToSlack),
                jacksonTypeRef<JourneySendNodeToSlack>(),
            )

        assertThat(roundtrippedJourneySendNodeToSlack).isEqualTo(journeySendNodeToSlack)
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
        val journeySendNodeToSlack =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<JourneySendNodeToSlack>())

        val e = assertThrows<CourierInvalidDataException> { journeySendNodeToSlack.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}

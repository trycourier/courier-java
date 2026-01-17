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

internal class MessageRoutingChannelTest {

    @Test
    fun ofString() {
        val string = "string"

        val messageRoutingChannel = MessageRoutingChannel.ofString(string)

        assertThat(messageRoutingChannel.string()).contains(string)
        assertThat(messageRoutingChannel.messageRouting()).isEmpty
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val messageRoutingChannel = MessageRoutingChannel.ofString("string")

        val roundtrippedMessageRoutingChannel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageRoutingChannel),
                jacksonTypeRef<MessageRoutingChannel>(),
            )

        assertThat(roundtrippedMessageRoutingChannel).isEqualTo(messageRoutingChannel)
    }

    @Test
    fun ofMessageRouting() {
        val messageRouting =
            MessageRouting.builder().addChannel("string").method(MessageRouting.Method.ALL).build()

        val messageRoutingChannel = MessageRoutingChannel.ofMessageRouting(messageRouting)

        assertThat(messageRoutingChannel.string()).isEmpty
        assertThat(messageRoutingChannel.messageRouting()).contains(messageRouting)
    }

    @Test
    fun ofMessageRoutingRoundtrip() {
        val jsonMapper = jsonMapper()
        val messageRoutingChannel =
            MessageRoutingChannel.ofMessageRouting(
                MessageRouting.builder()
                    .addChannel("string")
                    .method(MessageRouting.Method.ALL)
                    .build()
            )

        val roundtrippedMessageRoutingChannel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageRoutingChannel),
                jacksonTypeRef<MessageRoutingChannel>(),
            )

        assertThat(roundtrippedMessageRoutingChannel).isEqualTo(messageRoutingChannel)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val messageRoutingChannel =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<MessageRoutingChannel>())

        val e = assertThrows<CourierInvalidDataException> { messageRoutingChannel.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}

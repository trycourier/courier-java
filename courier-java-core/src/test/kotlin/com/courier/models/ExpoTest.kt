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

internal class ExpoTest {

    @Test
    fun ofToken() {
        val token = Token.builder().token("token").build()

        val expo = Expo.ofToken(token)

        assertThat(expo.token()).contains(token)
        assertThat(expo.multipleTokens()).isEmpty
    }

    @Test
    fun ofTokenRoundtrip() {
        val jsonMapper = jsonMapper()
        val expo = Expo.ofToken(Token.builder().token("token").build())

        val roundtrippedExpo =
            jsonMapper.readValue(jsonMapper.writeValueAsString(expo), jacksonTypeRef<Expo>())

        assertThat(roundtrippedExpo).isEqualTo(expo)
    }

    @Test
    fun ofMultipleTokens() {
        val multipleTokens =
            MultipleTokens.builder().addToken(Token.builder().token("token").build()).build()

        val expo = Expo.ofMultipleTokens(multipleTokens)

        assertThat(expo.token()).isEmpty
        assertThat(expo.multipleTokens()).contains(multipleTokens)
    }

    @Test
    fun ofMultipleTokensRoundtrip() {
        val jsonMapper = jsonMapper()
        val expo =
            Expo.ofMultipleTokens(
                MultipleTokens.builder().addToken(Token.builder().token("token").build()).build()
            )

        val roundtrippedExpo =
            jsonMapper.readValue(jsonMapper.writeValueAsString(expo), jacksonTypeRef<Expo>())

        assertThat(roundtrippedExpo).isEqualTo(expo)
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
        val expo = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Expo>())

        val e = assertThrows<CourierInvalidDataException> { expo.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}

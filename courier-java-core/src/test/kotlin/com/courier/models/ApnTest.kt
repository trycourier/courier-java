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

internal class ApnTest {

    @Test
    fun ofToken() {
        val token = Token.builder().token("token").build()

        val apn = Apn.ofToken(token)

        assertThat(apn.token()).contains(token)
        assertThat(apn.multipleTokens()).isEmpty
    }

    @Test
    fun ofTokenRoundtrip() {
        val jsonMapper = jsonMapper()
        val apn = Apn.ofToken(Token.builder().token("token").build())

        val roundtrippedApn =
            jsonMapper.readValue(jsonMapper.writeValueAsString(apn), jacksonTypeRef<Apn>())

        assertThat(roundtrippedApn).isEqualTo(apn)
    }

    @Test
    fun ofMultipleTokens() {
        val multipleTokens = MultipleTokens.builder().tokens("string").build()

        val apn = Apn.ofMultipleTokens(multipleTokens)

        assertThat(apn.token()).isEmpty
        assertThat(apn.multipleTokens()).contains(multipleTokens)
    }

    @Test
    fun ofMultipleTokensRoundtrip() {
        val jsonMapper = jsonMapper()
        val apn = Apn.ofMultipleTokens(MultipleTokens.builder().tokens("string").build())

        val roundtrippedApn =
            jsonMapper.readValue(jsonMapper.writeValueAsString(apn), jacksonTypeRef<Apn>())

        assertThat(roundtrippedApn).isEqualTo(apn)
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
        val apn = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Apn>())

        val e = assertThrows<CourierInvalidDataException> { apn.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}

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

internal class UserProfileFirebaseTokenTest {

    @Test
    fun ofString() {
        val string = "string"

        val userProfileFirebaseToken = UserProfileFirebaseToken.ofString(string)

        assertThat(userProfileFirebaseToken.string()).contains(string)
        assertThat(userProfileFirebaseToken.strings()).isEmpty
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val userProfileFirebaseToken = UserProfileFirebaseToken.ofString("string")

        val roundtrippedUserProfileFirebaseToken =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userProfileFirebaseToken),
                jacksonTypeRef<UserProfileFirebaseToken>(),
            )

        assertThat(roundtrippedUserProfileFirebaseToken).isEqualTo(userProfileFirebaseToken)
    }

    @Test
    fun ofStrings() {
        val strings = listOf("string")

        val userProfileFirebaseToken = UserProfileFirebaseToken.ofStrings(strings)

        assertThat(userProfileFirebaseToken.string()).isEmpty
        assertThat(userProfileFirebaseToken.strings()).contains(strings)
    }

    @Test
    fun ofStringsRoundtrip() {
        val jsonMapper = jsonMapper()
        val userProfileFirebaseToken = UserProfileFirebaseToken.ofStrings(listOf("string"))

        val roundtrippedUserProfileFirebaseToken =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userProfileFirebaseToken),
                jacksonTypeRef<UserProfileFirebaseToken>(),
            )

        assertThat(roundtrippedUserProfileFirebaseToken).isEqualTo(userProfileFirebaseToken)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        OBJECT(JsonValue.from(mapOf("invalid" to "object"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val userProfileFirebaseToken =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<UserProfileFirebaseToken>())

        val e = assertThrows<CourierInvalidDataException> { userProfileFirebaseToken.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}

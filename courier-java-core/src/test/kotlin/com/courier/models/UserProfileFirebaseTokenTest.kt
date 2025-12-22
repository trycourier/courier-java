// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

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

    @Test
    fun incompatibleJsonShapeDeserializesToUnknown() {
        val value = JsonValue.from(mapOf("invalid" to "object"))
        val userProfileFirebaseToken =
            jsonMapper().convertValue(value, jacksonTypeRef<UserProfileFirebaseToken>())

        val e = assertThrows<CourierInvalidDataException> { userProfileFirebaseToken.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}

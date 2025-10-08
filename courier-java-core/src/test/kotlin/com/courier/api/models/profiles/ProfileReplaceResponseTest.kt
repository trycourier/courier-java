// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.profiles

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileReplaceResponseTest {

    @Test
    fun create() {
        val profileReplaceResponse =
            ProfileReplaceResponse.builder().status(ProfileReplaceResponse.Status.SUCCESS).build()

        assertThat(profileReplaceResponse.status()).isEqualTo(ProfileReplaceResponse.Status.SUCCESS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileReplaceResponse =
            ProfileReplaceResponse.builder().status(ProfileReplaceResponse.Status.SUCCESS).build()

        val roundtrippedProfileReplaceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileReplaceResponse),
                jacksonTypeRef<ProfileReplaceResponse>(),
            )

        assertThat(roundtrippedProfileReplaceResponse).isEqualTo(profileReplaceResponse)
    }
}

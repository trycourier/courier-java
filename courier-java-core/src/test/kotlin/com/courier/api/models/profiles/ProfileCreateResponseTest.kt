// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.profiles

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileCreateResponseTest {

    @Test
    fun create() {
        val profileCreateResponse =
            ProfileCreateResponse.builder().status(ProfileCreateResponse.Status.SUCCESS).build()

        assertThat(profileCreateResponse.status()).isEqualTo(ProfileCreateResponse.Status.SUCCESS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profileCreateResponse =
            ProfileCreateResponse.builder().status(ProfileCreateResponse.Status.SUCCESS).build()

        val roundtrippedProfileCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileCreateResponse),
                jacksonTypeRef<ProfileCreateResponse>(),
            )

        assertThat(roundtrippedProfileCreateResponse).isEqualTo(profileCreateResponse)
    }
}

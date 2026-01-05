// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirshipProfileTest {

    @Test
    fun create() {
        val airshipProfile =
            AirshipProfile.builder()
                .audience(AirshipProfileAudience.builder().namedUser("named_user").build())
                .addDeviceType("string")
                .build()

        assertThat(airshipProfile.audience())
            .isEqualTo(AirshipProfileAudience.builder().namedUser("named_user").build())
        assertThat(airshipProfile.deviceTypes()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val airshipProfile =
            AirshipProfile.builder()
                .audience(AirshipProfileAudience.builder().namedUser("named_user").build())
                .addDeviceType("string")
                .build()

        val roundtrippedAirshipProfile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(airshipProfile),
                jacksonTypeRef<AirshipProfile>(),
            )

        assertThat(roundtrippedAirshipProfile).isEqualTo(airshipProfile)
    }
}

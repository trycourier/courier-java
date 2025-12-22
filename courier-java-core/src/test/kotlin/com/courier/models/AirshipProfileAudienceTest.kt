// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AirshipProfileAudienceTest {

    @Test
    fun create() {
        val airshipProfileAudience =
            AirshipProfileAudience.builder().namedUser("named_user").build()

        assertThat(airshipProfileAudience.namedUser()).isEqualTo("named_user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val airshipProfileAudience =
            AirshipProfileAudience.builder().namedUser("named_user").build()

        val roundtrippedAirshipProfileAudience =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(airshipProfileAudience),
                jacksonTypeRef<AirshipProfileAudience>(),
            )

        assertThat(roundtrippedAirshipProfileAudience).isEqualTo(airshipProfileAudience)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyPublishRequestTest {

    @Test
    fun create() {
        val journeyPublishRequest = JourneyPublishRequest.builder().version("v321669910225").build()

        assertThat(journeyPublishRequest.version()).contains("v321669910225")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyPublishRequest = JourneyPublishRequest.builder().version("v321669910225").build()

        val roundtrippedJourneyPublishRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyPublishRequest),
                jacksonTypeRef<JourneyPublishRequest>(),
            )

        assertThat(roundtrippedJourneyPublishRequest).isEqualTo(journeyPublishRequest)
    }
}

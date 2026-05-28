// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyTemplatePublishRequestTest {

    @Test
    fun create() {
        val journeyTemplatePublishRequest =
            JourneyTemplatePublishRequest.builder().version("v321669910225").build()

        assertThat(journeyTemplatePublishRequest.version()).contains("v321669910225")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyTemplatePublishRequest =
            JourneyTemplatePublishRequest.builder().version("v321669910225").build()

        val roundtrippedJourneyTemplatePublishRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyTemplatePublishRequest),
                jacksonTypeRef<JourneyTemplatePublishRequest>(),
            )

        assertThat(roundtrippedJourneyTemplatePublishRequest)
            .isEqualTo(journeyTemplatePublishRequest)
    }
}

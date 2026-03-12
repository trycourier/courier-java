// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyTest {

    @Test
    fun create() {
        val journey =
            Journey.builder()
                .id("id")
                .name("name")
                .version(Journey.Version.PUBLISHED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(journey.id()).isEqualTo("id")
        assertThat(journey.name()).isEqualTo("name")
        assertThat(journey.version()).isEqualTo(Journey.Version.PUBLISHED)
        assertThat(journey.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(journey.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journey =
            Journey.builder()
                .id("id")
                .name("name")
                .version(Journey.Version.PUBLISHED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedJourney =
            jsonMapper.readValue(jsonMapper.writeValueAsString(journey), jacksonTypeRef<Journey>())

        assertThat(roundtrippedJourney).isEqualTo(journey)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyVersionItemTest {

    @Test
    fun create() {
        val journeyVersionItem =
            JourneyVersionItem.builder()
                .created(0L)
                .creator("creator")
                .name("name")
                .published(0L)
                .version("version")
                .build()

        assertThat(journeyVersionItem.created()).contains(0L)
        assertThat(journeyVersionItem.creator()).contains("creator")
        assertThat(journeyVersionItem.name()).isEqualTo("name")
        assertThat(journeyVersionItem.published()).contains(0L)
        assertThat(journeyVersionItem.version()).isEqualTo("version")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyVersionItem =
            JourneyVersionItem.builder()
                .created(0L)
                .creator("creator")
                .name("name")
                .published(0L)
                .version("version")
                .build()

        val roundtrippedJourneyVersionItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyVersionItem),
                jacksonTypeRef<JourneyVersionItem>(),
            )

        assertThat(roundtrippedJourneyVersionItem).isEqualTo(journeyVersionItem)
    }
}

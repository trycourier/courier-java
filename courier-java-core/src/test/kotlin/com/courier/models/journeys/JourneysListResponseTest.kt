// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneysListResponseTest {

    @Test
    fun create() {
        val journeysListResponse =
            JourneysListResponse.builder()
                .cursor("cursor")
                .addTemplate(
                    Journey.builder()
                        .id("id")
                        .name("name")
                        .version(Journey.Version.PUBLISHED)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(journeysListResponse.cursor()).contains("cursor")
        assertThat(journeysListResponse.templates().getOrNull())
            .containsExactly(
                Journey.builder()
                    .id("id")
                    .name("name")
                    .version(Journey.Version.PUBLISHED)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeysListResponse =
            JourneysListResponse.builder()
                .cursor("cursor")
                .addTemplate(
                    Journey.builder()
                        .id("id")
                        .name("name")
                        .version(Journey.Version.PUBLISHED)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedJourneysListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeysListResponse),
                jacksonTypeRef<JourneysListResponse>(),
            )

        assertThat(roundtrippedJourneysListResponse).isEqualTo(journeysListResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.courier.models.Paging
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyTemplateListResponseTest {

    @Test
    fun create() {
        val journeyTemplateListResponse =
            JourneyTemplateListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    JourneyTemplateSummary.builder()
                        .id("id")
                        .created(0L)
                        .creator("creator")
                        .name("name")
                        .state("state")
                        .addTag("string")
                        .updated(0L)
                        .updater("updater")
                        .build()
                )
                .build()

        assertThat(journeyTemplateListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
        assertThat(journeyTemplateListResponse.results())
            .containsExactly(
                JourneyTemplateSummary.builder()
                    .id("id")
                    .created(0L)
                    .creator("creator")
                    .name("name")
                    .state("state")
                    .addTag("string")
                    .updated(0L)
                    .updater("updater")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyTemplateListResponse =
            JourneyTemplateListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    JourneyTemplateSummary.builder()
                        .id("id")
                        .created(0L)
                        .creator("creator")
                        .name("name")
                        .state("state")
                        .addTag("string")
                        .updated(0L)
                        .updater("updater")
                        .build()
                )
                .build()

        val roundtrippedJourneyTemplateListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyTemplateListResponse),
                jacksonTypeRef<JourneyTemplateListResponse>(),
            )

        assertThat(roundtrippedJourneyTemplateListResponse).isEqualTo(journeyTemplateListResponse)
    }
}

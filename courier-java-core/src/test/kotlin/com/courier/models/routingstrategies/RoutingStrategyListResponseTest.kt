// File generated from our OpenAPI spec by Stainless.

package com.courier.models.routingstrategies

import com.courier.core.jsonMapper
import com.courier.models.Paging
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutingStrategyListResponseTest {

    @Test
    fun create() {
        val routingStrategyListResponse =
            RoutingStrategyListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    RoutingStrategySummary.builder()
                        .id("id")
                        .created(0L)
                        .creator("creator")
                        .name("name")
                        .description("description")
                        .addTag("string")
                        .updated(0L)
                        .updater("updater")
                        .build()
                )
                .build()

        assertThat(routingStrategyListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
        assertThat(routingStrategyListResponse.results())
            .containsExactly(
                RoutingStrategySummary.builder()
                    .id("id")
                    .created(0L)
                    .creator("creator")
                    .name("name")
                    .description("description")
                    .addTag("string")
                    .updated(0L)
                    .updater("updater")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routingStrategyListResponse =
            RoutingStrategyListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    RoutingStrategySummary.builder()
                        .id("id")
                        .created(0L)
                        .creator("creator")
                        .name("name")
                        .description("description")
                        .addTag("string")
                        .updated(0L)
                        .updater("updater")
                        .build()
                )
                .build()

        val roundtrippedRoutingStrategyListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routingStrategyListResponse),
                jacksonTypeRef<RoutingStrategyListResponse>(),
            )

        assertThat(roundtrippedRoutingStrategyListResponse).isEqualTo(routingStrategyListResponse)
    }
}

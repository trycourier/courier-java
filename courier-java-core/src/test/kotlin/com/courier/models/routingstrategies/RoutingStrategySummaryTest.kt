// File generated from our OpenAPI spec by Stainless.

package com.courier.models.routingstrategies

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutingStrategySummaryTest {

    @Test
    fun create() {
        val routingStrategySummary =
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

        assertThat(routingStrategySummary.id()).isEqualTo("id")
        assertThat(routingStrategySummary.created()).isEqualTo(0L)
        assertThat(routingStrategySummary.creator()).isEqualTo("creator")
        assertThat(routingStrategySummary.name()).isEqualTo("name")
        assertThat(routingStrategySummary.description()).contains("description")
        assertThat(routingStrategySummary.tags().getOrNull()).containsExactly("string")
        assertThat(routingStrategySummary.updated()).contains(0L)
        assertThat(routingStrategySummary.updater()).contains("updater")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routingStrategySummary =
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

        val roundtrippedRoutingStrategySummary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routingStrategySummary),
                jacksonTypeRef<RoutingStrategySummary>(),
            )

        assertThat(roundtrippedRoutingStrategySummary).isEqualTo(routingStrategySummary)
    }
}

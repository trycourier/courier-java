// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PagerdutyTest {

    @Test
    fun create() {
        val pagerduty =
            Pagerduty.builder()
                .eventAction("event_action")
                .routingKey("routing_key")
                .severity("severity")
                .source("source")
                .build()

        assertThat(pagerduty.eventAction()).contains("event_action")
        assertThat(pagerduty.routingKey()).contains("routing_key")
        assertThat(pagerduty.severity()).contains("severity")
        assertThat(pagerduty.source()).contains("source")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pagerduty =
            Pagerduty.builder()
                .eventAction("event_action")
                .routingKey("routing_key")
                .severity("severity")
                .source("source")
                .build()

        val roundtrippedPagerduty =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pagerduty),
                jacksonTypeRef<Pagerduty>(),
            )

        assertThat(roundtrippedPagerduty).isEqualTo(pagerduty)
    }
}

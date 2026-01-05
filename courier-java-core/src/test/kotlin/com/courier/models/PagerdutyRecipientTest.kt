// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PagerdutyRecipientTest {

    @Test
    fun create() {
        val pagerdutyRecipient =
            PagerdutyRecipient.builder()
                .pagerduty(
                    Pagerduty.builder()
                        .eventAction("event_action")
                        .routingKey("routing_key")
                        .severity("severity")
                        .source("source")
                        .build()
                )
                .build()

        assertThat(pagerdutyRecipient.pagerduty())
            .isEqualTo(
                Pagerduty.builder()
                    .eventAction("event_action")
                    .routingKey("routing_key")
                    .severity("severity")
                    .source("source")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pagerdutyRecipient =
            PagerdutyRecipient.builder()
                .pagerduty(
                    Pagerduty.builder()
                        .eventAction("event_action")
                        .routingKey("routing_key")
                        .severity("severity")
                        .source("source")
                        .build()
                )
                .build()

        val roundtrippedPagerdutyRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pagerdutyRecipient),
                jacksonTypeRef<PagerdutyRecipient>(),
            )

        assertThat(roundtrippedPagerdutyRecipient).isEqualTo(pagerdutyRecipient)
    }
}

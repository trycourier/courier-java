// File generated from our OpenAPI spec by Stainless.

package com.courier.models.routingstrategies

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutingStrategyMutationResponseTest {

    @Test
    fun create() {
        val routingStrategyMutationResponse =
            RoutingStrategyMutationResponse.builder().id("id").build()

        assertThat(routingStrategyMutationResponse.id()).isEqualTo("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routingStrategyMutationResponse =
            RoutingStrategyMutationResponse.builder().id("id").build()

        val roundtrippedRoutingStrategyMutationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routingStrategyMutationResponse),
                jacksonTypeRef<RoutingStrategyMutationResponse>(),
            )

        assertThat(roundtrippedRoutingStrategyMutationResponse)
            .isEqualTo(routingStrategyMutationResponse)
    }
}

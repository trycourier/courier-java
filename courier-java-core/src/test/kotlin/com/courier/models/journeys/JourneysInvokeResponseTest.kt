// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneysInvokeResponseTest {

    @Test
    fun create() {
        val journeysInvokeResponse = JourneysInvokeResponse.builder().runId("runId").build()

        assertThat(journeysInvokeResponse.runId()).isEqualTo("runId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeysInvokeResponse = JourneysInvokeResponse.builder().runId("runId").build()

        val roundtrippedJourneysInvokeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeysInvokeResponse),
                jacksonTypeRef<JourneysInvokeResponse>(),
            )

        assertThat(roundtrippedJourneysInvokeResponse).isEqualTo(journeysInvokeResponse)
    }
}

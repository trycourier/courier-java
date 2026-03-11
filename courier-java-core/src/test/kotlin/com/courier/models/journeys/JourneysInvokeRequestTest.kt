// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneysInvokeRequestTest {

    @Test
    fun create() {
        val journeysInvokeRequest =
            JourneysInvokeRequest.builder()
                .data(
                    JourneysInvokeRequest.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .profile(
                    JourneysInvokeRequest.Profile.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .userId("user_id")
                .build()

        assertThat(journeysInvokeRequest.data())
            .contains(
                JourneysInvokeRequest.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(journeysInvokeRequest.profile())
            .contains(
                JourneysInvokeRequest.Profile.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(journeysInvokeRequest.userId()).contains("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeysInvokeRequest =
            JourneysInvokeRequest.builder()
                .data(
                    JourneysInvokeRequest.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .profile(
                    JourneysInvokeRequest.Profile.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .userId("user_id")
                .build()

        val roundtrippedJourneysInvokeRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeysInvokeRequest),
                jacksonTypeRef<JourneysInvokeRequest>(),
            )

        assertThat(roundtrippedJourneysInvokeRequest).isEqualTo(journeysInvokeRequest)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyFetchGetDeleteNodeTest {

    @Test
    fun create() {
        val journeyFetchGetDeleteNode =
            JourneyFetchGetDeleteNode.builder()
                .mergeStrategy(JourneyMergeStrategy.OVERWRITE)
                .method(JourneyFetchGetDeleteNode.Method.GET)
                .type(JourneyFetchGetDeleteNode.Type.FETCH)
                .url("x")
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .headers(
                    JourneyFetchGetDeleteNode.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .queryParams(
                    JourneyFetchGetDeleteNode.QueryParams.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .responseSchema(
                    JourneyFetchGetDeleteNode.ResponseSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(journeyFetchGetDeleteNode.mergeStrategy())
            .isEqualTo(JourneyMergeStrategy.OVERWRITE)
        assertThat(journeyFetchGetDeleteNode.method())
            .isEqualTo(JourneyFetchGetDeleteNode.Method.GET)
        assertThat(journeyFetchGetDeleteNode.type()).isEqualTo(JourneyFetchGetDeleteNode.Type.FETCH)
        assertThat(journeyFetchGetDeleteNode.url()).isEqualTo("x")
        assertThat(journeyFetchGetDeleteNode.id()).contains("x")
        assertThat(journeyFetchGetDeleteNode.conditions())
            .contains(JourneyConditionsField.ofConditionAtom(listOf("string", "string")))
        assertThat(journeyFetchGetDeleteNode.headers())
            .contains(
                JourneyFetchGetDeleteNode.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(journeyFetchGetDeleteNode.queryParams())
            .contains(
                JourneyFetchGetDeleteNode.QueryParams.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(journeyFetchGetDeleteNode.responseSchema())
            .contains(
                JourneyFetchGetDeleteNode.ResponseSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyFetchGetDeleteNode =
            JourneyFetchGetDeleteNode.builder()
                .mergeStrategy(JourneyMergeStrategy.OVERWRITE)
                .method(JourneyFetchGetDeleteNode.Method.GET)
                .type(JourneyFetchGetDeleteNode.Type.FETCH)
                .url("x")
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .headers(
                    JourneyFetchGetDeleteNode.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .queryParams(
                    JourneyFetchGetDeleteNode.QueryParams.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .responseSchema(
                    JourneyFetchGetDeleteNode.ResponseSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedJourneyFetchGetDeleteNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyFetchGetDeleteNode),
                jacksonTypeRef<JourneyFetchGetDeleteNode>(),
            )

        assertThat(roundtrippedJourneyFetchGetDeleteNode).isEqualTo(journeyFetchGetDeleteNode)
    }
}

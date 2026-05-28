// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyFetchPostPutNodeTest {

    @Test
    fun create() {
        val journeyFetchPostPutNode =
            JourneyFetchPostPutNode.builder()
                .mergeStrategy(JourneyMergeStrategy.OVERWRITE)
                .method(JourneyFetchPostPutNode.Method.POST)
                .type(JourneyFetchPostPutNode.Type.FETCH)
                .url("x")
                .id("x")
                .body("body")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .headers(
                    JourneyFetchPostPutNode.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .queryParams(
                    JourneyFetchPostPutNode.QueryParams.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .responseSchema(
                    JourneyFetchPostPutNode.ResponseSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(journeyFetchPostPutNode.mergeStrategy())
            .isEqualTo(JourneyMergeStrategy.OVERWRITE)
        assertThat(journeyFetchPostPutNode.method()).isEqualTo(JourneyFetchPostPutNode.Method.POST)
        assertThat(journeyFetchPostPutNode.type()).isEqualTo(JourneyFetchPostPutNode.Type.FETCH)
        assertThat(journeyFetchPostPutNode.url()).isEqualTo("x")
        assertThat(journeyFetchPostPutNode.id()).contains("x")
        assertThat(journeyFetchPostPutNode.body()).contains("body")
        assertThat(journeyFetchPostPutNode.conditions())
            .contains(JourneyConditionsField.ofConditionAtom(listOf("string", "string")))
        assertThat(journeyFetchPostPutNode.headers())
            .contains(
                JourneyFetchPostPutNode.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(journeyFetchPostPutNode.queryParams())
            .contains(
                JourneyFetchPostPutNode.QueryParams.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(journeyFetchPostPutNode.responseSchema())
            .contains(
                JourneyFetchPostPutNode.ResponseSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyFetchPostPutNode =
            JourneyFetchPostPutNode.builder()
                .mergeStrategy(JourneyMergeStrategy.OVERWRITE)
                .method(JourneyFetchPostPutNode.Method.POST)
                .type(JourneyFetchPostPutNode.Type.FETCH)
                .url("x")
                .id("x")
                .body("body")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .headers(
                    JourneyFetchPostPutNode.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .queryParams(
                    JourneyFetchPostPutNode.QueryParams.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .responseSchema(
                    JourneyFetchPostPutNode.ResponseSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedJourneyFetchPostPutNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyFetchPostPutNode),
                jacksonTypeRef<JourneyFetchPostPutNode>(),
            )

        assertThat(roundtrippedJourneyFetchPostPutNode).isEqualTo(journeyFetchPostPutNode)
    }
}

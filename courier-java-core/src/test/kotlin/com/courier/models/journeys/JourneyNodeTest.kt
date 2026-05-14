// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class JourneyNodeTest {

    @Test
    fun ofApiInvokeTrigger() {
        val apiInvokeTrigger =
            JourneyApiInvokeTriggerNode.builder()
                .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .schema(
                    JourneyApiInvokeTriggerNode.Schema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val journeyNode = JourneyNode.ofApiInvokeTrigger(apiInvokeTrigger)

        assertThat(journeyNode.apiInvokeTrigger()).contains(apiInvokeTrigger)
        assertThat(journeyNode.segmentTrigger()).isEmpty
        assertThat(journeyNode.send()).isEmpty
        assertThat(journeyNode.delayDuration()).isEmpty
        assertThat(journeyNode.delayUntil()).isEmpty
        assertThat(journeyNode.fetchGetDelete()).isEmpty
        assertThat(journeyNode.fetchPostPut()).isEmpty
        assertThat(journeyNode.ai()).isEmpty
        assertThat(journeyNode.throttleStatic()).isEmpty
        assertThat(journeyNode.throttleDynamic()).isEmpty
        assertThat(journeyNode.exit()).isEmpty
        assertThat(journeyNode.branch()).isEmpty
    }

    @Test
    fun ofApiInvokeTriggerRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeyNode =
            JourneyNode.ofApiInvokeTrigger(
                JourneyApiInvokeTriggerNode.builder()
                    .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                    .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                    .id("x")
                    .conditionsOfConditionAtom(listOf("string", "string"))
                    .schema(
                        JourneyApiInvokeTriggerNode.Schema.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val roundtrippedJourneyNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyNode),
                jacksonTypeRef<JourneyNode>(),
            )

        assertThat(roundtrippedJourneyNode).isEqualTo(journeyNode)
    }

    @Test
    fun ofSegmentTrigger() {
        val segmentTrigger =
            JourneySegmentTriggerNode.builder()
                .requestType(JourneySegmentTriggerNode.RequestType.IDENTIFY)
                .triggerType(JourneySegmentTriggerNode.TriggerType.SEGMENT)
                .type(JourneySegmentTriggerNode.Type.TRIGGER)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .eventId("x")
                .build()

        val journeyNode = JourneyNode.ofSegmentTrigger(segmentTrigger)

        assertThat(journeyNode.apiInvokeTrigger()).isEmpty
        assertThat(journeyNode.segmentTrigger()).contains(segmentTrigger)
        assertThat(journeyNode.send()).isEmpty
        assertThat(journeyNode.delayDuration()).isEmpty
        assertThat(journeyNode.delayUntil()).isEmpty
        assertThat(journeyNode.fetchGetDelete()).isEmpty
        assertThat(journeyNode.fetchPostPut()).isEmpty
        assertThat(journeyNode.ai()).isEmpty
        assertThat(journeyNode.throttleStatic()).isEmpty
        assertThat(journeyNode.throttleDynamic()).isEmpty
        assertThat(journeyNode.exit()).isEmpty
        assertThat(journeyNode.branch()).isEmpty
    }

    @Test
    fun ofSegmentTriggerRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeyNode =
            JourneyNode.ofSegmentTrigger(
                JourneySegmentTriggerNode.builder()
                    .requestType(JourneySegmentTriggerNode.RequestType.IDENTIFY)
                    .triggerType(JourneySegmentTriggerNode.TriggerType.SEGMENT)
                    .type(JourneySegmentTriggerNode.Type.TRIGGER)
                    .id("x")
                    .conditionsOfConditionAtom(listOf("string", "string"))
                    .eventId("x")
                    .build()
            )

        val roundtrippedJourneyNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyNode),
                jacksonTypeRef<JourneyNode>(),
            )

        assertThat(roundtrippedJourneyNode).isEqualTo(journeyNode)
    }

    @Test
    fun ofSend() {
        val send =
            JourneySendNode.builder()
                .message(
                    JourneySendNode.Message.builder()
                        .template("x")
                        .data(
                            JourneySendNode.Message.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .delay(
                            JourneySendNode.Message.Delay.builder().until("x").timezone("x").build()
                        )
                        .to(
                            JourneySendNode.Message.To.builder()
                                .emailOverride("x")
                                .phoneNumberOverride("x")
                                .userIdOverride("x")
                                .build()
                        )
                        .build()
                )
                .type(JourneySendNode.Type.SEND)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .build()

        val journeyNode = JourneyNode.ofSend(send)

        assertThat(journeyNode.apiInvokeTrigger()).isEmpty
        assertThat(journeyNode.segmentTrigger()).isEmpty
        assertThat(journeyNode.send()).contains(send)
        assertThat(journeyNode.delayDuration()).isEmpty
        assertThat(journeyNode.delayUntil()).isEmpty
        assertThat(journeyNode.fetchGetDelete()).isEmpty
        assertThat(journeyNode.fetchPostPut()).isEmpty
        assertThat(journeyNode.ai()).isEmpty
        assertThat(journeyNode.throttleStatic()).isEmpty
        assertThat(journeyNode.throttleDynamic()).isEmpty
        assertThat(journeyNode.exit()).isEmpty
        assertThat(journeyNode.branch()).isEmpty
    }

    @Test
    fun ofSendRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeyNode =
            JourneyNode.ofSend(
                JourneySendNode.builder()
                    .message(
                        JourneySendNode.Message.builder()
                            .template("x")
                            .data(
                                JourneySendNode.Message.Data.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .delay(
                                JourneySendNode.Message.Delay.builder()
                                    .until("x")
                                    .timezone("x")
                                    .build()
                            )
                            .to(
                                JourneySendNode.Message.To.builder()
                                    .emailOverride("x")
                                    .phoneNumberOverride("x")
                                    .userIdOverride("x")
                                    .build()
                            )
                            .build()
                    )
                    .type(JourneySendNode.Type.SEND)
                    .id("x")
                    .conditionsOfConditionAtom(listOf("string", "string"))
                    .build()
            )

        val roundtrippedJourneyNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyNode),
                jacksonTypeRef<JourneyNode>(),
            )

        assertThat(roundtrippedJourneyNode).isEqualTo(journeyNode)
    }

    @Test
    fun ofDelayDuration() {
        val delayDuration =
            JourneyDelayDurationNode.builder()
                .duration("x")
                .mode(JourneyDelayDurationNode.Mode.DURATION)
                .type(JourneyDelayDurationNode.Type.DELAY)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .build()

        val journeyNode = JourneyNode.ofDelayDuration(delayDuration)

        assertThat(journeyNode.apiInvokeTrigger()).isEmpty
        assertThat(journeyNode.segmentTrigger()).isEmpty
        assertThat(journeyNode.send()).isEmpty
        assertThat(journeyNode.delayDuration()).contains(delayDuration)
        assertThat(journeyNode.delayUntil()).isEmpty
        assertThat(journeyNode.fetchGetDelete()).isEmpty
        assertThat(journeyNode.fetchPostPut()).isEmpty
        assertThat(journeyNode.ai()).isEmpty
        assertThat(journeyNode.throttleStatic()).isEmpty
        assertThat(journeyNode.throttleDynamic()).isEmpty
        assertThat(journeyNode.exit()).isEmpty
        assertThat(journeyNode.branch()).isEmpty
    }

    @Test
    fun ofDelayDurationRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeyNode =
            JourneyNode.ofDelayDuration(
                JourneyDelayDurationNode.builder()
                    .duration("x")
                    .mode(JourneyDelayDurationNode.Mode.DURATION)
                    .type(JourneyDelayDurationNode.Type.DELAY)
                    .id("x")
                    .conditionsOfConditionAtom(listOf("string", "string"))
                    .build()
            )

        val roundtrippedJourneyNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyNode),
                jacksonTypeRef<JourneyNode>(),
            )

        assertThat(roundtrippedJourneyNode).isEqualTo(journeyNode)
    }

    @Test
    fun ofDelayUntil() {
        val delayUntil =
            JourneyDelayUntilNode.builder()
                .mode(JourneyDelayUntilNode.Mode.UNTIL)
                .type(JourneyDelayUntilNode.Type.DELAY)
                .until("x")
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .build()

        val journeyNode = JourneyNode.ofDelayUntil(delayUntil)

        assertThat(journeyNode.apiInvokeTrigger()).isEmpty
        assertThat(journeyNode.segmentTrigger()).isEmpty
        assertThat(journeyNode.send()).isEmpty
        assertThat(journeyNode.delayDuration()).isEmpty
        assertThat(journeyNode.delayUntil()).contains(delayUntil)
        assertThat(journeyNode.fetchGetDelete()).isEmpty
        assertThat(journeyNode.fetchPostPut()).isEmpty
        assertThat(journeyNode.ai()).isEmpty
        assertThat(journeyNode.throttleStatic()).isEmpty
        assertThat(journeyNode.throttleDynamic()).isEmpty
        assertThat(journeyNode.exit()).isEmpty
        assertThat(journeyNode.branch()).isEmpty
    }

    @Test
    fun ofDelayUntilRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeyNode =
            JourneyNode.ofDelayUntil(
                JourneyDelayUntilNode.builder()
                    .mode(JourneyDelayUntilNode.Mode.UNTIL)
                    .type(JourneyDelayUntilNode.Type.DELAY)
                    .until("x")
                    .id("x")
                    .conditionsOfConditionAtom(listOf("string", "string"))
                    .build()
            )

        val roundtrippedJourneyNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyNode),
                jacksonTypeRef<JourneyNode>(),
            )

        assertThat(roundtrippedJourneyNode).isEqualTo(journeyNode)
    }

    @Test
    fun ofFetchGetDelete() {
        val fetchGetDelete =
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

        val journeyNode = JourneyNode.ofFetchGetDelete(fetchGetDelete)

        assertThat(journeyNode.apiInvokeTrigger()).isEmpty
        assertThat(journeyNode.segmentTrigger()).isEmpty
        assertThat(journeyNode.send()).isEmpty
        assertThat(journeyNode.delayDuration()).isEmpty
        assertThat(journeyNode.delayUntil()).isEmpty
        assertThat(journeyNode.fetchGetDelete()).contains(fetchGetDelete)
        assertThat(journeyNode.fetchPostPut()).isEmpty
        assertThat(journeyNode.ai()).isEmpty
        assertThat(journeyNode.throttleStatic()).isEmpty
        assertThat(journeyNode.throttleDynamic()).isEmpty
        assertThat(journeyNode.exit()).isEmpty
        assertThat(journeyNode.branch()).isEmpty
    }

    @Test
    fun ofFetchGetDeleteRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeyNode =
            JourneyNode.ofFetchGetDelete(
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
            )

        val roundtrippedJourneyNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyNode),
                jacksonTypeRef<JourneyNode>(),
            )

        assertThat(roundtrippedJourneyNode).isEqualTo(journeyNode)
    }

    @Test
    fun ofFetchPostPut() {
        val fetchPostPut =
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

        val journeyNode = JourneyNode.ofFetchPostPut(fetchPostPut)

        assertThat(journeyNode.apiInvokeTrigger()).isEmpty
        assertThat(journeyNode.segmentTrigger()).isEmpty
        assertThat(journeyNode.send()).isEmpty
        assertThat(journeyNode.delayDuration()).isEmpty
        assertThat(journeyNode.delayUntil()).isEmpty
        assertThat(journeyNode.fetchGetDelete()).isEmpty
        assertThat(journeyNode.fetchPostPut()).contains(fetchPostPut)
        assertThat(journeyNode.ai()).isEmpty
        assertThat(journeyNode.throttleStatic()).isEmpty
        assertThat(journeyNode.throttleDynamic()).isEmpty
        assertThat(journeyNode.exit()).isEmpty
        assertThat(journeyNode.branch()).isEmpty
    }

    @Test
    fun ofFetchPostPutRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeyNode =
            JourneyNode.ofFetchPostPut(
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
            )

        val roundtrippedJourneyNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyNode),
                jacksonTypeRef<JourneyNode>(),
            )

        assertThat(roundtrippedJourneyNode).isEqualTo(journeyNode)
    }

    @Test
    fun ofAi() {
        val ai =
            JourneyAiNode.builder()
                .outputSchema(
                    JourneyAiNode.OutputSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(JourneyAiNode.Type.AI)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .model("x")
                .userPrompt("user_prompt")
                .webSearch(true)
                .build()

        val journeyNode = JourneyNode.ofAi(ai)

        assertThat(journeyNode.apiInvokeTrigger()).isEmpty
        assertThat(journeyNode.segmentTrigger()).isEmpty
        assertThat(journeyNode.send()).isEmpty
        assertThat(journeyNode.delayDuration()).isEmpty
        assertThat(journeyNode.delayUntil()).isEmpty
        assertThat(journeyNode.fetchGetDelete()).isEmpty
        assertThat(journeyNode.fetchPostPut()).isEmpty
        assertThat(journeyNode.ai()).contains(ai)
        assertThat(journeyNode.throttleStatic()).isEmpty
        assertThat(journeyNode.throttleDynamic()).isEmpty
        assertThat(journeyNode.exit()).isEmpty
        assertThat(journeyNode.branch()).isEmpty
    }

    @Test
    fun ofAiRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeyNode =
            JourneyNode.ofAi(
                JourneyAiNode.builder()
                    .outputSchema(
                        JourneyAiNode.OutputSchema.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .type(JourneyAiNode.Type.AI)
                    .id("x")
                    .conditionsOfConditionAtom(listOf("string", "string"))
                    .model("x")
                    .userPrompt("user_prompt")
                    .webSearch(true)
                    .build()
            )

        val roundtrippedJourneyNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyNode),
                jacksonTypeRef<JourneyNode>(),
            )

        assertThat(roundtrippedJourneyNode).isEqualTo(journeyNode)
    }

    @Test
    fun ofThrottleStatic() {
        val throttleStatic =
            JourneyThrottleStaticNode.builder()
                .maxAllowed(1L)
                .period("x")
                .scope(JourneyThrottleStaticNode.Scope.USER)
                .type(JourneyThrottleStaticNode.Type.THROTTLE)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .build()

        val journeyNode = JourneyNode.ofThrottleStatic(throttleStatic)

        assertThat(journeyNode.apiInvokeTrigger()).isEmpty
        assertThat(journeyNode.segmentTrigger()).isEmpty
        assertThat(journeyNode.send()).isEmpty
        assertThat(journeyNode.delayDuration()).isEmpty
        assertThat(journeyNode.delayUntil()).isEmpty
        assertThat(journeyNode.fetchGetDelete()).isEmpty
        assertThat(journeyNode.fetchPostPut()).isEmpty
        assertThat(journeyNode.ai()).isEmpty
        assertThat(journeyNode.throttleStatic()).contains(throttleStatic)
        assertThat(journeyNode.throttleDynamic()).isEmpty
        assertThat(journeyNode.exit()).isEmpty
        assertThat(journeyNode.branch()).isEmpty
    }

    @Test
    fun ofThrottleStaticRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeyNode =
            JourneyNode.ofThrottleStatic(
                JourneyThrottleStaticNode.builder()
                    .maxAllowed(1L)
                    .period("x")
                    .scope(JourneyThrottleStaticNode.Scope.USER)
                    .type(JourneyThrottleStaticNode.Type.THROTTLE)
                    .id("x")
                    .conditionsOfConditionAtom(listOf("string", "string"))
                    .build()
            )

        val roundtrippedJourneyNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyNode),
                jacksonTypeRef<JourneyNode>(),
            )

        assertThat(roundtrippedJourneyNode).isEqualTo(journeyNode)
    }

    @Test
    fun ofThrottleDynamic() {
        val throttleDynamic =
            JourneyThrottleDynamicNode.builder()
                .maxAllowed(1L)
                .period("x")
                .scope(JourneyThrottleDynamicNode.Scope.DYNAMIC)
                .throttleKey("x")
                .type(JourneyThrottleDynamicNode.Type.THROTTLE)
                .id("x")
                .conditionsOfConditionAtom(listOf("string", "string"))
                .build()

        val journeyNode = JourneyNode.ofThrottleDynamic(throttleDynamic)

        assertThat(journeyNode.apiInvokeTrigger()).isEmpty
        assertThat(journeyNode.segmentTrigger()).isEmpty
        assertThat(journeyNode.send()).isEmpty
        assertThat(journeyNode.delayDuration()).isEmpty
        assertThat(journeyNode.delayUntil()).isEmpty
        assertThat(journeyNode.fetchGetDelete()).isEmpty
        assertThat(journeyNode.fetchPostPut()).isEmpty
        assertThat(journeyNode.ai()).isEmpty
        assertThat(journeyNode.throttleStatic()).isEmpty
        assertThat(journeyNode.throttleDynamic()).contains(throttleDynamic)
        assertThat(journeyNode.exit()).isEmpty
        assertThat(journeyNode.branch()).isEmpty
    }

    @Test
    fun ofThrottleDynamicRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeyNode =
            JourneyNode.ofThrottleDynamic(
                JourneyThrottleDynamicNode.builder()
                    .maxAllowed(1L)
                    .period("x")
                    .scope(JourneyThrottleDynamicNode.Scope.DYNAMIC)
                    .throttleKey("x")
                    .type(JourneyThrottleDynamicNode.Type.THROTTLE)
                    .id("x")
                    .conditionsOfConditionAtom(listOf("string", "string"))
                    .build()
            )

        val roundtrippedJourneyNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyNode),
                jacksonTypeRef<JourneyNode>(),
            )

        assertThat(roundtrippedJourneyNode).isEqualTo(journeyNode)
    }

    @Test
    fun ofExit() {
        val exit = JourneyExitNode.builder().type(JourneyExitNode.Type.EXIT).id("x").build()

        val journeyNode = JourneyNode.ofExit(exit)

        assertThat(journeyNode.apiInvokeTrigger()).isEmpty
        assertThat(journeyNode.segmentTrigger()).isEmpty
        assertThat(journeyNode.send()).isEmpty
        assertThat(journeyNode.delayDuration()).isEmpty
        assertThat(journeyNode.delayUntil()).isEmpty
        assertThat(journeyNode.fetchGetDelete()).isEmpty
        assertThat(journeyNode.fetchPostPut()).isEmpty
        assertThat(journeyNode.ai()).isEmpty
        assertThat(journeyNode.throttleStatic()).isEmpty
        assertThat(journeyNode.throttleDynamic()).isEmpty
        assertThat(journeyNode.exit()).contains(exit)
        assertThat(journeyNode.branch()).isEmpty
    }

    @Test
    fun ofExitRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeyNode =
            JourneyNode.ofExit(
                JourneyExitNode.builder().type(JourneyExitNode.Type.EXIT).id("x").build()
            )

        val roundtrippedJourneyNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyNode),
                jacksonTypeRef<JourneyNode>(),
            )

        assertThat(roundtrippedJourneyNode).isEqualTo(journeyNode)
    }

    @Test
    fun ofBranch() {
        val branch =
            JourneyNode.JourneyBranchNode.builder()
                .default_(
                    JourneyNode.JourneyBranchNode.Default.builder()
                        .addNode(
                            JourneyApiInvokeTriggerNode.builder()
                                .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                                .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                                .id("x")
                                .conditionsOfConditionAtom(listOf("string", "string"))
                                .schema(
                                    JourneyApiInvokeTriggerNode.Schema.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .label("x")
                        .build()
                )
                .addPath(
                    JourneyNode.JourneyBranchNode.Path.builder()
                        .conditionsOfConditionAtom(listOf("string", "string"))
                        .nodes(listOf())
                        .label("x")
                        .build()
                )
                .type(JourneyNode.JourneyBranchNode.Type.BRANCH)
                .id("x")
                .build()

        val journeyNode = JourneyNode.ofBranch(branch)

        assertThat(journeyNode.apiInvokeTrigger()).isEmpty
        assertThat(journeyNode.segmentTrigger()).isEmpty
        assertThat(journeyNode.send()).isEmpty
        assertThat(journeyNode.delayDuration()).isEmpty
        assertThat(journeyNode.delayUntil()).isEmpty
        assertThat(journeyNode.fetchGetDelete()).isEmpty
        assertThat(journeyNode.fetchPostPut()).isEmpty
        assertThat(journeyNode.ai()).isEmpty
        assertThat(journeyNode.throttleStatic()).isEmpty
        assertThat(journeyNode.throttleDynamic()).isEmpty
        assertThat(journeyNode.exit()).isEmpty
        assertThat(journeyNode.branch()).contains(branch)
    }

    @Test
    fun ofBranchRoundtrip() {
        val jsonMapper = jsonMapper()
        val journeyNode =
            JourneyNode.ofBranch(
                JourneyNode.JourneyBranchNode.builder()
                    .default_(
                        JourneyNode.JourneyBranchNode.Default.builder()
                            .addNode(
                                JourneyApiInvokeTriggerNode.builder()
                                    .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                                    .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                                    .id("x")
                                    .conditionsOfConditionAtom(listOf("string", "string"))
                                    .schema(
                                        JourneyApiInvokeTriggerNode.Schema.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .build()
                            )
                            .label("x")
                            .build()
                    )
                    .addPath(
                        JourneyNode.JourneyBranchNode.Path.builder()
                            .conditionsOfConditionAtom(listOf("string", "string"))
                            .nodes(listOf())
                            .label("x")
                            .build()
                    )
                    .type(JourneyNode.JourneyBranchNode.Type.BRANCH)
                    .id("x")
                    .build()
            )

        val roundtrippedJourneyNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyNode),
                jacksonTypeRef<JourneyNode>(),
            )

        assertThat(roundtrippedJourneyNode).isEqualTo(journeyNode)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val journeyNode = jsonMapper().convertValue(testCase.value, jacksonTypeRef<JourneyNode>())

        val e = assertThrows<CourierInvalidDataException> { journeyNode.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}

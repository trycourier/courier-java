// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.JsonValue
import com.courier.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyCreateParamsTest {

    @Test
    fun create() {
        JourneyCreateParams.builder()
            .idempotencyKey("order-ORD-456-user-123")
            .xIdempotencyExpiration("1785312000")
            .createJourneyRequest(
                CreateJourneyRequest.builder()
                    .name("Welcome Journey")
                    .addNode(
                        JourneyApiInvokeTriggerNode.builder()
                            .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                            .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                            .id("trigger-1")
                            .conditionsOfConditionAtom(listOf("string", "string"))
                            .schema(
                                JourneyApiInvokeTriggerNode.Schema.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .addNode(
                        JourneyApiInvokeTriggerNode.builder()
                            .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                            .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                            .id("send-1")
                            .conditionsOfConditionAtom(listOf("string", "string"))
                            .schema(
                                JourneyApiInvokeTriggerNode.Schema.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .enabled(true)
                    .state(JourneyState.DRAFT)
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            JourneyCreateParams.builder()
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .createJourneyRequest(
                    CreateJourneyRequest.builder()
                        .name("Welcome Journey")
                        .addNode(
                            JourneyApiInvokeTriggerNode.builder()
                                .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                                .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                                .id("trigger-1")
                                .conditionsOfConditionAtom(listOf("string", "string"))
                                .schema(
                                    JourneyApiInvokeTriggerNode.Schema.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .addNode(
                            JourneyApiInvokeTriggerNode.builder()
                                .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                                .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                                .id("send-1")
                                .conditionsOfConditionAtom(listOf("string", "string"))
                                .schema(
                                    JourneyApiInvokeTriggerNode.Schema.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .enabled(true)
                        .state(JourneyState.DRAFT)
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("Idempotency-Key", "order-ORD-456-user-123")
                    .put("x-idempotency-expiration", "1785312000")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            JourneyCreateParams.builder()
                .createJourneyRequest(
                    CreateJourneyRequest.builder()
                        .name("Welcome Journey")
                        .addNode(
                            JourneyApiInvokeTriggerNode.builder()
                                .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                                .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                                .build()
                        )
                        .addNode(
                            JourneyApiInvokeTriggerNode.builder()
                                .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                                .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                                .build()
                        )
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            JourneyCreateParams.builder()
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .createJourneyRequest(
                    CreateJourneyRequest.builder()
                        .name("Welcome Journey")
                        .addNode(
                            JourneyApiInvokeTriggerNode.builder()
                                .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                                .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                                .id("trigger-1")
                                .conditionsOfConditionAtom(listOf("string", "string"))
                                .schema(
                                    JourneyApiInvokeTriggerNode.Schema.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .addNode(
                            JourneyApiInvokeTriggerNode.builder()
                                .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                                .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                                .id("send-1")
                                .conditionsOfConditionAtom(listOf("string", "string"))
                                .schema(
                                    JourneyApiInvokeTriggerNode.Schema.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .build()
                        )
                        .enabled(true)
                        .state(JourneyState.DRAFT)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateJourneyRequest.builder()
                    .name("Welcome Journey")
                    .addNode(
                        JourneyApiInvokeTriggerNode.builder()
                            .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                            .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                            .id("trigger-1")
                            .conditionsOfConditionAtom(listOf("string", "string"))
                            .schema(
                                JourneyApiInvokeTriggerNode.Schema.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .addNode(
                        JourneyApiInvokeTriggerNode.builder()
                            .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                            .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                            .id("send-1")
                            .conditionsOfConditionAtom(listOf("string", "string"))
                            .schema(
                                JourneyApiInvokeTriggerNode.Schema.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .enabled(true)
                    .state(JourneyState.DRAFT)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            JourneyCreateParams.builder()
                .createJourneyRequest(
                    CreateJourneyRequest.builder()
                        .name("Welcome Journey")
                        .addNode(
                            JourneyApiInvokeTriggerNode.builder()
                                .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                                .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                                .build()
                        )
                        .addNode(
                            JourneyApiInvokeTriggerNode.builder()
                                .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                                .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateJourneyRequest.builder()
                    .name("Welcome Journey")
                    .addNode(
                        JourneyApiInvokeTriggerNode.builder()
                            .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                            .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                            .build()
                    )
                    .addNode(
                        JourneyApiInvokeTriggerNode.builder()
                            .triggerType(JourneyApiInvokeTriggerNode.TriggerType.API_INVOKE)
                            .type(JourneyApiInvokeTriggerNode.Type.TRIGGER)
                            .build()
                    )
                    .build()
            )
    }
}

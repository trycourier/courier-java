// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneySendNodeTest {

    @Test
    fun create() {
        val journeySendNode =
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

        assertThat(journeySendNode.message())
            .isEqualTo(
                JourneySendNode.Message.builder()
                    .template("x")
                    .data(
                        JourneySendNode.Message.Data.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .delay(JourneySendNode.Message.Delay.builder().until("x").timezone("x").build())
                    .to(
                        JourneySendNode.Message.To.builder()
                            .emailOverride("x")
                            .phoneNumberOverride("x")
                            .userIdOverride("x")
                            .build()
                    )
                    .build()
            )
        assertThat(journeySendNode.type()).isEqualTo(JourneySendNode.Type.SEND)
        assertThat(journeySendNode.id()).contains("x")
        assertThat(journeySendNode.conditions())
            .contains(JourneyConditionsField.ofConditionAtom(listOf("string", "string")))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeySendNode =
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

        val roundtrippedJourneySendNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeySendNode),
                jacksonTypeRef<JourneySendNode>(),
            )

        assertThat(roundtrippedJourneySendNode).isEqualTo(journeySendNode)
    }
}

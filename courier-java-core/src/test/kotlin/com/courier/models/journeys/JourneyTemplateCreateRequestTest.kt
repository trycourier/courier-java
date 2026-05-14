// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.courier.models.ElementalTextNodeWithType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyTemplateCreateRequestTest {

    @Test
    fun create() {
        val journeyTemplateCreateRequest =
            JourneyTemplateCreateRequest.builder()
                .channel("x")
                .notification(
                    JourneyTemplateCreateRequest.Notification.builder()
                        .brand(
                            JourneyTemplateCreateRequest.Notification.Brand.builder()
                                .id("id")
                                .build()
                        )
                        .content(
                            JourneyTemplateCreateRequest.Notification.Content.builder()
                                .addElement(
                                    ElementalTextNodeWithType.builder()
                                        .addChannel("string")
                                        .if_("if")
                                        .loop("loop")
                                        .ref("ref")
                                        .type(ElementalTextNodeWithType.Type.TEXT)
                                        .build()
                                )
                                .version(
                                    JourneyTemplateCreateRequest.Notification.Content.Version
                                        ._2022_01_01
                                )
                                .scope(
                                    JourneyTemplateCreateRequest.Notification.Content.Scope.DEFAULT
                                )
                                .build()
                        )
                        .name("name")
                        .subscription(
                            JourneyTemplateCreateRequest.Notification.Subscription.builder()
                                .topicId("topic_id")
                                .build()
                        )
                        .addTag("string")
                        .build()
                )
                .providerKey("x")
                .state("state")
                .build()

        assertThat(journeyTemplateCreateRequest.channel()).isEqualTo("x")
        assertThat(journeyTemplateCreateRequest.notification())
            .isEqualTo(
                JourneyTemplateCreateRequest.Notification.builder()
                    .brand(
                        JourneyTemplateCreateRequest.Notification.Brand.builder().id("id").build()
                    )
                    .content(
                        JourneyTemplateCreateRequest.Notification.Content.builder()
                            .addElement(
                                ElementalTextNodeWithType.builder()
                                    .addChannel("string")
                                    .if_("if")
                                    .loop("loop")
                                    .ref("ref")
                                    .type(ElementalTextNodeWithType.Type.TEXT)
                                    .build()
                            )
                            .version(
                                JourneyTemplateCreateRequest.Notification.Content.Version
                                    ._2022_01_01
                            )
                            .scope(JourneyTemplateCreateRequest.Notification.Content.Scope.DEFAULT)
                            .build()
                    )
                    .name("name")
                    .subscription(
                        JourneyTemplateCreateRequest.Notification.Subscription.builder()
                            .topicId("topic_id")
                            .build()
                    )
                    .addTag("string")
                    .build()
            )
        assertThat(journeyTemplateCreateRequest.providerKey()).contains("x")
        assertThat(journeyTemplateCreateRequest.state()).contains("state")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyTemplateCreateRequest =
            JourneyTemplateCreateRequest.builder()
                .channel("x")
                .notification(
                    JourneyTemplateCreateRequest.Notification.builder()
                        .brand(
                            JourneyTemplateCreateRequest.Notification.Brand.builder()
                                .id("id")
                                .build()
                        )
                        .content(
                            JourneyTemplateCreateRequest.Notification.Content.builder()
                                .addElement(
                                    ElementalTextNodeWithType.builder()
                                        .addChannel("string")
                                        .if_("if")
                                        .loop("loop")
                                        .ref("ref")
                                        .type(ElementalTextNodeWithType.Type.TEXT)
                                        .build()
                                )
                                .version(
                                    JourneyTemplateCreateRequest.Notification.Content.Version
                                        ._2022_01_01
                                )
                                .scope(
                                    JourneyTemplateCreateRequest.Notification.Content.Scope.DEFAULT
                                )
                                .build()
                        )
                        .name("name")
                        .subscription(
                            JourneyTemplateCreateRequest.Notification.Subscription.builder()
                                .topicId("topic_id")
                                .build()
                        )
                        .addTag("string")
                        .build()
                )
                .providerKey("x")
                .state("state")
                .build()

        val roundtrippedJourneyTemplateCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyTemplateCreateRequest),
                jacksonTypeRef<JourneyTemplateCreateRequest>(),
            )

        assertThat(roundtrippedJourneyTemplateCreateRequest).isEqualTo(journeyTemplateCreateRequest)
    }
}

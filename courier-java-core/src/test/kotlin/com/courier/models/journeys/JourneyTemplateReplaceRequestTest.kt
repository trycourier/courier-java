// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.jsonMapper
import com.courier.models.ElementalTextNodeWithType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyTemplateReplaceRequestTest {

    @Test
    fun create() {
        val journeyTemplateReplaceRequest =
            JourneyTemplateReplaceRequest.builder()
                .notification(
                    JourneyTemplateReplaceRequest.Notification.builder()
                        .brand(
                            JourneyTemplateReplaceRequest.Notification.Brand.builder()
                                .id("id")
                                .build()
                        )
                        .content(
                            JourneyTemplateReplaceRequest.Notification.Content.builder()
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
                                    JourneyTemplateReplaceRequest.Notification.Content.Version
                                        ._2022_01_01
                                )
                                .scope(
                                    JourneyTemplateReplaceRequest.Notification.Content.Scope.DEFAULT
                                )
                                .build()
                        )
                        .name("name")
                        .subscription(
                            JourneyTemplateReplaceRequest.Notification.Subscription.builder()
                                .topicId("topic_id")
                                .build()
                        )
                        .addTag("string")
                        .build()
                )
                .state("state")
                .build()

        assertThat(journeyTemplateReplaceRequest.notification())
            .isEqualTo(
                JourneyTemplateReplaceRequest.Notification.builder()
                    .brand(
                        JourneyTemplateReplaceRequest.Notification.Brand.builder().id("id").build()
                    )
                    .content(
                        JourneyTemplateReplaceRequest.Notification.Content.builder()
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
                                JourneyTemplateReplaceRequest.Notification.Content.Version
                                    ._2022_01_01
                            )
                            .scope(JourneyTemplateReplaceRequest.Notification.Content.Scope.DEFAULT)
                            .build()
                    )
                    .name("name")
                    .subscription(
                        JourneyTemplateReplaceRequest.Notification.Subscription.builder()
                            .topicId("topic_id")
                            .build()
                    )
                    .addTag("string")
                    .build()
            )
        assertThat(journeyTemplateReplaceRequest.state()).contains("state")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val journeyTemplateReplaceRequest =
            JourneyTemplateReplaceRequest.builder()
                .notification(
                    JourneyTemplateReplaceRequest.Notification.builder()
                        .brand(
                            JourneyTemplateReplaceRequest.Notification.Brand.builder()
                                .id("id")
                                .build()
                        )
                        .content(
                            JourneyTemplateReplaceRequest.Notification.Content.builder()
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
                                    JourneyTemplateReplaceRequest.Notification.Content.Version
                                        ._2022_01_01
                                )
                                .scope(
                                    JourneyTemplateReplaceRequest.Notification.Content.Scope.DEFAULT
                                )
                                .build()
                        )
                        .name("name")
                        .subscription(
                            JourneyTemplateReplaceRequest.Notification.Subscription.builder()
                                .topicId("topic_id")
                                .build()
                        )
                        .addTag("string")
                        .build()
                )
                .state("state")
                .build()

        val roundtrippedJourneyTemplateReplaceRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(journeyTemplateReplaceRequest),
                jacksonTypeRef<JourneyTemplateReplaceRequest>(),
            )

        assertThat(roundtrippedJourneyTemplateReplaceRequest)
            .isEqualTo(journeyTemplateReplaceRequest)
    }
}

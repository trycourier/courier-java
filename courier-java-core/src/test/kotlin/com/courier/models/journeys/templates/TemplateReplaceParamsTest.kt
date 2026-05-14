// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys.templates

import com.courier.models.ElementalTextNodeWithType
import com.courier.models.journeys.JourneyTemplateReplaceRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateReplaceParamsTest {

    @Test
    fun create() {
        TemplateReplaceParams.builder()
            .templateId("x")
            .notificationId("x")
            .journeyTemplateReplaceRequest(
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
                                        JourneyTemplateReplaceRequest.Notification.Content.Scope
                                            .DEFAULT
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TemplateReplaceParams.builder()
                .templateId("x")
                .notificationId("x")
                .journeyTemplateReplaceRequest(
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
                                        .addElement(ElementalTextNodeWithType.builder().build())
                                        .version(
                                            JourneyTemplateReplaceRequest.Notification.Content
                                                .Version
                                                ._2022_01_01
                                        )
                                        .build()
                                )
                                .name("name")
                                .subscription(
                                    JourneyTemplateReplaceRequest.Notification.Subscription
                                        .builder()
                                        .topicId("topic_id")
                                        .build()
                                )
                                .addTag("string")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        assertThat(params._pathParam(1)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TemplateReplaceParams.builder()
                .templateId("x")
                .notificationId("x")
                .journeyTemplateReplaceRequest(
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
                                            JourneyTemplateReplaceRequest.Notification.Content
                                                .Version
                                                ._2022_01_01
                                        )
                                        .scope(
                                            JourneyTemplateReplaceRequest.Notification.Content.Scope
                                                .DEFAULT
                                        )
                                        .build()
                                )
                                .name("name")
                                .subscription(
                                    JourneyTemplateReplaceRequest.Notification.Subscription
                                        .builder()
                                        .topicId("topic_id")
                                        .build()
                                )
                                .addTag("string")
                                .build()
                        )
                        .state("state")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                                        JourneyTemplateReplaceRequest.Notification.Content.Scope
                                            .DEFAULT
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TemplateReplaceParams.builder()
                .templateId("x")
                .notificationId("x")
                .journeyTemplateReplaceRequest(
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
                                        .addElement(ElementalTextNodeWithType.builder().build())
                                        .version(
                                            JourneyTemplateReplaceRequest.Notification.Content
                                                .Version
                                                ._2022_01_01
                                        )
                                        .build()
                                )
                                .name("name")
                                .subscription(
                                    JourneyTemplateReplaceRequest.Notification.Subscription
                                        .builder()
                                        .topicId("topic_id")
                                        .build()
                                )
                                .addTag("string")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                                    .addElement(ElementalTextNodeWithType.builder().build())
                                    .version(
                                        JourneyTemplateReplaceRequest.Notification.Content.Version
                                            ._2022_01_01
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
                    .build()
            )
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.models.ElementalChannelNodeWithType
import com.courier.models.ElementalContent
import com.courier.models.ElementalTextNodeWithType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationReplaceParamsTest {

    @Test
    fun create() {
        NotificationReplaceParams.builder()
            .id("id")
            .notificationTemplateUpdateRequest(
                NotificationTemplateUpdateRequest.builder()
                    .notification(
                        NotificationTemplatePayload.builder()
                            .brand(NotificationTemplatePayload.Brand.builder().id("id").build())
                            .content(
                                ElementalContent.builder()
                                    .addElement(
                                        ElementalChannelNodeWithType.builder()
                                            .type(ElementalChannelNodeWithType.Type.CHANNEL)
                                            .build()
                                    )
                                    .version("2022-01-01")
                                    .build()
                            )
                            .name("Updated Name")
                            .routing(
                                NotificationTemplatePayload.Routing.builder()
                                    .strategyId("strategy_id")
                                    .build()
                            )
                            .subscription(
                                NotificationTemplatePayload.Subscription.builder()
                                    .topicId("topic_id")
                                    .build()
                            )
                            .addTag("updated")
                            .build()
                    )
                    .state(NotificationTemplateUpdateRequest.State.PUBLISHED)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NotificationReplaceParams.builder()
                .id("id")
                .notificationTemplateUpdateRequest(
                    NotificationTemplateUpdateRequest.builder()
                        .notification(
                            NotificationTemplatePayload.builder()
                                .brand(NotificationTemplatePayload.Brand.builder().id("id").build())
                                .content(
                                    ElementalContent.builder()
                                        .addElement(ElementalTextNodeWithType.builder().build())
                                        .version("2022-01-01")
                                        .build()
                                )
                                .name("Updated Name")
                                .routing(
                                    NotificationTemplatePayload.Routing.builder()
                                        .strategyId("strategy_id")
                                        .build()
                                )
                                .subscription(
                                    NotificationTemplatePayload.Subscription.builder()
                                        .topicId("topic_id")
                                        .build()
                                )
                                .addTag("updated")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            NotificationReplaceParams.builder()
                .id("id")
                .notificationTemplateUpdateRequest(
                    NotificationTemplateUpdateRequest.builder()
                        .notification(
                            NotificationTemplatePayload.builder()
                                .brand(NotificationTemplatePayload.Brand.builder().id("id").build())
                                .content(
                                    ElementalContent.builder()
                                        .addElement(
                                            ElementalChannelNodeWithType.builder()
                                                .type(ElementalChannelNodeWithType.Type.CHANNEL)
                                                .build()
                                        )
                                        .version("2022-01-01")
                                        .build()
                                )
                                .name("Updated Name")
                                .routing(
                                    NotificationTemplatePayload.Routing.builder()
                                        .strategyId("strategy_id")
                                        .build()
                                )
                                .subscription(
                                    NotificationTemplatePayload.Subscription.builder()
                                        .topicId("topic_id")
                                        .build()
                                )
                                .addTag("updated")
                                .build()
                        )
                        .state(NotificationTemplateUpdateRequest.State.PUBLISHED)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                NotificationTemplateUpdateRequest.builder()
                    .notification(
                        NotificationTemplatePayload.builder()
                            .brand(NotificationTemplatePayload.Brand.builder().id("id").build())
                            .content(
                                ElementalContent.builder()
                                    .addElement(
                                        ElementalChannelNodeWithType.builder()
                                            .type(ElementalChannelNodeWithType.Type.CHANNEL)
                                            .build()
                                    )
                                    .version("2022-01-01")
                                    .build()
                            )
                            .name("Updated Name")
                            .routing(
                                NotificationTemplatePayload.Routing.builder()
                                    .strategyId("strategy_id")
                                    .build()
                            )
                            .subscription(
                                NotificationTemplatePayload.Subscription.builder()
                                    .topicId("topic_id")
                                    .build()
                            )
                            .addTag("updated")
                            .build()
                    )
                    .state(NotificationTemplateUpdateRequest.State.PUBLISHED)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NotificationReplaceParams.builder()
                .id("id")
                .notificationTemplateUpdateRequest(
                    NotificationTemplateUpdateRequest.builder()
                        .notification(
                            NotificationTemplatePayload.builder()
                                .brand(NotificationTemplatePayload.Brand.builder().id("id").build())
                                .content(
                                    ElementalContent.builder()
                                        .addElement(ElementalTextNodeWithType.builder().build())
                                        .version("2022-01-01")
                                        .build()
                                )
                                .name("Updated Name")
                                .routing(
                                    NotificationTemplatePayload.Routing.builder()
                                        .strategyId("strategy_id")
                                        .build()
                                )
                                .subscription(
                                    NotificationTemplatePayload.Subscription.builder()
                                        .topicId("topic_id")
                                        .build()
                                )
                                .addTag("updated")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                NotificationTemplateUpdateRequest.builder()
                    .notification(
                        NotificationTemplatePayload.builder()
                            .brand(NotificationTemplatePayload.Brand.builder().id("id").build())
                            .content(
                                ElementalContent.builder()
                                    .addElement(ElementalTextNodeWithType.builder().build())
                                    .version("2022-01-01")
                                    .build()
                            )
                            .name("Updated Name")
                            .routing(
                                NotificationTemplatePayload.Routing.builder()
                                    .strategyId("strategy_id")
                                    .build()
                            )
                            .subscription(
                                NotificationTemplatePayload.Subscription.builder()
                                    .topicId("topic_id")
                                    .build()
                            )
                            .addTag("updated")
                            .build()
                    )
                    .build()
            )
    }
}

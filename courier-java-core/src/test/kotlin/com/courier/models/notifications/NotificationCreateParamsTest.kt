// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.models.ElementalChannelNodeWithType
import com.courier.models.ElementalContent
import com.courier.models.ElementalTextNodeWithType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationCreateParamsTest {

    @Test
    fun create() {
        NotificationCreateParams.builder()
            .notificationTemplateCreateRequest(
                NotificationTemplateCreateRequest.builder()
                    .notification(
                        NotificationTemplatePayload.builder()
                            .brand(
                                NotificationTemplatePayload.Brand.builder().id("brand_abc").build()
                            )
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
                            .name("Welcome Email")
                            .routing(
                                NotificationTemplatePayload.Routing.builder()
                                    .strategyId("rs_123")
                                    .build()
                            )
                            .subscription(
                                NotificationTemplatePayload.Subscription.builder()
                                    .topicId("marketing")
                                    .build()
                            )
                            .addTag("onboarding")
                            .addTag("welcome")
                            .build()
                    )
                    .state(NotificationTemplateCreateRequest.State.DRAFT)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            NotificationCreateParams.builder()
                .notificationTemplateCreateRequest(
                    NotificationTemplateCreateRequest.builder()
                        .notification(
                            NotificationTemplatePayload.builder()
                                .brand(
                                    NotificationTemplatePayload.Brand.builder()
                                        .id("brand_abc")
                                        .build()
                                )
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
                                .name("Welcome Email")
                                .routing(
                                    NotificationTemplatePayload.Routing.builder()
                                        .strategyId("rs_123")
                                        .build()
                                )
                                .subscription(
                                    NotificationTemplatePayload.Subscription.builder()
                                        .topicId("marketing")
                                        .build()
                                )
                                .addTag("onboarding")
                                .addTag("welcome")
                                .build()
                        )
                        .state(NotificationTemplateCreateRequest.State.DRAFT)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                NotificationTemplateCreateRequest.builder()
                    .notification(
                        NotificationTemplatePayload.builder()
                            .brand(
                                NotificationTemplatePayload.Brand.builder().id("brand_abc").build()
                            )
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
                            .name("Welcome Email")
                            .routing(
                                NotificationTemplatePayload.Routing.builder()
                                    .strategyId("rs_123")
                                    .build()
                            )
                            .subscription(
                                NotificationTemplatePayload.Subscription.builder()
                                    .topicId("marketing")
                                    .build()
                            )
                            .addTag("onboarding")
                            .addTag("welcome")
                            .build()
                    )
                    .state(NotificationTemplateCreateRequest.State.DRAFT)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NotificationCreateParams.builder()
                .notificationTemplateCreateRequest(
                    NotificationTemplateCreateRequest.builder()
                        .notification(
                            NotificationTemplatePayload.builder()
                                .brand(
                                    NotificationTemplatePayload.Brand.builder()
                                        .id("brand_abc")
                                        .build()
                                )
                                .content(
                                    ElementalContent.builder()
                                        .addElement(ElementalTextNodeWithType.builder().build())
                                        .version("2022-01-01")
                                        .build()
                                )
                                .name("Welcome Email")
                                .routing(
                                    NotificationTemplatePayload.Routing.builder()
                                        .strategyId("rs_123")
                                        .build()
                                )
                                .subscription(
                                    NotificationTemplatePayload.Subscription.builder()
                                        .topicId("marketing")
                                        .build()
                                )
                                .addTag("onboarding")
                                .addTag("welcome")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                NotificationTemplateCreateRequest.builder()
                    .notification(
                        NotificationTemplatePayload.builder()
                            .brand(
                                NotificationTemplatePayload.Brand.builder().id("brand_abc").build()
                            )
                            .content(
                                ElementalContent.builder()
                                    .addElement(ElementalTextNodeWithType.builder().build())
                                    .version("2022-01-01")
                                    .build()
                            )
                            .name("Welcome Email")
                            .routing(
                                NotificationTemplatePayload.Routing.builder()
                                    .strategyId("rs_123")
                                    .build()
                            )
                            .subscription(
                                NotificationTemplatePayload.Subscription.builder()
                                    .topicId("marketing")
                                    .build()
                            )
                            .addTag("onboarding")
                            .addTag("welcome")
                            .build()
                    )
                    .build()
            )
    }
}

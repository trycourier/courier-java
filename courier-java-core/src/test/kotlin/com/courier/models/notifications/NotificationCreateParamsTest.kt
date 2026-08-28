// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.http.Headers
import com.courier.models.ElementalChannelNodeWithType
import com.courier.models.ElementalContent
import com.courier.models.ElementalMetaNodeWithType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationCreateParamsTest {

    @Test
    fun create() {
        NotificationCreateParams.builder()
            .idempotencyKey("order-ORD-456-user-123")
            .xIdempotencyExpiration("1785312000")
            .notificationTemplateCreateRequest(
                NotificationTemplateCreateRequest.builder()
                    .notification(
                        NotificationTemplateWritePayload.builder()
                            .brand(
                                NotificationTemplatePayload.Brand.builder()
                                    .id("bnd_01kx4mrd0pfzw8wt7pn7p2fzag")
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
                                    .strategyId("rs_01kx4h2jdafq8bk9amzvy6hbv0")
                                    .build()
                            )
                            .subscription(
                                NotificationTemplatePayload.Subscription.builder()
                                    .topicId("pt_01kx4h2jdafq8bk9a26x0kvd1t")
                                    .build()
                            )
                            .addTag("onboarding")
                            .addTag("welcome")
                            .alias("welcome")
                            .build()
                    )
                    .state(NotificationTemplateCreateRequest.State.DRAFT)
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            NotificationCreateParams.builder()
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .notificationTemplateCreateRequest(
                    NotificationTemplateCreateRequest.builder()
                        .notification(
                            NotificationTemplateWritePayload.builder()
                                .brand(
                                    NotificationTemplatePayload.Brand.builder()
                                        .id("bnd_01kx4mrd0pfzw8wt7pn7p2fzag")
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
                                        .strategyId("rs_01kx4h2jdafq8bk9amzvy6hbv0")
                                        .build()
                                )
                                .subscription(
                                    NotificationTemplatePayload.Subscription.builder()
                                        .topicId("pt_01kx4h2jdafq8bk9a26x0kvd1t")
                                        .build()
                                )
                                .addTag("onboarding")
                                .addTag("welcome")
                                .alias("welcome")
                                .build()
                        )
                        .state(NotificationTemplateCreateRequest.State.DRAFT)
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
            NotificationCreateParams.builder()
                .notificationTemplateCreateRequest(
                    NotificationTemplateCreateRequest.builder()
                        .notification(
                            NotificationTemplateWritePayload.builder()
                                .brand(
                                    NotificationTemplatePayload.Brand.builder()
                                        .id("bnd_01kx4mrd0pfzw8wt7pn7p2fzag")
                                        .build()
                                )
                                .content(
                                    ElementalContent.builder()
                                        .addElement(ElementalMetaNodeWithType.builder().build())
                                        .version("2022-01-01")
                                        .build()
                                )
                                .name("Welcome Email")
                                .routing(
                                    NotificationTemplatePayload.Routing.builder()
                                        .strategyId("rs_01kx4h2jdafq8bk9amzvy6hbv0")
                                        .build()
                                )
                                .subscription(
                                    NotificationTemplatePayload.Subscription.builder()
                                        .topicId("pt_01kx4h2jdafq8bk9a26x0kvd1t")
                                        .build()
                                )
                                .addTag("onboarding")
                                .addTag("welcome")
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
            NotificationCreateParams.builder()
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .notificationTemplateCreateRequest(
                    NotificationTemplateCreateRequest.builder()
                        .notification(
                            NotificationTemplateWritePayload.builder()
                                .brand(
                                    NotificationTemplatePayload.Brand.builder()
                                        .id("bnd_01kx4mrd0pfzw8wt7pn7p2fzag")
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
                                        .strategyId("rs_01kx4h2jdafq8bk9amzvy6hbv0")
                                        .build()
                                )
                                .subscription(
                                    NotificationTemplatePayload.Subscription.builder()
                                        .topicId("pt_01kx4h2jdafq8bk9a26x0kvd1t")
                                        .build()
                                )
                                .addTag("onboarding")
                                .addTag("welcome")
                                .alias("welcome")
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
                        NotificationTemplateWritePayload.builder()
                            .brand(
                                NotificationTemplatePayload.Brand.builder()
                                    .id("bnd_01kx4mrd0pfzw8wt7pn7p2fzag")
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
                                    .strategyId("rs_01kx4h2jdafq8bk9amzvy6hbv0")
                                    .build()
                            )
                            .subscription(
                                NotificationTemplatePayload.Subscription.builder()
                                    .topicId("pt_01kx4h2jdafq8bk9a26x0kvd1t")
                                    .build()
                            )
                            .addTag("onboarding")
                            .addTag("welcome")
                            .alias("welcome")
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
                            NotificationTemplateWritePayload.builder()
                                .brand(
                                    NotificationTemplatePayload.Brand.builder()
                                        .id("bnd_01kx4mrd0pfzw8wt7pn7p2fzag")
                                        .build()
                                )
                                .content(
                                    ElementalContent.builder()
                                        .addElement(ElementalMetaNodeWithType.builder().build())
                                        .version("2022-01-01")
                                        .build()
                                )
                                .name("Welcome Email")
                                .routing(
                                    NotificationTemplatePayload.Routing.builder()
                                        .strategyId("rs_01kx4h2jdafq8bk9amzvy6hbv0")
                                        .build()
                                )
                                .subscription(
                                    NotificationTemplatePayload.Subscription.builder()
                                        .topicId("pt_01kx4h2jdafq8bk9a26x0kvd1t")
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
                        NotificationTemplateWritePayload.builder()
                            .brand(
                                NotificationTemplatePayload.Brand.builder()
                                    .id("bnd_01kx4mrd0pfzw8wt7pn7p2fzag")
                                    .build()
                            )
                            .content(
                                ElementalContent.builder()
                                    .addElement(ElementalMetaNodeWithType.builder().build())
                                    .version("2022-01-01")
                                    .build()
                            )
                            .name("Welcome Email")
                            .routing(
                                NotificationTemplatePayload.Routing.builder()
                                    .strategyId("rs_01kx4h2jdafq8bk9amzvy6hbv0")
                                    .build()
                            )
                            .subscription(
                                NotificationTemplatePayload.Subscription.builder()
                                    .topicId("pt_01kx4h2jdafq8bk9a26x0kvd1t")
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

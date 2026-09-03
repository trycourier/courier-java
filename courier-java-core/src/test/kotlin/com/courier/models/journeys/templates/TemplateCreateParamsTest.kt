// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys.templates

import com.courier.core.http.Headers
import com.courier.models.ElementalChannelNodeWithType
import com.courier.models.ElementalTextNodeWithType
import com.courier.models.journeys.JourneyTemplateCreateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateCreateParamsTest {

    @Test
    fun create() {
        TemplateCreateParams.builder()
            .templateId("x")
            .idempotencyKey("order-ORD-456-user-123")
            .xIdempotencyExpiration("1785312000")
            .journeyTemplateCreateRequest(
                JourneyTemplateCreateRequest.builder()
                    .channel("email")
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
                                        ElementalChannelNodeWithType.builder()
                                            .type(ElementalChannelNodeWithType.Type.CHANNEL)
                                            .build()
                                    )
                                    .version(
                                        JourneyTemplateCreateRequest.Notification.Content.Version
                                            ._2022_01_01
                                    )
                                    .scope(
                                        JourneyTemplateCreateRequest.Notification.Content.Scope
                                            .DEFAULT
                                    )
                                    .build()
                            )
                            .name("Welcome email")
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TemplateCreateParams.builder()
                .templateId("x")
                .journeyTemplateCreateRequest(
                    JourneyTemplateCreateRequest.builder()
                        .channel("email")
                        .notification(
                            JourneyTemplateCreateRequest.Notification.builder()
                                .brand(
                                    JourneyTemplateCreateRequest.Notification.Brand.builder()
                                        .id("id")
                                        .build()
                                )
                                .content(
                                    JourneyTemplateCreateRequest.Notification.Content.builder()
                                        .addElement(ElementalTextNodeWithType.builder().build())
                                        .version(
                                            JourneyTemplateCreateRequest.Notification.Content
                                                .Version
                                                ._2022_01_01
                                        )
                                        .build()
                                )
                                .name("Welcome email")
                                .subscription(
                                    JourneyTemplateCreateRequest.Notification.Subscription.builder()
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
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            TemplateCreateParams.builder()
                .templateId("x")
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .journeyTemplateCreateRequest(
                    JourneyTemplateCreateRequest.builder()
                        .channel("email")
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
                                            ElementalChannelNodeWithType.builder()
                                                .type(ElementalChannelNodeWithType.Type.CHANNEL)
                                                .build()
                                        )
                                        .version(
                                            JourneyTemplateCreateRequest.Notification.Content
                                                .Version
                                                ._2022_01_01
                                        )
                                        .scope(
                                            JourneyTemplateCreateRequest.Notification.Content.Scope
                                                .DEFAULT
                                        )
                                        .build()
                                )
                                .name("Welcome email")
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
            TemplateCreateParams.builder()
                .templateId("x")
                .journeyTemplateCreateRequest(
                    JourneyTemplateCreateRequest.builder()
                        .channel("email")
                        .notification(
                            JourneyTemplateCreateRequest.Notification.builder()
                                .brand(
                                    JourneyTemplateCreateRequest.Notification.Brand.builder()
                                        .id("id")
                                        .build()
                                )
                                .content(
                                    JourneyTemplateCreateRequest.Notification.Content.builder()
                                        .addElement(ElementalTextNodeWithType.builder().build())
                                        .version(
                                            JourneyTemplateCreateRequest.Notification.Content
                                                .Version
                                                ._2022_01_01
                                        )
                                        .build()
                                )
                                .name("Welcome email")
                                .subscription(
                                    JourneyTemplateCreateRequest.Notification.Subscription.builder()
                                        .topicId("topic_id")
                                        .build()
                                )
                                .addTag("string")
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
            TemplateCreateParams.builder()
                .templateId("x")
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .journeyTemplateCreateRequest(
                    JourneyTemplateCreateRequest.builder()
                        .channel("email")
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
                                            ElementalChannelNodeWithType.builder()
                                                .type(ElementalChannelNodeWithType.Type.CHANNEL)
                                                .build()
                                        )
                                        .version(
                                            JourneyTemplateCreateRequest.Notification.Content
                                                .Version
                                                ._2022_01_01
                                        )
                                        .scope(
                                            JourneyTemplateCreateRequest.Notification.Content.Scope
                                                .DEFAULT
                                        )
                                        .build()
                                )
                                .name("Welcome email")
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                JourneyTemplateCreateRequest.builder()
                    .channel("email")
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
                                        ElementalChannelNodeWithType.builder()
                                            .type(ElementalChannelNodeWithType.Type.CHANNEL)
                                            .build()
                                    )
                                    .version(
                                        JourneyTemplateCreateRequest.Notification.Content.Version
                                            ._2022_01_01
                                    )
                                    .scope(
                                        JourneyTemplateCreateRequest.Notification.Content.Scope
                                            .DEFAULT
                                    )
                                    .build()
                            )
                            .name("Welcome email")
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TemplateCreateParams.builder()
                .templateId("x")
                .journeyTemplateCreateRequest(
                    JourneyTemplateCreateRequest.builder()
                        .channel("email")
                        .notification(
                            JourneyTemplateCreateRequest.Notification.builder()
                                .brand(
                                    JourneyTemplateCreateRequest.Notification.Brand.builder()
                                        .id("id")
                                        .build()
                                )
                                .content(
                                    JourneyTemplateCreateRequest.Notification.Content.builder()
                                        .addElement(ElementalTextNodeWithType.builder().build())
                                        .version(
                                            JourneyTemplateCreateRequest.Notification.Content
                                                .Version
                                                ._2022_01_01
                                        )
                                        .build()
                                )
                                .name("Welcome email")
                                .subscription(
                                    JourneyTemplateCreateRequest.Notification.Subscription.builder()
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
                JourneyTemplateCreateRequest.builder()
                    .channel("email")
                    .notification(
                        JourneyTemplateCreateRequest.Notification.builder()
                            .brand(
                                JourneyTemplateCreateRequest.Notification.Brand.builder()
                                    .id("id")
                                    .build()
                            )
                            .content(
                                JourneyTemplateCreateRequest.Notification.Content.builder()
                                    .addElement(ElementalTextNodeWithType.builder().build())
                                    .version(
                                        JourneyTemplateCreateRequest.Notification.Content.Version
                                            ._2022_01_01
                                    )
                                    .build()
                            )
                            .name("Welcome email")
                            .subscription(
                                JourneyTemplateCreateRequest.Notification.Subscription.builder()
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

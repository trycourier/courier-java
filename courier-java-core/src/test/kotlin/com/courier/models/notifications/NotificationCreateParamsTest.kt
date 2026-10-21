// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.JsonValue
import com.courier.core.http.Headers
import com.courier.models.ElementalChannelNode
import com.courier.models.ElementalChannelNodeWithType
import com.courier.models.ElementalContent
import com.courier.models.ElementalNodeNonChannel
import com.courier.models.ElementalTextNode
import com.courier.models.ElementalTextNodeWithType
import com.courier.models.Locales
import com.courier.models.TextStyle
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
                                            .addChannel("string")
                                            .if_("if")
                                            .loop("loop")
                                            .ref("ref")
                                            .channel("email")
                                            .addElement(
                                                ElementalNodeNonChannel.UnionMember1.builder()
                                                    .addChannel("string")
                                                    .if_("if")
                                                    .loop("loop")
                                                    .ref("ref")
                                                    .title("Welcome!")
                                                    .type(
                                                        ElementalNodeNonChannel.UnionMember1.Type
                                                            .META
                                                    )
                                                    .build()
                                            )
                                            .addElement(
                                                ElementalNodeNonChannel.UnionMember0.builder()
                                                    .addChannel("string")
                                                    .if_("if")
                                                    .loop("loop")
                                                    .ref("ref")
                                                    .align(ElementalTextNode.Align.LEFT)
                                                    .bold("bold")
                                                    .color("color")
                                                    .content("Hello {{data.name}}.")
                                                    .fontSize("font_size")
                                                    .format(ElementalTextNode.Format.MARKDOWN)
                                                    .italic("italic")
                                                    .lineHeight("line_height")
                                                    .locales(
                                                        Locales.builder()
                                                            .putAdditionalProperty(
                                                                "foo",
                                                                JsonValue.from(
                                                                    mapOf("content" to "content")
                                                                ),
                                                            )
                                                            .build()
                                                    )
                                                    .strikethrough("strikethrough")
                                                    .textStyle(TextStyle.TEXT)
                                                    .underline("underline")
                                                    .type(
                                                        ElementalNodeNonChannel.UnionMember0.Type
                                                            .TEXT
                                                    )
                                                    .build()
                                            )
                                            .fontSize("font_size")
                                            .lineHeight("line_height")
                                            .padding("padding")
                                            .raw(
                                                ElementalChannelNode.Raw.builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .build()
                                            )
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
                            .email(
                                NotificationTemplateEmail.builder()
                                    .addBcc("string")
                                    .addCc("string")
                                    .from("from")
                                    .replyTo("reply_to")
                                    .build()
                            )
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
                                                .addChannel("string")
                                                .if_("if")
                                                .loop("loop")
                                                .ref("ref")
                                                .channel("email")
                                                .addElement(
                                                    ElementalNodeNonChannel.UnionMember1.builder()
                                                        .addChannel("string")
                                                        .if_("if")
                                                        .loop("loop")
                                                        .ref("ref")
                                                        .title("Welcome!")
                                                        .type(
                                                            ElementalNodeNonChannel.UnionMember1
                                                                .Type
                                                                .META
                                                        )
                                                        .build()
                                                )
                                                .addElement(
                                                    ElementalNodeNonChannel.UnionMember0.builder()
                                                        .addChannel("string")
                                                        .if_("if")
                                                        .loop("loop")
                                                        .ref("ref")
                                                        .align(ElementalTextNode.Align.LEFT)
                                                        .bold("bold")
                                                        .color("color")
                                                        .content("Hello {{data.name}}.")
                                                        .fontSize("font_size")
                                                        .format(ElementalTextNode.Format.MARKDOWN)
                                                        .italic("italic")
                                                        .lineHeight("line_height")
                                                        .locales(
                                                            Locales.builder()
                                                                .putAdditionalProperty(
                                                                    "foo",
                                                                    JsonValue.from(
                                                                        mapOf(
                                                                            "content" to "content"
                                                                        )
                                                                    ),
                                                                )
                                                                .build()
                                                        )
                                                        .strikethrough("strikethrough")
                                                        .textStyle(TextStyle.TEXT)
                                                        .underline("underline")
                                                        .type(
                                                            ElementalNodeNonChannel.UnionMember0
                                                                .Type
                                                                .TEXT
                                                        )
                                                        .build()
                                                )
                                                .fontSize("font_size")
                                                .lineHeight("line_height")
                                                .padding("padding")
                                                .raw(
                                                    ElementalChannelNode.Raw.builder()
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from("bar"),
                                                        )
                                                        .build()
                                                )
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
                                .email(
                                    NotificationTemplateEmail.builder()
                                        .addBcc("string")
                                        .addCc("string")
                                        .from("from")
                                        .replyTo("reply_to")
                                        .build()
                                )
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
                                        .addElement(ElementalTextNodeWithType.builder().build())
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
                                                .addChannel("string")
                                                .if_("if")
                                                .loop("loop")
                                                .ref("ref")
                                                .channel("email")
                                                .addElement(
                                                    ElementalNodeNonChannel.UnionMember1.builder()
                                                        .addChannel("string")
                                                        .if_("if")
                                                        .loop("loop")
                                                        .ref("ref")
                                                        .title("Welcome!")
                                                        .type(
                                                            ElementalNodeNonChannel.UnionMember1
                                                                .Type
                                                                .META
                                                        )
                                                        .build()
                                                )
                                                .addElement(
                                                    ElementalNodeNonChannel.UnionMember0.builder()
                                                        .addChannel("string")
                                                        .if_("if")
                                                        .loop("loop")
                                                        .ref("ref")
                                                        .align(ElementalTextNode.Align.LEFT)
                                                        .bold("bold")
                                                        .color("color")
                                                        .content("Hello {{data.name}}.")
                                                        .fontSize("font_size")
                                                        .format(ElementalTextNode.Format.MARKDOWN)
                                                        .italic("italic")
                                                        .lineHeight("line_height")
                                                        .locales(
                                                            Locales.builder()
                                                                .putAdditionalProperty(
                                                                    "foo",
                                                                    JsonValue.from(
                                                                        mapOf(
                                                                            "content" to "content"
                                                                        )
                                                                    ),
                                                                )
                                                                .build()
                                                        )
                                                        .strikethrough("strikethrough")
                                                        .textStyle(TextStyle.TEXT)
                                                        .underline("underline")
                                                        .type(
                                                            ElementalNodeNonChannel.UnionMember0
                                                                .Type
                                                                .TEXT
                                                        )
                                                        .build()
                                                )
                                                .fontSize("font_size")
                                                .lineHeight("line_height")
                                                .padding("padding")
                                                .raw(
                                                    ElementalChannelNode.Raw.builder()
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from("bar"),
                                                        )
                                                        .build()
                                                )
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
                                .email(
                                    NotificationTemplateEmail.builder()
                                        .addBcc("string")
                                        .addCc("string")
                                        .from("from")
                                        .replyTo("reply_to")
                                        .build()
                                )
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
                                            .addChannel("string")
                                            .if_("if")
                                            .loop("loop")
                                            .ref("ref")
                                            .channel("email")
                                            .addElement(
                                                ElementalNodeNonChannel.UnionMember1.builder()
                                                    .addChannel("string")
                                                    .if_("if")
                                                    .loop("loop")
                                                    .ref("ref")
                                                    .title("Welcome!")
                                                    .type(
                                                        ElementalNodeNonChannel.UnionMember1.Type
                                                            .META
                                                    )
                                                    .build()
                                            )
                                            .addElement(
                                                ElementalNodeNonChannel.UnionMember0.builder()
                                                    .addChannel("string")
                                                    .if_("if")
                                                    .loop("loop")
                                                    .ref("ref")
                                                    .align(ElementalTextNode.Align.LEFT)
                                                    .bold("bold")
                                                    .color("color")
                                                    .content("Hello {{data.name}}.")
                                                    .fontSize("font_size")
                                                    .format(ElementalTextNode.Format.MARKDOWN)
                                                    .italic("italic")
                                                    .lineHeight("line_height")
                                                    .locales(
                                                        Locales.builder()
                                                            .putAdditionalProperty(
                                                                "foo",
                                                                JsonValue.from(
                                                                    mapOf("content" to "content")
                                                                ),
                                                            )
                                                            .build()
                                                    )
                                                    .strikethrough("strikethrough")
                                                    .textStyle(TextStyle.TEXT)
                                                    .underline("underline")
                                                    .type(
                                                        ElementalNodeNonChannel.UnionMember0.Type
                                                            .TEXT
                                                    )
                                                    .build()
                                            )
                                            .fontSize("font_size")
                                            .lineHeight("line_height")
                                            .padding("padding")
                                            .raw(
                                                ElementalChannelNode.Raw.builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .build()
                                            )
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
                            .email(
                                NotificationTemplateEmail.builder()
                                    .addBcc("string")
                                    .addCc("string")
                                    .from("from")
                                    .replyTo("reply_to")
                                    .build()
                            )
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
                                        .addElement(ElementalTextNodeWithType.builder().build())
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
                                    .addElement(ElementalTextNodeWithType.builder().build())
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

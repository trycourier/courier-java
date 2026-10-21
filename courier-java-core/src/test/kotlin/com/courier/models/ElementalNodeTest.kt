// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ElementalNodeTest {

    @Test
    fun ofTextNodeWithType() {
        val textNodeWithType =
            ElementalTextNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .align(ElementalTextNode.Align.LEFT)
                .bold("bold")
                .color("color")
                .content("content")
                .fontSize("font_size")
                .format(ElementalTextNode.Format.MARKDOWN)
                .italic("italic")
                .lineHeight("line_height")
                .locales(
                    Locales.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                        .build()
                )
                .strikethrough("strikethrough")
                .textStyle(TextStyle.TEXT)
                .underline("underline")
                .type(ElementalTextNodeWithType.Type.TEXT)
                .build()

        val elementalNode = ElementalNode.ofTextNodeWithType(textNodeWithType)

        assertThat(elementalNode.textNodeWithType()).contains(textNodeWithType)
        assertThat(elementalNode.metaNodeWithType()).isEmpty
        assertThat(elementalNode.channelNodeWithType()).isEmpty
        assertThat(elementalNode.imageNodeWithType()).isEmpty
        assertThat(elementalNode.actionNodeWithType()).isEmpty
        assertThat(elementalNode.dividerNodeWithType()).isEmpty
        assertThat(elementalNode.quoteNodeWithType()).isEmpty
        assertThat(elementalNode.htmlNodeWithType()).isEmpty
    }

    @Test
    fun ofTextNodeWithTypeRoundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNode =
            ElementalNode.ofTextNodeWithType(
                ElementalTextNodeWithType.builder()
                    .addChannel("string")
                    .if_("if")
                    .loop("loop")
                    .ref("ref")
                    .align(ElementalTextNode.Align.LEFT)
                    .bold("bold")
                    .color("color")
                    .content("content")
                    .fontSize("font_size")
                    .format(ElementalTextNode.Format.MARKDOWN)
                    .italic("italic")
                    .lineHeight("line_height")
                    .locales(
                        Locales.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(mapOf("content" to "content")),
                            )
                            .build()
                    )
                    .strikethrough("strikethrough")
                    .textStyle(TextStyle.TEXT)
                    .underline("underline")
                    .type(ElementalTextNodeWithType.Type.TEXT)
                    .build()
            )

        val roundtrippedElementalNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNode),
                jacksonTypeRef<ElementalNode>(),
            )

        assertThat(roundtrippedElementalNode).isEqualTo(elementalNode)
    }

    @Test
    fun ofMetaNodeWithType() {
        val metaNodeWithType =
            ElementalMetaNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .title("title")
                .type(ElementalMetaNodeWithType.Type.META)
                .build()

        val elementalNode = ElementalNode.ofMetaNodeWithType(metaNodeWithType)

        assertThat(elementalNode.textNodeWithType()).isEmpty
        assertThat(elementalNode.metaNodeWithType()).contains(metaNodeWithType)
        assertThat(elementalNode.channelNodeWithType()).isEmpty
        assertThat(elementalNode.imageNodeWithType()).isEmpty
        assertThat(elementalNode.actionNodeWithType()).isEmpty
        assertThat(elementalNode.dividerNodeWithType()).isEmpty
        assertThat(elementalNode.quoteNodeWithType()).isEmpty
        assertThat(elementalNode.htmlNodeWithType()).isEmpty
    }

    @Test
    fun ofMetaNodeWithTypeRoundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNode =
            ElementalNode.ofMetaNodeWithType(
                ElementalMetaNodeWithType.builder()
                    .addChannel("string")
                    .if_("if")
                    .loop("loop")
                    .ref("ref")
                    .title("title")
                    .type(ElementalMetaNodeWithType.Type.META)
                    .build()
            )

        val roundtrippedElementalNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNode),
                jacksonTypeRef<ElementalNode>(),
            )

        assertThat(roundtrippedElementalNode).isEqualTo(elementalNode)
    }

    @Test
    fun ofChannelNodeWithType() {
        val channelNodeWithType =
            ElementalChannelNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .channel("email")
                .addElement(
                    ElementalNodeNonChannel.UnionMember0.builder()
                        .addChannel("string")
                        .if_("if")
                        .loop("loop")
                        .ref("ref")
                        .align(ElementalTextNode.Align.LEFT)
                        .bold("bold")
                        .color("color")
                        .content("content")
                        .fontSize("font_size")
                        .format(ElementalTextNode.Format.MARKDOWN)
                        .italic("italic")
                        .lineHeight("line_height")
                        .locales(
                            Locales.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(mapOf("content" to "content")),
                                )
                                .build()
                        )
                        .strikethrough("strikethrough")
                        .textStyle(TextStyle.TEXT)
                        .underline("underline")
                        .type(ElementalNodeNonChannel.UnionMember0.Type.TEXT)
                        .build()
                )
                .fontSize("font_size")
                .lineHeight("line_height")
                .padding("padding")
                .raw(
                    ElementalChannelNode.Raw.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .type(ElementalChannelNodeWithType.Type.CHANNEL)
                .build()

        val elementalNode = ElementalNode.ofChannelNodeWithType(channelNodeWithType)

        assertThat(elementalNode.textNodeWithType()).isEmpty
        assertThat(elementalNode.metaNodeWithType()).isEmpty
        assertThat(elementalNode.channelNodeWithType()).contains(channelNodeWithType)
        assertThat(elementalNode.imageNodeWithType()).isEmpty
        assertThat(elementalNode.actionNodeWithType()).isEmpty
        assertThat(elementalNode.dividerNodeWithType()).isEmpty
        assertThat(elementalNode.quoteNodeWithType()).isEmpty
        assertThat(elementalNode.htmlNodeWithType()).isEmpty
    }

    @Test
    fun ofChannelNodeWithTypeRoundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNode =
            ElementalNode.ofChannelNodeWithType(
                ElementalChannelNodeWithType.builder()
                    .addChannel("string")
                    .if_("if")
                    .loop("loop")
                    .ref("ref")
                    .channel("email")
                    .addElement(
                        ElementalNodeNonChannel.UnionMember0.builder()
                            .addChannel("string")
                            .if_("if")
                            .loop("loop")
                            .ref("ref")
                            .align(ElementalTextNode.Align.LEFT)
                            .bold("bold")
                            .color("color")
                            .content("content")
                            .fontSize("font_size")
                            .format(ElementalTextNode.Format.MARKDOWN)
                            .italic("italic")
                            .lineHeight("line_height")
                            .locales(
                                Locales.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("content" to "content")),
                                    )
                                    .build()
                            )
                            .strikethrough("strikethrough")
                            .textStyle(TextStyle.TEXT)
                            .underline("underline")
                            .type(ElementalNodeNonChannel.UnionMember0.Type.TEXT)
                            .build()
                    )
                    .fontSize("font_size")
                    .lineHeight("line_height")
                    .padding("padding")
                    .raw(
                        ElementalChannelNode.Raw.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .type(ElementalChannelNodeWithType.Type.CHANNEL)
                    .build()
            )

        val roundtrippedElementalNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNode),
                jacksonTypeRef<ElementalNode>(),
            )

        assertThat(roundtrippedElementalNode).isEqualTo(elementalNode)
    }

    @Test
    fun ofImageNodeWithType() {
        val imageNodeWithType =
            ElementalImageNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .src("src")
                .align(Alignment.CENTER)
                .altText("alt_text")
                .borderColor("border_color")
                .borderSize("border_size")
                .href("href")
                .padding("padding")
                .width("width")
                .type(ElementalImageNodeWithType.Type.IMAGE)
                .build()

        val elementalNode = ElementalNode.ofImageNodeWithType(imageNodeWithType)

        assertThat(elementalNode.textNodeWithType()).isEmpty
        assertThat(elementalNode.metaNodeWithType()).isEmpty
        assertThat(elementalNode.channelNodeWithType()).isEmpty
        assertThat(elementalNode.imageNodeWithType()).contains(imageNodeWithType)
        assertThat(elementalNode.actionNodeWithType()).isEmpty
        assertThat(elementalNode.dividerNodeWithType()).isEmpty
        assertThat(elementalNode.quoteNodeWithType()).isEmpty
        assertThat(elementalNode.htmlNodeWithType()).isEmpty
    }

    @Test
    fun ofImageNodeWithTypeRoundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNode =
            ElementalNode.ofImageNodeWithType(
                ElementalImageNodeWithType.builder()
                    .addChannel("string")
                    .if_("if")
                    .loop("loop")
                    .ref("ref")
                    .src("src")
                    .align(Alignment.CENTER)
                    .altText("alt_text")
                    .borderColor("border_color")
                    .borderSize("border_size")
                    .href("href")
                    .padding("padding")
                    .width("width")
                    .type(ElementalImageNodeWithType.Type.IMAGE)
                    .build()
            )

        val roundtrippedElementalNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNode),
                jacksonTypeRef<ElementalNode>(),
            )

        assertThat(roundtrippedElementalNode).isEqualTo(elementalNode)
    }

    @Test
    fun ofActionNodeWithType() {
        val actionNodeWithType =
            ElementalActionNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .content("content")
                .href("href")
                .actionId("action_id")
                .align(Alignment.CENTER)
                .backgroundColor("background_color")
                .borderRadius("border_radius")
                .borderSize("border_size")
                .disableTracking(true)
                .fontSize("font_size")
                .locales(
                    Locales.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                        .build()
                )
                .padding("padding")
                .style(ElementalActionNode.Style.BUTTON)
                .type(ElementalActionNodeWithType.Type.ACTION)
                .build()

        val elementalNode = ElementalNode.ofActionNodeWithType(actionNodeWithType)

        assertThat(elementalNode.textNodeWithType()).isEmpty
        assertThat(elementalNode.metaNodeWithType()).isEmpty
        assertThat(elementalNode.channelNodeWithType()).isEmpty
        assertThat(elementalNode.imageNodeWithType()).isEmpty
        assertThat(elementalNode.actionNodeWithType()).contains(actionNodeWithType)
        assertThat(elementalNode.dividerNodeWithType()).isEmpty
        assertThat(elementalNode.quoteNodeWithType()).isEmpty
        assertThat(elementalNode.htmlNodeWithType()).isEmpty
    }

    @Test
    fun ofActionNodeWithTypeRoundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNode =
            ElementalNode.ofActionNodeWithType(
                ElementalActionNodeWithType.builder()
                    .addChannel("string")
                    .if_("if")
                    .loop("loop")
                    .ref("ref")
                    .content("content")
                    .href("href")
                    .actionId("action_id")
                    .align(Alignment.CENTER)
                    .backgroundColor("background_color")
                    .borderRadius("border_radius")
                    .borderSize("border_size")
                    .disableTracking(true)
                    .fontSize("font_size")
                    .locales(
                        Locales.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(mapOf("content" to "content")),
                            )
                            .build()
                    )
                    .padding("padding")
                    .style(ElementalActionNode.Style.BUTTON)
                    .type(ElementalActionNodeWithType.Type.ACTION)
                    .build()
            )

        val roundtrippedElementalNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNode),
                jacksonTypeRef<ElementalNode>(),
            )

        assertThat(roundtrippedElementalNode).isEqualTo(elementalNode)
    }

    @Test
    fun ofDividerNodeWithType() {
        val dividerNodeWithType =
            ElementalDividerNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .color("color")
                .type(ElementalDividerNodeWithType.Type.DIVIDER)
                .build()

        val elementalNode = ElementalNode.ofDividerNodeWithType(dividerNodeWithType)

        assertThat(elementalNode.textNodeWithType()).isEmpty
        assertThat(elementalNode.metaNodeWithType()).isEmpty
        assertThat(elementalNode.channelNodeWithType()).isEmpty
        assertThat(elementalNode.imageNodeWithType()).isEmpty
        assertThat(elementalNode.actionNodeWithType()).isEmpty
        assertThat(elementalNode.dividerNodeWithType()).contains(dividerNodeWithType)
        assertThat(elementalNode.quoteNodeWithType()).isEmpty
        assertThat(elementalNode.htmlNodeWithType()).isEmpty
    }

    @Test
    fun ofDividerNodeWithTypeRoundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNode =
            ElementalNode.ofDividerNodeWithType(
                ElementalDividerNodeWithType.builder()
                    .addChannel("string")
                    .if_("if")
                    .loop("loop")
                    .ref("ref")
                    .color("color")
                    .type(ElementalDividerNodeWithType.Type.DIVIDER)
                    .build()
            )

        val roundtrippedElementalNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNode),
                jacksonTypeRef<ElementalNode>(),
            )

        assertThat(roundtrippedElementalNode).isEqualTo(elementalNode)
    }

    @Test
    fun ofQuoteNodeWithType() {
        val quoteNodeWithType =
            ElementalQuoteNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .content("content")
                .align(Alignment.CENTER)
                .borderColor("border_color")
                .fontSize("font_size")
                .lineHeight("line_height")
                .locales(
                    Locales.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                        .build()
                )
                .textStyle(TextStyle.TEXT)
                .type(ElementalQuoteNodeWithType.Type.QUOTE)
                .build()

        val elementalNode = ElementalNode.ofQuoteNodeWithType(quoteNodeWithType)

        assertThat(elementalNode.textNodeWithType()).isEmpty
        assertThat(elementalNode.metaNodeWithType()).isEmpty
        assertThat(elementalNode.channelNodeWithType()).isEmpty
        assertThat(elementalNode.imageNodeWithType()).isEmpty
        assertThat(elementalNode.actionNodeWithType()).isEmpty
        assertThat(elementalNode.dividerNodeWithType()).isEmpty
        assertThat(elementalNode.quoteNodeWithType()).contains(quoteNodeWithType)
        assertThat(elementalNode.htmlNodeWithType()).isEmpty
    }

    @Test
    fun ofQuoteNodeWithTypeRoundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNode =
            ElementalNode.ofQuoteNodeWithType(
                ElementalQuoteNodeWithType.builder()
                    .addChannel("string")
                    .if_("if")
                    .loop("loop")
                    .ref("ref")
                    .content("content")
                    .align(Alignment.CENTER)
                    .borderColor("border_color")
                    .fontSize("font_size")
                    .lineHeight("line_height")
                    .locales(
                        Locales.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(mapOf("content" to "content")),
                            )
                            .build()
                    )
                    .textStyle(TextStyle.TEXT)
                    .type(ElementalQuoteNodeWithType.Type.QUOTE)
                    .build()
            )

        val roundtrippedElementalNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNode),
                jacksonTypeRef<ElementalNode>(),
            )

        assertThat(roundtrippedElementalNode).isEqualTo(elementalNode)
    }

    @Test
    fun ofHtmlNodeWithType() {
        val htmlNodeWithType =
            ElementalHtmlNodeWithType.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .content("content")
                .locales(
                    Locales.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                        .build()
                )
                .type(ElementalHtmlNodeWithType.Type.HTML)
                .build()

        val elementalNode = ElementalNode.ofHtmlNodeWithType(htmlNodeWithType)

        assertThat(elementalNode.textNodeWithType()).isEmpty
        assertThat(elementalNode.metaNodeWithType()).isEmpty
        assertThat(elementalNode.channelNodeWithType()).isEmpty
        assertThat(elementalNode.imageNodeWithType()).isEmpty
        assertThat(elementalNode.actionNodeWithType()).isEmpty
        assertThat(elementalNode.dividerNodeWithType()).isEmpty
        assertThat(elementalNode.quoteNodeWithType()).isEmpty
        assertThat(elementalNode.htmlNodeWithType()).contains(htmlNodeWithType)
    }

    @Test
    fun ofHtmlNodeWithTypeRoundtrip() {
        val jsonMapper = jsonMapper()
        val elementalNode =
            ElementalNode.ofHtmlNodeWithType(
                ElementalHtmlNodeWithType.builder()
                    .addChannel("string")
                    .if_("if")
                    .loop("loop")
                    .ref("ref")
                    .content("content")
                    .locales(
                        Locales.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(mapOf("content" to "content")),
                            )
                            .build()
                    )
                    .type(ElementalHtmlNodeWithType.Type.HTML)
                    .build()
            )

        val roundtrippedElementalNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalNode),
                jacksonTypeRef<ElementalNode>(),
            )

        assertThat(roundtrippedElementalNode).isEqualTo(elementalNode)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val elementalNode =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ElementalNode>())

        val e = assertThrows<CourierInvalidDataException> { elementalNode.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}

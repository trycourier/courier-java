// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalActionNodeTest {

    @Test
    fun create() {
        val elementalActionNode =
            ElementalActionNode.builder()
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
                .build()

        assertThat(elementalActionNode.channels().getOrNull()).containsExactly("string")
        assertThat(elementalActionNode.if_()).contains("if")
        assertThat(elementalActionNode.loop()).contains("loop")
        assertThat(elementalActionNode.ref()).contains("ref")
        assertThat(elementalActionNode.content()).isEqualTo("content")
        assertThat(elementalActionNode.href()).isEqualTo("href")
        assertThat(elementalActionNode.actionId()).contains("action_id")
        assertThat(elementalActionNode.align()).contains(Alignment.CENTER)
        assertThat(elementalActionNode.backgroundColor()).contains("background_color")
        assertThat(elementalActionNode.borderRadius()).contains("border_radius")
        assertThat(elementalActionNode.borderSize()).contains("border_size")
        assertThat(elementalActionNode.disableTracking()).contains(true)
        assertThat(elementalActionNode.fontSize()).contains("font_size")
        assertThat(elementalActionNode.locales())
            .contains(
                Locales.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                    .build()
            )
        assertThat(elementalActionNode.padding()).contains("padding")
        assertThat(elementalActionNode.style()).contains(ElementalActionNode.Style.BUTTON)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalActionNode =
            ElementalActionNode.builder()
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
                .build()

        val roundtrippedElementalActionNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalActionNode),
                jacksonTypeRef<ElementalActionNode>(),
            )

        assertThat(roundtrippedElementalActionNode).isEqualTo(elementalActionNode)
    }
}

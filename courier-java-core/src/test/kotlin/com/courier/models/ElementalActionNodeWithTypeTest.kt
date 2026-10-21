// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalActionNodeWithTypeTest {

    @Test
    fun create() {
        val elementalActionNodeWithType =
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

        assertThat(elementalActionNodeWithType.channels().getOrNull()).containsExactly("string")
        assertThat(elementalActionNodeWithType.if_()).contains("if")
        assertThat(elementalActionNodeWithType.loop()).contains("loop")
        assertThat(elementalActionNodeWithType.ref()).contains("ref")
        assertThat(elementalActionNodeWithType.content()).isEqualTo("content")
        assertThat(elementalActionNodeWithType.href()).isEqualTo("href")
        assertThat(elementalActionNodeWithType.actionId()).contains("action_id")
        assertThat(elementalActionNodeWithType.align()).contains(Alignment.CENTER)
        assertThat(elementalActionNodeWithType.backgroundColor()).contains("background_color")
        assertThat(elementalActionNodeWithType.borderRadius()).contains("border_radius")
        assertThat(elementalActionNodeWithType.borderSize()).contains("border_size")
        assertThat(elementalActionNodeWithType.disableTracking()).contains(true)
        assertThat(elementalActionNodeWithType.fontSize()).contains("font_size")
        assertThat(elementalActionNodeWithType.locales())
            .contains(
                Locales.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("content" to "content")))
                    .build()
            )
        assertThat(elementalActionNodeWithType.padding()).contains("padding")
        assertThat(elementalActionNodeWithType.style()).contains(ElementalActionNode.Style.BUTTON)
        assertThat(elementalActionNodeWithType.type())
            .contains(ElementalActionNodeWithType.Type.ACTION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalActionNodeWithType =
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

        val roundtrippedElementalActionNodeWithType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalActionNodeWithType),
                jacksonTypeRef<ElementalActionNodeWithType>(),
            )

        assertThat(roundtrippedElementalActionNodeWithType).isEqualTo(elementalActionNodeWithType)
    }
}

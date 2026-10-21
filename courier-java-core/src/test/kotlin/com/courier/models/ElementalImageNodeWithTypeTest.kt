// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalImageNodeWithTypeTest {

    @Test
    fun create() {
        val elementalImageNodeWithType =
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

        assertThat(elementalImageNodeWithType.channels().getOrNull()).containsExactly("string")
        assertThat(elementalImageNodeWithType.if_()).contains("if")
        assertThat(elementalImageNodeWithType.loop()).contains("loop")
        assertThat(elementalImageNodeWithType.ref()).contains("ref")
        assertThat(elementalImageNodeWithType.src()).isEqualTo("src")
        assertThat(elementalImageNodeWithType.align()).contains(Alignment.CENTER)
        assertThat(elementalImageNodeWithType.altText()).contains("alt_text")
        assertThat(elementalImageNodeWithType.borderColor()).contains("border_color")
        assertThat(elementalImageNodeWithType.borderSize()).contains("border_size")
        assertThat(elementalImageNodeWithType.href()).contains("href")
        assertThat(elementalImageNodeWithType.padding()).contains("padding")
        assertThat(elementalImageNodeWithType.width()).contains("width")
        assertThat(elementalImageNodeWithType.type())
            .contains(ElementalImageNodeWithType.Type.IMAGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalImageNodeWithType =
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

        val roundtrippedElementalImageNodeWithType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalImageNodeWithType),
                jacksonTypeRef<ElementalImageNodeWithType>(),
            )

        assertThat(roundtrippedElementalImageNodeWithType).isEqualTo(elementalImageNodeWithType)
    }
}

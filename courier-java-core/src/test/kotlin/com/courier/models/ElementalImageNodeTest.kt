// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElementalImageNodeTest {

    @Test
    fun create() {
        val elementalImageNode =
            ElementalImageNode.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .src("src")
                .align(Alignment.CENTER)
                .altText("altText")
                .borderColor("border_color")
                .borderSize("border_size")
                .href("href")
                .padding("padding")
                .width("width")
                .build()

        assertThat(elementalImageNode.channels().getOrNull()).containsExactly("string")
        assertThat(elementalImageNode.if_()).contains("if")
        assertThat(elementalImageNode.loop()).contains("loop")
        assertThat(elementalImageNode.ref()).contains("ref")
        assertThat(elementalImageNode.src()).isEqualTo("src")
        assertThat(elementalImageNode.align()).contains(Alignment.CENTER)
        assertThat(elementalImageNode.altText()).contains("altText")
        assertThat(elementalImageNode.borderColor()).contains("border_color")
        assertThat(elementalImageNode.borderSize()).contains("border_size")
        assertThat(elementalImageNode.href()).contains("href")
        assertThat(elementalImageNode.padding()).contains("padding")
        assertThat(elementalImageNode.width()).contains("width")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elementalImageNode =
            ElementalImageNode.builder()
                .addChannel("string")
                .if_("if")
                .loop("loop")
                .ref("ref")
                .src("src")
                .align(Alignment.CENTER)
                .altText("altText")
                .borderColor("border_color")
                .borderSize("border_size")
                .href("href")
                .padding("padding")
                .width("width")
                .build()

        val roundtrippedElementalImageNode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elementalImageNode),
                jacksonTypeRef<ElementalImageNode>(),
            )

        assertThat(roundtrippedElementalImageNode).isEqualTo(elementalImageNode)
    }
}

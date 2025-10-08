// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WidgetBackgroundTest {

    @Test
    fun create() {
        val widgetBackground =
            WidgetBackground.builder().bottomColor("bottomColor").topColor("topColor").build()

        assertThat(widgetBackground.bottomColor()).contains("bottomColor")
        assertThat(widgetBackground.topColor()).contains("topColor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val widgetBackground =
            WidgetBackground.builder().bottomColor("bottomColor").topColor("topColor").build()

        val roundtrippedWidgetBackground =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(widgetBackground),
                jacksonTypeRef<WidgetBackground>(),
            )

        assertThat(roundtrippedWidgetBackground).isEqualTo(widgetBackground)
    }
}

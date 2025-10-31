// File generated from our OpenAPI spec by Stainless.

package com.courier.models.brands

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandSettingsInAppTest {

    @Test
    fun create() {
        val brandSettingsInApp =
            BrandSettingsInApp.builder()
                .colors(BrandColors.builder().primary("primary").secondary("secondary").build())
                .icons(Icons.builder().bell("bell").message("message").build())
                .widgetBackground(
                    WidgetBackground.builder()
                        .bottomColor("bottomColor")
                        .topColor("topColor")
                        .build()
                )
                .borderRadius("borderRadius")
                .disableMessageIcon(true)
                .fontFamily("fontFamily")
                .placement(BrandSettingsInApp.Placement.TOP)
                .build()

        assertThat(brandSettingsInApp.colors())
            .isEqualTo(BrandColors.builder().primary("primary").secondary("secondary").build())
        assertThat(brandSettingsInApp.icons())
            .isEqualTo(Icons.builder().bell("bell").message("message").build())
        assertThat(brandSettingsInApp.widgetBackground())
            .isEqualTo(
                WidgetBackground.builder().bottomColor("bottomColor").topColor("topColor").build()
            )
        assertThat(brandSettingsInApp.borderRadius()).contains("borderRadius")
        assertThat(brandSettingsInApp.disableMessageIcon()).contains(true)
        assertThat(brandSettingsInApp.fontFamily()).contains("fontFamily")
        assertThat(brandSettingsInApp.placement()).contains(BrandSettingsInApp.Placement.TOP)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandSettingsInApp =
            BrandSettingsInApp.builder()
                .colors(BrandColors.builder().primary("primary").secondary("secondary").build())
                .icons(Icons.builder().bell("bell").message("message").build())
                .widgetBackground(
                    WidgetBackground.builder()
                        .bottomColor("bottomColor")
                        .topColor("topColor")
                        .build()
                )
                .borderRadius("borderRadius")
                .disableMessageIcon(true)
                .fontFamily("fontFamily")
                .placement(BrandSettingsInApp.Placement.TOP)
                .build()

        val roundtrippedBrandSettingsInApp =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandSettingsInApp),
                jacksonTypeRef<BrandSettingsInApp>(),
            )

        assertThat(roundtrippedBrandSettingsInApp).isEqualTo(brandSettingsInApp)
    }
}

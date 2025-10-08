// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandSettingsTest {

    @Test
    fun create() {
        val brandSettings =
            BrandSettings.builder()
                .colors(BrandColors.builder().primary("primary").secondary("secondary").build())
                .email(
                    BrandSettingsEmail.builder()
                        .footer(
                            EmailFooter.builder().content("content").inheritDefault(true).build()
                        )
                        .head(EmailHead.builder().inheritDefault(true).content("content").build())
                        .header(
                            EmailHeader.builder()
                                .logo(Logo.builder().href("href").image("image").build())
                                .barColor("barColor")
                                .inheritDefault(true)
                                .build()
                        )
                        .templateOverride(
                            BrandSettingsEmail.TemplateOverride.builder()
                                .enabled(true)
                                .backgroundColor("backgroundColor")
                                .blocksBackgroundColor("blocksBackgroundColor")
                                .footer("footer")
                                .head("head")
                                .header("header")
                                .width("width")
                                .mjml(
                                    BrandTemplate.builder()
                                        .enabled(true)
                                        .backgroundColor("backgroundColor")
                                        .blocksBackgroundColor("blocksBackgroundColor")
                                        .footer("footer")
                                        .head("head")
                                        .header("header")
                                        .width("width")
                                        .build()
                                )
                                .footerBackgroundColor("footerBackgroundColor")
                                .footerFullWidth(true)
                                .build()
                        )
                        .build()
                )
                .inapp(
                    BrandSettingsInApp.builder()
                        .colors(
                            BrandColors.builder().primary("primary").secondary("secondary").build()
                        )
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
                )
                .build()

        assertThat(brandSettings.colors())
            .contains(BrandColors.builder().primary("primary").secondary("secondary").build())
        assertThat(brandSettings.email())
            .contains(
                BrandSettingsEmail.builder()
                    .footer(EmailFooter.builder().content("content").inheritDefault(true).build())
                    .head(EmailHead.builder().inheritDefault(true).content("content").build())
                    .header(
                        EmailHeader.builder()
                            .logo(Logo.builder().href("href").image("image").build())
                            .barColor("barColor")
                            .inheritDefault(true)
                            .build()
                    )
                    .templateOverride(
                        BrandSettingsEmail.TemplateOverride.builder()
                            .enabled(true)
                            .backgroundColor("backgroundColor")
                            .blocksBackgroundColor("blocksBackgroundColor")
                            .footer("footer")
                            .head("head")
                            .header("header")
                            .width("width")
                            .mjml(
                                BrandTemplate.builder()
                                    .enabled(true)
                                    .backgroundColor("backgroundColor")
                                    .blocksBackgroundColor("blocksBackgroundColor")
                                    .footer("footer")
                                    .head("head")
                                    .header("header")
                                    .width("width")
                                    .build()
                            )
                            .footerBackgroundColor("footerBackgroundColor")
                            .footerFullWidth(true)
                            .build()
                    )
                    .build()
            )
        assertThat(brandSettings.inapp())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandSettings =
            BrandSettings.builder()
                .colors(BrandColors.builder().primary("primary").secondary("secondary").build())
                .email(
                    BrandSettingsEmail.builder()
                        .footer(
                            EmailFooter.builder().content("content").inheritDefault(true).build()
                        )
                        .head(EmailHead.builder().inheritDefault(true).content("content").build())
                        .header(
                            EmailHeader.builder()
                                .logo(Logo.builder().href("href").image("image").build())
                                .barColor("barColor")
                                .inheritDefault(true)
                                .build()
                        )
                        .templateOverride(
                            BrandSettingsEmail.TemplateOverride.builder()
                                .enabled(true)
                                .backgroundColor("backgroundColor")
                                .blocksBackgroundColor("blocksBackgroundColor")
                                .footer("footer")
                                .head("head")
                                .header("header")
                                .width("width")
                                .mjml(
                                    BrandTemplate.builder()
                                        .enabled(true)
                                        .backgroundColor("backgroundColor")
                                        .blocksBackgroundColor("blocksBackgroundColor")
                                        .footer("footer")
                                        .head("head")
                                        .header("header")
                                        .width("width")
                                        .build()
                                )
                                .footerBackgroundColor("footerBackgroundColor")
                                .footerFullWidth(true)
                                .build()
                        )
                        .build()
                )
                .inapp(
                    BrandSettingsInApp.builder()
                        .colors(
                            BrandColors.builder().primary("primary").secondary("secondary").build()
                        )
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
                )
                .build()

        val roundtrippedBrandSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandSettings),
                jacksonTypeRef<BrandSettings>(),
            )

        assertThat(roundtrippedBrandSettings).isEqualTo(brandSettings)
    }
}

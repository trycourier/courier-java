// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.jsonMapper
import com.courier.api.models.Brand
import com.courier.api.models.BrandColors
import com.courier.api.models.BrandSettings
import com.courier.api.models.BrandSettingsEmail
import com.courier.api.models.BrandSettingsInApp
import com.courier.api.models.BrandSnippet
import com.courier.api.models.BrandSnippets
import com.courier.api.models.BrandTemplate
import com.courier.api.models.EmailFooter
import com.courier.api.models.EmailHead
import com.courier.api.models.EmailHeader
import com.courier.api.models.Icons
import com.courier.api.models.Logo
import com.courier.api.models.Paging
import com.courier.api.models.WidgetBackground
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandListResponseTest {

    @Test
    fun create() {
        val brandListResponse =
            BrandListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    Brand.builder()
                        .id("id")
                        .created(0L)
                        .name("name")
                        .updated(0L)
                        .published(0L)
                        .settings(
                            BrandSettings.builder()
                                .colors(
                                    BrandColors.builder()
                                        .primary("primary")
                                        .secondary("secondary")
                                        .build()
                                )
                                .email(
                                    BrandSettingsEmail.builder()
                                        .footer(
                                            EmailFooter.builder()
                                                .content("content")
                                                .inheritDefault(true)
                                                .build()
                                        )
                                        .head(
                                            EmailHead.builder()
                                                .inheritDefault(true)
                                                .content("content")
                                                .build()
                                        )
                                        .header(
                                            EmailHeader.builder()
                                                .logo(
                                                    Logo.builder()
                                                        .href("href")
                                                        .image("image")
                                                        .build()
                                                )
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
                                                        .blocksBackgroundColor(
                                                            "blocksBackgroundColor"
                                                        )
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
                                            BrandColors.builder()
                                                .primary("primary")
                                                .secondary("secondary")
                                                .build()
                                        )
                                        .icons(
                                            Icons.builder().bell("bell").message("message").build()
                                        )
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
                        )
                        .snippets(
                            BrandSnippets.builder()
                                .addItem(BrandSnippet.builder().name("name").value("value").build())
                                .build()
                        )
                        .version("version")
                        .build()
                )
                .build()

        assertThat(brandListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
        assertThat(brandListResponse.results())
            .containsExactly(
                Brand.builder()
                    .id("id")
                    .created(0L)
                    .name("name")
                    .updated(0L)
                    .published(0L)
                    .settings(
                        BrandSettings.builder()
                            .colors(
                                BrandColors.builder()
                                    .primary("primary")
                                    .secondary("secondary")
                                    .build()
                            )
                            .email(
                                BrandSettingsEmail.builder()
                                    .footer(
                                        EmailFooter.builder()
                                            .content("content")
                                            .inheritDefault(true)
                                            .build()
                                    )
                                    .head(
                                        EmailHead.builder()
                                            .inheritDefault(true)
                                            .content("content")
                                            .build()
                                    )
                                    .header(
                                        EmailHeader.builder()
                                            .logo(
                                                Logo.builder().href("href").image("image").build()
                                            )
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
                                        BrandColors.builder()
                                            .primary("primary")
                                            .secondary("secondary")
                                            .build()
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
                    )
                    .snippets(
                        BrandSnippets.builder()
                            .addItem(BrandSnippet.builder().name("name").value("value").build())
                            .build()
                    )
                    .version("version")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandListResponse =
            BrandListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    Brand.builder()
                        .id("id")
                        .created(0L)
                        .name("name")
                        .updated(0L)
                        .published(0L)
                        .settings(
                            BrandSettings.builder()
                                .colors(
                                    BrandColors.builder()
                                        .primary("primary")
                                        .secondary("secondary")
                                        .build()
                                )
                                .email(
                                    BrandSettingsEmail.builder()
                                        .footer(
                                            EmailFooter.builder()
                                                .content("content")
                                                .inheritDefault(true)
                                                .build()
                                        )
                                        .head(
                                            EmailHead.builder()
                                                .inheritDefault(true)
                                                .content("content")
                                                .build()
                                        )
                                        .header(
                                            EmailHeader.builder()
                                                .logo(
                                                    Logo.builder()
                                                        .href("href")
                                                        .image("image")
                                                        .build()
                                                )
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
                                                        .blocksBackgroundColor(
                                                            "blocksBackgroundColor"
                                                        )
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
                                            BrandColors.builder()
                                                .primary("primary")
                                                .secondary("secondary")
                                                .build()
                                        )
                                        .icons(
                                            Icons.builder().bell("bell").message("message").build()
                                        )
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
                        )
                        .snippets(
                            BrandSnippets.builder()
                                .addItem(BrandSnippet.builder().name("name").value("value").build())
                                .build()
                        )
                        .version("version")
                        .build()
                )
                .build()

        val roundtrippedBrandListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandListResponse),
                jacksonTypeRef<BrandListResponse>(),
            )

        assertThat(roundtrippedBrandListResponse).isEqualTo(brandListResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.brands

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandSettingsEmailTest {

    @Test
    fun create() {
        val brandSettingsEmail =
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

        assertThat(brandSettingsEmail.footer())
            .contains(EmailFooter.builder().content("content").inheritDefault(true).build())
        assertThat(brandSettingsEmail.head())
            .contains(EmailHead.builder().inheritDefault(true).content("content").build())
        assertThat(brandSettingsEmail.header())
            .contains(
                EmailHeader.builder()
                    .logo(Logo.builder().href("href").image("image").build())
                    .barColor("barColor")
                    .inheritDefault(true)
                    .build()
            )
        assertThat(brandSettingsEmail.templateOverride())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandSettingsEmail =
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

        val roundtrippedBrandSettingsEmail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandSettingsEmail),
                jacksonTypeRef<BrandSettingsEmail>(),
            )

        assertThat(roundtrippedBrandSettingsEmail).isEqualTo(brandSettingsEmail)
    }
}

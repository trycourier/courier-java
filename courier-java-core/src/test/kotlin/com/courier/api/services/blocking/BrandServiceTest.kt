// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClient
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
import com.courier.api.models.WidgetBackground
import com.courier.api.models.brands.BrandCreateParams
import com.courier.api.models.brands.BrandListParams
import com.courier.api.models.brands.BrandUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BrandServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.brands()

        val brand =
            brandService.create(
                BrandCreateParams.builder()
                    .name("name")
                    .id("id")
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
                    .build()
            )

        brand.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.brands()

        val brand = brandService.retrieve("brand_id")

        brand.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.brands()

        val brand =
            brandService.update(
                BrandUpdateParams.builder()
                    .brandId("brand_id")
                    .name("name")
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
                    .build()
            )

        brand.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.brands()

        val brands = brandService.list(BrandListParams.builder().cursor("cursor").build())

        brands.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandService = client.brands()

        brandService.delete("brand_id")
    }
}

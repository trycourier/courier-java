// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClient
import com.courier.api.models.brands.BrandCreateParams
import com.courier.api.models.brands.BrandListParams
import com.courier.api.models.brands.BrandSettings
import com.courier.api.models.brands.BrandSnippets
import com.courier.api.models.brands.BrandTemplate
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
                                BrandSettings.Colors.builder()
                                    .primary("primary")
                                    .secondary("secondary")
                                    .build()
                            )
                            .email(
                                BrandSettings.Email.builder()
                                    .footer(
                                        BrandSettings.Email.Footer.builder()
                                            .content("content")
                                            .inheritDefault(true)
                                            .build()
                                    )
                                    .head(
                                        BrandSettings.Email.Head.builder()
                                            .inheritDefault(true)
                                            .content("content")
                                            .build()
                                    )
                                    .header(
                                        BrandSettings.Email.Header.builder()
                                            .logo(
                                                BrandSettings.Email.Header.Logo.builder()
                                                    .href("href")
                                                    .image("image")
                                                    .build()
                                            )
                                            .barColor("barColor")
                                            .inheritDefault(true)
                                            .build()
                                    )
                                    .templateOverride(
                                        BrandSettings.Email.TemplateOverride.builder()
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
                                BrandSettings.Inapp.builder()
                                    .colors(
                                        BrandSettings.Inapp.Colors.builder()
                                            .primary("primary")
                                            .secondary("secondary")
                                            .build()
                                    )
                                    .icons(
                                        BrandSettings.Inapp.Icons.builder()
                                            .bell("bell")
                                            .message("message")
                                            .build()
                                    )
                                    .widgetBackground(
                                        BrandSettings.Inapp.WidgetBackground.builder()
                                            .bottomColor("bottomColor")
                                            .topColor("topColor")
                                            .build()
                                    )
                                    .borderRadius("borderRadius")
                                    .disableMessageIcon(true)
                                    .fontFamily("fontFamily")
                                    .placement(BrandSettings.Inapp.Placement.TOP)
                                    .build()
                            )
                            .build()
                    )
                    .snippets(
                        BrandSnippets.builder()
                            .addItem(
                                BrandSnippets.Item.builder().name("name").value("value").build()
                            )
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
                                BrandSettings.Colors.builder()
                                    .primary("primary")
                                    .secondary("secondary")
                                    .build()
                            )
                            .email(
                                BrandSettings.Email.builder()
                                    .footer(
                                        BrandSettings.Email.Footer.builder()
                                            .content("content")
                                            .inheritDefault(true)
                                            .build()
                                    )
                                    .head(
                                        BrandSettings.Email.Head.builder()
                                            .inheritDefault(true)
                                            .content("content")
                                            .build()
                                    )
                                    .header(
                                        BrandSettings.Email.Header.builder()
                                            .logo(
                                                BrandSettings.Email.Header.Logo.builder()
                                                    .href("href")
                                                    .image("image")
                                                    .build()
                                            )
                                            .barColor("barColor")
                                            .inheritDefault(true)
                                            .build()
                                    )
                                    .templateOverride(
                                        BrandSettings.Email.TemplateOverride.builder()
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
                                BrandSettings.Inapp.builder()
                                    .colors(
                                        BrandSettings.Inapp.Colors.builder()
                                            .primary("primary")
                                            .secondary("secondary")
                                            .build()
                                    )
                                    .icons(
                                        BrandSettings.Inapp.Icons.builder()
                                            .bell("bell")
                                            .message("message")
                                            .build()
                                    )
                                    .widgetBackground(
                                        BrandSettings.Inapp.WidgetBackground.builder()
                                            .bottomColor("bottomColor")
                                            .topColor("topColor")
                                            .build()
                                    )
                                    .borderRadius("borderRadius")
                                    .disableMessageIcon(true)
                                    .fontFamily("fontFamily")
                                    .placement(BrandSettings.Inapp.Placement.TOP)
                                    .build()
                            )
                            .build()
                    )
                    .snippets(
                        BrandSnippets.builder()
                            .addItem(
                                BrandSnippets.Item.builder().name("name").value("value").build()
                            )
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

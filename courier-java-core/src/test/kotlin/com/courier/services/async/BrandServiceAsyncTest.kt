// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.brands.BrandColors
import com.courier.models.brands.BrandCreateParams
import com.courier.models.brands.BrandListParams
import com.courier.models.brands.BrandSettings
import com.courier.models.brands.BrandSettingsEmail
import com.courier.models.brands.BrandSettingsInApp
import com.courier.models.brands.BrandSnippet
import com.courier.models.brands.BrandSnippets
import com.courier.models.brands.BrandTemplate
import com.courier.models.brands.BrandUpdateParams
import com.courier.models.brands.EmailFooter
import com.courier.models.brands.EmailHead
import com.courier.models.brands.EmailHeader
import com.courier.models.brands.Icons
import com.courier.models.brands.Logo
import com.courier.models.brands.WidgetBackground
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BrandServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.brands()

        val brandFuture =
            brandServiceAsync.create(
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

        val brand = brandFuture.get()
        brand.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.brands()

        val brandFuture = brandServiceAsync.retrieve("brand_id")

        val brand = brandFuture.get()
        brand.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.brands()

        val brandFuture =
            brandServiceAsync.update(
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

        val brand = brandFuture.get()
        brand.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.brands()

        val brandsFuture =
            brandServiceAsync.list(BrandListParams.builder().cursor("cursor").build())

        val brands = brandsFuture.get()
        brands.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val brandServiceAsync = client.brands()

        val future = brandServiceAsync.delete("brand_id")

        val response = future.get()
    }
}

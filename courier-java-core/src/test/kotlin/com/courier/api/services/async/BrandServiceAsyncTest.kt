// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClientAsync
import com.courier.api.core.JsonValue
import com.courier.api.models.brands.BrandColors
import com.courier.api.models.brands.BrandCreateParams
import com.courier.api.models.brands.BrandListParams
import com.courier.api.models.brands.BrandSettings
import com.courier.api.models.brands.BrandSnippet
import com.courier.api.models.brands.BrandSnippets
import com.courier.api.models.brands.BrandUpdateParams
import com.courier.api.models.brands.Email
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BrandServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brands()

        val brandFuture =
            brandServiceAsync.create(
                BrandCreateParams.builder()
                    .name("name")
                    .settings(
                        BrandSettings.builder()
                            .colors(
                                BrandColors.builder()
                                    .primary("primary")
                                    .secondary("secondary")
                                    .tertiary("tertiary")
                                    .build()
                            )
                            .email(
                                Email.builder()
                                    .footer(JsonValue.from(mapOf<String, Any>()))
                                    .header(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .inapp(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .id("id")
                    .snippets(
                        BrandSnippets.builder()
                            .addItem(
                                BrandSnippet.builder()
                                    .format(BrandSnippet.Format.HANDLEBARS)
                                    .name("name")
                                    .value("value")
                                    .build()
                            )
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
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brands()

        val brandFuture = brandServiceAsync.retrieve("brand_id")

        val brand = brandFuture.get()
        brand.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
                                    .tertiary("tertiary")
                                    .build()
                            )
                            .email(
                                Email.builder()
                                    .footer(JsonValue.from(mapOf<String, Any>()))
                                    .header(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .inapp(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .snippets(
                        BrandSnippets.builder()
                            .addItem(
                                BrandSnippet.builder()
                                    .format(BrandSnippet.Format.HANDLEBARS)
                                    .name("name")
                                    .value("value")
                                    .build()
                            )
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
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brands()

        val brandsFuture =
            brandServiceAsync.list(BrandListParams.builder().cursor("cursor").build())

        val brands = brandsFuture.get()
        brands.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val brandServiceAsync = client.brands()

        val future = brandServiceAsync.delete("brand_id")

        val response = future.get()
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.courier.api.models.audiences.Paging
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
                        .created(0L)
                        .name("name")
                        .published(0L)
                        .settings(
                            BrandSettings.builder()
                                .colors(
                                    BrandSettings.Colors.builder()
                                        .primary("primary")
                                        .secondary("secondary")
                                        .tertiary("tertiary")
                                        .build()
                                )
                                .email(
                                    BrandSettings.Email.builder()
                                        .footer(JsonValue.from(mapOf<String, Any>()))
                                        .header(JsonValue.from(mapOf<String, Any>()))
                                        .build()
                                )
                                .inapp(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .updated(0L)
                        .version("version")
                        .id("id")
                        .snippets(
                            BrandSnippets.builder()
                                .addItem(
                                    BrandSnippets.Item.builder()
                                        .format(BrandSnippets.Item.Format.HANDLEBARS)
                                        .name("name")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(brandListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
        assertThat(brandListResponse.results())
            .containsExactly(
                Brand.builder()
                    .created(0L)
                    .name("name")
                    .published(0L)
                    .settings(
                        BrandSettings.builder()
                            .colors(
                                BrandSettings.Colors.builder()
                                    .primary("primary")
                                    .secondary("secondary")
                                    .tertiary("tertiary")
                                    .build()
                            )
                            .email(
                                BrandSettings.Email.builder()
                                    .footer(JsonValue.from(mapOf<String, Any>()))
                                    .header(JsonValue.from(mapOf<String, Any>()))
                                    .build()
                            )
                            .inapp(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .updated(0L)
                    .version("version")
                    .id("id")
                    .snippets(
                        BrandSnippets.builder()
                            .addItem(
                                BrandSnippets.Item.builder()
                                    .format(BrandSnippets.Item.Format.HANDLEBARS)
                                    .name("name")
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
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
                        .created(0L)
                        .name("name")
                        .published(0L)
                        .settings(
                            BrandSettings.builder()
                                .colors(
                                    BrandSettings.Colors.builder()
                                        .primary("primary")
                                        .secondary("secondary")
                                        .tertiary("tertiary")
                                        .build()
                                )
                                .email(
                                    BrandSettings.Email.builder()
                                        .footer(JsonValue.from(mapOf<String, Any>()))
                                        .header(JsonValue.from(mapOf<String, Any>()))
                                        .build()
                                )
                                .inapp(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .updated(0L)
                        .version("version")
                        .id("id")
                        .snippets(
                            BrandSnippets.builder()
                                .addItem(
                                    BrandSnippets.Item.builder()
                                        .format(BrandSnippets.Item.Format.HANDLEBARS)
                                        .name("name")
                                        .value("value")
                                        .build()
                                )
                                .build()
                        )
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

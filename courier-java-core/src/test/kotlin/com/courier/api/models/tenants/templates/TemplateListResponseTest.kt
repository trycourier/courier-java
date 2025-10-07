// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.tenants.templates

import com.courier.api.core.jsonMapper
import com.courier.api.models.MessageRouting
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateListResponseTest {

    @Test
    fun create() {
        val templateListResponse =
            TemplateListResponse.builder()
                .hasMore(true)
                .type(TemplateListResponse.Type.LIST)
                .url("url")
                .cursor("cursor")
                .addItem(
                    TemplateListResponse.Item.builder()
                        .id("id")
                        .createdAt("created_at")
                        .publishedAt("published_at")
                        .updatedAt("updated_at")
                        .version("version")
                        .data(
                            TemplateListResponse.Item.Data.builder()
                                .routing(
                                    MessageRouting.builder()
                                        .addChannel("string")
                                        .method(MessageRouting.Method.ALL)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .nextUrl("next_url")
                .build()

        assertThat(templateListResponse.hasMore()).isEqualTo(true)
        assertThat(templateListResponse.type()).isEqualTo(TemplateListResponse.Type.LIST)
        assertThat(templateListResponse.url()).isEqualTo("url")
        assertThat(templateListResponse.cursor()).contains("cursor")
        assertThat(templateListResponse.items().getOrNull())
            .containsExactly(
                TemplateListResponse.Item.builder()
                    .id("id")
                    .createdAt("created_at")
                    .publishedAt("published_at")
                    .updatedAt("updated_at")
                    .version("version")
                    .data(
                        TemplateListResponse.Item.Data.builder()
                            .routing(
                                MessageRouting.builder()
                                    .addChannel("string")
                                    .method(MessageRouting.Method.ALL)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(templateListResponse.nextUrl()).contains("next_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val templateListResponse =
            TemplateListResponse.builder()
                .hasMore(true)
                .type(TemplateListResponse.Type.LIST)
                .url("url")
                .cursor("cursor")
                .addItem(
                    TemplateListResponse.Item.builder()
                        .id("id")
                        .createdAt("created_at")
                        .publishedAt("published_at")
                        .updatedAt("updated_at")
                        .version("version")
                        .data(
                            TemplateListResponse.Item.Data.builder()
                                .routing(
                                    MessageRouting.builder()
                                        .addChannel("string")
                                        .method(MessageRouting.Method.ALL)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .nextUrl("next_url")
                .build()

        val roundtrippedTemplateListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(templateListResponse),
                jacksonTypeRef<TemplateListResponse>(),
            )

        assertThat(roundtrippedTemplateListResponse).isEqualTo(templateListResponse)
    }
}

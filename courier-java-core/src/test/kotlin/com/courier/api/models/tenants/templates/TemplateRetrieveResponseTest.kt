// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.tenants.templates

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateRetrieveResponseTest {

    @Test
    fun create() {
        val templateRetrieveResponse =
            TemplateRetrieveResponse.builder()
                .id("id")
                .createdAt("created_at")
                .publishedAt("published_at")
                .updatedAt("updated_at")
                .version("version")
                .build()

        assertThat(templateRetrieveResponse.id()).isEqualTo("id")
        assertThat(templateRetrieveResponse.createdAt()).isEqualTo("created_at")
        assertThat(templateRetrieveResponse.publishedAt()).isEqualTo("published_at")
        assertThat(templateRetrieveResponse.updatedAt()).isEqualTo("updated_at")
        assertThat(templateRetrieveResponse.version()).isEqualTo("version")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val templateRetrieveResponse =
            TemplateRetrieveResponse.builder()
                .id("id")
                .createdAt("created_at")
                .publishedAt("published_at")
                .updatedAt("updated_at")
                .version("version")
                .build()

        val roundtrippedTemplateRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(templateRetrieveResponse),
                jacksonTypeRef<TemplateRetrieveResponse>(),
            )

        assertThat(roundtrippedTemplateRetrieveResponse).isEqualTo(templateRetrieveResponse)
    }
}

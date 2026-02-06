// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PutTenantTemplateResponseTest {

    @Test
    fun create() {
        val putTenantTemplateResponse =
            PutTenantTemplateResponse.builder()
                .id("id")
                .version("version")
                .publishedAt("published_at")
                .build()

        assertThat(putTenantTemplateResponse.id()).isEqualTo("id")
        assertThat(putTenantTemplateResponse.version()).isEqualTo("version")
        assertThat(putTenantTemplateResponse.publishedAt()).contains("published_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val putTenantTemplateResponse =
            PutTenantTemplateResponse.builder()
                .id("id")
                .version("version")
                .publishedAt("published_at")
                .build()

        val roundtrippedPutTenantTemplateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(putTenantTemplateResponse),
                jacksonTypeRef<PutTenantTemplateResponse>(),
            )

        assertThat(roundtrippedPutTenantTemplateResponse).isEqualTo(putTenantTemplateResponse)
    }
}

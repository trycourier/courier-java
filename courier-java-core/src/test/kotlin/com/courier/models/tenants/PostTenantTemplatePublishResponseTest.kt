// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostTenantTemplatePublishResponseTest {

    @Test
    fun create() {
        val postTenantTemplatePublishResponse =
            PostTenantTemplatePublishResponse.builder()
                .id("id")
                .publishedAt("published_at")
                .version("version")
                .build()

        assertThat(postTenantTemplatePublishResponse.id()).isEqualTo("id")
        assertThat(postTenantTemplatePublishResponse.publishedAt()).isEqualTo("published_at")
        assertThat(postTenantTemplatePublishResponse.version()).isEqualTo("version")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val postTenantTemplatePublishResponse =
            PostTenantTemplatePublishResponse.builder()
                .id("id")
                .publishedAt("published_at")
                .version("version")
                .build()

        val roundtrippedPostTenantTemplatePublishResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postTenantTemplatePublishResponse),
                jacksonTypeRef<PostTenantTemplatePublishResponse>(),
            )

        assertThat(roundtrippedPostTenantTemplatePublishResponse)
            .isEqualTo(postTenantTemplatePublishResponse)
    }
}

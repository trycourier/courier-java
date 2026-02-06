// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostTenantTemplatePublishRequestTest {

    @Test
    fun create() {
        val postTenantTemplatePublishRequest =
            PostTenantTemplatePublishRequest.builder().version("version").build()

        assertThat(postTenantTemplatePublishRequest.version()).contains("version")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val postTenantTemplatePublishRequest =
            PostTenantTemplatePublishRequest.builder().version("version").build()

        val roundtrippedPostTenantTemplatePublishRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postTenantTemplatePublishRequest),
                jacksonTypeRef<PostTenantTemplatePublishRequest>(),
            )

        assertThat(roundtrippedPostTenantTemplatePublishRequest)
            .isEqualTo(postTenantTemplatePublishRequest)
    }
}

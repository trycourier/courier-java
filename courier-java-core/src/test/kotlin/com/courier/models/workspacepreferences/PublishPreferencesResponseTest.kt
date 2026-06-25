// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublishPreferencesResponseTest {

    @Test
    fun create() {
        val publishPreferencesResponse =
            PublishPreferencesResponse.builder()
                .pageId("page_id")
                .publishedAt("published_at")
                .publishedVersion(0.0)
                .previewUrl("preview_url")
                .publishedBy("published_by")
                .build()

        assertThat(publishPreferencesResponse.pageId()).isEqualTo("page_id")
        assertThat(publishPreferencesResponse.publishedAt()).isEqualTo("published_at")
        assertThat(publishPreferencesResponse.publishedVersion()).isEqualTo(0.0)
        assertThat(publishPreferencesResponse.previewUrl()).contains("preview_url")
        assertThat(publishPreferencesResponse.publishedBy()).contains("published_by")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publishPreferencesResponse =
            PublishPreferencesResponse.builder()
                .pageId("page_id")
                .publishedAt("published_at")
                .publishedVersion(0.0)
                .previewUrl("preview_url")
                .publishedBy("published_by")
                .build()

        val roundtrippedPublishPreferencesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publishPreferencesResponse),
                jacksonTypeRef<PublishPreferencesResponse>(),
            )

        assertThat(roundtrippedPublishPreferencesResponse).isEqualTo(publishPreferencesResponse)
    }
}

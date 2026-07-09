// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublishPreferencesRequestTest {

    @Test
    fun create() {
        val publishPreferencesRequest =
            PublishPreferencesRequest.builder()
                .brandId("brand_id")
                .description("description")
                .heading("heading")
                .build()

        assertThat(publishPreferencesRequest.brandId()).contains("brand_id")
        assertThat(publishPreferencesRequest.description()).contains("description")
        assertThat(publishPreferencesRequest.heading()).contains("heading")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publishPreferencesRequest =
            PublishPreferencesRequest.builder()
                .brandId("brand_id")
                .description("description")
                .heading("heading")
                .build()

        val roundtrippedPublishPreferencesRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publishPreferencesRequest),
                jacksonTypeRef<PublishPreferencesRequest>(),
            )

        assertThat(roundtrippedPublishPreferencesRequest).isEqualTo(publishPreferencesRequest)
    }
}

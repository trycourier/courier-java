// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspacePreferencePublishParamsTest {

    @Test
    fun create() {
        WorkspacePreferencePublishParams.builder()
            .publishPreferencesRequest(
                PublishPreferencesRequest.builder()
                    .brandId("brand_id")
                    .description("description")
                    .heading("heading")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            WorkspacePreferencePublishParams.builder()
                .publishPreferencesRequest(
                    PublishPreferencesRequest.builder()
                        .brandId("brand_id")
                        .description("description")
                        .heading("heading")
                        .build()
                )
                .build()

        val body = params._body().getOrNull()

        assertThat(body)
            .isEqualTo(
                PublishPreferencesRequest.builder()
                    .brandId("brand_id")
                    .description("description")
                    .heading("heading")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WorkspacePreferencePublishParams.builder().build()

        val body = params._body().getOrNull()
    }
}

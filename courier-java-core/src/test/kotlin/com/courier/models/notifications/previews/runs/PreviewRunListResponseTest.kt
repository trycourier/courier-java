// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications.previews.runs

import com.courier.core.jsonMapper
import com.courier.models.Paging
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreviewRunListResponseTest {

    @Test
    fun create() {
        val previewRunListResponse =
            PreviewRunListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    PreviewRun.builder()
                        .id("id")
                        .createdAt("created_at")
                        .addDeviceId("string")
                        .status(PreviewRunStatus.PENDING)
                        .templateId("template_id")
                        .failureReason(PreviewRunFailureReason.TEMPLATE_NOT_SUPPORTED)
                        .templateVersion("template_version")
                        .build()
                )
                .build()

        assertThat(previewRunListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
        assertThat(previewRunListResponse.results())
            .containsExactly(
                PreviewRun.builder()
                    .id("id")
                    .createdAt("created_at")
                    .addDeviceId("string")
                    .status(PreviewRunStatus.PENDING)
                    .templateId("template_id")
                    .failureReason(PreviewRunFailureReason.TEMPLATE_NOT_SUPPORTED)
                    .templateVersion("template_version")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val previewRunListResponse =
            PreviewRunListResponse.builder()
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .addResult(
                    PreviewRun.builder()
                        .id("id")
                        .createdAt("created_at")
                        .addDeviceId("string")
                        .status(PreviewRunStatus.PENDING)
                        .templateId("template_id")
                        .failureReason(PreviewRunFailureReason.TEMPLATE_NOT_SUPPORTED)
                        .templateVersion("template_version")
                        .build()
                )
                .build()

        val roundtrippedPreviewRunListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(previewRunListResponse),
                jacksonTypeRef<PreviewRunListResponse>(),
            )

        assertThat(roundtrippedPreviewRunListResponse).isEqualTo(previewRunListResponse)
    }
}

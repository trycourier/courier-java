// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications.previews.runs

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreviewRunDetailTest {

    @Test
    fun create() {
        val previewRunDetail =
            PreviewRunDetail.builder()
                .id("id")
                .createdAt("created_at")
                .addDeviceId("string")
                .addResult(
                    PreviewResult.builder()
                        .deviceId("device_id")
                        .screenshotUrl("screenshot_url")
                        .status(PreviewResultStatus.PENDING)
                        .thumbnailUrl("thumbnail_url")
                        .failureReason(PreviewResultFailureReason.DELIVERY_FAILED)
                        .build()
                )
                .status(PreviewRunStatus.PENDING)
                .templateId("template_id")
                .failureReason(PreviewRunFailureReason.TEMPLATE_NOT_SUPPORTED)
                .templateVersion("template_version")
                .build()

        assertThat(previewRunDetail.id()).isEqualTo("id")
        assertThat(previewRunDetail.createdAt()).isEqualTo("created_at")
        assertThat(previewRunDetail.deviceIds()).containsExactly("string")
        assertThat(previewRunDetail.results())
            .containsExactly(
                PreviewResult.builder()
                    .deviceId("device_id")
                    .screenshotUrl("screenshot_url")
                    .status(PreviewResultStatus.PENDING)
                    .thumbnailUrl("thumbnail_url")
                    .failureReason(PreviewResultFailureReason.DELIVERY_FAILED)
                    .build()
            )
        assertThat(previewRunDetail.status()).isEqualTo(PreviewRunStatus.PENDING)
        assertThat(previewRunDetail.templateId()).isEqualTo("template_id")
        assertThat(previewRunDetail.failureReason())
            .contains(PreviewRunFailureReason.TEMPLATE_NOT_SUPPORTED)
        assertThat(previewRunDetail.templateVersion()).contains("template_version")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val previewRunDetail =
            PreviewRunDetail.builder()
                .id("id")
                .createdAt("created_at")
                .addDeviceId("string")
                .addResult(
                    PreviewResult.builder()
                        .deviceId("device_id")
                        .screenshotUrl("screenshot_url")
                        .status(PreviewResultStatus.PENDING)
                        .thumbnailUrl("thumbnail_url")
                        .failureReason(PreviewResultFailureReason.DELIVERY_FAILED)
                        .build()
                )
                .status(PreviewRunStatus.PENDING)
                .templateId("template_id")
                .failureReason(PreviewRunFailureReason.TEMPLATE_NOT_SUPPORTED)
                .templateVersion("template_version")
                .build()

        val roundtrippedPreviewRunDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(previewRunDetail),
                jacksonTypeRef<PreviewRunDetail>(),
            )

        assertThat(roundtrippedPreviewRunDetail).isEqualTo(previewRunDetail)
    }
}

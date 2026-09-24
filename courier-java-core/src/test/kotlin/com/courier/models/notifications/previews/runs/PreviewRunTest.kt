// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications.previews.runs

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreviewRunTest {

    @Test
    fun create() {
        val previewRun =
            PreviewRun.builder()
                .id("id")
                .createdAt("created_at")
                .addDeviceId("string")
                .status(PreviewRunStatus.PENDING)
                .templateId("template_id")
                .failureReason(PreviewRunFailureReason.TEMPLATE_NOT_SUPPORTED)
                .templateVersion("template_version")
                .build()

        assertThat(previewRun.id()).isEqualTo("id")
        assertThat(previewRun.createdAt()).isEqualTo("created_at")
        assertThat(previewRun.deviceIds()).containsExactly("string")
        assertThat(previewRun.status()).isEqualTo(PreviewRunStatus.PENDING)
        assertThat(previewRun.templateId()).isEqualTo("template_id")
        assertThat(previewRun.failureReason())
            .contains(PreviewRunFailureReason.TEMPLATE_NOT_SUPPORTED)
        assertThat(previewRun.templateVersion()).contains("template_version")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val previewRun =
            PreviewRun.builder()
                .id("id")
                .createdAt("created_at")
                .addDeviceId("string")
                .status(PreviewRunStatus.PENDING)
                .templateId("template_id")
                .failureReason(PreviewRunFailureReason.TEMPLATE_NOT_SUPPORTED)
                .templateVersion("template_version")
                .build()

        val roundtrippedPreviewRun =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(previewRun),
                jacksonTypeRef<PreviewRun>(),
            )

        assertThat(roundtrippedPreviewRun).isEqualTo(previewRun)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications.previews.runs

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreviewResultTest {

    @Test
    fun create() {
        val previewResult =
            PreviewResult.builder()
                .deviceId("device_id")
                .screenshotUrl("screenshot_url")
                .status(PreviewResultStatus.PENDING)
                .thumbnailUrl("thumbnail_url")
                .failureReason(PreviewResultFailureReason.DELIVERY_FAILED)
                .build()

        assertThat(previewResult.deviceId()).isEqualTo("device_id")
        assertThat(previewResult.screenshotUrl()).contains("screenshot_url")
        assertThat(previewResult.status()).isEqualTo(PreviewResultStatus.PENDING)
        assertThat(previewResult.thumbnailUrl()).contains("thumbnail_url")
        assertThat(previewResult.failureReason())
            .contains(PreviewResultFailureReason.DELIVERY_FAILED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val previewResult =
            PreviewResult.builder()
                .deviceId("device_id")
                .screenshotUrl("screenshot_url")
                .status(PreviewResultStatus.PENDING)
                .thumbnailUrl("thumbnail_url")
                .failureReason(PreviewResultFailureReason.DELIVERY_FAILED)
                .build()

        val roundtrippedPreviewResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(previewResult),
                jacksonTypeRef<PreviewResult>(),
            )

        assertThat(roundtrippedPreviewResult).isEqualTo(previewResult)
    }
}

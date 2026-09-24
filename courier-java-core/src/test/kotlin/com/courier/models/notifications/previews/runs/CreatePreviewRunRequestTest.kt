// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications.previews.runs

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreatePreviewRunRequestTest {

    @Test
    fun create() {
        val createPreviewRunRequest =
            CreatePreviewRunRequest.builder()
                .data(
                    CreatePreviewRunRequest.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addDeviceId("string")
                .deviceSetId("device_set_id")
                .locale("locale")
                .templateVersion("draft")
                .build()

        assertThat(createPreviewRunRequest.data())
            .contains(
                CreatePreviewRunRequest.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(createPreviewRunRequest.deviceIds().getOrNull()).containsExactly("string")
        assertThat(createPreviewRunRequest.deviceSetId()).contains("device_set_id")
        assertThat(createPreviewRunRequest.locale()).contains("locale")
        assertThat(createPreviewRunRequest.templateVersion()).contains("draft")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createPreviewRunRequest =
            CreatePreviewRunRequest.builder()
                .data(
                    CreatePreviewRunRequest.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addDeviceId("string")
                .deviceSetId("device_set_id")
                .locale("locale")
                .templateVersion("draft")
                .build()

        val roundtrippedCreatePreviewRunRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createPreviewRunRequest),
                jacksonTypeRef<CreatePreviewRunRequest>(),
            )

        assertThat(roundtrippedCreatePreviewRunRequest).isEqualTo(createPreviewRunRequest)
    }
}

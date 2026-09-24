// File generated from our OpenAPI spec by Stainless.

package com.courier.models.previews

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeviceSetListResponseTest {

    @Test
    fun create() {
        val deviceSetListResponse =
            DeviceSetListResponse.builder()
                .addResult(
                    DeviceSet.builder()
                        .id("id")
                        .createdAt("created_at")
                        .addDeviceId("string")
                        .name("name")
                        .updatedAt("updated_at")
                        .archivedAt("archived_at")
                        .build()
                )
                .build()

        assertThat(deviceSetListResponse.results())
            .containsExactly(
                DeviceSet.builder()
                    .id("id")
                    .createdAt("created_at")
                    .addDeviceId("string")
                    .name("name")
                    .updatedAt("updated_at")
                    .archivedAt("archived_at")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deviceSetListResponse =
            DeviceSetListResponse.builder()
                .addResult(
                    DeviceSet.builder()
                        .id("id")
                        .createdAt("created_at")
                        .addDeviceId("string")
                        .name("name")
                        .updatedAt("updated_at")
                        .archivedAt("archived_at")
                        .build()
                )
                .build()

        val roundtrippedDeviceSetListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deviceSetListResponse),
                jacksonTypeRef<DeviceSetListResponse>(),
            )

        assertThat(roundtrippedDeviceSetListResponse).isEqualTo(deviceSetListResponse)
    }
}

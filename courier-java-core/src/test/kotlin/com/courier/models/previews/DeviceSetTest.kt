// File generated from our OpenAPI spec by Stainless.

package com.courier.models.previews

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeviceSetTest {

    @Test
    fun create() {
        val deviceSet =
            DeviceSet.builder()
                .id("id")
                .createdAt("created_at")
                .addDeviceId("string")
                .name("name")
                .updatedAt("updated_at")
                .archivedAt("archived_at")
                .build()

        assertThat(deviceSet.id()).isEqualTo("id")
        assertThat(deviceSet.createdAt()).isEqualTo("created_at")
        assertThat(deviceSet.deviceIds()).containsExactly("string")
        assertThat(deviceSet.name()).isEqualTo("name")
        assertThat(deviceSet.updatedAt()).isEqualTo("updated_at")
        assertThat(deviceSet.archivedAt()).contains("archived_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deviceSet =
            DeviceSet.builder()
                .id("id")
                .createdAt("created_at")
                .addDeviceId("string")
                .name("name")
                .updatedAt("updated_at")
                .archivedAt("archived_at")
                .build()

        val roundtrippedDeviceSet =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deviceSet),
                jacksonTypeRef<DeviceSet>(),
            )

        assertThat(roundtrippedDeviceSet).isEqualTo(deviceSet)
    }
}

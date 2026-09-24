// File generated from our OpenAPI spec by Stainless.

package com.courier.models.previews

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateDeviceSetRequestTest {

    @Test
    fun create() {
        val createDeviceSetRequest =
            CreateDeviceSetRequest.builder().addDeviceId("string").name("name").build()

        assertThat(createDeviceSetRequest.deviceIds()).containsExactly("string")
        assertThat(createDeviceSetRequest.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createDeviceSetRequest =
            CreateDeviceSetRequest.builder().addDeviceId("string").name("name").build()

        val roundtrippedCreateDeviceSetRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createDeviceSetRequest),
                jacksonTypeRef<CreateDeviceSetRequest>(),
            )

        assertThat(roundtrippedCreateDeviceSetRequest).isEqualTo(createDeviceSetRequest)
    }
}

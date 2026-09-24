// File generated from our OpenAPI spec by Stainless.

package com.courier.models.previews

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreviewCreateDeviceSetParamsTest {

    @Test
    fun create() {
        PreviewCreateDeviceSetParams.builder()
            .createDeviceSetRequest(
                CreateDeviceSetRequest.builder()
                    .addDeviceId("pvd_1w6dgafr3aaycvv9a8bm996pkc")
                    .name("Mobile")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PreviewCreateDeviceSetParams.builder()
                .createDeviceSetRequest(
                    CreateDeviceSetRequest.builder()
                        .addDeviceId("pvd_1w6dgafr3aaycvv9a8bm996pkc")
                        .name("Mobile")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateDeviceSetRequest.builder()
                    .addDeviceId("pvd_1w6dgafr3aaycvv9a8bm996pkc")
                    .name("Mobile")
                    .build()
            )
    }
}

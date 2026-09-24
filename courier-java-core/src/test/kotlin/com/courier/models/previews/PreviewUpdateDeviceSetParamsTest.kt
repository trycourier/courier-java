// File generated from our OpenAPI spec by Stainless.

package com.courier.models.previews

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreviewUpdateDeviceSetParamsTest {

    @Test
    fun create() {
        PreviewUpdateDeviceSetParams.builder()
            .deviceSetId("deviceSetId")
            .createDeviceSetRequest(
                CreateDeviceSetRequest.builder()
                    .addDeviceId("pvd_1w6dgafr3aaycvv9a8bm996pkc")
                    .addDeviceId("pvd_34qvmj6p4dbqaa5mpys1ekt9jx")
                    .name("Mobile and desktop")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PreviewUpdateDeviceSetParams.builder()
                .deviceSetId("deviceSetId")
                .createDeviceSetRequest(
                    CreateDeviceSetRequest.builder()
                        .addDeviceId("pvd_1w6dgafr3aaycvv9a8bm996pkc")
                        .addDeviceId("pvd_34qvmj6p4dbqaa5mpys1ekt9jx")
                        .name("Mobile and desktop")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("deviceSetId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PreviewUpdateDeviceSetParams.builder()
                .deviceSetId("deviceSetId")
                .createDeviceSetRequest(
                    CreateDeviceSetRequest.builder()
                        .addDeviceId("pvd_1w6dgafr3aaycvv9a8bm996pkc")
                        .addDeviceId("pvd_34qvmj6p4dbqaa5mpys1ekt9jx")
                        .name("Mobile and desktop")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateDeviceSetRequest.builder()
                    .addDeviceId("pvd_1w6dgafr3aaycvv9a8bm996pkc")
                    .addDeviceId("pvd_34qvmj6p4dbqaa5mpys1ekt9jx")
                    .name("Mobile and desktop")
                    .build()
            )
    }
}

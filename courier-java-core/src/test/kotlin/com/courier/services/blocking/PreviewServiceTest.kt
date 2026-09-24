// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.previews.CreateDeviceSetRequest
import com.courier.models.previews.PreviewUpdateDeviceSetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PreviewServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun archiveDeviceSet() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val previewService = client.previews()

        val deviceSet = previewService.archiveDeviceSet("deviceSetId")

        deviceSet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createDeviceSet() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val previewService = client.previews()

        val deviceSet =
            previewService.createDeviceSet(
                CreateDeviceSetRequest.builder()
                    .addDeviceId("pvd_1w6dgafr3aaycvv9a8bm996pkc")
                    .name("Mobile")
                    .build()
            )

        deviceSet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listDeviceSets() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val previewService = client.previews()

        val deviceSetListResponse = previewService.listDeviceSets()

        deviceSetListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listDevices() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val previewService = client.previews()

        val previewDeviceListResponse = previewService.listDevices()

        previewDeviceListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveDeviceSet() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val previewService = client.previews()

        val deviceSet = previewService.retrieveDeviceSet("deviceSetId")

        deviceSet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateDeviceSet() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val previewService = client.previews()

        val deviceSet =
            previewService.updateDeviceSet(
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
            )

        deviceSet.validate()
    }
}

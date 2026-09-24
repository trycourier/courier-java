// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.previews.CreateDeviceSetRequest
import com.courier.models.previews.PreviewUpdateDeviceSetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PreviewServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun archiveDeviceSet() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val previewServiceAsync = client.previews()

        val deviceSetFuture = previewServiceAsync.archiveDeviceSet("deviceSetId")

        val deviceSet = deviceSetFuture.get()
        deviceSet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createDeviceSet() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val previewServiceAsync = client.previews()

        val deviceSetFuture =
            previewServiceAsync.createDeviceSet(
                CreateDeviceSetRequest.builder()
                    .addDeviceId("pvd_1w6dgafr3aaycvv9a8bm996pkc")
                    .name("Mobile")
                    .build()
            )

        val deviceSet = deviceSetFuture.get()
        deviceSet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listDeviceSets() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val previewServiceAsync = client.previews()

        val deviceSetListResponseFuture = previewServiceAsync.listDeviceSets()

        val deviceSetListResponse = deviceSetListResponseFuture.get()
        deviceSetListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listDevices() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val previewServiceAsync = client.previews()

        val previewDeviceListResponseFuture = previewServiceAsync.listDevices()

        val previewDeviceListResponse = previewDeviceListResponseFuture.get()
        previewDeviceListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveDeviceSet() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val previewServiceAsync = client.previews()

        val deviceSetFuture = previewServiceAsync.retrieveDeviceSet("deviceSetId")

        val deviceSet = deviceSetFuture.get()
        deviceSet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateDeviceSet() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val previewServiceAsync = client.previews()

        val deviceSetFuture =
            previewServiceAsync.updateDeviceSet(
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

        val deviceSet = deviceSetFuture.get()
        deviceSet.validate()
    }
}

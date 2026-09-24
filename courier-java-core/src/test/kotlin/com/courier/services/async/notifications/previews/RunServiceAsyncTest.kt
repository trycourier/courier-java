// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.notifications.previews

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.core.JsonValue
import com.courier.models.notifications.previews.runs.CreatePreviewRunRequest
import com.courier.models.notifications.previews.runs.RunCreateParams
import com.courier.models.notifications.previews.runs.RunListParams
import com.courier.models.notifications.previews.runs.RunRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.notifications().previews().runs()

        val previewRunFuture =
            runServiceAsync.create(
                RunCreateParams.builder()
                    .id("id")
                    .idempotencyKey("order-ORD-456-user-123")
                    .xIdempotencyExpiration("1785312000")
                    .createPreviewRunRequest(
                        CreatePreviewRunRequest.builder()
                            .data(
                                CreatePreviewRunRequest.Data.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .addDeviceId("pvd_1w6dgafr3aaycvv9a8bm996pkc")
                            .addDeviceId("pvd_34qvmj6p4dbqaa5mpys1ekt9jx")
                            .deviceSetId("device_set_id")
                            .locale("locale")
                            .templateVersion("draft")
                            .build()
                    )
                    .build()
            )

        val previewRun = previewRunFuture.get()
        previewRun.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.notifications().previews().runs()

        val previewRunDetailFuture =
            runServiceAsync.retrieve(
                RunRetrieveParams.builder().id("id").previewRunId("previewRunId").build()
            )

        val previewRunDetail = previewRunDetailFuture.get()
        previewRunDetail.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.notifications().previews().runs()

        val previewRunListResponseFuture =
            runServiceAsync.list(
                RunListParams.builder().id("id").cursor("cursor").limit(1L).build()
            )

        val previewRunListResponse = previewRunListResponseFuture.get()
        previewRunListResponse.validate()
    }
}

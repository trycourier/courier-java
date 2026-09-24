// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.notifications.previews

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.notifications.previews.runs.CreatePreviewRunRequest
import com.courier.models.notifications.previews.runs.RunCreateParams
import com.courier.models.notifications.previews.runs.RunListParams
import com.courier.models.notifications.previews.runs.RunRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.notifications().previews().runs()

        val previewRun =
            runService.create(
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

        previewRun.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.notifications().previews().runs()

        val previewRunDetail =
            runService.retrieve(
                RunRetrieveParams.builder().id("id").previewRunId("previewRunId").build()
            )

        previewRunDetail.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.notifications().previews().runs()

        val previewRunListResponse =
            runService.list(RunListParams.builder().id("id").cursor("cursor").limit(1L).build())

        previewRunListResponse.validate()
    }
}

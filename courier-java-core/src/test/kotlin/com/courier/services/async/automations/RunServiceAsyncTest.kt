// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.automations

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.automations.runs.RunListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.automations().runs()

        val automationRunListResponseFuture =
            runServiceAsync.list(
                RunListParams.builder()
                    .cursor("cursor")
                    .endDate("end_date")
                    .limit("321669910225")
                    .startDate("start_date")
                    .status("status")
                    .templateId("template_id")
                    .build()
            )

        val automationRunListResponse = automationRunListResponseFuture.get()
        automationRunListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSteps() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.automations().runs()

        val automationRunStepsResponseFuture = runServiceAsync.listSteps("x")

        val automationRunStepsResponse = automationRunStepsResponseFuture.get()
        automationRunStepsResponse.validate()
    }
}

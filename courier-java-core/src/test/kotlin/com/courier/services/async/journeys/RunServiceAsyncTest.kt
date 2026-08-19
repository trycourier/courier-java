// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.journeys

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.journeys.runs.RunListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.journeys().runs()

        val journeyRunResponseFuture = runServiceAsync.retrieve("x")

        val journeyRunResponse = journeyRunResponseFuture.get()
        journeyRunResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.journeys().runs()

        val journeyRunListResponseFuture =
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

        val journeyRunListResponse = journeyRunListResponseFuture.get()
        journeyRunListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSteps() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.journeys().runs()

        val journeyRunStepsResponseFuture = runServiceAsync.listSteps("x")

        val journeyRunStepsResponse = journeyRunStepsResponseFuture.get()
        journeyRunStepsResponse.validate()
    }
}

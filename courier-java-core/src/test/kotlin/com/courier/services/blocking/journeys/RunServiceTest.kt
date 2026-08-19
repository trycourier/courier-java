// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.journeys

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.journeys.runs.RunListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.journeys().runs()

        val journeyRunResponse = runService.retrieve("x")

        journeyRunResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.journeys().runs()

        val journeyRunListResponse =
            runService.list(
                RunListParams.builder()
                    .cursor("cursor")
                    .endDate("end_date")
                    .limit("321669910225")
                    .startDate("start_date")
                    .status("status")
                    .templateId("template_id")
                    .build()
            )

        journeyRunListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSteps() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.journeys().runs()

        val journeyRunStepsResponse = runService.listSteps("x")

        journeyRunStepsResponse.validate()
    }
}

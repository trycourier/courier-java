// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.automations

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.automations.runs.RunListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.automations().runs()

        val automationRunListResponse =
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

        automationRunListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSteps() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.automations().runs()

        val automationRunStepsResponse = runService.listSteps("x")

        automationRunStepsResponse.validate()
    }
}

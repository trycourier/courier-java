// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.digests

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.digests.schedules.ScheduleListInstancesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ScheduleServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listInstances() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val scheduleService = client.digests().schedules()

        val digestInstanceListResponse =
            scheduleService.listInstances(
                ScheduleListInstancesParams.builder()
                    .scheduleId("schedule_id")
                    .cursor("cursor")
                    .limit(100L)
                    .build()
            )

        digestInstanceListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun release() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val scheduleService = client.digests().schedules()

        scheduleService.release("schedule_id")
    }
}

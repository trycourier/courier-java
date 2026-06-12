// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.digests

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.digests.schedules.ScheduleListInstancesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ScheduleServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listInstances() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val scheduleServiceAsync = client.digests().schedules()

        val digestInstanceListResponseFuture =
            scheduleServiceAsync.listInstances(
                ScheduleListInstancesParams.builder()
                    .scheduleId("schedule_id")
                    .cursor("cursor")
                    .limit(100L)
                    .build()
            )

        val digestInstanceListResponse = digestInstanceListResponseFuture.get()
        digestInstanceListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun release() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val scheduleServiceAsync = client.digests().schedules()

        val future = scheduleServiceAsync.release("schedule_id")

        val response = future.get()
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.digests.schedules

import com.courier.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduleListInstancesParamsTest {

    @Test
    fun create() {
        ScheduleListInstancesParams.builder()
            .scheduleId("schedule_id")
            .cursor("cursor")
            .limit(100L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ScheduleListInstancesParams.builder().scheduleId("schedule_id").build()

        assertThat(params._pathParam(0)).isEqualTo("schedule_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ScheduleListInstancesParams.builder()
                .scheduleId("schedule_id")
                .cursor("cursor")
                .limit(100L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("limit", "100").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ScheduleListInstancesParams.builder().scheduleId("schedule_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.digests.schedules

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduleReleaseParamsTest {

    @Test
    fun create() {
        ScheduleReleaseParams.builder().scheduleId("schedule_id").build()
    }

    @Test
    fun pathParams() {
        val params = ScheduleReleaseParams.builder().scheduleId("schedule_id").build()

        assertThat(params._pathParam(0)).isEqualTo("schedule_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}

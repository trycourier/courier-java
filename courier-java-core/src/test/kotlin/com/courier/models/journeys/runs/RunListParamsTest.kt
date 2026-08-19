// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys.runs

import com.courier.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunListParamsTest {

    @Test
    fun create() {
        RunListParams.builder()
            .cursor("cursor")
            .endDate("end_date")
            .limit("321669910225")
            .startDate("start_date")
            .status("status")
            .templateId("template_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RunListParams.builder()
                .cursor("cursor")
                .endDate("end_date")
                .limit("321669910225")
                .startDate("start_date")
                .status("status")
                .templateId("template_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("end_date", "end_date")
                    .put("limit", "321669910225")
                    .put("start_date", "start_date")
                    .put("status", "status")
                    .put("template_id", "template_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RunListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}

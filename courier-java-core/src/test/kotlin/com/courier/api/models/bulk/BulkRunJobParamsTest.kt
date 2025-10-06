// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.bulk

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkRunJobParamsTest {

    @Test
    fun create() {
        BulkRunJobParams.builder().jobId("job_id").build()
    }

    @Test
    fun pathParams() {
        val params = BulkRunJobParams.builder().jobId("job_id").build()

        assertThat(params._pathParam(0)).isEqualTo("job_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}

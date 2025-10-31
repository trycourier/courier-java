// File generated from our OpenAPI spec by Stainless.

package com.courier.models.bulk

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkRetrieveJobParamsTest {

    @Test
    fun create() {
        BulkRetrieveJobParams.builder().jobId("job_id").build()
    }

    @Test
    fun pathParams() {
        val params = BulkRetrieveJobParams.builder().jobId("job_id").build()

        assertThat(params._pathParam(0)).isEqualTo("job_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}

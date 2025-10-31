// File generated from our OpenAPI spec by Stainless.

package com.courier.models.bulk

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkCreateJobResponseTest {

    @Test
    fun create() {
        val bulkCreateJobResponse = BulkCreateJobResponse.builder().jobId("jobId").build()

        assertThat(bulkCreateJobResponse.jobId()).isEqualTo("jobId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkCreateJobResponse = BulkCreateJobResponse.builder().jobId("jobId").build()

        val roundtrippedBulkCreateJobResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkCreateJobResponse),
                jacksonTypeRef<BulkCreateJobResponse>(),
            )

        assertThat(roundtrippedBulkCreateJobResponse).isEqualTo(bulkCreateJobResponse)
    }
}

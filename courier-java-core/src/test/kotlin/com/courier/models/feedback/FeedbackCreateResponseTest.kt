// File generated from our OpenAPI spec by Stainless.

package com.courier.models.feedback

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeedbackCreateResponseTest {

    @Test
    fun create() {
        val feedbackCreateResponse =
            FeedbackCreateResponse.builder().feedbackId("feedback_id").build()

        assertThat(feedbackCreateResponse.feedbackId()).isEqualTo("feedback_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val feedbackCreateResponse =
            FeedbackCreateResponse.builder().feedbackId("feedback_id").build()

        val roundtrippedFeedbackCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(feedbackCreateResponse),
                jacksonTypeRef<FeedbackCreateResponse>(),
            )

        assertThat(roundtrippedFeedbackCreateResponse).isEqualTo(feedbackCreateResponse)
    }
}

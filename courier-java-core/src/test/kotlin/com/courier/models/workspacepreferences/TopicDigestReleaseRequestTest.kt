// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopicDigestReleaseRequestTest {

    @Test
    fun create() {
        val topicDigestReleaseRequest =
            TopicDigestReleaseRequest.builder().userId("x").tenantId("x").build()

        assertThat(topicDigestReleaseRequest.userId()).isEqualTo("x")
        assertThat(topicDigestReleaseRequest.tenantId()).contains("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val topicDigestReleaseRequest =
            TopicDigestReleaseRequest.builder().userId("x").tenantId("x").build()

        val roundtrippedTopicDigestReleaseRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(topicDigestReleaseRequest),
                jacksonTypeRef<TopicDigestReleaseRequest>(),
            )

        assertThat(roundtrippedTopicDigestReleaseRequest).isEqualTo(topicDigestReleaseRequest)
    }
}

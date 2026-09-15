// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences.topics

import com.courier.models.workspacepreferences.TopicDigestReleaseRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopicReleaseDigestParamsTest {

    @Test
    fun create() {
        TopicReleaseDigestParams.builder()
            .sectionId("section_id")
            .topicId("topic_id")
            .topicDigestReleaseRequest(
                TopicDigestReleaseRequest.builder()
                    .userId("user_01h1p2c3d4e5f6g7h8")
                    .tenantId("x")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TopicReleaseDigestParams.builder()
                .sectionId("section_id")
                .topicId("topic_id")
                .topicDigestReleaseRequest(
                    TopicDigestReleaseRequest.builder().userId("user_01h1p2c3d4e5f6g7h8").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("section_id")
        assertThat(params._pathParam(1)).isEqualTo("topic_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TopicReleaseDigestParams.builder()
                .sectionId("section_id")
                .topicId("topic_id")
                .topicDigestReleaseRequest(
                    TopicDigestReleaseRequest.builder()
                        .userId("user_01h1p2c3d4e5f6g7h8")
                        .tenantId("x")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TopicDigestReleaseRequest.builder()
                    .userId("user_01h1p2c3d4e5f6g7h8")
                    .tenantId("x")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TopicReleaseDigestParams.builder()
                .sectionId("section_id")
                .topicId("topic_id")
                .topicDigestReleaseRequest(
                    TopicDigestReleaseRequest.builder().userId("user_01h1p2c3d4e5f6g7h8").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                TopicDigestReleaseRequest.builder().userId("user_01h1p2c3d4e5f6g7h8").build()
            )
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopicDigestCategoryTest {

    @Test
    fun create() {
        val topicDigestCategory =
            TopicDigestCategory.builder()
                .categoryKey("category_key")
                .limit(1L)
                .retain(TopicDigestCategory.Retain.FIRST)
                .sortKey("sort_key")
                .build()

        assertThat(topicDigestCategory.categoryKey()).isEqualTo("category_key")
        assertThat(topicDigestCategory.limit()).contains(1L)
        assertThat(topicDigestCategory.retain()).contains(TopicDigestCategory.Retain.FIRST)
        assertThat(topicDigestCategory.sortKey()).contains("sort_key")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val topicDigestCategory =
            TopicDigestCategory.builder()
                .categoryKey("category_key")
                .limit(1L)
                .retain(TopicDigestCategory.Retain.FIRST)
                .sortKey("sort_key")
                .build()

        val roundtrippedTopicDigestCategory =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(topicDigestCategory),
                jacksonTypeRef<TopicDigestCategory>(),
            )

        assertThat(roundtrippedTopicDigestCategory).isEqualTo(topicDigestCategory)
    }
}

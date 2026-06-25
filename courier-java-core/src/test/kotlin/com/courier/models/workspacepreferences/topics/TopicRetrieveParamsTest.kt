// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences.topics

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopicRetrieveParamsTest {

    @Test
    fun create() {
        TopicRetrieveParams.builder().sectionId("section_id").topicId("topic_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            TopicRetrieveParams.builder().sectionId("section_id").topicId("topic_id").build()

        assertThat(params._pathParam(0)).isEqualTo("section_id")
        assertThat(params._pathParam(1)).isEqualTo("topic_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}

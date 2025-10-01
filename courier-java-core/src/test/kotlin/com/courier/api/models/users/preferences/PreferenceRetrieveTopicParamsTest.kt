// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.preferences

import com.courier.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceRetrieveTopicParamsTest {

    @Test
    fun create() {
        PreferenceRetrieveTopicParams.builder()
            .userId("user_id")
            .topicId("topic_id")
            .tenantId("tenant_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PreferenceRetrieveTopicParams.builder().userId("user_id").topicId("topic_id").build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        assertThat(params._pathParam(1)).isEqualTo("topic_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PreferenceRetrieveTopicParams.builder()
                .userId("user_id")
                .topicId("topic_id")
                .tenantId("tenant_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("tenant_id", "tenant_id").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            PreferenceRetrieveTopicParams.builder().userId("user_id").topicId("topic_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}

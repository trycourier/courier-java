// File generated from our OpenAPI spec by Stainless.

package com.courier.models.users.preferences

import com.courier.core.http.QueryParams
import com.courier.models.ChannelClassification
import com.courier.models.PreferenceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceUpdateOrCreateTopicParamsTest {

    @Test
    fun create() {
        PreferenceUpdateOrCreateTopicParams.builder()
            .userId("user_id")
            .topicId("topic_id")
            .tenantId("tenant_id")
            .topic(
                PreferenceUpdateOrCreateTopicParams.Topic.builder()
                    .status(PreferenceStatus.OPTED_IN)
                    .addCustomRouting(ChannelClassification.INBOX)
                    .addCustomRouting(ChannelClassification.EMAIL)
                    .hasCustomRouting(true)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PreferenceUpdateOrCreateTopicParams.builder()
                .userId("user_id")
                .topicId("topic_id")
                .topic(
                    PreferenceUpdateOrCreateTopicParams.Topic.builder()
                        .status(PreferenceStatus.OPTED_IN)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        assertThat(params._pathParam(1)).isEqualTo("topic_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PreferenceUpdateOrCreateTopicParams.builder()
                .userId("user_id")
                .topicId("topic_id")
                .tenantId("tenant_id")
                .topic(
                    PreferenceUpdateOrCreateTopicParams.Topic.builder()
                        .status(PreferenceStatus.OPTED_IN)
                        .addCustomRouting(ChannelClassification.INBOX)
                        .addCustomRouting(ChannelClassification.EMAIL)
                        .hasCustomRouting(true)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("tenant_id", "tenant_id").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            PreferenceUpdateOrCreateTopicParams.builder()
                .userId("user_id")
                .topicId("topic_id")
                .topic(
                    PreferenceUpdateOrCreateTopicParams.Topic.builder()
                        .status(PreferenceStatus.OPTED_IN)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            PreferenceUpdateOrCreateTopicParams.builder()
                .userId("user_id")
                .topicId("topic_id")
                .tenantId("tenant_id")
                .topic(
                    PreferenceUpdateOrCreateTopicParams.Topic.builder()
                        .status(PreferenceStatus.OPTED_IN)
                        .addCustomRouting(ChannelClassification.INBOX)
                        .addCustomRouting(ChannelClassification.EMAIL)
                        .hasCustomRouting(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.topic())
            .isEqualTo(
                PreferenceUpdateOrCreateTopicParams.Topic.builder()
                    .status(PreferenceStatus.OPTED_IN)
                    .addCustomRouting(ChannelClassification.INBOX)
                    .addCustomRouting(ChannelClassification.EMAIL)
                    .hasCustomRouting(true)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PreferenceUpdateOrCreateTopicParams.builder()
                .userId("user_id")
                .topicId("topic_id")
                .topic(
                    PreferenceUpdateOrCreateTopicParams.Topic.builder()
                        .status(PreferenceStatus.OPTED_IN)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.topic())
            .isEqualTo(
                PreferenceUpdateOrCreateTopicParams.Topic.builder()
                    .status(PreferenceStatus.OPTED_IN)
                    .build()
            )
    }
}

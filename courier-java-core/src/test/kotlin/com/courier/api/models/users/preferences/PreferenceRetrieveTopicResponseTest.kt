// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.preferences

import com.courier.api.core.jsonMapper
import com.courier.api.models.tenants.defaultpreferences.items.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceRetrieveTopicResponseTest {

    @Test
    fun create() {
        val preferenceRetrieveTopicResponse =
            PreferenceRetrieveTopicResponse.builder()
                .topic(
                    TopicPreference.builder()
                        .defaultStatus(PreferenceStatus.OPTED_IN)
                        .status(PreferenceStatus.OPTED_IN)
                        .topicId("topic_id")
                        .topicName("topic_name")
                        .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                        .hasCustomRouting(true)
                        .build()
                )
                .build()

        assertThat(preferenceRetrieveTopicResponse.topic())
            .isEqualTo(
                TopicPreference.builder()
                    .defaultStatus(PreferenceStatus.OPTED_IN)
                    .status(PreferenceStatus.OPTED_IN)
                    .topicId("topic_id")
                    .topicName("topic_name")
                    .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                    .hasCustomRouting(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preferenceRetrieveTopicResponse =
            PreferenceRetrieveTopicResponse.builder()
                .topic(
                    TopicPreference.builder()
                        .defaultStatus(PreferenceStatus.OPTED_IN)
                        .status(PreferenceStatus.OPTED_IN)
                        .topicId("topic_id")
                        .topicName("topic_name")
                        .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                        .hasCustomRouting(true)
                        .build()
                )
                .build()

        val roundtrippedPreferenceRetrieveTopicResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceRetrieveTopicResponse),
                jacksonTypeRef<PreferenceRetrieveTopicResponse>(),
            )

        assertThat(roundtrippedPreferenceRetrieveTopicResponse)
            .isEqualTo(preferenceRetrieveTopicResponse)
    }
}

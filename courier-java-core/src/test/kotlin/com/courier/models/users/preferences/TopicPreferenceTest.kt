// File generated from our OpenAPI spec by Stainless.

package com.courier.models.users.preferences

import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.courier.models.PreferenceStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopicPreferenceTest {

    @Test
    fun create() {
        val topicPreference =
            TopicPreference.builder()
                .defaultStatus(PreferenceStatus.OPTED_IN)
                .status(PreferenceStatus.OPTED_IN)
                .topicId("topic_id")
                .topicName("topic_name")
                .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                .hasCustomRouting(true)
                .build()

        assertThat(topicPreference.defaultStatus()).isEqualTo(PreferenceStatus.OPTED_IN)
        assertThat(topicPreference.status()).isEqualTo(PreferenceStatus.OPTED_IN)
        assertThat(topicPreference.topicId()).isEqualTo("topic_id")
        assertThat(topicPreference.topicName()).isEqualTo("topic_name")
        assertThat(topicPreference.customRouting().getOrNull())
            .containsExactly(ChannelClassification.DIRECT_MESSAGE)
        assertThat(topicPreference.hasCustomRouting()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val topicPreference =
            TopicPreference.builder()
                .defaultStatus(PreferenceStatus.OPTED_IN)
                .status(PreferenceStatus.OPTED_IN)
                .topicId("topic_id")
                .topicName("topic_name")
                .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                .hasCustomRouting(true)
                .build()

        val roundtrippedTopicPreference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(topicPreference),
                jacksonTypeRef<TopicPreference>(),
            )

        assertThat(roundtrippedTopicPreference).isEqualTo(topicPreference)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceTopicCreateRequestTest {

    @Test
    fun create() {
        val preferenceTopicCreateRequest =
            PreferenceTopicCreateRequest.builder()
                .defaultStatus(PreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT)
                .name("name")
                .addAllowedPreference(PreferenceTopicCreateRequest.AllowedPreference.SNOOZE)
                .includeUnsubscribeHeader(true)
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .topicData(
                    PreferenceTopicCreateRequest.TopicData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(preferenceTopicCreateRequest.defaultStatus())
            .isEqualTo(PreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT)
        assertThat(preferenceTopicCreateRequest.name()).isEqualTo("name")
        assertThat(preferenceTopicCreateRequest.allowedPreferences().getOrNull())
            .containsExactly(PreferenceTopicCreateRequest.AllowedPreference.SNOOZE)
        assertThat(preferenceTopicCreateRequest.includeUnsubscribeHeader()).contains(true)
        assertThat(preferenceTopicCreateRequest.routingOptions().getOrNull())
            .containsExactly(ChannelClassification.DIRECT_MESSAGE)
        assertThat(preferenceTopicCreateRequest.topicData())
            .contains(
                PreferenceTopicCreateRequest.TopicData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preferenceTopicCreateRequest =
            PreferenceTopicCreateRequest.builder()
                .defaultStatus(PreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT)
                .name("name")
                .addAllowedPreference(PreferenceTopicCreateRequest.AllowedPreference.SNOOZE)
                .includeUnsubscribeHeader(true)
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .topicData(
                    PreferenceTopicCreateRequest.TopicData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedPreferenceTopicCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceTopicCreateRequest),
                jacksonTypeRef<PreferenceTopicCreateRequest>(),
            )

        assertThat(roundtrippedPreferenceTopicCreateRequest).isEqualTo(preferenceTopicCreateRequest)
    }
}

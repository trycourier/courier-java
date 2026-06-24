// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceTopicReplaceRequestTest {

    @Test
    fun create() {
        val preferenceTopicReplaceRequest =
            PreferenceTopicReplaceRequest.builder()
                .defaultStatus(PreferenceTopicReplaceRequest.DefaultStatus.OPTED_OUT)
                .name("name")
                .addAllowedPreference(PreferenceTopicReplaceRequest.AllowedPreference.SNOOZE)
                .includeUnsubscribeHeader(true)
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .topicData(
                    PreferenceTopicReplaceRequest.TopicData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(preferenceTopicReplaceRequest.defaultStatus())
            .isEqualTo(PreferenceTopicReplaceRequest.DefaultStatus.OPTED_OUT)
        assertThat(preferenceTopicReplaceRequest.name()).isEqualTo("name")
        assertThat(preferenceTopicReplaceRequest.allowedPreferences().getOrNull())
            .containsExactly(PreferenceTopicReplaceRequest.AllowedPreference.SNOOZE)
        assertThat(preferenceTopicReplaceRequest.includeUnsubscribeHeader()).contains(true)
        assertThat(preferenceTopicReplaceRequest.routingOptions().getOrNull())
            .containsExactly(ChannelClassification.DIRECT_MESSAGE)
        assertThat(preferenceTopicReplaceRequest.topicData())
            .contains(
                PreferenceTopicReplaceRequest.TopicData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preferenceTopicReplaceRequest =
            PreferenceTopicReplaceRequest.builder()
                .defaultStatus(PreferenceTopicReplaceRequest.DefaultStatus.OPTED_OUT)
                .name("name")
                .addAllowedPreference(PreferenceTopicReplaceRequest.AllowedPreference.SNOOZE)
                .includeUnsubscribeHeader(true)
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .topicData(
                    PreferenceTopicReplaceRequest.TopicData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedPreferenceTopicReplaceRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceTopicReplaceRequest),
                jacksonTypeRef<PreferenceTopicReplaceRequest>(),
            )

        assertThat(roundtrippedPreferenceTopicReplaceRequest)
            .isEqualTo(preferenceTopicReplaceRequest)
    }
}

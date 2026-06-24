// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceTopicGetResponseTest {

    @Test
    fun create() {
        val preferenceTopicGetResponse =
            PreferenceTopicGetResponse.builder()
                .id("id")
                .addAllowedPreference(PreferenceTopicGetResponse.AllowedPreference.SNOOZE)
                .created("created")
                .defaultStatus(PreferenceTopicGetResponse.DefaultStatus.OPTED_OUT)
                .includeUnsubscribeHeader(true)
                .name("name")
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .topicData(
                    PreferenceTopicGetResponse.TopicData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .updated("updated")
                .creator("creator")
                .updater("updater")
                .build()

        assertThat(preferenceTopicGetResponse.id()).isEqualTo("id")
        assertThat(preferenceTopicGetResponse.allowedPreferences())
            .containsExactly(PreferenceTopicGetResponse.AllowedPreference.SNOOZE)
        assertThat(preferenceTopicGetResponse.created()).isEqualTo("created")
        assertThat(preferenceTopicGetResponse.defaultStatus())
            .isEqualTo(PreferenceTopicGetResponse.DefaultStatus.OPTED_OUT)
        assertThat(preferenceTopicGetResponse.includeUnsubscribeHeader()).isEqualTo(true)
        assertThat(preferenceTopicGetResponse.name()).isEqualTo("name")
        assertThat(preferenceTopicGetResponse.routingOptions())
            .containsExactly(ChannelClassification.DIRECT_MESSAGE)
        assertThat(preferenceTopicGetResponse.topicData())
            .isEqualTo(
                PreferenceTopicGetResponse.TopicData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(preferenceTopicGetResponse.updated()).isEqualTo("updated")
        assertThat(preferenceTopicGetResponse.creator()).contains("creator")
        assertThat(preferenceTopicGetResponse.updater()).contains("updater")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preferenceTopicGetResponse =
            PreferenceTopicGetResponse.builder()
                .id("id")
                .addAllowedPreference(PreferenceTopicGetResponse.AllowedPreference.SNOOZE)
                .created("created")
                .defaultStatus(PreferenceTopicGetResponse.DefaultStatus.OPTED_OUT)
                .includeUnsubscribeHeader(true)
                .name("name")
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .topicData(
                    PreferenceTopicGetResponse.TopicData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .updated("updated")
                .creator("creator")
                .updater("updater")
                .build()

        val roundtrippedPreferenceTopicGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceTopicGetResponse),
                jacksonTypeRef<PreferenceTopicGetResponse>(),
            )

        assertThat(roundtrippedPreferenceTopicGetResponse).isEqualTo(preferenceTopicGetResponse)
    }
}

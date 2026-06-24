// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceTopicListResponseTest {

    @Test
    fun create() {
        val preferenceTopicListResponse =
            PreferenceTopicListResponse.builder()
                .addResult(
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
                )
                .build()

        assertThat(preferenceTopicListResponse.results())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preferenceTopicListResponse =
            PreferenceTopicListResponse.builder()
                .addResult(
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
                )
                .build()

        val roundtrippedPreferenceTopicListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceTopicListResponse),
                jacksonTypeRef<PreferenceTopicListResponse>(),
            )

        assertThat(roundtrippedPreferenceTopicListResponse).isEqualTo(preferenceTopicListResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceSectionListResponseTest {

    @Test
    fun create() {
        val preferenceSectionListResponse =
            PreferenceSectionListResponse.builder()
                .addResult(
                    PreferenceSectionGetResponse.builder()
                        .id("id")
                        .created("created")
                        .hasCustomRouting(true)
                        .name("name")
                        .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                        .addTopic(
                            PreferenceTopicGetResponse.builder()
                                .id("id")
                                .addAllowedPreference(
                                    PreferenceTopicGetResponse.AllowedPreference.SNOOZE
                                )
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
                        .creator("creator")
                        .updated("updated")
                        .updater("updater")
                        .build()
                )
                .build()

        assertThat(preferenceSectionListResponse.results())
            .containsExactly(
                PreferenceSectionGetResponse.builder()
                    .id("id")
                    .created("created")
                    .hasCustomRouting(true)
                    .name("name")
                    .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                    .addTopic(
                        PreferenceTopicGetResponse.builder()
                            .id("id")
                            .addAllowedPreference(
                                PreferenceTopicGetResponse.AllowedPreference.SNOOZE
                            )
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
                    .creator("creator")
                    .updated("updated")
                    .updater("updater")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preferenceSectionListResponse =
            PreferenceSectionListResponse.builder()
                .addResult(
                    PreferenceSectionGetResponse.builder()
                        .id("id")
                        .created("created")
                        .hasCustomRouting(true)
                        .name("name")
                        .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                        .addTopic(
                            PreferenceTopicGetResponse.builder()
                                .id("id")
                                .addAllowedPreference(
                                    PreferenceTopicGetResponse.AllowedPreference.SNOOZE
                                )
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
                        .creator("creator")
                        .updated("updated")
                        .updater("updater")
                        .build()
                )
                .build()

        val roundtrippedPreferenceSectionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceSectionListResponse),
                jacksonTypeRef<PreferenceSectionListResponse>(),
            )

        assertThat(roundtrippedPreferenceSectionListResponse)
            .isEqualTo(preferenceSectionListResponse)
    }
}

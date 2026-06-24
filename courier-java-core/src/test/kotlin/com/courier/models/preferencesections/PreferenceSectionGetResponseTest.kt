// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreferenceSectionGetResponseTest {

    @Test
    fun create() {
        val preferenceSectionGetResponse =
            PreferenceSectionGetResponse.builder()
                .id("id")
                .created("created")
                .hasCustomRouting(true)
                .name("name")
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .addTopic(
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
                .creator("creator")
                .updated("updated")
                .updater("updater")
                .build()

        assertThat(preferenceSectionGetResponse.id()).isEqualTo("id")
        assertThat(preferenceSectionGetResponse.created()).isEqualTo("created")
        assertThat(preferenceSectionGetResponse.hasCustomRouting()).isEqualTo(true)
        assertThat(preferenceSectionGetResponse.name()).isEqualTo("name")
        assertThat(preferenceSectionGetResponse.routingOptions())
            .containsExactly(ChannelClassification.DIRECT_MESSAGE)
        assertThat(preferenceSectionGetResponse.topics())
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
        assertThat(preferenceSectionGetResponse.creator()).contains("creator")
        assertThat(preferenceSectionGetResponse.updated()).contains("updated")
        assertThat(preferenceSectionGetResponse.updater()).contains("updater")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val preferenceSectionGetResponse =
            PreferenceSectionGetResponse.builder()
                .id("id")
                .created("created")
                .hasCustomRouting(true)
                .name("name")
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .addTopic(
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
                .creator("creator")
                .updated("updated")
                .updater("updater")
                .build()

        val roundtrippedPreferenceSectionGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(preferenceSectionGetResponse),
                jacksonTypeRef<PreferenceSectionGetResponse>(),
            )

        assertThat(roundtrippedPreferenceSectionGetResponse).isEqualTo(preferenceSectionGetResponse)
    }
}

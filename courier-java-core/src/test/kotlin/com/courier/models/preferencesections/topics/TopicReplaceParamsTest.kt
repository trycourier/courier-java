// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections.topics

import com.courier.core.JsonValue
import com.courier.models.ChannelClassification
import com.courier.models.preferencesections.PreferenceTopicReplaceRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopicReplaceParamsTest {

    @Test
    fun create() {
        TopicReplaceParams.builder()
            .sectionId("section_id")
            .topicId("topic_id")
            .preferenceTopicReplaceRequest(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TopicReplaceParams.builder()
                .sectionId("section_id")
                .topicId("topic_id")
                .preferenceTopicReplaceRequest(
                    PreferenceTopicReplaceRequest.builder()
                        .defaultStatus(PreferenceTopicReplaceRequest.DefaultStatus.OPTED_OUT)
                        .name("name")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("section_id")
        assertThat(params._pathParam(1)).isEqualTo("topic_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TopicReplaceParams.builder()
                .sectionId("section_id")
                .topicId("topic_id")
                .preferenceTopicReplaceRequest(
                    PreferenceTopicReplaceRequest.builder()
                        .defaultStatus(PreferenceTopicReplaceRequest.DefaultStatus.OPTED_OUT)
                        .name("name")
                        .addAllowedPreference(
                            PreferenceTopicReplaceRequest.AllowedPreference.SNOOZE
                        )
                        .includeUnsubscribeHeader(true)
                        .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                        .topicData(
                            PreferenceTopicReplaceRequest.TopicData.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TopicReplaceParams.builder()
                .sectionId("section_id")
                .topicId("topic_id")
                .preferenceTopicReplaceRequest(
                    PreferenceTopicReplaceRequest.builder()
                        .defaultStatus(PreferenceTopicReplaceRequest.DefaultStatus.OPTED_OUT)
                        .name("name")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PreferenceTopicReplaceRequest.builder()
                    .defaultStatus(PreferenceTopicReplaceRequest.DefaultStatus.OPTED_OUT)
                    .name("name")
                    .build()
            )
    }
}

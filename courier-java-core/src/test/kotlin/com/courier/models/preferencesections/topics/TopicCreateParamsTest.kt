// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections.topics

import com.courier.core.JsonValue
import com.courier.models.ChannelClassification
import com.courier.models.preferencesections.PreferenceTopicCreateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopicCreateParamsTest {

    @Test
    fun create() {
        TopicCreateParams.builder()
            .sectionId("section_id")
            .preferenceTopicCreateRequest(
                PreferenceTopicCreateRequest.builder()
                    .defaultStatus(PreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT)
                    .name("Marketing")
                    .addAllowedPreference(PreferenceTopicCreateRequest.AllowedPreference.SNOOZE)
                    .includeUnsubscribeHeader(true)
                    .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                    .topicData(
                        PreferenceTopicCreateRequest.TopicData.builder()
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
            TopicCreateParams.builder()
                .sectionId("section_id")
                .preferenceTopicCreateRequest(
                    PreferenceTopicCreateRequest.builder()
                        .defaultStatus(PreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT)
                        .name("Marketing")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("section_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TopicCreateParams.builder()
                .sectionId("section_id")
                .preferenceTopicCreateRequest(
                    PreferenceTopicCreateRequest.builder()
                        .defaultStatus(PreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT)
                        .name("Marketing")
                        .addAllowedPreference(PreferenceTopicCreateRequest.AllowedPreference.SNOOZE)
                        .includeUnsubscribeHeader(true)
                        .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                        .topicData(
                            PreferenceTopicCreateRequest.TopicData.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PreferenceTopicCreateRequest.builder()
                    .defaultStatus(PreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT)
                    .name("Marketing")
                    .addAllowedPreference(PreferenceTopicCreateRequest.AllowedPreference.SNOOZE)
                    .includeUnsubscribeHeader(true)
                    .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                    .topicData(
                        PreferenceTopicCreateRequest.TopicData.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TopicCreateParams.builder()
                .sectionId("section_id")
                .preferenceTopicCreateRequest(
                    PreferenceTopicCreateRequest.builder()
                        .defaultStatus(PreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT)
                        .name("Marketing")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PreferenceTopicCreateRequest.builder()
                    .defaultStatus(PreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT)
                    .name("Marketing")
                    .build()
            )
    }
}

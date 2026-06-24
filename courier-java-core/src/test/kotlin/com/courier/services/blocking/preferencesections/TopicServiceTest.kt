// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.preferencesections

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.ChannelClassification
import com.courier.models.preferencesections.PreferenceTopicCreateRequest
import com.courier.models.preferencesections.PreferenceTopicReplaceRequest
import com.courier.models.preferencesections.topics.TopicArchiveParams
import com.courier.models.preferencesections.topics.TopicCreateParams
import com.courier.models.preferencesections.topics.TopicReplaceParams
import com.courier.models.preferencesections.topics.TopicRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TopicServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val topicService = client.preferenceSections().topics()

        val preferenceTopicGetResponse =
            topicService.create(
                TopicCreateParams.builder()
                    .sectionId("section_id")
                    .preferenceTopicCreateRequest(
                        PreferenceTopicCreateRequest.builder()
                            .defaultStatus(PreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT)
                            .name("Marketing")
                            .addAllowedPreference(
                                PreferenceTopicCreateRequest.AllowedPreference.SNOOZE
                            )
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
            )

        preferenceTopicGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val topicService = client.preferenceSections().topics()

        val preferenceTopicGetResponse =
            topicService.retrieve(
                TopicRetrieveParams.builder().sectionId("section_id").topicId("topic_id").build()
            )

        preferenceTopicGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val topicService = client.preferenceSections().topics()

        val preferenceTopicListResponse = topicService.list("section_id")

        preferenceTopicListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val topicService = client.preferenceSections().topics()

        topicService.archive(
            TopicArchiveParams.builder().sectionId("section_id").topicId("topic_id").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val topicService = client.preferenceSections().topics()

        val preferenceTopicGetResponse =
            topicService.replace(
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
            )

        preferenceTopicGetResponse.validate()
    }
}

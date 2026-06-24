// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.preferencesections

import com.courier.client.okhttp.CourierOkHttpClientAsync
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

internal class TopicServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val topicServiceAsync = client.preferenceSections().topics()

        val preferenceTopicGetResponseFuture =
            topicServiceAsync.create(
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

        val preferenceTopicGetResponse = preferenceTopicGetResponseFuture.get()
        preferenceTopicGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val topicServiceAsync = client.preferenceSections().topics()

        val preferenceTopicGetResponseFuture =
            topicServiceAsync.retrieve(
                TopicRetrieveParams.builder().sectionId("section_id").topicId("topic_id").build()
            )

        val preferenceTopicGetResponse = preferenceTopicGetResponseFuture.get()
        preferenceTopicGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val topicServiceAsync = client.preferenceSections().topics()

        val preferenceTopicListResponseFuture = topicServiceAsync.list("section_id")

        val preferenceTopicListResponse = preferenceTopicListResponseFuture.get()
        preferenceTopicListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val topicServiceAsync = client.preferenceSections().topics()

        val future =
            topicServiceAsync.archive(
                TopicArchiveParams.builder().sectionId("section_id").topicId("topic_id").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val topicServiceAsync = client.preferenceSections().topics()

        val preferenceTopicGetResponseFuture =
            topicServiceAsync.replace(
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

        val preferenceTopicGetResponse = preferenceTopicGetResponseFuture.get()
        preferenceTopicGetResponse.validate()
    }
}

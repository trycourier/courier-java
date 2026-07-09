// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.workspacepreferences

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.ChannelClassification
import com.courier.models.workspacepreferences.WorkspacePreferenceTopicCreateRequest
import com.courier.models.workspacepreferences.WorkspacePreferenceTopicReplaceRequest
import com.courier.models.workspacepreferences.topics.TopicArchiveParams
import com.courier.models.workspacepreferences.topics.TopicCreateParams
import com.courier.models.workspacepreferences.topics.TopicReplaceParams
import com.courier.models.workspacepreferences.topics.TopicRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TopicServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val topicService = client.workspacePreferences().topics()

        val workspacePreferenceTopicGetResponse =
            topicService.create(
                TopicCreateParams.builder()
                    .sectionId("section_id")
                    .workspacePreferenceTopicCreateRequest(
                        WorkspacePreferenceTopicCreateRequest.builder()
                            .defaultStatus(
                                WorkspacePreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT
                            )
                            .name("Marketing")
                            .addAllowedPreference(
                                WorkspacePreferenceTopicCreateRequest.AllowedPreference.SNOOZE
                            )
                            .description("description")
                            .includeUnsubscribeHeader(true)
                            .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                            .topicData(
                                WorkspacePreferenceTopicCreateRequest.TopicData.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        workspacePreferenceTopicGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val topicService = client.workspacePreferences().topics()

        val workspacePreferenceTopicGetResponse =
            topicService.retrieve(
                TopicRetrieveParams.builder().sectionId("section_id").topicId("topic_id").build()
            )

        workspacePreferenceTopicGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val topicService = client.workspacePreferences().topics()

        val workspacePreferenceTopicListResponse = topicService.list("section_id")

        workspacePreferenceTopicListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val topicService = client.workspacePreferences().topics()

        topicService.archive(
            TopicArchiveParams.builder().sectionId("section_id").topicId("topic_id").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val topicService = client.workspacePreferences().topics()

        val workspacePreferenceTopicGetResponse =
            topicService.replace(
                TopicReplaceParams.builder()
                    .sectionId("section_id")
                    .topicId("topic_id")
                    .workspacePreferenceTopicReplaceRequest(
                        WorkspacePreferenceTopicReplaceRequest.builder()
                            .defaultStatus(
                                WorkspacePreferenceTopicReplaceRequest.DefaultStatus.OPTED_OUT
                            )
                            .name("name")
                            .addAllowedPreference(
                                WorkspacePreferenceTopicReplaceRequest.AllowedPreference.SNOOZE
                            )
                            .description("description")
                            .includeUnsubscribeHeader(true)
                            .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                            .topicData(
                                WorkspacePreferenceTopicReplaceRequest.TopicData.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        workspacePreferenceTopicGetResponse.validate()
    }
}

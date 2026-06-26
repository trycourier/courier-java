// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.workspacepreferences

import com.courier.client.okhttp.CourierOkHttpClientAsync
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

internal class TopicServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val topicServiceAsync = client.workspacePreferences().topics()

        val workspacePreferenceTopicGetResponseFuture =
            topicServiceAsync.create(
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

        val workspacePreferenceTopicGetResponse = workspacePreferenceTopicGetResponseFuture.get()
        workspacePreferenceTopicGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val topicServiceAsync = client.workspacePreferences().topics()

        val workspacePreferenceTopicGetResponseFuture =
            topicServiceAsync.retrieve(
                TopicRetrieveParams.builder().sectionId("section_id").topicId("topic_id").build()
            )

        val workspacePreferenceTopicGetResponse = workspacePreferenceTopicGetResponseFuture.get()
        workspacePreferenceTopicGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val topicServiceAsync = client.workspacePreferences().topics()

        val workspacePreferenceTopicListResponseFuture = topicServiceAsync.list("section_id")

        val workspacePreferenceTopicListResponse = workspacePreferenceTopicListResponseFuture.get()
        workspacePreferenceTopicListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val topicServiceAsync = client.workspacePreferences().topics()

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
        val topicServiceAsync = client.workspacePreferences().topics()

        val workspacePreferenceTopicGetResponseFuture =
            topicServiceAsync.replace(
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

        val workspacePreferenceTopicGetResponse = workspacePreferenceTopicGetResponseFuture.get()
        workspacePreferenceTopicGetResponse.validate()
    }
}

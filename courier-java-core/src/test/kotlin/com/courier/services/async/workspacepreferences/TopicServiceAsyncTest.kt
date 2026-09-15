// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.workspacepreferences

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.core.JsonValue
import com.courier.models.ChannelClassification
import com.courier.models.digests.DigestDayOfWeek
import com.courier.models.digests.DigestFrequency
import com.courier.models.workspacepreferences.TopicDigestCategory
import com.courier.models.workspacepreferences.TopicDigestReleaseRequest
import com.courier.models.workspacepreferences.TopicDigestRequest
import com.courier.models.workspacepreferences.TopicDigestScheduleRequest
import com.courier.models.workspacepreferences.WorkspacePreferenceTopicCreateRequest
import com.courier.models.workspacepreferences.WorkspacePreferenceTopicReplaceRequest
import com.courier.models.workspacepreferences.topics.TopicArchiveParams
import com.courier.models.workspacepreferences.topics.TopicCreateParams
import com.courier.models.workspacepreferences.topics.TopicDeleteDigestParams
import com.courier.models.workspacepreferences.topics.TopicReleaseDigestParams
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
                    .idempotencyKey("order-ORD-456-user-123")
                    .xIdempotencyExpiration("1785312000")
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
                            .digest(
                                TopicDigestRequest.builder()
                                    .addSchedule(
                                        TopicDigestScheduleRequest.builder()
                                            .frequency(DigestFrequency.INSTANT)
                                            .dayOfMonth(1L)
                                            .dayOfWeek(DigestDayOfWeek.SUNDAY)
                                            .addDaysOfWeek(DigestDayOfWeek.SUNDAY)
                                            .disabled(true)
                                            .isDefault(true)
                                            .scheduleId("schedule_id")
                                            .time("time")
                                            .timezone("timezone")
                                            .build()
                                    )
                                    .templateId("template_id")
                                    .audienceId("audience_id")
                                    .addCategory(
                                        TopicDigestCategory.builder()
                                            .categoryKey("category_key")
                                            .limit(1L)
                                            .retain(TopicDigestCategory.Retain.FIRST)
                                            .sortKey("sort_key")
                                            .build()
                                    )
                                    .triggerEmpty(true)
                                    .build()
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
    fun deleteDigest() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val topicServiceAsync = client.workspacePreferences().topics()

        val future =
            topicServiceAsync.deleteDigest(
                TopicDeleteDigestParams.builder()
                    .sectionId("section_id")
                    .topicId("topic_id")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun releaseDigest() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val topicServiceAsync = client.workspacePreferences().topics()

        val future =
            topicServiceAsync.releaseDigest(
                TopicReleaseDigestParams.builder()
                    .sectionId("section_id")
                    .topicId("topic_id")
                    .topicDigestReleaseRequest(
                        TopicDigestReleaseRequest.builder()
                            .userId("user_01h1p2c3d4e5f6g7h8")
                            .tenantId("x")
                            .build()
                    )
                    .build()
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
                                WorkspacePreferenceTopicReplaceRequest.DefaultStatus.OPTED_IN
                            )
                            .name("Product Updates")
                            .addAllowedPreference(
                                WorkspacePreferenceTopicReplaceRequest.AllowedPreference
                                    .CHANNEL_PREFERENCES
                            )
                            .description("description")
                            .digest(
                                TopicDigestRequest.builder()
                                    .addSchedule(
                                        TopicDigestScheduleRequest.builder()
                                            .frequency(DigestFrequency.INSTANT)
                                            .dayOfMonth(1L)
                                            .dayOfWeek(DigestDayOfWeek.SUNDAY)
                                            .addDaysOfWeek(DigestDayOfWeek.SUNDAY)
                                            .disabled(true)
                                            .isDefault(true)
                                            .scheduleId("schedule_id")
                                            .time("time")
                                            .timezone("timezone")
                                            .build()
                                    )
                                    .templateId("template_id")
                                    .audienceId("audience_id")
                                    .addCategory(
                                        TopicDigestCategory.builder()
                                            .categoryKey("category_key")
                                            .limit(1L)
                                            .retain(TopicDigestCategory.Retain.FIRST)
                                            .sortKey("sort_key")
                                            .build()
                                    )
                                    .triggerEmpty(true)
                                    .build()
                            )
                            .includeUnsubscribeHeader(true)
                            .addRoutingOption(ChannelClassification.EMAIL)
                            .addRoutingOption(ChannelClassification.INBOX)
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

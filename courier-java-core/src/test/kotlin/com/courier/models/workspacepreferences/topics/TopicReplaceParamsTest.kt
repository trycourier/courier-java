// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences.topics

import com.courier.core.JsonValue
import com.courier.models.ChannelClassification
import com.courier.models.digests.DigestDayOfWeek
import com.courier.models.digests.DigestFrequency
import com.courier.models.workspacepreferences.TopicDigestCategory
import com.courier.models.workspacepreferences.TopicDigestRequest
import com.courier.models.workspacepreferences.TopicDigestScheduleRequest
import com.courier.models.workspacepreferences.WorkspacePreferenceTopicReplaceRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopicReplaceParamsTest {

    @Test
    fun create() {
        TopicReplaceParams.builder()
            .sectionId("section_id")
            .topicId("topic_id")
            .workspacePreferenceTopicReplaceRequest(
                WorkspacePreferenceTopicReplaceRequest.builder()
                    .defaultStatus(WorkspacePreferenceTopicReplaceRequest.DefaultStatus.OPTED_IN)
                    .name("Product Updates")
                    .addAllowedPreference(
                        WorkspacePreferenceTopicReplaceRequest.AllowedPreference.CHANNEL_PREFERENCES
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
    }

    @Test
    fun pathParams() {
        val params =
            TopicReplaceParams.builder()
                .sectionId("section_id")
                .topicId("topic_id")
                .workspacePreferenceTopicReplaceRequest(
                    WorkspacePreferenceTopicReplaceRequest.builder()
                        .defaultStatus(
                            WorkspacePreferenceTopicReplaceRequest.DefaultStatus.OPTED_IN
                        )
                        .name("Product Updates")
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                WorkspacePreferenceTopicReplaceRequest.builder()
                    .defaultStatus(WorkspacePreferenceTopicReplaceRequest.DefaultStatus.OPTED_IN)
                    .name("Product Updates")
                    .addAllowedPreference(
                        WorkspacePreferenceTopicReplaceRequest.AllowedPreference.CHANNEL_PREFERENCES
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TopicReplaceParams.builder()
                .sectionId("section_id")
                .topicId("topic_id")
                .workspacePreferenceTopicReplaceRequest(
                    WorkspacePreferenceTopicReplaceRequest.builder()
                        .defaultStatus(
                            WorkspacePreferenceTopicReplaceRequest.DefaultStatus.OPTED_IN
                        )
                        .name("Product Updates")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                WorkspacePreferenceTopicReplaceRequest.builder()
                    .defaultStatus(WorkspacePreferenceTopicReplaceRequest.DefaultStatus.OPTED_IN)
                    .name("Product Updates")
                    .build()
            )
    }
}

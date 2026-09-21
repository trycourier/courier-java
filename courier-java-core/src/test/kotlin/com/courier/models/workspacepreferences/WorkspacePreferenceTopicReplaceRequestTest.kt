// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.courier.models.digests.DigestDayOfWeek
import com.courier.models.digests.DigestFrequency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspacePreferenceTopicReplaceRequestTest {

    @Test
    fun create() {
        val workspacePreferenceTopicReplaceRequest =
            WorkspacePreferenceTopicReplaceRequest.builder()
                .defaultStatus(WorkspacePreferenceTopicReplaceRequest.DefaultStatus.OPTED_OUT)
                .name("name")
                .addAllowedPreference(
                    WorkspacePreferenceTopicReplaceRequest.AllowedPreference.SNOOZE
                )
                .description("description")
                .digest(
                    TopicDigestRequest.builder()
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
                        .triggerEmpty(true)
                        .build()
                )
                .includeUnsubscribeHeader(true)
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .topicData(
                    WorkspacePreferenceTopicReplaceRequest.TopicData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(workspacePreferenceTopicReplaceRequest.defaultStatus())
            .isEqualTo(WorkspacePreferenceTopicReplaceRequest.DefaultStatus.OPTED_OUT)
        assertThat(workspacePreferenceTopicReplaceRequest.name()).isEqualTo("name")
        assertThat(workspacePreferenceTopicReplaceRequest.allowedPreferences().getOrNull())
            .containsExactly(WorkspacePreferenceTopicReplaceRequest.AllowedPreference.SNOOZE)
        assertThat(workspacePreferenceTopicReplaceRequest.description()).contains("description")
        assertThat(workspacePreferenceTopicReplaceRequest.digest())
            .contains(
                TopicDigestRequest.builder()
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
                    .triggerEmpty(true)
                    .build()
            )
        assertThat(workspacePreferenceTopicReplaceRequest.includeUnsubscribeHeader()).contains(true)
        assertThat(workspacePreferenceTopicReplaceRequest.routingOptions().getOrNull())
            .containsExactly(ChannelClassification.DIRECT_MESSAGE)
        assertThat(workspacePreferenceTopicReplaceRequest.topicData())
            .contains(
                WorkspacePreferenceTopicReplaceRequest.TopicData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workspacePreferenceTopicReplaceRequest =
            WorkspacePreferenceTopicReplaceRequest.builder()
                .defaultStatus(WorkspacePreferenceTopicReplaceRequest.DefaultStatus.OPTED_OUT)
                .name("name")
                .addAllowedPreference(
                    WorkspacePreferenceTopicReplaceRequest.AllowedPreference.SNOOZE
                )
                .description("description")
                .digest(
                    TopicDigestRequest.builder()
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
                        .triggerEmpty(true)
                        .build()
                )
                .includeUnsubscribeHeader(true)
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .topicData(
                    WorkspacePreferenceTopicReplaceRequest.TopicData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedWorkspacePreferenceTopicReplaceRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workspacePreferenceTopicReplaceRequest),
                jacksonTypeRef<WorkspacePreferenceTopicReplaceRequest>(),
            )

        assertThat(roundtrippedWorkspacePreferenceTopicReplaceRequest)
            .isEqualTo(workspacePreferenceTopicReplaceRequest)
    }
}

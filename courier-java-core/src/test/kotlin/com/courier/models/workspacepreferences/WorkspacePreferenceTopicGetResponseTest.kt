// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.courier.models.digests.DigestDayOfWeek
import com.courier.models.digests.DigestFrequency
import com.courier.models.digests.TopicDigestScheduleResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspacePreferenceTopicGetResponseTest {

    @Test
    fun create() {
        val workspacePreferenceTopicGetResponse =
            WorkspacePreferenceTopicGetResponse.builder()
                .id("id")
                .addAllowedPreference(WorkspacePreferenceTopicGetResponse.AllowedPreference.SNOOZE)
                .created("created")
                .defaultStatus(WorkspacePreferenceTopicGetResponse.DefaultStatus.OPTED_OUT)
                .includeUnsubscribeHeader(true)
                .name("name")
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .topicData(
                    WorkspacePreferenceTopicGetResponse.TopicData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .updated("updated")
                .creator("creator")
                .description("description")
                .digest(
                    TopicDigestResponse.builder()
                        .addCategory(
                            TopicDigestCategory.builder()
                                .categoryKey("category_key")
                                .limit(1L)
                                .retain(TopicDigestCategory.Retain.FIRST)
                                .sortKey("sort_key")
                                .build()
                        )
                        .addSchedule(
                            TopicDigestScheduleResponse.builder()
                                .scheduleId("schedule_id")
                                .created("created")
                                .dayOfMonth(0L)
                                .dayOfWeek(DigestDayOfWeek.SUNDAY)
                                .addDaysOfWeek(DigestDayOfWeek.SUNDAY)
                                .disabled(true)
                                .frequency(DigestFrequency.INSTANT)
                                .isDefault(true)
                                .time("time")
                                .timezone("timezone")
                                .updated("updated")
                                .build()
                        )
                        .templateId("template_id")
                        .audienceId("audience_id")
                        .created("created")
                        .triggerEmpty(true)
                        .updated("updated")
                        .build()
                )
                .updater("updater")
                .build()

        assertThat(workspacePreferenceTopicGetResponse.id()).isEqualTo("id")
        assertThat(workspacePreferenceTopicGetResponse.allowedPreferences())
            .containsExactly(WorkspacePreferenceTopicGetResponse.AllowedPreference.SNOOZE)
        assertThat(workspacePreferenceTopicGetResponse.created()).isEqualTo("created")
        assertThat(workspacePreferenceTopicGetResponse.defaultStatus())
            .isEqualTo(WorkspacePreferenceTopicGetResponse.DefaultStatus.OPTED_OUT)
        assertThat(workspacePreferenceTopicGetResponse.includeUnsubscribeHeader()).isEqualTo(true)
        assertThat(workspacePreferenceTopicGetResponse.name()).isEqualTo("name")
        assertThat(workspacePreferenceTopicGetResponse.routingOptions())
            .containsExactly(ChannelClassification.DIRECT_MESSAGE)
        assertThat(workspacePreferenceTopicGetResponse.topicData())
            .isEqualTo(
                WorkspacePreferenceTopicGetResponse.TopicData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(workspacePreferenceTopicGetResponse.updated()).isEqualTo("updated")
        assertThat(workspacePreferenceTopicGetResponse.creator()).contains("creator")
        assertThat(workspacePreferenceTopicGetResponse.description()).contains("description")
        assertThat(workspacePreferenceTopicGetResponse.digest())
            .contains(
                TopicDigestResponse.builder()
                    .addCategory(
                        TopicDigestCategory.builder()
                            .categoryKey("category_key")
                            .limit(1L)
                            .retain(TopicDigestCategory.Retain.FIRST)
                            .sortKey("sort_key")
                            .build()
                    )
                    .addSchedule(
                        TopicDigestScheduleResponse.builder()
                            .scheduleId("schedule_id")
                            .created("created")
                            .dayOfMonth(0L)
                            .dayOfWeek(DigestDayOfWeek.SUNDAY)
                            .addDaysOfWeek(DigestDayOfWeek.SUNDAY)
                            .disabled(true)
                            .frequency(DigestFrequency.INSTANT)
                            .isDefault(true)
                            .time("time")
                            .timezone("timezone")
                            .updated("updated")
                            .build()
                    )
                    .templateId("template_id")
                    .audienceId("audience_id")
                    .created("created")
                    .triggerEmpty(true)
                    .updated("updated")
                    .build()
            )
        assertThat(workspacePreferenceTopicGetResponse.updater()).contains("updater")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workspacePreferenceTopicGetResponse =
            WorkspacePreferenceTopicGetResponse.builder()
                .id("id")
                .addAllowedPreference(WorkspacePreferenceTopicGetResponse.AllowedPreference.SNOOZE)
                .created("created")
                .defaultStatus(WorkspacePreferenceTopicGetResponse.DefaultStatus.OPTED_OUT)
                .includeUnsubscribeHeader(true)
                .name("name")
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .topicData(
                    WorkspacePreferenceTopicGetResponse.TopicData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .updated("updated")
                .creator("creator")
                .description("description")
                .digest(
                    TopicDigestResponse.builder()
                        .addCategory(
                            TopicDigestCategory.builder()
                                .categoryKey("category_key")
                                .limit(1L)
                                .retain(TopicDigestCategory.Retain.FIRST)
                                .sortKey("sort_key")
                                .build()
                        )
                        .addSchedule(
                            TopicDigestScheduleResponse.builder()
                                .scheduleId("schedule_id")
                                .created("created")
                                .dayOfMonth(0L)
                                .dayOfWeek(DigestDayOfWeek.SUNDAY)
                                .addDaysOfWeek(DigestDayOfWeek.SUNDAY)
                                .disabled(true)
                                .frequency(DigestFrequency.INSTANT)
                                .isDefault(true)
                                .time("time")
                                .timezone("timezone")
                                .updated("updated")
                                .build()
                        )
                        .templateId("template_id")
                        .audienceId("audience_id")
                        .created("created")
                        .triggerEmpty(true)
                        .updated("updated")
                        .build()
                )
                .updater("updater")
                .build()

        val roundtrippedWorkspacePreferenceTopicGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workspacePreferenceTopicGetResponse),
                jacksonTypeRef<WorkspacePreferenceTopicGetResponse>(),
            )

        assertThat(roundtrippedWorkspacePreferenceTopicGetResponse)
            .isEqualTo(workspacePreferenceTopicGetResponse)
    }
}

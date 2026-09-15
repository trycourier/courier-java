// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.jsonMapper
import com.courier.models.digests.DigestDayOfWeek
import com.courier.models.digests.DigestFrequency
import com.courier.models.digests.TopicDigestScheduleResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopicDigestResponseTest {

    @Test
    fun create() {
        val topicDigestResponse =
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

        assertThat(topicDigestResponse.categories())
            .containsExactly(
                TopicDigestCategory.builder()
                    .categoryKey("category_key")
                    .limit(1L)
                    .retain(TopicDigestCategory.Retain.FIRST)
                    .sortKey("sort_key")
                    .build()
            )
        assertThat(topicDigestResponse.schedules())
            .containsExactly(
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
        assertThat(topicDigestResponse.templateId()).isEqualTo("template_id")
        assertThat(topicDigestResponse.audienceId()).contains("audience_id")
        assertThat(topicDigestResponse.created()).contains("created")
        assertThat(topicDigestResponse.triggerEmpty()).contains(true)
        assertThat(topicDigestResponse.updated()).contains("updated")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val topicDigestResponse =
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

        val roundtrippedTopicDigestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(topicDigestResponse),
                jacksonTypeRef<TopicDigestResponse>(),
            )

        assertThat(roundtrippedTopicDigestResponse).isEqualTo(topicDigestResponse)
    }
}

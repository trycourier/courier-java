// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.jsonMapper
import com.courier.models.digests.DigestDayOfWeek
import com.courier.models.digests.DigestFrequency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopicDigestRequestTest {

    @Test
    fun create() {
        val topicDigestRequest =
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

        assertThat(topicDigestRequest.templateId()).isEqualTo("template_id")
        assertThat(topicDigestRequest.audienceId()).contains("audience_id")
        assertThat(topicDigestRequest.categories().getOrNull())
            .containsExactly(
                TopicDigestCategory.builder()
                    .categoryKey("category_key")
                    .limit(1L)
                    .retain(TopicDigestCategory.Retain.FIRST)
                    .sortKey("sort_key")
                    .build()
            )
        assertThat(topicDigestRequest.schedules().getOrNull())
            .containsExactly(
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
        assertThat(topicDigestRequest.triggerEmpty()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val topicDigestRequest =
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

        val roundtrippedTopicDigestRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(topicDigestRequest),
                jacksonTypeRef<TopicDigestRequest>(),
            )

        assertThat(roundtrippedTopicDigestRequest).isEqualTo(topicDigestRequest)
    }
}

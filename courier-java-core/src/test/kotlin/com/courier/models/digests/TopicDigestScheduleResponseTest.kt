// File generated from our OpenAPI spec by Stainless.

package com.courier.models.digests

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopicDigestScheduleResponseTest {

    @Test
    fun create() {
        val topicDigestScheduleResponse =
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

        assertThat(topicDigestScheduleResponse.scheduleId()).isEqualTo("schedule_id")
        assertThat(topicDigestScheduleResponse.created()).contains("created")
        assertThat(topicDigestScheduleResponse.dayOfMonth()).contains(0L)
        assertThat(topicDigestScheduleResponse.dayOfWeek()).contains(DigestDayOfWeek.SUNDAY)
        assertThat(topicDigestScheduleResponse.daysOfWeek().getOrNull())
            .containsExactly(DigestDayOfWeek.SUNDAY)
        assertThat(topicDigestScheduleResponse.disabled()).contains(true)
        assertThat(topicDigestScheduleResponse.frequency()).contains(DigestFrequency.INSTANT)
        assertThat(topicDigestScheduleResponse.isDefault()).contains(true)
        assertThat(topicDigestScheduleResponse.time()).contains("time")
        assertThat(topicDigestScheduleResponse.timezone()).contains("timezone")
        assertThat(topicDigestScheduleResponse.updated()).contains("updated")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val topicDigestScheduleResponse =
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

        val roundtrippedTopicDigestScheduleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(topicDigestScheduleResponse),
                jacksonTypeRef<TopicDigestScheduleResponse>(),
            )

        assertThat(roundtrippedTopicDigestScheduleResponse).isEqualTo(topicDigestScheduleResponse)
    }
}

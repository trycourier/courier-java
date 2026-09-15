// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.jsonMapper
import com.courier.models.digests.DigestDayOfWeek
import com.courier.models.digests.DigestFrequency
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopicDigestScheduleRequestTest {

    @Test
    fun create() {
        val topicDigestScheduleRequest =
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

        assertThat(topicDigestScheduleRequest.frequency()).isEqualTo(DigestFrequency.INSTANT)
        assertThat(topicDigestScheduleRequest.dayOfMonth()).contains(1L)
        assertThat(topicDigestScheduleRequest.dayOfWeek()).contains(DigestDayOfWeek.SUNDAY)
        assertThat(topicDigestScheduleRequest.daysOfWeek().getOrNull())
            .containsExactly(DigestDayOfWeek.SUNDAY)
        assertThat(topicDigestScheduleRequest.disabled()).contains(true)
        assertThat(topicDigestScheduleRequest.isDefault()).contains(true)
        assertThat(topicDigestScheduleRequest.scheduleId()).contains("schedule_id")
        assertThat(topicDigestScheduleRequest.time()).contains("time")
        assertThat(topicDigestScheduleRequest.timezone()).contains("timezone")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val topicDigestScheduleRequest =
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

        val roundtrippedTopicDigestScheduleRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(topicDigestScheduleRequest),
                jacksonTypeRef<TopicDigestScheduleRequest>(),
            )

        assertThat(roundtrippedTopicDigestScheduleRequest).isEqualTo(topicDigestScheduleRequest)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences.topics

import com.courier.core.JsonValue
import com.courier.core.http.Headers
import com.courier.models.ChannelClassification
import com.courier.models.digests.DigestDayOfWeek
import com.courier.models.digests.DigestFrequency
import com.courier.models.workspacepreferences.TopicDigestCategory
import com.courier.models.workspacepreferences.TopicDigestScheduleRequest
import com.courier.models.workspacepreferences.WorkspacePreferenceTopicCreateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopicCreateParamsTest {

    @Test
    fun create() {
        TopicCreateParams.builder()
            .sectionId("section_id")
            .idempotencyKey("order-ORD-456-user-123")
            .xIdempotencyExpiration("1785312000")
            .workspacePreferenceTopicCreateRequest(
                WorkspacePreferenceTopicCreateRequest.builder()
                    .defaultStatus(WorkspacePreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT)
                    .name("Marketing")
                    .addAllowedPreference(
                        WorkspacePreferenceTopicCreateRequest.AllowedPreference.SNOOZE
                    )
                    .description("description")
                    .digest(
                        WorkspacePreferenceTopicCreateRequest.Digest.builder()
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
    }

    @Test
    fun pathParams() {
        val params =
            TopicCreateParams.builder()
                .sectionId("section_id")
                .workspacePreferenceTopicCreateRequest(
                    WorkspacePreferenceTopicCreateRequest.builder()
                        .defaultStatus(
                            WorkspacePreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT
                        )
                        .name("Marketing")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("section_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
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
                            WorkspacePreferenceTopicCreateRequest.Digest.builder()
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("Idempotency-Key", "order-ORD-456-user-123")
                    .put("x-idempotency-expiration", "1785312000")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            TopicCreateParams.builder()
                .sectionId("section_id")
                .workspacePreferenceTopicCreateRequest(
                    WorkspacePreferenceTopicCreateRequest.builder()
                        .defaultStatus(
                            WorkspacePreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT
                        )
                        .name("Marketing")
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
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
                            WorkspacePreferenceTopicCreateRequest.Digest.builder()
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                WorkspacePreferenceTopicCreateRequest.builder()
                    .defaultStatus(WorkspacePreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT)
                    .name("Marketing")
                    .addAllowedPreference(
                        WorkspacePreferenceTopicCreateRequest.AllowedPreference.SNOOZE
                    )
                    .description("description")
                    .digest(
                        WorkspacePreferenceTopicCreateRequest.Digest.builder()
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TopicCreateParams.builder()
                .sectionId("section_id")
                .workspacePreferenceTopicCreateRequest(
                    WorkspacePreferenceTopicCreateRequest.builder()
                        .defaultStatus(
                            WorkspacePreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT
                        )
                        .name("Marketing")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                WorkspacePreferenceTopicCreateRequest.builder()
                    .defaultStatus(WorkspacePreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT)
                    .name("Marketing")
                    .build()
            )
    }
}

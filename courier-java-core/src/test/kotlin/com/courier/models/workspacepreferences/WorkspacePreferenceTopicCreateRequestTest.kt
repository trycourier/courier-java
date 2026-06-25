// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspacePreferenceTopicCreateRequestTest {

    @Test
    fun create() {
        val workspacePreferenceTopicCreateRequest =
            WorkspacePreferenceTopicCreateRequest.builder()
                .defaultStatus(WorkspacePreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT)
                .name("name")
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

        assertThat(workspacePreferenceTopicCreateRequest.defaultStatus())
            .isEqualTo(WorkspacePreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT)
        assertThat(workspacePreferenceTopicCreateRequest.name()).isEqualTo("name")
        assertThat(workspacePreferenceTopicCreateRequest.allowedPreferences().getOrNull())
            .containsExactly(WorkspacePreferenceTopicCreateRequest.AllowedPreference.SNOOZE)
        assertThat(workspacePreferenceTopicCreateRequest.includeUnsubscribeHeader()).contains(true)
        assertThat(workspacePreferenceTopicCreateRequest.routingOptions().getOrNull())
            .containsExactly(ChannelClassification.DIRECT_MESSAGE)
        assertThat(workspacePreferenceTopicCreateRequest.topicData())
            .contains(
                WorkspacePreferenceTopicCreateRequest.TopicData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workspacePreferenceTopicCreateRequest =
            WorkspacePreferenceTopicCreateRequest.builder()
                .defaultStatus(WorkspacePreferenceTopicCreateRequest.DefaultStatus.OPTED_OUT)
                .name("name")
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

        val roundtrippedWorkspacePreferenceTopicCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workspacePreferenceTopicCreateRequest),
                jacksonTypeRef<WorkspacePreferenceTopicCreateRequest>(),
            )

        assertThat(roundtrippedWorkspacePreferenceTopicCreateRequest)
            .isEqualTo(workspacePreferenceTopicCreateRequest)
    }
}

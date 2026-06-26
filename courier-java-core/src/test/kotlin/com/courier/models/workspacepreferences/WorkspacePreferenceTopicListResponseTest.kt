// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspacePreferenceTopicListResponseTest {

    @Test
    fun create() {
        val workspacePreferenceTopicListResponse =
            WorkspacePreferenceTopicListResponse.builder()
                .addResult(
                    WorkspacePreferenceTopicGetResponse.builder()
                        .id("id")
                        .addAllowedPreference(
                            WorkspacePreferenceTopicGetResponse.AllowedPreference.SNOOZE
                        )
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
                        .updater("updater")
                        .build()
                )
                .build()

        assertThat(workspacePreferenceTopicListResponse.results())
            .containsExactly(
                WorkspacePreferenceTopicGetResponse.builder()
                    .id("id")
                    .addAllowedPreference(
                        WorkspacePreferenceTopicGetResponse.AllowedPreference.SNOOZE
                    )
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
                    .updater("updater")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workspacePreferenceTopicListResponse =
            WorkspacePreferenceTopicListResponse.builder()
                .addResult(
                    WorkspacePreferenceTopicGetResponse.builder()
                        .id("id")
                        .addAllowedPreference(
                            WorkspacePreferenceTopicGetResponse.AllowedPreference.SNOOZE
                        )
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
                        .updater("updater")
                        .build()
                )
                .build()

        val roundtrippedWorkspacePreferenceTopicListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workspacePreferenceTopicListResponse),
                jacksonTypeRef<WorkspacePreferenceTopicListResponse>(),
            )

        assertThat(roundtrippedWorkspacePreferenceTopicListResponse)
            .isEqualTo(workspacePreferenceTopicListResponse)
    }
}

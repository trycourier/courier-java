// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspacePreferenceListResponseTest {

    @Test
    fun create() {
        val workspacePreferenceListResponse =
            WorkspacePreferenceListResponse.builder()
                .addResult(
                    WorkspacePreferenceGetResponse.builder()
                        .id("id")
                        .created("created")
                        .hasCustomRouting(true)
                        .name("name")
                        .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                        .addTopic(
                            WorkspacePreferenceTopicGetResponse.builder()
                                .id("id")
                                .addAllowedPreference(
                                    WorkspacePreferenceTopicGetResponse.AllowedPreference.SNOOZE
                                )
                                .created("created")
                                .defaultStatus(
                                    WorkspacePreferenceTopicGetResponse.DefaultStatus.OPTED_OUT
                                )
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
                                .updater("updater")
                                .build()
                        )
                        .creator("creator")
                        .description("description")
                        .updated("updated")
                        .updater("updater")
                        .build()
                )
                .build()

        assertThat(workspacePreferenceListResponse.results())
            .containsExactly(
                WorkspacePreferenceGetResponse.builder()
                    .id("id")
                    .created("created")
                    .hasCustomRouting(true)
                    .name("name")
                    .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                    .addTopic(
                        WorkspacePreferenceTopicGetResponse.builder()
                            .id("id")
                            .addAllowedPreference(
                                WorkspacePreferenceTopicGetResponse.AllowedPreference.SNOOZE
                            )
                            .created("created")
                            .defaultStatus(
                                WorkspacePreferenceTopicGetResponse.DefaultStatus.OPTED_OUT
                            )
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
                            .updater("updater")
                            .build()
                    )
                    .creator("creator")
                    .description("description")
                    .updated("updated")
                    .updater("updater")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workspacePreferenceListResponse =
            WorkspacePreferenceListResponse.builder()
                .addResult(
                    WorkspacePreferenceGetResponse.builder()
                        .id("id")
                        .created("created")
                        .hasCustomRouting(true)
                        .name("name")
                        .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                        .addTopic(
                            WorkspacePreferenceTopicGetResponse.builder()
                                .id("id")
                                .addAllowedPreference(
                                    WorkspacePreferenceTopicGetResponse.AllowedPreference.SNOOZE
                                )
                                .created("created")
                                .defaultStatus(
                                    WorkspacePreferenceTopicGetResponse.DefaultStatus.OPTED_OUT
                                )
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
                                .updater("updater")
                                .build()
                        )
                        .creator("creator")
                        .description("description")
                        .updated("updated")
                        .updater("updater")
                        .build()
                )
                .build()

        val roundtrippedWorkspacePreferenceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workspacePreferenceListResponse),
                jacksonTypeRef<WorkspacePreferenceListResponse>(),
            )

        assertThat(roundtrippedWorkspacePreferenceListResponse)
            .isEqualTo(workspacePreferenceListResponse)
    }
}

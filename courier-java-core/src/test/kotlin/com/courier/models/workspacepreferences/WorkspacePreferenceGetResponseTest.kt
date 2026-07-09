// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspacePreferenceGetResponseTest {

    @Test
    fun create() {
        val workspacePreferenceGetResponse =
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
                        .updater("updater")
                        .build()
                )
                .creator("creator")
                .description("description")
                .updated("updated")
                .updater("updater")
                .build()

        assertThat(workspacePreferenceGetResponse.id()).isEqualTo("id")
        assertThat(workspacePreferenceGetResponse.created()).isEqualTo("created")
        assertThat(workspacePreferenceGetResponse.hasCustomRouting()).isEqualTo(true)
        assertThat(workspacePreferenceGetResponse.name()).isEqualTo("name")
        assertThat(workspacePreferenceGetResponse.routingOptions())
            .containsExactly(ChannelClassification.DIRECT_MESSAGE)
        assertThat(workspacePreferenceGetResponse.topics())
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
                    .description("description")
                    .updater("updater")
                    .build()
            )
        assertThat(workspacePreferenceGetResponse.creator()).contains("creator")
        assertThat(workspacePreferenceGetResponse.description()).contains("description")
        assertThat(workspacePreferenceGetResponse.updated()).contains("updated")
        assertThat(workspacePreferenceGetResponse.updater()).contains("updater")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workspacePreferenceGetResponse =
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
                        .updater("updater")
                        .build()
                )
                .creator("creator")
                .description("description")
                .updated("updated")
                .updater("updater")
                .build()

        val roundtrippedWorkspacePreferenceGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workspacePreferenceGetResponse),
                jacksonTypeRef<WorkspacePreferenceGetResponse>(),
            )

        assertThat(roundtrippedWorkspacePreferenceGetResponse)
            .isEqualTo(workspacePreferenceGetResponse)
    }
}

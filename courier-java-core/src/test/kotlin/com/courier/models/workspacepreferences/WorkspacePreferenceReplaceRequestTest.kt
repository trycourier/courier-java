// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspacePreferenceReplaceRequestTest {

    @Test
    fun create() {
        val workspacePreferenceReplaceRequest =
            WorkspacePreferenceReplaceRequest.builder()
                .name("name")
                .description("description")
                .hasCustomRouting(true)
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .build()

        assertThat(workspacePreferenceReplaceRequest.name()).isEqualTo("name")
        assertThat(workspacePreferenceReplaceRequest.description()).contains("description")
        assertThat(workspacePreferenceReplaceRequest.hasCustomRouting()).contains(true)
        assertThat(workspacePreferenceReplaceRequest.routingOptions().getOrNull())
            .containsExactly(ChannelClassification.DIRECT_MESSAGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workspacePreferenceReplaceRequest =
            WorkspacePreferenceReplaceRequest.builder()
                .name("name")
                .description("description")
                .hasCustomRouting(true)
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .build()

        val roundtrippedWorkspacePreferenceReplaceRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workspacePreferenceReplaceRequest),
                jacksonTypeRef<WorkspacePreferenceReplaceRequest>(),
            )

        assertThat(roundtrippedWorkspacePreferenceReplaceRequest)
            .isEqualTo(workspacePreferenceReplaceRequest)
    }
}

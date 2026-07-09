// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspacePreferenceCreateRequestTest {

    @Test
    fun create() {
        val workspacePreferenceCreateRequest =
            WorkspacePreferenceCreateRequest.builder()
                .name("name")
                .description("description")
                .hasCustomRouting(true)
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .build()

        assertThat(workspacePreferenceCreateRequest.name()).isEqualTo("name")
        assertThat(workspacePreferenceCreateRequest.description()).contains("description")
        assertThat(workspacePreferenceCreateRequest.hasCustomRouting()).contains(true)
        assertThat(workspacePreferenceCreateRequest.routingOptions().getOrNull())
            .containsExactly(ChannelClassification.DIRECT_MESSAGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workspacePreferenceCreateRequest =
            WorkspacePreferenceCreateRequest.builder()
                .name("name")
                .description("description")
                .hasCustomRouting(true)
                .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                .build()

        val roundtrippedWorkspacePreferenceCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workspacePreferenceCreateRequest),
                jacksonTypeRef<WorkspacePreferenceCreateRequest>(),
            )

        assertThat(roundtrippedWorkspacePreferenceCreateRequest)
            .isEqualTo(workspacePreferenceCreateRequest)
    }
}

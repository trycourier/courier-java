// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.models.ChannelClassification
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspacePreferenceCreateParamsTest {

    @Test
    fun create() {
        WorkspacePreferenceCreateParams.builder()
            .workspacePreferenceCreateRequest(
                WorkspacePreferenceCreateRequest.builder()
                    .name("Account Notifications")
                    .description("description")
                    .hasCustomRouting(true)
                    .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            WorkspacePreferenceCreateParams.builder()
                .workspacePreferenceCreateRequest(
                    WorkspacePreferenceCreateRequest.builder()
                        .name("Account Notifications")
                        .description("description")
                        .hasCustomRouting(true)
                        .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                WorkspacePreferenceCreateRequest.builder()
                    .name("Account Notifications")
                    .description("description")
                    .hasCustomRouting(true)
                    .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WorkspacePreferenceCreateParams.builder()
                .workspacePreferenceCreateRequest(
                    WorkspacePreferenceCreateRequest.builder().name("Account Notifications").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                WorkspacePreferenceCreateRequest.builder().name("Account Notifications").build()
            )
    }
}

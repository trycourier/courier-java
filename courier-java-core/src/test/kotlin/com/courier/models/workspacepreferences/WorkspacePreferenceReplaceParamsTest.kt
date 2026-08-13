// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.models.ChannelClassification
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspacePreferenceReplaceParamsTest {

    @Test
    fun create() {
        WorkspacePreferenceReplaceParams.builder()
            .sectionId("section_id")
            .workspacePreferenceReplaceRequest(
                WorkspacePreferenceReplaceRequest.builder()
                    .name("Account Notifications")
                    .description("description")
                    .hasCustomRouting(true)
                    .addRoutingOption(ChannelClassification.EMAIL)
                    .addRoutingOption(ChannelClassification.PUSH)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WorkspacePreferenceReplaceParams.builder()
                .sectionId("section_id")
                .workspacePreferenceReplaceRequest(
                    WorkspacePreferenceReplaceRequest.builder()
                        .name("Account Notifications")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("section_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WorkspacePreferenceReplaceParams.builder()
                .sectionId("section_id")
                .workspacePreferenceReplaceRequest(
                    WorkspacePreferenceReplaceRequest.builder()
                        .name("Account Notifications")
                        .description("description")
                        .hasCustomRouting(true)
                        .addRoutingOption(ChannelClassification.EMAIL)
                        .addRoutingOption(ChannelClassification.PUSH)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                WorkspacePreferenceReplaceRequest.builder()
                    .name("Account Notifications")
                    .description("description")
                    .hasCustomRouting(true)
                    .addRoutingOption(ChannelClassification.EMAIL)
                    .addRoutingOption(ChannelClassification.PUSH)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WorkspacePreferenceReplaceParams.builder()
                .sectionId("section_id")
                .workspacePreferenceReplaceRequest(
                    WorkspacePreferenceReplaceRequest.builder()
                        .name("Account Notifications")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                WorkspacePreferenceReplaceRequest.builder().name("Account Notifications").build()
            )
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.ChannelClassification
import com.courier.models.workspacepreferences.PublishPreferencesRequest
import com.courier.models.workspacepreferences.WorkspacePreferenceCreateParams
import com.courier.models.workspacepreferences.WorkspacePreferenceCreateRequest
import com.courier.models.workspacepreferences.WorkspacePreferencePublishParams
import com.courier.models.workspacepreferences.WorkspacePreferenceReplaceParams
import com.courier.models.workspacepreferences.WorkspacePreferenceReplaceRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WorkspacePreferenceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val workspacePreferenceService = client.workspacePreferences()

        val workspacePreferenceGetResponse =
            workspacePreferenceService.create(
                WorkspacePreferenceCreateParams.builder()
                    .idempotencyKey("order-ORD-456-user-123")
                    .xIdempotencyExpiration("1785312000")
                    .workspacePreferenceCreateRequest(
                        WorkspacePreferenceCreateRequest.builder()
                            .name("Account Notifications")
                            .description("description")
                            .hasCustomRouting(true)
                            .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                            .build()
                    )
                    .build()
            )

        workspacePreferenceGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val workspacePreferenceService = client.workspacePreferences()

        val workspacePreferenceGetResponse = workspacePreferenceService.retrieve("section_id")

        workspacePreferenceGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val workspacePreferenceService = client.workspacePreferences()

        val workspacePreferenceListResponse = workspacePreferenceService.list()

        workspacePreferenceListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val workspacePreferenceService = client.workspacePreferences()

        workspacePreferenceService.archive("section_id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun publish() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val workspacePreferenceService = client.workspacePreferences()

        val publishPreferencesResponse =
            workspacePreferenceService.publish(
                WorkspacePreferencePublishParams.builder()
                    .idempotencyKey("order-ORD-456-user-123")
                    .xIdempotencyExpiration("1785312000")
                    .publishPreferencesRequest(
                        PublishPreferencesRequest.builder()
                            .brandId("bnd_01kx4mrd0pfzw8wt7pn7p2fzag")
                            .description("Choose what you hear from us about.")
                            .heading("Notification Preferences")
                            .build()
                    )
                    .build()
            )

        publishPreferencesResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val workspacePreferenceService = client.workspacePreferences()

        val workspacePreferenceGetResponse =
            workspacePreferenceService.replace(
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
            )

        workspacePreferenceGetResponse.validate()
    }
}

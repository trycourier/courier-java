// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.ChannelClassification
import com.courier.models.workspacepreferences.WorkspacePreferenceCreateRequest
import com.courier.models.workspacepreferences.WorkspacePreferenceReplaceParams
import com.courier.models.workspacepreferences.WorkspacePreferenceReplaceRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WorkspacePreferenceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val workspacePreferenceServiceAsync = client.workspacePreferences()

        val workspacePreferenceGetResponseFuture =
            workspacePreferenceServiceAsync.create(
                WorkspacePreferenceCreateRequest.builder()
                    .name("Account Notifications")
                    .hasCustomRouting(true)
                    .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                    .build()
            )

        val workspacePreferenceGetResponse = workspacePreferenceGetResponseFuture.get()
        workspacePreferenceGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val workspacePreferenceServiceAsync = client.workspacePreferences()

        val workspacePreferenceGetResponseFuture =
            workspacePreferenceServiceAsync.retrieve("section_id")

        val workspacePreferenceGetResponse = workspacePreferenceGetResponseFuture.get()
        workspacePreferenceGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val workspacePreferenceServiceAsync = client.workspacePreferences()

        val workspacePreferenceListResponseFuture = workspacePreferenceServiceAsync.list()

        val workspacePreferenceListResponse = workspacePreferenceListResponseFuture.get()
        workspacePreferenceListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val workspacePreferenceServiceAsync = client.workspacePreferences()

        val future = workspacePreferenceServiceAsync.archive("section_id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun publish() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val workspacePreferenceServiceAsync = client.workspacePreferences()

        val publishPreferencesResponseFuture = workspacePreferenceServiceAsync.publish()

        val publishPreferencesResponse = publishPreferencesResponseFuture.get()
        publishPreferencesResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val workspacePreferenceServiceAsync = client.workspacePreferences()

        val workspacePreferenceGetResponseFuture =
            workspacePreferenceServiceAsync.replace(
                WorkspacePreferenceReplaceParams.builder()
                    .sectionId("section_id")
                    .workspacePreferenceReplaceRequest(
                        WorkspacePreferenceReplaceRequest.builder()
                            .name("name")
                            .hasCustomRouting(true)
                            .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                            .build()
                    )
                    .build()
            )

        val workspacePreferenceGetResponse = workspacePreferenceGetResponseFuture.get()
        workspacePreferenceGetResponse.validate()
    }
}

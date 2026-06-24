// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.ChannelClassification
import com.courier.models.preferencesections.PreferenceSectionCreateRequest
import com.courier.models.preferencesections.PreferenceSectionReplaceParams
import com.courier.models.preferencesections.PreferenceSectionReplaceRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PreferenceSectionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val preferenceSectionServiceAsync = client.preferenceSections()

        val preferenceSectionGetResponseFuture =
            preferenceSectionServiceAsync.create(
                PreferenceSectionCreateRequest.builder()
                    .name("Account Notifications")
                    .hasCustomRouting(true)
                    .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                    .build()
            )

        val preferenceSectionGetResponse = preferenceSectionGetResponseFuture.get()
        preferenceSectionGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val preferenceSectionServiceAsync = client.preferenceSections()

        val preferenceSectionGetResponseFuture =
            preferenceSectionServiceAsync.retrieve("section_id")

        val preferenceSectionGetResponse = preferenceSectionGetResponseFuture.get()
        preferenceSectionGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val preferenceSectionServiceAsync = client.preferenceSections()

        val preferenceSectionListResponseFuture = preferenceSectionServiceAsync.list()

        val preferenceSectionListResponse = preferenceSectionListResponseFuture.get()
        preferenceSectionListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val preferenceSectionServiceAsync = client.preferenceSections()

        val future = preferenceSectionServiceAsync.archive("section_id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun publish() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val preferenceSectionServiceAsync = client.preferenceSections()

        val publishPreferencesResponseFuture = preferenceSectionServiceAsync.publish()

        val publishPreferencesResponse = publishPreferencesResponseFuture.get()
        publishPreferencesResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val preferenceSectionServiceAsync = client.preferenceSections()

        val preferenceSectionGetResponseFuture =
            preferenceSectionServiceAsync.replace(
                PreferenceSectionReplaceParams.builder()
                    .sectionId("section_id")
                    .preferenceSectionReplaceRequest(
                        PreferenceSectionReplaceRequest.builder()
                            .name("name")
                            .hasCustomRouting(true)
                            .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                            .build()
                    )
                    .build()
            )

        val preferenceSectionGetResponse = preferenceSectionGetResponseFuture.get()
        preferenceSectionGetResponse.validate()
    }
}

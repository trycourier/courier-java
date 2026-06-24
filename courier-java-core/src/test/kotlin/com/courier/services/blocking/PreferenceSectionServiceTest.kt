// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.ChannelClassification
import com.courier.models.preferencesections.PreferenceSectionCreateRequest
import com.courier.models.preferencesections.PreferenceSectionReplaceParams
import com.courier.models.preferencesections.PreferenceSectionReplaceRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PreferenceSectionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val preferenceSectionService = client.preferenceSections()

        val preferenceSectionGetResponse =
            preferenceSectionService.create(
                PreferenceSectionCreateRequest.builder()
                    .name("Account Notifications")
                    .hasCustomRouting(true)
                    .addRoutingOption(ChannelClassification.DIRECT_MESSAGE)
                    .build()
            )

        preferenceSectionGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val preferenceSectionService = client.preferenceSections()

        val preferenceSectionGetResponse = preferenceSectionService.retrieve("section_id")

        preferenceSectionGetResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val preferenceSectionService = client.preferenceSections()

        val preferenceSectionListResponse = preferenceSectionService.list()

        preferenceSectionListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val preferenceSectionService = client.preferenceSections()

        preferenceSectionService.archive("section_id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun publish() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val preferenceSectionService = client.preferenceSections()

        val publishPreferencesResponse = preferenceSectionService.publish()

        publishPreferencesResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val preferenceSectionService = client.preferenceSections()

        val preferenceSectionGetResponse =
            preferenceSectionService.replace(
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

        preferenceSectionGetResponse.validate()
    }
}

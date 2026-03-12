// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.notifications

import com.courier.client.okhttp.CourierOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DraftServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveContent() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val draftService = client.notifications().draft()

        val notificationGetContent = draftService.retrieveContent("id")

        notificationGetContent.validate()
    }
}

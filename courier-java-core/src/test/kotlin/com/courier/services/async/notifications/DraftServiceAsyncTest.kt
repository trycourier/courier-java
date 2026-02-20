// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.notifications

import com.courier.client.okhttp.CourierOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DraftServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveContent() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val draftServiceAsync = client.notifications().draft()

        val notificationGetContentFuture = draftServiceAsync.retrieveContent("id")

        val notificationGetContent = notificationGetContentFuture.get()
        notificationGetContent.validate()
    }
}

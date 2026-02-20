// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.notifications.NotificationListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NotificationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val notificationServiceAsync = client.notifications()

        val notificationsFuture =
            notificationServiceAsync.list(
                NotificationListParams.builder().cursor("cursor").notes(true).build()
            )

        val notifications = notificationsFuture.get()
        notifications.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveContent() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val notificationServiceAsync = client.notifications()

        val notificationGetContentFuture = notificationServiceAsync.retrieveContent("id")

        val notificationGetContent = notificationGetContentFuture.get()
        notificationGetContent.validate()
    }
}

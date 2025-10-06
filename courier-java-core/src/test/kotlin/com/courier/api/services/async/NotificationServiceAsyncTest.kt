// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClientAsync
import com.courier.api.models.notifications.NotificationListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NotificationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationServiceAsync = client.notifications()

        val notificationsFuture =
            notificationServiceAsync.list(
                NotificationListParams.builder().cursor("cursor").notes(true).build()
            )

        val notifications = notificationsFuture.get()
        notifications.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveContent() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationServiceAsync = client.notifications()

        val notificationContentFuture = notificationServiceAsync.retrieveContent("id")

        val notificationContent = notificationContentFuture.get()
        notificationContent.validate()
    }
}

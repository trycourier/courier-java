// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.notifications.NotificationListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NotificationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationService = client.notifications()

        val notifications =
            notificationService.list(
                NotificationListParams.builder().cursor("cursor").notes(true).build()
            )

        notifications.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveContent() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationService = client.notifications()

        val notificationGetContent = notificationService.retrieveContent("id")

        notificationGetContent.validate()
    }
}

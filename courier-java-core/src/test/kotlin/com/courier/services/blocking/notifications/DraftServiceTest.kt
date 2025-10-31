// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.notifications

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DraftServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveContent() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val draftService = client.notifications().draft()

        val notificationGetContent = draftService.retrieveContent("id")

        notificationGetContent.validate()
    }
}

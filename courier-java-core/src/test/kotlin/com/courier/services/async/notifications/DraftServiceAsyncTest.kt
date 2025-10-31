// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.notifications

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DraftServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveContent() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val draftServiceAsync = client.notifications().draft()

        val notificationGetContentFuture = draftServiceAsync.retrieveContent("id")

        val notificationGetContent = notificationGetContentFuture.get()
        notificationGetContent.validate()
    }
}

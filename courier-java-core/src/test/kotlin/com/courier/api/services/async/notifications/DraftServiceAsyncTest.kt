// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.notifications

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClientAsync
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

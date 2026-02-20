// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.client.okhttp.CourierOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RequestServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun archive() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val requestServiceAsync = client.requests()

        val future = requestServiceAsync.archive("request_id")

        val response = future.get()
    }
}

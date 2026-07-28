// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.inbox

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.core.JsonValue
import com.courier.models.inbox.messages.MessageRestoreParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.inbox().messages()

        val future = messageServiceAsync.delete("message_id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restore() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.inbox().messages()

        val future =
            messageServiceAsync.restore(
                MessageRestoreParams.builder()
                    .messageId("message_id")
                    .body(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        val response = future.get()
    }
}

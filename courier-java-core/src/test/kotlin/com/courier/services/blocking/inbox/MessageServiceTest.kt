// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.inbox

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.inbox.messages.MessageRestoreParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.inbox().messages()

        messageService.delete("message_id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restore() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.inbox().messages()

        messageService.restore(
            MessageRestoreParams.builder()
                .messageId("message_id")
                .body(JsonValue.from(mapOf<String, Any>()))
                .build()
        )
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.messages.MessageHistoryParams
import com.courier.models.messages.MessageListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val messageFuture = messageServiceAsync.retrieve("message_id")

        val message = messageFuture.get()
        message.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val messagesFuture =
            messageServiceAsync.list(
                MessageListParams.builder()
                    .archived(true)
                    .cursor("cursor")
                    .enqueuedAfter("enqueued_after")
                    .event("event")
                    .list("list")
                    .messageId("messageId")
                    .notification("notification")
                    .addProvider("string")
                    .recipient("recipient")
                    .addStatus("string")
                    .addTag("string")
                    .tags("tags")
                    .tenantId("tenant_id")
                    .traceId("traceId")
                    .build()
            )

        val messages = messagesFuture.get()
        messages.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancel() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val messageDetailsFuture = messageServiceAsync.cancel("message_id")

        val messageDetails = messageDetailsFuture.get()
        messageDetails.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun content() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val responseFuture = messageServiceAsync.content("message_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun history() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.history(
                MessageHistoryParams.builder().messageId("message_id").type("type").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}

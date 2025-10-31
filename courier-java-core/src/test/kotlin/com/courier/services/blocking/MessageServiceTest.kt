// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.messages.MessageHistoryParams
import com.courier.models.messages.MessageListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MessageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.messages()

        val message = messageService.retrieve("message_id")

        message.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.messages()

        val messages =
            messageService.list(
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

        messages.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancel() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.messages()

        val messageDetails = messageService.cancel("message_id")

        messageDetails.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun content() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.messages()

        val response = messageService.content("message_id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun history() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.messages()

        val response =
            messageService.history(
                MessageHistoryParams.builder().messageId("message_id").type("type").build()
            )

        response.validate()
    }
}

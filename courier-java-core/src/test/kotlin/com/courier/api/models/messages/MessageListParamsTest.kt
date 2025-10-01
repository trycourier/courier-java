// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.messages

import com.courier.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageListParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun queryParams() {
        val params =
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("archived", "true")
                    .put("cursor", "cursor")
                    .put("enqueued_after", "enqueued_after")
                    .put("event", "event")
                    .put("list", "list")
                    .put("messageId", "messageId")
                    .put("notification", "notification")
                    .put("provider", listOf("string").joinToString(","))
                    .put("recipient", "recipient")
                    .put("status", listOf("string").joinToString(","))
                    .put("tag", listOf("string").joinToString(","))
                    .put("tags", "tags")
                    .put("tenant_id", "tenant_id")
                    .put("traceId", "traceId")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MessageListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}

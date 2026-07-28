// File generated from our OpenAPI spec by Stainless.

package com.courier.models.inbox.messages

import com.courier.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageRestoreParamsTest {

    @Test
    fun create() {
        MessageRestoreParams.builder()
            .messageId("message_id")
            .body(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessageRestoreParams.builder()
                .messageId("message_id")
                .body(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("message_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MessageRestoreParams.builder()
                .messageId("message_id")
                .body(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}

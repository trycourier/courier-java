// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.lists

import com.courier.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListRestoreParamsTest {

    @Test
    fun create() {
        ListRestoreParams.builder()
            .listId("list_id")
            .body(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ListRestoreParams.builder()
                .listId("list_id")
                .body(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("list_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ListRestoreParams.builder()
                .listId("list_id")
                .body(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}

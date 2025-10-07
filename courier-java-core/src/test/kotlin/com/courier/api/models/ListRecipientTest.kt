// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListRecipientTest {

    @Test
    fun create() {
        val listRecipient =
            ListRecipient.builder()
                .data(
                    ListRecipient.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .listId("list_id")
                .build()

        assertThat(listRecipient.data())
            .contains(
                ListRecipient.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(listRecipient.listId()).contains("list_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listRecipient =
            ListRecipient.builder()
                .data(
                    ListRecipient.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .listId("list_id")
                .build()

        val roundtrippedListRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listRecipient),
                jacksonTypeRef<ListRecipient>(),
            )

        assertThat(roundtrippedListRecipient).isEqualTo(listRecipient)
    }
}

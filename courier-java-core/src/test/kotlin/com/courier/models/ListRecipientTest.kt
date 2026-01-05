// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
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
                .addFilter(
                    ListFilter.builder()
                        .operator(ListFilter.Operator.MEMBER_OF)
                        .path(ListFilter.Path.ACCOUNT_ID)
                        .value("value")
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
        assertThat(listRecipient.filters().getOrNull())
            .containsExactly(
                ListFilter.builder()
                    .operator(ListFilter.Operator.MEMBER_OF)
                    .path(ListFilter.Path.ACCOUNT_ID)
                    .value("value")
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
                .addFilter(
                    ListFilter.builder()
                        .operator(ListFilter.Operator.MEMBER_OF)
                        .path(ListFilter.Path.ACCOUNT_ID)
                        .value("value")
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

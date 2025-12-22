// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListPatternRecipientTest {

    @Test
    fun create() {
        val listPatternRecipient =
            ListPatternRecipient.builder()
                .data(
                    ListPatternRecipient.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .listPattern("list_pattern")
                .build()

        assertThat(listPatternRecipient.data())
            .contains(
                ListPatternRecipient.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(listPatternRecipient.listPattern()).contains("list_pattern")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listPatternRecipient =
            ListPatternRecipient.builder()
                .data(
                    ListPatternRecipient.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .listPattern("list_pattern")
                .build()

        val roundtrippedListPatternRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listPatternRecipient),
                jacksonTypeRef<ListPatternRecipient>(),
            )

        assertThat(roundtrippedListPatternRecipient).isEqualTo(listPatternRecipient)
    }
}

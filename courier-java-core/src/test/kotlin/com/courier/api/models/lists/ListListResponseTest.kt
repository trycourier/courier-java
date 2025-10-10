// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.lists

import com.courier.api.core.jsonMapper
import com.courier.api.models.Paging
import com.courier.api.models.SubscriptionList
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListListResponseTest {

    @Test
    fun create() {
        val listListResponse =
            ListListResponse.builder()
                .addItem(
                    SubscriptionList.builder()
                        .id("id")
                        .name("name")
                        .created("created")
                        .updated("updated")
                        .build()
                )
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .build()

        assertThat(listListResponse.items())
            .containsExactly(
                SubscriptionList.builder()
                    .id("id")
                    .name("name")
                    .created("created")
                    .updated("updated")
                    .build()
            )
        assertThat(listListResponse.paging())
            .isEqualTo(Paging.builder().more(true).cursor("cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listListResponse =
            ListListResponse.builder()
                .addItem(
                    SubscriptionList.builder()
                        .id("id")
                        .name("name")
                        .created("created")
                        .updated("updated")
                        .build()
                )
                .paging(Paging.builder().more(true).cursor("cursor").build())
                .build()

        val roundtrippedListListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listListResponse),
                jacksonTypeRef<ListListResponse>(),
            )

        assertThat(roundtrippedListListResponse).isEqualTo(listListResponse)
    }
}

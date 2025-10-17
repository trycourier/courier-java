// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.lists

import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionListTest {

    @Test
    fun create() {
        val subscriptionList =
            SubscriptionList.builder()
                .id("id")
                .name("name")
                .created("created")
                .updated("updated")
                .build()

        assertThat(subscriptionList.id()).isEqualTo("id")
        assertThat(subscriptionList.name()).isEqualTo("name")
        assertThat(subscriptionList.created()).contains("created")
        assertThat(subscriptionList.updated()).contains("updated")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionList =
            SubscriptionList.builder()
                .id("id")
                .name("name")
                .created("created")
                .updated("updated")
                .build()

        val roundtrippedSubscriptionList =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionList),
                jacksonTypeRef<SubscriptionList>(),
            )

        assertThat(roundtrippedSubscriptionList).isEqualTo(subscriptionList)
    }
}

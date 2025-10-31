// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants

import com.courier.core.jsonMapper
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionTopicNewTest {

    @Test
    fun create() {
        val subscriptionTopicNew =
            SubscriptionTopicNew.builder()
                .status(SubscriptionTopicNew.Status.OPTED_OUT)
                .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                .hasCustomRouting(true)
                .build()

        assertThat(subscriptionTopicNew.status()).isEqualTo(SubscriptionTopicNew.Status.OPTED_OUT)
        assertThat(subscriptionTopicNew.customRouting().getOrNull())
            .containsExactly(ChannelClassification.DIRECT_MESSAGE)
        assertThat(subscriptionTopicNew.hasCustomRouting()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionTopicNew =
            SubscriptionTopicNew.builder()
                .status(SubscriptionTopicNew.Status.OPTED_OUT)
                .addCustomRouting(ChannelClassification.DIRECT_MESSAGE)
                .hasCustomRouting(true)
                .build()

        val roundtrippedSubscriptionTopicNew =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionTopicNew),
                jacksonTypeRef<SubscriptionTopicNew>(),
            )

        assertThat(roundtrippedSubscriptionTopicNew).isEqualTo(subscriptionTopicNew)
    }
}

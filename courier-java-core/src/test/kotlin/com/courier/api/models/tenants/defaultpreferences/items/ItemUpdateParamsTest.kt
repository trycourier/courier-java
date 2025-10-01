// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.tenants.defaultpreferences.items

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ItemUpdateParamsTest {

    @Test
    fun create() {
        ItemUpdateParams.builder()
            .tenantId("tenant_id")
            .topicId("topic_id")
            .subscriptionTopicNew(
                SubscriptionTopicNew.builder()
                    .status(SubscriptionTopicNew.Status.OPTED_IN)
                    .addCustomRouting(ChannelClassification.INBOX)
                    .hasCustomRouting(true)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ItemUpdateParams.builder()
                .tenantId("tenant_id")
                .topicId("topic_id")
                .subscriptionTopicNew(
                    SubscriptionTopicNew.builder()
                        .status(SubscriptionTopicNew.Status.OPTED_IN)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("tenant_id")
        assertThat(params._pathParam(1)).isEqualTo("topic_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ItemUpdateParams.builder()
                .tenantId("tenant_id")
                .topicId("topic_id")
                .subscriptionTopicNew(
                    SubscriptionTopicNew.builder()
                        .status(SubscriptionTopicNew.Status.OPTED_IN)
                        .addCustomRouting(ChannelClassification.INBOX)
                        .hasCustomRouting(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SubscriptionTopicNew.builder()
                    .status(SubscriptionTopicNew.Status.OPTED_IN)
                    .addCustomRouting(ChannelClassification.INBOX)
                    .hasCustomRouting(true)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ItemUpdateParams.builder()
                .tenantId("tenant_id")
                .topicId("topic_id")
                .subscriptionTopicNew(
                    SubscriptionTopicNew.builder()
                        .status(SubscriptionTopicNew.Status.OPTED_IN)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SubscriptionTopicNew.builder().status(SubscriptionTopicNew.Status.OPTED_IN).build()
            )
    }
}

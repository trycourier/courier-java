// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.tenants.preferences

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.ChannelClassification
import com.courier.models.tenants.SubscriptionTopicNew
import com.courier.models.tenants.preferences.items.ItemDeleteParams
import com.courier.models.tenants.preferences.items.ItemUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ItemServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val itemService = client.tenants().preferences().items()

        itemService.update(
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
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val itemService = client.tenants().preferences().items()

        itemService.delete(
            ItemDeleteParams.builder().tenantId("tenant_id").topicId("topic_id").build()
        )
    }
}

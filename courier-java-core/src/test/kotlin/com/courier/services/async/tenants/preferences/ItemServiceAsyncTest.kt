// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.tenants.preferences

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.ChannelClassification
import com.courier.models.tenants.SubscriptionTopicNew
import com.courier.models.tenants.preferences.items.ItemDeleteParams
import com.courier.models.tenants.preferences.items.ItemUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ItemServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val itemServiceAsync = client.tenants().preferences().items()

        val future =
            itemServiceAsync.update(
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

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val itemServiceAsync = client.tenants().preferences().items()

        val future =
            itemServiceAsync.delete(
                ItemDeleteParams.builder().tenantId("tenant_id").topicId("topic_id").build()
            )

        val response = future.get()
    }
}

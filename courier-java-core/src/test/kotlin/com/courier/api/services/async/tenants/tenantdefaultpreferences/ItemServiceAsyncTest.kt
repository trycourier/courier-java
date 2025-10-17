// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.tenants.tenantdefaultpreferences

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClientAsync
import com.courier.api.models.ChannelClassification
import com.courier.api.models.tenants.SubscriptionTopicNew
import com.courier.api.models.tenants.tenantdefaultpreferences.items.ItemDeleteParams
import com.courier.api.models.tenants.tenantdefaultpreferences.items.ItemUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ItemServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val itemServiceAsync = client.tenants().tenantDefaultPreferences().items()

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

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val itemServiceAsync = client.tenants().tenantDefaultPreferences().items()

        val future =
            itemServiceAsync.delete(
                ItemDeleteParams.builder().tenantId("tenant_id").topicId("topic_id").build()
            )

        val response = future.get()
    }
}

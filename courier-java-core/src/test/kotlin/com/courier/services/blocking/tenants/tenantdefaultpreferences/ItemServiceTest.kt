// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.tenants.tenantdefaultpreferences

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.ChannelClassification
import com.courier.models.tenants.SubscriptionTopicNew
import com.courier.models.tenants.tenantdefaultpreferences.items.ItemDeleteParams
import com.courier.models.tenants.tenantdefaultpreferences.items.ItemUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ItemServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val itemService = client.tenants().tenantDefaultPreferences().items()

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
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val itemService = client.tenants().tenantDefaultPreferences().items()

        itemService.delete(
            ItemDeleteParams.builder().tenantId("tenant_id").topicId("topic_id").build()
        )
    }
}

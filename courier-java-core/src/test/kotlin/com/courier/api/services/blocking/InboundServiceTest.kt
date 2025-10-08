// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClient
import com.courier.api.core.JsonValue
import com.courier.api.models.inbound.InboundTrackEventParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun trackEvent() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundService = client.inbound()

        val response =
            inboundService.trackEvent(
                InboundTrackEventParams.builder()
                    .event("New Order Placed")
                    .messageId("4c62c457-b329-4bea-9bfc-17bba86c393f")
                    .properties(
                        InboundTrackEventParams.Properties.builder()
                            .putAdditionalProperty("order_id", JsonValue.from("bar"))
                            .putAdditionalProperty("total_orders", JsonValue.from("bar"))
                            .putAdditionalProperty("last_order_id", JsonValue.from("bar"))
                            .build()
                    )
                    .type(InboundTrackEventParams.Type.TRACK)
                    .userId("1234")
                    .build()
            )

        response.validate()
    }
}

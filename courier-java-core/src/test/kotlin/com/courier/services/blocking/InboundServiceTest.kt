// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.inbound.InboundTrackEventParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InboundServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun trackEvent() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
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

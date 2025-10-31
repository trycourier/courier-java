// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.core.JsonValue
import com.courier.models.inbound.InboundTrackEventParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun trackEvent() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundServiceAsync = client.inbound()

        val responseFuture =
            inboundServiceAsync.trackEvent(
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

        val response = responseFuture.get()
        response.validate()
    }
}

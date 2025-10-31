// File generated from our OpenAPI spec by Stainless.

package com.courier.models.inbound

import com.courier.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundTrackEventParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.event()).isEqualTo("New Order Placed")
        assertThat(body.messageId()).isEqualTo("4c62c457-b329-4bea-9bfc-17bba86c393f")
        assertThat(body.properties())
            .isEqualTo(
                InboundTrackEventParams.Properties.builder()
                    .putAdditionalProperty("order_id", JsonValue.from("bar"))
                    .putAdditionalProperty("total_orders", JsonValue.from("bar"))
                    .putAdditionalProperty("last_order_id", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.type()).isEqualTo(InboundTrackEventParams.Type.TRACK)
        assertThat(body.userId()).contains("1234")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
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
                .build()

        val body = params._body()

        assertThat(body.event()).isEqualTo("New Order Placed")
        assertThat(body.messageId()).isEqualTo("4c62c457-b329-4bea-9bfc-17bba86c393f")
        assertThat(body.properties())
            .isEqualTo(
                InboundTrackEventParams.Properties.builder()
                    .putAdditionalProperty("order_id", JsonValue.from("bar"))
                    .putAdditionalProperty("total_orders", JsonValue.from("bar"))
                    .putAdditionalProperty("last_order_id", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.type()).isEqualTo(InboundTrackEventParams.Type.TRACK)
    }
}

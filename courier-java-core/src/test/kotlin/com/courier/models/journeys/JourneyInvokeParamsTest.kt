// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyInvokeParamsTest {

    @Test
    fun create() {
        JourneyInvokeParams.builder()
            .templateId("templateId")
            .journeysInvokeRequest(
                JourneysInvokeRequest.builder()
                    .data(
                        JourneysInvokeRequest.Data.builder()
                            .putAdditionalProperty("order_id", JsonValue.from("bar"))
                            .putAdditionalProperty("amount", JsonValue.from("bar"))
                            .build()
                    )
                    .profile(
                        JourneysInvokeRequest.Profile.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .userId("user-123")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            JourneyInvokeParams.builder()
                .templateId("templateId")
                .journeysInvokeRequest(JourneysInvokeRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("templateId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            JourneyInvokeParams.builder()
                .templateId("templateId")
                .journeysInvokeRequest(
                    JourneysInvokeRequest.builder()
                        .data(
                            JourneysInvokeRequest.Data.builder()
                                .putAdditionalProperty("order_id", JsonValue.from("bar"))
                                .putAdditionalProperty("amount", JsonValue.from("bar"))
                                .build()
                        )
                        .profile(
                            JourneysInvokeRequest.Profile.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .userId("user-123")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                JourneysInvokeRequest.builder()
                    .data(
                        JourneysInvokeRequest.Data.builder()
                            .putAdditionalProperty("order_id", JsonValue.from("bar"))
                            .putAdditionalProperty("amount", JsonValue.from("bar"))
                            .build()
                    )
                    .profile(
                        JourneysInvokeRequest.Profile.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .userId("user-123")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            JourneyInvokeParams.builder()
                .templateId("templateId")
                .journeysInvokeRequest(JourneysInvokeRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(JourneysInvokeRequest.builder().build())
    }
}

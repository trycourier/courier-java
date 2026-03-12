// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.core.JsonValue
import com.courier.models.journeys.JourneyInvokeParams
import com.courier.models.journeys.JourneyListParams
import com.courier.models.journeys.JourneysInvokeRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JourneyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val journeyServiceAsync = client.journeys()

        val journeysListResponseFuture =
            journeyServiceAsync.list(
                JourneyListParams.builder()
                    .cursor("cursor")
                    .version(JourneyListParams.Version.PUBLISHED)
                    .build()
            )

        val journeysListResponse = journeysListResponseFuture.get()
        journeysListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun invoke() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val journeyServiceAsync = client.journeys()

        val journeysInvokeResponseFuture =
            journeyServiceAsync.invoke(
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
            )

        val journeysInvokeResponse = journeysInvokeResponseFuture.get()
        journeysInvokeResponse.validate()
    }
}

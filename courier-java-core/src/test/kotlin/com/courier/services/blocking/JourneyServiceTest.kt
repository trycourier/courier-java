// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.journeys.JourneyInvokeParams
import com.courier.models.journeys.JourneyListParams
import com.courier.models.journeys.JourneysInvokeRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JourneyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val journeyService = client.journeys()

        val journeysListResponse =
            journeyService.list(
                JourneyListParams.builder()
                    .cursor("cursor")
                    .version(JourneyListParams.Version.PUBLISHED)
                    .build()
            )

        journeysListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun invoke() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val journeyService = client.journeys()

        val journeysInvokeResponse =
            journeyService.invoke(
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

        journeysInvokeResponse.validate()
    }
}

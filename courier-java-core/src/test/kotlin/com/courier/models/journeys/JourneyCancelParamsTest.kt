// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyCancelParamsTest {

    @Test
    fun create() {
        JourneyCancelParams.builder()
            .cancelJourneyRequest(
                CancelJourneyRequest.ByCancelationToken.builder()
                    .cancelationToken("order-1234")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            JourneyCancelParams.builder()
                .cancelJourneyRequest(
                    CancelJourneyRequest.ByCancelationToken.builder()
                        .cancelationToken("order-1234")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CancelJourneyRequest.ofByCancelationToken(
                    CancelJourneyRequest.ByCancelationToken.builder()
                        .cancelationToken("order-1234")
                        .build()
                )
            )
    }
}

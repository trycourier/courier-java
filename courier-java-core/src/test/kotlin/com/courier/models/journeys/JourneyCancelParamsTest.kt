// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JourneyCancelParamsTest {

    @Test
    fun create() {
        JourneyCancelParams.builder()
            .idempotencyKey("order-ORD-456-user-123")
            .xIdempotencyExpiration("1785312000")
            .cancelJourneyRequest(
                CancelJourneyRequest.ByCancelationToken.builder()
                    .cancelationToken("order-1234")
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            JourneyCancelParams.builder()
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .cancelJourneyRequest(
                    CancelJourneyRequest.ByCancelationToken.builder()
                        .cancelationToken("order-1234")
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("Idempotency-Key", "order-ORD-456-user-123")
                    .put("x-idempotency-expiration", "1785312000")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            JourneyCancelParams.builder()
                .cancelJourneyRequest(
                    CancelJourneyRequest.ByCancelationToken.builder()
                        .cancelationToken("order-1234")
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            JourneyCancelParams.builder()
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
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

    @Test
    fun bodyWithoutOptionalFields() {
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

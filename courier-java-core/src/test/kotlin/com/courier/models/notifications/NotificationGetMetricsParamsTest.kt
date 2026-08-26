// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationGetMetricsParamsTest {

    @Test
    fun create() {
        NotificationGetMetricsParams.builder()
            .id("x")
            .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .granularity(NotificationGetMetricsParams.Granularity.HOUR)
            .lookback("lookback")
            .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params = NotificationGetMetricsParams.builder().id("x").build()

        assertThat(params._pathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            NotificationGetMetricsParams.builder()
                .id("x")
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .granularity(NotificationGetMetricsParams.Granularity.HOUR)
                .lookback("lookback")
                .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("end", "2019-12-27T18:11:19.117Z")
                    .put("granularity", "HOUR")
                    .put("lookback", "lookback")
                    .put("start", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NotificationGetMetricsParams.builder().id("x").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}

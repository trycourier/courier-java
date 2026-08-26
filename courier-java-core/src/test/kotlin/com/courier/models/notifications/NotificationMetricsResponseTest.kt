// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationMetricsResponseTest {

    @Test
    fun create() {
        val notificationMetricsResponse =
            NotificationMetricsResponse.builder()
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .granularity(NotificationMetricsResponse.Granularity.HOUR)
                .notificationId("notificationId")
                .addSeries(
                    NotificationMetricsResponse.Series.builder()
                        .addData(
                            NotificationMetricsResponse.Series.Data.builder()
                                .channel("channel")
                                .clicked(0L)
                                .delivered(0L)
                                .errors(0L)
                                .opened(0L)
                                .provider("provider")
                                .sent(0L)
                                .undeliverable(0L)
                                .build()
                        )
                        .period(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(notificationMetricsResponse.end())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(notificationMetricsResponse.granularity())
            .isEqualTo(NotificationMetricsResponse.Granularity.HOUR)
        assertThat(notificationMetricsResponse.notificationId()).isEqualTo("notificationId")
        assertThat(notificationMetricsResponse.series())
            .containsExactly(
                NotificationMetricsResponse.Series.builder()
                    .addData(
                        NotificationMetricsResponse.Series.Data.builder()
                            .channel("channel")
                            .clicked(0L)
                            .delivered(0L)
                            .errors(0L)
                            .opened(0L)
                            .provider("provider")
                            .sent(0L)
                            .undeliverable(0L)
                            .build()
                    )
                    .period(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(notificationMetricsResponse.start())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationMetricsResponse =
            NotificationMetricsResponse.builder()
                .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .granularity(NotificationMetricsResponse.Granularity.HOUR)
                .notificationId("notificationId")
                .addSeries(
                    NotificationMetricsResponse.Series.builder()
                        .addData(
                            NotificationMetricsResponse.Series.Data.builder()
                                .channel("channel")
                                .clicked(0L)
                                .delivered(0L)
                                .errors(0L)
                                .opened(0L)
                                .provider("provider")
                                .sent(0L)
                                .undeliverable(0L)
                                .build()
                        )
                        .period(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedNotificationMetricsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationMetricsResponse),
                jacksonTypeRef<NotificationMetricsResponse>(),
            )

        assertThat(roundtrippedNotificationMetricsResponse).isEqualTo(notificationMetricsResponse)
    }
}

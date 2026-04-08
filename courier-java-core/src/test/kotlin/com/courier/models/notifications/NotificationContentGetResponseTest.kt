// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationContentGetResponseTest {

    @Test
    fun create() {
        val notificationContentGetResponse =
            NotificationContentGetResponse.builder()
                .addElement(
                    ElementWithChecksums.builder()
                        .checksum("checksum")
                        .type("type")
                        .id("id")
                        .elements(listOf())
                        .locales(
                            ElementWithChecksums.Locales.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(mapOf("checksum" to "checksum")),
                                )
                                .build()
                        )
                        .build()
                )
                .version("2022-01-01")
                .build()

        assertThat(notificationContentGetResponse.elements())
            .containsExactly(
                ElementWithChecksums.builder()
                    .checksum("checksum")
                    .type("type")
                    .id("id")
                    .elements(listOf())
                    .locales(
                        ElementWithChecksums.Locales.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(mapOf("checksum" to "checksum")),
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(notificationContentGetResponse.version()).isEqualTo("2022-01-01")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationContentGetResponse =
            NotificationContentGetResponse.builder()
                .addElement(
                    ElementWithChecksums.builder()
                        .checksum("checksum")
                        .type("type")
                        .id("id")
                        .elements(listOf())
                        .locales(
                            ElementWithChecksums.Locales.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(mapOf("checksum" to "checksum")),
                                )
                                .build()
                        )
                        .build()
                )
                .version("2022-01-01")
                .build()

        val roundtrippedNotificationContentGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationContentGetResponse),
                jacksonTypeRef<NotificationContentGetResponse>(),
            )

        assertThat(roundtrippedNotificationContentGetResponse)
            .isEqualTo(notificationContentGetResponse)
    }
}

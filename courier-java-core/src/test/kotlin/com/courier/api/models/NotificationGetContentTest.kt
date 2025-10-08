// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationGetContentTest {

    @Test
    fun create() {
        val notificationGetContent =
            NotificationGetContent.builder()
                .addBlock(
                    NotificationGetContent.Block.builder()
                        .id("id")
                        .type(NotificationGetContent.Block.Type.ACTION)
                        .alias("alias")
                        .checksum("checksum")
                        .content("string")
                        .context("context")
                        .locales(
                            NotificationGetContent.Block.Locales.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .addChannel(
                    NotificationGetContent.Channel.builder()
                        .id("id")
                        .checksum("checksum")
                        .content(
                            NotificationGetContent.Channel.Content.builder()
                                .subject("subject")
                                .title("title")
                                .build()
                        )
                        .locales(
                            NotificationGetContent.Channel.Locales.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf("subject" to "subject", "title" to "title")
                                    ),
                                )
                                .build()
                        )
                        .type("type")
                        .build()
                )
                .checksum("checksum")
                .build()

        assertThat(notificationGetContent.blocks().getOrNull())
            .containsExactly(
                NotificationGetContent.Block.builder()
                    .id("id")
                    .type(NotificationGetContent.Block.Type.ACTION)
                    .alias("alias")
                    .checksum("checksum")
                    .content("string")
                    .context("context")
                    .locales(
                        NotificationGetContent.Block.Locales.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(notificationGetContent.channels().getOrNull())
            .containsExactly(
                NotificationGetContent.Channel.builder()
                    .id("id")
                    .checksum("checksum")
                    .content(
                        NotificationGetContent.Channel.Content.builder()
                            .subject("subject")
                            .title("title")
                            .build()
                    )
                    .locales(
                        NotificationGetContent.Channel.Locales.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(mapOf("subject" to "subject", "title" to "title")),
                            )
                            .build()
                    )
                    .type("type")
                    .build()
            )
        assertThat(notificationGetContent.checksum()).contains("checksum")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationGetContent =
            NotificationGetContent.builder()
                .addBlock(
                    NotificationGetContent.Block.builder()
                        .id("id")
                        .type(NotificationGetContent.Block.Type.ACTION)
                        .alias("alias")
                        .checksum("checksum")
                        .content("string")
                        .context("context")
                        .locales(
                            NotificationGetContent.Block.Locales.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .addChannel(
                    NotificationGetContent.Channel.builder()
                        .id("id")
                        .checksum("checksum")
                        .content(
                            NotificationGetContent.Channel.Content.builder()
                                .subject("subject")
                                .title("title")
                                .build()
                        )
                        .locales(
                            NotificationGetContent.Channel.Locales.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf("subject" to "subject", "title" to "title")
                                    ),
                                )
                                .build()
                        )
                        .type("type")
                        .build()
                )
                .checksum("checksum")
                .build()

        val roundtrippedNotificationGetContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationGetContent),
                jacksonTypeRef<NotificationGetContent>(),
            )

        assertThat(roundtrippedNotificationGetContent).isEqualTo(notificationGetContent)
    }
}

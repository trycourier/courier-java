// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.notifications

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationContentTest {

    @Test
    fun create() {
        val notificationContent =
            NotificationContent.builder()
                .addBlock(
                    NotificationContent.Block.builder()
                        .id("id")
                        .type(NotificationContent.Block.Type.ACTION)
                        .alias("alias")
                        .checksum("checksum")
                        .content("string")
                        .context("context")
                        .locales(
                            NotificationContent.Block.Locales.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .addChannel(
                    NotificationContent.Channel.builder()
                        .id("id")
                        .checksum("checksum")
                        .content(
                            NotificationContent.Channel.Content.builder()
                                .subject("subject")
                                .title("title")
                                .build()
                        )
                        .locales(
                            NotificationContent.Channel.Locales.builder()
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

        assertThat(notificationContent.blocks().getOrNull())
            .containsExactly(
                NotificationContent.Block.builder()
                    .id("id")
                    .type(NotificationContent.Block.Type.ACTION)
                    .alias("alias")
                    .checksum("checksum")
                    .content("string")
                    .context("context")
                    .locales(
                        NotificationContent.Block.Locales.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(notificationContent.channels().getOrNull())
            .containsExactly(
                NotificationContent.Channel.builder()
                    .id("id")
                    .checksum("checksum")
                    .content(
                        NotificationContent.Channel.Content.builder()
                            .subject("subject")
                            .title("title")
                            .build()
                    )
                    .locales(
                        NotificationContent.Channel.Locales.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(mapOf("subject" to "subject", "title" to "title")),
                            )
                            .build()
                    )
                    .type("type")
                    .build()
            )
        assertThat(notificationContent.checksum()).contains("checksum")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationContent =
            NotificationContent.builder()
                .addBlock(
                    NotificationContent.Block.builder()
                        .id("id")
                        .type(NotificationContent.Block.Type.ACTION)
                        .alias("alias")
                        .checksum("checksum")
                        .content("string")
                        .context("context")
                        .locales(
                            NotificationContent.Block.Locales.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .addChannel(
                    NotificationContent.Channel.builder()
                        .id("id")
                        .checksum("checksum")
                        .content(
                            NotificationContent.Channel.Content.builder()
                                .subject("subject")
                                .title("title")
                                .build()
                        )
                        .locales(
                            NotificationContent.Channel.Locales.builder()
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

        val roundtrippedNotificationContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationContent),
                jacksonTypeRef<NotificationContent>(),
            )

        assertThat(roundtrippedNotificationContent).isEqualTo(notificationContent)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class NotificationRetrieveContentResponseTest {

    @Test
    fun ofContentGet() {
        val contentGet =
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

        val notificationRetrieveContentResponse =
            NotificationRetrieveContentResponse.ofContentGet(contentGet)

        assertThat(notificationRetrieveContentResponse.contentGet()).contains(contentGet)
        assertThat(notificationRetrieveContentResponse.getContent()).isEmpty
    }

    @Test
    fun ofContentGetRoundtrip() {
        val jsonMapper = jsonMapper()
        val notificationRetrieveContentResponse =
            NotificationRetrieveContentResponse.ofContentGet(
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
            )

        val roundtrippedNotificationRetrieveContentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationRetrieveContentResponse),
                jacksonTypeRef<NotificationRetrieveContentResponse>(),
            )

        assertThat(roundtrippedNotificationRetrieveContentResponse)
            .isEqualTo(notificationRetrieveContentResponse)
    }

    @Test
    fun ofGetContent() {
        val getContent =
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

        val notificationRetrieveContentResponse =
            NotificationRetrieveContentResponse.ofGetContent(getContent)

        assertThat(notificationRetrieveContentResponse.contentGet()).isEmpty
        assertThat(notificationRetrieveContentResponse.getContent()).contains(getContent)
    }

    @Test
    fun ofGetContentRoundtrip() {
        val jsonMapper = jsonMapper()
        val notificationRetrieveContentResponse =
            NotificationRetrieveContentResponse.ofGetContent(
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
            )

        val roundtrippedNotificationRetrieveContentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationRetrieveContentResponse),
                jacksonTypeRef<NotificationRetrieveContentResponse>(),
            )

        assertThat(roundtrippedNotificationRetrieveContentResponse)
            .isEqualTo(notificationRetrieveContentResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val notificationRetrieveContentResponse =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<NotificationRetrieveContentResponse>())

        val e =
            assertThrows<CourierInvalidDataException> {
                notificationRetrieveContentResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}

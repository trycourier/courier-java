// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.lists.subscriptions

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PutSubscriptionsRecipientTest {

    @Test
    fun create() {
        val putSubscriptionsRecipient =
            PutSubscriptionsRecipient.builder()
                .recipientId("recipientId")
                .preferences(
                    RecipientPreferences.builder()
                        .categories(
                            RecipientPreferences.Categories.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "status" to "OPTED_IN",
                                            "channel_preferences" to
                                                listOf(mapOf("channel" to "direct_message")),
                                            "rules" to
                                                listOf(
                                                    mapOf("until" to "until", "start" to "start")
                                                ),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .notifications(
                            RecipientPreferences.Notifications.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "status" to "OPTED_IN",
                                            "channel_preferences" to
                                                listOf(mapOf("channel" to "direct_message")),
                                            "rules" to
                                                listOf(
                                                    mapOf("until" to "until", "start" to "start")
                                                ),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(putSubscriptionsRecipient.recipientId()).isEqualTo("recipientId")
        assertThat(putSubscriptionsRecipient.preferences())
            .contains(
                RecipientPreferences.builder()
                    .categories(
                        RecipientPreferences.Categories.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "status" to "OPTED_IN",
                                        "channel_preferences" to
                                            listOf(mapOf("channel" to "direct_message")),
                                        "rules" to
                                            listOf(mapOf("until" to "until", "start" to "start")),
                                    )
                                ),
                            )
                            .build()
                    )
                    .notifications(
                        RecipientPreferences.Notifications.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "status" to "OPTED_IN",
                                        "channel_preferences" to
                                            listOf(mapOf("channel" to "direct_message")),
                                        "rules" to
                                            listOf(mapOf("until" to "until", "start" to "start")),
                                    )
                                ),
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val putSubscriptionsRecipient =
            PutSubscriptionsRecipient.builder()
                .recipientId("recipientId")
                .preferences(
                    RecipientPreferences.builder()
                        .categories(
                            RecipientPreferences.Categories.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "status" to "OPTED_IN",
                                            "channel_preferences" to
                                                listOf(mapOf("channel" to "direct_message")),
                                            "rules" to
                                                listOf(
                                                    mapOf("until" to "until", "start" to "start")
                                                ),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .notifications(
                            RecipientPreferences.Notifications.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "status" to "OPTED_IN",
                                            "channel_preferences" to
                                                listOf(mapOf("channel" to "direct_message")),
                                            "rules" to
                                                listOf(
                                                    mapOf("until" to "until", "start" to "start")
                                                ),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedPutSubscriptionsRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(putSubscriptionsRecipient),
                jacksonTypeRef<PutSubscriptionsRecipient>(),
            )

        assertThat(roundtrippedPutSubscriptionsRecipient).isEqualTo(putSubscriptionsRecipient)
    }
}

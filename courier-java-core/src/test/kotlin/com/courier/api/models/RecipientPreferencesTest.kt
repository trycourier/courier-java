// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecipientPreferencesTest {

    @Test
    fun create() {
        val recipientPreferences =
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
                                    "rules" to listOf(mapOf("until" to "until", "start" to "start")),
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
                                    "rules" to listOf(mapOf("until" to "until", "start" to "start")),
                                )
                            ),
                        )
                        .build()
                )
                .build()

        assertThat(recipientPreferences.categories())
            .contains(
                RecipientPreferences.Categories.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "status" to "OPTED_IN",
                                "channel_preferences" to
                                    listOf(mapOf("channel" to "direct_message")),
                                "rules" to listOf(mapOf("until" to "until", "start" to "start")),
                            )
                        ),
                    )
                    .build()
            )
        assertThat(recipientPreferences.notifications())
            .contains(
                RecipientPreferences.Notifications.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "status" to "OPTED_IN",
                                "channel_preferences" to
                                    listOf(mapOf("channel" to "direct_message")),
                                "rules" to listOf(mapOf("until" to "until", "start" to "start")),
                            )
                        ),
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recipientPreferences =
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
                                    "rules" to listOf(mapOf("until" to "until", "start" to "start")),
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
                                    "rules" to listOf(mapOf("until" to "until", "start" to "start")),
                                )
                            ),
                        )
                        .build()
                )
                .build()

        val roundtrippedRecipientPreferences =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recipientPreferences),
                jacksonTypeRef<RecipientPreferences>(),
            )

        assertThat(roundtrippedRecipientPreferences).isEqualTo(recipientPreferences)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfilePreferencesTest {

    @Test
    fun create() {
        val profilePreferences =
            ProfilePreferences.builder()
                .notifications(
                    ProfilePreferences.Notifications.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "status" to "OPTED_IN",
                                    "channel_preferences" to
                                        listOf(mapOf("channel" to "direct_message")),
                                    "rules" to
                                        listOf(mapOf("until" to "until", "start" to "start")),
                                    "source" to "subscription",
                                )
                            ),
                        )
                        .build()
                )
                .categories(
                    ProfilePreferences.Categories.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "status" to "OPTED_IN",
                                    "channel_preferences" to
                                        listOf(mapOf("channel" to "direct_message")),
                                    "rules" to
                                        listOf(mapOf("until" to "until", "start" to "start")),
                                    "source" to "subscription",
                                )
                            ),
                        )
                        .build()
                )
                .templateId("templateId")
                .build()

        assertThat(profilePreferences.notifications())
            .isEqualTo(
                ProfilePreferences.Notifications.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "status" to "OPTED_IN",
                                "channel_preferences" to
                                    listOf(mapOf("channel" to "direct_message")),
                                "rules" to listOf(mapOf("until" to "until", "start" to "start")),
                                "source" to "subscription",
                            )
                        ),
                    )
                    .build()
            )
        assertThat(profilePreferences.categories())
            .contains(
                ProfilePreferences.Categories.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "status" to "OPTED_IN",
                                "channel_preferences" to
                                    listOf(mapOf("channel" to "direct_message")),
                                "rules" to listOf(mapOf("until" to "until", "start" to "start")),
                                "source" to "subscription",
                            )
                        ),
                    )
                    .build()
            )
        assertThat(profilePreferences.templateId()).contains("templateId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val profilePreferences =
            ProfilePreferences.builder()
                .notifications(
                    ProfilePreferences.Notifications.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "status" to "OPTED_IN",
                                    "channel_preferences" to
                                        listOf(mapOf("channel" to "direct_message")),
                                    "rules" to
                                        listOf(mapOf("until" to "until", "start" to "start")),
                                    "source" to "subscription",
                                )
                            ),
                        )
                        .build()
                )
                .categories(
                    ProfilePreferences.Categories.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "status" to "OPTED_IN",
                                    "channel_preferences" to
                                        listOf(mapOf("channel" to "direct_message")),
                                    "rules" to
                                        listOf(mapOf("until" to "until", "start" to "start")),
                                    "source" to "subscription",
                                )
                            ),
                        )
                        .build()
                )
                .templateId("templateId")
                .build()

        val roundtrippedProfilePreferences =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profilePreferences),
                jacksonTypeRef<ProfilePreferences>(),
            )

        assertThat(roundtrippedProfilePreferences).isEqualTo(profilePreferences)
    }
}

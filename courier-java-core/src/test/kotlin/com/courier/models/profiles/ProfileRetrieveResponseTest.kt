// File generated from our OpenAPI spec by Stainless.

package com.courier.models.profiles

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.courier.models.RecipientPreferences
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileRetrieveResponseTest {

    @Test
    fun create() {
        val profileRetrieveResponse =
            ProfileRetrieveResponse.builder()
                .profile(
                    ProfileRetrieveResponse.Profile.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
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

        assertThat(profileRetrieveResponse.profile())
            .isEqualTo(
                ProfileRetrieveResponse.Profile.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(profileRetrieveResponse.preferences())
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
        val profileRetrieveResponse =
            ProfileRetrieveResponse.builder()
                .profile(
                    ProfileRetrieveResponse.Profile.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
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

        val roundtrippedProfileRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(profileRetrieveResponse),
                jacksonTypeRef<ProfileRetrieveResponse>(),
            )

        assertThat(roundtrippedProfileRetrieveResponse).isEqualTo(profileRetrieveResponse)
    }
}

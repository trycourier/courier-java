// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundBulkMessageUserTest {

    @Test
    fun create() {
        val inboundBulkMessageUser =
            InboundBulkMessageUser.builder()
                .data(JsonValue.from(mapOf<String, Any>()))
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
                .profile(JsonValue.from(mapOf<String, Any>()))
                .recipient("recipient")
                .to(
                    UserRecipient.builder()
                        .accountId("account_id")
                        .context(MessageContext.builder().tenantId("tenant_id").build())
                        .data(
                            UserRecipient.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .email("email")
                        .locale("locale")
                        .phoneNumber("phone_number")
                        .preferences(
                            UserRecipient.Preferences.builder()
                                .notifications(
                                    UserRecipient.Preferences.Notifications.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(
                                                mapOf(
                                                    "status" to "OPTED_IN",
                                                    "channel_preferences" to
                                                        listOf(
                                                            mapOf("channel" to "direct_message")
                                                        ),
                                                    "rules" to
                                                        listOf(
                                                            mapOf(
                                                                "until" to "until",
                                                                "start" to "start",
                                                            )
                                                        ),
                                                    "source" to "subscription",
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .categories(
                                    UserRecipient.Preferences.Categories.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(
                                                mapOf(
                                                    "status" to "OPTED_IN",
                                                    "channel_preferences" to
                                                        listOf(
                                                            mapOf("channel" to "direct_message")
                                                        ),
                                                    "rules" to
                                                        listOf(
                                                            mapOf(
                                                                "until" to "until",
                                                                "start" to "start",
                                                            )
                                                        ),
                                                    "source" to "subscription",
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .templateId("templateId")
                                .build()
                        )
                        .tenantId("tenant_id")
                        .userId("user_id")
                        .build()
                )
                .build()

        assertThat(inboundBulkMessageUser._data()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(inboundBulkMessageUser.preferences())
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
        assertThat(inboundBulkMessageUser._profile())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(inboundBulkMessageUser.recipient()).contains("recipient")
        assertThat(inboundBulkMessageUser.to())
            .contains(
                UserRecipient.builder()
                    .accountId("account_id")
                    .context(MessageContext.builder().tenantId("tenant_id").build())
                    .data(
                        UserRecipient.Data.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .email("email")
                    .locale("locale")
                    .phoneNumber("phone_number")
                    .preferences(
                        UserRecipient.Preferences.builder()
                            .notifications(
                                UserRecipient.Preferences.Notifications.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf(
                                                "status" to "OPTED_IN",
                                                "channel_preferences" to
                                                    listOf(mapOf("channel" to "direct_message")),
                                                "rules" to
                                                    listOf(
                                                        mapOf(
                                                            "until" to "until",
                                                            "start" to "start",
                                                        )
                                                    ),
                                                "source" to "subscription",
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .categories(
                                UserRecipient.Preferences.Categories.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf(
                                                "status" to "OPTED_IN",
                                                "channel_preferences" to
                                                    listOf(mapOf("channel" to "direct_message")),
                                                "rules" to
                                                    listOf(
                                                        mapOf(
                                                            "until" to "until",
                                                            "start" to "start",
                                                        )
                                                    ),
                                                "source" to "subscription",
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .templateId("templateId")
                            .build()
                    )
                    .tenantId("tenant_id")
                    .userId("user_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundBulkMessageUser =
            InboundBulkMessageUser.builder()
                .data(JsonValue.from(mapOf<String, Any>()))
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
                .profile(JsonValue.from(mapOf<String, Any>()))
                .recipient("recipient")
                .to(
                    UserRecipient.builder()
                        .accountId("account_id")
                        .context(MessageContext.builder().tenantId("tenant_id").build())
                        .data(
                            UserRecipient.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .email("email")
                        .locale("locale")
                        .phoneNumber("phone_number")
                        .preferences(
                            UserRecipient.Preferences.builder()
                                .notifications(
                                    UserRecipient.Preferences.Notifications.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(
                                                mapOf(
                                                    "status" to "OPTED_IN",
                                                    "channel_preferences" to
                                                        listOf(
                                                            mapOf("channel" to "direct_message")
                                                        ),
                                                    "rules" to
                                                        listOf(
                                                            mapOf(
                                                                "until" to "until",
                                                                "start" to "start",
                                                            )
                                                        ),
                                                    "source" to "subscription",
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .categories(
                                    UserRecipient.Preferences.Categories.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(
                                                mapOf(
                                                    "status" to "OPTED_IN",
                                                    "channel_preferences" to
                                                        listOf(
                                                            mapOf("channel" to "direct_message")
                                                        ),
                                                    "rules" to
                                                        listOf(
                                                            mapOf(
                                                                "until" to "until",
                                                                "start" to "start",
                                                            )
                                                        ),
                                                    "source" to "subscription",
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .templateId("templateId")
                                .build()
                        )
                        .tenantId("tenant_id")
                        .userId("user_id")
                        .build()
                )
                .build()

        val roundtrippedInboundBulkMessageUser =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundBulkMessageUser),
                jacksonTypeRef<InboundBulkMessageUser>(),
            )

        assertThat(roundtrippedInboundBulkMessageUser).isEqualTo(inboundBulkMessageUser)
    }
}

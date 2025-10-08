// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.courier.api.models.send.MessageContext
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRecipientTest {

    @Test
    fun create() {
        val userRecipient =
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
                                                    mapOf("until" to "until", "start" to "start")
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
                                                    mapOf("until" to "until", "start" to "start")
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

        assertThat(userRecipient.accountId()).contains("account_id")
        assertThat(userRecipient.context())
            .contains(MessageContext.builder().tenantId("tenant_id").build())
        assertThat(userRecipient.data())
            .contains(
                UserRecipient.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(userRecipient.email()).contains("email")
        assertThat(userRecipient.locale()).contains("locale")
        assertThat(userRecipient.phoneNumber()).contains("phone_number")
        assertThat(userRecipient.preferences())
            .contains(
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
                                            listOf(mapOf("until" to "until", "start" to "start")),
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
                                            listOf(mapOf("until" to "until", "start" to "start")),
                                        "source" to "subscription",
                                    )
                                ),
                            )
                            .build()
                    )
                    .templateId("templateId")
                    .build()
            )
        assertThat(userRecipient.tenantId()).contains("tenant_id")
        assertThat(userRecipient.userId()).contains("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userRecipient =
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
                                                    mapOf("until" to "until", "start" to "start")
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
                                                    mapOf("until" to "until", "start" to "start")
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

        val roundtrippedUserRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userRecipient),
                jacksonTypeRef<UserRecipient>(),
            )

        assertThat(roundtrippedUserRecipient).isEqualTo(userRecipient)
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecipientTest {

    @Test
    fun create() {
        val recipient =
            Recipient.builder()
                .accountId("account_id")
                .context(MessageContext.builder().tenantId("tenant_id").build())
                .data(
                    Recipient.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .email("email")
                .listId("list_id")
                .locale("locale")
                .phoneNumber("phone_number")
                .preferences(
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
                            ProfilePreferences.Categories.builder()
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

        assertThat(recipient.accountId()).contains("account_id")
        assertThat(recipient.context())
            .contains(MessageContext.builder().tenantId("tenant_id").build())
        assertThat(recipient.data())
            .contains(
                Recipient.Data.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
        assertThat(recipient.email()).contains("email")
        assertThat(recipient.listId()).contains("list_id")
        assertThat(recipient.locale()).contains("locale")
        assertThat(recipient.phoneNumber()).contains("phone_number")
        assertThat(recipient.preferences())
            .contains(
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
            )
        assertThat(recipient.tenantId()).contains("tenant_id")
        assertThat(recipient.userId()).contains("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recipient =
            Recipient.builder()
                .accountId("account_id")
                .context(MessageContext.builder().tenantId("tenant_id").build())
                .data(
                    Recipient.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .email("email")
                .listId("list_id")
                .locale("locale")
                .phoneNumber("phone_number")
                .preferences(
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
                            ProfilePreferences.Categories.builder()
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

        val roundtrippedRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recipient),
                jacksonTypeRef<Recipient>(),
            )

        assertThat(roundtrippedRecipient).isEqualTo(recipient)
    }
}

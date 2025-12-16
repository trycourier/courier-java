// File generated from our OpenAPI spec by Stainless.

package com.courier.models.bulk

import com.courier.core.JsonValue
import com.courier.models.MessageContext
import com.courier.models.RecipientPreferences
import com.courier.models.UserRecipient
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkAddUsersParamsTest {

    @Test
    fun create() {
        BulkAddUsersParams.builder()
            .jobId("job_id")
            .addUser(
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
                                                        mapOf(
                                                            "until" to "until",
                                                            "start" to "start",
                                                        )
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
                                                        mapOf(
                                                            "until" to "until",
                                                            "start" to "start",
                                                        )
                                                    ),
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .profile(
                        InboundBulkMessageUser.Profile.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
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
                            .listId("list_id")
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BulkAddUsersParams.builder()
                .jobId("job_id")
                .addUser(InboundBulkMessageUser.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("job_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BulkAddUsersParams.builder()
                .jobId("job_id")
                .addUser(
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
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .profile(
                            InboundBulkMessageUser.Profile.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
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
                                .listId("list_id")
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
                                                                    mapOf(
                                                                        "channel" to
                                                                            "direct_message"
                                                                    )
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
                                                                    mapOf(
                                                                        "channel" to
                                                                            "direct_message"
                                                                    )
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
                )
                .build()

        val body = params._body()

        assertThat(body.users())
            .containsExactly(
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
                                                        mapOf(
                                                            "until" to "until",
                                                            "start" to "start",
                                                        )
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
                                                        mapOf(
                                                            "until" to "until",
                                                            "start" to "start",
                                                        )
                                                    ),
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .profile(
                        InboundBulkMessageUser.Profile.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
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
                            .listId("list_id")
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BulkAddUsersParams.builder()
                .jobId("job_id")
                .addUser(InboundBulkMessageUser.builder().build())
                .build()

        val body = params._body()

        assertThat(body.users()).containsExactly(InboundBulkMessageUser.builder().build())
    }
}

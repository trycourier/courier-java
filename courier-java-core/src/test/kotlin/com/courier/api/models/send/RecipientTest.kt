// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.courier.api.errors.CourierInvalidDataException
import com.courier.api.models.bulk.UserRecipient
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class RecipientTest {

    @Test
    fun ofUser() {
        val user =
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

        val recipient = Recipient.ofUser(user)

        assertThat(recipient.user()).contains(user)
        assertThat(recipient.list()).isEmpty
    }

    @Test
    fun ofUserRoundtrip() {
        val jsonMapper = jsonMapper()
        val recipient =
            Recipient.ofUser(
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

        val roundtrippedRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recipient),
                jacksonTypeRef<Recipient>(),
            )

        assertThat(roundtrippedRecipient).isEqualTo(recipient)
    }

    @Test
    fun ofList() {
        val list =
            Recipient.ListRecipient.builder()
                .data(
                    Recipient.ListRecipient.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .listId("list_id")
                .build()

        val recipient = Recipient.ofList(list)

        assertThat(recipient.user()).isEmpty
        assertThat(recipient.list()).contains(list)
    }

    @Test
    fun ofListRoundtrip() {
        val jsonMapper = jsonMapper()
        val recipient =
            Recipient.ofList(
                Recipient.ListRecipient.builder()
                    .data(
                        Recipient.ListRecipient.Data.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .listId("list_id")
                    .build()
            )

        val roundtrippedRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recipient),
                jacksonTypeRef<Recipient>(),
            )

        assertThat(roundtrippedRecipient).isEqualTo(recipient)
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
        val recipient = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Recipient>())

        val e = assertThrows<CourierInvalidDataException> { recipient.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.MessageContext
import com.courier.models.RecipientPreferences
import com.courier.models.UserRecipient
import com.courier.models.bulk.BulkAddUsersParams
import com.courier.models.bulk.BulkCreateJobParams
import com.courier.models.bulk.BulkListUsersParams
import com.courier.models.bulk.InboundBulkMessage
import com.courier.models.bulk.InboundBulkMessageUser
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BulkServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun addUsers() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bulkService = client.bulk()

        bulkService.addUsers(
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
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createJob() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bulkService = client.bulk()

        val response =
            bulkService.createJob(
                BulkCreateJobParams.builder()
                    .message(
                        InboundBulkMessage.InboundBulkTemplateMessage.builder()
                            .template("template")
                            .brand("brand")
                            .data(
                                InboundBulkMessage.InboundBulkTemplateMessage.Data.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .event("event")
                            .locale(
                                InboundBulkMessage.InboundBulkTemplateMessage.Locale.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
                                    )
                                    .build()
                            )
                            .override(
                                InboundBulkMessage.InboundBulkTemplateMessage.Override.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listUsers() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bulkService = client.bulk()

        val response =
            bulkService.listUsers(
                BulkListUsersParams.builder().jobId("job_id").cursor("cursor").build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveJob() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bulkService = client.bulk()

        val response = bulkService.retrieveJob("job_id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun runJob() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bulkService = client.bulk()

        bulkService.runJob("job_id")
    }
}

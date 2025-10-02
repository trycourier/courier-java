// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClient
import com.courier.api.core.JsonValue
import com.courier.api.models.bulk.BulkAddUsersParams
import com.courier.api.models.bulk.BulkCreateJobParams
import com.courier.api.models.bulk.BulkListUsersParams
import com.courier.api.models.bulk.InboundBulkMessage
import com.courier.api.models.bulk.InboundBulkMessageUser
import com.courier.api.models.bulk.UserRecipient
import com.courier.api.models.lists.subscriptions.RecipientPreferences
import com.courier.api.models.send.BaseMessage
import com.courier.api.models.send.MessageContext
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
                        InboundBulkMessage.builder()
                            .brand("brand")
                            .data(
                                InboundBulkMessage.Data.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .event("event")
                            .locale(
                                InboundBulkMessage.Locale.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .message(
                                InboundBulkMessage.Message.InboundBulkTemplateMessage.builder()
                                    .brandId("brand_id")
                                    .channels(
                                        BaseMessage.Channels.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(
                                                    mapOf(
                                                        "brand_id" to "brand_id",
                                                        "if" to "if",
                                                        "metadata" to
                                                            mapOf(
                                                                "utm" to
                                                                    mapOf(
                                                                        "campaign" to "campaign",
                                                                        "content" to "content",
                                                                        "medium" to "medium",
                                                                        "source" to "source",
                                                                        "term" to "term",
                                                                    )
                                                            ),
                                                        "override" to mapOf("foo" to "bar"),
                                                        "providers" to listOf("string"),
                                                        "routing_method" to "all",
                                                        "timeouts" to
                                                            mapOf("channel" to 0, "provider" to 0),
                                                    )
                                                ),
                                            )
                                            .build()
                                    )
                                    .context(MessageContext.builder().tenantId("tenant_id").build())
                                    .data(
                                        BaseMessage.Data.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .delay(
                                        BaseMessage.Delay.builder()
                                            .duration(0L)
                                            .until("until")
                                            .build()
                                    )
                                    .expiry(
                                        BaseMessage.Expiry.builder()
                                            .expiresIn("string")
                                            .expiresAt("expires_at")
                                            .build()
                                    )
                                    .metadata(
                                        BaseMessage.Metadata.builder()
                                            .event("event")
                                            .addTag("string")
                                            .traceId("trace_id")
                                            .utm(
                                                BaseMessage.Metadata.Utm.builder()
                                                    .campaign("campaign")
                                                    .content("content")
                                                    .medium("medium")
                                                    .source("source")
                                                    .term("term")
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .preferences(
                                        BaseMessage.Preferences.builder()
                                            .subscriptionTopicId("subscription_topic_id")
                                            .build()
                                    )
                                    .providers(
                                        BaseMessage.Providers.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(
                                                    mapOf(
                                                        "if" to "if",
                                                        "metadata" to
                                                            mapOf(
                                                                "utm" to
                                                                    mapOf(
                                                                        "campaign" to "campaign",
                                                                        "content" to "content",
                                                                        "medium" to "medium",
                                                                        "source" to "source",
                                                                        "term" to "term",
                                                                    )
                                                            ),
                                                        "override" to mapOf("foo" to "bar"),
                                                        "timeouts" to 0,
                                                    )
                                                ),
                                            )
                                            .build()
                                    )
                                    .routing(
                                        BaseMessage.Routing.builder()
                                            .addChannel("string")
                                            .method(BaseMessage.Routing.Method.ALL)
                                            .build()
                                    )
                                    .timeout(
                                        BaseMessage.Timeout.builder()
                                            .channel(
                                                BaseMessage.Timeout.Channel.builder()
                                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                                    .build()
                                            )
                                            .criteria(BaseMessage.Timeout.Criteria.NO_ESCALATION)
                                            .escalation(0L)
                                            .message(0L)
                                            .provider(
                                                BaseMessage.Timeout.Provider.builder()
                                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .template("template")
                                    .build()
                            )
                            .override(JsonValue.from(mapOf<String, Any>()))
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

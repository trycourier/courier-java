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
    fun ofAudience() {
        val audience =
            Recipient.AudienceRecipient.builder()
                .audienceId("audience_id")
                .data(
                    Recipient.AudienceRecipient.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addFilter(
                    Recipient.AudienceRecipient.Filter.builder()
                        .operator(Recipient.AudienceRecipient.Filter.Operator.MEMBER_OF)
                        .path(Recipient.AudienceRecipient.Filter.Path.ACCOUNT_ID)
                        .value("value")
                        .build()
                )
                .build()

        val recipient = Recipient.ofAudience(audience)

        assertThat(recipient.audience()).contains(audience)
        assertThat(recipient.unionMember1()).isEmpty
        assertThat(recipient.unionMember2()).isEmpty
        assertThat(recipient.user()).isEmpty
        assertThat(recipient.slack()).isEmpty
        assertThat(recipient.msTeams()).isEmpty
        assertThat(recipient.data()).isEmpty
        assertThat(recipient.pagerduty()).isEmpty
        assertThat(recipient.webhook()).isEmpty
    }

    @Test
    fun ofAudienceRoundtrip() {
        val jsonMapper = jsonMapper()
        val recipient =
            Recipient.ofAudience(
                Recipient.AudienceRecipient.builder()
                    .audienceId("audience_id")
                    .data(
                        Recipient.AudienceRecipient.Data.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addFilter(
                        Recipient.AudienceRecipient.Filter.builder()
                            .operator(Recipient.AudienceRecipient.Filter.Operator.MEMBER_OF)
                            .path(Recipient.AudienceRecipient.Filter.Path.ACCOUNT_ID)
                            .value("value")
                            .build()
                    )
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
    fun ofUnionMember1() {
        val unionMember1 =
            Recipient.UnionMember1.builder()
                .data(
                    Recipient.UnionMember1.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addFilter(
                    Recipient.UnionMember1.Filter.builder()
                        .operator(Recipient.UnionMember1.Filter.Operator.MEMBER_OF)
                        .path(Recipient.UnionMember1.Filter.Path.ACCOUNT_ID)
                        .value("value")
                        .build()
                )
                .listId("list_id")
                .build()

        val recipient = Recipient.ofUnionMember1(unionMember1)

        assertThat(recipient.audience()).isEmpty
        assertThat(recipient.unionMember1()).contains(unionMember1)
        assertThat(recipient.unionMember2()).isEmpty
        assertThat(recipient.user()).isEmpty
        assertThat(recipient.slack()).isEmpty
        assertThat(recipient.msTeams()).isEmpty
        assertThat(recipient.data()).isEmpty
        assertThat(recipient.pagerduty()).isEmpty
        assertThat(recipient.webhook()).isEmpty
    }

    @Test
    fun ofUnionMember1Roundtrip() {
        val jsonMapper = jsonMapper()
        val recipient =
            Recipient.ofUnionMember1(
                Recipient.UnionMember1.builder()
                    .data(
                        Recipient.UnionMember1.Data.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addFilter(
                        Recipient.UnionMember1.Filter.builder()
                            .operator(Recipient.UnionMember1.Filter.Operator.MEMBER_OF)
                            .path(Recipient.UnionMember1.Filter.Path.ACCOUNT_ID)
                            .value("value")
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

    @Test
    fun ofUnionMember2() {
        val unionMember2 =
            Recipient.UnionMember2.builder()
                .data(
                    Recipient.UnionMember2.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .listPattern("list_pattern")
                .build()

        val recipient = Recipient.ofUnionMember2(unionMember2)

        assertThat(recipient.audience()).isEmpty
        assertThat(recipient.unionMember1()).isEmpty
        assertThat(recipient.unionMember2()).contains(unionMember2)
        assertThat(recipient.user()).isEmpty
        assertThat(recipient.slack()).isEmpty
        assertThat(recipient.msTeams()).isEmpty
        assertThat(recipient.data()).isEmpty
        assertThat(recipient.pagerduty()).isEmpty
        assertThat(recipient.webhook()).isEmpty
    }

    @Test
    fun ofUnionMember2Roundtrip() {
        val jsonMapper = jsonMapper()
        val recipient =
            Recipient.ofUnionMember2(
                Recipient.UnionMember2.builder()
                    .data(
                        Recipient.UnionMember2.Data.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .listPattern("list_pattern")
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

        assertThat(recipient.audience()).isEmpty
        assertThat(recipient.unionMember1()).isEmpty
        assertThat(recipient.unionMember2()).isEmpty
        assertThat(recipient.user()).contains(user)
        assertThat(recipient.slack()).isEmpty
        assertThat(recipient.msTeams()).isEmpty
        assertThat(recipient.data()).isEmpty
        assertThat(recipient.pagerduty()).isEmpty
        assertThat(recipient.webhook()).isEmpty
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
    fun ofSlack() {
        val slack =
            Recipient.SlackRecipient.builder()
                .slack(
                    Recipient.SlackRecipient.Slack.SendToSlackChannel.builder()
                        .accessToken("access_token")
                        .channel("channel")
                        .build()
                )
                .build()

        val recipient = Recipient.ofSlack(slack)

        assertThat(recipient.audience()).isEmpty
        assertThat(recipient.unionMember1()).isEmpty
        assertThat(recipient.unionMember2()).isEmpty
        assertThat(recipient.user()).isEmpty
        assertThat(recipient.slack()).contains(slack)
        assertThat(recipient.msTeams()).isEmpty
        assertThat(recipient.data()).isEmpty
        assertThat(recipient.pagerduty()).isEmpty
        assertThat(recipient.webhook()).isEmpty
    }

    @Test
    fun ofSlackRoundtrip() {
        val jsonMapper = jsonMapper()
        val recipient =
            Recipient.ofSlack(
                Recipient.SlackRecipient.builder()
                    .slack(
                        Recipient.SlackRecipient.Slack.SendToSlackChannel.builder()
                            .accessToken("access_token")
                            .channel("channel")
                            .build()
                    )
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
    fun ofMsTeams() {
        val msTeams =
            Recipient.MsTeamsRecipient.builder()
                .msTeams(
                    Recipient.MsTeamsRecipient.MsTeams.SendToMsTeamsUserId.builder()
                        .serviceUrl("service_url")
                        .tenantId("tenant_id")
                        .userId("user_id")
                        .build()
                )
                .build()

        val recipient = Recipient.ofMsTeams(msTeams)

        assertThat(recipient.audience()).isEmpty
        assertThat(recipient.unionMember1()).isEmpty
        assertThat(recipient.unionMember2()).isEmpty
        assertThat(recipient.user()).isEmpty
        assertThat(recipient.slack()).isEmpty
        assertThat(recipient.msTeams()).contains(msTeams)
        assertThat(recipient.data()).isEmpty
        assertThat(recipient.pagerduty()).isEmpty
        assertThat(recipient.webhook()).isEmpty
    }

    @Test
    fun ofMsTeamsRoundtrip() {
        val jsonMapper = jsonMapper()
        val recipient =
            Recipient.ofMsTeams(
                Recipient.MsTeamsRecipient.builder()
                    .msTeams(
                        Recipient.MsTeamsRecipient.MsTeams.SendToMsTeamsUserId.builder()
                            .serviceUrl("service_url")
                            .tenantId("tenant_id")
                            .userId("user_id")
                            .build()
                    )
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
    fun ofData() {
        val data =
            Recipient.RecipientData.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val recipient = Recipient.ofData(data)

        assertThat(recipient.audience()).isEmpty
        assertThat(recipient.unionMember1()).isEmpty
        assertThat(recipient.unionMember2()).isEmpty
        assertThat(recipient.user()).isEmpty
        assertThat(recipient.slack()).isEmpty
        assertThat(recipient.msTeams()).isEmpty
        assertThat(recipient.data()).contains(data)
        assertThat(recipient.pagerduty()).isEmpty
        assertThat(recipient.webhook()).isEmpty
    }

    @Test
    fun ofDataRoundtrip() {
        val jsonMapper = jsonMapper()
        val recipient =
            Recipient.ofData(
                Recipient.RecipientData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
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
    fun ofPagerduty() {
        val pagerduty =
            Recipient.PagerdutyRecipient.builder()
                .pagerduty(
                    Recipient.PagerdutyRecipient.Pagerduty.builder()
                        .eventAction("event_action")
                        .routingKey("routing_key")
                        .severity("severity")
                        .source("source")
                        .build()
                )
                .build()

        val recipient = Recipient.ofPagerduty(pagerduty)

        assertThat(recipient.audience()).isEmpty
        assertThat(recipient.unionMember1()).isEmpty
        assertThat(recipient.unionMember2()).isEmpty
        assertThat(recipient.user()).isEmpty
        assertThat(recipient.slack()).isEmpty
        assertThat(recipient.msTeams()).isEmpty
        assertThat(recipient.data()).isEmpty
        assertThat(recipient.pagerduty()).contains(pagerduty)
        assertThat(recipient.webhook()).isEmpty
    }

    @Test
    fun ofPagerdutyRoundtrip() {
        val jsonMapper = jsonMapper()
        val recipient =
            Recipient.ofPagerduty(
                Recipient.PagerdutyRecipient.builder()
                    .pagerduty(
                        Recipient.PagerdutyRecipient.Pagerduty.builder()
                            .eventAction("event_action")
                            .routingKey("routing_key")
                            .severity("severity")
                            .source("source")
                            .build()
                    )
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
    fun ofWebhook() {
        val webhook =
            Recipient.WebhookRecipient.builder()
                .webhook(
                    Recipient.WebhookRecipient.Webhook.builder()
                        .url("url")
                        .authentication(
                            Recipient.WebhookRecipient.Webhook.Authentication.builder()
                                .mode(Recipient.WebhookRecipient.Webhook.Authentication.Mode.NONE)
                                .token("token")
                                .password("password")
                                .username("username")
                                .build()
                        )
                        .headers(
                            Recipient.WebhookRecipient.Webhook.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .method(Recipient.WebhookRecipient.Webhook.Method.POST)
                        .profile(Recipient.WebhookRecipient.Webhook.Profile.LIMITED)
                        .build()
                )
                .build()

        val recipient = Recipient.ofWebhook(webhook)

        assertThat(recipient.audience()).isEmpty
        assertThat(recipient.unionMember1()).isEmpty
        assertThat(recipient.unionMember2()).isEmpty
        assertThat(recipient.user()).isEmpty
        assertThat(recipient.slack()).isEmpty
        assertThat(recipient.msTeams()).isEmpty
        assertThat(recipient.data()).isEmpty
        assertThat(recipient.pagerduty()).isEmpty
        assertThat(recipient.webhook()).contains(webhook)
    }

    @Test
    fun ofWebhookRoundtrip() {
        val jsonMapper = jsonMapper()
        val recipient =
            Recipient.ofWebhook(
                Recipient.WebhookRecipient.builder()
                    .webhook(
                        Recipient.WebhookRecipient.Webhook.builder()
                            .url("url")
                            .authentication(
                                Recipient.WebhookRecipient.Webhook.Authentication.builder()
                                    .mode(
                                        Recipient.WebhookRecipient.Webhook.Authentication.Mode.NONE
                                    )
                                    .token("token")
                                    .password("password")
                                    .username("username")
                                    .build()
                            )
                            .headers(
                                Recipient.WebhookRecipient.Webhook.Headers.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .method(Recipient.WebhookRecipient.Webhook.Method.POST)
                            .profile(Recipient.WebhookRecipient.Webhook.Profile.LIMITED)
                            .build()
                    )
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

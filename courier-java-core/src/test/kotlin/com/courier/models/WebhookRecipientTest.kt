// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookRecipientTest {

    @Test
    fun create() {
        val webhookRecipient =
            WebhookRecipient.builder()
                .webhook(
                    WebhookProfile.builder()
                        .url("url")
                        .authentication(
                            WebhookAuthentication.builder()
                                .mode(WebhookAuthMode.NONE)
                                .token("token")
                                .password("password")
                                .username("username")
                                .build()
                        )
                        .headers(
                            WebhookProfile.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .method(WebhookMethod.POST)
                        .profile(WebhookProfileType.LIMITED)
                        .build()
                )
                .build()

        assertThat(webhookRecipient.webhook())
            .isEqualTo(
                WebhookProfile.builder()
                    .url("url")
                    .authentication(
                        WebhookAuthentication.builder()
                            .mode(WebhookAuthMode.NONE)
                            .token("token")
                            .password("password")
                            .username("username")
                            .build()
                    )
                    .headers(
                        WebhookProfile.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .method(WebhookMethod.POST)
                    .profile(WebhookProfileType.LIMITED)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookRecipient =
            WebhookRecipient.builder()
                .webhook(
                    WebhookProfile.builder()
                        .url("url")
                        .authentication(
                            WebhookAuthentication.builder()
                                .mode(WebhookAuthMode.NONE)
                                .token("token")
                                .password("password")
                                .username("username")
                                .build()
                        )
                        .headers(
                            WebhookProfile.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .method(WebhookMethod.POST)
                        .profile(WebhookProfileType.LIMITED)
                        .build()
                )
                .build()

        val roundtrippedWebhookRecipient =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookRecipient),
                jacksonTypeRef<WebhookRecipient>(),
            )

        assertThat(roundtrippedWebhookRecipient).isEqualTo(webhookRecipient)
    }
}

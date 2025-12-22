// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookProfileTest {

    @Test
    fun create() {
        val webhookProfile =
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

        assertThat(webhookProfile.url()).isEqualTo("url")
        assertThat(webhookProfile.authentication())
            .contains(
                WebhookAuthentication.builder()
                    .mode(WebhookAuthMode.NONE)
                    .token("token")
                    .password("password")
                    .username("username")
                    .build()
            )
        assertThat(webhookProfile.headers())
            .contains(
                WebhookProfile.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(webhookProfile.method()).contains(WebhookMethod.POST)
        assertThat(webhookProfile.profile()).contains(WebhookProfileType.LIMITED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookProfile =
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

        val roundtrippedWebhookProfile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookProfile),
                jacksonTypeRef<WebhookProfile>(),
            )

        assertThat(roundtrippedWebhookProfile).isEqualTo(webhookProfile)
    }
}

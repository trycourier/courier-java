// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookAuthenticationTest {

    @Test
    fun create() {
        val webhookAuthentication =
            WebhookAuthentication.builder()
                .mode(WebhookAuthMode.NONE)
                .token("token")
                .password("password")
                .username("username")
                .build()

        assertThat(webhookAuthentication.mode()).isEqualTo(WebhookAuthMode.NONE)
        assertThat(webhookAuthentication.token()).contains("token")
        assertThat(webhookAuthentication.password()).contains("password")
        assertThat(webhookAuthentication.username()).contains("username")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookAuthentication =
            WebhookAuthentication.builder()
                .mode(WebhookAuthMode.NONE)
                .token("token")
                .password("password")
                .username("username")
                .build()

        val roundtrippedWebhookAuthentication =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookAuthentication),
                jacksonTypeRef<WebhookAuthentication>(),
            )

        assertThat(roundtrippedWebhookAuthentication).isEqualTo(webhookAuthentication)
    }
}

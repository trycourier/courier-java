// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.tokens

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenRetrieveResponseTest {

    @Test
    fun create() {
        val tokenRetrieveResponse =
            TokenRetrieveResponse.builder()
                .providerKey(UserToken.ProviderKey.FIREBASE_FCM)
                .token("token")
                .device(
                    UserToken.Device.builder()
                        .adId("ad_id")
                        .appId("app_id")
                        .deviceId("device_id")
                        .manufacturer("manufacturer")
                        .model("model")
                        .platform("platform")
                        .build()
                )
                .expiryDate("string")
                .properties(JsonValue.from(mapOf<String, Any>()))
                .tracking(
                    UserToken.Tracking.builder()
                        .ip("ip")
                        .lat("lat")
                        .long_("long")
                        .osVersion("os_version")
                        .build()
                )
                .status(TokenRetrieveResponse.Status.ACTIVE)
                .statusReason("status_reason")
                .build()

        assertThat(tokenRetrieveResponse.providerKey())
            .isEqualTo(UserToken.ProviderKey.FIREBASE_FCM)
        assertThat(tokenRetrieveResponse.token()).contains("token")
        assertThat(tokenRetrieveResponse.device())
            .contains(
                UserToken.Device.builder()
                    .adId("ad_id")
                    .appId("app_id")
                    .deviceId("device_id")
                    .manufacturer("manufacturer")
                    .model("model")
                    .platform("platform")
                    .build()
            )
        assertThat(tokenRetrieveResponse.expiryDate())
            .contains(UserToken.ExpiryDate.ofString("string"))
        assertThat(tokenRetrieveResponse._properties())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(tokenRetrieveResponse.tracking())
            .contains(
                UserToken.Tracking.builder()
                    .ip("ip")
                    .lat("lat")
                    .long_("long")
                    .osVersion("os_version")
                    .build()
            )
        assertThat(tokenRetrieveResponse.status()).contains(TokenRetrieveResponse.Status.ACTIVE)
        assertThat(tokenRetrieveResponse.statusReason()).contains("status_reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenRetrieveResponse =
            TokenRetrieveResponse.builder()
                .providerKey(UserToken.ProviderKey.FIREBASE_FCM)
                .token("token")
                .device(
                    UserToken.Device.builder()
                        .adId("ad_id")
                        .appId("app_id")
                        .deviceId("device_id")
                        .manufacturer("manufacturer")
                        .model("model")
                        .platform("platform")
                        .build()
                )
                .expiryDate("string")
                .properties(JsonValue.from(mapOf<String, Any>()))
                .tracking(
                    UserToken.Tracking.builder()
                        .ip("ip")
                        .lat("lat")
                        .long_("long")
                        .osVersion("os_version")
                        .build()
                )
                .status(TokenRetrieveResponse.Status.ACTIVE)
                .statusReason("status_reason")
                .build()

        val roundtrippedTokenRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenRetrieveResponse),
                jacksonTypeRef<TokenRetrieveResponse>(),
            )

        assertThat(roundtrippedTokenRetrieveResponse).isEqualTo(tokenRetrieveResponse)
    }
}

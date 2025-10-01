// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.tokens

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenRetrieveSingleResponseTest {

    @Test
    fun create() {
        val tokenRetrieveSingleResponse =
            TokenRetrieveSingleResponse.builder()
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
                .status(TokenRetrieveSingleResponse.Status.ACTIVE)
                .statusReason("status_reason")
                .build()

        assertThat(tokenRetrieveSingleResponse.providerKey())
            .isEqualTo(UserToken.ProviderKey.FIREBASE_FCM)
        assertThat(tokenRetrieveSingleResponse.token()).contains("token")
        assertThat(tokenRetrieveSingleResponse.device())
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
        assertThat(tokenRetrieveSingleResponse.expiryDate())
            .contains(UserToken.ExpiryDate.ofString("string"))
        assertThat(tokenRetrieveSingleResponse._properties())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(tokenRetrieveSingleResponse.tracking())
            .contains(
                UserToken.Tracking.builder()
                    .ip("ip")
                    .lat("lat")
                    .long_("long")
                    .osVersion("os_version")
                    .build()
            )
        assertThat(tokenRetrieveSingleResponse.status())
            .contains(TokenRetrieveSingleResponse.Status.ACTIVE)
        assertThat(tokenRetrieveSingleResponse.statusReason()).contains("status_reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenRetrieveSingleResponse =
            TokenRetrieveSingleResponse.builder()
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
                .status(TokenRetrieveSingleResponse.Status.ACTIVE)
                .statusReason("status_reason")
                .build()

        val roundtrippedTokenRetrieveSingleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenRetrieveSingleResponse),
                jacksonTypeRef<TokenRetrieveSingleResponse>(),
            )

        assertThat(roundtrippedTokenRetrieveSingleResponse).isEqualTo(tokenRetrieveSingleResponse)
    }
}

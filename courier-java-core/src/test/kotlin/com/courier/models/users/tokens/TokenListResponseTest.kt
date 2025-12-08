// File generated from our OpenAPI spec by Stainless.

package com.courier.models.users.tokens

import com.courier.core.JsonValue
import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenListResponseTest {

    @Test
    fun create() {
        val tokenListResponse =
            TokenListResponse.builder()
                .addToken(
                    UserToken.builder()
                        .token("token")
                        .providerKey(UserToken.ProviderKey.FIREBASE_FCM)
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
                        .build()
                )
                .build()

        assertThat(tokenListResponse.tokens())
            .containsExactly(
                UserToken.builder()
                    .token("token")
                    .providerKey(UserToken.ProviderKey.FIREBASE_FCM)
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
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenListResponse =
            TokenListResponse.builder()
                .addToken(
                    UserToken.builder()
                        .token("token")
                        .providerKey(UserToken.ProviderKey.FIREBASE_FCM)
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
                        .build()
                )
                .build()

        val roundtrippedTokenListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenListResponse),
                jacksonTypeRef<TokenListResponse>(),
            )

        assertThat(roundtrippedTokenListResponse).isEqualTo(tokenListResponse)
    }
}

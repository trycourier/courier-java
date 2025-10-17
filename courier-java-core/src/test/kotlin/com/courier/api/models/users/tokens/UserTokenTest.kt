// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.tokens

import com.courier.api.core.JsonValue
import com.courier.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserTokenTest {

    @Test
    fun create() {
        val userToken =
            UserToken.builder()
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
                .build()

        assertThat(userToken.providerKey()).isEqualTo(UserToken.ProviderKey.FIREBASE_FCM)
        assertThat(userToken.token()).contains("token")
        assertThat(userToken.device())
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
        assertThat(userToken.expiryDate()).contains(UserToken.ExpiryDate.ofString("string"))
        assertThat(userToken._properties()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(userToken.tracking())
            .contains(
                UserToken.Tracking.builder()
                    .ip("ip")
                    .lat("lat")
                    .long_("long")
                    .osVersion("os_version")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userToken =
            UserToken.builder()
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
                .build()

        val roundtrippedUserToken =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userToken),
                jacksonTypeRef<UserToken>(),
            )

        assertThat(roundtrippedUserToken).isEqualTo(userToken)
    }
}

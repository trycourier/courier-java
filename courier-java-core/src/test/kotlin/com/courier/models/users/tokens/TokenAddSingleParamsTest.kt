// File generated from our OpenAPI spec by Stainless.

package com.courier.models.users.tokens

import com.courier.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenAddSingleParamsTest {

    @Test
    fun create() {
        TokenAddSingleParams.builder()
            .userId("user_id")
            .token("token")
            .providerKey(TokenAddSingleParams.ProviderKey.FIREBASE_FCM)
            .device(
                TokenAddSingleParams.Device.builder()
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
                TokenAddSingleParams.Tracking.builder()
                    .ip("ip")
                    .lat("lat")
                    .long_("long")
                    .osVersion("os_version")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TokenAddSingleParams.builder()
                .userId("user_id")
                .token("token")
                .providerKey(TokenAddSingleParams.ProviderKey.FIREBASE_FCM)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("user_id")
        assertThat(params._pathParam(1)).isEqualTo("token")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TokenAddSingleParams.builder()
                .userId("user_id")
                .token("token")
                .providerKey(TokenAddSingleParams.ProviderKey.FIREBASE_FCM)
                .device(
                    TokenAddSingleParams.Device.builder()
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
                    TokenAddSingleParams.Tracking.builder()
                        .ip("ip")
                        .lat("lat")
                        .long_("long")
                        .osVersion("os_version")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.providerKey()).isEqualTo(TokenAddSingleParams.ProviderKey.FIREBASE_FCM)
        assertThat(body.device())
            .contains(
                TokenAddSingleParams.Device.builder()
                    .adId("ad_id")
                    .appId("app_id")
                    .deviceId("device_id")
                    .manufacturer("manufacturer")
                    .model("model")
                    .platform("platform")
                    .build()
            )
        assertThat(body.expiryDate()).contains(TokenAddSingleParams.ExpiryDate.ofString("string"))
        assertThat(body._properties()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.tracking())
            .contains(
                TokenAddSingleParams.Tracking.builder()
                    .ip("ip")
                    .lat("lat")
                    .long_("long")
                    .osVersion("os_version")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TokenAddSingleParams.builder()
                .userId("user_id")
                .token("token")
                .providerKey(TokenAddSingleParams.ProviderKey.FIREBASE_FCM)
                .build()

        val body = params._body()

        assertThat(body.providerKey()).isEqualTo(TokenAddSingleParams.ProviderKey.FIREBASE_FCM)
    }
}

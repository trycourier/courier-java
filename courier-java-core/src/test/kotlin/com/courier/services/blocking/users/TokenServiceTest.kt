// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.users

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.users.tokens.TokenAddSingleParams
import com.courier.models.users.tokens.TokenDeleteParams
import com.courier.models.users.tokens.TokenRetrieveParams
import com.courier.models.users.tokens.TokenUpdateParams
import com.courier.models.users.tokens.UserToken
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TokenServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tokenService = client.users().tokens()

        val token =
            tokenService.retrieve(
                TokenRetrieveParams.builder().userId("user_id").token("token").build()
            )

        token.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tokenService = client.users().tokens()

        tokenService.update(
            TokenUpdateParams.builder()
                .userId("user_id")
                .token("token")
                .addPatch(
                    TokenUpdateParams.Patch.builder().op("op").path("path").value("value").build()
                )
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tokenService = client.users().tokens()

        val userTokens = tokenService.list("user_id")

        userTokens.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tokenService = client.users().tokens()

        tokenService.delete(TokenDeleteParams.builder().userId("user_id").token("token").build())
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun addMultiple() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tokenService = client.users().tokens()

        tokenService.addMultiple("user_id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun addSingle() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tokenService = client.users().tokens()

        tokenService.addSingle(
            TokenAddSingleParams.builder()
                .userId("user_id")
                .pathToken("token")
                .userToken(
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
        )
    }
}

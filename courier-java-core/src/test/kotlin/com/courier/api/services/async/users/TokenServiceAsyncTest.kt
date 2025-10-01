// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.users

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClientAsync
import com.courier.api.core.JsonValue
import com.courier.api.models.users.tokens.TokenAddSingleParams
import com.courier.api.models.users.tokens.TokenDeleteParams
import com.courier.api.models.users.tokens.TokenRetrieveSingleParams
import com.courier.api.models.users.tokens.TokenUpdateParams
import com.courier.api.models.users.tokens.UserToken
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TokenServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tokenServiceAsync = client.users().tokens()

        val future =
            tokenServiceAsync.update(
                TokenUpdateParams.builder()
                    .userId("user_id")
                    .token("token")
                    .addPatch(
                        TokenUpdateParams.Patch.builder()
                            .op("op")
                            .path("path")
                            .value("value")
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tokenServiceAsync = client.users().tokens()

        val userTokensFuture = tokenServiceAsync.list("user_id")

        val userTokens = userTokensFuture.get()
        userTokens.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tokenServiceAsync = client.users().tokens()

        val future =
            tokenServiceAsync.delete(
                TokenDeleteParams.builder().userId("user_id").token("token").build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun addMultiple() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tokenServiceAsync = client.users().tokens()

        val future = tokenServiceAsync.addMultiple("user_id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun addSingle() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tokenServiceAsync = client.users().tokens()

        val future =
            tokenServiceAsync.addSingle(
                TokenAddSingleParams.builder()
                    .userId("user_id")
                    .pathToken("token")
                    .userToken(
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
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSingle() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val tokenServiceAsync = client.users().tokens()

        val responseFuture =
            tokenServiceAsync.retrieveSingle(
                TokenRetrieveSingleParams.builder().userId("user_id").token("token").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}

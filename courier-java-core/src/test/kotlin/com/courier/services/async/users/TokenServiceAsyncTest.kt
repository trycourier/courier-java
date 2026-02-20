// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.users

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.core.JsonValue
import com.courier.models.users.tokens.TokenAddSingleParams
import com.courier.models.users.tokens.TokenDeleteParams
import com.courier.models.users.tokens.TokenRetrieveParams
import com.courier.models.users.tokens.TokenUpdateParams
import com.courier.models.users.tokens.UserToken
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TokenServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tokenServiceAsync = client.users().tokens()

        val tokenFuture =
            tokenServiceAsync.retrieve(
                TokenRetrieveParams.builder().userId("user_id").token("token").build()
            )

        val token = tokenFuture.get()
        token.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tokenServiceAsync = client.users().tokens()

        val tokensFuture = tokenServiceAsync.list("user_id")

        val tokens = tokensFuture.get()
        tokens.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tokenServiceAsync = client.users().tokens()

        val future =
            tokenServiceAsync.delete(
                TokenDeleteParams.builder().userId("user_id").token("token").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun addMultiple() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tokenServiceAsync = client.users().tokens()

        val future = tokenServiceAsync.addMultiple("user_id")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun addSingle() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val tokenServiceAsync = client.users().tokens()

        val future =
            tokenServiceAsync.addSingle(
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

        val response = future.get()
    }
}

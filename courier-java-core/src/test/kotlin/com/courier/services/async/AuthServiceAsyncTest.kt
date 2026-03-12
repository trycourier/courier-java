// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.auth.AuthIssueTokenParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AuthServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun issueToken() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val authServiceAsync = client.auth()

        val responseFuture =
            authServiceAsync.issueToken(
                AuthIssueTokenParams.builder()
                    .expiresIn("\$YOUR_NUMBER days")
                    .scope(
                        "user_id:\$YOUR_USER_ID write:user-tokens inbox:read:messages inbox:write:events read:preferences write:preferences read:brands"
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}

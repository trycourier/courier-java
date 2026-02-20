// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.auth.AuthIssueTokenParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AuthServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun issueToken() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val authService = client.auth()

        val response =
            authService.issueToken(
                AuthIssueTokenParams.builder()
                    .expiresIn("\$YOUR_NUMBER days")
                    .scope(
                        "user_id:\$YOUR_USER_ID write:user-tokens inbox:read:messages inbox:write:events read:preferences write:preferences read:brands"
                    )
                    .build()
            )

        response.validate()
    }
}

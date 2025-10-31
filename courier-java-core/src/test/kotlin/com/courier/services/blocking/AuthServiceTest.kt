// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.auth.AuthIssueTokenParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AuthServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun issueToken() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authService = client.auth()

        val response =
            authService.issueToken(
                AuthIssueTokenParams.builder().expiresIn("expires_in").scope("scope").build()
            )

        response.validate()
    }
}

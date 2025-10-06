// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClientAsync
import com.courier.api.models.auth.AuthIssueTokenParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AuthServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun issueToken() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val authServiceAsync = client.auth()

        val responseFuture =
            authServiceAsync.issueToken(
                AuthIssueTokenParams.builder().expiresIn("expires_in").scope("scope").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}

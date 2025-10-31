// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.translations.TranslationRetrieveParams
import com.courier.models.translations.TranslationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TranslationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val translationServiceAsync = client.translations()

        val translationFuture =
            translationServiceAsync.retrieve(
                TranslationRetrieveParams.builder().domain("domain").locale("locale").build()
            )

        val translation = translationFuture.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val translationServiceAsync = client.translations()

        val future =
            translationServiceAsync.update(
                TranslationUpdateParams.builder()
                    .domain("domain")
                    .locale("locale")
                    .body("body")
                    .build()
            )

        val response = future.get()
    }
}

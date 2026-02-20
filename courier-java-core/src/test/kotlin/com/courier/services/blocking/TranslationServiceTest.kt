// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.translations.TranslationRetrieveParams
import com.courier.models.translations.TranslationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TranslationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val translationService = client.translations()

        translationService.retrieve(
            TranslationRetrieveParams.builder().domain("domain").locale("locale").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val translationService = client.translations()

        translationService.update(
            TranslationUpdateParams.builder().domain("domain").locale("locale").body("body").build()
        )
    }
}

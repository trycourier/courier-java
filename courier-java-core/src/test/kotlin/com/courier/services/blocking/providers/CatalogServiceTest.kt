// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.providers

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.providers.catalog.CatalogListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CatalogServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val catalogService = client.providers().catalog()

        val catalogs =
            catalogService.list(
                CatalogListParams.builder().channel("channel").keys("keys").name("name").build()
            )

        catalogs.validate()
    }
}

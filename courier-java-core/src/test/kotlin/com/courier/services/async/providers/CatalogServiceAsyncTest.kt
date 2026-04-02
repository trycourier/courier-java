// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.providers

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.providers.catalog.CatalogListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CatalogServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val catalogServiceAsync = client.providers().catalog()

        val catalogsFuture =
            catalogServiceAsync.list(
                CatalogListParams.builder().channel("channel").keys("keys").name("name").build()
            )

        val catalogs = catalogsFuture.get()
        catalogs.validate()
    }
}

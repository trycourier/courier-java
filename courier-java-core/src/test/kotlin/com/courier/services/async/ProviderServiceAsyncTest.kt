// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.core.JsonValue
import com.courier.models.providers.ProviderCreateParams
import com.courier.models.providers.ProviderListParams
import com.courier.models.providers.ProviderUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProviderServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val providerServiceAsync = client.providers()

        val providerFuture =
            providerServiceAsync.create(
                ProviderCreateParams.builder()
                    .provider("provider")
                    .alias("alias")
                    .settings(
                        ProviderCreateParams.Settings.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .title("title")
                    .build()
            )

        val provider = providerFuture.get()
        provider.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val providerServiceAsync = client.providers()

        val providerFuture = providerServiceAsync.retrieve("id")

        val provider = providerFuture.get()
        provider.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val providerServiceAsync = client.providers()

        val providerFuture =
            providerServiceAsync.update(
                ProviderUpdateParams.builder()
                    .id("id")
                    .provider("provider")
                    .alias("alias")
                    .settings(
                        ProviderUpdateParams.Settings.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .title("title")
                    .build()
            )

        val provider = providerFuture.get()
        provider.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val providerServiceAsync = client.providers()

        val providersFuture =
            providerServiceAsync.list(ProviderListParams.builder().cursor("cursor").build())

        val providers = providersFuture.get()
        providers.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val providerServiceAsync = client.providers()

        val future = providerServiceAsync.delete("id")

        val response = future.get()
    }
}

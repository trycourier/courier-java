// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.core.JsonValue
import com.courier.models.providers.ProviderCreateParams
import com.courier.models.providers.ProviderListParams
import com.courier.models.providers.ProviderUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProviderServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val providerService = client.providers()

        val provider =
            providerService.create(
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

        provider.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val providerService = client.providers()

        val provider = providerService.retrieve("id")

        provider.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val providerService = client.providers()

        val provider =
            providerService.update(
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

        provider.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val providerService = client.providers()

        val providers = providerService.list(ProviderListParams.builder().cursor("cursor").build())

        providers.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val providerService = client.providers()

        providerService.delete("id")
    }
}

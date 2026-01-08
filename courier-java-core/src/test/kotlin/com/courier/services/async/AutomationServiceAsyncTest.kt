// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.automations.AutomationListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AutomationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val automationServiceAsync = client.automations()

        val automationTemplateListResponseFuture =
            automationServiceAsync.list(
                AutomationListParams.builder()
                    .cursor("cursor")
                    .version(AutomationListParams.Version.PUBLISHED)
                    .build()
            )

        val automationTemplateListResponse = automationTemplateListResponseFuture.get()
        automationTemplateListResponse.validate()
    }
}

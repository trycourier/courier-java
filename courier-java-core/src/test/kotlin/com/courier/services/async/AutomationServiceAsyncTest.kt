// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.models.automations.AutomationListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AutomationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
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

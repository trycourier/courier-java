// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.automations.AutomationListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AutomationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val automationService = client.automations()

        val automationTemplateListResponse =
            automationService.list(
                AutomationListParams.builder()
                    .cursor("cursor")
                    .version(AutomationListParams.Version.PUBLISHED)
                    .build()
            )

        automationTemplateListResponse.validate()
    }
}

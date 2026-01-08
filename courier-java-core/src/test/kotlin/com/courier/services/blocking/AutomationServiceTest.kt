// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.TestServerExtension
import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.automations.AutomationListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AutomationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

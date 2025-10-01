// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClient
import com.courier.api.core.JsonValue
import com.courier.api.models.automations.AutomationInvokeAdHocParams
import com.courier.api.models.automations.AutomationInvokeByTemplateParams
import com.courier.api.models.automations.invoke.AutomationInvokeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AutomationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun invokeAdHoc() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val automationService = client.automations()

        val automationInvokeResponse =
            automationService.invokeAdHoc(
                AutomationInvokeAdHocParams.builder()
                    .brand("brand")
                    .data(
                        AutomationInvokeParams.Data.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .profile(JsonValue.from(mapOf<String, Any>()))
                    .recipient("recipient")
                    .template("template")
                    .automation(
                        AutomationInvokeAdHocParams.Automation.builder()
                            .addStep(
                                AutomationInvokeAdHocParams.Automation.Step
                                    .AutomationAddToDigestStep
                                    .builder()
                                    .if_("if")
                                    .ref("ref")
                                    .action(
                                        AutomationInvokeAdHocParams.Automation.Step
                                            .AutomationAddToDigestStep
                                            .Action
                                            .ADD_TO_DIGEST
                                    )
                                    .subscriptionTopicId("RAJE97CMT04KDJJ88ZDS2TP1690S")
                                    .build()
                            )
                            .cancelationToken("cancelation_token")
                            .build()
                    )
                    .build()
            )

        automationInvokeResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun invokeByTemplate() {
        val client =
            CourierOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val automationService = client.automations()

        val automationInvokeResponse =
            automationService.invokeByTemplate(
                AutomationInvokeByTemplateParams.builder()
                    .templateId("templateId")
                    .automationInvokeParams(
                        AutomationInvokeParams.builder()
                            .brand("brand")
                            .data(
                                AutomationInvokeParams.Data.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .profile(JsonValue.from(mapOf<String, Any>()))
                            .recipient("recipient")
                            .template("template")
                            .build()
                    )
                    .build()
            )

        automationInvokeResponse.validate()
    }
}

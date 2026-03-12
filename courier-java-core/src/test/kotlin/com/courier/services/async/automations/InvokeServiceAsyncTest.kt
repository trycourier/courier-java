// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async.automations

import com.courier.client.okhttp.CourierOkHttpClientAsync
import com.courier.core.JsonValue
import com.courier.models.automations.invoke.InvokeInvokeAdHocParams
import com.courier.models.automations.invoke.InvokeInvokeByTemplateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InvokeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun invokeAdHoc() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val invokeServiceAsync = client.automations().invoke()

        val automationInvokeResponseFuture =
            invokeServiceAsync.invokeAdHoc(
                InvokeInvokeAdHocParams.builder()
                    .automation(
                        InvokeInvokeAdHocParams.Automation.builder()
                            .addStep(
                                InvokeInvokeAdHocParams.Automation.Step.AutomationDelayStep
                                    .builder()
                                    .action(
                                        InvokeInvokeAdHocParams.Automation.Step.AutomationDelayStep
                                            .Action
                                            .DELAY
                                    )
                                    .duration("duration")
                                    .until("20240408T080910.123")
                                    .build()
                            )
                            .addStep(
                                InvokeInvokeAdHocParams.Automation.Step.AutomationSendStep.builder()
                                    .action(
                                        InvokeInvokeAdHocParams.Automation.Step.AutomationSendStep
                                            .Action
                                            .SEND
                                    )
                                    .brand("brand")
                                    .data(
                                        InvokeInvokeAdHocParams.Automation.Step.AutomationSendStep
                                            .Data
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .profile(
                                        InvokeInvokeAdHocParams.Automation.Step.AutomationSendStep
                                            .Profile
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .recipient("recipient")
                                    .template("64TP5HKPFTM8VTK1Y75SJDQX9JK0")
                                    .build()
                            )
                            .cancelationToken("delay-send--user-yes--abc-123")
                            .build()
                    )
                    .brand("brand")
                    .data(
                        InvokeInvokeAdHocParams.Data.builder()
                            .putAdditionalProperty("name", JsonValue.from("bar"))
                            .build()
                    )
                    .profile(
                        InvokeInvokeAdHocParams.Profile.builder()
                            .putAdditionalProperty("tenant_id", JsonValue.from("bar"))
                            .build()
                    )
                    .recipient("user-yes")
                    .template("template")
                    .build()
            )

        val automationInvokeResponse = automationInvokeResponseFuture.get()
        automationInvokeResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun invokeByTemplate() {
        val client = CourierOkHttpClientAsync.builder().apiKey("My API Key").build()
        val invokeServiceAsync = client.automations().invoke()

        val automationInvokeResponseFuture =
            invokeServiceAsync.invokeByTemplate(
                InvokeInvokeByTemplateParams.builder()
                    .templateId("templateId")
                    .recipient("recipient")
                    .brand("brand")
                    .data(
                        InvokeInvokeByTemplateParams.Data.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .profile(
                        InvokeInvokeByTemplateParams.Profile.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .template("template")
                    .build()
            )

        val automationInvokeResponse = automationInvokeResponseFuture.get()
        automationInvokeResponse.validate()
    }
}

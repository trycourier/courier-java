// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.automations

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClientAsync
import com.courier.api.core.JsonValue
import com.courier.api.models.automations.invoke.AutomationInvokeParams
import com.courier.api.models.automations.invoke.InvokeInvokeAdHocParams
import com.courier.api.models.automations.invoke.InvokeInvokeByTemplateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InvokeServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun invokeAdHoc() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invokeServiceAsync = client.automations().invoke()

        val automationInvokeResponseFuture =
            invokeServiceAsync.invokeAdHoc(
                InvokeInvokeAdHocParams.builder()
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
                        InvokeInvokeAdHocParams.Automation.builder()
                            .addStep(
                                InvokeInvokeAdHocParams.Automation.Step.AutomationAddToDigestStep
                                    .builder()
                                    .if_("if")
                                    .ref("ref")
                                    .action(
                                        InvokeInvokeAdHocParams.Automation.Step
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

        val automationInvokeResponse = automationInvokeResponseFuture.get()
        automationInvokeResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun invokeByTemplate() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val invokeServiceAsync = client.automations().invoke()

        val automationInvokeResponseFuture =
            invokeServiceAsync.invokeByTemplate(
                InvokeInvokeByTemplateParams.builder()
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

        val automationInvokeResponse = automationInvokeResponseFuture.get()
        automationInvokeResponse.validate()
    }
}

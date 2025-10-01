// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.automations

import com.courier.api.core.JsonValue
import com.courier.api.models.automations.invoke.AutomationInvokeParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutomationInvokeAdHocParamsTest {

    @Test
    fun create() {
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
                        AutomationInvokeAdHocParams.Automation.Step.AutomationAddToDigestStep
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
    }

    @Test
    fun body() {
        val params =
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
                            AutomationInvokeAdHocParams.Automation.Step.AutomationAddToDigestStep
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

        val body = params._body()

        assertThat(body.brand()).contains("brand")
        assertThat(body.data())
            .contains(
                AutomationInvokeParams.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body._profile()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.recipient()).contains("recipient")
        assertThat(body.template()).contains("template")
        assertThat(body.automation())
            .isEqualTo(
                AutomationInvokeAdHocParams.Automation.builder()
                    .addStep(
                        AutomationInvokeAdHocParams.Automation.Step.AutomationAddToDigestStep
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AutomationInvokeAdHocParams.builder()
                .automation(
                    AutomationInvokeAdHocParams.Automation.builder()
                        .addStep(
                            AutomationInvokeAdHocParams.Automation.Step.AutomationAddToDigestStep
                                .builder()
                                .action(
                                    AutomationInvokeAdHocParams.Automation.Step
                                        .AutomationAddToDigestStep
                                        .Action
                                        .ADD_TO_DIGEST
                                )
                                .subscriptionTopicId("RAJE97CMT04KDJJ88ZDS2TP1690S")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.automation())
            .isEqualTo(
                AutomationInvokeAdHocParams.Automation.builder()
                    .addStep(
                        AutomationInvokeAdHocParams.Automation.Step.AutomationAddToDigestStep
                            .builder()
                            .action(
                                AutomationInvokeAdHocParams.Automation.Step
                                    .AutomationAddToDigestStep
                                    .Action
                                    .ADD_TO_DIGEST
                            )
                            .subscriptionTopicId("RAJE97CMT04KDJJ88ZDS2TP1690S")
                            .build()
                    )
                    .build()
            )
    }
}

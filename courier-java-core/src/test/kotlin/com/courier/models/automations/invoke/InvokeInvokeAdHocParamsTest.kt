// File generated from our OpenAPI spec by Stainless.

package com.courier.models.automations.invoke

import com.courier.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvokeInvokeAdHocParamsTest {

    @Test
    fun create() {
        InvokeInvokeAdHocParams.builder()
            .automation(
                InvokeInvokeAdHocParams.Automation.builder()
                    .addStep(
                        InvokeInvokeAdHocParams.Automation.Step.AutomationDelayStep.builder()
                            .action(
                                InvokeInvokeAdHocParams.Automation.Step.AutomationDelayStep.Action
                                    .DELAY
                            )
                            .duration("duration")
                            .until("20240408T080910.123")
                            .build()
                    )
                    .addStep(
                        InvokeInvokeAdHocParams.Automation.Step.AutomationSendStep.builder()
                            .action(
                                InvokeInvokeAdHocParams.Automation.Step.AutomationSendStep.Action
                                    .SEND
                            )
                            .brand("brand")
                            .data(
                                InvokeInvokeAdHocParams.Automation.Step.AutomationSendStep.Data
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .profile(
                                InvokeInvokeAdHocParams.Automation.Step.AutomationSendStep.Profile
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
    }

    @Test
    fun body() {
        val params =
            InvokeInvokeAdHocParams.builder()
                .automation(
                    InvokeInvokeAdHocParams.Automation.builder()
                        .addStep(
                            InvokeInvokeAdHocParams.Automation.Step.AutomationDelayStep.builder()
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
                                    InvokeInvokeAdHocParams.Automation.Step.AutomationSendStep.Data
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

        val body = params._body()

        assertThat(body.automation())
            .isEqualTo(
                InvokeInvokeAdHocParams.Automation.builder()
                    .addStep(
                        InvokeInvokeAdHocParams.Automation.Step.AutomationDelayStep.builder()
                            .action(
                                InvokeInvokeAdHocParams.Automation.Step.AutomationDelayStep.Action
                                    .DELAY
                            )
                            .duration("duration")
                            .until("20240408T080910.123")
                            .build()
                    )
                    .addStep(
                        InvokeInvokeAdHocParams.Automation.Step.AutomationSendStep.builder()
                            .action(
                                InvokeInvokeAdHocParams.Automation.Step.AutomationSendStep.Action
                                    .SEND
                            )
                            .brand("brand")
                            .data(
                                InvokeInvokeAdHocParams.Automation.Step.AutomationSendStep.Data
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .profile(
                                InvokeInvokeAdHocParams.Automation.Step.AutomationSendStep.Profile
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
        assertThat(body.brand()).contains("brand")
        assertThat(body.data())
            .contains(
                InvokeInvokeAdHocParams.Data.builder()
                    .putAdditionalProperty("name", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.profile())
            .contains(
                InvokeInvokeAdHocParams.Profile.builder()
                    .putAdditionalProperty("tenant_id", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.recipient()).contains("user-yes")
        assertThat(body.template()).contains("template")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InvokeInvokeAdHocParams.builder()
                .automation(
                    InvokeInvokeAdHocParams.Automation.builder()
                        .addStep(
                            InvokeInvokeAdHocParams.Automation.Step.AutomationDelayStep.builder()
                                .action(
                                    InvokeInvokeAdHocParams.Automation.Step.AutomationDelayStep
                                        .Action
                                        .DELAY
                                )
                                .build()
                        )
                        .addStep(
                            InvokeInvokeAdHocParams.Automation.Step.AutomationSendStep.builder()
                                .action(
                                    InvokeInvokeAdHocParams.Automation.Step.AutomationSendStep
                                        .Action
                                        .SEND
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.automation())
            .isEqualTo(
                InvokeInvokeAdHocParams.Automation.builder()
                    .addStep(
                        InvokeInvokeAdHocParams.Automation.Step.AutomationDelayStep.builder()
                            .action(
                                InvokeInvokeAdHocParams.Automation.Step.AutomationDelayStep.Action
                                    .DELAY
                            )
                            .build()
                    )
                    .addStep(
                        InvokeInvokeAdHocParams.Automation.Step.AutomationSendStep.builder()
                            .action(
                                InvokeInvokeAdHocParams.Automation.Step.AutomationSendStep.Action
                                    .SEND
                            )
                            .build()
                    )
                    .build()
            )
    }
}

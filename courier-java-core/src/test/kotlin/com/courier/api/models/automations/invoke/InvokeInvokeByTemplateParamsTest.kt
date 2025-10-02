// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.automations.invoke

import com.courier.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvokeInvokeByTemplateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            InvokeInvokeByTemplateParams.builder()
                .templateId("templateId")
                .automationInvokeParams(AutomationInvokeParams.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("templateId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InvokeInvokeByTemplateParams.builder()
                .templateId("templateId")
                .automationInvokeParams(AutomationInvokeParams.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(AutomationInvokeParams.builder().build())
    }
}

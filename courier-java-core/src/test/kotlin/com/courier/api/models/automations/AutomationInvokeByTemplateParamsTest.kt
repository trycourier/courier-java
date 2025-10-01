// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.automations

import com.courier.api.core.JsonValue
import com.courier.api.models.automations.invoke.AutomationInvokeParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AutomationInvokeByTemplateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            AutomationInvokeByTemplateParams.builder()
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
            AutomationInvokeByTemplateParams.builder()
                .templateId("templateId")
                .automationInvokeParams(AutomationInvokeParams.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(AutomationInvokeParams.builder().build())
    }
}

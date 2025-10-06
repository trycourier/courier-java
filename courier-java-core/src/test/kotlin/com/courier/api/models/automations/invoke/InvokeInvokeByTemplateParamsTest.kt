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
    }

    @Test
    fun pathParams() {
        val params =
            InvokeInvokeByTemplateParams.builder()
                .templateId("templateId")
                .recipient("recipient")
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

        val body = params._body()

        assertThat(body.recipient()).contains("recipient")
        assertThat(body.brand()).contains("brand")
        assertThat(body.data())
            .contains(
                InvokeInvokeByTemplateParams.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.profile())
            .contains(
                InvokeInvokeByTemplateParams.Profile.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.template()).contains("template")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InvokeInvokeByTemplateParams.builder()
                .templateId("templateId")
                .recipient("recipient")
                .build()

        val body = params._body()

        assertThat(body.recipient()).contains("recipient")
    }
}

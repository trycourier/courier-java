// File generated from our OpenAPI spec by Stainless.

package com.courier.models.automations.invoke

import com.courier.core.JsonValue
import com.courier.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvokeInvokeByTemplateParamsTest {

    @Test
    fun create() {
        InvokeInvokeByTemplateParams.builder()
            .templateId("templateId")
            .idempotencyKey("order-ORD-456-user-123")
            .xIdempotencyExpiration("1785312000")
            .recipient("user_abc")
            .brand("brand")
            .data(
                InvokeInvokeByTemplateParams.Data.builder()
                    .putAdditionalProperty("orderId", JsonValue.from("bar"))
                    .build()
            )
            .profile(
                InvokeInvokeByTemplateParams.Profile.builder()
                    .putAdditionalProperty("email", JsonValue.from("bar"))
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
                .recipient("user_abc")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("templateId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            InvokeInvokeByTemplateParams.builder()
                .templateId("templateId")
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .recipient("user_abc")
                .brand("brand")
                .data(
                    InvokeInvokeByTemplateParams.Data.builder()
                        .putAdditionalProperty("orderId", JsonValue.from("bar"))
                        .build()
                )
                .profile(
                    InvokeInvokeByTemplateParams.Profile.builder()
                        .putAdditionalProperty("email", JsonValue.from("bar"))
                        .build()
                )
                .template("template")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("Idempotency-Key", "order-ORD-456-user-123")
                    .put("x-idempotency-expiration", "1785312000")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            InvokeInvokeByTemplateParams.builder()
                .templateId("templateId")
                .recipient("user_abc")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            InvokeInvokeByTemplateParams.builder()
                .templateId("templateId")
                .idempotencyKey("order-ORD-456-user-123")
                .xIdempotencyExpiration("1785312000")
                .recipient("user_abc")
                .brand("brand")
                .data(
                    InvokeInvokeByTemplateParams.Data.builder()
                        .putAdditionalProperty("orderId", JsonValue.from("bar"))
                        .build()
                )
                .profile(
                    InvokeInvokeByTemplateParams.Profile.builder()
                        .putAdditionalProperty("email", JsonValue.from("bar"))
                        .build()
                )
                .template("template")
                .build()

        val body = params._body()

        assertThat(body.recipient()).contains("user_abc")
        assertThat(body.brand()).contains("brand")
        assertThat(body.data())
            .contains(
                InvokeInvokeByTemplateParams.Data.builder()
                    .putAdditionalProperty("orderId", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.profile())
            .contains(
                InvokeInvokeByTemplateParams.Profile.builder()
                    .putAdditionalProperty("email", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.template()).contains("template")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InvokeInvokeByTemplateParams.builder()
                .templateId("templateId")
                .recipient("user_abc")
                .build()

        val body = params._body()

        assertThat(body.recipient()).contains("user_abc")
    }
}

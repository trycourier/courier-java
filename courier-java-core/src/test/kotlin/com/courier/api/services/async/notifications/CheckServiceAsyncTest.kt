// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.notifications

import com.courier.api.TestServerExtension
import com.courier.api.client.okhttp.CourierOkHttpClientAsync
import com.courier.api.models.notifications.checks.BaseCheck
import com.courier.api.models.notifications.checks.CheckDeleteParams
import com.courier.api.models.notifications.checks.CheckListParams
import com.courier.api.models.notifications.checks.CheckUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CheckServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkServiceAsync = client.notifications().checks()

        val checkFuture =
            checkServiceAsync.update(
                CheckUpdateParams.builder()
                    .id("id")
                    .submissionId("submissionId")
                    .addCheck(
                        BaseCheck.builder()
                            .id("id")
                            .status(BaseCheck.Status.RESOLVED)
                            .type(BaseCheck.Type.CUSTOM)
                            .build()
                    )
                    .build()
            )

        val check = checkFuture.get()
        check.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkServiceAsync = client.notifications().checks()

        val checksFuture =
            checkServiceAsync.list(
                CheckListParams.builder().id("id").submissionId("submissionId").build()
            )

        val checks = checksFuture.get()
        checks.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CourierOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkServiceAsync = client.notifications().checks()

        val future =
            checkServiceAsync.delete(
                CheckDeleteParams.builder().id("id").submissionId("submissionId").build()
            )

        val response = future.get()
    }
}

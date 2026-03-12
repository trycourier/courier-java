// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.notifications

import com.courier.client.okhttp.CourierOkHttpClient
import com.courier.models.notifications.BaseCheck
import com.courier.models.notifications.checks.CheckDeleteParams
import com.courier.models.notifications.checks.CheckListParams
import com.courier.models.notifications.checks.CheckUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CheckServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val checkService = client.notifications().checks()

        val check =
            checkService.update(
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

        check.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val checkService = client.notifications().checks()

        val checks =
            checkService.list(
                CheckListParams.builder().id("id").submissionId("submissionId").build()
            )

        checks.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = CourierOkHttpClient.builder().apiKey("My API Key").build()
        val checkService = client.notifications().checks()

        checkService.delete(
            CheckDeleteParams.builder().id("id").submissionId("submissionId").build()
        )
    }
}

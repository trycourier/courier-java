// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.core.ClientOptions
import com.courier.services.blocking.digests.ScheduleService
import com.courier.services.blocking.digests.ScheduleServiceImpl
import java.util.function.Consumer

class DigestServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DigestService {

    private val withRawResponse: DigestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val schedules: ScheduleService by lazy { ScheduleServiceImpl(clientOptions) }

    override fun withRawResponse(): DigestService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DigestService =
        DigestServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun schedules(): ScheduleService = schedules

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DigestService.WithRawResponse {

        private val schedules: ScheduleService.WithRawResponse by lazy {
            ScheduleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DigestService.WithRawResponse =
            DigestServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun schedules(): ScheduleService.WithRawResponse = schedules
    }
}

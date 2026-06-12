// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.services.async.digests.ScheduleServiceAsync
import com.courier.services.async.digests.ScheduleServiceAsyncImpl
import java.util.function.Consumer

class DigestServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DigestServiceAsync {

    private val withRawResponse: DigestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val schedules: ScheduleServiceAsync by lazy { ScheduleServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): DigestServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DigestServiceAsync =
        DigestServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun schedules(): ScheduleServiceAsync = schedules

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DigestServiceAsync.WithRawResponse {

        private val schedules: ScheduleServiceAsync.WithRawResponse by lazy {
            ScheduleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DigestServiceAsync.WithRawResponse =
            DigestServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun schedules(): ScheduleServiceAsync.WithRawResponse = schedules
    }
}

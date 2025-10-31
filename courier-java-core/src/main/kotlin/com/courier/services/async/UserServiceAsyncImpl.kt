// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.services.async.users.PreferenceServiceAsync
import com.courier.services.async.users.PreferenceServiceAsyncImpl
import com.courier.services.async.users.TenantServiceAsync
import com.courier.services.async.users.TenantServiceAsyncImpl
import com.courier.services.async.users.TokenServiceAsync
import com.courier.services.async.users.TokenServiceAsyncImpl
import java.util.function.Consumer

class UserServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UserServiceAsync {

    private val withRawResponse: UserServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val preferences: PreferenceServiceAsync by lazy {
        PreferenceServiceAsyncImpl(clientOptions)
    }

    private val tenants: TenantServiceAsync by lazy { TenantServiceAsyncImpl(clientOptions) }

    private val tokens: TokenServiceAsync by lazy { TokenServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): UserServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync =
        UserServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun preferences(): PreferenceServiceAsync = preferences

    override fun tenants(): TenantServiceAsync = tenants

    override fun tokens(): TokenServiceAsync = tokens

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserServiceAsync.WithRawResponse {

        private val preferences: PreferenceServiceAsync.WithRawResponse by lazy {
            PreferenceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tenants: TenantServiceAsync.WithRawResponse by lazy {
            TenantServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tokens: TokenServiceAsync.WithRawResponse by lazy {
            TokenServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserServiceAsync.WithRawResponse =
            UserServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun preferences(): PreferenceServiceAsync.WithRawResponse = preferences

        override fun tenants(): TenantServiceAsync.WithRawResponse = tenants

        override fun tokens(): TokenServiceAsync.WithRawResponse = tokens
    }
}

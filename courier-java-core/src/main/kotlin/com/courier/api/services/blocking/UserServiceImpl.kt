// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.core.ClientOptions
import com.courier.api.services.blocking.users.PreferenceService
import com.courier.api.services.blocking.users.PreferenceServiceImpl
import com.courier.api.services.blocking.users.TenantService
import com.courier.api.services.blocking.users.TenantServiceImpl
import com.courier.api.services.blocking.users.TokenService
import com.courier.api.services.blocking.users.TokenServiceImpl
import java.util.function.Consumer

class UserServiceImpl internal constructor(private val clientOptions: ClientOptions) : UserService {

    private val withRawResponse: UserService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val preferences: PreferenceService by lazy { PreferenceServiceImpl(clientOptions) }

    private val tenants: TenantService by lazy { TenantServiceImpl(clientOptions) }

    private val tokens: TokenService by lazy { TokenServiceImpl(clientOptions) }

    override fun withRawResponse(): UserService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService =
        UserServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun preferences(): PreferenceService = preferences

    override fun tenants(): TenantService = tenants

    override fun tokens(): TokenService = tokens

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserService.WithRawResponse {

        private val preferences: PreferenceService.WithRawResponse by lazy {
            PreferenceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tenants: TenantService.WithRawResponse by lazy {
            TenantServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tokens: TokenService.WithRawResponse by lazy {
            TokenServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserService.WithRawResponse =
            UserServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun preferences(): PreferenceService.WithRawResponse = preferences

        override fun tenants(): TenantService.WithRawResponse = tenants

        override fun tokens(): TokenService.WithRawResponse = tokens
    }
}

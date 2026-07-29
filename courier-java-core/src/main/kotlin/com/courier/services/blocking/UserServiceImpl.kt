// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.core.ClientOptions
import com.courier.services.blocking.users.PreferenceService
import com.courier.services.blocking.users.PreferenceServiceImpl
import com.courier.services.blocking.users.TenantService
import com.courier.services.blocking.users.TenantServiceImpl
import com.courier.services.blocking.users.TokenService
import com.courier.services.blocking.users.TokenServiceImpl
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

    /** Read and write a single user's notification preferences, per topic and per channel. */
    override fun preferences(): PreferenceService = preferences

    /** Associate a user with one or more tenants, and read or remove those associations. */
    override fun tenants(): TenantService = tenants

    /**
     * Register and manage the APNS and FCM device tokens Courier delivers push notifications to.
     */
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

        /** Read and write a single user's notification preferences, per topic and per channel. */
        override fun preferences(): PreferenceService.WithRawResponse = preferences

        /** Associate a user with one or more tenants, and read or remove those associations. */
        override fun tenants(): TenantService.WithRawResponse = tenants

        /**
         * Register and manage the APNS and FCM device tokens Courier delivers push notifications
         * to.
         */
        override fun tokens(): TokenService.WithRawResponse = tokens
    }
}

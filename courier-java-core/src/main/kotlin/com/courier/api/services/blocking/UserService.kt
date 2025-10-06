// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.core.ClientOptions
import com.courier.api.services.blocking.users.PreferenceService
import com.courier.api.services.blocking.users.TenantService
import com.courier.api.services.blocking.users.TokenService
import java.util.function.Consumer

interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService

    fun preferences(): PreferenceService

    fun tenants(): TenantService

    fun tokens(): TokenService

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService.WithRawResponse

        fun preferences(): PreferenceService.WithRawResponse

        fun tenants(): TenantService.WithRawResponse

        fun tokens(): TokenService.WithRawResponse
    }
}

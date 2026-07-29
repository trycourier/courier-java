// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.core.ClientOptions
import com.courier.services.blocking.users.PreferenceService
import com.courier.services.blocking.users.TenantService
import com.courier.services.blocking.users.TokenService
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

    /** Read and write a single user's notification preferences, per topic and per channel. */
    fun preferences(): PreferenceService

    /** Associate a user with one or more tenants, and read or remove those associations. */
    fun tenants(): TenantService

    /**
     * Register and manage the APNS and FCM device tokens Courier delivers push notifications to.
     */
    fun tokens(): TokenService

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService.WithRawResponse

        /** Read and write a single user's notification preferences, per topic and per channel. */
        fun preferences(): PreferenceService.WithRawResponse

        /** Associate a user with one or more tenants, and read or remove those associations. */
        fun tenants(): TenantService.WithRawResponse

        /**
         * Register and manage the APNS and FCM device tokens Courier delivers push notifications
         * to.
         */
        fun tokens(): TokenService.WithRawResponse
    }
}

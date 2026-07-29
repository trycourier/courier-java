// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.services.async.users.PreferenceServiceAsync
import com.courier.services.async.users.TenantServiceAsync
import com.courier.services.async.users.TokenServiceAsync
import java.util.function.Consumer

interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync

    /** Read and write a single user's notification preferences, per topic and per channel. */
    fun preferences(): PreferenceServiceAsync

    /** Associate a user with one or more tenants, and read or remove those associations. */
    fun tenants(): TenantServiceAsync

    /**
     * Register and manage the APNS and FCM device tokens Courier delivers push notifications to.
     */
    fun tokens(): TokenServiceAsync

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync.WithRawResponse

        /** Read and write a single user's notification preferences, per topic and per channel. */
        fun preferences(): PreferenceServiceAsync.WithRawResponse

        /** Associate a user with one or more tenants, and read or remove those associations. */
        fun tenants(): TenantServiceAsync.WithRawResponse

        /**
         * Register and manage the APNS and FCM device tokens Courier delivers push notifications
         * to.
         */
        fun tokens(): TokenServiceAsync.WithRawResponse
    }
}

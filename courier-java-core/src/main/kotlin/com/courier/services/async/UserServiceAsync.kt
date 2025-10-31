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

    fun preferences(): PreferenceServiceAsync

    fun tenants(): TenantServiceAsync

    fun tokens(): TokenServiceAsync

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync.WithRawResponse

        fun preferences(): PreferenceServiceAsync.WithRawResponse

        fun tenants(): TenantServiceAsync.WithRawResponse

        fun tokens(): TokenServiceAsync.WithRawResponse
    }
}

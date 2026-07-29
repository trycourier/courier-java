// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking.users

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.users.tokens.TokenAddMultipleParams
import com.courier.models.users.tokens.TokenAddSingleParams
import com.courier.models.users.tokens.TokenDeleteParams
import com.courier.models.users.tokens.TokenListParams
import com.courier.models.users.tokens.TokenListResponse
import com.courier.models.users.tokens.TokenRetrieveParams
import com.courier.models.users.tokens.TokenRetrieveResponse
import com.courier.models.users.tokens.TokenUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/** Register and manage the APNS and FCM device tokens Courier delivers push notifications to. */
interface TokenService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenService

    /**
     * Returns one device token with its provider key, status and status reason, expiry date, and
     * any properties stored alongside it.
     */
    fun retrieve(token: String, params: TokenRetrieveParams): TokenRetrieveResponse =
        retrieve(token, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        token: String,
        params: TokenRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenRetrieveResponse = retrieve(params.toBuilder().token(token).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TokenRetrieveParams): TokenRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TokenRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenRetrieveResponse

    /**
     * Applies a JSON Patch to a device token, changing its status, expiry, or properties without
     * re-registering it.
     */
    fun update(token: String, params: TokenUpdateParams) =
        update(token, params, RequestOptions.none())

    /** @see update */
    fun update(
        token: String,
        params: TokenUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().token(token).build(), requestOptions)

    /** @see update */
    fun update(params: TokenUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: TokenUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Returns every device token registered for a user, each with its provider key, status, and
     * expiry date.
     */
    fun list(userId: String): TokenListResponse = list(userId, TokenListParams.none())

    /** @see list */
    fun list(
        userId: String,
        params: TokenListParams = TokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenListResponse = list(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see list */
    fun list(userId: String, params: TokenListParams = TokenListParams.none()): TokenListResponse =
        list(userId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TokenListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenListResponse

    /** @see list */
    fun list(params: TokenListParams): TokenListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(userId: String, requestOptions: RequestOptions): TokenListResponse =
        list(userId, TokenListParams.none(), requestOptions)

    /**
     * Deletes one device token for a user, addressed by the token value, so push sends no longer
     * target that device.
     */
    fun delete(token: String, params: TokenDeleteParams) =
        delete(token, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        token: String,
        params: TokenDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().token(token).build(), requestOptions)

    /** @see delete */
    fun delete(params: TokenDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: TokenDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * Registers several device tokens for a user in one call, overwriting any stored token with a
     * matching value.
     */
    fun addMultiple(userId: String) = addMultiple(userId, TokenAddMultipleParams.none())

    /** @see addMultiple */
    fun addMultiple(
        userId: String,
        params: TokenAddMultipleParams = TokenAddMultipleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = addMultiple(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see addMultiple */
    fun addMultiple(
        userId: String,
        params: TokenAddMultipleParams = TokenAddMultipleParams.none(),
    ) = addMultiple(userId, params, RequestOptions.none())

    /** @see addMultiple */
    fun addMultiple(
        params: TokenAddMultipleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see addMultiple */
    fun addMultiple(params: TokenAddMultipleParams) = addMultiple(params, RequestOptions.none())

    /** @see addMultiple */
    fun addMultiple(userId: String, requestOptions: RequestOptions) =
        addMultiple(userId, TokenAddMultipleParams.none(), requestOptions)

    /**
     * Registers one device token for a user against a provider key, overwriting the token if it
     * already exists. Push sends resolve tokens per user.
     */
    fun addSingle(token: String, params: TokenAddSingleParams) =
        addSingle(token, params, RequestOptions.none())

    /** @see addSingle */
    fun addSingle(
        token: String,
        params: TokenAddSingleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = addSingle(params.toBuilder().token(token).build(), requestOptions)

    /** @see addSingle */
    fun addSingle(params: TokenAddSingleParams) = addSingle(params, RequestOptions.none())

    /** @see addSingle */
    fun addSingle(
        params: TokenAddSingleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [TokenService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /users/{user_id}/tokens/{token}`, but is otherwise
         * the same as [TokenService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            token: String,
            params: TokenRetrieveParams,
        ): HttpResponseFor<TokenRetrieveResponse> = retrieve(token, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            token: String,
            params: TokenRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenRetrieveResponse> =
            retrieve(params.toBuilder().token(token).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TokenRetrieveParams): HttpResponseFor<TokenRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TokenRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenRetrieveResponse>

        /**
         * Returns a raw HTTP response for `patch /users/{user_id}/tokens/{token}`, but is otherwise
         * the same as [TokenService.update].
         */
        @MustBeClosed
        fun update(token: String, params: TokenUpdateParams): HttpResponse =
            update(token, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            token: String,
            params: TokenUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().token(token).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TokenUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TokenUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /users/{user_id}/tokens`, but is otherwise the same
         * as [TokenService.list].
         */
        @MustBeClosed
        fun list(userId: String): HttpResponseFor<TokenListResponse> =
            list(userId, TokenListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            userId: String,
            params: TokenListParams = TokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenListResponse> =
            list(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            userId: String,
            params: TokenListParams = TokenListParams.none(),
        ): HttpResponseFor<TokenListResponse> = list(userId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TokenListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: TokenListParams): HttpResponseFor<TokenListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenListResponse> = list(userId, TokenListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /users/{user_id}/tokens/{token}`, but is
         * otherwise the same as [TokenService.delete].
         */
        @MustBeClosed
        fun delete(token: String, params: TokenDeleteParams): HttpResponse =
            delete(token, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            token: String,
            params: TokenDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().token(token).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: TokenDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TokenDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put /users/{user_id}/tokens`, but is otherwise the same
         * as [TokenService.addMultiple].
         */
        @MustBeClosed
        fun addMultiple(userId: String): HttpResponse =
            addMultiple(userId, TokenAddMultipleParams.none())

        /** @see addMultiple */
        @MustBeClosed
        fun addMultiple(
            userId: String,
            params: TokenAddMultipleParams = TokenAddMultipleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = addMultiple(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see addMultiple */
        @MustBeClosed
        fun addMultiple(
            userId: String,
            params: TokenAddMultipleParams = TokenAddMultipleParams.none(),
        ): HttpResponse = addMultiple(userId, params, RequestOptions.none())

        /** @see addMultiple */
        @MustBeClosed
        fun addMultiple(
            params: TokenAddMultipleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see addMultiple */
        @MustBeClosed
        fun addMultiple(params: TokenAddMultipleParams): HttpResponse =
            addMultiple(params, RequestOptions.none())

        /** @see addMultiple */
        @MustBeClosed
        fun addMultiple(userId: String, requestOptions: RequestOptions): HttpResponse =
            addMultiple(userId, TokenAddMultipleParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /users/{user_id}/tokens/{token}`, but is otherwise
         * the same as [TokenService.addSingle].
         */
        @MustBeClosed
        fun addSingle(token: String, params: TokenAddSingleParams): HttpResponse =
            addSingle(token, params, RequestOptions.none())

        /** @see addSingle */
        @MustBeClosed
        fun addSingle(
            token: String,
            params: TokenAddSingleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = addSingle(params.toBuilder().token(token).build(), requestOptions)

        /** @see addSingle */
        @MustBeClosed
        fun addSingle(params: TokenAddSingleParams): HttpResponse =
            addSingle(params, RequestOptions.none())

        /** @see addSingle */
        @MustBeClosed
        fun addSingle(
            params: TokenAddSingleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}

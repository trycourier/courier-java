// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking.users

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponse
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.UserToken
import com.courier.api.models.users.tokens.TokenAddMultipleParams
import com.courier.api.models.users.tokens.TokenAddSingleParams
import com.courier.api.models.users.tokens.TokenDeleteParams
import com.courier.api.models.users.tokens.TokenListParams
import com.courier.api.models.users.tokens.TokenRetrieveParams
import com.courier.api.models.users.tokens.TokenRetrieveResponse
import com.courier.api.models.users.tokens.TokenUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

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

    /** Get single token available for a `:token` */
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

    /** Apply a JSON Patch (RFC 6902) to the specified token. */
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

    /** Gets all tokens available for a :user_id */
    fun list(userId: String): List<UserToken> = list(userId, TokenListParams.none())

    /** @see list */
    fun list(
        userId: String,
        params: TokenListParams = TokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<UserToken> = list(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see list */
    fun list(userId: String, params: TokenListParams = TokenListParams.none()): List<UserToken> =
        list(userId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TokenListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<UserToken>

    /** @see list */
    fun list(params: TokenListParams): List<UserToken> = list(params, RequestOptions.none())

    /** @see list */
    fun list(userId: String, requestOptions: RequestOptions): List<UserToken> =
        list(userId, TokenListParams.none(), requestOptions)

    /** Delete User Token */
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

    /** Adds multiple tokens to a user and overwrites matching existing tokens. */
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

    /** Adds a single token to a user and overwrites a matching existing token. */
    fun addSingle(pathToken: String, params: TokenAddSingleParams) =
        addSingle(pathToken, params, RequestOptions.none())

    /** @see addSingle */
    fun addSingle(
        pathToken: String,
        params: TokenAddSingleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = addSingle(params.toBuilder().pathToken(pathToken).build(), requestOptions)

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
        fun list(userId: String): HttpResponseFor<List<UserToken>> =
            list(userId, TokenListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            userId: String,
            params: TokenListParams = TokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<UserToken>> =
            list(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            userId: String,
            params: TokenListParams = TokenListParams.none(),
        ): HttpResponseFor<List<UserToken>> = list(userId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TokenListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<UserToken>>

        /** @see list */
        @MustBeClosed
        fun list(params: TokenListParams): HttpResponseFor<List<UserToken>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(userId: String, requestOptions: RequestOptions): HttpResponseFor<List<UserToken>> =
            list(userId, TokenListParams.none(), requestOptions)

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
        fun addSingle(pathToken: String, params: TokenAddSingleParams): HttpResponse =
            addSingle(pathToken, params, RequestOptions.none())

        /** @see addSingle */
        @MustBeClosed
        fun addSingle(
            pathToken: String,
            params: TokenAddSingleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = addSingle(params.toBuilder().pathToken(pathToken).build(), requestOptions)

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

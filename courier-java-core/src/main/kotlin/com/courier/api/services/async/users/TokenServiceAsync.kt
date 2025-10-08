// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async.users

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TokenServiceAsync

    /** Get single token available for a `:token` */
    fun retrieve(
        token: String,
        params: TokenRetrieveParams,
    ): CompletableFuture<TokenRetrieveResponse> = retrieve(token, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        token: String,
        params: TokenRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenRetrieveResponse> =
        retrieve(params.toBuilder().token(token).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: TokenRetrieveParams): CompletableFuture<TokenRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TokenRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TokenRetrieveResponse>

    /** Apply a JSON Patch (RFC 6902) to the specified token. */
    fun update(token: String, params: TokenUpdateParams): CompletableFuture<Void?> =
        update(token, params, RequestOptions.none())

    /** @see update */
    fun update(
        token: String,
        params: TokenUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().token(token).build(), requestOptions)

    /** @see update */
    fun update(params: TokenUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TokenUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Gets all tokens available for a :user_id */
    fun list(userId: String): CompletableFuture<List<UserToken>> =
        list(userId, TokenListParams.none())

    /** @see list */
    fun list(
        userId: String,
        params: TokenListParams = TokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<UserToken>> =
        list(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see list */
    fun list(
        userId: String,
        params: TokenListParams = TokenListParams.none(),
    ): CompletableFuture<List<UserToken>> = list(userId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: TokenListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<UserToken>>

    /** @see list */
    fun list(params: TokenListParams): CompletableFuture<List<UserToken>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(userId: String, requestOptions: RequestOptions): CompletableFuture<List<UserToken>> =
        list(userId, TokenListParams.none(), requestOptions)

    /** Delete User Token */
    fun delete(token: String, params: TokenDeleteParams): CompletableFuture<Void?> =
        delete(token, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        token: String,
        params: TokenDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().token(token).build(), requestOptions)

    /** @see delete */
    fun delete(params: TokenDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TokenDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Adds multiple tokens to a user and overwrites matching existing tokens. */
    fun addMultiple(userId: String): CompletableFuture<Void?> =
        addMultiple(userId, TokenAddMultipleParams.none())

    /** @see addMultiple */
    fun addMultiple(
        userId: String,
        params: TokenAddMultipleParams = TokenAddMultipleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        addMultiple(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see addMultiple */
    fun addMultiple(
        userId: String,
        params: TokenAddMultipleParams = TokenAddMultipleParams.none(),
    ): CompletableFuture<Void?> = addMultiple(userId, params, RequestOptions.none())

    /** @see addMultiple */
    fun addMultiple(
        params: TokenAddMultipleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see addMultiple */
    fun addMultiple(params: TokenAddMultipleParams): CompletableFuture<Void?> =
        addMultiple(params, RequestOptions.none())

    /** @see addMultiple */
    fun addMultiple(userId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        addMultiple(userId, TokenAddMultipleParams.none(), requestOptions)

    /** Adds a single token to a user and overwrites a matching existing token. */
    fun addSingle(pathToken: String, params: TokenAddSingleParams): CompletableFuture<Void?> =
        addSingle(pathToken, params, RequestOptions.none())

    /** @see addSingle */
    fun addSingle(
        pathToken: String,
        params: TokenAddSingleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        addSingle(params.toBuilder().pathToken(pathToken).build(), requestOptions)

    /** @see addSingle */
    fun addSingle(params: TokenAddSingleParams): CompletableFuture<Void?> =
        addSingle(params, RequestOptions.none())

    /** @see addSingle */
    fun addSingle(
        params: TokenAddSingleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [TokenServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TokenServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /users/{user_id}/tokens/{token}`, but is otherwise
         * the same as [TokenServiceAsync.retrieve].
         */
        fun retrieve(
            token: String,
            params: TokenRetrieveParams,
        ): CompletableFuture<HttpResponseFor<TokenRetrieveResponse>> =
            retrieve(token, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            token: String,
            params: TokenRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenRetrieveResponse>> =
            retrieve(params.toBuilder().token(token).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: TokenRetrieveParams
        ): CompletableFuture<HttpResponseFor<TokenRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TokenRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `patch /users/{user_id}/tokens/{token}`, but is otherwise
         * the same as [TokenServiceAsync.update].
         */
        fun update(token: String, params: TokenUpdateParams): CompletableFuture<HttpResponse> =
            update(token, params, RequestOptions.none())

        /** @see update */
        fun update(
            token: String,
            params: TokenUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().token(token).build(), requestOptions)

        /** @see update */
        fun update(params: TokenUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TokenUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /users/{user_id}/tokens`, but is otherwise the same
         * as [TokenServiceAsync.list].
         */
        fun list(userId: String): CompletableFuture<HttpResponseFor<List<UserToken>>> =
            list(userId, TokenListParams.none())

        /** @see list */
        fun list(
            userId: String,
            params: TokenListParams = TokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<UserToken>>> =
            list(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see list */
        fun list(
            userId: String,
            params: TokenListParams = TokenListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<UserToken>>> =
            list(userId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: TokenListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<UserToken>>>

        /** @see list */
        fun list(params: TokenListParams): CompletableFuture<HttpResponseFor<List<UserToken>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<UserToken>>> =
            list(userId, TokenListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /users/{user_id}/tokens/{token}`, but is
         * otherwise the same as [TokenServiceAsync.delete].
         */
        fun delete(token: String, params: TokenDeleteParams): CompletableFuture<HttpResponse> =
            delete(token, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            token: String,
            params: TokenDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().token(token).build(), requestOptions)

        /** @see delete */
        fun delete(params: TokenDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TokenDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put /users/{user_id}/tokens`, but is otherwise the same
         * as [TokenServiceAsync.addMultiple].
         */
        fun addMultiple(userId: String): CompletableFuture<HttpResponse> =
            addMultiple(userId, TokenAddMultipleParams.none())

        /** @see addMultiple */
        fun addMultiple(
            userId: String,
            params: TokenAddMultipleParams = TokenAddMultipleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            addMultiple(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see addMultiple */
        fun addMultiple(
            userId: String,
            params: TokenAddMultipleParams = TokenAddMultipleParams.none(),
        ): CompletableFuture<HttpResponse> = addMultiple(userId, params, RequestOptions.none())

        /** @see addMultiple */
        fun addMultiple(
            params: TokenAddMultipleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see addMultiple */
        fun addMultiple(params: TokenAddMultipleParams): CompletableFuture<HttpResponse> =
            addMultiple(params, RequestOptions.none())

        /** @see addMultiple */
        fun addMultiple(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            addMultiple(userId, TokenAddMultipleParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /users/{user_id}/tokens/{token}`, but is otherwise
         * the same as [TokenServiceAsync.addSingle].
         */
        fun addSingle(
            pathToken: String,
            params: TokenAddSingleParams,
        ): CompletableFuture<HttpResponse> = addSingle(pathToken, params, RequestOptions.none())

        /** @see addSingle */
        fun addSingle(
            pathToken: String,
            params: TokenAddSingleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            addSingle(params.toBuilder().pathToken(pathToken).build(), requestOptions)

        /** @see addSingle */
        fun addSingle(params: TokenAddSingleParams): CompletableFuture<HttpResponse> =
            addSingle(params, RequestOptions.none())

        /** @see addSingle */
        fun addSingle(
            params: TokenAddSingleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}

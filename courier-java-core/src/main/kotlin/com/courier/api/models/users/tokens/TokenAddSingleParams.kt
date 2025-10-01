// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.tokens

import com.courier.api.core.JsonValue
import com.courier.api.core.Params
import com.courier.api.core.checkRequired
import com.courier.api.core.http.Headers
import com.courier.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Adds a single token to a user and overwrites a matching existing token. */
class TokenAddSingleParams
private constructor(
    private val userId: String,
    private val pathToken: String?,
    private val userToken: UserToken,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun userId(): String = userId

    fun pathToken(): Optional<String> = Optional.ofNullable(pathToken)

    fun userToken(): UserToken = userToken

    fun _additionalBodyProperties(): Map<String, JsonValue> = userToken._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TokenAddSingleParams].
         *
         * The following fields are required:
         * ```java
         * .userId()
         * .userToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenAddSingleParams]. */
    class Builder internal constructor() {

        private var userId: String? = null
        private var pathToken: String? = null
        private var userToken: UserToken? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(tokenAddSingleParams: TokenAddSingleParams) = apply {
            userId = tokenAddSingleParams.userId
            pathToken = tokenAddSingleParams.pathToken
            userToken = tokenAddSingleParams.userToken
            additionalHeaders = tokenAddSingleParams.additionalHeaders.toBuilder()
            additionalQueryParams = tokenAddSingleParams.additionalQueryParams.toBuilder()
        }

        fun userId(userId: String) = apply { this.userId = userId }

        fun pathToken(pathToken: String?) = apply { this.pathToken = pathToken }

        /** Alias for calling [Builder.pathToken] with `pathToken.orElse(null)`. */
        fun pathToken(pathToken: Optional<String>) = pathToken(pathToken.getOrNull())

        fun userToken(userToken: UserToken) = apply { this.userToken = userToken }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [TokenAddSingleParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .userId()
         * .userToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TokenAddSingleParams =
            TokenAddSingleParams(
                checkRequired("userId", userId),
                pathToken,
                checkRequired("userToken", userToken),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): UserToken = userToken

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> userId
            1 -> pathToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenAddSingleParams &&
            userId == other.userId &&
            pathToken == other.pathToken &&
            userToken == other.userToken &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(userId, pathToken, userToken, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TokenAddSingleParams{userId=$userId, pathToken=$pathToken, userToken=$userToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

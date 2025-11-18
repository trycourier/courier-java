// File generated from our OpenAPI spec by Stainless.

package com.courier.models.auth

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Returns a new access token. */
class AuthIssueTokenParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Duration for token expiration. Accepts various time formats:
     * - "2 hours" - 2 hours from now
     * - "1d" - 1 day
     * - "3 days" - 3 days
     * - "10h" - 10 hours
     * - "2.5 hrs" - 2.5 hours
     * - "1m" - 1 minute
     * - "5s" - 5 seconds
     * - "1y" - 1 year
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresIn(): String = body.expiresIn()

    /**
     * Available scopes:
     * - `user_id:<user-id>` - Defines which user the token will be scoped to. Multiple can be
     *   listed if needed. Ex `user_id:pigeon user_id:bluebird`.
     * - `read:messages` - Read messages.
     * - `read:user-tokens` - Read user push tokens.
     * - `write:user-tokens` - Write user push tokens.
     * - `read:brands[:<brand_id>]` - Read brands, optionally restricted to a specific brand_id.
     *   Examples `read:brands`, `read:brands:my_brand`.
     * - `write:brands[:<brand_id>]` - Write brands, optionally restricted to a specific brand_id.
     *   Examples `write:brands`, `write:brands:my_brand`.
     * - `inbox:read:messages` - Read inbox messages.
     * - `inbox:write:events` - Write inbox events, such as mark message as read.
     * - `read:preferences` - Read user preferences.
     * - `write:preferences` - Write user preferences. Example: `user_id:user123 write:user-tokens
     *   inbox:read:messages inbox:write:events read:preferences write:preferences read:brands`
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scope(): String = body.scope()

    /**
     * Returns the raw JSON value of [expiresIn].
     *
     * Unlike [expiresIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _expiresIn(): JsonField<String> = body._expiresIn()

    /**
     * Returns the raw JSON value of [scope].
     *
     * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scope(): JsonField<String> = body._scope()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AuthIssueTokenParams].
         *
         * The following fields are required:
         * ```java
         * .expiresIn()
         * .scope()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthIssueTokenParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(authIssueTokenParams: AuthIssueTokenParams) = apply {
            body = authIssueTokenParams.body.toBuilder()
            additionalHeaders = authIssueTokenParams.additionalHeaders.toBuilder()
            additionalQueryParams = authIssueTokenParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [expiresIn]
         * - [scope]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Duration for token expiration. Accepts various time formats:
         * - "2 hours" - 2 hours from now
         * - "1d" - 1 day
         * - "3 days" - 3 days
         * - "10h" - 10 hours
         * - "2.5 hrs" - 2.5 hours
         * - "1m" - 1 minute
         * - "5s" - 5 seconds
         * - "1y" - 1 year
         */
        fun expiresIn(expiresIn: String) = apply { body.expiresIn(expiresIn) }

        /**
         * Sets [Builder.expiresIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresIn] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expiresIn(expiresIn: JsonField<String>) = apply { body.expiresIn(expiresIn) }

        /**
         * Available scopes:
         * - `user_id:<user-id>` - Defines which user the token will be scoped to. Multiple can be
         *   listed if needed. Ex `user_id:pigeon user_id:bluebird`.
         * - `read:messages` - Read messages.
         * - `read:user-tokens` - Read user push tokens.
         * - `write:user-tokens` - Write user push tokens.
         * - `read:brands[:<brand_id>]` - Read brands, optionally restricted to a specific brand_id.
         *   Examples `read:brands`, `read:brands:my_brand`.
         * - `write:brands[:<brand_id>]` - Write brands, optionally restricted to a specific
         *   brand_id. Examples `write:brands`, `write:brands:my_brand`.
         * - `inbox:read:messages` - Read inbox messages.
         * - `inbox:write:events` - Write inbox events, such as mark message as read.
         * - `read:preferences` - Read user preferences.
         * - `write:preferences` - Write user preferences. Example: `user_id:user123
         *   write:user-tokens inbox:read:messages inbox:write:events read:preferences
         *   write:preferences read:brands`
         */
        fun scope(scope: String) = apply { body.scope(scope) }

        /**
         * Sets [Builder.scope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scope] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scope(scope: JsonField<String>) = apply { body.scope(scope) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [AuthIssueTokenParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .expiresIn()
         * .scope()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthIssueTokenParams =
            AuthIssueTokenParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val expiresIn: JsonField<String>,
        private val scope: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("expires_in")
            @ExcludeMissing
            expiresIn: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scope") @ExcludeMissing scope: JsonField<String> = JsonMissing.of(),
        ) : this(expiresIn, scope, mutableMapOf())

        /**
         * Duration for token expiration. Accepts various time formats:
         * - "2 hours" - 2 hours from now
         * - "1d" - 1 day
         * - "3 days" - 3 days
         * - "10h" - 10 hours
         * - "2.5 hrs" - 2.5 hours
         * - "1m" - 1 minute
         * - "5s" - 5 seconds
         * - "1y" - 1 year
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expiresIn(): String = expiresIn.getRequired("expires_in")

        /**
         * Available scopes:
         * - `user_id:<user-id>` - Defines which user the token will be scoped to. Multiple can be
         *   listed if needed. Ex `user_id:pigeon user_id:bluebird`.
         * - `read:messages` - Read messages.
         * - `read:user-tokens` - Read user push tokens.
         * - `write:user-tokens` - Write user push tokens.
         * - `read:brands[:<brand_id>]` - Read brands, optionally restricted to a specific brand_id.
         *   Examples `read:brands`, `read:brands:my_brand`.
         * - `write:brands[:<brand_id>]` - Write brands, optionally restricted to a specific
         *   brand_id. Examples `write:brands`, `write:brands:my_brand`.
         * - `inbox:read:messages` - Read inbox messages.
         * - `inbox:write:events` - Write inbox events, such as mark message as read.
         * - `read:preferences` - Read user preferences.
         * - `write:preferences` - Write user preferences. Example: `user_id:user123
         *   write:user-tokens inbox:read:messages inbox:write:events read:preferences
         *   write:preferences read:brands`
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scope(): String = scope.getRequired("scope")

        /**
         * Returns the raw JSON value of [expiresIn].
         *
         * Unlike [expiresIn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_in") @ExcludeMissing fun _expiresIn(): JsonField<String> = expiresIn

        /**
         * Returns the raw JSON value of [scope].
         *
         * Unlike [scope], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<String> = scope

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .expiresIn()
             * .scope()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var expiresIn: JsonField<String>? = null
            private var scope: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                expiresIn = body.expiresIn
                scope = body.scope
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Duration for token expiration. Accepts various time formats:
             * - "2 hours" - 2 hours from now
             * - "1d" - 1 day
             * - "3 days" - 3 days
             * - "10h" - 10 hours
             * - "2.5 hrs" - 2.5 hours
             * - "1m" - 1 minute
             * - "5s" - 5 seconds
             * - "1y" - 1 year
             */
            fun expiresIn(expiresIn: String) = expiresIn(JsonField.of(expiresIn))

            /**
             * Sets [Builder.expiresIn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresIn] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresIn(expiresIn: JsonField<String>) = apply { this.expiresIn = expiresIn }

            /**
             * Available scopes:
             * - `user_id:<user-id>` - Defines which user the token will be scoped to. Multiple can
             *   be listed if needed. Ex `user_id:pigeon user_id:bluebird`.
             * - `read:messages` - Read messages.
             * - `read:user-tokens` - Read user push tokens.
             * - `write:user-tokens` - Write user push tokens.
             * - `read:brands[:<brand_id>]` - Read brands, optionally restricted to a specific
             *   brand_id. Examples `read:brands`, `read:brands:my_brand`.
             * - `write:brands[:<brand_id>]` - Write brands, optionally restricted to a specific
             *   brand_id. Examples `write:brands`, `write:brands:my_brand`.
             * - `inbox:read:messages` - Read inbox messages.
             * - `inbox:write:events` - Write inbox events, such as mark message as read.
             * - `read:preferences` - Read user preferences.
             * - `write:preferences` - Write user preferences. Example: `user_id:user123
             *   write:user-tokens inbox:read:messages inbox:write:events read:preferences
             *   write:preferences read:brands`
             */
            fun scope(scope: String) = scope(JsonField.of(scope))

            /**
             * Sets [Builder.scope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scope] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scope(scope: JsonField<String>) = apply { this.scope = scope }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .expiresIn()
             * .scope()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("expiresIn", expiresIn),
                    checkRequired("scope", scope),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            expiresIn()
            scope()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: CourierInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (expiresIn.asKnown().isPresent) 1 else 0) +
                (if (scope.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                expiresIn == other.expiresIn &&
                scope == other.scope &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(expiresIn, scope, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{expiresIn=$expiresIn, scope=$scope, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthIssueTokenParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AuthIssueTokenParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

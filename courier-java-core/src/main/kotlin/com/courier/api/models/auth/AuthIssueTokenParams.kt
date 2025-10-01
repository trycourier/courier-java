// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.auth

import com.courier.api.core.Enum
import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.Params
import com.courier.api.core.checkRequired
import com.courier.api.core.http.Headers
import com.courier.api.core.http.QueryParams
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Returns a new access token. */
class AuthIssueTokenParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresIn(): String = body.expiresIn()

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scope(): Scope = body.scope()

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
    fun _scope(): JsonField<Scope> = body._scope()

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

        fun expiresIn(expiresIn: String) = apply { body.expiresIn(expiresIn) }

        /**
         * Sets [Builder.expiresIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresIn] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expiresIn(expiresIn: JsonField<String>) = apply { body.expiresIn(expiresIn) }

        fun scope(scope: Scope) = apply { body.scope(scope) }

        /**
         * Sets [Builder.scope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scope(scope: JsonField<Scope>) = apply { body.scope(scope) }

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
        private val scope: JsonField<Scope>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("expires_in")
            @ExcludeMissing
            expiresIn: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scope") @ExcludeMissing scope: JsonField<Scope> = JsonMissing.of(),
        ) : this(expiresIn, scope, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expiresIn(): String = expiresIn.getRequired("expires_in")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun scope(): Scope = scope.getRequired("scope")

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
        @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<Scope> = scope

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
            private var scope: JsonField<Scope>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                expiresIn = body.expiresIn
                scope = body.scope
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun expiresIn(expiresIn: String) = expiresIn(JsonField.of(expiresIn))

            /**
             * Sets [Builder.expiresIn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresIn] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresIn(expiresIn: JsonField<String>) = apply { this.expiresIn = expiresIn }

            fun scope(scope: Scope) = scope(JsonField.of(scope))

            /**
             * Sets [Builder.scope] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scope] with a well-typed [Scope] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun scope(scope: JsonField<Scope>) = apply { this.scope = scope }

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
            scope().validate()
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
                (scope.asKnown().getOrNull()?.validity() ?: 0)

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

    class Scope @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val READ_PREFERENCES = of("read:preferences")

            @JvmField val WRITE_PREFERENCES = of("write:preferences")

            @JvmField val READ_USER_TOKENS = of("read:user-tokens")

            @JvmField val WRITE_USER_TOKENS = of("write:user-tokens")

            @JvmField val READ_BRANDS = of("read:brands")

            @JvmField val WRITE_BRANDS = of("write:brands")

            @JvmField val READ_BRANDS_ID = of("read:brands{:id}")

            @JvmField val WRITE_BRANDS_ID = of("write:brands{:id}")

            @JvmField val WRITE_TRACK = of("write:track")

            @JvmField val INBOX_READ_MESSAGES = of("inbox:read:messages")

            @JvmField val INBOX_WRITE_MESSAGES = of("inbox:write:messages")

            @JvmField val INBOX_WRITE_EVENT = of("inbox:write:event")

            @JvmField val INBOX_WRITE_EVENTS = of("inbox:write:events")

            @JvmField val USER_ID_YOUR_USER_ID = of("user_id:\$YOUR_USER_ID")

            @JvmStatic fun of(value: String) = Scope(JsonField.of(value))
        }

        /** An enum containing [Scope]'s known values. */
        enum class Known {
            READ_PREFERENCES,
            WRITE_PREFERENCES,
            READ_USER_TOKENS,
            WRITE_USER_TOKENS,
            READ_BRANDS,
            WRITE_BRANDS,
            READ_BRANDS_ID,
            WRITE_BRANDS_ID,
            WRITE_TRACK,
            INBOX_READ_MESSAGES,
            INBOX_WRITE_MESSAGES,
            INBOX_WRITE_EVENT,
            INBOX_WRITE_EVENTS,
            USER_ID_YOUR_USER_ID,
        }

        /**
         * An enum containing [Scope]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Scope] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            READ_PREFERENCES,
            WRITE_PREFERENCES,
            READ_USER_TOKENS,
            WRITE_USER_TOKENS,
            READ_BRANDS,
            WRITE_BRANDS,
            READ_BRANDS_ID,
            WRITE_BRANDS_ID,
            WRITE_TRACK,
            INBOX_READ_MESSAGES,
            INBOX_WRITE_MESSAGES,
            INBOX_WRITE_EVENT,
            INBOX_WRITE_EVENTS,
            USER_ID_YOUR_USER_ID,
            /** An enum member indicating that [Scope] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                READ_PREFERENCES -> Value.READ_PREFERENCES
                WRITE_PREFERENCES -> Value.WRITE_PREFERENCES
                READ_USER_TOKENS -> Value.READ_USER_TOKENS
                WRITE_USER_TOKENS -> Value.WRITE_USER_TOKENS
                READ_BRANDS -> Value.READ_BRANDS
                WRITE_BRANDS -> Value.WRITE_BRANDS
                READ_BRANDS_ID -> Value.READ_BRANDS_ID
                WRITE_BRANDS_ID -> Value.WRITE_BRANDS_ID
                WRITE_TRACK -> Value.WRITE_TRACK
                INBOX_READ_MESSAGES -> Value.INBOX_READ_MESSAGES
                INBOX_WRITE_MESSAGES -> Value.INBOX_WRITE_MESSAGES
                INBOX_WRITE_EVENT -> Value.INBOX_WRITE_EVENT
                INBOX_WRITE_EVENTS -> Value.INBOX_WRITE_EVENTS
                USER_ID_YOUR_USER_ID -> Value.USER_ID_YOUR_USER_ID
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws CourierInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                READ_PREFERENCES -> Known.READ_PREFERENCES
                WRITE_PREFERENCES -> Known.WRITE_PREFERENCES
                READ_USER_TOKENS -> Known.READ_USER_TOKENS
                WRITE_USER_TOKENS -> Known.WRITE_USER_TOKENS
                READ_BRANDS -> Known.READ_BRANDS
                WRITE_BRANDS -> Known.WRITE_BRANDS
                READ_BRANDS_ID -> Known.READ_BRANDS_ID
                WRITE_BRANDS_ID -> Known.WRITE_BRANDS_ID
                WRITE_TRACK -> Known.WRITE_TRACK
                INBOX_READ_MESSAGES -> Known.INBOX_READ_MESSAGES
                INBOX_WRITE_MESSAGES -> Known.INBOX_WRITE_MESSAGES
                INBOX_WRITE_EVENT -> Known.INBOX_WRITE_EVENT
                INBOX_WRITE_EVENTS -> Known.INBOX_WRITE_EVENTS
                USER_ID_YOUR_USER_ID -> Known.USER_ID_YOUR_USER_ID
                else -> throw CourierInvalidDataException("Unknown Scope: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws CourierInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { CourierInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Scope = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Scope && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

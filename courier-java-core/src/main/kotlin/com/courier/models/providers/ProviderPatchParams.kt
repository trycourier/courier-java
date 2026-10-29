// File generated from our OpenAPI spec by Stainless.

package com.courier.models.providers

import com.courier.core.Enum
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Applies JSON Patch (RFC 6902) operations to a provider configuration and keeps every field the
 * operations don't touch. Paths address the provider as it is returned: /title, /alias and
 * /settings/<key>. The operations apply in order, and if one fails, nothing is saved.
 */
class ProviderPatchParams
private constructor(
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Operations to apply, in order. Paths address the provider as it is returned: `/title`,
     * `/alias`, `/provider`, and `/settings/<key>` with the snake_case setting keys, including
     * nested paths such as `/settings/rate_limit/rate`. If any operation fails, for example a
     * `test`, nothing is saved and the request returns a 400. The result can't change `provider`,
     * remove `title`, or add other top-level fields. Removing `/alias` clears it.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun patch(): List<Patch> = body.patch()

    /**
     * Returns the raw JSON value of [patch].
     *
     * Unlike [patch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _patch(): JsonField<List<Patch>> = body._patch()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProviderPatchParams].
         *
         * The following fields are required:
         * ```java
         * .patch()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProviderPatchParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(providerPatchParams: ProviderPatchParams) = apply {
            id = providerPatchParams.id
            body = providerPatchParams.body.toBuilder()
            additionalHeaders = providerPatchParams.additionalHeaders.toBuilder()
            additionalQueryParams = providerPatchParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [patch]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Operations to apply, in order. Paths address the provider as it is returned: `/title`,
         * `/alias`, `/provider`, and `/settings/<key>` with the snake_case setting keys, including
         * nested paths such as `/settings/rate_limit/rate`. If any operation fails, for example a
         * `test`, nothing is saved and the request returns a 400. The result can't change
         * `provider`, remove `title`, or add other top-level fields. Removing `/alias` clears it.
         */
        fun patch(patch: List<Patch>) = apply { body.patch(patch) }

        /**
         * Sets [Builder.patch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.patch] with a well-typed `List<Patch>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun patch(patch: JsonField<List<Patch>>) = apply { body.patch(patch) }

        /**
         * Adds a single [Patch] to [Builder.patch].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPatch(patch: Patch) = apply { body.addPatch(patch) }

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
         * Returns an immutable instance of [ProviderPatchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .patch()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProviderPatchParams =
            ProviderPatchParams(
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request body for a partial update of a provider configuration: a list of JSON Patch
     * (RFC 6902) operations, the same body as the profile and preference PATCH endpoints.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val patch: JsonField<List<Patch>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("patch") @ExcludeMissing patch: JsonField<List<Patch>> = JsonMissing.of()
        ) : this(patch, mutableMapOf())

        /**
         * Operations to apply, in order. Paths address the provider as it is returned: `/title`,
         * `/alias`, `/provider`, and `/settings/<key>` with the snake_case setting keys, including
         * nested paths such as `/settings/rate_limit/rate`. If any operation fails, for example a
         * `test`, nothing is saved and the request returns a 400. The result can't change
         * `provider`, remove `title`, or add other top-level fields. Removing `/alias` clears it.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun patch(): List<Patch> = patch.getRequired("patch")

        /**
         * Returns the raw JSON value of [patch].
         *
         * Unlike [patch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("patch") @ExcludeMissing fun _patch(): JsonField<List<Patch>> = patch

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
             * .patch()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var patch: JsonField<MutableList<Patch>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                patch = body.patch.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Operations to apply, in order. Paths address the provider as it is returned:
             * `/title`, `/alias`, `/provider`, and `/settings/<key>` with the snake_case setting
             * keys, including nested paths such as `/settings/rate_limit/rate`. If any operation
             * fails, for example a `test`, nothing is saved and the request returns a 400. The
             * result can't change `provider`, remove `title`, or add other top-level fields.
             * Removing `/alias` clears it.
             */
            fun patch(patch: List<Patch>) = patch(JsonField.of(patch))

            /**
             * Sets [Builder.patch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.patch] with a well-typed `List<Patch>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun patch(patch: JsonField<List<Patch>>) = apply {
                this.patch = patch.map { it.toMutableList() }
            }

            /**
             * Adds a single [Patch] to [Builder.patch].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPatch(patch: Patch) = apply {
                this.patch =
                    (this.patch ?: JsonField.of(mutableListOf())).also {
                        checkKnown("patch", it).add(patch)
                    }
            }

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
             * .patch()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("patch", patch).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CourierInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            patch().forEach { it.validate() }
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
            (patch.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                patch == other.patch &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(patch, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{patch=$patch, additionalProperties=$additionalProperties}"
    }

    /** One JSON Patch (RFC 6902) operation. */
    class Patch
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val op: JsonField<Op>,
        private val path: JsonField<String>,
        private val from: JsonField<String>,
        private val value: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("op") @ExcludeMissing op: JsonField<Op> = JsonMissing.of(),
            @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
            @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonValue = JsonMissing.of(),
        ) : this(op, path, from, value, mutableMapOf())

        /**
         * The operation to perform.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun op(): Op = op.getRequired("op")

        /**
         * JSON Pointer to the field to operate on, such as `/settings/api_key`.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun path(): String = path.getRequired("path")

        /**
         * JSON Pointer to the source field for `move` and `copy`.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun from(): Optional<String> = from.getOptional("from")

        /**
         * The value for `add`, `replace` and `test`. Any JSON value.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = patch.value().convert(MyClass.class);
         * ```
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonValue = value

        /**
         * Returns the raw JSON value of [op].
         *
         * Unlike [op], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("op") @ExcludeMissing fun _op(): JsonField<Op> = op

        /**
         * Returns the raw JSON value of [path].
         *
         * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

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
             * Returns a mutable builder for constructing an instance of [Patch].
             *
             * The following fields are required:
             * ```java
             * .op()
             * .path()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Patch]. */
        class Builder internal constructor() {

            private var op: JsonField<Op>? = null
            private var path: JsonField<String>? = null
            private var from: JsonField<String> = JsonMissing.of()
            private var value: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(patch: Patch) = apply {
                op = patch.op
                path = patch.path
                from = patch.from
                value = patch.value
                additionalProperties = patch.additionalProperties.toMutableMap()
            }

            /** The operation to perform. */
            fun op(op: Op) = op(JsonField.of(op))

            /**
             * Sets [Builder.op] to an arbitrary JSON value.
             *
             * You should usually call [Builder.op] with a well-typed [Op] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun op(op: JsonField<Op>) = apply { this.op = op }

            /** JSON Pointer to the field to operate on, such as `/settings/api_key`. */
            fun path(path: String) = path(JsonField.of(path))

            /**
             * Sets [Builder.path] to an arbitrary JSON value.
             *
             * You should usually call [Builder.path] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun path(path: JsonField<String>) = apply { this.path = path }

            /** JSON Pointer to the source field for `move` and `copy`. */
            fun from(from: String) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<String>) = apply { this.from = from }

            /** The value for `add`, `replace` and `test`. Any JSON value. */
            fun value(value: JsonValue) = apply { this.value = value }

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
             * Returns an immutable instance of [Patch].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .op()
             * .path()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Patch =
                Patch(
                    checkRequired("op", op),
                    checkRequired("path", path),
                    from,
                    value,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CourierInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Patch = apply {
            if (validated) {
                return@apply
            }

            op().validate()
            path()
            from()
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
            (op.asKnown().getOrNull()?.validity() ?: 0) +
                (if (path.asKnown().isPresent) 1 else 0) +
                (if (from.asKnown().isPresent) 1 else 0)

        /** The operation to perform. */
        class Op @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ADD = of("add")

                @JvmField val REMOVE = of("remove")

                @JvmField val REPLACE = of("replace")

                @JvmField val MOVE = of("move")

                @JvmField val COPY = of("copy")

                @JvmField val TEST = of("test")

                @JvmStatic fun of(value: String) = Op(JsonField.of(value))
            }

            /** An enum containing [Op]'s known values. */
            enum class Known {
                ADD,
                REMOVE,
                REPLACE,
                MOVE,
                COPY,
                TEST,
            }

            /**
             * An enum containing [Op]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Op] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ADD,
                REMOVE,
                REPLACE,
                MOVE,
                COPY,
                TEST,
                /** An enum member indicating that [Op] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ADD -> Value.ADD
                    REMOVE -> Value.REMOVE
                    REPLACE -> Value.REPLACE
                    MOVE -> Value.MOVE
                    COPY -> Value.COPY
                    TEST -> Value.TEST
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CourierInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ADD -> Known.ADD
                    REMOVE -> Known.REMOVE
                    REPLACE -> Known.REPLACE
                    MOVE -> Known.MOVE
                    COPY -> Known.COPY
                    TEST -> Known.TEST
                    else -> throw CourierInvalidDataException("Unknown Op: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CourierInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CourierInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Op = apply {
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

                return other is Op && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Patch &&
                op == other.op &&
                path == other.path &&
                from == other.from &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(op, path, from, value, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Patch{op=$op, path=$path, from=$from, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProviderPatchParams &&
            id == other.id &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(id, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ProviderPatchParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

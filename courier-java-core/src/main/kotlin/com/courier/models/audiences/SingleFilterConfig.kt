// File generated from our OpenAPI spec by Stainless.

package com.courier.models.audiences

import com.courier.core.Enum
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkRequired
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class SingleFilterConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val operator: JsonField<Operator>,
    private val path: JsonField<String>,
    private val value: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<Operator> = JsonMissing.of(),
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
    ) : this(operator, path, value, mutableMapOf())

    /**
     * The operator to use for filtering
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): Operator = operator.getRequired("operator")

    /**
     * The attribe name from profile whose value will be operated against the filter value
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun path(): String = path.getRequired("path")

    /**
     * The value to use for filtering
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): String = value.getRequired("value")

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<Operator> = operator

    /**
     * Returns the raw JSON value of [path].
     *
     * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
         * Returns a mutable builder for constructing an instance of [SingleFilterConfig].
         *
         * The following fields are required:
         * ```java
         * .operator()
         * .path()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SingleFilterConfig]. */
    class Builder internal constructor() {

        private var operator: JsonField<Operator>? = null
        private var path: JsonField<String>? = null
        private var value: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(singleFilterConfig: SingleFilterConfig) = apply {
            operator = singleFilterConfig.operator
            path = singleFilterConfig.path
            value = singleFilterConfig.value
            additionalProperties = singleFilterConfig.additionalProperties.toMutableMap()
        }

        /** The operator to use for filtering */
        fun operator(operator: Operator) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [Operator] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

        /** The attribe name from profile whose value will be operated against the filter value */
        fun path(path: String) = path(JsonField.of(path))

        /**
         * Sets [Builder.path] to an arbitrary JSON value.
         *
         * You should usually call [Builder.path] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun path(path: JsonField<String>) = apply { this.path = path }

        /** The value to use for filtering */
        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

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
         * Returns an immutable instance of [SingleFilterConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .operator()
         * .path()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SingleFilterConfig =
            SingleFilterConfig(
                checkRequired("operator", operator),
                checkRequired("path", path),
                checkRequired("value", value),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SingleFilterConfig = apply {
        if (validated) {
            return@apply
        }

        operator().validate()
        path()
        value()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (operator.asKnown().getOrNull()?.validity() ?: 0) +
            (if (path.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0)

    /** The operator to use for filtering */
    class Operator @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ENDS_WITH = of("ENDS_WITH")

            @JvmField val EQ = of("EQ")

            @JvmField val EXISTS = of("EXISTS")

            @JvmField val GT = of("GT")

            @JvmField val GTE = of("GTE")

            @JvmField val INCLUDES = of("INCLUDES")

            @JvmField val IS_AFTER = of("IS_AFTER")

            @JvmField val IS_BEFORE = of("IS_BEFORE")

            @JvmField val LT = of("LT")

            @JvmField val LTE = of("LTE")

            @JvmField val NEQ = of("NEQ")

            @JvmField val OMIT = of("OMIT")

            @JvmField val STARTS_WITH = of("STARTS_WITH")

            @JvmField val AND = of("AND")

            @JvmField val OR = of("OR")

            @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
        }

        /** An enum containing [Operator]'s known values. */
        enum class Known {
            ENDS_WITH,
            EQ,
            EXISTS,
            GT,
            GTE,
            INCLUDES,
            IS_AFTER,
            IS_BEFORE,
            LT,
            LTE,
            NEQ,
            OMIT,
            STARTS_WITH,
            AND,
            OR,
        }

        /**
         * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Operator] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENDS_WITH,
            EQ,
            EXISTS,
            GT,
            GTE,
            INCLUDES,
            IS_AFTER,
            IS_BEFORE,
            LT,
            LTE,
            NEQ,
            OMIT,
            STARTS_WITH,
            AND,
            OR,
            /** An enum member indicating that [Operator] was instantiated with an unknown value. */
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
                ENDS_WITH -> Value.ENDS_WITH
                EQ -> Value.EQ
                EXISTS -> Value.EXISTS
                GT -> Value.GT
                GTE -> Value.GTE
                INCLUDES -> Value.INCLUDES
                IS_AFTER -> Value.IS_AFTER
                IS_BEFORE -> Value.IS_BEFORE
                LT -> Value.LT
                LTE -> Value.LTE
                NEQ -> Value.NEQ
                OMIT -> Value.OMIT
                STARTS_WITH -> Value.STARTS_WITH
                AND -> Value.AND
                OR -> Value.OR
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
                ENDS_WITH -> Known.ENDS_WITH
                EQ -> Known.EQ
                EXISTS -> Known.EXISTS
                GT -> Known.GT
                GTE -> Known.GTE
                INCLUDES -> Known.INCLUDES
                IS_AFTER -> Known.IS_AFTER
                IS_BEFORE -> Known.IS_BEFORE
                LT -> Known.LT
                LTE -> Known.LTE
                NEQ -> Known.NEQ
                OMIT -> Known.OMIT
                STARTS_WITH -> Known.STARTS_WITH
                AND -> Known.AND
                OR -> Known.OR
                else -> throw CourierInvalidDataException("Unknown Operator: $value")
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

        fun validate(): Operator = apply {
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

            return other is Operator && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SingleFilterConfig &&
            operator == other.operator &&
            path == other.path &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(operator, path, value, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SingleFilterConfig{operator=$operator, path=$path, value=$value, additionalProperties=$additionalProperties}"
}

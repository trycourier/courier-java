// File generated from our OpenAPI spec by Stainless.

package com.courier.models.digests

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DigestCategory
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val categoryKey: JsonField<String>,
    private val retain: JsonField<Retain>,
    private val sortKey: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("category_key")
        @ExcludeMissing
        categoryKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("retain") @ExcludeMissing retain: JsonField<Retain> = JsonMissing.of(),
        @JsonProperty("sort_key") @ExcludeMissing sortKey: JsonField<String> = JsonMissing.of(),
    ) : this(categoryKey, retain, sortKey, mutableMapOf())

    /**
     * The key that identifies the category within the digest.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun categoryKey(): String = categoryKey.getRequired("category_key")

    /**
     * Which events to keep when the number of events exceeds the retention limit for the category.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun retain(): Retain = retain.getRequired("retain")

    /**
     * The data key used to order events when `retain` is `highest` or `lowest`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sortKey(): Optional<String> = sortKey.getOptional("sort_key")

    /**
     * Returns the raw JSON value of [categoryKey].
     *
     * Unlike [categoryKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category_key")
    @ExcludeMissing
    fun _categoryKey(): JsonField<String> = categoryKey

    /**
     * Returns the raw JSON value of [retain].
     *
     * Unlike [retain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retain") @ExcludeMissing fun _retain(): JsonField<Retain> = retain

    /**
     * Returns the raw JSON value of [sortKey].
     *
     * Unlike [sortKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sort_key") @ExcludeMissing fun _sortKey(): JsonField<String> = sortKey

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
         * Returns a mutable builder for constructing an instance of [DigestCategory].
         *
         * The following fields are required:
         * ```java
         * .categoryKey()
         * .retain()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DigestCategory]. */
    class Builder internal constructor() {

        private var categoryKey: JsonField<String>? = null
        private var retain: JsonField<Retain>? = null
        private var sortKey: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(digestCategory: DigestCategory) = apply {
            categoryKey = digestCategory.categoryKey
            retain = digestCategory.retain
            sortKey = digestCategory.sortKey
            additionalProperties = digestCategory.additionalProperties.toMutableMap()
        }

        /** The key that identifies the category within the digest. */
        fun categoryKey(categoryKey: String) = categoryKey(JsonField.of(categoryKey))

        /**
         * Sets [Builder.categoryKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.categoryKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun categoryKey(categoryKey: JsonField<String>) = apply { this.categoryKey = categoryKey }

        /**
         * Which events to keep when the number of events exceeds the retention limit for the
         * category.
         */
        fun retain(retain: Retain) = retain(JsonField.of(retain))

        /**
         * Sets [Builder.retain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retain] with a well-typed [Retain] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun retain(retain: JsonField<Retain>) = apply { this.retain = retain }

        /** The data key used to order events when `retain` is `highest` or `lowest`. */
        fun sortKey(sortKey: String) = sortKey(JsonField.of(sortKey))

        /**
         * Sets [Builder.sortKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sortKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sortKey(sortKey: JsonField<String>) = apply { this.sortKey = sortKey }

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
         * Returns an immutable instance of [DigestCategory].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .categoryKey()
         * .retain()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DigestCategory =
            DigestCategory(
                checkRequired("categoryKey", categoryKey),
                checkRequired("retain", retain),
                sortKey,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws CourierInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): DigestCategory = apply {
        if (validated) {
            return@apply
        }

        categoryKey()
        retain().validate()
        sortKey()
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
        (if (categoryKey.asKnown().isPresent) 1 else 0) +
            (retain.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sortKey.asKnown().isPresent) 1 else 0)

    /**
     * Which events to keep when the number of events exceeds the retention limit for the category.
     */
    class Retain @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FIRST = of("first")

            @JvmField val LAST = of("last")

            @JvmField val HIGHEST = of("highest")

            @JvmField val LOWEST = of("lowest")

            @JvmField val NONE = of("none")

            @JvmStatic fun of(value: String) = Retain(JsonField.of(value))
        }

        /** An enum containing [Retain]'s known values. */
        enum class Known {
            FIRST,
            LAST,
            HIGHEST,
            LOWEST,
            NONE,
        }

        /**
         * An enum containing [Retain]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Retain] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FIRST,
            LAST,
            HIGHEST,
            LOWEST,
            NONE,
            /** An enum member indicating that [Retain] was instantiated with an unknown value. */
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
                FIRST -> Value.FIRST
                LAST -> Value.LAST
                HIGHEST -> Value.HIGHEST
                LOWEST -> Value.LOWEST
                NONE -> Value.NONE
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
                FIRST -> Known.FIRST
                LAST -> Known.LAST
                HIGHEST -> Known.HIGHEST
                LOWEST -> Known.LOWEST
                NONE -> Known.NONE
                else -> throw CourierInvalidDataException("Unknown Retain: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CourierInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Retain = apply {
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

            return other is Retain && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DigestCategory &&
            categoryKey == other.categoryKey &&
            retain == other.retain &&
            sortKey == other.sortKey &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(categoryKey, retain, sortKey, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DigestCategory{categoryKey=$categoryKey, retain=$retain, sortKey=$sortKey, additionalProperties=$additionalProperties}"
}

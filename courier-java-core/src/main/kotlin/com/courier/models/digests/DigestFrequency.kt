// File generated from our OpenAPI spec by Stainless.

package com.courier.models.digests

import com.courier.core.Enum
import com.courier.core.JsonField
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/**
 * How often a digest is delivered. `instant` delivers immediately without batching, and is the one
 * value that takes no `time`.
 */
class DigestFrequency @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val INSTANT = of("instant")

        @JvmField val DAILY = of("daily")

        @JvmField val WEEKDAYS = of("weekdays")

        @JvmField val WEEKLY = of("weekly")

        @JvmField val CUSTOM_DAYS = of("custom_days")

        @JvmField val MONTHLY = of("monthly")

        @JvmStatic fun of(value: String) = DigestFrequency(JsonField.of(value))
    }

    /** An enum containing [DigestFrequency]'s known values. */
    enum class Known {
        INSTANT,
        DAILY,
        WEEKDAYS,
        WEEKLY,
        CUSTOM_DAYS,
        MONTHLY,
    }

    /**
     * An enum containing [DigestFrequency]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [DigestFrequency] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        INSTANT,
        DAILY,
        WEEKDAYS,
        WEEKLY,
        CUSTOM_DAYS,
        MONTHLY,
        /**
         * An enum member indicating that [DigestFrequency] was instantiated with an unknown value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            INSTANT -> Value.INSTANT
            DAILY -> Value.DAILY
            WEEKDAYS -> Value.WEEKDAYS
            WEEKLY -> Value.WEEKLY
            CUSTOM_DAYS -> Value.CUSTOM_DAYS
            MONTHLY -> Value.MONTHLY
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws CourierInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            INSTANT -> Known.INSTANT
            DAILY -> Known.DAILY
            WEEKDAYS -> Known.WEEKDAYS
            WEEKLY -> Known.WEEKLY
            CUSTOM_DAYS -> Known.CUSTOM_DAYS
            MONTHLY -> Known.MONTHLY
            else -> throw CourierInvalidDataException("Unknown DigestFrequency: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws CourierInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { CourierInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws CourierInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): DigestFrequency = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DigestFrequency && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}

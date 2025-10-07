// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.tenants.templates

import com.courier.api.core.Enum
import com.courier.api.core.JsonField
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

class TextStyle @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val TEXT = of("text")

        @JvmField val H1 = of("h1")

        @JvmField val H2 = of("h2")

        @JvmField val SUBTEXT = of("subtext")

        @JvmStatic fun of(value: String) = TextStyle(JsonField.of(value))
    }

    /** An enum containing [TextStyle]'s known values. */
    enum class Known {
        TEXT,
        H1,
        H2,
        SUBTEXT,
    }

    /**
     * An enum containing [TextStyle]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [TextStyle] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        TEXT,
        H1,
        H2,
        SUBTEXT,
        /** An enum member indicating that [TextStyle] was instantiated with an unknown value. */
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
            TEXT -> Value.TEXT
            H1 -> Value.H1
            H2 -> Value.H2
            SUBTEXT -> Value.SUBTEXT
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
            TEXT -> Known.TEXT
            H1 -> Known.H1
            H2 -> Known.H2
            SUBTEXT -> Known.SUBTEXT
            else -> throw CourierInvalidDataException("Unknown TextStyle: $value")
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

    fun validate(): TextStyle = apply {
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

        return other is TextStyle && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications.previews.runs

import com.courier.core.Enum
import com.courier.core.JsonField
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/**
 * Why the run failed, when `status` is `FAILED`. `NO_EMAIL_CHANNEL` and `TEMPLATE_NOT_SUPPORTED`
 * mean there was nothing to render; `ALL_DEVICES_UNSUPPORTED` means every requested device has been
 * retired and the request can be fixed by choosing others.
 */
class PreviewRunFailureReason
@JsonCreator
private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val TEMPLATE_NOT_SUPPORTED = of("TEMPLATE_NOT_SUPPORTED")

        @JvmField val NO_EMAIL_CHANNEL = of("NO_EMAIL_CHANNEL")

        @JvmField val RENDER_FAILED = of("RENDER_FAILED")

        @JvmField val ALL_DEVICES_UNSUPPORTED = of("ALL_DEVICES_UNSUPPORTED")

        @JvmField val VENDOR_ERROR = of("VENDOR_ERROR")

        @JvmStatic fun of(value: String) = PreviewRunFailureReason(JsonField.of(value))
    }

    /** An enum containing [PreviewRunFailureReason]'s known values. */
    enum class Known {
        TEMPLATE_NOT_SUPPORTED,
        NO_EMAIL_CHANNEL,
        RENDER_FAILED,
        ALL_DEVICES_UNSUPPORTED,
        VENDOR_ERROR,
    }

    /**
     * An enum containing [PreviewRunFailureReason]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [PreviewRunFailureReason] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        TEMPLATE_NOT_SUPPORTED,
        NO_EMAIL_CHANNEL,
        RENDER_FAILED,
        ALL_DEVICES_UNSUPPORTED,
        VENDOR_ERROR,
        /**
         * An enum member indicating that [PreviewRunFailureReason] was instantiated with an unknown
         * value.
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
            TEMPLATE_NOT_SUPPORTED -> Value.TEMPLATE_NOT_SUPPORTED
            NO_EMAIL_CHANNEL -> Value.NO_EMAIL_CHANNEL
            RENDER_FAILED -> Value.RENDER_FAILED
            ALL_DEVICES_UNSUPPORTED -> Value.ALL_DEVICES_UNSUPPORTED
            VENDOR_ERROR -> Value.VENDOR_ERROR
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
            TEMPLATE_NOT_SUPPORTED -> Known.TEMPLATE_NOT_SUPPORTED
            NO_EMAIL_CHANNEL -> Known.NO_EMAIL_CHANNEL
            RENDER_FAILED -> Known.RENDER_FAILED
            ALL_DEVICES_UNSUPPORTED -> Known.ALL_DEVICES_UNSUPPORTED
            VENDOR_ERROR -> Known.VENDOR_ERROR
            else -> throw CourierInvalidDataException("Unknown PreviewRunFailureReason: $value")
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
    fun validate(): PreviewRunFailureReason = apply {
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

        return other is PreviewRunFailureReason && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

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

/** Request body for creating a notification template. */
class NotificationTemplateCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val notification: JsonField<NotificationTemplatePayload>,
    private val state: JsonField<State>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("notification")
        @ExcludeMissing
        notification: JsonField<NotificationTemplatePayload> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
    ) : this(notification, state, mutableMapOf())

    /**
     * Core template fields used in POST and PUT request bodies (nested under a `notification` key)
     * and returned at the top level in responses.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun notification(): NotificationTemplatePayload = notification.getRequired("notification")

    /**
     * Template state after creation. Case-insensitive input, normalized to uppercase in the
     * response. Defaults to "DRAFT".
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<State> = state.getOptional("state")

    /**
     * Returns the raw JSON value of [notification].
     *
     * Unlike [notification], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notification")
    @ExcludeMissing
    fun _notification(): JsonField<NotificationTemplatePayload> = notification

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

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
         * Returns a mutable builder for constructing an instance of
         * [NotificationTemplateCreateRequest].
         *
         * The following fields are required:
         * ```java
         * .notification()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationTemplateCreateRequest]. */
    class Builder internal constructor() {

        private var notification: JsonField<NotificationTemplatePayload>? = null
        private var state: JsonField<State> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(notificationTemplateCreateRequest: NotificationTemplateCreateRequest) =
            apply {
                notification = notificationTemplateCreateRequest.notification
                state = notificationTemplateCreateRequest.state
                additionalProperties =
                    notificationTemplateCreateRequest.additionalProperties.toMutableMap()
            }

        /**
         * Core template fields used in POST and PUT request bodies (nested under a `notification`
         * key) and returned at the top level in responses.
         */
        fun notification(notification: NotificationTemplatePayload) =
            notification(JsonField.of(notification))

        /**
         * Sets [Builder.notification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notification] with a well-typed
         * [NotificationTemplatePayload] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun notification(notification: JsonField<NotificationTemplatePayload>) = apply {
            this.notification = notification
        }

        /**
         * Template state after creation. Case-insensitive input, normalized to uppercase in the
         * response. Defaults to "DRAFT".
         */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<State>) = apply { this.state = state }

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
         * Returns an immutable instance of [NotificationTemplateCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .notification()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NotificationTemplateCreateRequest =
            NotificationTemplateCreateRequest(
                checkRequired("notification", notification),
                state,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NotificationTemplateCreateRequest = apply {
        if (validated) {
            return@apply
        }

        notification().validate()
        state().ifPresent { it.validate() }
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
        (notification.asKnown().getOrNull()?.validity() ?: 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Template state after creation. Case-insensitive input, normalized to uppercase in the
     * response. Defaults to "DRAFT".
     */
    class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DRAFT = of("DRAFT")

            @JvmField val PUBLISHED = of("PUBLISHED")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            DRAFT,
            PUBLISHED,
        }

        /**
         * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [State] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DRAFT,
            PUBLISHED,
            /** An enum member indicating that [State] was instantiated with an unknown value. */
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
                DRAFT -> Value.DRAFT
                PUBLISHED -> Value.PUBLISHED
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
                DRAFT -> Known.DRAFT
                PUBLISHED -> Known.PUBLISHED
                else -> throw CourierInvalidDataException("Unknown State: $value")
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

        fun validate(): State = apply {
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

            return other is State && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationTemplateCreateRequest &&
            notification == other.notification &&
            state == other.state &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(notification, state, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotificationTemplateCreateRequest{notification=$notification, state=$state, additionalProperties=$additionalProperties}"
}

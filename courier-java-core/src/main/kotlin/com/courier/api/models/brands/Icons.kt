// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Icons
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bell: JsonField<String>,
    private val message: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bell") @ExcludeMissing bell: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
    ) : this(bell, message, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bell(): Optional<String> = bell.getOptional("bell")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * Returns the raw JSON value of [bell].
     *
     * Unlike [bell], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bell") @ExcludeMissing fun _bell(): JsonField<String> = bell

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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

        /** Returns a mutable builder for constructing an instance of [Icons]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Icons]. */
    class Builder internal constructor() {

        private var bell: JsonField<String> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(icons: Icons) = apply {
            bell = icons.bell
            message = icons.message
            additionalProperties = icons.additionalProperties.toMutableMap()
        }

        fun bell(bell: String?) = bell(JsonField.ofNullable(bell))

        /** Alias for calling [Builder.bell] with `bell.orElse(null)`. */
        fun bell(bell: Optional<String>) = bell(bell.getOrNull())

        /**
         * Sets [Builder.bell] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bell] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bell(bell: JsonField<String>) = apply { this.bell = bell }

        fun message(message: String?) = message(JsonField.ofNullable(message))

        /** Alias for calling [Builder.message] with `message.orElse(null)`. */
        fun message(message: Optional<String>) = message(message.getOrNull())

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

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
         * Returns an immutable instance of [Icons].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Icons = Icons(bell, message, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): Icons = apply {
        if (validated) {
            return@apply
        }

        bell()
        message()
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
        (if (bell.asKnown().isPresent) 1 else 0) + (if (message.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Icons &&
            bell == other.bell &&
            message == other.message &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(bell, message, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Icons{bell=$bell, message=$message, additionalProperties=$additionalProperties}"
}

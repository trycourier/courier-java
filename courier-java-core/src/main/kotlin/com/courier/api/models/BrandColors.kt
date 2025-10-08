// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

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

class BrandColors
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val primary: JsonField<String>,
    private val secondary: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("primary") @ExcludeMissing primary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secondary") @ExcludeMissing secondary: JsonField<String> = JsonMissing.of(),
    ) : this(primary, secondary, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primary(): Optional<String> = primary.getOptional("primary")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun secondary(): Optional<String> = secondary.getOptional("secondary")

    /**
     * Returns the raw JSON value of [primary].
     *
     * Unlike [primary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primary") @ExcludeMissing fun _primary(): JsonField<String> = primary

    /**
     * Returns the raw JSON value of [secondary].
     *
     * Unlike [secondary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secondary") @ExcludeMissing fun _secondary(): JsonField<String> = secondary

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

        /** Returns a mutable builder for constructing an instance of [BrandColors]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandColors]. */
    class Builder internal constructor() {

        private var primary: JsonField<String> = JsonMissing.of()
        private var secondary: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandColors: BrandColors) = apply {
            primary = brandColors.primary
            secondary = brandColors.secondary
            additionalProperties = brandColors.additionalProperties.toMutableMap()
        }

        fun primary(primary: String?) = primary(JsonField.ofNullable(primary))

        /** Alias for calling [Builder.primary] with `primary.orElse(null)`. */
        fun primary(primary: Optional<String>) = primary(primary.getOrNull())

        /**
         * Sets [Builder.primary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primary] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun primary(primary: JsonField<String>) = apply { this.primary = primary }

        fun secondary(secondary: String?) = secondary(JsonField.ofNullable(secondary))

        /** Alias for calling [Builder.secondary] with `secondary.orElse(null)`. */
        fun secondary(secondary: Optional<String>) = secondary(secondary.getOrNull())

        /**
         * Sets [Builder.secondary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondary] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun secondary(secondary: JsonField<String>) = apply { this.secondary = secondary }

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
         * Returns an immutable instance of [BrandColors].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandColors =
            BrandColors(primary, secondary, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): BrandColors = apply {
        if (validated) {
            return@apply
        }

        primary()
        secondary()
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
        (if (primary.asKnown().isPresent) 1 else 0) + (if (secondary.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandColors &&
            primary == other.primary &&
            secondary == other.secondary &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(primary, secondary, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandColors{primary=$primary, secondary=$secondary, additionalProperties=$additionalProperties}"
}

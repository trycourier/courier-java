// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.checkRequired
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EmailHeader
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val logo: JsonField<Logo>,
    private val barColor: JsonField<String>,
    private val inheritDefault: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("logo") @ExcludeMissing logo: JsonField<Logo> = JsonMissing.of(),
        @JsonProperty("barColor") @ExcludeMissing barColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inheritDefault")
        @ExcludeMissing
        inheritDefault: JsonField<Boolean> = JsonMissing.of(),
    ) : this(logo, barColor, inheritDefault, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun logo(): Logo = logo.getRequired("logo")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun barColor(): Optional<String> = barColor.getOptional("barColor")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inheritDefault(): Optional<Boolean> = inheritDefault.getOptional("inheritDefault")

    /**
     * Returns the raw JSON value of [logo].
     *
     * Unlike [logo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logo") @ExcludeMissing fun _logo(): JsonField<Logo> = logo

    /**
     * Returns the raw JSON value of [barColor].
     *
     * Unlike [barColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("barColor") @ExcludeMissing fun _barColor(): JsonField<String> = barColor

    /**
     * Returns the raw JSON value of [inheritDefault].
     *
     * Unlike [inheritDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inheritDefault")
    @ExcludeMissing
    fun _inheritDefault(): JsonField<Boolean> = inheritDefault

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
         * Returns a mutable builder for constructing an instance of [EmailHeader].
         *
         * The following fields are required:
         * ```java
         * .logo()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailHeader]. */
    class Builder internal constructor() {

        private var logo: JsonField<Logo>? = null
        private var barColor: JsonField<String> = JsonMissing.of()
        private var inheritDefault: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailHeader: EmailHeader) = apply {
            logo = emailHeader.logo
            barColor = emailHeader.barColor
            inheritDefault = emailHeader.inheritDefault
            additionalProperties = emailHeader.additionalProperties.toMutableMap()
        }

        fun logo(logo: Logo) = logo(JsonField.of(logo))

        /**
         * Sets [Builder.logo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logo] with a well-typed [Logo] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logo(logo: JsonField<Logo>) = apply { this.logo = logo }

        fun barColor(barColor: String?) = barColor(JsonField.ofNullable(barColor))

        /** Alias for calling [Builder.barColor] with `barColor.orElse(null)`. */
        fun barColor(barColor: Optional<String>) = barColor(barColor.getOrNull())

        /**
         * Sets [Builder.barColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.barColor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun barColor(barColor: JsonField<String>) = apply { this.barColor = barColor }

        fun inheritDefault(inheritDefault: Boolean?) =
            inheritDefault(JsonField.ofNullable(inheritDefault))

        /**
         * Alias for [Builder.inheritDefault].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun inheritDefault(inheritDefault: Boolean) = inheritDefault(inheritDefault as Boolean?)

        /** Alias for calling [Builder.inheritDefault] with `inheritDefault.orElse(null)`. */
        fun inheritDefault(inheritDefault: Optional<Boolean>) =
            inheritDefault(inheritDefault.getOrNull())

        /**
         * Sets [Builder.inheritDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inheritDefault] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inheritDefault(inheritDefault: JsonField<Boolean>) = apply {
            this.inheritDefault = inheritDefault
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
         * Returns an immutable instance of [EmailHeader].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .logo()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailHeader =
            EmailHeader(
                checkRequired("logo", logo),
                barColor,
                inheritDefault,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EmailHeader = apply {
        if (validated) {
            return@apply
        }

        logo().validate()
        barColor()
        inheritDefault()
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
        (logo.asKnown().getOrNull()?.validity() ?: 0) +
            (if (barColor.asKnown().isPresent) 1 else 0) +
            (if (inheritDefault.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailHeader &&
            logo == other.logo &&
            barColor == other.barColor &&
            inheritDefault == other.inheritDefault &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(logo, barColor, inheritDefault, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailHeader{logo=$logo, barColor=$barColor, inheritDefault=$inheritDefault, additionalProperties=$additionalProperties}"
}

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

class BrandSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val colors: JsonField<BrandColors>,
    private val email: JsonField<Email>,
    private val inapp: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("colors") @ExcludeMissing colors: JsonField<BrandColors> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<Email> = JsonMissing.of(),
        @JsonProperty("inapp") @ExcludeMissing inapp: JsonValue = JsonMissing.of(),
    ) : this(colors, email, inapp, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun colors(): Optional<BrandColors> = colors.getOptional("colors")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<Email> = email.getOptional("email")

    @JsonProperty("inapp") @ExcludeMissing fun _inapp(): JsonValue = inapp

    /**
     * Returns the raw JSON value of [colors].
     *
     * Unlike [colors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("colors") @ExcludeMissing fun _colors(): JsonField<BrandColors> = colors

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<Email> = email

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

        /** Returns a mutable builder for constructing an instance of [BrandSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandSettings]. */
    class Builder internal constructor() {

        private var colors: JsonField<BrandColors> = JsonMissing.of()
        private var email: JsonField<Email> = JsonMissing.of()
        private var inapp: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandSettings: BrandSettings) = apply {
            colors = brandSettings.colors
            email = brandSettings.email
            inapp = brandSettings.inapp
            additionalProperties = brandSettings.additionalProperties.toMutableMap()
        }

        fun colors(colors: BrandColors?) = colors(JsonField.ofNullable(colors))

        /** Alias for calling [Builder.colors] with `colors.orElse(null)`. */
        fun colors(colors: Optional<BrandColors>) = colors(colors.getOrNull())

        /**
         * Sets [Builder.colors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.colors] with a well-typed [BrandColors] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun colors(colors: JsonField<BrandColors>) = apply { this.colors = colors }

        fun email(email: Email?) = email(JsonField.ofNullable(email))

        /** Alias for calling [Builder.email] with `email.orElse(null)`. */
        fun email(email: Optional<Email>) = email(email.getOrNull())

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [Email] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<Email>) = apply { this.email = email }

        fun inapp(inapp: JsonValue) = apply { this.inapp = inapp }

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
         * Returns an immutable instance of [BrandSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandSettings =
            BrandSettings(colors, email, inapp, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): BrandSettings = apply {
        if (validated) {
            return@apply
        }

        colors().ifPresent { it.validate() }
        email().ifPresent { it.validate() }
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
        (colors.asKnown().getOrNull()?.validity() ?: 0) +
            (email.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandSettings &&
            colors == other.colors &&
            email == other.email &&
            inapp == other.inapp &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(colors, email, inapp, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandSettings{colors=$colors, email=$email, inapp=$inapp, additionalProperties=$additionalProperties}"
}

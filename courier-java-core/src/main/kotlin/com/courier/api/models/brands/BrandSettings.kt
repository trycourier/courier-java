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

class BrandSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val colors: JsonField<Colors>,
    private val email: JsonField<Email>,
    private val inapp: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("colors") @ExcludeMissing colors: JsonField<Colors> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<Email> = JsonMissing.of(),
        @JsonProperty("inapp") @ExcludeMissing inapp: JsonValue = JsonMissing.of(),
    ) : this(colors, email, inapp, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun colors(): Optional<Colors> = colors.getOptional("colors")

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
    @JsonProperty("colors") @ExcludeMissing fun _colors(): JsonField<Colors> = colors

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

        private var colors: JsonField<Colors> = JsonMissing.of()
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

        fun colors(colors: Colors?) = colors(JsonField.ofNullable(colors))

        /** Alias for calling [Builder.colors] with `colors.orElse(null)`. */
        fun colors(colors: Optional<Colors>) = colors(colors.getOrNull())

        /**
         * Sets [Builder.colors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.colors] with a well-typed [Colors] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun colors(colors: JsonField<Colors>) = apply { this.colors = colors }

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

    class Colors
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val primary: JsonField<String>,
        private val secondary: JsonField<String>,
        private val tertiary: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("primary") @ExcludeMissing primary: JsonField<String> = JsonMissing.of(),
            @JsonProperty("secondary")
            @ExcludeMissing
            secondary: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tertiary") @ExcludeMissing tertiary: JsonField<String> = JsonMissing.of(),
        ) : this(primary, secondary, tertiary, mutableMapOf())

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
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tertiary(): Optional<String> = tertiary.getOptional("tertiary")

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

        /**
         * Returns the raw JSON value of [tertiary].
         *
         * Unlike [tertiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tertiary") @ExcludeMissing fun _tertiary(): JsonField<String> = tertiary

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

            /** Returns a mutable builder for constructing an instance of [Colors]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Colors]. */
        class Builder internal constructor() {

            private var primary: JsonField<String> = JsonMissing.of()
            private var secondary: JsonField<String> = JsonMissing.of()
            private var tertiary: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(colors: Colors) = apply {
                primary = colors.primary
                secondary = colors.secondary
                tertiary = colors.tertiary
                additionalProperties = colors.additionalProperties.toMutableMap()
            }

            fun primary(primary: String?) = primary(JsonField.ofNullable(primary))

            /** Alias for calling [Builder.primary] with `primary.orElse(null)`. */
            fun primary(primary: Optional<String>) = primary(primary.getOrNull())

            /**
             * Sets [Builder.primary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primary] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun primary(primary: JsonField<String>) = apply { this.primary = primary }

            fun secondary(secondary: String?) = secondary(JsonField.ofNullable(secondary))

            /** Alias for calling [Builder.secondary] with `secondary.orElse(null)`. */
            fun secondary(secondary: Optional<String>) = secondary(secondary.getOrNull())

            /**
             * Sets [Builder.secondary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secondary] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secondary(secondary: JsonField<String>) = apply { this.secondary = secondary }

            fun tertiary(tertiary: String?) = tertiary(JsonField.ofNullable(tertiary))

            /** Alias for calling [Builder.tertiary] with `tertiary.orElse(null)`. */
            fun tertiary(tertiary: Optional<String>) = tertiary(tertiary.getOrNull())

            /**
             * Sets [Builder.tertiary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tertiary] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tertiary(tertiary: JsonField<String>) = apply { this.tertiary = tertiary }

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
             * Returns an immutable instance of [Colors].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Colors =
                Colors(primary, secondary, tertiary, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Colors = apply {
            if (validated) {
                return@apply
            }

            primary()
            secondary()
            tertiary()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (primary.asKnown().isPresent) 1 else 0) +
                (if (secondary.asKnown().isPresent) 1 else 0) +
                (if (tertiary.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Colors &&
                primary == other.primary &&
                secondary == other.secondary &&
                tertiary == other.tertiary &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(primary, secondary, tertiary, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Colors{primary=$primary, secondary=$secondary, tertiary=$tertiary, additionalProperties=$additionalProperties}"
    }

    class Email
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val footer: JsonValue,
        private val header: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("footer") @ExcludeMissing footer: JsonValue = JsonMissing.of(),
            @JsonProperty("header") @ExcludeMissing header: JsonValue = JsonMissing.of(),
        ) : this(footer, header, mutableMapOf())

        @JsonProperty("footer") @ExcludeMissing fun _footer(): JsonValue = footer

        @JsonProperty("header") @ExcludeMissing fun _header(): JsonValue = header

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
             * Returns a mutable builder for constructing an instance of [Email].
             *
             * The following fields are required:
             * ```java
             * .footer()
             * .header()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Email]. */
        class Builder internal constructor() {

            private var footer: JsonValue? = null
            private var header: JsonValue? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(email: Email) = apply {
                footer = email.footer
                header = email.header
                additionalProperties = email.additionalProperties.toMutableMap()
            }

            fun footer(footer: JsonValue) = apply { this.footer = footer }

            fun header(header: JsonValue) = apply { this.header = header }

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
             * Returns an immutable instance of [Email].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .footer()
             * .header()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Email =
                Email(
                    checkRequired("footer", footer),
                    checkRequired("header", header),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Email = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic internal fun validity(): Int = 0

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Email &&
                footer == other.footer &&
                header == other.header &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(footer, header, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Email{footer=$footer, header=$header, additionalProperties=$additionalProperties}"
    }

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

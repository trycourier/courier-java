// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.brands

import com.courier.api.core.Enum
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
    private val inapp: JsonField<Inapp>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("colors") @ExcludeMissing colors: JsonField<Colors> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<Email> = JsonMissing.of(),
        @JsonProperty("inapp") @ExcludeMissing inapp: JsonField<Inapp> = JsonMissing.of(),
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

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inapp(): Optional<Inapp> = inapp.getOptional("inapp")

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

    /**
     * Returns the raw JSON value of [inapp].
     *
     * Unlike [inapp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inapp") @ExcludeMissing fun _inapp(): JsonField<Inapp> = inapp

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
        private var inapp: JsonField<Inapp> = JsonMissing.of()
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

        fun inapp(inapp: Inapp?) = inapp(JsonField.ofNullable(inapp))

        /** Alias for calling [Builder.inapp] with `inapp.orElse(null)`. */
        fun inapp(inapp: Optional<Inapp>) = inapp(inapp.getOrNull())

        /**
         * Sets [Builder.inapp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inapp] with a well-typed [Inapp] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inapp(inapp: JsonField<Inapp>) = apply { this.inapp = inapp }

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
        inapp().ifPresent { it.validate() }
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
            (email.asKnown().getOrNull()?.validity() ?: 0) +
            (inapp.asKnown().getOrNull()?.validity() ?: 0)

    class Colors
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val primary: JsonField<String>,
        private val secondary: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("primary") @ExcludeMissing primary: JsonField<String> = JsonMissing.of(),
            @JsonProperty("secondary")
            @ExcludeMissing
            secondary: JsonField<String> = JsonMissing.of(),
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

            /** Returns a mutable builder for constructing an instance of [Colors]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Colors]. */
        class Builder internal constructor() {

            private var primary: JsonField<String> = JsonMissing.of()
            private var secondary: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(colors: Colors) = apply {
                primary = colors.primary
                secondary = colors.secondary
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
            fun build(): Colors = Colors(primary, secondary, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Colors = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (primary.asKnown().isPresent) 1 else 0) +
                (if (secondary.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Colors &&
                primary == other.primary &&
                secondary == other.secondary &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(primary, secondary, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Colors{primary=$primary, secondary=$secondary, additionalProperties=$additionalProperties}"
    }

    class Email
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val footer: JsonField<Footer>,
        private val head: JsonField<Head>,
        private val header: JsonField<Header>,
        private val templateOverride: JsonField<TemplateOverride>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("footer") @ExcludeMissing footer: JsonField<Footer> = JsonMissing.of(),
            @JsonProperty("head") @ExcludeMissing head: JsonField<Head> = JsonMissing.of(),
            @JsonProperty("header") @ExcludeMissing header: JsonField<Header> = JsonMissing.of(),
            @JsonProperty("templateOverride")
            @ExcludeMissing
            templateOverride: JsonField<TemplateOverride> = JsonMissing.of(),
        ) : this(footer, head, header, templateOverride, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun footer(): Optional<Footer> = footer.getOptional("footer")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun head(): Optional<Head> = head.getOptional("head")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun header(): Optional<Header> = header.getOptional("header")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun templateOverride(): Optional<TemplateOverride> =
            templateOverride.getOptional("templateOverride")

        /**
         * Returns the raw JSON value of [footer].
         *
         * Unlike [footer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("footer") @ExcludeMissing fun _footer(): JsonField<Footer> = footer

        /**
         * Returns the raw JSON value of [head].
         *
         * Unlike [head], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("head") @ExcludeMissing fun _head(): JsonField<Head> = head

        /**
         * Returns the raw JSON value of [header].
         *
         * Unlike [header], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("header") @ExcludeMissing fun _header(): JsonField<Header> = header

        /**
         * Returns the raw JSON value of [templateOverride].
         *
         * Unlike [templateOverride], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("templateOverride")
        @ExcludeMissing
        fun _templateOverride(): JsonField<TemplateOverride> = templateOverride

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

            /** Returns a mutable builder for constructing an instance of [Email]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Email]. */
        class Builder internal constructor() {

            private var footer: JsonField<Footer> = JsonMissing.of()
            private var head: JsonField<Head> = JsonMissing.of()
            private var header: JsonField<Header> = JsonMissing.of()
            private var templateOverride: JsonField<TemplateOverride> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(email: Email) = apply {
                footer = email.footer
                head = email.head
                header = email.header
                templateOverride = email.templateOverride
                additionalProperties = email.additionalProperties.toMutableMap()
            }

            fun footer(footer: Footer?) = footer(JsonField.ofNullable(footer))

            /** Alias for calling [Builder.footer] with `footer.orElse(null)`. */
            fun footer(footer: Optional<Footer>) = footer(footer.getOrNull())

            /**
             * Sets [Builder.footer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.footer] with a well-typed [Footer] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun footer(footer: JsonField<Footer>) = apply { this.footer = footer }

            fun head(head: Head?) = head(JsonField.ofNullable(head))

            /** Alias for calling [Builder.head] with `head.orElse(null)`. */
            fun head(head: Optional<Head>) = head(head.getOrNull())

            /**
             * Sets [Builder.head] to an arbitrary JSON value.
             *
             * You should usually call [Builder.head] with a well-typed [Head] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun head(head: JsonField<Head>) = apply { this.head = head }

            fun header(header: Header?) = header(JsonField.ofNullable(header))

            /** Alias for calling [Builder.header] with `header.orElse(null)`. */
            fun header(header: Optional<Header>) = header(header.getOrNull())

            /**
             * Sets [Builder.header] to an arbitrary JSON value.
             *
             * You should usually call [Builder.header] with a well-typed [Header] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun header(header: JsonField<Header>) = apply { this.header = header }

            fun templateOverride(templateOverride: TemplateOverride?) =
                templateOverride(JsonField.ofNullable(templateOverride))

            /**
             * Alias for calling [Builder.templateOverride] with `templateOverride.orElse(null)`.
             */
            fun templateOverride(templateOverride: Optional<TemplateOverride>) =
                templateOverride(templateOverride.getOrNull())

            /**
             * Sets [Builder.templateOverride] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templateOverride] with a well-typed
             * [TemplateOverride] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun templateOverride(templateOverride: JsonField<TemplateOverride>) = apply {
                this.templateOverride = templateOverride
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
             * Returns an immutable instance of [Email].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Email =
                Email(footer, head, header, templateOverride, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Email = apply {
            if (validated) {
                return@apply
            }

            footer().ifPresent { it.validate() }
            head().ifPresent { it.validate() }
            header().ifPresent { it.validate() }
            templateOverride().ifPresent { it.validate() }
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
            (footer.asKnown().getOrNull()?.validity() ?: 0) +
                (head.asKnown().getOrNull()?.validity() ?: 0) +
                (header.asKnown().getOrNull()?.validity() ?: 0) +
                (templateOverride.asKnown().getOrNull()?.validity() ?: 0)

        class Footer
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val content: JsonField<String>,
            private val inheritDefault: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
                @JsonProperty("inheritDefault")
                @ExcludeMissing
                inheritDefault: JsonField<Boolean> = JsonMissing.of(),
            ) : this(content, inheritDefault, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun content(): Optional<String> = content.getOptional("content")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun inheritDefault(): Optional<Boolean> = inheritDefault.getOptional("inheritDefault")

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

            /**
             * Returns the raw JSON value of [inheritDefault].
             *
             * Unlike [inheritDefault], this method doesn't throw if the JSON field has an
             * unexpected type.
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

                /** Returns a mutable builder for constructing an instance of [Footer]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Footer]. */
            class Builder internal constructor() {

                private var content: JsonField<String> = JsonMissing.of()
                private var inheritDefault: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(footer: Footer) = apply {
                    content = footer.content
                    inheritDefault = footer.inheritDefault
                    additionalProperties = footer.additionalProperties.toMutableMap()
                }

                fun content(content: String?) = content(JsonField.ofNullable(content))

                /** Alias for calling [Builder.content] with `content.orElse(null)`. */
                fun content(content: Optional<String>) = content(content.getOrNull())

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                fun inheritDefault(inheritDefault: Boolean?) =
                    inheritDefault(JsonField.ofNullable(inheritDefault))

                /**
                 * Alias for [Builder.inheritDefault].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun inheritDefault(inheritDefault: Boolean) =
                    inheritDefault(inheritDefault as Boolean?)

                /**
                 * Alias for calling [Builder.inheritDefault] with `inheritDefault.orElse(null)`.
                 */
                fun inheritDefault(inheritDefault: Optional<Boolean>) =
                    inheritDefault(inheritDefault.getOrNull())

                /**
                 * Sets [Builder.inheritDefault] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inheritDefault] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Footer].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Footer =
                    Footer(content, inheritDefault, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Footer = apply {
                if (validated) {
                    return@apply
                }

                content()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (content.asKnown().isPresent) 1 else 0) +
                    (if (inheritDefault.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Footer &&
                    content == other.content &&
                    inheritDefault == other.inheritDefault &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, inheritDefault, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Footer{content=$content, inheritDefault=$inheritDefault, additionalProperties=$additionalProperties}"
        }

        class Head
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val inheritDefault: JsonField<Boolean>,
            private val content: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("inheritDefault")
                @ExcludeMissing
                inheritDefault: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<String> = JsonMissing.of(),
            ) : this(inheritDefault, content, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun inheritDefault(): Boolean = inheritDefault.getRequired("inheritDefault")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun content(): Optional<String> = content.getOptional("content")

            /**
             * Returns the raw JSON value of [inheritDefault].
             *
             * Unlike [inheritDefault], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("inheritDefault")
            @ExcludeMissing
            fun _inheritDefault(): JsonField<Boolean> = inheritDefault

            /**
             * Returns the raw JSON value of [content].
             *
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

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
                 * Returns a mutable builder for constructing an instance of [Head].
                 *
                 * The following fields are required:
                 * ```java
                 * .inheritDefault()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Head]. */
            class Builder internal constructor() {

                private var inheritDefault: JsonField<Boolean>? = null
                private var content: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(head: Head) = apply {
                    inheritDefault = head.inheritDefault
                    content = head.content
                    additionalProperties = head.additionalProperties.toMutableMap()
                }

                fun inheritDefault(inheritDefault: Boolean) =
                    inheritDefault(JsonField.of(inheritDefault))

                /**
                 * Sets [Builder.inheritDefault] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inheritDefault] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun inheritDefault(inheritDefault: JsonField<Boolean>) = apply {
                    this.inheritDefault = inheritDefault
                }

                fun content(content: String?) = content(JsonField.ofNullable(content))

                /** Alias for calling [Builder.content] with `content.orElse(null)`. */
                fun content(content: Optional<String>) = content(content.getOrNull())

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun content(content: JsonField<String>) = apply { this.content = content }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Head].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .inheritDefault()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Head =
                    Head(
                        checkRequired("inheritDefault", inheritDefault),
                        content,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Head = apply {
                if (validated) {
                    return@apply
                }

                inheritDefault()
                content()
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
                (if (inheritDefault.asKnown().isPresent) 1 else 0) +
                    (if (content.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Head &&
                    inheritDefault == other.inheritDefault &&
                    content == other.content &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(inheritDefault, content, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Head{inheritDefault=$inheritDefault, content=$content, additionalProperties=$additionalProperties}"
        }

        class Header
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
                @JsonProperty("barColor")
                @ExcludeMissing
                barColor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("inheritDefault")
                @ExcludeMissing
                inheritDefault: JsonField<Boolean> = JsonMissing.of(),
            ) : this(logo, barColor, inheritDefault, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun logo(): Logo = logo.getRequired("logo")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun barColor(): Optional<String> = barColor.getOptional("barColor")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [barColor], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("barColor") @ExcludeMissing fun _barColor(): JsonField<String> = barColor

            /**
             * Returns the raw JSON value of [inheritDefault].
             *
             * Unlike [inheritDefault], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [Header].
                 *
                 * The following fields are required:
                 * ```java
                 * .logo()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Header]. */
            class Builder internal constructor() {

                private var logo: JsonField<Logo>? = null
                private var barColor: JsonField<String> = JsonMissing.of()
                private var inheritDefault: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(header: Header) = apply {
                    logo = header.logo
                    barColor = header.barColor
                    inheritDefault = header.inheritDefault
                    additionalProperties = header.additionalProperties.toMutableMap()
                }

                fun logo(logo: Logo) = logo(JsonField.of(logo))

                /**
                 * Sets [Builder.logo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.logo] with a well-typed [Logo] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun logo(logo: JsonField<Logo>) = apply { this.logo = logo }

                fun barColor(barColor: String?) = barColor(JsonField.ofNullable(barColor))

                /** Alias for calling [Builder.barColor] with `barColor.orElse(null)`. */
                fun barColor(barColor: Optional<String>) = barColor(barColor.getOrNull())

                /**
                 * Sets [Builder.barColor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.barColor] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun barColor(barColor: JsonField<String>) = apply { this.barColor = barColor }

                fun inheritDefault(inheritDefault: Boolean?) =
                    inheritDefault(JsonField.ofNullable(inheritDefault))

                /**
                 * Alias for [Builder.inheritDefault].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun inheritDefault(inheritDefault: Boolean) =
                    inheritDefault(inheritDefault as Boolean?)

                /**
                 * Alias for calling [Builder.inheritDefault] with `inheritDefault.orElse(null)`.
                 */
                fun inheritDefault(inheritDefault: Optional<Boolean>) =
                    inheritDefault(inheritDefault.getOrNull())

                /**
                 * Sets [Builder.inheritDefault] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inheritDefault] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Header].
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
                fun build(): Header =
                    Header(
                        checkRequired("logo", logo),
                        barColor,
                        inheritDefault,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Header = apply {
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (logo.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (barColor.asKnown().isPresent) 1 else 0) +
                    (if (inheritDefault.asKnown().isPresent) 1 else 0)

            class Logo
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val href: JsonField<String>,
                private val image: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("href")
                    @ExcludeMissing
                    href: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("image")
                    @ExcludeMissing
                    image: JsonField<String> = JsonMissing.of(),
                ) : this(href, image, mutableMapOf())

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun href(): Optional<String> = href.getOptional("href")

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun image(): Optional<String> = image.getOptional("image")

                /**
                 * Returns the raw JSON value of [href].
                 *
                 * Unlike [href], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("href") @ExcludeMissing fun _href(): JsonField<String> = href

                /**
                 * Returns the raw JSON value of [image].
                 *
                 * Unlike [image], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<String> = image

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

                    /** Returns a mutable builder for constructing an instance of [Logo]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Logo]. */
                class Builder internal constructor() {

                    private var href: JsonField<String> = JsonMissing.of()
                    private var image: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(logo: Logo) = apply {
                        href = logo.href
                        image = logo.image
                        additionalProperties = logo.additionalProperties.toMutableMap()
                    }

                    fun href(href: String?) = href(JsonField.ofNullable(href))

                    /** Alias for calling [Builder.href] with `href.orElse(null)`. */
                    fun href(href: Optional<String>) = href(href.getOrNull())

                    /**
                     * Sets [Builder.href] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.href] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun href(href: JsonField<String>) = apply { this.href = href }

                    fun image(image: String?) = image(JsonField.ofNullable(image))

                    /** Alias for calling [Builder.image] with `image.orElse(null)`. */
                    fun image(image: Optional<String>) = image(image.getOrNull())

                    /**
                     * Sets [Builder.image] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.image] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun image(image: JsonField<String>) = apply { this.image = image }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Logo].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Logo = Logo(href, image, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Logo = apply {
                    if (validated) {
                        return@apply
                    }

                    href()
                    image()
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
                    (if (href.asKnown().isPresent) 1 else 0) +
                        (if (image.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Logo &&
                        href == other.href &&
                        image == other.image &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(href, image, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Logo{href=$href, image=$image, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Header &&
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
                "Header{logo=$logo, barColor=$barColor, inheritDefault=$inheritDefault, additionalProperties=$additionalProperties}"
        }

        class TemplateOverride
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val enabled: JsonField<Boolean>,
            private val backgroundColor: JsonField<String>,
            private val blocksBackgroundColor: JsonField<String>,
            private val footer: JsonField<String>,
            private val head: JsonField<String>,
            private val header: JsonField<String>,
            private val width: JsonField<String>,
            private val mjml: JsonField<BrandTemplate>,
            private val footerBackgroundColor: JsonField<String>,
            private val footerFullWidth: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("enabled")
                @ExcludeMissing
                enabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("backgroundColor")
                @ExcludeMissing
                backgroundColor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("blocksBackgroundColor")
                @ExcludeMissing
                blocksBackgroundColor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("footer")
                @ExcludeMissing
                footer: JsonField<String> = JsonMissing.of(),
                @JsonProperty("head") @ExcludeMissing head: JsonField<String> = JsonMissing.of(),
                @JsonProperty("header")
                @ExcludeMissing
                header: JsonField<String> = JsonMissing.of(),
                @JsonProperty("width") @ExcludeMissing width: JsonField<String> = JsonMissing.of(),
                @JsonProperty("mjml")
                @ExcludeMissing
                mjml: JsonField<BrandTemplate> = JsonMissing.of(),
                @JsonProperty("footerBackgroundColor")
                @ExcludeMissing
                footerBackgroundColor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("footerFullWidth")
                @ExcludeMissing
                footerFullWidth: JsonField<Boolean> = JsonMissing.of(),
            ) : this(
                enabled,
                backgroundColor,
                blocksBackgroundColor,
                footer,
                head,
                header,
                width,
                mjml,
                footerBackgroundColor,
                footerFullWidth,
                mutableMapOf(),
            )

            fun toBrandTemplate(): BrandTemplate =
                BrandTemplate.builder()
                    .enabled(enabled)
                    .backgroundColor(backgroundColor)
                    .blocksBackgroundColor(blocksBackgroundColor)
                    .footer(footer)
                    .head(head)
                    .header(header)
                    .width(width)
                    .build()

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun enabled(): Boolean = enabled.getRequired("enabled")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun backgroundColor(): Optional<String> = backgroundColor.getOptional("backgroundColor")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun blocksBackgroundColor(): Optional<String> =
                blocksBackgroundColor.getOptional("blocksBackgroundColor")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun footer(): Optional<String> = footer.getOptional("footer")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun head(): Optional<String> = head.getOptional("head")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun header(): Optional<String> = header.getOptional("header")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun width(): Optional<String> = width.getOptional("width")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun mjml(): BrandTemplate = mjml.getRequired("mjml")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun footerBackgroundColor(): Optional<String> =
                footerBackgroundColor.getOptional("footerBackgroundColor")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun footerFullWidth(): Optional<Boolean> =
                footerFullWidth.getOptional("footerFullWidth")

            /**
             * Returns the raw JSON value of [enabled].
             *
             * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

            /**
             * Returns the raw JSON value of [backgroundColor].
             *
             * Unlike [backgroundColor], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("backgroundColor")
            @ExcludeMissing
            fun _backgroundColor(): JsonField<String> = backgroundColor

            /**
             * Returns the raw JSON value of [blocksBackgroundColor].
             *
             * Unlike [blocksBackgroundColor], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("blocksBackgroundColor")
            @ExcludeMissing
            fun _blocksBackgroundColor(): JsonField<String> = blocksBackgroundColor

            /**
             * Returns the raw JSON value of [footer].
             *
             * Unlike [footer], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("footer") @ExcludeMissing fun _footer(): JsonField<String> = footer

            /**
             * Returns the raw JSON value of [head].
             *
             * Unlike [head], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("head") @ExcludeMissing fun _head(): JsonField<String> = head

            /**
             * Returns the raw JSON value of [header].
             *
             * Unlike [header], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("header") @ExcludeMissing fun _header(): JsonField<String> = header

            /**
             * Returns the raw JSON value of [width].
             *
             * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<String> = width

            /**
             * Returns the raw JSON value of [mjml].
             *
             * Unlike [mjml], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mjml") @ExcludeMissing fun _mjml(): JsonField<BrandTemplate> = mjml

            /**
             * Returns the raw JSON value of [footerBackgroundColor].
             *
             * Unlike [footerBackgroundColor], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("footerBackgroundColor")
            @ExcludeMissing
            fun _footerBackgroundColor(): JsonField<String> = footerBackgroundColor

            /**
             * Returns the raw JSON value of [footerFullWidth].
             *
             * Unlike [footerFullWidth], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("footerFullWidth")
            @ExcludeMissing
            fun _footerFullWidth(): JsonField<Boolean> = footerFullWidth

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
                 * Returns a mutable builder for constructing an instance of [TemplateOverride].
                 *
                 * The following fields are required:
                 * ```java
                 * .enabled()
                 * .mjml()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TemplateOverride]. */
            class Builder internal constructor() {

                private var enabled: JsonField<Boolean>? = null
                private var backgroundColor: JsonField<String> = JsonMissing.of()
                private var blocksBackgroundColor: JsonField<String> = JsonMissing.of()
                private var footer: JsonField<String> = JsonMissing.of()
                private var head: JsonField<String> = JsonMissing.of()
                private var header: JsonField<String> = JsonMissing.of()
                private var width: JsonField<String> = JsonMissing.of()
                private var mjml: JsonField<BrandTemplate>? = null
                private var footerBackgroundColor: JsonField<String> = JsonMissing.of()
                private var footerFullWidth: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(templateOverride: TemplateOverride) = apply {
                    enabled = templateOverride.enabled
                    backgroundColor = templateOverride.backgroundColor
                    blocksBackgroundColor = templateOverride.blocksBackgroundColor
                    footer = templateOverride.footer
                    head = templateOverride.head
                    header = templateOverride.header
                    width = templateOverride.width
                    mjml = templateOverride.mjml
                    footerBackgroundColor = templateOverride.footerBackgroundColor
                    footerFullWidth = templateOverride.footerFullWidth
                    additionalProperties = templateOverride.additionalProperties.toMutableMap()
                }

                fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

                /**
                 * Sets [Builder.enabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enabled] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

                fun backgroundColor(backgroundColor: String?) =
                    backgroundColor(JsonField.ofNullable(backgroundColor))

                /**
                 * Alias for calling [Builder.backgroundColor] with `backgroundColor.orElse(null)`.
                 */
                fun backgroundColor(backgroundColor: Optional<String>) =
                    backgroundColor(backgroundColor.getOrNull())

                /**
                 * Sets [Builder.backgroundColor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.backgroundColor] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun backgroundColor(backgroundColor: JsonField<String>) = apply {
                    this.backgroundColor = backgroundColor
                }

                fun blocksBackgroundColor(blocksBackgroundColor: String?) =
                    blocksBackgroundColor(JsonField.ofNullable(blocksBackgroundColor))

                /**
                 * Alias for calling [Builder.blocksBackgroundColor] with
                 * `blocksBackgroundColor.orElse(null)`.
                 */
                fun blocksBackgroundColor(blocksBackgroundColor: Optional<String>) =
                    blocksBackgroundColor(blocksBackgroundColor.getOrNull())

                /**
                 * Sets [Builder.blocksBackgroundColor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blocksBackgroundColor] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun blocksBackgroundColor(blocksBackgroundColor: JsonField<String>) = apply {
                    this.blocksBackgroundColor = blocksBackgroundColor
                }

                fun footer(footer: String?) = footer(JsonField.ofNullable(footer))

                /** Alias for calling [Builder.footer] with `footer.orElse(null)`. */
                fun footer(footer: Optional<String>) = footer(footer.getOrNull())

                /**
                 * Sets [Builder.footer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.footer] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun footer(footer: JsonField<String>) = apply { this.footer = footer }

                fun head(head: String?) = head(JsonField.ofNullable(head))

                /** Alias for calling [Builder.head] with `head.orElse(null)`. */
                fun head(head: Optional<String>) = head(head.getOrNull())

                /**
                 * Sets [Builder.head] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.head] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun head(head: JsonField<String>) = apply { this.head = head }

                fun header(header: String?) = header(JsonField.ofNullable(header))

                /** Alias for calling [Builder.header] with `header.orElse(null)`. */
                fun header(header: Optional<String>) = header(header.getOrNull())

                /**
                 * Sets [Builder.header] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.header] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun header(header: JsonField<String>) = apply { this.header = header }

                fun width(width: String?) = width(JsonField.ofNullable(width))

                /** Alias for calling [Builder.width] with `width.orElse(null)`. */
                fun width(width: Optional<String>) = width(width.getOrNull())

                /**
                 * Sets [Builder.width] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.width] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun width(width: JsonField<String>) = apply { this.width = width }

                fun mjml(mjml: BrandTemplate) = mjml(JsonField.of(mjml))

                /**
                 * Sets [Builder.mjml] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mjml] with a well-typed [BrandTemplate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun mjml(mjml: JsonField<BrandTemplate>) = apply { this.mjml = mjml }

                fun footerBackgroundColor(footerBackgroundColor: String?) =
                    footerBackgroundColor(JsonField.ofNullable(footerBackgroundColor))

                /**
                 * Alias for calling [Builder.footerBackgroundColor] with
                 * `footerBackgroundColor.orElse(null)`.
                 */
                fun footerBackgroundColor(footerBackgroundColor: Optional<String>) =
                    footerBackgroundColor(footerBackgroundColor.getOrNull())

                /**
                 * Sets [Builder.footerBackgroundColor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.footerBackgroundColor] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun footerBackgroundColor(footerBackgroundColor: JsonField<String>) = apply {
                    this.footerBackgroundColor = footerBackgroundColor
                }

                fun footerFullWidth(footerFullWidth: Boolean?) =
                    footerFullWidth(JsonField.ofNullable(footerFullWidth))

                /**
                 * Alias for [Builder.footerFullWidth].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun footerFullWidth(footerFullWidth: Boolean) =
                    footerFullWidth(footerFullWidth as Boolean?)

                /**
                 * Alias for calling [Builder.footerFullWidth] with `footerFullWidth.orElse(null)`.
                 */
                fun footerFullWidth(footerFullWidth: Optional<Boolean>) =
                    footerFullWidth(footerFullWidth.getOrNull())

                /**
                 * Sets [Builder.footerFullWidth] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.footerFullWidth] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun footerFullWidth(footerFullWidth: JsonField<Boolean>) = apply {
                    this.footerFullWidth = footerFullWidth
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [TemplateOverride].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .enabled()
                 * .mjml()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TemplateOverride =
                    TemplateOverride(
                        checkRequired("enabled", enabled),
                        backgroundColor,
                        blocksBackgroundColor,
                        footer,
                        head,
                        header,
                        width,
                        checkRequired("mjml", mjml),
                        footerBackgroundColor,
                        footerFullWidth,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TemplateOverride = apply {
                if (validated) {
                    return@apply
                }

                enabled()
                backgroundColor()
                blocksBackgroundColor()
                footer()
                head()
                header()
                width()
                mjml().validate()
                footerBackgroundColor()
                footerFullWidth()
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
                (if (enabled.asKnown().isPresent) 1 else 0) +
                    (if (backgroundColor.asKnown().isPresent) 1 else 0) +
                    (if (blocksBackgroundColor.asKnown().isPresent) 1 else 0) +
                    (if (footer.asKnown().isPresent) 1 else 0) +
                    (if (head.asKnown().isPresent) 1 else 0) +
                    (if (header.asKnown().isPresent) 1 else 0) +
                    (if (width.asKnown().isPresent) 1 else 0) +
                    (mjml.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (footerBackgroundColor.asKnown().isPresent) 1 else 0) +
                    (if (footerFullWidth.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TemplateOverride &&
                    enabled == other.enabled &&
                    backgroundColor == other.backgroundColor &&
                    blocksBackgroundColor == other.blocksBackgroundColor &&
                    footer == other.footer &&
                    head == other.head &&
                    header == other.header &&
                    width == other.width &&
                    mjml == other.mjml &&
                    footerBackgroundColor == other.footerBackgroundColor &&
                    footerFullWidth == other.footerFullWidth &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    enabled,
                    backgroundColor,
                    blocksBackgroundColor,
                    footer,
                    head,
                    header,
                    width,
                    mjml,
                    footerBackgroundColor,
                    footerFullWidth,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TemplateOverride{enabled=$enabled, backgroundColor=$backgroundColor, blocksBackgroundColor=$blocksBackgroundColor, footer=$footer, head=$head, header=$header, width=$width, mjml=$mjml, footerBackgroundColor=$footerBackgroundColor, footerFullWidth=$footerFullWidth, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Email &&
                footer == other.footer &&
                head == other.head &&
                header == other.header &&
                templateOverride == other.templateOverride &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(footer, head, header, templateOverride, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Email{footer=$footer, head=$head, header=$header, templateOverride=$templateOverride, additionalProperties=$additionalProperties}"
    }

    class Inapp
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val colors: JsonField<Colors>,
        private val icons: JsonField<Icons>,
        private val widgetBackground: JsonField<WidgetBackground>,
        private val borderRadius: JsonField<String>,
        private val disableMessageIcon: JsonField<Boolean>,
        private val fontFamily: JsonField<String>,
        private val placement: JsonField<Placement>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("colors") @ExcludeMissing colors: JsonField<Colors> = JsonMissing.of(),
            @JsonProperty("icons") @ExcludeMissing icons: JsonField<Icons> = JsonMissing.of(),
            @JsonProperty("widgetBackground")
            @ExcludeMissing
            widgetBackground: JsonField<WidgetBackground> = JsonMissing.of(),
            @JsonProperty("borderRadius")
            @ExcludeMissing
            borderRadius: JsonField<String> = JsonMissing.of(),
            @JsonProperty("disableMessageIcon")
            @ExcludeMissing
            disableMessageIcon: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("fontFamily")
            @ExcludeMissing
            fontFamily: JsonField<String> = JsonMissing.of(),
            @JsonProperty("placement")
            @ExcludeMissing
            placement: JsonField<Placement> = JsonMissing.of(),
        ) : this(
            colors,
            icons,
            widgetBackground,
            borderRadius,
            disableMessageIcon,
            fontFamily,
            placement,
            mutableMapOf(),
        )

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun colors(): Colors = colors.getRequired("colors")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun icons(): Icons = icons.getRequired("icons")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun widgetBackground(): WidgetBackground = widgetBackground.getRequired("widgetBackground")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun borderRadius(): Optional<String> = borderRadius.getOptional("borderRadius")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun disableMessageIcon(): Optional<Boolean> =
            disableMessageIcon.getOptional("disableMessageIcon")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fontFamily(): Optional<String> = fontFamily.getOptional("fontFamily")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun placement(): Optional<Placement> = placement.getOptional("placement")

        /**
         * Returns the raw JSON value of [colors].
         *
         * Unlike [colors], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("colors") @ExcludeMissing fun _colors(): JsonField<Colors> = colors

        /**
         * Returns the raw JSON value of [icons].
         *
         * Unlike [icons], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("icons") @ExcludeMissing fun _icons(): JsonField<Icons> = icons

        /**
         * Returns the raw JSON value of [widgetBackground].
         *
         * Unlike [widgetBackground], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("widgetBackground")
        @ExcludeMissing
        fun _widgetBackground(): JsonField<WidgetBackground> = widgetBackground

        /**
         * Returns the raw JSON value of [borderRadius].
         *
         * Unlike [borderRadius], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("borderRadius")
        @ExcludeMissing
        fun _borderRadius(): JsonField<String> = borderRadius

        /**
         * Returns the raw JSON value of [disableMessageIcon].
         *
         * Unlike [disableMessageIcon], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("disableMessageIcon")
        @ExcludeMissing
        fun _disableMessageIcon(): JsonField<Boolean> = disableMessageIcon

        /**
         * Returns the raw JSON value of [fontFamily].
         *
         * Unlike [fontFamily], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fontFamily")
        @ExcludeMissing
        fun _fontFamily(): JsonField<String> = fontFamily

        /**
         * Returns the raw JSON value of [placement].
         *
         * Unlike [placement], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("placement")
        @ExcludeMissing
        fun _placement(): JsonField<Placement> = placement

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
             * Returns a mutable builder for constructing an instance of [Inapp].
             *
             * The following fields are required:
             * ```java
             * .colors()
             * .icons()
             * .widgetBackground()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Inapp]. */
        class Builder internal constructor() {

            private var colors: JsonField<Colors>? = null
            private var icons: JsonField<Icons>? = null
            private var widgetBackground: JsonField<WidgetBackground>? = null
            private var borderRadius: JsonField<String> = JsonMissing.of()
            private var disableMessageIcon: JsonField<Boolean> = JsonMissing.of()
            private var fontFamily: JsonField<String> = JsonMissing.of()
            private var placement: JsonField<Placement> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inapp: Inapp) = apply {
                colors = inapp.colors
                icons = inapp.icons
                widgetBackground = inapp.widgetBackground
                borderRadius = inapp.borderRadius
                disableMessageIcon = inapp.disableMessageIcon
                fontFamily = inapp.fontFamily
                placement = inapp.placement
                additionalProperties = inapp.additionalProperties.toMutableMap()
            }

            fun colors(colors: Colors) = colors(JsonField.of(colors))

            /**
             * Sets [Builder.colors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.colors] with a well-typed [Colors] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun colors(colors: JsonField<Colors>) = apply { this.colors = colors }

            fun icons(icons: Icons) = icons(JsonField.of(icons))

            /**
             * Sets [Builder.icons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.icons] with a well-typed [Icons] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun icons(icons: JsonField<Icons>) = apply { this.icons = icons }

            fun widgetBackground(widgetBackground: WidgetBackground) =
                widgetBackground(JsonField.of(widgetBackground))

            /**
             * Sets [Builder.widgetBackground] to an arbitrary JSON value.
             *
             * You should usually call [Builder.widgetBackground] with a well-typed
             * [WidgetBackground] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun widgetBackground(widgetBackground: JsonField<WidgetBackground>) = apply {
                this.widgetBackground = widgetBackground
            }

            fun borderRadius(borderRadius: String?) =
                borderRadius(JsonField.ofNullable(borderRadius))

            /** Alias for calling [Builder.borderRadius] with `borderRadius.orElse(null)`. */
            fun borderRadius(borderRadius: Optional<String>) =
                borderRadius(borderRadius.getOrNull())

            /**
             * Sets [Builder.borderRadius] to an arbitrary JSON value.
             *
             * You should usually call [Builder.borderRadius] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun borderRadius(borderRadius: JsonField<String>) = apply {
                this.borderRadius = borderRadius
            }

            fun disableMessageIcon(disableMessageIcon: Boolean?) =
                disableMessageIcon(JsonField.ofNullable(disableMessageIcon))

            /**
             * Alias for [Builder.disableMessageIcon].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun disableMessageIcon(disableMessageIcon: Boolean) =
                disableMessageIcon(disableMessageIcon as Boolean?)

            /**
             * Alias for calling [Builder.disableMessageIcon] with
             * `disableMessageIcon.orElse(null)`.
             */
            fun disableMessageIcon(disableMessageIcon: Optional<Boolean>) =
                disableMessageIcon(disableMessageIcon.getOrNull())

            /**
             * Sets [Builder.disableMessageIcon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.disableMessageIcon] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun disableMessageIcon(disableMessageIcon: JsonField<Boolean>) = apply {
                this.disableMessageIcon = disableMessageIcon
            }

            fun fontFamily(fontFamily: String?) = fontFamily(JsonField.ofNullable(fontFamily))

            /** Alias for calling [Builder.fontFamily] with `fontFamily.orElse(null)`. */
            fun fontFamily(fontFamily: Optional<String>) = fontFamily(fontFamily.getOrNull())

            /**
             * Sets [Builder.fontFamily] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fontFamily] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fontFamily(fontFamily: JsonField<String>) = apply { this.fontFamily = fontFamily }

            fun placement(placement: Placement?) = placement(JsonField.ofNullable(placement))

            /** Alias for calling [Builder.placement] with `placement.orElse(null)`. */
            fun placement(placement: Optional<Placement>) = placement(placement.getOrNull())

            /**
             * Sets [Builder.placement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.placement] with a well-typed [Placement] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun placement(placement: JsonField<Placement>) = apply { this.placement = placement }

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
             * Returns an immutable instance of [Inapp].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .colors()
             * .icons()
             * .widgetBackground()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Inapp =
                Inapp(
                    checkRequired("colors", colors),
                    checkRequired("icons", icons),
                    checkRequired("widgetBackground", widgetBackground),
                    borderRadius,
                    disableMessageIcon,
                    fontFamily,
                    placement,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Inapp = apply {
            if (validated) {
                return@apply
            }

            colors().validate()
            icons().validate()
            widgetBackground().validate()
            borderRadius()
            disableMessageIcon()
            fontFamily()
            placement().ifPresent { it.validate() }
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
            (colors.asKnown().getOrNull()?.validity() ?: 0) +
                (icons.asKnown().getOrNull()?.validity() ?: 0) +
                (widgetBackground.asKnown().getOrNull()?.validity() ?: 0) +
                (if (borderRadius.asKnown().isPresent) 1 else 0) +
                (if (disableMessageIcon.asKnown().isPresent) 1 else 0) +
                (if (fontFamily.asKnown().isPresent) 1 else 0) +
                (placement.asKnown().getOrNull()?.validity() ?: 0)

        class Colors
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val primary: JsonField<String>,
            private val secondary: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("primary")
                @ExcludeMissing
                primary: JsonField<String> = JsonMissing.of(),
                @JsonProperty("secondary")
                @ExcludeMissing
                secondary: JsonField<String> = JsonMissing.of(),
            ) : this(primary, secondary, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun primary(): Optional<String> = primary.getOptional("primary")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
             * Unlike [secondary], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("secondary")
            @ExcludeMissing
            fun _secondary(): JsonField<String> = secondary

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
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(colors: Colors) = apply {
                    primary = colors.primary
                    secondary = colors.secondary
                    additionalProperties = colors.additionalProperties.toMutableMap()
                }

                fun primary(primary: String?) = primary(JsonField.ofNullable(primary))

                /** Alias for calling [Builder.primary] with `primary.orElse(null)`. */
                fun primary(primary: Optional<String>) = primary(primary.getOrNull())

                /**
                 * Sets [Builder.primary] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.primary] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun primary(primary: JsonField<String>) = apply { this.primary = primary }

                fun secondary(secondary: String?) = secondary(JsonField.ofNullable(secondary))

                /** Alias for calling [Builder.secondary] with `secondary.orElse(null)`. */
                fun secondary(secondary: Optional<String>) = secondary(secondary.getOrNull())

                /**
                 * Sets [Builder.secondary] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.secondary] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun secondary(secondary: JsonField<String>) = apply { this.secondary = secondary }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Colors].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Colors =
                    Colors(primary, secondary, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Colors = apply {
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (primary.asKnown().isPresent) 1 else 0) +
                    (if (secondary.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Colors &&
                    primary == other.primary &&
                    secondary == other.secondary &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(primary, secondary, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Colors{primary=$primary, secondary=$secondary, additionalProperties=$additionalProperties}"
        }

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
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
            ) : this(bell, message, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bell(): Optional<String> = bell.getOptional("bell")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
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
                 * You should usually call [Builder.bell] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun bell(bell: JsonField<String>) = apply { this.bell = bell }

                fun message(message: String?) = message(JsonField.ofNullable(message))

                /** Alias for calling [Builder.message] with `message.orElse(null)`. */
                fun message(message: Optional<String>) = message(message.getOrNull())

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (bell.asKnown().isPresent) 1 else 0) +
                    (if (message.asKnown().isPresent) 1 else 0)

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

        class WidgetBackground
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val bottomColor: JsonField<String>,
            private val topColor: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("bottomColor")
                @ExcludeMissing
                bottomColor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("topColor")
                @ExcludeMissing
                topColor: JsonField<String> = JsonMissing.of(),
            ) : this(bottomColor, topColor, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun bottomColor(): Optional<String> = bottomColor.getOptional("bottomColor")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun topColor(): Optional<String> = topColor.getOptional("topColor")

            /**
             * Returns the raw JSON value of [bottomColor].
             *
             * Unlike [bottomColor], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bottomColor")
            @ExcludeMissing
            fun _bottomColor(): JsonField<String> = bottomColor

            /**
             * Returns the raw JSON value of [topColor].
             *
             * Unlike [topColor], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("topColor") @ExcludeMissing fun _topColor(): JsonField<String> = topColor

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

                /** Returns a mutable builder for constructing an instance of [WidgetBackground]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WidgetBackground]. */
            class Builder internal constructor() {

                private var bottomColor: JsonField<String> = JsonMissing.of()
                private var topColor: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(widgetBackground: WidgetBackground) = apply {
                    bottomColor = widgetBackground.bottomColor
                    topColor = widgetBackground.topColor
                    additionalProperties = widgetBackground.additionalProperties.toMutableMap()
                }

                fun bottomColor(bottomColor: String?) =
                    bottomColor(JsonField.ofNullable(bottomColor))

                /** Alias for calling [Builder.bottomColor] with `bottomColor.orElse(null)`. */
                fun bottomColor(bottomColor: Optional<String>) =
                    bottomColor(bottomColor.getOrNull())

                /**
                 * Sets [Builder.bottomColor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bottomColor] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bottomColor(bottomColor: JsonField<String>) = apply {
                    this.bottomColor = bottomColor
                }

                fun topColor(topColor: String?) = topColor(JsonField.ofNullable(topColor))

                /** Alias for calling [Builder.topColor] with `topColor.orElse(null)`. */
                fun topColor(topColor: Optional<String>) = topColor(topColor.getOrNull())

                /**
                 * Sets [Builder.topColor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.topColor] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun topColor(topColor: JsonField<String>) = apply { this.topColor = topColor }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [WidgetBackground].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): WidgetBackground =
                    WidgetBackground(bottomColor, topColor, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): WidgetBackground = apply {
                if (validated) {
                    return@apply
                }

                bottomColor()
                topColor()
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
                (if (bottomColor.asKnown().isPresent) 1 else 0) +
                    (if (topColor.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WidgetBackground &&
                    bottomColor == other.bottomColor &&
                    topColor == other.topColor &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(bottomColor, topColor, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WidgetBackground{bottomColor=$bottomColor, topColor=$topColor, additionalProperties=$additionalProperties}"
        }

        class Placement @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val TOP = of("top")

                @JvmField val BOTTOM = of("bottom")

                @JvmField val LEFT = of("left")

                @JvmField val RIGHT = of("right")

                @JvmStatic fun of(value: String) = Placement(JsonField.of(value))
            }

            /** An enum containing [Placement]'s known values. */
            enum class Known {
                TOP,
                BOTTOM,
                LEFT,
                RIGHT,
            }

            /**
             * An enum containing [Placement]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Placement] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TOP,
                BOTTOM,
                LEFT,
                RIGHT,
                /**
                 * An enum member indicating that [Placement] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    TOP -> Value.TOP
                    BOTTOM -> Value.BOTTOM
                    LEFT -> Value.LEFT
                    RIGHT -> Value.RIGHT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CourierInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    TOP -> Known.TOP
                    BOTTOM -> Known.BOTTOM
                    LEFT -> Known.LEFT
                    RIGHT -> Known.RIGHT
                    else -> throw CourierInvalidDataException("Unknown Placement: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CourierInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CourierInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Placement = apply {
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

                return other is Placement && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Inapp &&
                colors == other.colors &&
                icons == other.icons &&
                widgetBackground == other.widgetBackground &&
                borderRadius == other.borderRadius &&
                disableMessageIcon == other.disableMessageIcon &&
                fontFamily == other.fontFamily &&
                placement == other.placement &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                colors,
                icons,
                widgetBackground,
                borderRadius,
                disableMessageIcon,
                fontFamily,
                placement,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Inapp{colors=$colors, icons=$icons, widgetBackground=$widgetBackground, borderRadius=$borderRadius, disableMessageIcon=$disableMessageIcon, fontFamily=$fontFamily, placement=$placement, additionalProperties=$additionalProperties}"
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

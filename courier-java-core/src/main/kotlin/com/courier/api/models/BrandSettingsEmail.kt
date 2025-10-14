// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

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

class BrandSettingsEmail
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val footer: JsonField<EmailFooter>,
    private val head: JsonField<EmailHead>,
    private val header: JsonField<EmailHeader>,
    private val templateOverride: JsonField<TemplateOverride>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("footer") @ExcludeMissing footer: JsonField<EmailFooter> = JsonMissing.of(),
        @JsonProperty("head") @ExcludeMissing head: JsonField<EmailHead> = JsonMissing.of(),
        @JsonProperty("header") @ExcludeMissing header: JsonField<EmailHeader> = JsonMissing.of(),
        @JsonProperty("templateOverride")
        @ExcludeMissing
        templateOverride: JsonField<TemplateOverride> = JsonMissing.of(),
    ) : this(footer, head, header, templateOverride, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun footer(): Optional<EmailFooter> = footer.getOptional("footer")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun head(): Optional<EmailHead> = head.getOptional("head")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun header(): Optional<EmailHeader> = header.getOptional("header")

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
    @JsonProperty("footer") @ExcludeMissing fun _footer(): JsonField<EmailFooter> = footer

    /**
     * Returns the raw JSON value of [head].
     *
     * Unlike [head], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("head") @ExcludeMissing fun _head(): JsonField<EmailHead> = head

    /**
     * Returns the raw JSON value of [header].
     *
     * Unlike [header], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("header") @ExcludeMissing fun _header(): JsonField<EmailHeader> = header

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

        /** Returns a mutable builder for constructing an instance of [BrandSettingsEmail]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandSettingsEmail]. */
    class Builder internal constructor() {

        private var footer: JsonField<EmailFooter> = JsonMissing.of()
        private var head: JsonField<EmailHead> = JsonMissing.of()
        private var header: JsonField<EmailHeader> = JsonMissing.of()
        private var templateOverride: JsonField<TemplateOverride> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandSettingsEmail: BrandSettingsEmail) = apply {
            footer = brandSettingsEmail.footer
            head = brandSettingsEmail.head
            header = brandSettingsEmail.header
            templateOverride = brandSettingsEmail.templateOverride
            additionalProperties = brandSettingsEmail.additionalProperties.toMutableMap()
        }

        fun footer(footer: EmailFooter?) = footer(JsonField.ofNullable(footer))

        /** Alias for calling [Builder.footer] with `footer.orElse(null)`. */
        fun footer(footer: Optional<EmailFooter>) = footer(footer.getOrNull())

        /**
         * Sets [Builder.footer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.footer] with a well-typed [EmailFooter] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun footer(footer: JsonField<EmailFooter>) = apply { this.footer = footer }

        fun head(head: EmailHead?) = head(JsonField.ofNullable(head))

        /** Alias for calling [Builder.head] with `head.orElse(null)`. */
        fun head(head: Optional<EmailHead>) = head(head.getOrNull())

        /**
         * Sets [Builder.head] to an arbitrary JSON value.
         *
         * You should usually call [Builder.head] with a well-typed [EmailHead] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun head(head: JsonField<EmailHead>) = apply { this.head = head }

        fun header(header: EmailHeader?) = header(JsonField.ofNullable(header))

        /** Alias for calling [Builder.header] with `header.orElse(null)`. */
        fun header(header: Optional<EmailHeader>) = header(header.getOrNull())

        /**
         * Sets [Builder.header] to an arbitrary JSON value.
         *
         * You should usually call [Builder.header] with a well-typed [EmailHeader] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun header(header: JsonField<EmailHeader>) = apply { this.header = header }

        fun templateOverride(templateOverride: TemplateOverride?) =
            templateOverride(JsonField.ofNullable(templateOverride))

        /** Alias for calling [Builder.templateOverride] with `templateOverride.orElse(null)`. */
        fun templateOverride(templateOverride: Optional<TemplateOverride>) =
            templateOverride(templateOverride.getOrNull())

        /**
         * Sets [Builder.templateOverride] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateOverride] with a well-typed [TemplateOverride]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * Returns an immutable instance of [BrandSettingsEmail].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BrandSettingsEmail =
            BrandSettingsEmail(
                footer,
                head,
                header,
                templateOverride,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BrandSettingsEmail = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (footer.asKnown().getOrNull()?.validity() ?: 0) +
            (head.asKnown().getOrNull()?.validity() ?: 0) +
            (header.asKnown().getOrNull()?.validity() ?: 0) +
            (templateOverride.asKnown().getOrNull()?.validity() ?: 0)

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
            @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("backgroundColor")
            @ExcludeMissing
            backgroundColor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("blocksBackgroundColor")
            @ExcludeMissing
            blocksBackgroundColor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("footer") @ExcludeMissing footer: JsonField<String> = JsonMissing.of(),
            @JsonProperty("head") @ExcludeMissing head: JsonField<String> = JsonMissing.of(),
            @JsonProperty("header") @ExcludeMissing header: JsonField<String> = JsonMissing.of(),
            @JsonProperty("width") @ExcludeMissing width: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mjml") @ExcludeMissing mjml: JsonField<BrandTemplate> = JsonMissing.of(),
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
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun enabled(): Boolean = enabled.getRequired("enabled")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun backgroundColor(): Optional<String> = backgroundColor.getOptional("backgroundColor")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun blocksBackgroundColor(): Optional<String> =
            blocksBackgroundColor.getOptional("blocksBackgroundColor")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun footer(): Optional<String> = footer.getOptional("footer")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun head(): Optional<String> = head.getOptional("head")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun header(): Optional<String> = header.getOptional("header")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun width(): Optional<String> = width.getOptional("width")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mjml(): BrandTemplate = mjml.getRequired("mjml")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun footerBackgroundColor(): Optional<String> =
            footerBackgroundColor.getOptional("footerBackgroundColor")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun footerFullWidth(): Optional<Boolean> = footerFullWidth.getOptional("footerFullWidth")

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * Returns the raw JSON value of [backgroundColor].
         *
         * Unlike [backgroundColor], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [footerFullWidth], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            fun backgroundColor(backgroundColor: String?) =
                backgroundColor(JsonField.ofNullable(backgroundColor))

            /** Alias for calling [Builder.backgroundColor] with `backgroundColor.orElse(null)`. */
            fun backgroundColor(backgroundColor: Optional<String>) =
                backgroundColor(backgroundColor.getOrNull())

            /**
             * Sets [Builder.backgroundColor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.backgroundColor] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.blocksBackgroundColor] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.footer] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun footer(footer: JsonField<String>) = apply { this.footer = footer }

            fun head(head: String?) = head(JsonField.ofNullable(head))

            /** Alias for calling [Builder.head] with `head.orElse(null)`. */
            fun head(head: Optional<String>) = head(head.getOrNull())

            /**
             * Sets [Builder.head] to an arbitrary JSON value.
             *
             * You should usually call [Builder.head] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun head(head: JsonField<String>) = apply { this.head = head }

            fun header(header: String?) = header(JsonField.ofNullable(header))

            /** Alias for calling [Builder.header] with `header.orElse(null)`. */
            fun header(header: Optional<String>) = header(header.getOrNull())

            /**
             * Sets [Builder.header] to an arbitrary JSON value.
             *
             * You should usually call [Builder.header] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.footerBackgroundColor] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** Alias for calling [Builder.footerFullWidth] with `footerFullWidth.orElse(null)`. */
            fun footerFullWidth(footerFullWidth: Optional<Boolean>) =
                footerFullWidth(footerFullWidth.getOrNull())

            /**
             * Sets [Builder.footerFullWidth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.footerFullWidth] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

        return other is BrandSettingsEmail &&
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
        "BrandSettingsEmail{footer=$footer, head=$head, header=$header, templateOverride=$templateOverride, additionalProperties=$additionalProperties}"
}

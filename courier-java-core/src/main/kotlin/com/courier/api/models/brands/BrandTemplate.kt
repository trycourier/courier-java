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

class BrandTemplate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val enabled: JsonField<Boolean>,
    private val backgroundColor: JsonField<String>,
    private val blocksBackgroundColor: JsonField<String>,
    private val footer: JsonField<String>,
    private val head: JsonField<String>,
    private val header: JsonField<String>,
    private val width: JsonField<String>,
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
    ) : this(
        enabled,
        backgroundColor,
        blocksBackgroundColor,
        footer,
        head,
        header,
        width,
        mutableMapOf(),
    )

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
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [backgroundColor].
     *
     * Unlike [backgroundColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("backgroundColor")
    @ExcludeMissing
    fun _backgroundColor(): JsonField<String> = backgroundColor

    /**
     * Returns the raw JSON value of [blocksBackgroundColor].
     *
     * Unlike [blocksBackgroundColor], this method doesn't throw if the JSON field has an unexpected
     * type.
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
         * Returns a mutable builder for constructing an instance of [BrandTemplate].
         *
         * The following fields are required:
         * ```java
         * .enabled()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BrandTemplate]. */
    class Builder internal constructor() {

        private var enabled: JsonField<Boolean>? = null
        private var backgroundColor: JsonField<String> = JsonMissing.of()
        private var blocksBackgroundColor: JsonField<String> = JsonMissing.of()
        private var footer: JsonField<String> = JsonMissing.of()
        private var head: JsonField<String> = JsonMissing.of()
        private var header: JsonField<String> = JsonMissing.of()
        private var width: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(brandTemplate: BrandTemplate) = apply {
            enabled = brandTemplate.enabled
            backgroundColor = brandTemplate.backgroundColor
            blocksBackgroundColor = brandTemplate.blocksBackgroundColor
            footer = brandTemplate.footer
            head = brandTemplate.head
            header = brandTemplate.header
            width = brandTemplate.width
            additionalProperties = brandTemplate.additionalProperties.toMutableMap()
        }

        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * You should usually call [Builder.blocksBackgroundColor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * You should usually call [Builder.footer] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun footer(footer: JsonField<String>) = apply { this.footer = footer }

        fun head(head: String?) = head(JsonField.ofNullable(head))

        /** Alias for calling [Builder.head] with `head.orElse(null)`. */
        fun head(head: Optional<String>) = head(head.getOrNull())

        /**
         * Sets [Builder.head] to an arbitrary JSON value.
         *
         * You should usually call [Builder.head] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun head(head: JsonField<String>) = apply { this.head = head }

        fun header(header: String?) = header(JsonField.ofNullable(header))

        /** Alias for calling [Builder.header] with `header.orElse(null)`. */
        fun header(header: Optional<String>) = header(header.getOrNull())

        /**
         * Sets [Builder.header] to an arbitrary JSON value.
         *
         * You should usually call [Builder.header] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun header(header: JsonField<String>) = apply { this.header = header }

        fun width(width: String?) = width(JsonField.ofNullable(width))

        /** Alias for calling [Builder.width] with `width.orElse(null)`. */
        fun width(width: Optional<String>) = width(width.getOrNull())

        /**
         * Sets [Builder.width] to an arbitrary JSON value.
         *
         * You should usually call [Builder.width] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun width(width: JsonField<String>) = apply { this.width = width }

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
         * Returns an immutable instance of [BrandTemplate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .enabled()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BrandTemplate =
            BrandTemplate(
                checkRequired("enabled", enabled),
                backgroundColor,
                blocksBackgroundColor,
                footer,
                head,
                header,
                width,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BrandTemplate = apply {
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
        (if (enabled.asKnown().isPresent) 1 else 0) +
            (if (backgroundColor.asKnown().isPresent) 1 else 0) +
            (if (blocksBackgroundColor.asKnown().isPresent) 1 else 0) +
            (if (footer.asKnown().isPresent) 1 else 0) +
            (if (head.asKnown().isPresent) 1 else 0) +
            (if (header.asKnown().isPresent) 1 else 0) +
            (if (width.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BrandTemplate &&
            enabled == other.enabled &&
            backgroundColor == other.backgroundColor &&
            blocksBackgroundColor == other.blocksBackgroundColor &&
            footer == other.footer &&
            head == other.head &&
            header == other.header &&
            width == other.width &&
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
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BrandTemplate{enabled=$enabled, backgroundColor=$backgroundColor, blocksBackgroundColor=$blocksBackgroundColor, footer=$footer, head=$head, header=$header, width=$width, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.Enum
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Renders a quote block. */
class ElementalQuoteNodeWithType
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val channels: JsonField<List<String>>,
    private val if_: JsonField<String>,
    private val loop: JsonField<String>,
    private val ref: JsonField<String>,
    private val content: JsonField<String>,
    private val align: JsonField<Alignment>,
    private val borderColor: JsonField<String>,
    private val fontSize: JsonField<String>,
    private val lineHeight: JsonField<String>,
    private val locales: JsonField<Locales>,
    private val textStyle: JsonField<TextStyle>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("channels")
        @ExcludeMissing
        channels: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("if") @ExcludeMissing if_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("loop") @ExcludeMissing loop: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ref") @ExcludeMissing ref: JsonField<String> = JsonMissing.of(),
        @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
        @JsonProperty("align") @ExcludeMissing align: JsonField<Alignment> = JsonMissing.of(),
        @JsonProperty("border_color")
        @ExcludeMissing
        borderColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("font_size") @ExcludeMissing fontSize: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line_height")
        @ExcludeMissing
        lineHeight: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locales") @ExcludeMissing locales: JsonField<Locales> = JsonMissing.of(),
        @JsonProperty("text_style")
        @ExcludeMissing
        textStyle: JsonField<TextStyle> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        channels,
        if_,
        loop,
        ref,
        content,
        align,
        borderColor,
        fontSize,
        lineHeight,
        locales,
        textStyle,
        type,
        mutableMapOf(),
    )

    fun toElementalQuoteNode(): ElementalQuoteNode =
        ElementalQuoteNode.builder()
            .channels(channels)
            .if_(if_)
            .loop(loop)
            .ref(ref)
            .content(content)
            .align(align)
            .borderColor(borderColor)
            .fontSize(fontSize)
            .lineHeight(lineHeight)
            .locales(locales)
            .textStyle(textStyle)
            .build()

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channels(): Optional<List<String>> = channels.getOptional("channels")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun if_(): Optional<String> = if_.getOptional("if")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun loop(): Optional<String> = loop.getOptional("loop")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ref(): Optional<String> = ref.getOptional("ref")

    /**
     * The text value of the quote.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun content(): String = content.getRequired("content")

    /**
     * Alignment of the quote.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun align(): Optional<Alignment> = align.getOptional("align")

    /**
     * CSS border color property. For example, `#fff`
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun borderColor(): Optional<String> = borderColor.getOptional("border_color")

    /**
     * CSS px font size for this quote block, e.g. `16px`. Overrides the size of the `text_style`
     * preset. Email only.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fontSize(): Optional<String> = fontSize.getOptional("font_size")

    /**
     * CSS line height for this quote block, as a px value or a unitless multiplier, e.g. `24px` or
     * `1.5`. Email only.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lineHeight(): Optional<String> = lineHeight.getOptional("line_height")

    /**
     * Region specific content. See
     * [locales docs](https://www.courier.com/docs/platform/content/elemental/locales/) for more
     * details.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locales(): Optional<Locales> = locales.getOptional("locales")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textStyle(): Optional<TextStyle> = textStyle.getOptional("text_style")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [channels].
     *
     * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channels") @ExcludeMissing fun _channels(): JsonField<List<String>> = channels

    /**
     * Returns the raw JSON value of [if_].
     *
     * Unlike [if_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("if") @ExcludeMissing fun _if_(): JsonField<String> = if_

    /**
     * Returns the raw JSON value of [loop].
     *
     * Unlike [loop], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("loop") @ExcludeMissing fun _loop(): JsonField<String> = loop

    /**
     * Returns the raw JSON value of [ref].
     *
     * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<String> = ref

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

    /**
     * Returns the raw JSON value of [align].
     *
     * Unlike [align], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("align") @ExcludeMissing fun _align(): JsonField<Alignment> = align

    /**
     * Returns the raw JSON value of [borderColor].
     *
     * Unlike [borderColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("border_color")
    @ExcludeMissing
    fun _borderColor(): JsonField<String> = borderColor

    /**
     * Returns the raw JSON value of [fontSize].
     *
     * Unlike [fontSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("font_size") @ExcludeMissing fun _fontSize(): JsonField<String> = fontSize

    /**
     * Returns the raw JSON value of [lineHeight].
     *
     * Unlike [lineHeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line_height") @ExcludeMissing fun _lineHeight(): JsonField<String> = lineHeight

    /**
     * Returns the raw JSON value of [locales].
     *
     * Unlike [locales], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locales") @ExcludeMissing fun _locales(): JsonField<Locales> = locales

    /**
     * Returns the raw JSON value of [textStyle].
     *
     * Unlike [textStyle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text_style") @ExcludeMissing fun _textStyle(): JsonField<TextStyle> = textStyle

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [ElementalQuoteNodeWithType].
         *
         * The following fields are required:
         * ```java
         * .content()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ElementalQuoteNodeWithType]. */
    class Builder internal constructor() {

        private var channels: JsonField<MutableList<String>>? = null
        private var if_: JsonField<String> = JsonMissing.of()
        private var loop: JsonField<String> = JsonMissing.of()
        private var ref: JsonField<String> = JsonMissing.of()
        private var content: JsonField<String>? = null
        private var align: JsonField<Alignment> = JsonMissing.of()
        private var borderColor: JsonField<String> = JsonMissing.of()
        private var fontSize: JsonField<String> = JsonMissing.of()
        private var lineHeight: JsonField<String> = JsonMissing.of()
        private var locales: JsonField<Locales> = JsonMissing.of()
        private var textStyle: JsonField<TextStyle> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(elementalQuoteNodeWithType: ElementalQuoteNodeWithType) = apply {
            channels = elementalQuoteNodeWithType.channels.map { it.toMutableList() }
            if_ = elementalQuoteNodeWithType.if_
            loop = elementalQuoteNodeWithType.loop
            ref = elementalQuoteNodeWithType.ref
            content = elementalQuoteNodeWithType.content
            align = elementalQuoteNodeWithType.align
            borderColor = elementalQuoteNodeWithType.borderColor
            fontSize = elementalQuoteNodeWithType.fontSize
            lineHeight = elementalQuoteNodeWithType.lineHeight
            locales = elementalQuoteNodeWithType.locales
            textStyle = elementalQuoteNodeWithType.textStyle
            type = elementalQuoteNodeWithType.type
            additionalProperties = elementalQuoteNodeWithType.additionalProperties.toMutableMap()
        }

        fun channels(channels: List<String>?) = channels(JsonField.ofNullable(channels))

        /** Alias for calling [Builder.channels] with `channels.orElse(null)`. */
        fun channels(channels: Optional<List<String>>) = channels(channels.getOrNull())

        /**
         * Sets [Builder.channels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channels] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun channels(channels: JsonField<List<String>>) = apply {
            this.channels = channels.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [channels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChannel(channel: String) = apply {
            channels =
                (channels ?: JsonField.of(mutableListOf())).also {
                    checkKnown("channels", it).add(channel)
                }
        }

        fun if_(if_: String?) = if_(JsonField.ofNullable(if_))

        /** Alias for calling [Builder.if_] with `if_.orElse(null)`. */
        fun if_(if_: Optional<String>) = if_(if_.getOrNull())

        /**
         * Sets [Builder.if_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.if_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

        fun loop(loop: String?) = loop(JsonField.ofNullable(loop))

        /** Alias for calling [Builder.loop] with `loop.orElse(null)`. */
        fun loop(loop: Optional<String>) = loop(loop.getOrNull())

        /**
         * Sets [Builder.loop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loop] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun loop(loop: JsonField<String>) = apply { this.loop = loop }

        fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

        /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
        fun ref(ref: Optional<String>) = ref(ref.getOrNull())

        /**
         * Sets [Builder.ref] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ref] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ref(ref: JsonField<String>) = apply { this.ref = ref }

        /** The text value of the quote. */
        fun content(content: String) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<String>) = apply { this.content = content }

        /** Alignment of the quote. */
        fun align(align: Alignment?) = align(JsonField.ofNullable(align))

        /** Alias for calling [Builder.align] with `align.orElse(null)`. */
        fun align(align: Optional<Alignment>) = align(align.getOrNull())

        /**
         * Sets [Builder.align] to an arbitrary JSON value.
         *
         * You should usually call [Builder.align] with a well-typed [Alignment] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun align(align: JsonField<Alignment>) = apply { this.align = align }

        /** CSS border color property. For example, `#fff` */
        fun borderColor(borderColor: String?) = borderColor(JsonField.ofNullable(borderColor))

        /** Alias for calling [Builder.borderColor] with `borderColor.orElse(null)`. */
        fun borderColor(borderColor: Optional<String>) = borderColor(borderColor.getOrNull())

        /**
         * Sets [Builder.borderColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.borderColor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun borderColor(borderColor: JsonField<String>) = apply { this.borderColor = borderColor }

        /**
         * CSS px font size for this quote block, e.g. `16px`. Overrides the size of the
         * `text_style` preset. Email only.
         */
        fun fontSize(fontSize: String?) = fontSize(JsonField.ofNullable(fontSize))

        /** Alias for calling [Builder.fontSize] with `fontSize.orElse(null)`. */
        fun fontSize(fontSize: Optional<String>) = fontSize(fontSize.getOrNull())

        /**
         * Sets [Builder.fontSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fontSize] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fontSize(fontSize: JsonField<String>) = apply { this.fontSize = fontSize }

        /**
         * CSS line height for this quote block, as a px value or a unitless multiplier, e.g. `24px`
         * or `1.5`. Email only.
         */
        fun lineHeight(lineHeight: String?) = lineHeight(JsonField.ofNullable(lineHeight))

        /** Alias for calling [Builder.lineHeight] with `lineHeight.orElse(null)`. */
        fun lineHeight(lineHeight: Optional<String>) = lineHeight(lineHeight.getOrNull())

        /**
         * Sets [Builder.lineHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineHeight] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lineHeight(lineHeight: JsonField<String>) = apply { this.lineHeight = lineHeight }

        /**
         * Region specific content. See
         * [locales docs](https://www.courier.com/docs/platform/content/elemental/locales/) for more
         * details.
         */
        fun locales(locales: Locales?) = locales(JsonField.ofNullable(locales))

        /** Alias for calling [Builder.locales] with `locales.orElse(null)`. */
        fun locales(locales: Optional<Locales>) = locales(locales.getOrNull())

        /**
         * Sets [Builder.locales] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locales] with a well-typed [Locales] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locales(locales: JsonField<Locales>) = apply { this.locales = locales }

        fun textStyle(textStyle: TextStyle) = textStyle(JsonField.of(textStyle))

        /**
         * Sets [Builder.textStyle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textStyle] with a well-typed [TextStyle] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun textStyle(textStyle: JsonField<TextStyle>) = apply { this.textStyle = textStyle }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [ElementalQuoteNodeWithType].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .content()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ElementalQuoteNodeWithType =
            ElementalQuoteNodeWithType(
                (channels ?: JsonMissing.of()).map { it.toImmutable() },
                if_,
                loop,
                ref,
                checkRequired("content", content),
                align,
                borderColor,
                fontSize,
                lineHeight,
                locales,
                textStyle,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws CourierInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ElementalQuoteNodeWithType = apply {
        if (validated) {
            return@apply
        }

        channels()
        if_()
        loop()
        ref()
        content()
        align().ifPresent { it.validate() }
        borderColor()
        fontSize()
        lineHeight()
        locales().ifPresent { it.validate() }
        textStyle().ifPresent { it.validate() }
        type().ifPresent { it.validate() }
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
        (channels.asKnown().getOrNull()?.size ?: 0) +
            (if (if_.asKnown().isPresent) 1 else 0) +
            (if (loop.asKnown().isPresent) 1 else 0) +
            (if (ref.asKnown().isPresent) 1 else 0) +
            (if (content.asKnown().isPresent) 1 else 0) +
            (align.asKnown().getOrNull()?.validity() ?: 0) +
            (if (borderColor.asKnown().isPresent) 1 else 0) +
            (if (fontSize.asKnown().isPresent) 1 else 0) +
            (if (lineHeight.asKnown().isPresent) 1 else 0) +
            (locales.asKnown().getOrNull()?.validity() ?: 0) +
            (textStyle.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val QUOTE = of("quote")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            QUOTE
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            QUOTE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                QUOTE -> Value.QUOTE
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
                QUOTE -> Known.QUOTE
                else -> throw CourierInvalidDataException("Unknown Type: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CourierInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ElementalQuoteNodeWithType &&
            channels == other.channels &&
            if_ == other.if_ &&
            loop == other.loop &&
            ref == other.ref &&
            content == other.content &&
            align == other.align &&
            borderColor == other.borderColor &&
            fontSize == other.fontSize &&
            lineHeight == other.lineHeight &&
            locales == other.locales &&
            textStyle == other.textStyle &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            channels,
            if_,
            loop,
            ref,
            content,
            align,
            borderColor,
            fontSize,
            lineHeight,
            locales,
            textStyle,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ElementalQuoteNodeWithType{channels=$channels, if_=$if_, loop=$loop, ref=$ref, content=$content, align=$align, borderColor=$borderColor, fontSize=$fontSize, lineHeight=$lineHeight, locales=$locales, textStyle=$textStyle, type=$type, additionalProperties=$additionalProperties}"
}

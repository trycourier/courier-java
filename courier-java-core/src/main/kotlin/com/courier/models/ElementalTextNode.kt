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

/** Represents a body of text to be rendered inside of the notification. */
class ElementalTextNode
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val channels: JsonField<List<String>>,
    private val if_: JsonField<String>,
    private val loop: JsonField<String>,
    private val ref: JsonField<String>,
    private val content: JsonField<String>,
    private val align: JsonField<Align>,
    private val bold: JsonField<String>,
    private val color: JsonField<String>,
    private val fontSize: JsonField<String>,
    private val format: JsonField<Format>,
    private val italic: JsonField<String>,
    private val lineHeight: JsonField<String>,
    private val locales: JsonField<Locales>,
    private val strikethrough: JsonField<String>,
    private val textStyle: JsonField<TextStyle>,
    private val underline: JsonField<String>,
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
        @JsonProperty("align") @ExcludeMissing align: JsonField<Align> = JsonMissing.of(),
        @JsonProperty("bold") @ExcludeMissing bold: JsonField<String> = JsonMissing.of(),
        @JsonProperty("color") @ExcludeMissing color: JsonField<String> = JsonMissing.of(),
        @JsonProperty("font_size") @ExcludeMissing fontSize: JsonField<String> = JsonMissing.of(),
        @JsonProperty("format") @ExcludeMissing format: JsonField<Format> = JsonMissing.of(),
        @JsonProperty("italic") @ExcludeMissing italic: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line_height")
        @ExcludeMissing
        lineHeight: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locales") @ExcludeMissing locales: JsonField<Locales> = JsonMissing.of(),
        @JsonProperty("strikethrough")
        @ExcludeMissing
        strikethrough: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text_style")
        @ExcludeMissing
        textStyle: JsonField<TextStyle> = JsonMissing.of(),
        @JsonProperty("underline") @ExcludeMissing underline: JsonField<String> = JsonMissing.of(),
    ) : this(
        channels,
        if_,
        loop,
        ref,
        content,
        align,
        bold,
        color,
        fontSize,
        format,
        italic,
        lineHeight,
        locales,
        strikethrough,
        textStyle,
        underline,
        mutableMapOf(),
    )

    fun toElementalBaseNode(): ElementalBaseNode =
        ElementalBaseNode.builder().channels(channels).if_(if_).loop(loop).ref(ref).build()

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
     * The text content displayed in the notification. Either this field must be specified, or the
     * elements field
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun content(): String = content.getRequired("content")

    /**
     * Text alignment.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun align(): Optional<Align> = align.getOptional("align")

    /**
     * Apply bold to the text
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bold(): Optional<String> = bold.getOptional("bold")

    /**
     * Specifies the color of text. Can be any valid css color value
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun color(): Optional<String> = color.getOptional("color")

    /**
     * CSS px font size for this text block, e.g. `16px`. Overrides the size of the `text_style`
     * preset. Email only.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fontSize(): Optional<String> = fontSize.getOptional("font_size")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun format(): Optional<Format> = format.getOptional("format")

    /**
     * Apply italics to the text
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun italic(): Optional<String> = italic.getOptional("italic")

    /**
     * CSS line height for this text block, as a px value or a unitless multiplier, e.g. `24px` or
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
     * Apply a strike through the text
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun strikethrough(): Optional<String> = strikethrough.getOptional("strikethrough")

    /**
     * Allows the text to be rendered as a heading level.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun textStyle(): Optional<TextStyle> = textStyle.getOptional("text_style")

    /**
     * Apply an underline to the text
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun underline(): Optional<String> = underline.getOptional("underline")

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
    @JsonProperty("align") @ExcludeMissing fun _align(): JsonField<Align> = align

    /**
     * Returns the raw JSON value of [bold].
     *
     * Unlike [bold], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bold") @ExcludeMissing fun _bold(): JsonField<String> = bold

    /**
     * Returns the raw JSON value of [color].
     *
     * Unlike [color], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("color") @ExcludeMissing fun _color(): JsonField<String> = color

    /**
     * Returns the raw JSON value of [fontSize].
     *
     * Unlike [fontSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("font_size") @ExcludeMissing fun _fontSize(): JsonField<String> = fontSize

    /**
     * Returns the raw JSON value of [format].
     *
     * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<Format> = format

    /**
     * Returns the raw JSON value of [italic].
     *
     * Unlike [italic], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("italic") @ExcludeMissing fun _italic(): JsonField<String> = italic

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
     * Returns the raw JSON value of [strikethrough].
     *
     * Unlike [strikethrough], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("strikethrough")
    @ExcludeMissing
    fun _strikethrough(): JsonField<String> = strikethrough

    /**
     * Returns the raw JSON value of [textStyle].
     *
     * Unlike [textStyle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text_style") @ExcludeMissing fun _textStyle(): JsonField<TextStyle> = textStyle

    /**
     * Returns the raw JSON value of [underline].
     *
     * Unlike [underline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("underline") @ExcludeMissing fun _underline(): JsonField<String> = underline

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
         * Returns a mutable builder for constructing an instance of [ElementalTextNode].
         *
         * The following fields are required:
         * ```java
         * .content()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ElementalTextNode]. */
    class Builder internal constructor() {

        private var channels: JsonField<MutableList<String>>? = null
        private var if_: JsonField<String> = JsonMissing.of()
        private var loop: JsonField<String> = JsonMissing.of()
        private var ref: JsonField<String> = JsonMissing.of()
        private var content: JsonField<String>? = null
        private var align: JsonField<Align> = JsonMissing.of()
        private var bold: JsonField<String> = JsonMissing.of()
        private var color: JsonField<String> = JsonMissing.of()
        private var fontSize: JsonField<String> = JsonMissing.of()
        private var format: JsonField<Format> = JsonMissing.of()
        private var italic: JsonField<String> = JsonMissing.of()
        private var lineHeight: JsonField<String> = JsonMissing.of()
        private var locales: JsonField<Locales> = JsonMissing.of()
        private var strikethrough: JsonField<String> = JsonMissing.of()
        private var textStyle: JsonField<TextStyle> = JsonMissing.of()
        private var underline: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(elementalTextNode: ElementalTextNode) = apply {
            channels = elementalTextNode.channels.map { it.toMutableList() }
            if_ = elementalTextNode.if_
            loop = elementalTextNode.loop
            ref = elementalTextNode.ref
            content = elementalTextNode.content
            align = elementalTextNode.align
            bold = elementalTextNode.bold
            color = elementalTextNode.color
            fontSize = elementalTextNode.fontSize
            format = elementalTextNode.format
            italic = elementalTextNode.italic
            lineHeight = elementalTextNode.lineHeight
            locales = elementalTextNode.locales
            strikethrough = elementalTextNode.strikethrough
            textStyle = elementalTextNode.textStyle
            underline = elementalTextNode.underline
            additionalProperties = elementalTextNode.additionalProperties.toMutableMap()
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

        /**
         * The text content displayed in the notification. Either this field must be specified, or
         * the elements field
         */
        fun content(content: String) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<String>) = apply { this.content = content }

        /** Text alignment. */
        fun align(align: Align) = align(JsonField.of(align))

        /**
         * Sets [Builder.align] to an arbitrary JSON value.
         *
         * You should usually call [Builder.align] with a well-typed [Align] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun align(align: JsonField<Align>) = apply { this.align = align }

        /** Apply bold to the text */
        fun bold(bold: String?) = bold(JsonField.ofNullable(bold))

        /** Alias for calling [Builder.bold] with `bold.orElse(null)`. */
        fun bold(bold: Optional<String>) = bold(bold.getOrNull())

        /**
         * Sets [Builder.bold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bold] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bold(bold: JsonField<String>) = apply { this.bold = bold }

        /** Specifies the color of text. Can be any valid css color value */
        fun color(color: String?) = color(JsonField.ofNullable(color))

        /** Alias for calling [Builder.color] with `color.orElse(null)`. */
        fun color(color: Optional<String>) = color(color.getOrNull())

        /**
         * Sets [Builder.color] to an arbitrary JSON value.
         *
         * You should usually call [Builder.color] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun color(color: JsonField<String>) = apply { this.color = color }

        /**
         * CSS px font size for this text block, e.g. `16px`. Overrides the size of the `text_style`
         * preset. Email only.
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

        fun format(format: Format?) = format(JsonField.ofNullable(format))

        /** Alias for calling [Builder.format] with `format.orElse(null)`. */
        fun format(format: Optional<Format>) = format(format.getOrNull())

        /**
         * Sets [Builder.format] to an arbitrary JSON value.
         *
         * You should usually call [Builder.format] with a well-typed [Format] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun format(format: JsonField<Format>) = apply { this.format = format }

        /** Apply italics to the text */
        fun italic(italic: String?) = italic(JsonField.ofNullable(italic))

        /** Alias for calling [Builder.italic] with `italic.orElse(null)`. */
        fun italic(italic: Optional<String>) = italic(italic.getOrNull())

        /**
         * Sets [Builder.italic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.italic] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun italic(italic: JsonField<String>) = apply { this.italic = italic }

        /**
         * CSS line height for this text block, as a px value or a unitless multiplier, e.g. `24px`
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

        /** Apply a strike through the text */
        fun strikethrough(strikethrough: String?) =
            strikethrough(JsonField.ofNullable(strikethrough))

        /** Alias for calling [Builder.strikethrough] with `strikethrough.orElse(null)`. */
        fun strikethrough(strikethrough: Optional<String>) =
            strikethrough(strikethrough.getOrNull())

        /**
         * Sets [Builder.strikethrough] to an arbitrary JSON value.
         *
         * You should usually call [Builder.strikethrough] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun strikethrough(strikethrough: JsonField<String>) = apply {
            this.strikethrough = strikethrough
        }

        /** Allows the text to be rendered as a heading level. */
        fun textStyle(textStyle: TextStyle?) = textStyle(JsonField.ofNullable(textStyle))

        /** Alias for calling [Builder.textStyle] with `textStyle.orElse(null)`. */
        fun textStyle(textStyle: Optional<TextStyle>) = textStyle(textStyle.getOrNull())

        /**
         * Sets [Builder.textStyle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.textStyle] with a well-typed [TextStyle] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun textStyle(textStyle: JsonField<TextStyle>) = apply { this.textStyle = textStyle }

        /** Apply an underline to the text */
        fun underline(underline: String?) = underline(JsonField.ofNullable(underline))

        /** Alias for calling [Builder.underline] with `underline.orElse(null)`. */
        fun underline(underline: Optional<String>) = underline(underline.getOrNull())

        /**
         * Sets [Builder.underline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.underline] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun underline(underline: JsonField<String>) = apply { this.underline = underline }

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
         * Returns an immutable instance of [ElementalTextNode].
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
        fun build(): ElementalTextNode =
            ElementalTextNode(
                (channels ?: JsonMissing.of()).map { it.toImmutable() },
                if_,
                loop,
                ref,
                checkRequired("content", content),
                align,
                bold,
                color,
                fontSize,
                format,
                italic,
                lineHeight,
                locales,
                strikethrough,
                textStyle,
                underline,
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
    fun validate(): ElementalTextNode = apply {
        if (validated) {
            return@apply
        }

        channels()
        if_()
        loop()
        ref()
        content()
        align().ifPresent { it.validate() }
        bold()
        color()
        fontSize()
        format().ifPresent { it.validate() }
        italic()
        lineHeight()
        locales().ifPresent { it.validate() }
        strikethrough()
        textStyle().ifPresent { it.validate() }
        underline()
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
            (if (bold.asKnown().isPresent) 1 else 0) +
            (if (color.asKnown().isPresent) 1 else 0) +
            (if (fontSize.asKnown().isPresent) 1 else 0) +
            (format.asKnown().getOrNull()?.validity() ?: 0) +
            (if (italic.asKnown().isPresent) 1 else 0) +
            (if (lineHeight.asKnown().isPresent) 1 else 0) +
            (locales.asKnown().getOrNull()?.validity() ?: 0) +
            (if (strikethrough.asKnown().isPresent) 1 else 0) +
            (textStyle.asKnown().getOrNull()?.validity() ?: 0) +
            (if (underline.asKnown().isPresent) 1 else 0)

    /** Text alignment. */
    class Align @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LEFT = of("left")

            @JvmField val CENTER = of("center")

            @JvmField val RIGHT = of("right")

            @JvmStatic fun of(value: String) = Align(JsonField.of(value))
        }

        /** An enum containing [Align]'s known values. */
        enum class Known {
            LEFT,
            CENTER,
            RIGHT,
        }

        /**
         * An enum containing [Align]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Align] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LEFT,
            CENTER,
            RIGHT,
            /** An enum member indicating that [Align] was instantiated with an unknown value. */
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
                LEFT -> Value.LEFT
                CENTER -> Value.CENTER
                RIGHT -> Value.RIGHT
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
                LEFT -> Known.LEFT
                CENTER -> Known.CENTER
                RIGHT -> Known.RIGHT
                else -> throw CourierInvalidDataException("Unknown Align: $value")
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
        fun validate(): Align = apply {
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

            return other is Align && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Format @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MARKDOWN = of("markdown")

            @JvmStatic fun of(value: String) = Format(JsonField.of(value))
        }

        /** An enum containing [Format]'s known values. */
        enum class Known {
            MARKDOWN
        }

        /**
         * An enum containing [Format]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Format] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MARKDOWN,
            /** An enum member indicating that [Format] was instantiated with an unknown value. */
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
                MARKDOWN -> Value.MARKDOWN
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
                MARKDOWN -> Known.MARKDOWN
                else -> throw CourierInvalidDataException("Unknown Format: $value")
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
        fun validate(): Format = apply {
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

            return other is Format && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ElementalTextNode &&
            channels == other.channels &&
            if_ == other.if_ &&
            loop == other.loop &&
            ref == other.ref &&
            content == other.content &&
            align == other.align &&
            bold == other.bold &&
            color == other.color &&
            fontSize == other.fontSize &&
            format == other.format &&
            italic == other.italic &&
            lineHeight == other.lineHeight &&
            locales == other.locales &&
            strikethrough == other.strikethrough &&
            textStyle == other.textStyle &&
            underline == other.underline &&
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
            bold,
            color,
            fontSize,
            format,
            italic,
            lineHeight,
            locales,
            strikethrough,
            textStyle,
            underline,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ElementalTextNode{channels=$channels, if_=$if_, loop=$loop, ref=$ref, content=$content, align=$align, bold=$bold, color=$color, fontSize=$fontSize, format=$format, italic=$italic, lineHeight=$lineHeight, locales=$locales, strikethrough=$strikethrough, textStyle=$textStyle, underline=$underline, additionalProperties=$additionalProperties}"
}

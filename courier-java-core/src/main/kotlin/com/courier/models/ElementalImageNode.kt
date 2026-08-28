// File generated from our OpenAPI spec by Stainless.

package com.courier.models

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

/** Used to embed an image into the notification. */
class ElementalImageNode
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val channels: JsonField<List<String>>,
    private val if_: JsonField<String>,
    private val loop: JsonField<String>,
    private val ref: JsonField<String>,
    private val src: JsonField<String>,
    private val align: JsonField<Alignment>,
    private val altText: JsonField<String>,
    private val borderColor: JsonField<String>,
    private val borderSize: JsonField<String>,
    private val href: JsonField<String>,
    private val padding: JsonField<String>,
    private val width: JsonField<String>,
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
        @JsonProperty("src") @ExcludeMissing src: JsonField<String> = JsonMissing.of(),
        @JsonProperty("align") @ExcludeMissing align: JsonField<Alignment> = JsonMissing.of(),
        @JsonProperty("altText") @ExcludeMissing altText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("border_color")
        @ExcludeMissing
        borderColor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("border_size")
        @ExcludeMissing
        borderSize: JsonField<String> = JsonMissing.of(),
        @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
        @JsonProperty("padding") @ExcludeMissing padding: JsonField<String> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<String> = JsonMissing.of(),
    ) : this(
        channels,
        if_,
        loop,
        ref,
        src,
        align,
        altText,
        borderColor,
        borderSize,
        href,
        padding,
        width,
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
     * The source of the image.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun src(): String = src.getRequired("src")

    /**
     * The alignment of the image.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun align(): Optional<Alignment> = align.getOptional("align")

    /**
     * Alternate text for the image.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun altText(): Optional<String> = altText.getOptional("altText")

    /**
     * CSS border color applied to the image. For example, `#ccc`
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun borderColor(): Optional<String> = borderColor.getOptional("border_color")

    /**
     * CSS border width applied to the image. For example, `1px`
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun borderSize(): Optional<String> = borderSize.getOptional("border_size")

    /**
     * A URL to link to when the image is clicked.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun href(): Optional<String> = href.getOptional("href")

    /**
     * CSS padding applied around the image. For example, `10px`
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun padding(): Optional<String> = padding.getOptional("padding")

    /**
     * CSS width properties to apply to the image. For example, 50px
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun width(): Optional<String> = width.getOptional("width")

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
     * Returns the raw JSON value of [src].
     *
     * Unlike [src], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("src") @ExcludeMissing fun _src(): JsonField<String> = src

    /**
     * Returns the raw JSON value of [align].
     *
     * Unlike [align], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("align") @ExcludeMissing fun _align(): JsonField<Alignment> = align

    /**
     * Returns the raw JSON value of [altText].
     *
     * Unlike [altText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altText") @ExcludeMissing fun _altText(): JsonField<String> = altText

    /**
     * Returns the raw JSON value of [borderColor].
     *
     * Unlike [borderColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("border_color")
    @ExcludeMissing
    fun _borderColor(): JsonField<String> = borderColor

    /**
     * Returns the raw JSON value of [borderSize].
     *
     * Unlike [borderSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("border_size") @ExcludeMissing fun _borderSize(): JsonField<String> = borderSize

    /**
     * Returns the raw JSON value of [href].
     *
     * Unlike [href], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("href") @ExcludeMissing fun _href(): JsonField<String> = href

    /**
     * Returns the raw JSON value of [padding].
     *
     * Unlike [padding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("padding") @ExcludeMissing fun _padding(): JsonField<String> = padding

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
         * Returns a mutable builder for constructing an instance of [ElementalImageNode].
         *
         * The following fields are required:
         * ```java
         * .src()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ElementalImageNode]. */
    class Builder internal constructor() {

        private var channels: JsonField<MutableList<String>>? = null
        private var if_: JsonField<String> = JsonMissing.of()
        private var loop: JsonField<String> = JsonMissing.of()
        private var ref: JsonField<String> = JsonMissing.of()
        private var src: JsonField<String>? = null
        private var align: JsonField<Alignment> = JsonMissing.of()
        private var altText: JsonField<String> = JsonMissing.of()
        private var borderColor: JsonField<String> = JsonMissing.of()
        private var borderSize: JsonField<String> = JsonMissing.of()
        private var href: JsonField<String> = JsonMissing.of()
        private var padding: JsonField<String> = JsonMissing.of()
        private var width: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(elementalImageNode: ElementalImageNode) = apply {
            channels = elementalImageNode.channels.map { it.toMutableList() }
            if_ = elementalImageNode.if_
            loop = elementalImageNode.loop
            ref = elementalImageNode.ref
            src = elementalImageNode.src
            align = elementalImageNode.align
            altText = elementalImageNode.altText
            borderColor = elementalImageNode.borderColor
            borderSize = elementalImageNode.borderSize
            href = elementalImageNode.href
            padding = elementalImageNode.padding
            width = elementalImageNode.width
            additionalProperties = elementalImageNode.additionalProperties.toMutableMap()
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

        /** The source of the image. */
        fun src(src: String) = src(JsonField.of(src))

        /**
         * Sets [Builder.src] to an arbitrary JSON value.
         *
         * You should usually call [Builder.src] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun src(src: JsonField<String>) = apply { this.src = src }

        /** The alignment of the image. */
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

        /** Alternate text for the image. */
        fun altText(altText: String?) = altText(JsonField.ofNullable(altText))

        /** Alias for calling [Builder.altText] with `altText.orElse(null)`. */
        fun altText(altText: Optional<String>) = altText(altText.getOrNull())

        /**
         * Sets [Builder.altText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altText] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun altText(altText: JsonField<String>) = apply { this.altText = altText }

        /** CSS border color applied to the image. For example, `#ccc` */
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

        /** CSS border width applied to the image. For example, `1px` */
        fun borderSize(borderSize: String?) = borderSize(JsonField.ofNullable(borderSize))

        /** Alias for calling [Builder.borderSize] with `borderSize.orElse(null)`. */
        fun borderSize(borderSize: Optional<String>) = borderSize(borderSize.getOrNull())

        /**
         * Sets [Builder.borderSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.borderSize] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun borderSize(borderSize: JsonField<String>) = apply { this.borderSize = borderSize }

        /** A URL to link to when the image is clicked. */
        fun href(href: String?) = href(JsonField.ofNullable(href))

        /** Alias for calling [Builder.href] with `href.orElse(null)`. */
        fun href(href: Optional<String>) = href(href.getOrNull())

        /**
         * Sets [Builder.href] to an arbitrary JSON value.
         *
         * You should usually call [Builder.href] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun href(href: JsonField<String>) = apply { this.href = href }

        /** CSS padding applied around the image. For example, `10px` */
        fun padding(padding: String?) = padding(JsonField.ofNullable(padding))

        /** Alias for calling [Builder.padding] with `padding.orElse(null)`. */
        fun padding(padding: Optional<String>) = padding(padding.getOrNull())

        /**
         * Sets [Builder.padding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.padding] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun padding(padding: JsonField<String>) = apply { this.padding = padding }

        /** CSS width properties to apply to the image. For example, 50px */
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
         * Returns an immutable instance of [ElementalImageNode].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .src()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ElementalImageNode =
            ElementalImageNode(
                (channels ?: JsonMissing.of()).map { it.toImmutable() },
                if_,
                loop,
                ref,
                checkRequired("src", src),
                align,
                altText,
                borderColor,
                borderSize,
                href,
                padding,
                width,
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
    fun validate(): ElementalImageNode = apply {
        if (validated) {
            return@apply
        }

        channels()
        if_()
        loop()
        ref()
        src()
        align().ifPresent { it.validate() }
        altText()
        borderColor()
        borderSize()
        href()
        padding()
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
        (channels.asKnown().getOrNull()?.size ?: 0) +
            (if (if_.asKnown().isPresent) 1 else 0) +
            (if (loop.asKnown().isPresent) 1 else 0) +
            (if (ref.asKnown().isPresent) 1 else 0) +
            (if (src.asKnown().isPresent) 1 else 0) +
            (align.asKnown().getOrNull()?.validity() ?: 0) +
            (if (altText.asKnown().isPresent) 1 else 0) +
            (if (borderColor.asKnown().isPresent) 1 else 0) +
            (if (borderSize.asKnown().isPresent) 1 else 0) +
            (if (href.asKnown().isPresent) 1 else 0) +
            (if (padding.asKnown().isPresent) 1 else 0) +
            (if (width.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ElementalImageNode &&
            channels == other.channels &&
            if_ == other.if_ &&
            loop == other.loop &&
            ref == other.ref &&
            src == other.src &&
            align == other.align &&
            altText == other.altText &&
            borderColor == other.borderColor &&
            borderSize == other.borderSize &&
            href == other.href &&
            padding == other.padding &&
            width == other.width &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            channels,
            if_,
            loop,
            ref,
            src,
            align,
            altText,
            borderColor,
            borderSize,
            href,
            padding,
            width,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ElementalImageNode{channels=$channels, if_=$if_, loop=$loop, ref=$ref, src=$src, align=$align, altText=$altText, borderColor=$borderColor, borderSize=$borderSize, href=$href, padding=$padding, width=$width, additionalProperties=$additionalProperties}"
}

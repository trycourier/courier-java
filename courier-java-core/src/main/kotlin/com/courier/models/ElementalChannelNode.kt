// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
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

/**
 * The channel element allows a notification to be customized based on which channel it is sent
 * through. For example, you may want to display a detailed message when the notification is sent
 * through email, and a more concise message in a push notification. Channel elements are only valid
 * as top-level elements; you cannot nest channel elements. If there is a channel element specified
 * at the top-level of the document, all sibling elements must be channel elements. Note: As an
 * alternative, most elements support a `channel` property. Which allows you to selectively display
 * an individual element on a per channel basis. See the
 * [control flow docs](https://www.courier.com/docs/platform/content/elemental/control-flow/) for
 * more details.
 */
class ElementalChannelNode
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val channels: JsonField<List<String>>,
    private val if_: JsonField<String>,
    private val loop: JsonField<String>,
    private val ref: JsonField<String>,
    private val channel: JsonField<String>,
    private val elements: JsonField<List<ElementalNodeNonChannel>>,
    private val fontSize: JsonField<String>,
    private val lineHeight: JsonField<String>,
    private val padding: JsonField<String>,
    private val raw: JsonField<Raw>,
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
        @JsonProperty("channel") @ExcludeMissing channel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("elements")
        @ExcludeMissing
        elements: JsonField<List<ElementalNodeNonChannel>> = JsonMissing.of(),
        @JsonProperty("font_size") @ExcludeMissing fontSize: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line_height")
        @ExcludeMissing
        lineHeight: JsonField<String> = JsonMissing.of(),
        @JsonProperty("padding") @ExcludeMissing padding: JsonField<String> = JsonMissing.of(),
        @JsonProperty("raw") @ExcludeMissing raw: JsonField<Raw> = JsonMissing.of(),
    ) : this(
        channels,
        if_,
        loop,
        ref,
        channel,
        elements,
        fontSize,
        lineHeight,
        padding,
        raw,
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
     * The channel the contents of this element should be applied to. Can be `email`, `push`,
     * `direct_message`, `sms` or a provider such as slack
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channel(): Optional<String> = channel.getOptional("channel")

    /**
     * An array of elements to apply to the channel. If `raw` has not been specified, `elements` is
     * `required`. Channel elements cannot nest, so these are any node except another channel block.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun elements(): Optional<List<ElementalNodeNonChannel>> = elements.getOptional("elements")

    /**
     * Email only. Document-level base font size (CSS px, e.g. `16px`) for body content — text,
     * quote, list and action button labels. Heading styles (`h1`/`h2`/`h3`) and `subtext` keep
     * their preset sizes.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fontSize(): Optional<String> = fontSize.getOptional("font_size")

    /**
     * Email only. Document-level line height (CSS px or unitless multiplier, e.g. `24px` or `1.5`)
     * applied to all body content unless overridden per block.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lineHeight(): Optional<String> = lineHeight.getOptional("line_height")

    /**
     * Email only. Document-level body padding applied once around the email body, as a CSS px
     * shorthand (1–4 values), e.g. `48px 64px`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun padding(): Optional<String> = padding.getOptional("padding")

    /**
     * Raw data to apply to the channel. If `elements` has not been specified, `raw` is required.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun raw(): Optional<Raw> = raw.getOptional("raw")

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
     * Returns the raw JSON value of [channel].
     *
     * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<String> = channel

    /**
     * Returns the raw JSON value of [elements].
     *
     * Unlike [elements], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elements")
    @ExcludeMissing
    fun _elements(): JsonField<List<ElementalNodeNonChannel>> = elements

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
     * Returns the raw JSON value of [padding].
     *
     * Unlike [padding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("padding") @ExcludeMissing fun _padding(): JsonField<String> = padding

    /**
     * Returns the raw JSON value of [raw].
     *
     * Unlike [raw], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("raw") @ExcludeMissing fun _raw(): JsonField<Raw> = raw

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

        /** Returns a mutable builder for constructing an instance of [ElementalChannelNode]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ElementalChannelNode]. */
    class Builder internal constructor() {

        private var channels: JsonField<MutableList<String>>? = null
        private var if_: JsonField<String> = JsonMissing.of()
        private var loop: JsonField<String> = JsonMissing.of()
        private var ref: JsonField<String> = JsonMissing.of()
        private var channel: JsonField<String> = JsonMissing.of()
        private var elements: JsonField<MutableList<ElementalNodeNonChannel>>? = null
        private var fontSize: JsonField<String> = JsonMissing.of()
        private var lineHeight: JsonField<String> = JsonMissing.of()
        private var padding: JsonField<String> = JsonMissing.of()
        private var raw: JsonField<Raw> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(elementalChannelNode: ElementalChannelNode) = apply {
            channels = elementalChannelNode.channels.map { it.toMutableList() }
            if_ = elementalChannelNode.if_
            loop = elementalChannelNode.loop
            ref = elementalChannelNode.ref
            channel = elementalChannelNode.channel
            elements = elementalChannelNode.elements.map { it.toMutableList() }
            fontSize = elementalChannelNode.fontSize
            lineHeight = elementalChannelNode.lineHeight
            padding = elementalChannelNode.padding
            raw = elementalChannelNode.raw
            additionalProperties = elementalChannelNode.additionalProperties.toMutableMap()
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
         * The channel the contents of this element should be applied to. Can be `email`, `push`,
         * `direct_message`, `sms` or a provider such as slack
         */
        fun channel(channel: String) = channel(JsonField.of(channel))

        /**
         * Sets [Builder.channel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channel] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun channel(channel: JsonField<String>) = apply { this.channel = channel }

        /**
         * An array of elements to apply to the channel. If `raw` has not been specified, `elements`
         * is `required`. Channel elements cannot nest, so these are any node except another channel
         * block.
         */
        fun elements(elements: List<ElementalNodeNonChannel>?) =
            elements(JsonField.ofNullable(elements))

        /** Alias for calling [Builder.elements] with `elements.orElse(null)`. */
        fun elements(elements: Optional<List<ElementalNodeNonChannel>>) =
            elements(elements.getOrNull())

        /**
         * Sets [Builder.elements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elements] with a well-typed
         * `List<ElementalNodeNonChannel>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun elements(elements: JsonField<List<ElementalNodeNonChannel>>) = apply {
            this.elements = elements.map { it.toMutableList() }
        }

        /**
         * Adds a single [ElementalNodeNonChannel] to [elements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addElement(element: ElementalNodeNonChannel) = apply {
            elements =
                (elements ?: JsonField.of(mutableListOf())).also {
                    checkKnown("elements", it).add(element)
                }
        }

        /**
         * Alias for calling [addElement] with
         * `ElementalNodeNonChannel.ofUnionMember0(unionMember0)`.
         */
        fun addElement(unionMember0: ElementalNodeNonChannel.UnionMember0) =
            addElement(ElementalNodeNonChannel.ofUnionMember0(unionMember0))

        /**
         * Alias for calling [addElement] with
         * `ElementalNodeNonChannel.ofUnionMember1(unionMember1)`.
         */
        fun addElement(unionMember1: ElementalNodeNonChannel.UnionMember1) =
            addElement(ElementalNodeNonChannel.ofUnionMember1(unionMember1))

        /**
         * Alias for calling [addElement] with
         * `ElementalNodeNonChannel.ofUnionMember2(unionMember2)`.
         */
        fun addElement(unionMember2: ElementalNodeNonChannel.UnionMember2) =
            addElement(ElementalNodeNonChannel.ofUnionMember2(unionMember2))

        /**
         * Alias for calling [addElement] with
         * `ElementalNodeNonChannel.ofUnionMember3(unionMember3)`.
         */
        fun addElement(unionMember3: ElementalNodeNonChannel.UnionMember3) =
            addElement(ElementalNodeNonChannel.ofUnionMember3(unionMember3))

        /**
         * Alias for calling [addElement] with
         * `ElementalNodeNonChannel.ofUnionMember4(unionMember4)`.
         */
        fun addElement(unionMember4: ElementalNodeNonChannel.UnionMember4) =
            addElement(ElementalNodeNonChannel.ofUnionMember4(unionMember4))

        /**
         * Alias for calling [addElement] with
         * `ElementalNodeNonChannel.ofUnionMember5(unionMember5)`.
         */
        fun addElement(unionMember5: ElementalNodeNonChannel.UnionMember5) =
            addElement(ElementalNodeNonChannel.ofUnionMember5(unionMember5))

        /**
         * Alias for calling [addElement] with
         * `ElementalNodeNonChannel.ofUnionMember6(unionMember6)`.
         */
        fun addElement(unionMember6: ElementalNodeNonChannel.UnionMember6) =
            addElement(ElementalNodeNonChannel.ofUnionMember6(unionMember6))

        /**
         * Email only. Document-level base font size (CSS px, e.g. `16px`) for body content — text,
         * quote, list and action button labels. Heading styles (`h1`/`h2`/`h3`) and `subtext` keep
         * their preset sizes.
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
         * Email only. Document-level line height (CSS px or unitless multiplier, e.g. `24px` or
         * `1.5`) applied to all body content unless overridden per block.
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
         * Email only. Document-level body padding applied once around the email body, as a CSS px
         * shorthand (1–4 values), e.g. `48px 64px`.
         */
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

        /**
         * Raw data to apply to the channel. If `elements` has not been specified, `raw` is
         * required.
         */
        fun raw(raw: Raw?) = raw(JsonField.ofNullable(raw))

        /** Alias for calling [Builder.raw] with `raw.orElse(null)`. */
        fun raw(raw: Optional<Raw>) = raw(raw.getOrNull())

        /**
         * Sets [Builder.raw] to an arbitrary JSON value.
         *
         * You should usually call [Builder.raw] with a well-typed [Raw] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun raw(raw: JsonField<Raw>) = apply { this.raw = raw }

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
         * Returns an immutable instance of [ElementalChannelNode].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ElementalChannelNode =
            ElementalChannelNode(
                (channels ?: JsonMissing.of()).map { it.toImmutable() },
                if_,
                loop,
                ref,
                channel,
                (elements ?: JsonMissing.of()).map { it.toImmutable() },
                fontSize,
                lineHeight,
                padding,
                raw,
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
    fun validate(): ElementalChannelNode = apply {
        if (validated) {
            return@apply
        }

        channels()
        if_()
        loop()
        ref()
        channel()
        elements().ifPresent { it.forEach { it.validate() } }
        fontSize()
        lineHeight()
        padding()
        raw().ifPresent { it.validate() }
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
            (if (channel.asKnown().isPresent) 1 else 0) +
            (elements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (fontSize.asKnown().isPresent) 1 else 0) +
            (if (lineHeight.asKnown().isPresent) 1 else 0) +
            (if (padding.asKnown().isPresent) 1 else 0) +
            (raw.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Raw data to apply to the channel. If `elements` has not been specified, `raw` is required.
     */
    class Raw
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Raw]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Raw]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(raw: Raw) = apply {
                additionalProperties = raw.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Raw].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Raw = Raw(additionalProperties.toImmutable())
        }

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
        fun validate(): Raw = apply {
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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Raw && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Raw{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ElementalChannelNode &&
            channels == other.channels &&
            if_ == other.if_ &&
            loop == other.loop &&
            ref == other.ref &&
            channel == other.channel &&
            elements == other.elements &&
            fontSize == other.fontSize &&
            lineHeight == other.lineHeight &&
            padding == other.padding &&
            raw == other.raw &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            channels,
            if_,
            loop,
            ref,
            channel,
            elements,
            fontSize,
            lineHeight,
            padding,
            raw,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ElementalChannelNode{channels=$channels, if_=$if_, loop=$loop, ref=$ref, channel=$channel, elements=$elements, fontSize=$fontSize, lineHeight=$lineHeight, padding=$padding, raw=$raw, additionalProperties=$additionalProperties}"
}

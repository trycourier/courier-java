// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.BaseDeserializer
import com.courier.core.BaseSerializer
import com.courier.core.Enum
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.allMaxBy
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.getOrThrow
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Any Elemental node except a channel block. Channel elements are only valid as top-level elements,
 * so the `elements` nested inside one can never be another channel. Keeping this union channel-free
 * also keeps the schema acyclic; a recursive `$ref` here breaks the generated Python models.
 */
@JsonDeserialize(using = ElementalNodeNonChannel.Deserializer::class)
@JsonSerialize(using = ElementalNodeNonChannel.Serializer::class)
class ElementalNodeNonChannel
private constructor(
    private val unionMember0: UnionMember0? = null,
    private val unionMember1: UnionMember1? = null,
    private val unionMember2: UnionMember2? = null,
    private val unionMember3: UnionMember3? = null,
    private val unionMember4: UnionMember4? = null,
    private val unionMember5: UnionMember5? = null,
    private val unionMember6: UnionMember6? = null,
    private val _json: JsonValue? = null,
) {

    /** Represents a body of text to be rendered inside of the notification. */
    fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

    /**
     * The meta element contains information describing the notification that may be used by a
     * particular channel or provider. One important field is the title field which will be used as
     * the title for channels that support it.
     */
    fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

    /** Used to embed an image into the notification. */
    fun unionMember2(): Optional<UnionMember2> = Optional.ofNullable(unionMember2)

    /** Allows the user to execute an action. Can be a button or a link. */
    fun unionMember3(): Optional<UnionMember3> = Optional.ofNullable(unionMember3)

    /** Renders a dividing line between elements. */
    fun unionMember4(): Optional<UnionMember4> = Optional.ofNullable(unionMember4)

    /** Renders a quote block. */
    fun unionMember5(): Optional<UnionMember5> = Optional.ofNullable(unionMember5)

    /**
     * Raw HTML string inside an Elemental document. When rendering a message, this node is turned
     * into output only for the email channel; for other channels it produces no blocks.
     */
    fun unionMember6(): Optional<UnionMember6> = Optional.ofNullable(unionMember6)

    fun isUnionMember0(): Boolean = unionMember0 != null

    fun isUnionMember1(): Boolean = unionMember1 != null

    fun isUnionMember2(): Boolean = unionMember2 != null

    fun isUnionMember3(): Boolean = unionMember3 != null

    fun isUnionMember4(): Boolean = unionMember4 != null

    fun isUnionMember5(): Boolean = unionMember5 != null

    fun isUnionMember6(): Boolean = unionMember6 != null

    /** Represents a body of text to be rendered inside of the notification. */
    fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

    /**
     * The meta element contains information describing the notification that may be used by a
     * particular channel or provider. One important field is the title field which will be used as
     * the title for channels that support it.
     */
    fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

    /** Used to embed an image into the notification. */
    fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")

    /** Allows the user to execute an action. Can be a button or a link. */
    fun asUnionMember3(): UnionMember3 = unionMember3.getOrThrow("unionMember3")

    /** Renders a dividing line between elements. */
    fun asUnionMember4(): UnionMember4 = unionMember4.getOrThrow("unionMember4")

    /** Renders a quote block. */
    fun asUnionMember5(): UnionMember5 = unionMember5.getOrThrow("unionMember5")

    /**
     * Raw HTML string inside an Elemental document. When rendering a message, this node is turned
     * into output only for the email channel; for other channels it produces no blocks.
     */
    fun asUnionMember6(): UnionMember6 = unionMember6.getOrThrow("unionMember6")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.courier.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = elementalNodeNonChannel.accept(new ElementalNodeNonChannel.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitUnionMember0(UnionMember0 unionMember0) {
     *         return Optional.of(unionMember0.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws CourierInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
            unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
            unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
            unionMember3 != null -> visitor.visitUnionMember3(unionMember3)
            unionMember4 != null -> visitor.visitUnionMember4(unionMember4)
            unionMember5 != null -> visitor.visitUnionMember5(unionMember5)
            unionMember6 != null -> visitor.visitUnionMember6(unionMember6)
            else -> visitor.unknown(_json)
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
    fun validate(): ElementalNodeNonChannel = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitUnionMember0(unionMember0: UnionMember0) {
                    unionMember0.validate()
                }

                override fun visitUnionMember1(unionMember1: UnionMember1) {
                    unionMember1.validate()
                }

                override fun visitUnionMember2(unionMember2: UnionMember2) {
                    unionMember2.validate()
                }

                override fun visitUnionMember3(unionMember3: UnionMember3) {
                    unionMember3.validate()
                }

                override fun visitUnionMember4(unionMember4: UnionMember4) {
                    unionMember4.validate()
                }

                override fun visitUnionMember5(unionMember5: UnionMember5) {
                    unionMember5.validate()
                }

                override fun visitUnionMember6(unionMember6: UnionMember6) {
                    unionMember6.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitUnionMember0(unionMember0: UnionMember0) = unionMember0.validity()

                override fun visitUnionMember1(unionMember1: UnionMember1) = unionMember1.validity()

                override fun visitUnionMember2(unionMember2: UnionMember2) = unionMember2.validity()

                override fun visitUnionMember3(unionMember3: UnionMember3) = unionMember3.validity()

                override fun visitUnionMember4(unionMember4: UnionMember4) = unionMember4.validity()

                override fun visitUnionMember5(unionMember5: UnionMember5) = unionMember5.validity()

                override fun visitUnionMember6(unionMember6: UnionMember6) = unionMember6.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ElementalNodeNonChannel &&
            unionMember0 == other.unionMember0 &&
            unionMember1 == other.unionMember1 &&
            unionMember2 == other.unionMember2 &&
            unionMember3 == other.unionMember3 &&
            unionMember4 == other.unionMember4 &&
            unionMember5 == other.unionMember5 &&
            unionMember6 == other.unionMember6
    }

    override fun hashCode(): Int =
        Objects.hash(
            unionMember0,
            unionMember1,
            unionMember2,
            unionMember3,
            unionMember4,
            unionMember5,
            unionMember6,
        )

    override fun toString(): String =
        when {
            unionMember0 != null -> "ElementalNodeNonChannel{unionMember0=$unionMember0}"
            unionMember1 != null -> "ElementalNodeNonChannel{unionMember1=$unionMember1}"
            unionMember2 != null -> "ElementalNodeNonChannel{unionMember2=$unionMember2}"
            unionMember3 != null -> "ElementalNodeNonChannel{unionMember3=$unionMember3}"
            unionMember4 != null -> "ElementalNodeNonChannel{unionMember4=$unionMember4}"
            unionMember5 != null -> "ElementalNodeNonChannel{unionMember5=$unionMember5}"
            unionMember6 != null -> "ElementalNodeNonChannel{unionMember6=$unionMember6}"
            _json != null -> "ElementalNodeNonChannel{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ElementalNodeNonChannel")
        }

    companion object {

        /** Represents a body of text to be rendered inside of the notification. */
        @JvmStatic
        fun ofUnionMember0(unionMember0: UnionMember0) =
            ElementalNodeNonChannel(unionMember0 = unionMember0)

        /**
         * The meta element contains information describing the notification that may be used by a
         * particular channel or provider. One important field is the title field which will be used
         * as the title for channels that support it.
         */
        @JvmStatic
        fun ofUnionMember1(unionMember1: UnionMember1) =
            ElementalNodeNonChannel(unionMember1 = unionMember1)

        /** Used to embed an image into the notification. */
        @JvmStatic
        fun ofUnionMember2(unionMember2: UnionMember2) =
            ElementalNodeNonChannel(unionMember2 = unionMember2)

        /** Allows the user to execute an action. Can be a button or a link. */
        @JvmStatic
        fun ofUnionMember3(unionMember3: UnionMember3) =
            ElementalNodeNonChannel(unionMember3 = unionMember3)

        /** Renders a dividing line between elements. */
        @JvmStatic
        fun ofUnionMember4(unionMember4: UnionMember4) =
            ElementalNodeNonChannel(unionMember4 = unionMember4)

        /** Renders a quote block. */
        @JvmStatic
        fun ofUnionMember5(unionMember5: UnionMember5) =
            ElementalNodeNonChannel(unionMember5 = unionMember5)

        /**
         * Raw HTML string inside an Elemental document. When rendering a message, this node is
         * turned into output only for the email channel; for other channels it produces no blocks.
         */
        @JvmStatic
        fun ofUnionMember6(unionMember6: UnionMember6) =
            ElementalNodeNonChannel(unionMember6 = unionMember6)
    }

    /**
     * An interface that defines how to map each variant of [ElementalNodeNonChannel] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        /** Represents a body of text to be rendered inside of the notification. */
        fun visitUnionMember0(unionMember0: UnionMember0): T

        /**
         * The meta element contains information describing the notification that may be used by a
         * particular channel or provider. One important field is the title field which will be used
         * as the title for channels that support it.
         */
        fun visitUnionMember1(unionMember1: UnionMember1): T

        /** Used to embed an image into the notification. */
        fun visitUnionMember2(unionMember2: UnionMember2): T

        /** Allows the user to execute an action. Can be a button or a link. */
        fun visitUnionMember3(unionMember3: UnionMember3): T

        /** Renders a dividing line between elements. */
        fun visitUnionMember4(unionMember4: UnionMember4): T

        /** Renders a quote block. */
        fun visitUnionMember5(unionMember5: UnionMember5): T

        /**
         * Raw HTML string inside an Elemental document. When rendering a message, this node is
         * turned into output only for the email channel; for other channels it produces no blocks.
         */
        fun visitUnionMember6(unionMember6: UnionMember6): T

        /**
         * Maps an unknown variant of [ElementalNodeNonChannel] to a value of type [T].
         *
         * An instance of [ElementalNodeNonChannel] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown ElementalNodeNonChannel: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<ElementalNodeNonChannel>(ElementalNodeNonChannel::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ElementalNodeNonChannel {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                            ElementalNodeNonChannel(unionMember0 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                            ElementalNodeNonChannel(unionMember1 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember2>())?.let {
                            ElementalNodeNonChannel(unionMember2 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember3>())?.let {
                            ElementalNodeNonChannel(unionMember3 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember4>())?.let {
                            ElementalNodeNonChannel(unionMember4 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember5>())?.let {
                            ElementalNodeNonChannel(unionMember5 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember6>())?.let {
                            ElementalNodeNonChannel(unionMember6 = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ElementalNodeNonChannel(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<ElementalNodeNonChannel>(ElementalNodeNonChannel::class) {

        override fun serialize(
            value: ElementalNodeNonChannel,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                value.unionMember2 != null -> generator.writeObject(value.unionMember2)
                value.unionMember3 != null -> generator.writeObject(value.unionMember3)
                value.unionMember4 != null -> generator.writeObject(value.unionMember4)
                value.unionMember5 != null -> generator.writeObject(value.unionMember5)
                value.unionMember6 != null -> generator.writeObject(value.unionMember6)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ElementalNodeNonChannel")
            }
        }
    }

    /** Represents a body of text to be rendered inside of the notification. */
    class UnionMember0
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channels: JsonField<List<String>>,
        private val if_: JsonField<String>,
        private val loop: JsonField<String>,
        private val ref: JsonField<String>,
        private val align: JsonField<ElementalTextNode.Align>,
        private val bold: JsonField<String>,
        private val color: JsonField<String>,
        private val content: JsonField<String>,
        private val fontSize: JsonField<String>,
        private val format: JsonField<ElementalTextNode.Format>,
        private val italic: JsonField<String>,
        private val lineHeight: JsonField<String>,
        private val locales: JsonField<Locales>,
        private val strikethrough: JsonField<String>,
        private val textStyle: JsonField<TextStyle>,
        private val underline: JsonField<String>,
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
            @JsonProperty("align")
            @ExcludeMissing
            align: JsonField<ElementalTextNode.Align> = JsonMissing.of(),
            @JsonProperty("bold") @ExcludeMissing bold: JsonField<String> = JsonMissing.of(),
            @JsonProperty("color") @ExcludeMissing color: JsonField<String> = JsonMissing.of(),
            @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
            @JsonProperty("font_size")
            @ExcludeMissing
            fontSize: JsonField<String> = JsonMissing.of(),
            @JsonProperty("format")
            @ExcludeMissing
            format: JsonField<ElementalTextNode.Format> = JsonMissing.of(),
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
            @JsonProperty("underline")
            @ExcludeMissing
            underline: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(
            channels,
            if_,
            loop,
            ref,
            align,
            bold,
            color,
            content,
            fontSize,
            format,
            italic,
            lineHeight,
            locales,
            strikethrough,
            textStyle,
            underline,
            type,
            mutableMapOf(),
        )

        fun toElementalTextNode(): ElementalTextNode =
            ElementalTextNode.builder()
                .channels(channels)
                .if_(if_)
                .loop(loop)
                .ref(ref)
                .align(align)
                .bold(bold)
                .color(color)
                .content(content)
                .fontSize(fontSize)
                .format(format)
                .italic(italic)
                .lineHeight(lineHeight)
                .locales(locales)
                .strikethrough(strikethrough)
                .textStyle(textStyle)
                .underline(underline)
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
         * Text alignment.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun align(): Optional<ElementalTextNode.Align> = align.getOptional("align")

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
         * The text content displayed in the notification. Either this field must be specified, or
         * the elements field
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun content(): Optional<String> = content.getOptional("content")

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
        fun format(): Optional<ElementalTextNode.Format> = format.getOptional("format")

        /**
         * Apply italics to the text
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun italic(): Optional<String> = italic.getOptional("italic")

        /**
         * CSS line height for this text block, as a px value or a unitless multiplier, e.g. `24px`
         * or `1.5`. Email only.
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
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [channels].
         *
         * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<List<String>> = channels

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
         * Returns the raw JSON value of [align].
         *
         * Unlike [align], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("align")
        @ExcludeMissing
        fun _align(): JsonField<ElementalTextNode.Align> = align

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
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

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
        @JsonProperty("format")
        @ExcludeMissing
        fun _format(): JsonField<ElementalTextNode.Format> = format

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
        @JsonProperty("line_height")
        @ExcludeMissing
        fun _lineHeight(): JsonField<String> = lineHeight

        /**
         * Returns the raw JSON value of [locales].
         *
         * Unlike [locales], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locales") @ExcludeMissing fun _locales(): JsonField<Locales> = locales

        /**
         * Returns the raw JSON value of [strikethrough].
         *
         * Unlike [strikethrough], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("strikethrough")
        @ExcludeMissing
        fun _strikethrough(): JsonField<String> = strikethrough

        /**
         * Returns the raw JSON value of [textStyle].
         *
         * Unlike [textStyle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text_style")
        @ExcludeMissing
        fun _textStyle(): JsonField<TextStyle> = textStyle

        /**
         * Returns the raw JSON value of [underline].
         *
         * Unlike [underline], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("underline") @ExcludeMissing fun _underline(): JsonField<String> = underline

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

            /** Returns a mutable builder for constructing an instance of [UnionMember0]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember0]. */
        class Builder internal constructor() {

            private var channels: JsonField<MutableList<String>>? = null
            private var if_: JsonField<String> = JsonMissing.of()
            private var loop: JsonField<String> = JsonMissing.of()
            private var ref: JsonField<String> = JsonMissing.of()
            private var align: JsonField<ElementalTextNode.Align> = JsonMissing.of()
            private var bold: JsonField<String> = JsonMissing.of()
            private var color: JsonField<String> = JsonMissing.of()
            private var content: JsonField<String> = JsonMissing.of()
            private var fontSize: JsonField<String> = JsonMissing.of()
            private var format: JsonField<ElementalTextNode.Format> = JsonMissing.of()
            private var italic: JsonField<String> = JsonMissing.of()
            private var lineHeight: JsonField<String> = JsonMissing.of()
            private var locales: JsonField<Locales> = JsonMissing.of()
            private var strikethrough: JsonField<String> = JsonMissing.of()
            private var textStyle: JsonField<TextStyle> = JsonMissing.of()
            private var underline: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember0: UnionMember0) = apply {
                channels = unionMember0.channels.map { it.toMutableList() }
                if_ = unionMember0.if_
                loop = unionMember0.loop
                ref = unionMember0.ref
                align = unionMember0.align
                bold = unionMember0.bold
                color = unionMember0.color
                content = unionMember0.content
                fontSize = unionMember0.fontSize
                format = unionMember0.format
                italic = unionMember0.italic
                lineHeight = unionMember0.lineHeight
                locales = unionMember0.locales
                strikethrough = unionMember0.strikethrough
                textStyle = unionMember0.textStyle
                underline = unionMember0.underline
                type = unionMember0.type
                additionalProperties = unionMember0.additionalProperties.toMutableMap()
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

            fun loop(loop: String?) = loop(JsonField.ofNullable(loop))

            /** Alias for calling [Builder.loop] with `loop.orElse(null)`. */
            fun loop(loop: Optional<String>) = loop(loop.getOrNull())

            /**
             * Sets [Builder.loop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loop] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun loop(loop: JsonField<String>) = apply { this.loop = loop }

            fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

            /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
            fun ref(ref: Optional<String>) = ref(ref.getOrNull())

            /**
             * Sets [Builder.ref] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ref] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ref(ref: JsonField<String>) = apply { this.ref = ref }

            /** Text alignment. */
            fun align(align: ElementalTextNode.Align) = align(JsonField.of(align))

            /**
             * Sets [Builder.align] to an arbitrary JSON value.
             *
             * You should usually call [Builder.align] with a well-typed [ElementalTextNode.Align]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun align(align: JsonField<ElementalTextNode.Align>) = apply { this.align = align }

            /** Apply bold to the text */
            fun bold(bold: String?) = bold(JsonField.ofNullable(bold))

            /** Alias for calling [Builder.bold] with `bold.orElse(null)`. */
            fun bold(bold: Optional<String>) = bold(bold.getOrNull())

            /**
             * Sets [Builder.bold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bold] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun bold(bold: JsonField<String>) = apply { this.bold = bold }

            /** Specifies the color of text. Can be any valid css color value */
            fun color(color: String?) = color(JsonField.ofNullable(color))

            /** Alias for calling [Builder.color] with `color.orElse(null)`. */
            fun color(color: Optional<String>) = color(color.getOrNull())

            /**
             * Sets [Builder.color] to an arbitrary JSON value.
             *
             * You should usually call [Builder.color] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun color(color: JsonField<String>) = apply { this.color = color }

            /**
             * The text content displayed in the notification. Either this field must be specified,
             * or the elements field
             */
            fun content(content: String) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<String>) = apply { this.content = content }

            /**
             * CSS px font size for this text block, e.g. `16px`. Overrides the size of the
             * `text_style` preset. Email only.
             */
            fun fontSize(fontSize: String?) = fontSize(JsonField.ofNullable(fontSize))

            /** Alias for calling [Builder.fontSize] with `fontSize.orElse(null)`. */
            fun fontSize(fontSize: Optional<String>) = fontSize(fontSize.getOrNull())

            /**
             * Sets [Builder.fontSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fontSize] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fontSize(fontSize: JsonField<String>) = apply { this.fontSize = fontSize }

            fun format(format: ElementalTextNode.Format?) = format(JsonField.ofNullable(format))

            /** Alias for calling [Builder.format] with `format.orElse(null)`. */
            fun format(format: Optional<ElementalTextNode.Format>) = format(format.getOrNull())

            /**
             * Sets [Builder.format] to an arbitrary JSON value.
             *
             * You should usually call [Builder.format] with a well-typed [ElementalTextNode.Format]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun format(format: JsonField<ElementalTextNode.Format>) = apply { this.format = format }

            /** Apply italics to the text */
            fun italic(italic: String?) = italic(JsonField.ofNullable(italic))

            /** Alias for calling [Builder.italic] with `italic.orElse(null)`. */
            fun italic(italic: Optional<String>) = italic(italic.getOrNull())

            /**
             * Sets [Builder.italic] to an arbitrary JSON value.
             *
             * You should usually call [Builder.italic] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun italic(italic: JsonField<String>) = apply { this.italic = italic }

            /**
             * CSS line height for this text block, as a px value or a unitless multiplier, e.g.
             * `24px` or `1.5`. Email only.
             */
            fun lineHeight(lineHeight: String?) = lineHeight(JsonField.ofNullable(lineHeight))

            /** Alias for calling [Builder.lineHeight] with `lineHeight.orElse(null)`. */
            fun lineHeight(lineHeight: Optional<String>) = lineHeight(lineHeight.getOrNull())

            /**
             * Sets [Builder.lineHeight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineHeight] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lineHeight(lineHeight: JsonField<String>) = apply { this.lineHeight = lineHeight }

            /**
             * Region specific content. See
             * [locales docs](https://www.courier.com/docs/platform/content/elemental/locales/) for
             * more details.
             */
            fun locales(locales: Locales?) = locales(JsonField.ofNullable(locales))

            /** Alias for calling [Builder.locales] with `locales.orElse(null)`. */
            fun locales(locales: Optional<Locales>) = locales(locales.getOrNull())

            /**
             * Sets [Builder.locales] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locales] with a well-typed [Locales] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.strikethrough] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.textStyle] with a well-typed [TextStyle] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun underline(underline: JsonField<String>) = apply { this.underline = underline }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [UnionMember0].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnionMember0 =
                UnionMember0(
                    (channels ?: JsonMissing.of()).map { it.toImmutable() },
                    if_,
                    loop,
                    ref,
                    align,
                    bold,
                    color,
                    content,
                    fontSize,
                    format,
                    italic,
                    lineHeight,
                    locales,
                    strikethrough,
                    textStyle,
                    underline,
                    type,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): UnionMember0 = apply {
            if (validated) {
                return@apply
            }

            channels()
            if_()
            loop()
            ref()
            align().ifPresent { it.validate() }
            bold()
            color()
            content()
            fontSize()
            format().ifPresent { it.validate() }
            italic()
            lineHeight()
            locales().ifPresent { it.validate() }
            strikethrough()
            textStyle().ifPresent { it.validate() }
            underline()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (channels.asKnown().getOrNull()?.size ?: 0) +
                (if (if_.asKnown().isPresent) 1 else 0) +
                (if (loop.asKnown().isPresent) 1 else 0) +
                (if (ref.asKnown().isPresent) 1 else 0) +
                (align.asKnown().getOrNull()?.validity() ?: 0) +
                (if (bold.asKnown().isPresent) 1 else 0) +
                (if (color.asKnown().isPresent) 1 else 0) +
                (if (content.asKnown().isPresent) 1 else 0) +
                (if (fontSize.asKnown().isPresent) 1 else 0) +
                (format.asKnown().getOrNull()?.validity() ?: 0) +
                (if (italic.asKnown().isPresent) 1 else 0) +
                (if (lineHeight.asKnown().isPresent) 1 else 0) +
                (locales.asKnown().getOrNull()?.validity() ?: 0) +
                (if (strikethrough.asKnown().isPresent) 1 else 0) +
                (textStyle.asKnown().getOrNull()?.validity() ?: 0) +
                (if (underline.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val TEXT = of("text")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                TEXT
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TEXT,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    TEXT -> Value.TEXT
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
                    TEXT -> Known.TEXT
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

            return other is UnionMember0 &&
                channels == other.channels &&
                if_ == other.if_ &&
                loop == other.loop &&
                ref == other.ref &&
                align == other.align &&
                bold == other.bold &&
                color == other.color &&
                content == other.content &&
                fontSize == other.fontSize &&
                format == other.format &&
                italic == other.italic &&
                lineHeight == other.lineHeight &&
                locales == other.locales &&
                strikethrough == other.strikethrough &&
                textStyle == other.textStyle &&
                underline == other.underline &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                channels,
                if_,
                loop,
                ref,
                align,
                bold,
                color,
                content,
                fontSize,
                format,
                italic,
                lineHeight,
                locales,
                strikethrough,
                textStyle,
                underline,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember0{channels=$channels, if_=$if_, loop=$loop, ref=$ref, align=$align, bold=$bold, color=$color, content=$content, fontSize=$fontSize, format=$format, italic=$italic, lineHeight=$lineHeight, locales=$locales, strikethrough=$strikethrough, textStyle=$textStyle, underline=$underline, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * The meta element contains information describing the notification that may be used by a
     * particular channel or provider. One important field is the title field which will be used as
     * the title for channels that support it.
     */
    class UnionMember1
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channels: JsonField<List<String>>,
        private val if_: JsonField<String>,
        private val loop: JsonField<String>,
        private val ref: JsonField<String>,
        private val title: JsonField<String>,
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
            @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(channels, if_, loop, ref, title, type, mutableMapOf())

        fun toElementalMetaNode(): ElementalMetaNode =
            ElementalMetaNode.builder()
                .channels(channels)
                .if_(if_)
                .loop(loop)
                .ref(ref)
                .title(title)
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
         * The title to be displayed by supported channels. For example, the email subject.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun title(): Optional<String> = title.getOptional("title")

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
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<List<String>> = channels

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
         * Returns the raw JSON value of [title].
         *
         * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

            /** Returns a mutable builder for constructing an instance of [UnionMember1]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember1]. */
        class Builder internal constructor() {

            private var channels: JsonField<MutableList<String>>? = null
            private var if_: JsonField<String> = JsonMissing.of()
            private var loop: JsonField<String> = JsonMissing.of()
            private var ref: JsonField<String> = JsonMissing.of()
            private var title: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember1: UnionMember1) = apply {
                channels = unionMember1.channels.map { it.toMutableList() }
                if_ = unionMember1.if_
                loop = unionMember1.loop
                ref = unionMember1.ref
                title = unionMember1.title
                type = unionMember1.type
                additionalProperties = unionMember1.additionalProperties.toMutableMap()
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

            fun loop(loop: String?) = loop(JsonField.ofNullable(loop))

            /** Alias for calling [Builder.loop] with `loop.orElse(null)`. */
            fun loop(loop: Optional<String>) = loop(loop.getOrNull())

            /**
             * Sets [Builder.loop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loop] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun loop(loop: JsonField<String>) = apply { this.loop = loop }

            fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

            /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
            fun ref(ref: Optional<String>) = ref(ref.getOrNull())

            /**
             * Sets [Builder.ref] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ref] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ref(ref: JsonField<String>) = apply { this.ref = ref }

            /** The title to be displayed by supported channels. For example, the email subject. */
            fun title(title: String?) = title(JsonField.ofNullable(title))

            /** Alias for calling [Builder.title] with `title.orElse(null)`. */
            fun title(title: Optional<String>) = title(title.getOrNull())

            /**
             * Sets [Builder.title] to an arbitrary JSON value.
             *
             * You should usually call [Builder.title] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun title(title: JsonField<String>) = apply { this.title = title }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [UnionMember1].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnionMember1 =
                UnionMember1(
                    (channels ?: JsonMissing.of()).map { it.toImmutable() },
                    if_,
                    loop,
                    ref,
                    title,
                    type,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): UnionMember1 = apply {
            if (validated) {
                return@apply
            }

            channels()
            if_()
            loop()
            ref()
            title()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (channels.asKnown().getOrNull()?.size ?: 0) +
                (if (if_.asKnown().isPresent) 1 else 0) +
                (if (loop.asKnown().isPresent) 1 else 0) +
                (if (ref.asKnown().isPresent) 1 else 0) +
                (if (title.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val META = of("meta")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                META
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                META,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    META -> Value.META
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
                    META -> Known.META
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

            return other is UnionMember1 &&
                channels == other.channels &&
                if_ == other.if_ &&
                loop == other.loop &&
                ref == other.ref &&
                title == other.title &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(channels, if_, loop, ref, title, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember1{channels=$channels, if_=$if_, loop=$loop, ref=$ref, title=$title, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Used to embed an image into the notification. */
    class UnionMember2
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
            @JsonProperty("src") @ExcludeMissing src: JsonField<String> = JsonMissing.of(),
            @JsonProperty("align") @ExcludeMissing align: JsonField<Alignment> = JsonMissing.of(),
            @JsonProperty("alt_text") @ExcludeMissing altText: JsonField<String> = JsonMissing.of(),
            @JsonProperty("border_color")
            @ExcludeMissing
            borderColor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("border_size")
            @ExcludeMissing
            borderSize: JsonField<String> = JsonMissing.of(),
            @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
            @JsonProperty("padding") @ExcludeMissing padding: JsonField<String> = JsonMissing.of(),
            @JsonProperty("width") @ExcludeMissing width: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
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
            type,
            mutableMapOf(),
        )

        fun toElementalImageNode(): ElementalImageNode =
            ElementalImageNode.builder()
                .channels(channels)
                .if_(if_)
                .loop(loop)
                .ref(ref)
                .src(src)
                .align(align)
                .altText(altText)
                .borderColor(borderColor)
                .borderSize(borderSize)
                .href(href)
                .padding(padding)
                .width(width)
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
        fun altText(): Optional<String> = altText.getOptional("alt_text")

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
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [channels].
         *
         * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<List<String>> = channels

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
        @JsonProperty("alt_text") @ExcludeMissing fun _altText(): JsonField<String> = altText

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
        @JsonProperty("border_size")
        @ExcludeMissing
        fun _borderSize(): JsonField<String> = borderSize

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
             * Returns a mutable builder for constructing an instance of [UnionMember2].
             *
             * The following fields are required:
             * ```java
             * .src()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember2]. */
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
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember2: UnionMember2) = apply {
                channels = unionMember2.channels.map { it.toMutableList() }
                if_ = unionMember2.if_
                loop = unionMember2.loop
                ref = unionMember2.ref
                src = unionMember2.src
                align = unionMember2.align
                altText = unionMember2.altText
                borderColor = unionMember2.borderColor
                borderSize = unionMember2.borderSize
                href = unionMember2.href
                padding = unionMember2.padding
                width = unionMember2.width
                type = unionMember2.type
                additionalProperties = unionMember2.additionalProperties.toMutableMap()
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

            fun loop(loop: String?) = loop(JsonField.ofNullable(loop))

            /** Alias for calling [Builder.loop] with `loop.orElse(null)`. */
            fun loop(loop: Optional<String>) = loop(loop.getOrNull())

            /**
             * Sets [Builder.loop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loop] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun loop(loop: JsonField<String>) = apply { this.loop = loop }

            fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

            /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
            fun ref(ref: Optional<String>) = ref(ref.getOrNull())

            /**
             * Sets [Builder.ref] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ref] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ref(ref: JsonField<String>) = apply { this.ref = ref }

            /** The source of the image. */
            fun src(src: String) = src(JsonField.of(src))

            /**
             * Sets [Builder.src] to an arbitrary JSON value.
             *
             * You should usually call [Builder.src] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun src(src: JsonField<String>) = apply { this.src = src }

            /** The alignment of the image. */
            fun align(align: Alignment?) = align(JsonField.ofNullable(align))

            /** Alias for calling [Builder.align] with `align.orElse(null)`. */
            fun align(align: Optional<Alignment>) = align(align.getOrNull())

            /**
             * Sets [Builder.align] to an arbitrary JSON value.
             *
             * You should usually call [Builder.align] with a well-typed [Alignment] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun align(align: JsonField<Alignment>) = apply { this.align = align }

            /** Alternate text for the image. */
            fun altText(altText: String?) = altText(JsonField.ofNullable(altText))

            /** Alias for calling [Builder.altText] with `altText.orElse(null)`. */
            fun altText(altText: Optional<String>) = altText(altText.getOrNull())

            /**
             * Sets [Builder.altText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altText] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun altText(altText: JsonField<String>) = apply { this.altText = altText }

            /** CSS border color applied to the image. For example, `#ccc` */
            fun borderColor(borderColor: String?) = borderColor(JsonField.ofNullable(borderColor))

            /** Alias for calling [Builder.borderColor] with `borderColor.orElse(null)`. */
            fun borderColor(borderColor: Optional<String>) = borderColor(borderColor.getOrNull())

            /**
             * Sets [Builder.borderColor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.borderColor] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun borderColor(borderColor: JsonField<String>) = apply {
                this.borderColor = borderColor
            }

            /** CSS border width applied to the image. For example, `1px` */
            fun borderSize(borderSize: String?) = borderSize(JsonField.ofNullable(borderSize))

            /** Alias for calling [Builder.borderSize] with `borderSize.orElse(null)`. */
            fun borderSize(borderSize: Optional<String>) = borderSize(borderSize.getOrNull())

            /**
             * Sets [Builder.borderSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.borderSize] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun href(href: JsonField<String>) = apply { this.href = href }

            /** CSS padding applied around the image. For example, `10px` */
            fun padding(padding: String?) = padding(JsonField.ofNullable(padding))

            /** Alias for calling [Builder.padding] with `padding.orElse(null)`. */
            fun padding(padding: Optional<String>) = padding(padding.getOrNull())

            /**
             * Sets [Builder.padding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.padding] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun padding(padding: JsonField<String>) = apply { this.padding = padding }

            /** CSS width properties to apply to the image. For example, 50px */
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

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [UnionMember2].
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
            fun build(): UnionMember2 =
                UnionMember2(
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
                    type,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): UnionMember2 = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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
                (if (width.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val IMAGE = of("image")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                IMAGE
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                IMAGE,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    IMAGE -> Value.IMAGE
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
                    IMAGE -> Known.IMAGE
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

            return other is UnionMember2 &&
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
                type == other.type &&
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
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember2{channels=$channels, if_=$if_, loop=$loop, ref=$ref, src=$src, align=$align, altText=$altText, borderColor=$borderColor, borderSize=$borderSize, href=$href, padding=$padding, width=$width, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Allows the user to execute an action. Can be a button or a link. */
    class UnionMember3
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channels: JsonField<List<String>>,
        private val if_: JsonField<String>,
        private val loop: JsonField<String>,
        private val ref: JsonField<String>,
        private val content: JsonField<String>,
        private val href: JsonField<String>,
        private val actionId: JsonField<String>,
        private val align: JsonField<Alignment>,
        private val backgroundColor: JsonField<String>,
        private val borderRadius: JsonField<String>,
        private val borderSize: JsonField<String>,
        private val disableTracking: JsonField<Boolean>,
        private val fontSize: JsonField<String>,
        private val locales: JsonField<Locales>,
        private val padding: JsonField<String>,
        private val style: JsonField<ElementalActionNode.Style>,
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
            @JsonProperty("href") @ExcludeMissing href: JsonField<String> = JsonMissing.of(),
            @JsonProperty("action_id")
            @ExcludeMissing
            actionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("align") @ExcludeMissing align: JsonField<Alignment> = JsonMissing.of(),
            @JsonProperty("background_color")
            @ExcludeMissing
            backgroundColor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("border_radius")
            @ExcludeMissing
            borderRadius: JsonField<String> = JsonMissing.of(),
            @JsonProperty("border_size")
            @ExcludeMissing
            borderSize: JsonField<String> = JsonMissing.of(),
            @JsonProperty("disable_tracking")
            @ExcludeMissing
            disableTracking: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("font_size")
            @ExcludeMissing
            fontSize: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locales") @ExcludeMissing locales: JsonField<Locales> = JsonMissing.of(),
            @JsonProperty("padding") @ExcludeMissing padding: JsonField<String> = JsonMissing.of(),
            @JsonProperty("style")
            @ExcludeMissing
            style: JsonField<ElementalActionNode.Style> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(
            channels,
            if_,
            loop,
            ref,
            content,
            href,
            actionId,
            align,
            backgroundColor,
            borderRadius,
            borderSize,
            disableTracking,
            fontSize,
            locales,
            padding,
            style,
            type,
            mutableMapOf(),
        )

        fun toElementalActionNode(): ElementalActionNode =
            ElementalActionNode.builder()
                .channels(channels)
                .if_(if_)
                .loop(loop)
                .ref(ref)
                .content(content)
                .href(href)
                .actionId(actionId)
                .align(align)
                .backgroundColor(backgroundColor)
                .borderRadius(borderRadius)
                .borderSize(borderSize)
                .disableTracking(disableTracking)
                .fontSize(fontSize)
                .locales(locales)
                .padding(padding)
                .style(style)
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
         * The text content of the action shown to the user.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun content(): String = content.getRequired("content")

        /**
         * The target URL of the action.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun href(): String = href.getRequired("href")

        /**
         * A unique id used to identify the action when it is executed.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun actionId(): Optional<String> = actionId.getOptional("action_id")

        /**
         * The alignment of the action button. Defaults to "center".
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun align(): Optional<Alignment> = align.getOptional("align")

        /**
         * The background color of the action button.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun backgroundColor(): Optional<String> = backgroundColor.getOptional("background_color")

        /**
         * CSS border-radius applied to the action button. For example, `4px`
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun borderRadius(): Optional<String> = borderRadius.getOptional("border_radius")

        /**
         * CSS border width applied to the action button. For example, `1px`
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun borderSize(): Optional<String> = borderSize.getOptional("border_size")

        /**
         * When true, the action's href is not rewritten for click-through tracking, even when
         * click-through tracking is enabled for the workspace.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun disableTracking(): Optional<Boolean> = disableTracking.getOptional("disable_tracking")

        /**
         * CSS font-size applied to the action button label. For example, `14px`
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fontSize(): Optional<String> = fontSize.getOptional("font_size")

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
         * CSS padding applied to the action button. For example, `8px 16px`
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun padding(): Optional<String> = padding.getOptional("padding")

        /**
         * Defaults to `button`.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun style(): Optional<ElementalActionNode.Style> = style.getOptional("style")

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
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<List<String>> = channels

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
         * Returns the raw JSON value of [href].
         *
         * Unlike [href], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("href") @ExcludeMissing fun _href(): JsonField<String> = href

        /**
         * Returns the raw JSON value of [actionId].
         *
         * Unlike [actionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action_id") @ExcludeMissing fun _actionId(): JsonField<String> = actionId

        /**
         * Returns the raw JSON value of [align].
         *
         * Unlike [align], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("align") @ExcludeMissing fun _align(): JsonField<Alignment> = align

        /**
         * Returns the raw JSON value of [backgroundColor].
         *
         * Unlike [backgroundColor], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("background_color")
        @ExcludeMissing
        fun _backgroundColor(): JsonField<String> = backgroundColor

        /**
         * Returns the raw JSON value of [borderRadius].
         *
         * Unlike [borderRadius], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("border_radius")
        @ExcludeMissing
        fun _borderRadius(): JsonField<String> = borderRadius

        /**
         * Returns the raw JSON value of [borderSize].
         *
         * Unlike [borderSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("border_size")
        @ExcludeMissing
        fun _borderSize(): JsonField<String> = borderSize

        /**
         * Returns the raw JSON value of [disableTracking].
         *
         * Unlike [disableTracking], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("disable_tracking")
        @ExcludeMissing
        fun _disableTracking(): JsonField<Boolean> = disableTracking

        /**
         * Returns the raw JSON value of [fontSize].
         *
         * Unlike [fontSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("font_size") @ExcludeMissing fun _fontSize(): JsonField<String> = fontSize

        /**
         * Returns the raw JSON value of [locales].
         *
         * Unlike [locales], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locales") @ExcludeMissing fun _locales(): JsonField<Locales> = locales

        /**
         * Returns the raw JSON value of [padding].
         *
         * Unlike [padding], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("padding") @ExcludeMissing fun _padding(): JsonField<String> = padding

        /**
         * Returns the raw JSON value of [style].
         *
         * Unlike [style], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("style")
        @ExcludeMissing
        fun _style(): JsonField<ElementalActionNode.Style> = style

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
             * Returns a mutable builder for constructing an instance of [UnionMember3].
             *
             * The following fields are required:
             * ```java
             * .content()
             * .href()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember3]. */
        class Builder internal constructor() {

            private var channels: JsonField<MutableList<String>>? = null
            private var if_: JsonField<String> = JsonMissing.of()
            private var loop: JsonField<String> = JsonMissing.of()
            private var ref: JsonField<String> = JsonMissing.of()
            private var content: JsonField<String>? = null
            private var href: JsonField<String>? = null
            private var actionId: JsonField<String> = JsonMissing.of()
            private var align: JsonField<Alignment> = JsonMissing.of()
            private var backgroundColor: JsonField<String> = JsonMissing.of()
            private var borderRadius: JsonField<String> = JsonMissing.of()
            private var borderSize: JsonField<String> = JsonMissing.of()
            private var disableTracking: JsonField<Boolean> = JsonMissing.of()
            private var fontSize: JsonField<String> = JsonMissing.of()
            private var locales: JsonField<Locales> = JsonMissing.of()
            private var padding: JsonField<String> = JsonMissing.of()
            private var style: JsonField<ElementalActionNode.Style> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember3: UnionMember3) = apply {
                channels = unionMember3.channels.map { it.toMutableList() }
                if_ = unionMember3.if_
                loop = unionMember3.loop
                ref = unionMember3.ref
                content = unionMember3.content
                href = unionMember3.href
                actionId = unionMember3.actionId
                align = unionMember3.align
                backgroundColor = unionMember3.backgroundColor
                borderRadius = unionMember3.borderRadius
                borderSize = unionMember3.borderSize
                disableTracking = unionMember3.disableTracking
                fontSize = unionMember3.fontSize
                locales = unionMember3.locales
                padding = unionMember3.padding
                style = unionMember3.style
                type = unionMember3.type
                additionalProperties = unionMember3.additionalProperties.toMutableMap()
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

            fun loop(loop: String?) = loop(JsonField.ofNullable(loop))

            /** Alias for calling [Builder.loop] with `loop.orElse(null)`. */
            fun loop(loop: Optional<String>) = loop(loop.getOrNull())

            /**
             * Sets [Builder.loop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loop] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun loop(loop: JsonField<String>) = apply { this.loop = loop }

            fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

            /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
            fun ref(ref: Optional<String>) = ref(ref.getOrNull())

            /**
             * Sets [Builder.ref] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ref] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ref(ref: JsonField<String>) = apply { this.ref = ref }

            /** The text content of the action shown to the user. */
            fun content(content: String) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<String>) = apply { this.content = content }

            /** The target URL of the action. */
            fun href(href: String) = href(JsonField.of(href))

            /**
             * Sets [Builder.href] to an arbitrary JSON value.
             *
             * You should usually call [Builder.href] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun href(href: JsonField<String>) = apply { this.href = href }

            /** A unique id used to identify the action when it is executed. */
            fun actionId(actionId: String?) = actionId(JsonField.ofNullable(actionId))

            /** Alias for calling [Builder.actionId] with `actionId.orElse(null)`. */
            fun actionId(actionId: Optional<String>) = actionId(actionId.getOrNull())

            /**
             * Sets [Builder.actionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actionId(actionId: JsonField<String>) = apply { this.actionId = actionId }

            /** The alignment of the action button. Defaults to "center". */
            fun align(align: Alignment?) = align(JsonField.ofNullable(align))

            /** Alias for calling [Builder.align] with `align.orElse(null)`. */
            fun align(align: Optional<Alignment>) = align(align.getOrNull())

            /**
             * Sets [Builder.align] to an arbitrary JSON value.
             *
             * You should usually call [Builder.align] with a well-typed [Alignment] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun align(align: JsonField<Alignment>) = apply { this.align = align }

            /** The background color of the action button. */
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

            /** CSS border-radius applied to the action button. For example, `4px` */
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

            /** CSS border width applied to the action button. For example, `1px` */
            fun borderSize(borderSize: String?) = borderSize(JsonField.ofNullable(borderSize))

            /** Alias for calling [Builder.borderSize] with `borderSize.orElse(null)`. */
            fun borderSize(borderSize: Optional<String>) = borderSize(borderSize.getOrNull())

            /**
             * Sets [Builder.borderSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.borderSize] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun borderSize(borderSize: JsonField<String>) = apply { this.borderSize = borderSize }

            /**
             * When true, the action's href is not rewritten for click-through tracking, even when
             * click-through tracking is enabled for the workspace.
             */
            fun disableTracking(disableTracking: Boolean?) =
                disableTracking(JsonField.ofNullable(disableTracking))

            /**
             * Alias for [Builder.disableTracking].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun disableTracking(disableTracking: Boolean) =
                disableTracking(disableTracking as Boolean?)

            /** Alias for calling [Builder.disableTracking] with `disableTracking.orElse(null)`. */
            fun disableTracking(disableTracking: Optional<Boolean>) =
                disableTracking(disableTracking.getOrNull())

            /**
             * Sets [Builder.disableTracking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.disableTracking] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun disableTracking(disableTracking: JsonField<Boolean>) = apply {
                this.disableTracking = disableTracking
            }

            /** CSS font-size applied to the action button label. For example, `14px` */
            fun fontSize(fontSize: String?) = fontSize(JsonField.ofNullable(fontSize))

            /** Alias for calling [Builder.fontSize] with `fontSize.orElse(null)`. */
            fun fontSize(fontSize: Optional<String>) = fontSize(fontSize.getOrNull())

            /**
             * Sets [Builder.fontSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fontSize] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fontSize(fontSize: JsonField<String>) = apply { this.fontSize = fontSize }

            /**
             * Region specific content. See
             * [locales docs](https://www.courier.com/docs/platform/content/elemental/locales/) for
             * more details.
             */
            fun locales(locales: Locales?) = locales(JsonField.ofNullable(locales))

            /** Alias for calling [Builder.locales] with `locales.orElse(null)`. */
            fun locales(locales: Optional<Locales>) = locales(locales.getOrNull())

            /**
             * Sets [Builder.locales] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locales] with a well-typed [Locales] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locales(locales: JsonField<Locales>) = apply { this.locales = locales }

            /** CSS padding applied to the action button. For example, `8px 16px` */
            fun padding(padding: String?) = padding(JsonField.ofNullable(padding))

            /** Alias for calling [Builder.padding] with `padding.orElse(null)`. */
            fun padding(padding: Optional<String>) = padding(padding.getOrNull())

            /**
             * Sets [Builder.padding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.padding] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun padding(padding: JsonField<String>) = apply { this.padding = padding }

            /** Defaults to `button`. */
            fun style(style: ElementalActionNode.Style?) = style(JsonField.ofNullable(style))

            /** Alias for calling [Builder.style] with `style.orElse(null)`. */
            fun style(style: Optional<ElementalActionNode.Style>) = style(style.getOrNull())

            /**
             * Sets [Builder.style] to an arbitrary JSON value.
             *
             * You should usually call [Builder.style] with a well-typed [ElementalActionNode.Style]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun style(style: JsonField<ElementalActionNode.Style>) = apply { this.style = style }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [UnionMember3].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .content()
             * .href()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UnionMember3 =
                UnionMember3(
                    (channels ?: JsonMissing.of()).map { it.toImmutable() },
                    if_,
                    loop,
                    ref,
                    checkRequired("content", content),
                    checkRequired("href", href),
                    actionId,
                    align,
                    backgroundColor,
                    borderRadius,
                    borderSize,
                    disableTracking,
                    fontSize,
                    locales,
                    padding,
                    style,
                    type,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): UnionMember3 = apply {
            if (validated) {
                return@apply
            }

            channels()
            if_()
            loop()
            ref()
            content()
            href()
            actionId()
            align().ifPresent { it.validate() }
            backgroundColor()
            borderRadius()
            borderSize()
            disableTracking()
            fontSize()
            locales().ifPresent { it.validate() }
            padding()
            style().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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
                (if (href.asKnown().isPresent) 1 else 0) +
                (if (actionId.asKnown().isPresent) 1 else 0) +
                (align.asKnown().getOrNull()?.validity() ?: 0) +
                (if (backgroundColor.asKnown().isPresent) 1 else 0) +
                (if (borderRadius.asKnown().isPresent) 1 else 0) +
                (if (borderSize.asKnown().isPresent) 1 else 0) +
                (if (disableTracking.asKnown().isPresent) 1 else 0) +
                (if (fontSize.asKnown().isPresent) 1 else 0) +
                (locales.asKnown().getOrNull()?.validity() ?: 0) +
                (if (padding.asKnown().isPresent) 1 else 0) +
                (style.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ACTION = of("action")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                ACTION
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACTION,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    ACTION -> Value.ACTION
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
                    ACTION -> Known.ACTION
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

            return other is UnionMember3 &&
                channels == other.channels &&
                if_ == other.if_ &&
                loop == other.loop &&
                ref == other.ref &&
                content == other.content &&
                href == other.href &&
                actionId == other.actionId &&
                align == other.align &&
                backgroundColor == other.backgroundColor &&
                borderRadius == other.borderRadius &&
                borderSize == other.borderSize &&
                disableTracking == other.disableTracking &&
                fontSize == other.fontSize &&
                locales == other.locales &&
                padding == other.padding &&
                style == other.style &&
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
                href,
                actionId,
                align,
                backgroundColor,
                borderRadius,
                borderSize,
                disableTracking,
                fontSize,
                locales,
                padding,
                style,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember3{channels=$channels, if_=$if_, loop=$loop, ref=$ref, content=$content, href=$href, actionId=$actionId, align=$align, backgroundColor=$backgroundColor, borderRadius=$borderRadius, borderSize=$borderSize, disableTracking=$disableTracking, fontSize=$fontSize, locales=$locales, padding=$padding, style=$style, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Renders a dividing line between elements. */
    class UnionMember4
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channels: JsonField<List<String>>,
        private val if_: JsonField<String>,
        private val loop: JsonField<String>,
        private val ref: JsonField<String>,
        private val color: JsonField<String>,
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
            @JsonProperty("color") @ExcludeMissing color: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(channels, if_, loop, ref, color, type, mutableMapOf())

        fun toElementalDividerNode(): ElementalDividerNode =
            ElementalDividerNode.builder()
                .channels(channels)
                .if_(if_)
                .loop(loop)
                .ref(ref)
                .color(color)
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
         * The CSS color to render the line with. For example, `#fff`
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun color(): Optional<String> = color.getOptional("color")

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
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<List<String>> = channels

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
         * Returns the raw JSON value of [color].
         *
         * Unlike [color], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("color") @ExcludeMissing fun _color(): JsonField<String> = color

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

            /** Returns a mutable builder for constructing an instance of [UnionMember4]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember4]. */
        class Builder internal constructor() {

            private var channels: JsonField<MutableList<String>>? = null
            private var if_: JsonField<String> = JsonMissing.of()
            private var loop: JsonField<String> = JsonMissing.of()
            private var ref: JsonField<String> = JsonMissing.of()
            private var color: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember4: UnionMember4) = apply {
                channels = unionMember4.channels.map { it.toMutableList() }
                if_ = unionMember4.if_
                loop = unionMember4.loop
                ref = unionMember4.ref
                color = unionMember4.color
                type = unionMember4.type
                additionalProperties = unionMember4.additionalProperties.toMutableMap()
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

            fun loop(loop: String?) = loop(JsonField.ofNullable(loop))

            /** Alias for calling [Builder.loop] with `loop.orElse(null)`. */
            fun loop(loop: Optional<String>) = loop(loop.getOrNull())

            /**
             * Sets [Builder.loop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loop] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun loop(loop: JsonField<String>) = apply { this.loop = loop }

            fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

            /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
            fun ref(ref: Optional<String>) = ref(ref.getOrNull())

            /**
             * Sets [Builder.ref] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ref] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ref(ref: JsonField<String>) = apply { this.ref = ref }

            /** The CSS color to render the line with. For example, `#fff` */
            fun color(color: String?) = color(JsonField.ofNullable(color))

            /** Alias for calling [Builder.color] with `color.orElse(null)`. */
            fun color(color: Optional<String>) = color(color.getOrNull())

            /**
             * Sets [Builder.color] to an arbitrary JSON value.
             *
             * You should usually call [Builder.color] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun color(color: JsonField<String>) = apply { this.color = color }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [UnionMember4].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnionMember4 =
                UnionMember4(
                    (channels ?: JsonMissing.of()).map { it.toImmutable() },
                    if_,
                    loop,
                    ref,
                    color,
                    type,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): UnionMember4 = apply {
            if (validated) {
                return@apply
            }

            channels()
            if_()
            loop()
            ref()
            color()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (channels.asKnown().getOrNull()?.size ?: 0) +
                (if (if_.asKnown().isPresent) 1 else 0) +
                (if (loop.asKnown().isPresent) 1 else 0) +
                (if (ref.asKnown().isPresent) 1 else 0) +
                (if (color.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DIVIDER = of("divider")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                DIVIDER
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DIVIDER,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    DIVIDER -> Value.DIVIDER
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
                    DIVIDER -> Known.DIVIDER
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

            return other is UnionMember4 &&
                channels == other.channels &&
                if_ == other.if_ &&
                loop == other.loop &&
                ref == other.ref &&
                color == other.color &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(channels, if_, loop, ref, color, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember4{channels=$channels, if_=$if_, loop=$loop, ref=$ref, color=$color, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Renders a quote block. */
    class UnionMember5
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
            @JsonProperty("font_size")
            @ExcludeMissing
            fontSize: JsonField<String> = JsonMissing.of(),
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
         * CSS px font size for this quote block, e.g. `16px`. Overrides the size of the
         * `text_style` preset. Email only.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fontSize(): Optional<String> = fontSize.getOptional("font_size")

        /**
         * CSS line height for this quote block, as a px value or a unitless multiplier, e.g. `24px`
         * or `1.5`. Email only.
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
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<List<String>> = channels

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
        @JsonProperty("line_height")
        @ExcludeMissing
        fun _lineHeight(): JsonField<String> = lineHeight

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
        @JsonProperty("text_style")
        @ExcludeMissing
        fun _textStyle(): JsonField<TextStyle> = textStyle

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
             * Returns a mutable builder for constructing an instance of [UnionMember5].
             *
             * The following fields are required:
             * ```java
             * .content()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember5]. */
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
            internal fun from(unionMember5: UnionMember5) = apply {
                channels = unionMember5.channels.map { it.toMutableList() }
                if_ = unionMember5.if_
                loop = unionMember5.loop
                ref = unionMember5.ref
                content = unionMember5.content
                align = unionMember5.align
                borderColor = unionMember5.borderColor
                fontSize = unionMember5.fontSize
                lineHeight = unionMember5.lineHeight
                locales = unionMember5.locales
                textStyle = unionMember5.textStyle
                type = unionMember5.type
                additionalProperties = unionMember5.additionalProperties.toMutableMap()
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

            fun loop(loop: String?) = loop(JsonField.ofNullable(loop))

            /** Alias for calling [Builder.loop] with `loop.orElse(null)`. */
            fun loop(loop: Optional<String>) = loop(loop.getOrNull())

            /**
             * Sets [Builder.loop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loop] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun loop(loop: JsonField<String>) = apply { this.loop = loop }

            fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

            /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
            fun ref(ref: Optional<String>) = ref(ref.getOrNull())

            /**
             * Sets [Builder.ref] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ref] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ref(ref: JsonField<String>) = apply { this.ref = ref }

            /** The text value of the quote. */
            fun content(content: String) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<String>) = apply { this.content = content }

            /** Alignment of the quote. */
            fun align(align: Alignment?) = align(JsonField.ofNullable(align))

            /** Alias for calling [Builder.align] with `align.orElse(null)`. */
            fun align(align: Optional<Alignment>) = align(align.getOrNull())

            /**
             * Sets [Builder.align] to an arbitrary JSON value.
             *
             * You should usually call [Builder.align] with a well-typed [Alignment] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun align(align: JsonField<Alignment>) = apply { this.align = align }

            /** CSS border color property. For example, `#fff` */
            fun borderColor(borderColor: String?) = borderColor(JsonField.ofNullable(borderColor))

            /** Alias for calling [Builder.borderColor] with `borderColor.orElse(null)`. */
            fun borderColor(borderColor: Optional<String>) = borderColor(borderColor.getOrNull())

            /**
             * Sets [Builder.borderColor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.borderColor] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun borderColor(borderColor: JsonField<String>) = apply {
                this.borderColor = borderColor
            }

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
             * You should usually call [Builder.fontSize] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fontSize(fontSize: JsonField<String>) = apply { this.fontSize = fontSize }

            /**
             * CSS line height for this quote block, as a px value or a unitless multiplier, e.g.
             * `24px` or `1.5`. Email only.
             */
            fun lineHeight(lineHeight: String?) = lineHeight(JsonField.ofNullable(lineHeight))

            /** Alias for calling [Builder.lineHeight] with `lineHeight.orElse(null)`. */
            fun lineHeight(lineHeight: Optional<String>) = lineHeight(lineHeight.getOrNull())

            /**
             * Sets [Builder.lineHeight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineHeight] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lineHeight(lineHeight: JsonField<String>) = apply { this.lineHeight = lineHeight }

            /**
             * Region specific content. See
             * [locales docs](https://www.courier.com/docs/platform/content/elemental/locales/) for
             * more details.
             */
            fun locales(locales: Locales?) = locales(JsonField.ofNullable(locales))

            /** Alias for calling [Builder.locales] with `locales.orElse(null)`. */
            fun locales(locales: Optional<Locales>) = locales(locales.getOrNull())

            /**
             * Sets [Builder.locales] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locales] with a well-typed [Locales] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locales(locales: JsonField<Locales>) = apply { this.locales = locales }

            fun textStyle(textStyle: TextStyle) = textStyle(JsonField.of(textStyle))

            /**
             * Sets [Builder.textStyle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.textStyle] with a well-typed [TextStyle] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun textStyle(textStyle: JsonField<TextStyle>) = apply { this.textStyle = textStyle }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [UnionMember5].
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
            fun build(): UnionMember5 =
                UnionMember5(
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
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CourierInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): UnionMember5 = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                QUOTE,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    QUOTE -> Value.QUOTE
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
                    QUOTE -> Known.QUOTE
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

            return other is UnionMember5 &&
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
            "UnionMember5{channels=$channels, if_=$if_, loop=$loop, ref=$ref, content=$content, align=$align, borderColor=$borderColor, fontSize=$fontSize, lineHeight=$lineHeight, locales=$locales, textStyle=$textStyle, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * Raw HTML string inside an Elemental document. When rendering a message, this node is turned
     * into output only for the email channel; for other channels it produces no blocks.
     */
    class UnionMember6
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channels: JsonField<List<String>>,
        private val if_: JsonField<String>,
        private val loop: JsonField<String>,
        private val ref: JsonField<String>,
        private val content: JsonField<String>,
        private val locales: JsonField<Locales>,
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
            @JsonProperty("locales") @ExcludeMissing locales: JsonField<Locales> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(channels, if_, loop, ref, content, locales, type, mutableMapOf())

        fun toElementalHtmlNode(): ElementalHtmlNode =
            ElementalHtmlNode.builder()
                .channels(channels)
                .if_(if_)
                .loop(loop)
                .ref(ref)
                .content(content)
                .locales(locales)
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
         * Raw HTML string to render inside the notification.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun content(): String = content.getRequired("content")

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
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [channels].
         *
         * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<List<String>> = channels

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
         * Returns the raw JSON value of [locales].
         *
         * Unlike [locales], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locales") @ExcludeMissing fun _locales(): JsonField<Locales> = locales

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
             * Returns a mutable builder for constructing an instance of [UnionMember6].
             *
             * The following fields are required:
             * ```java
             * .content()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember6]. */
        class Builder internal constructor() {

            private var channels: JsonField<MutableList<String>>? = null
            private var if_: JsonField<String> = JsonMissing.of()
            private var loop: JsonField<String> = JsonMissing.of()
            private var ref: JsonField<String> = JsonMissing.of()
            private var content: JsonField<String>? = null
            private var locales: JsonField<Locales> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember6: UnionMember6) = apply {
                channels = unionMember6.channels.map { it.toMutableList() }
                if_ = unionMember6.if_
                loop = unionMember6.loop
                ref = unionMember6.ref
                content = unionMember6.content
                locales = unionMember6.locales
                type = unionMember6.type
                additionalProperties = unionMember6.additionalProperties.toMutableMap()
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun if_(if_: JsonField<String>) = apply { this.if_ = if_ }

            fun loop(loop: String?) = loop(JsonField.ofNullable(loop))

            /** Alias for calling [Builder.loop] with `loop.orElse(null)`. */
            fun loop(loop: Optional<String>) = loop(loop.getOrNull())

            /**
             * Sets [Builder.loop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loop] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun loop(loop: JsonField<String>) = apply { this.loop = loop }

            fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

            /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
            fun ref(ref: Optional<String>) = ref(ref.getOrNull())

            /**
             * Sets [Builder.ref] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ref] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ref(ref: JsonField<String>) = apply { this.ref = ref }

            /** Raw HTML string to render inside the notification. */
            fun content(content: String) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<String>) = apply { this.content = content }

            /**
             * Region specific content. See
             * [locales docs](https://www.courier.com/docs/platform/content/elemental/locales/) for
             * more details.
             */
            fun locales(locales: Locales?) = locales(JsonField.ofNullable(locales))

            /** Alias for calling [Builder.locales] with `locales.orElse(null)`. */
            fun locales(locales: Optional<Locales>) = locales(locales.getOrNull())

            /**
             * Sets [Builder.locales] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locales] with a well-typed [Locales] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locales(locales: JsonField<Locales>) = apply { this.locales = locales }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [UnionMember6].
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
            fun build(): UnionMember6 =
                UnionMember6(
                    (channels ?: JsonMissing.of()).map { it.toImmutable() },
                    if_,
                    loop,
                    ref,
                    checkRequired("content", content),
                    locales,
                    type,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): UnionMember6 = apply {
            if (validated) {
                return@apply
            }

            channels()
            if_()
            loop()
            ref()
            content()
            locales().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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
                (locales.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val HTML = of("html")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                HTML
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                HTML,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    HTML -> Value.HTML
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
                    HTML -> Known.HTML
                    else -> throw CourierInvalidDataException("Unknown Type: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

            return other is UnionMember6 &&
                channels == other.channels &&
                if_ == other.if_ &&
                loop == other.loop &&
                ref == other.ref &&
                content == other.content &&
                locales == other.locales &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(channels, if_, loop, ref, content, locales, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember6{channels=$channels, if_=$if_, loop=$loop, ref=$ref, content=$content, locales=$locales, type=$type, additionalProperties=$additionalProperties}"
    }
}

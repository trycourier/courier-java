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
@JsonDeserialize(using = ElementalNode.Deserializer::class)
@JsonSerialize(using = ElementalNode.Serializer::class)
class ElementalNode
private constructor(
    private val textNodeWithType: ElementalTextNodeWithType? = null,
    private val metaNodeWithType: ElementalMetaNodeWithType? = null,
    private val channelNodeWithType: ElementalChannelNodeWithType? = null,
    private val imageNodeWithType: ElementalImageNodeWithType? = null,
    private val actionNodeWithType: ElementalActionNodeWithType? = null,
    private val dividerNodeWithType: ElementalDividerNodeWithType? = null,
    private val quoteNodeWithType: ElementalQuoteNodeWithType? = null,
    private val unionMember7: UnionMember7? = null,
    private val _json: JsonValue? = null,
) {

    fun textNodeWithType(): Optional<ElementalTextNodeWithType> =
        Optional.ofNullable(textNodeWithType)

    fun metaNodeWithType(): Optional<ElementalMetaNodeWithType> =
        Optional.ofNullable(metaNodeWithType)

    /**
     * The channel element allows a notification to be customized based on which channel it is sent
     * through. For example, you may want to display a detailed message when the notification is
     * sent through email, and a more concise message in a push notification. Channel elements are
     * only valid as top-level elements; you cannot nest channel elements. If there is a channel
     * element specified at the top-level of the document, all sibling elements must be channel
     * elements. Note: As an alternative, most elements support a `channel` property. Which allows
     * you to selectively display an individual element on a per channel basis. See the
     * [control flow docs](https://www.courier.com/docs/platform/content/elemental/control-flow/)
     * for more details.
     */
    fun channelNodeWithType(): Optional<ElementalChannelNodeWithType> =
        Optional.ofNullable(channelNodeWithType)

    fun imageNodeWithType(): Optional<ElementalImageNodeWithType> =
        Optional.ofNullable(imageNodeWithType)

    fun actionNodeWithType(): Optional<ElementalActionNodeWithType> =
        Optional.ofNullable(actionNodeWithType)

    fun dividerNodeWithType(): Optional<ElementalDividerNodeWithType> =
        Optional.ofNullable(dividerNodeWithType)

    fun quoteNodeWithType(): Optional<ElementalQuoteNodeWithType> =
        Optional.ofNullable(quoteNodeWithType)

    fun unionMember7(): Optional<UnionMember7> = Optional.ofNullable(unionMember7)

    fun isTextNodeWithType(): Boolean = textNodeWithType != null

    fun isMetaNodeWithType(): Boolean = metaNodeWithType != null

    fun isChannelNodeWithType(): Boolean = channelNodeWithType != null

    fun isImageNodeWithType(): Boolean = imageNodeWithType != null

    fun isActionNodeWithType(): Boolean = actionNodeWithType != null

    fun isDividerNodeWithType(): Boolean = dividerNodeWithType != null

    fun isQuoteNodeWithType(): Boolean = quoteNodeWithType != null

    fun isUnionMember7(): Boolean = unionMember7 != null

    fun asTextNodeWithType(): ElementalTextNodeWithType =
        textNodeWithType.getOrThrow("textNodeWithType")

    fun asMetaNodeWithType(): ElementalMetaNodeWithType =
        metaNodeWithType.getOrThrow("metaNodeWithType")

    /**
     * The channel element allows a notification to be customized based on which channel it is sent
     * through. For example, you may want to display a detailed message when the notification is
     * sent through email, and a more concise message in a push notification. Channel elements are
     * only valid as top-level elements; you cannot nest channel elements. If there is a channel
     * element specified at the top-level of the document, all sibling elements must be channel
     * elements. Note: As an alternative, most elements support a `channel` property. Which allows
     * you to selectively display an individual element on a per channel basis. See the
     * [control flow docs](https://www.courier.com/docs/platform/content/elemental/control-flow/)
     * for more details.
     */
    fun asChannelNodeWithType(): ElementalChannelNodeWithType =
        channelNodeWithType.getOrThrow("channelNodeWithType")

    fun asImageNodeWithType(): ElementalImageNodeWithType =
        imageNodeWithType.getOrThrow("imageNodeWithType")

    fun asActionNodeWithType(): ElementalActionNodeWithType =
        actionNodeWithType.getOrThrow("actionNodeWithType")

    fun asDividerNodeWithType(): ElementalDividerNodeWithType =
        dividerNodeWithType.getOrThrow("dividerNodeWithType")

    fun asQuoteNodeWithType(): ElementalQuoteNodeWithType =
        quoteNodeWithType.getOrThrow("quoteNodeWithType")

    fun asUnionMember7(): UnionMember7 = unionMember7.getOrThrow("unionMember7")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            textNodeWithType != null -> visitor.visitTextNodeWithType(textNodeWithType)
            metaNodeWithType != null -> visitor.visitMetaNodeWithType(metaNodeWithType)
            channelNodeWithType != null -> visitor.visitChannelNodeWithType(channelNodeWithType)
            imageNodeWithType != null -> visitor.visitImageNodeWithType(imageNodeWithType)
            actionNodeWithType != null -> visitor.visitActionNodeWithType(actionNodeWithType)
            dividerNodeWithType != null -> visitor.visitDividerNodeWithType(dividerNodeWithType)
            quoteNodeWithType != null -> visitor.visitQuoteNodeWithType(quoteNodeWithType)
            unionMember7 != null -> visitor.visitUnionMember7(unionMember7)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ElementalNode = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitTextNodeWithType(textNodeWithType: ElementalTextNodeWithType) {
                    textNodeWithType.validate()
                }

                override fun visitMetaNodeWithType(metaNodeWithType: ElementalMetaNodeWithType) {
                    metaNodeWithType.validate()
                }

                override fun visitChannelNodeWithType(
                    channelNodeWithType: ElementalChannelNodeWithType
                ) {
                    channelNodeWithType.validate()
                }

                override fun visitImageNodeWithType(imageNodeWithType: ElementalImageNodeWithType) {
                    imageNodeWithType.validate()
                }

                override fun visitActionNodeWithType(
                    actionNodeWithType: ElementalActionNodeWithType
                ) {
                    actionNodeWithType.validate()
                }

                override fun visitDividerNodeWithType(
                    dividerNodeWithType: ElementalDividerNodeWithType
                ) {
                    dividerNodeWithType.validate()
                }

                override fun visitQuoteNodeWithType(quoteNodeWithType: ElementalQuoteNodeWithType) {
                    quoteNodeWithType.validate()
                }

                override fun visitUnionMember7(unionMember7: UnionMember7) {
                    unionMember7.validate()
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
                override fun visitTextNodeWithType(textNodeWithType: ElementalTextNodeWithType) =
                    textNodeWithType.validity()

                override fun visitMetaNodeWithType(metaNodeWithType: ElementalMetaNodeWithType) =
                    metaNodeWithType.validity()

                override fun visitChannelNodeWithType(
                    channelNodeWithType: ElementalChannelNodeWithType
                ) = channelNodeWithType.validity()

                override fun visitImageNodeWithType(imageNodeWithType: ElementalImageNodeWithType) =
                    imageNodeWithType.validity()

                override fun visitActionNodeWithType(
                    actionNodeWithType: ElementalActionNodeWithType
                ) = actionNodeWithType.validity()

                override fun visitDividerNodeWithType(
                    dividerNodeWithType: ElementalDividerNodeWithType
                ) = dividerNodeWithType.validity()

                override fun visitQuoteNodeWithType(quoteNodeWithType: ElementalQuoteNodeWithType) =
                    quoteNodeWithType.validity()

                override fun visitUnionMember7(unionMember7: UnionMember7) = unionMember7.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ElementalNode &&
            textNodeWithType == other.textNodeWithType &&
            metaNodeWithType == other.metaNodeWithType &&
            channelNodeWithType == other.channelNodeWithType &&
            imageNodeWithType == other.imageNodeWithType &&
            actionNodeWithType == other.actionNodeWithType &&
            dividerNodeWithType == other.dividerNodeWithType &&
            quoteNodeWithType == other.quoteNodeWithType &&
            unionMember7 == other.unionMember7
    }

    override fun hashCode(): Int =
        Objects.hash(
            textNodeWithType,
            metaNodeWithType,
            channelNodeWithType,
            imageNodeWithType,
            actionNodeWithType,
            dividerNodeWithType,
            quoteNodeWithType,
            unionMember7,
        )

    override fun toString(): String =
        when {
            textNodeWithType != null -> "ElementalNode{textNodeWithType=$textNodeWithType}"
            metaNodeWithType != null -> "ElementalNode{metaNodeWithType=$metaNodeWithType}"
            channelNodeWithType != null -> "ElementalNode{channelNodeWithType=$channelNodeWithType}"
            imageNodeWithType != null -> "ElementalNode{imageNodeWithType=$imageNodeWithType}"
            actionNodeWithType != null -> "ElementalNode{actionNodeWithType=$actionNodeWithType}"
            dividerNodeWithType != null -> "ElementalNode{dividerNodeWithType=$dividerNodeWithType}"
            quoteNodeWithType != null -> "ElementalNode{quoteNodeWithType=$quoteNodeWithType}"
            unionMember7 != null -> "ElementalNode{unionMember7=$unionMember7}"
            _json != null -> "ElementalNode{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ElementalNode")
        }

    companion object {

        @JvmStatic
        fun ofTextNodeWithType(textNodeWithType: ElementalTextNodeWithType) =
            ElementalNode(textNodeWithType = textNodeWithType)

        @JvmStatic
        fun ofMetaNodeWithType(metaNodeWithType: ElementalMetaNodeWithType) =
            ElementalNode(metaNodeWithType = metaNodeWithType)

        /**
         * The channel element allows a notification to be customized based on which channel it is
         * sent through. For example, you may want to display a detailed message when the
         * notification is sent through email, and a more concise message in a push notification.
         * Channel elements are only valid as top-level elements; you cannot nest channel elements.
         * If there is a channel element specified at the top-level of the document, all sibling
         * elements must be channel elements. Note: As an alternative, most elements support a
         * `channel` property. Which allows you to selectively display an individual element on a
         * per channel basis. See the
         * [control flow docs](https://www.courier.com/docs/platform/content/elemental/control-flow/)
         * for more details.
         */
        @JvmStatic
        fun ofChannelNodeWithType(channelNodeWithType: ElementalChannelNodeWithType) =
            ElementalNode(channelNodeWithType = channelNodeWithType)

        @JvmStatic
        fun ofImageNodeWithType(imageNodeWithType: ElementalImageNodeWithType) =
            ElementalNode(imageNodeWithType = imageNodeWithType)

        @JvmStatic
        fun ofActionNodeWithType(actionNodeWithType: ElementalActionNodeWithType) =
            ElementalNode(actionNodeWithType = actionNodeWithType)

        @JvmStatic
        fun ofDividerNodeWithType(dividerNodeWithType: ElementalDividerNodeWithType) =
            ElementalNode(dividerNodeWithType = dividerNodeWithType)

        @JvmStatic
        fun ofQuoteNodeWithType(quoteNodeWithType: ElementalQuoteNodeWithType) =
            ElementalNode(quoteNodeWithType = quoteNodeWithType)

        @JvmStatic
        fun ofUnionMember7(unionMember7: UnionMember7) = ElementalNode(unionMember7 = unionMember7)
    }

    /**
     * An interface that defines how to map each variant of [ElementalNode] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitTextNodeWithType(textNodeWithType: ElementalTextNodeWithType): T

        fun visitMetaNodeWithType(metaNodeWithType: ElementalMetaNodeWithType): T

        /**
         * The channel element allows a notification to be customized based on which channel it is
         * sent through. For example, you may want to display a detailed message when the
         * notification is sent through email, and a more concise message in a push notification.
         * Channel elements are only valid as top-level elements; you cannot nest channel elements.
         * If there is a channel element specified at the top-level of the document, all sibling
         * elements must be channel elements. Note: As an alternative, most elements support a
         * `channel` property. Which allows you to selectively display an individual element on a
         * per channel basis. See the
         * [control flow docs](https://www.courier.com/docs/platform/content/elemental/control-flow/)
         * for more details.
         */
        fun visitChannelNodeWithType(channelNodeWithType: ElementalChannelNodeWithType): T

        fun visitImageNodeWithType(imageNodeWithType: ElementalImageNodeWithType): T

        fun visitActionNodeWithType(actionNodeWithType: ElementalActionNodeWithType): T

        fun visitDividerNodeWithType(dividerNodeWithType: ElementalDividerNodeWithType): T

        fun visitQuoteNodeWithType(quoteNodeWithType: ElementalQuoteNodeWithType): T

        fun visitUnionMember7(unionMember7: UnionMember7): T

        /**
         * Maps an unknown variant of [ElementalNode] to a value of type [T].
         *
         * An instance of [ElementalNode] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown ElementalNode: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ElementalNode>(ElementalNode::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ElementalNode {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<ElementalTextNodeWithType>())?.let {
                            ElementalNode(textNodeWithType = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ElementalMetaNodeWithType>())?.let {
                            ElementalNode(metaNodeWithType = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ElementalChannelNodeWithType>())?.let {
                            ElementalNode(channelNodeWithType = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ElementalImageNodeWithType>())?.let {
                            ElementalNode(imageNodeWithType = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ElementalActionNodeWithType>())?.let {
                            ElementalNode(actionNodeWithType = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ElementalDividerNodeWithType>())?.let {
                            ElementalNode(dividerNodeWithType = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ElementalQuoteNodeWithType>())?.let {
                            ElementalNode(quoteNodeWithType = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember7>())?.let {
                            ElementalNode(unionMember7 = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ElementalNode(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<ElementalNode>(ElementalNode::class) {

        override fun serialize(
            value: ElementalNode,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.textNodeWithType != null -> generator.writeObject(value.textNodeWithType)
                value.metaNodeWithType != null -> generator.writeObject(value.metaNodeWithType)
                value.channelNodeWithType != null ->
                    generator.writeObject(value.channelNodeWithType)
                value.imageNodeWithType != null -> generator.writeObject(value.imageNodeWithType)
                value.actionNodeWithType != null -> generator.writeObject(value.actionNodeWithType)
                value.dividerNodeWithType != null ->
                    generator.writeObject(value.dividerNodeWithType)
                value.quoteNodeWithType != null -> generator.writeObject(value.quoteNodeWithType)
                value.unionMember7 != null -> generator.writeObject(value.unionMember7)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ElementalNode")
            }
        }
    }

    class UnionMember7
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channels: JsonField<List<String>>,
        private val if_: JsonField<String>,
        private val loop: JsonField<String>,
        private val ref: JsonField<String>,
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
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(channels, if_, loop, ref, type, mutableMapOf())

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

            /** Returns a mutable builder for constructing an instance of [UnionMember7]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember7]. */
        class Builder internal constructor() {

            private var channels: JsonField<MutableList<String>>? = null
            private var if_: JsonField<String> = JsonMissing.of()
            private var loop: JsonField<String> = JsonMissing.of()
            private var ref: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember7: UnionMember7) = apply {
                channels = unionMember7.channels.map { it.toMutableList() }
                if_ = unionMember7.if_
                loop = unionMember7.loop
                ref = unionMember7.ref
                type = unionMember7.type
                additionalProperties = unionMember7.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [UnionMember7].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnionMember7 =
                UnionMember7(
                    (channels ?: JsonMissing.of()).map { it.toImmutable() },
                    if_,
                    loop,
                    ref,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnionMember7 = apply {
            if (validated) {
                return@apply
            }

            channels()
            if_()
            loop()
            ref()
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

            return other is UnionMember7 &&
                channels == other.channels &&
                if_ == other.if_ &&
                loop == other.loop &&
                ref == other.ref &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(channels, if_, loop, ref, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionMember7{channels=$channels, if_=$if_, loop=$loop, ref=$ref, type=$type, additionalProperties=$additionalProperties}"
    }
}

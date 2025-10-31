// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.BaseDeserializer
import com.courier.core.BaseSerializer
import com.courier.core.JsonValue
import com.courier.core.allMaxBy
import com.courier.core.getOrThrow
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional

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

    fun isTextNodeWithType(): Boolean = textNodeWithType != null

    fun isMetaNodeWithType(): Boolean = metaNodeWithType != null

    fun isChannelNodeWithType(): Boolean = channelNodeWithType != null

    fun isImageNodeWithType(): Boolean = imageNodeWithType != null

    fun isActionNodeWithType(): Boolean = actionNodeWithType != null

    fun isDividerNodeWithType(): Boolean = dividerNodeWithType != null

    fun isQuoteNodeWithType(): Boolean = quoteNodeWithType != null

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
            quoteNodeWithType == other.quoteNodeWithType
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
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ElementalNode")
            }
        }
    }
}

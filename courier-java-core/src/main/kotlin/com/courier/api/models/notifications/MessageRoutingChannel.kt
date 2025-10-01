// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.notifications

import com.courier.api.core.BaseDeserializer
import com.courier.api.core.BaseSerializer
import com.courier.api.core.JsonValue
import com.courier.api.core.allMaxBy
import com.courier.api.core.getOrThrow
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = MessageRoutingChannel.Deserializer::class)
@JsonSerialize(using = MessageRoutingChannel.Serializer::class)
class MessageRoutingChannel
private constructor(
    private val string: String? = null,
    private val messageRouting: MessageRouting? = null,
    private val _json: JsonValue? = null,
) {

    fun string(): Optional<String> = Optional.ofNullable(string)

    fun messageRouting(): Optional<MessageRouting> = Optional.ofNullable(messageRouting)

    fun isString(): Boolean = string != null

    fun isMessageRouting(): Boolean = messageRouting != null

    fun asString(): String = string.getOrThrow("string")

    fun asMessageRouting(): MessageRouting = messageRouting.getOrThrow("messageRouting")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            string != null -> visitor.visitString(string)
            messageRouting != null -> visitor.visitMessageRouting(messageRouting)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): MessageRoutingChannel = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitString(string: String) {}

                override fun visitMessageRouting(messageRouting: MessageRouting) {
                    messageRouting.validate()
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
                override fun visitString(string: String) = 1

                override fun visitMessageRouting(messageRouting: MessageRouting) =
                    messageRouting.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageRoutingChannel &&
            string == other.string &&
            messageRouting == other.messageRouting
    }

    override fun hashCode(): Int = Objects.hash(string, messageRouting)

    override fun toString(): String =
        when {
            string != null -> "MessageRoutingChannel{string=$string}"
            messageRouting != null -> "MessageRoutingChannel{messageRouting=$messageRouting}"
            _json != null -> "MessageRoutingChannel{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid MessageRoutingChannel")
        }

    companion object {

        @JvmStatic fun ofString(string: String) = MessageRoutingChannel(string = string)

        @JvmStatic
        fun ofMessageRouting(messageRouting: MessageRouting) =
            MessageRoutingChannel(messageRouting = messageRouting)
    }

    /**
     * An interface that defines how to map each variant of [MessageRoutingChannel] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitString(string: String): T

        fun visitMessageRouting(messageRouting: MessageRouting): T

        /**
         * Maps an unknown variant of [MessageRoutingChannel] to a value of type [T].
         *
         * An instance of [MessageRoutingChannel] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown MessageRoutingChannel: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<MessageRoutingChannel>(MessageRoutingChannel::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): MessageRoutingChannel {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<MessageRouting>())?.let {
                            MessageRoutingChannel(messageRouting = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            MessageRoutingChannel(string = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from array).
                0 -> MessageRoutingChannel(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<MessageRoutingChannel>(MessageRoutingChannel::class) {

        override fun serialize(
            value: MessageRoutingChannel,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.string != null -> generator.writeObject(value.string)
                value.messageRouting != null -> generator.writeObject(value.messageRouting)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid MessageRoutingChannel")
            }
        }
    }
}

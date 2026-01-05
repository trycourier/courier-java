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

@JsonDeserialize(using = Discord.Deserializer::class)
@JsonSerialize(using = Discord.Serializer::class)
class Discord
private constructor(
    private val sendToChannel: SendToChannel? = null,
    private val sendDirectMessage: SendDirectMessage? = null,
    private val _json: JsonValue? = null,
) {

    fun sendToChannel(): Optional<SendToChannel> = Optional.ofNullable(sendToChannel)

    fun sendDirectMessage(): Optional<SendDirectMessage> = Optional.ofNullable(sendDirectMessage)

    fun isSendToChannel(): Boolean = sendToChannel != null

    fun isSendDirectMessage(): Boolean = sendDirectMessage != null

    fun asSendToChannel(): SendToChannel = sendToChannel.getOrThrow("sendToChannel")

    fun asSendDirectMessage(): SendDirectMessage = sendDirectMessage.getOrThrow("sendDirectMessage")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            sendToChannel != null -> visitor.visitSendToChannel(sendToChannel)
            sendDirectMessage != null -> visitor.visitSendDirectMessage(sendDirectMessage)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): Discord = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitSendToChannel(sendToChannel: SendToChannel) {
                    sendToChannel.validate()
                }

                override fun visitSendDirectMessage(sendDirectMessage: SendDirectMessage) {
                    sendDirectMessage.validate()
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
                override fun visitSendToChannel(sendToChannel: SendToChannel) =
                    sendToChannel.validity()

                override fun visitSendDirectMessage(sendDirectMessage: SendDirectMessage) =
                    sendDirectMessage.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Discord &&
            sendToChannel == other.sendToChannel &&
            sendDirectMessage == other.sendDirectMessage
    }

    override fun hashCode(): Int = Objects.hash(sendToChannel, sendDirectMessage)

    override fun toString(): String =
        when {
            sendToChannel != null -> "Discord{sendToChannel=$sendToChannel}"
            sendDirectMessage != null -> "Discord{sendDirectMessage=$sendDirectMessage}"
            _json != null -> "Discord{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Discord")
        }

    companion object {

        @JvmStatic
        fun ofSendToChannel(sendToChannel: SendToChannel) = Discord(sendToChannel = sendToChannel)

        @JvmStatic
        fun ofSendDirectMessage(sendDirectMessage: SendDirectMessage) =
            Discord(sendDirectMessage = sendDirectMessage)
    }

    /** An interface that defines how to map each variant of [Discord] to a value of type [T]. */
    interface Visitor<out T> {

        fun visitSendToChannel(sendToChannel: SendToChannel): T

        fun visitSendDirectMessage(sendDirectMessage: SendDirectMessage): T

        /**
         * Maps an unknown variant of [Discord] to a value of type [T].
         *
         * An instance of [Discord] can contain an unknown variant if it was deserialized from data
         * that doesn't match any known variant. For example, if the SDK is on an older version than
         * the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown Discord: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<Discord>(Discord::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Discord {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<SendToChannel>())?.let {
                            Discord(sendToChannel = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SendDirectMessage>())?.let {
                            Discord(sendDirectMessage = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> Discord(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<Discord>(Discord::class) {

        override fun serialize(
            value: Discord,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.sendToChannel != null -> generator.writeObject(value.sendToChannel)
                value.sendDirectMessage != null -> generator.writeObject(value.sendDirectMessage)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Discord")
            }
        }
    }
}

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

@JsonDeserialize(using = Slack.Deserializer::class)
@JsonSerialize(using = Slack.Serializer::class)
class Slack
private constructor(
    private val sendToSlackChannel: SendToSlackChannel? = null,
    private val sendToSlackEmail: SendToSlackEmail? = null,
    private val sendToSlackUserId: SendToSlackUserId? = null,
    private val _json: JsonValue? = null,
) {

    fun sendToSlackChannel(): Optional<SendToSlackChannel> = Optional.ofNullable(sendToSlackChannel)

    fun sendToSlackEmail(): Optional<SendToSlackEmail> = Optional.ofNullable(sendToSlackEmail)

    fun sendToSlackUserId(): Optional<SendToSlackUserId> = Optional.ofNullable(sendToSlackUserId)

    fun isSendToSlackChannel(): Boolean = sendToSlackChannel != null

    fun isSendToSlackEmail(): Boolean = sendToSlackEmail != null

    fun isSendToSlackUserId(): Boolean = sendToSlackUserId != null

    fun asSendToSlackChannel(): SendToSlackChannel =
        sendToSlackChannel.getOrThrow("sendToSlackChannel")

    fun asSendToSlackEmail(): SendToSlackEmail = sendToSlackEmail.getOrThrow("sendToSlackEmail")

    fun asSendToSlackUserId(): SendToSlackUserId = sendToSlackUserId.getOrThrow("sendToSlackUserId")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            sendToSlackChannel != null -> visitor.visitSendToSlackChannel(sendToSlackChannel)
            sendToSlackEmail != null -> visitor.visitSendToSlackEmail(sendToSlackEmail)
            sendToSlackUserId != null -> visitor.visitSendToSlackUserId(sendToSlackUserId)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): Slack = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitSendToSlackChannel(sendToSlackChannel: SendToSlackChannel) {
                    sendToSlackChannel.validate()
                }

                override fun visitSendToSlackEmail(sendToSlackEmail: SendToSlackEmail) {
                    sendToSlackEmail.validate()
                }

                override fun visitSendToSlackUserId(sendToSlackUserId: SendToSlackUserId) {
                    sendToSlackUserId.validate()
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
                override fun visitSendToSlackChannel(sendToSlackChannel: SendToSlackChannel) =
                    sendToSlackChannel.validity()

                override fun visitSendToSlackEmail(sendToSlackEmail: SendToSlackEmail) =
                    sendToSlackEmail.validity()

                override fun visitSendToSlackUserId(sendToSlackUserId: SendToSlackUserId) =
                    sendToSlackUserId.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Slack &&
            sendToSlackChannel == other.sendToSlackChannel &&
            sendToSlackEmail == other.sendToSlackEmail &&
            sendToSlackUserId == other.sendToSlackUserId
    }

    override fun hashCode(): Int =
        Objects.hash(sendToSlackChannel, sendToSlackEmail, sendToSlackUserId)

    override fun toString(): String =
        when {
            sendToSlackChannel != null -> "Slack{sendToSlackChannel=$sendToSlackChannel}"
            sendToSlackEmail != null -> "Slack{sendToSlackEmail=$sendToSlackEmail}"
            sendToSlackUserId != null -> "Slack{sendToSlackUserId=$sendToSlackUserId}"
            _json != null -> "Slack{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Slack")
        }

    companion object {

        @JvmStatic
        fun ofSendToSlackChannel(sendToSlackChannel: SendToSlackChannel) =
            Slack(sendToSlackChannel = sendToSlackChannel)

        @JvmStatic
        fun ofSendToSlackEmail(sendToSlackEmail: SendToSlackEmail) =
            Slack(sendToSlackEmail = sendToSlackEmail)

        @JvmStatic
        fun ofSendToSlackUserId(sendToSlackUserId: SendToSlackUserId) =
            Slack(sendToSlackUserId = sendToSlackUserId)
    }

    /** An interface that defines how to map each variant of [Slack] to a value of type [T]. */
    interface Visitor<out T> {

        fun visitSendToSlackChannel(sendToSlackChannel: SendToSlackChannel): T

        fun visitSendToSlackEmail(sendToSlackEmail: SendToSlackEmail): T

        fun visitSendToSlackUserId(sendToSlackUserId: SendToSlackUserId): T

        /**
         * Maps an unknown variant of [Slack] to a value of type [T].
         *
         * An instance of [Slack] can contain an unknown variant if it was deserialized from data
         * that doesn't match any known variant. For example, if the SDK is on an older version than
         * the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown Slack: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<Slack>(Slack::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Slack {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<SendToSlackChannel>())?.let {
                            Slack(sendToSlackChannel = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SendToSlackEmail>())?.let {
                            Slack(sendToSlackEmail = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SendToSlackUserId>())?.let {
                            Slack(sendToSlackUserId = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> Slack(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<Slack>(Slack::class) {

        override fun serialize(
            value: Slack,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.sendToSlackChannel != null -> generator.writeObject(value.sendToSlackChannel)
                value.sendToSlackEmail != null -> generator.writeObject(value.sendToSlackEmail)
                value.sendToSlackUserId != null -> generator.writeObject(value.sendToSlackUserId)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Slack")
            }
        }
    }
}

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

@JsonDeserialize(using = MsTeams.Deserializer::class)
@JsonSerialize(using = MsTeams.Serializer::class)
class MsTeams
private constructor(
    private val sendToMsTeamsUserId: SendToMsTeamsUserId? = null,
    private val sendToMsTeamsEmail: SendToMsTeamsEmail? = null,
    private val sendToMsTeamsChannelId: SendToMsTeamsChannelId? = null,
    private val sendToMsTeamsConversationId: SendToMsTeamsConversationId? = null,
    private val sendToMsTeamsChannelName: SendToMsTeamsChannelName? = null,
    private val _json: JsonValue? = null,
) {

    fun sendToMsTeamsUserId(): Optional<SendToMsTeamsUserId> =
        Optional.ofNullable(sendToMsTeamsUserId)

    fun sendToMsTeamsEmail(): Optional<SendToMsTeamsEmail> = Optional.ofNullable(sendToMsTeamsEmail)

    fun sendToMsTeamsChannelId(): Optional<SendToMsTeamsChannelId> =
        Optional.ofNullable(sendToMsTeamsChannelId)

    fun sendToMsTeamsConversationId(): Optional<SendToMsTeamsConversationId> =
        Optional.ofNullable(sendToMsTeamsConversationId)

    fun sendToMsTeamsChannelName(): Optional<SendToMsTeamsChannelName> =
        Optional.ofNullable(sendToMsTeamsChannelName)

    fun isSendToMsTeamsUserId(): Boolean = sendToMsTeamsUserId != null

    fun isSendToMsTeamsEmail(): Boolean = sendToMsTeamsEmail != null

    fun isSendToMsTeamsChannelId(): Boolean = sendToMsTeamsChannelId != null

    fun isSendToMsTeamsConversationId(): Boolean = sendToMsTeamsConversationId != null

    fun isSendToMsTeamsChannelName(): Boolean = sendToMsTeamsChannelName != null

    fun asSendToMsTeamsUserId(): SendToMsTeamsUserId =
        sendToMsTeamsUserId.getOrThrow("sendToMsTeamsUserId")

    fun asSendToMsTeamsEmail(): SendToMsTeamsEmail =
        sendToMsTeamsEmail.getOrThrow("sendToMsTeamsEmail")

    fun asSendToMsTeamsChannelId(): SendToMsTeamsChannelId =
        sendToMsTeamsChannelId.getOrThrow("sendToMsTeamsChannelId")

    fun asSendToMsTeamsConversationId(): SendToMsTeamsConversationId =
        sendToMsTeamsConversationId.getOrThrow("sendToMsTeamsConversationId")

    fun asSendToMsTeamsChannelName(): SendToMsTeamsChannelName =
        sendToMsTeamsChannelName.getOrThrow("sendToMsTeamsChannelName")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            sendToMsTeamsUserId != null -> visitor.visitSendToMsTeamsUserId(sendToMsTeamsUserId)
            sendToMsTeamsEmail != null -> visitor.visitSendToMsTeamsEmail(sendToMsTeamsEmail)
            sendToMsTeamsChannelId != null ->
                visitor.visitSendToMsTeamsChannelId(sendToMsTeamsChannelId)
            sendToMsTeamsConversationId != null ->
                visitor.visitSendToMsTeamsConversationId(sendToMsTeamsConversationId)
            sendToMsTeamsChannelName != null ->
                visitor.visitSendToMsTeamsChannelName(sendToMsTeamsChannelName)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): MsTeams = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitSendToMsTeamsUserId(sendToMsTeamsUserId: SendToMsTeamsUserId) {
                    sendToMsTeamsUserId.validate()
                }

                override fun visitSendToMsTeamsEmail(sendToMsTeamsEmail: SendToMsTeamsEmail) {
                    sendToMsTeamsEmail.validate()
                }

                override fun visitSendToMsTeamsChannelId(
                    sendToMsTeamsChannelId: SendToMsTeamsChannelId
                ) {
                    sendToMsTeamsChannelId.validate()
                }

                override fun visitSendToMsTeamsConversationId(
                    sendToMsTeamsConversationId: SendToMsTeamsConversationId
                ) {
                    sendToMsTeamsConversationId.validate()
                }

                override fun visitSendToMsTeamsChannelName(
                    sendToMsTeamsChannelName: SendToMsTeamsChannelName
                ) {
                    sendToMsTeamsChannelName.validate()
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
                override fun visitSendToMsTeamsUserId(sendToMsTeamsUserId: SendToMsTeamsUserId) =
                    sendToMsTeamsUserId.validity()

                override fun visitSendToMsTeamsEmail(sendToMsTeamsEmail: SendToMsTeamsEmail) =
                    sendToMsTeamsEmail.validity()

                override fun visitSendToMsTeamsChannelId(
                    sendToMsTeamsChannelId: SendToMsTeamsChannelId
                ) = sendToMsTeamsChannelId.validity()

                override fun visitSendToMsTeamsConversationId(
                    sendToMsTeamsConversationId: SendToMsTeamsConversationId
                ) = sendToMsTeamsConversationId.validity()

                override fun visitSendToMsTeamsChannelName(
                    sendToMsTeamsChannelName: SendToMsTeamsChannelName
                ) = sendToMsTeamsChannelName.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MsTeams &&
            sendToMsTeamsUserId == other.sendToMsTeamsUserId &&
            sendToMsTeamsEmail == other.sendToMsTeamsEmail &&
            sendToMsTeamsChannelId == other.sendToMsTeamsChannelId &&
            sendToMsTeamsConversationId == other.sendToMsTeamsConversationId &&
            sendToMsTeamsChannelName == other.sendToMsTeamsChannelName
    }

    override fun hashCode(): Int =
        Objects.hash(
            sendToMsTeamsUserId,
            sendToMsTeamsEmail,
            sendToMsTeamsChannelId,
            sendToMsTeamsConversationId,
            sendToMsTeamsChannelName,
        )

    override fun toString(): String =
        when {
            sendToMsTeamsUserId != null -> "MsTeams{sendToMsTeamsUserId=$sendToMsTeamsUserId}"
            sendToMsTeamsEmail != null -> "MsTeams{sendToMsTeamsEmail=$sendToMsTeamsEmail}"
            sendToMsTeamsChannelId != null ->
                "MsTeams{sendToMsTeamsChannelId=$sendToMsTeamsChannelId}"
            sendToMsTeamsConversationId != null ->
                "MsTeams{sendToMsTeamsConversationId=$sendToMsTeamsConversationId}"
            sendToMsTeamsChannelName != null ->
                "MsTeams{sendToMsTeamsChannelName=$sendToMsTeamsChannelName}"
            _json != null -> "MsTeams{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid MsTeams")
        }

    companion object {

        @JvmStatic
        fun ofSendToMsTeamsUserId(sendToMsTeamsUserId: SendToMsTeamsUserId) =
            MsTeams(sendToMsTeamsUserId = sendToMsTeamsUserId)

        @JvmStatic
        fun ofSendToMsTeamsEmail(sendToMsTeamsEmail: SendToMsTeamsEmail) =
            MsTeams(sendToMsTeamsEmail = sendToMsTeamsEmail)

        @JvmStatic
        fun ofSendToMsTeamsChannelId(sendToMsTeamsChannelId: SendToMsTeamsChannelId) =
            MsTeams(sendToMsTeamsChannelId = sendToMsTeamsChannelId)

        @JvmStatic
        fun ofSendToMsTeamsConversationId(
            sendToMsTeamsConversationId: SendToMsTeamsConversationId
        ) = MsTeams(sendToMsTeamsConversationId = sendToMsTeamsConversationId)

        @JvmStatic
        fun ofSendToMsTeamsChannelName(sendToMsTeamsChannelName: SendToMsTeamsChannelName) =
            MsTeams(sendToMsTeamsChannelName = sendToMsTeamsChannelName)
    }

    /** An interface that defines how to map each variant of [MsTeams] to a value of type [T]. */
    interface Visitor<out T> {

        fun visitSendToMsTeamsUserId(sendToMsTeamsUserId: SendToMsTeamsUserId): T

        fun visitSendToMsTeamsEmail(sendToMsTeamsEmail: SendToMsTeamsEmail): T

        fun visitSendToMsTeamsChannelId(sendToMsTeamsChannelId: SendToMsTeamsChannelId): T

        fun visitSendToMsTeamsConversationId(
            sendToMsTeamsConversationId: SendToMsTeamsConversationId
        ): T

        fun visitSendToMsTeamsChannelName(sendToMsTeamsChannelName: SendToMsTeamsChannelName): T

        /**
         * Maps an unknown variant of [MsTeams] to a value of type [T].
         *
         * An instance of [MsTeams] can contain an unknown variant if it was deserialized from data
         * that doesn't match any known variant. For example, if the SDK is on an older version than
         * the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown MsTeams: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<MsTeams>(MsTeams::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): MsTeams {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<SendToMsTeamsUserId>())?.let {
                            MsTeams(sendToMsTeamsUserId = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SendToMsTeamsEmail>())?.let {
                            MsTeams(sendToMsTeamsEmail = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SendToMsTeamsChannelId>())?.let {
                            MsTeams(sendToMsTeamsChannelId = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SendToMsTeamsConversationId>())?.let {
                            MsTeams(sendToMsTeamsConversationId = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SendToMsTeamsChannelName>())?.let {
                            MsTeams(sendToMsTeamsChannelName = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> MsTeams(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<MsTeams>(MsTeams::class) {

        override fun serialize(
            value: MsTeams,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.sendToMsTeamsUserId != null ->
                    generator.writeObject(value.sendToMsTeamsUserId)
                value.sendToMsTeamsEmail != null -> generator.writeObject(value.sendToMsTeamsEmail)
                value.sendToMsTeamsChannelId != null ->
                    generator.writeObject(value.sendToMsTeamsChannelId)
                value.sendToMsTeamsConversationId != null ->
                    generator.writeObject(value.sendToMsTeamsConversationId)
                value.sendToMsTeamsChannelName != null ->
                    generator.writeObject(value.sendToMsTeamsChannelName)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid MsTeams")
            }
        }
    }
}

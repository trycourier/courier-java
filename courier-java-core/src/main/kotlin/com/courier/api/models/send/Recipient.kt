// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

import com.courier.api.core.BaseDeserializer
import com.courier.api.core.BaseSerializer
import com.courier.api.core.JsonValue
import com.courier.api.core.allMaxBy
import com.courier.api.core.getOrThrow
import com.courier.api.errors.CourierInvalidDataException
import com.courier.api.models.ListRecipient
import com.courier.api.models.UserRecipient
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = Recipient.Deserializer::class)
@JsonSerialize(using = Recipient.Serializer::class)
class Recipient
private constructor(
    private val user: UserRecipient? = null,
    private val list: ListRecipient? = null,
    private val _json: JsonValue? = null,
) {

    fun user(): Optional<UserRecipient> = Optional.ofNullable(user)

    fun list(): Optional<ListRecipient> = Optional.ofNullable(list)

    fun isUser(): Boolean = user != null

    fun isList(): Boolean = list != null

    fun asUser(): UserRecipient = user.getOrThrow("user")

    fun asList(): ListRecipient = list.getOrThrow("list")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            user != null -> visitor.visitUser(user)
            list != null -> visitor.visitList(list)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): Recipient = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitUser(user: UserRecipient) {
                    user.validate()
                }

                override fun visitList(list: ListRecipient) {
                    list.validate()
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
                override fun visitUser(user: UserRecipient) = user.validity()

                override fun visitList(list: ListRecipient) = list.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Recipient && user == other.user && list == other.list
    }

    override fun hashCode(): Int = Objects.hash(user, list)

    override fun toString(): String =
        when {
            user != null -> "Recipient{user=$user}"
            list != null -> "Recipient{list=$list}"
            _json != null -> "Recipient{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Recipient")
        }

    companion object {

        @JvmStatic fun ofUser(user: UserRecipient) = Recipient(user = user)

        @JvmStatic fun ofList(list: ListRecipient) = Recipient(list = list)
    }

    /** An interface that defines how to map each variant of [Recipient] to a value of type [T]. */
    interface Visitor<out T> {

        fun visitUser(user: UserRecipient): T

        fun visitList(list: ListRecipient): T

        /**
         * Maps an unknown variant of [Recipient] to a value of type [T].
         *
         * An instance of [Recipient] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown Recipient: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<Recipient>(Recipient::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Recipient {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<UserRecipient>())?.let {
                            Recipient(user = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ListRecipient>())?.let {
                            Recipient(list = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> Recipient(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<Recipient>(Recipient::class) {

        override fun serialize(
            value: Recipient,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.user != null -> generator.writeObject(value.user)
                value.list != null -> generator.writeObject(value.list)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Recipient")
            }
        }
    }
}

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

@JsonDeserialize(using = Expo.Deserializer::class)
@JsonSerialize(using = Expo.Serializer::class)
class Expo
private constructor(
    private val token: Token? = null,
    private val multipleTokens: MultipleTokens? = null,
    private val _json: JsonValue? = null,
) {

    fun token(): Optional<Token> = Optional.ofNullable(token)

    fun multipleTokens(): Optional<MultipleTokens> = Optional.ofNullable(multipleTokens)

    fun isToken(): Boolean = token != null

    fun isMultipleTokens(): Boolean = multipleTokens != null

    fun asToken(): Token = token.getOrThrow("token")

    fun asMultipleTokens(): MultipleTokens = multipleTokens.getOrThrow("multipleTokens")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            token != null -> visitor.visitToken(token)
            multipleTokens != null -> visitor.visitMultipleTokens(multipleTokens)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): Expo = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitToken(token: Token) {
                    token.validate()
                }

                override fun visitMultipleTokens(multipleTokens: MultipleTokens) {
                    multipleTokens.validate()
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
                override fun visitToken(token: Token) = token.validity()

                override fun visitMultipleTokens(multipleTokens: MultipleTokens) =
                    multipleTokens.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Expo && token == other.token && multipleTokens == other.multipleTokens
    }

    override fun hashCode(): Int = Objects.hash(token, multipleTokens)

    override fun toString(): String =
        when {
            token != null -> "Expo{token=$token}"
            multipleTokens != null -> "Expo{multipleTokens=$multipleTokens}"
            _json != null -> "Expo{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Expo")
        }

    companion object {

        @JvmStatic fun ofToken(token: Token) = Expo(token = token)

        @JvmStatic
        fun ofMultipleTokens(multipleTokens: MultipleTokens) = Expo(multipleTokens = multipleTokens)
    }

    /** An interface that defines how to map each variant of [Expo] to a value of type [T]. */
    interface Visitor<out T> {

        fun visitToken(token: Token): T

        fun visitMultipleTokens(multipleTokens: MultipleTokens): T

        /**
         * Maps an unknown variant of [Expo] to a value of type [T].
         *
         * An instance of [Expo] can contain an unknown variant if it was deserialized from data
         * that doesn't match any known variant. For example, if the SDK is on an older version than
         * the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown Expo: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<Expo>(Expo::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Expo {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<Token>())?.let {
                            Expo(token = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<MultipleTokens>())?.let {
                            Expo(multipleTokens = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> Expo(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<Expo>(Expo::class) {

        override fun serialize(
            value: Expo,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.token != null -> generator.writeObject(value.token)
                value.multipleTokens != null -> generator.writeObject(value.multipleTokens)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Expo")
            }
        }
    }
}

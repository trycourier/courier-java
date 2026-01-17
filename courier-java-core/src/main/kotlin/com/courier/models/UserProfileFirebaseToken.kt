// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.BaseDeserializer
import com.courier.core.BaseSerializer
import com.courier.core.JsonValue
import com.courier.core.allMaxBy
import com.courier.core.getOrThrow
import com.courier.core.toImmutable
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

@JsonDeserialize(using = UserProfileFirebaseToken.Deserializer::class)
@JsonSerialize(using = UserProfileFirebaseToken.Serializer::class)
class UserProfileFirebaseToken
private constructor(
    private val string: String? = null,
    private val strings: List<String>? = null,
    private val _json: JsonValue? = null,
) {

    fun string(): Optional<String> = Optional.ofNullable(string)

    fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

    fun isString(): Boolean = string != null

    fun isStrings(): Boolean = strings != null

    fun asString(): String = string.getOrThrow("string")

    fun asStrings(): List<String> = strings.getOrThrow("strings")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            string != null -> visitor.visitString(string)
            strings != null -> visitor.visitStrings(strings)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): UserProfileFirebaseToken = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitString(string: String) {}

                override fun visitStrings(strings: List<String>) {}
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

                override fun visitStrings(strings: List<String>) = strings.size

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserProfileFirebaseToken &&
            string == other.string &&
            strings == other.strings
    }

    override fun hashCode(): Int = Objects.hash(string, strings)

    override fun toString(): String =
        when {
            string != null -> "UserProfileFirebaseToken{string=$string}"
            strings != null -> "UserProfileFirebaseToken{strings=$strings}"
            _json != null -> "UserProfileFirebaseToken{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid UserProfileFirebaseToken")
        }

    companion object {

        @JvmStatic fun ofString(string: String) = UserProfileFirebaseToken(string = string)

        @JvmStatic
        fun ofStrings(strings: List<String>) =
            UserProfileFirebaseToken(strings = strings.toImmutable())
    }

    /**
     * An interface that defines how to map each variant of [UserProfileFirebaseToken] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitString(string: String): T

        fun visitStrings(strings: List<String>): T

        /**
         * Maps an unknown variant of [UserProfileFirebaseToken] to a value of type [T].
         *
         * An instance of [UserProfileFirebaseToken] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown UserProfileFirebaseToken: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<UserProfileFirebaseToken>(UserProfileFirebaseToken::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): UserProfileFirebaseToken {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            UserProfileFirebaseToken(string = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                            UserProfileFirebaseToken(strings = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> UserProfileFirebaseToken(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<UserProfileFirebaseToken>(UserProfileFirebaseToken::class) {

        override fun serialize(
            value: UserProfileFirebaseToken,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.string != null -> generator.writeObject(value.string)
                value.strings != null -> generator.writeObject(value.strings)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid UserProfileFirebaseToken")
            }
        }
    }
}

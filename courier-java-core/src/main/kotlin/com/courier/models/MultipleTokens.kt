// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.BaseDeserializer
import com.courier.core.BaseSerializer
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.allMaxBy
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

class MultipleTokens
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val tokens: JsonField<Tokens>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("tokens") @ExcludeMissing tokens: JsonField<Tokens> = JsonMissing.of()
    ) : this(tokens, mutableMapOf())

    /**
     * One device token, or an array of them. The values are the token strings themselves — not
     * objects.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokens(): Tokens = tokens.getRequired("tokens")

    /**
     * Returns the raw JSON value of [tokens].
     *
     * Unlike [tokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tokens") @ExcludeMissing fun _tokens(): JsonField<Tokens> = tokens

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
         * Returns a mutable builder for constructing an instance of [MultipleTokens].
         *
         * The following fields are required:
         * ```java
         * .tokens()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MultipleTokens]. */
    class Builder internal constructor() {

        private var tokens: JsonField<Tokens>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(multipleTokens: MultipleTokens) = apply {
            tokens = multipleTokens.tokens
            additionalProperties = multipleTokens.additionalProperties.toMutableMap()
        }

        /**
         * One device token, or an array of them. The values are the token strings themselves — not
         * objects.
         */
        fun tokens(tokens: Tokens) = tokens(JsonField.of(tokens))

        /**
         * Sets [Builder.tokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokens] with a well-typed [Tokens] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tokens(tokens: JsonField<Tokens>) = apply { this.tokens = tokens }

        /** Alias for calling [tokens] with `Tokens.ofString(string)`. */
        fun tokens(string: String) = tokens(Tokens.ofString(string))

        /** Alias for calling [tokens] with `Tokens.ofStrings(strings)`. */
        fun tokensOfStrings(strings: List<String>) = tokens(Tokens.ofStrings(strings))

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
         * Returns an immutable instance of [MultipleTokens].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .tokens()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MultipleTokens =
            MultipleTokens(checkRequired("tokens", tokens), additionalProperties.toMutableMap())
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
    fun validate(): MultipleTokens = apply {
        if (validated) {
            return@apply
        }

        tokens().validate()
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
    @JvmSynthetic internal fun validity(): Int = (tokens.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * One device token, or an array of them. The values are the token strings themselves — not
     * objects.
     */
    @JsonDeserialize(using = Tokens.Deserializer::class)
    @JsonSerialize(using = Tokens.Serializer::class)
    class Tokens
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

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.courier.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = tokens.accept(new Tokens.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitString(String string) {
         *         return Optional.of(string.toString());
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
         * @throws CourierInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
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
        fun validate(): Tokens = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is Tokens && string == other.string && strings == other.strings
        }

        override fun hashCode(): Int = Objects.hash(string, strings)

        override fun toString(): String =
            when {
                string != null -> "Tokens{string=$string}"
                strings != null -> "Tokens{strings=$strings}"
                _json != null -> "Tokens{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Tokens")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Tokens(string = string)

            @JvmStatic
            fun ofStrings(strings: List<String>) = Tokens(strings = strings.toImmutable())
        }

        /** An interface that defines how to map each variant of [Tokens] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            /**
             * Maps an unknown variant of [Tokens] to a value of type [T].
             *
             * An instance of [Tokens] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws CourierInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw CourierInvalidDataException("Unknown Tokens: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Tokens>(Tokens::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Tokens {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Tokens(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                Tokens(strings = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Tokens(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Tokens>(Tokens::class) {

            override fun serialize(
                value: Tokens,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Tokens")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MultipleTokens &&
            tokens == other.tokens &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(tokens, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MultipleTokens{tokens=$tokens, additionalProperties=$additionalProperties}"
}

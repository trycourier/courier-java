// File generated from our OpenAPI spec by Stainless.

package com.courier.models.audiences

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

/** A single filter to use for filtering */
@JsonDeserialize(using = FilterConfig.Deserializer::class)
@JsonSerialize(using = FilterConfig.Serializer::class)
class FilterConfig
private constructor(
    private val single: SingleFilterConfig? = null,
    private val nested: NestedFilterConfig? = null,
    private val _json: JsonValue? = null,
) {

    /** A single filter to use for filtering */
    fun single(): Optional<SingleFilterConfig> = Optional.ofNullable(single)

    /** The operator to use for filtering */
    fun nested(): Optional<NestedFilterConfig> = Optional.ofNullable(nested)

    fun isSingle(): Boolean = single != null

    fun isNested(): Boolean = nested != null

    /** A single filter to use for filtering */
    fun asSingle(): SingleFilterConfig = single.getOrThrow("single")

    /** The operator to use for filtering */
    fun asNested(): NestedFilterConfig = nested.getOrThrow("nested")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            single != null -> visitor.visitSingle(single)
            nested != null -> visitor.visitNested(nested)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): FilterConfig = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitSingle(single: SingleFilterConfig) {
                    single.validate()
                }

                override fun visitNested(nested: NestedFilterConfig) {
                    nested.validate()
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
                override fun visitSingle(single: SingleFilterConfig) = single.validity()

                override fun visitNested(nested: NestedFilterConfig) = nested.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FilterConfig && single == other.single && nested == other.nested
    }

    override fun hashCode(): Int = Objects.hash(single, nested)

    override fun toString(): String =
        when {
            single != null -> "FilterConfig{single=$single}"
            nested != null -> "FilterConfig{nested=$nested}"
            _json != null -> "FilterConfig{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid FilterConfig")
        }

    companion object {

        /** A single filter to use for filtering */
        @JvmStatic fun ofSingle(single: SingleFilterConfig) = FilterConfig(single = single)

        /** The operator to use for filtering */
        @JvmStatic fun ofNested(nested: NestedFilterConfig) = FilterConfig(nested = nested)
    }

    /**
     * An interface that defines how to map each variant of [FilterConfig] to a value of type [T].
     */
    interface Visitor<out T> {

        /** A single filter to use for filtering */
        fun visitSingle(single: SingleFilterConfig): T

        /** The operator to use for filtering */
        fun visitNested(nested: NestedFilterConfig): T

        /**
         * Maps an unknown variant of [FilterConfig] to a value of type [T].
         *
         * An instance of [FilterConfig] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown FilterConfig: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<FilterConfig>(FilterConfig::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): FilterConfig {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<SingleFilterConfig>())?.let {
                            FilterConfig(single = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<NestedFilterConfig>())?.let {
                            FilterConfig(nested = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> FilterConfig(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<FilterConfig>(FilterConfig::class) {

        override fun serialize(
            value: FilterConfig,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.single != null -> generator.writeObject(value.single)
                value.nested != null -> generator.writeObject(value.nested)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid FilterConfig")
            }
        }
    }
}

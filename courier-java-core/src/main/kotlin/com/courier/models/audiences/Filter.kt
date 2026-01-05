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
@JsonDeserialize(using = Filter.Deserializer::class)
@JsonSerialize(using = Filter.Serializer::class)
class Filter
private constructor(
    private val singleFilterConfig: SingleFilterConfig? = null,
    private val nestedFilterConfig: NestedFilterConfig? = null,
    private val _json: JsonValue? = null,
) {

    /** A single filter to use for filtering */
    fun singleFilterConfig(): Optional<SingleFilterConfig> = Optional.ofNullable(singleFilterConfig)

    /** The operator to use for filtering */
    fun nestedFilterConfig(): Optional<NestedFilterConfig> = Optional.ofNullable(nestedFilterConfig)

    fun isSingleFilterConfig(): Boolean = singleFilterConfig != null

    fun isNestedFilterConfig(): Boolean = nestedFilterConfig != null

    /** A single filter to use for filtering */
    fun asSingleFilterConfig(): SingleFilterConfig =
        singleFilterConfig.getOrThrow("singleFilterConfig")

    /** The operator to use for filtering */
    fun asNestedFilterConfig(): NestedFilterConfig =
        nestedFilterConfig.getOrThrow("nestedFilterConfig")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            singleFilterConfig != null -> visitor.visitSingleFilterConfig(singleFilterConfig)
            nestedFilterConfig != null -> visitor.visitNestedFilterConfig(nestedFilterConfig)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): Filter = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitSingleFilterConfig(singleFilterConfig: SingleFilterConfig) {
                    singleFilterConfig.validate()
                }

                override fun visitNestedFilterConfig(nestedFilterConfig: NestedFilterConfig) {
                    nestedFilterConfig.validate()
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
                override fun visitSingleFilterConfig(singleFilterConfig: SingleFilterConfig) =
                    singleFilterConfig.validity()

                override fun visitNestedFilterConfig(nestedFilterConfig: NestedFilterConfig) =
                    nestedFilterConfig.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Filter &&
            singleFilterConfig == other.singleFilterConfig &&
            nestedFilterConfig == other.nestedFilterConfig
    }

    override fun hashCode(): Int = Objects.hash(singleFilterConfig, nestedFilterConfig)

    override fun toString(): String =
        when {
            singleFilterConfig != null -> "Filter{singleFilterConfig=$singleFilterConfig}"
            nestedFilterConfig != null -> "Filter{nestedFilterConfig=$nestedFilterConfig}"
            _json != null -> "Filter{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Filter")
        }

    companion object {

        /** A single filter to use for filtering */
        @JvmStatic
        fun ofSingleFilterConfig(singleFilterConfig: SingleFilterConfig) =
            Filter(singleFilterConfig = singleFilterConfig)

        /** The operator to use for filtering */
        @JvmStatic
        fun ofNestedFilterConfig(nestedFilterConfig: NestedFilterConfig) =
            Filter(nestedFilterConfig = nestedFilterConfig)
    }

    /** An interface that defines how to map each variant of [Filter] to a value of type [T]. */
    interface Visitor<out T> {

        /** A single filter to use for filtering */
        fun visitSingleFilterConfig(singleFilterConfig: SingleFilterConfig): T

        /** The operator to use for filtering */
        fun visitNestedFilterConfig(nestedFilterConfig: NestedFilterConfig): T

        /**
         * Maps an unknown variant of [Filter] to a value of type [T].
         *
         * An instance of [Filter] can contain an unknown variant if it was deserialized from data
         * that doesn't match any known variant. For example, if the SDK is on an older version than
         * the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown Filter: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<Filter>(Filter::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Filter {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<SingleFilterConfig>())?.let {
                            Filter(singleFilterConfig = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<NestedFilterConfig>())?.let {
                            Filter(nestedFilterConfig = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> Filter(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<Filter>(Filter::class) {

        override fun serialize(
            value: Filter,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.singleFilterConfig != null -> generator.writeObject(value.singleFilterConfig)
                value.nestedFilterConfig != null -> generator.writeObject(value.nestedFilterConfig)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Filter")
            }
        }
    }
}

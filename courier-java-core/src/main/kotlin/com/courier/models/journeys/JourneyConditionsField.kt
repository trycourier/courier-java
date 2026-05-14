// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

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

/**
 * Condition spec for a journey node. Accepts a single condition atom, an AND/OR group, or an AND/OR
 * nested group. Omit the `conditions` property entirely to express "no conditions".
 */
@JsonDeserialize(using = JourneyConditionsField.Deserializer::class)
@JsonSerialize(using = JourneyConditionsField.Serializer::class)
class JourneyConditionsField
private constructor(
    private val conditionAtom: List<String>? = null,
    private val conditionGroup: JourneyConditionGroup? = null,
    private val conditionNestedGroup: JourneyConditionNestedGroup? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * A single condition expressed as a positional tuple of strings.
     * - Binary form (3 elements): `[path, operator, value]` where `operator` is one of `is equal`,
     *   `is not equal`, `contains`, `does not contain`, `starts with`, `ends with`, `greater than`,
     *   `greater than or equal`, `less than`, `less than or equal`.
     *
     *   Example: `["user.tier", "is equal", "gold"]`.
     * - Unary form (2 elements): `[path, operator]` where `operator` is one of `exists`, `does not
     *   exist`.
     *
     *   Example: `["user.email", "exists"]`.
     *
     * The first element is a non-empty dot-path. The second element is the operator (must come from
     * one of the two operator sets above). For the binary form, the third element is the comparison
     * value (string). Runtime validation of the operator value and arity is performed by the
     * backend; SDKs surface this as a string list.
     */
    fun conditionAtom(): Optional<List<String>> = Optional.ofNullable(conditionAtom)

    /**
     * A leaf condition group. Exactly one of `AND` or `OR` must be present at runtime; each is a
     * list of `JourneyConditionAtom` tuples.
     */
    fun conditionGroup(): Optional<JourneyConditionGroup> = Optional.ofNullable(conditionGroup)

    /**
     * A nested condition group. Exactly one of `AND` or `OR` must be present at runtime; each is a
     * list of `JourneyConditionGroup` items.
     */
    fun conditionNestedGroup(): Optional<JourneyConditionNestedGroup> =
        Optional.ofNullable(conditionNestedGroup)

    fun isConditionAtom(): Boolean = conditionAtom != null

    fun isConditionGroup(): Boolean = conditionGroup != null

    fun isConditionNestedGroup(): Boolean = conditionNestedGroup != null

    /**
     * A single condition expressed as a positional tuple of strings.
     * - Binary form (3 elements): `[path, operator, value]` where `operator` is one of `is equal`,
     *   `is not equal`, `contains`, `does not contain`, `starts with`, `ends with`, `greater than`,
     *   `greater than or equal`, `less than`, `less than or equal`.
     *
     *   Example: `["user.tier", "is equal", "gold"]`.
     * - Unary form (2 elements): `[path, operator]` where `operator` is one of `exists`, `does not
     *   exist`.
     *
     *   Example: `["user.email", "exists"]`.
     *
     * The first element is a non-empty dot-path. The second element is the operator (must come from
     * one of the two operator sets above). For the binary form, the third element is the comparison
     * value (string). Runtime validation of the operator value and arity is performed by the
     * backend; SDKs surface this as a string list.
     */
    fun asConditionAtom(): List<String> = conditionAtom.getOrThrow("conditionAtom")

    /**
     * A leaf condition group. Exactly one of `AND` or `OR` must be present at runtime; each is a
     * list of `JourneyConditionAtom` tuples.
     */
    fun asConditionGroup(): JourneyConditionGroup = conditionGroup.getOrThrow("conditionGroup")

    /**
     * A nested condition group. Exactly one of `AND` or `OR` must be present at runtime; each is a
     * list of `JourneyConditionGroup` items.
     */
    fun asConditionNestedGroup(): JourneyConditionNestedGroup =
        conditionNestedGroup.getOrThrow("conditionNestedGroup")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.courier.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = journeyConditionsField.accept(new JourneyConditionsField.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitConditionAtom(List<String> conditionAtom) {
     *         return Optional.of(conditionAtom.toString());
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
     * @throws CourierInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            conditionAtom != null -> visitor.visitConditionAtom(conditionAtom)
            conditionGroup != null -> visitor.visitConditionGroup(conditionGroup)
            conditionNestedGroup != null -> visitor.visitConditionNestedGroup(conditionNestedGroup)
            else -> visitor.unknown(_json)
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
    fun validate(): JourneyConditionsField = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitConditionAtom(conditionAtom: List<String>) {}

                override fun visitConditionGroup(conditionGroup: JourneyConditionGroup) {
                    conditionGroup.validate()
                }

                override fun visitConditionNestedGroup(
                    conditionNestedGroup: JourneyConditionNestedGroup
                ) {
                    conditionNestedGroup.validate()
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
                override fun visitConditionAtom(conditionAtom: List<String>) = conditionAtom.size

                override fun visitConditionGroup(conditionGroup: JourneyConditionGroup) =
                    conditionGroup.validity()

                override fun visitConditionNestedGroup(
                    conditionNestedGroup: JourneyConditionNestedGroup
                ) = conditionNestedGroup.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JourneyConditionsField &&
            conditionAtom == other.conditionAtom &&
            conditionGroup == other.conditionGroup &&
            conditionNestedGroup == other.conditionNestedGroup
    }

    override fun hashCode(): Int = Objects.hash(conditionAtom, conditionGroup, conditionNestedGroup)

    override fun toString(): String =
        when {
            conditionAtom != null -> "JourneyConditionsField{conditionAtom=$conditionAtom}"
            conditionGroup != null -> "JourneyConditionsField{conditionGroup=$conditionGroup}"
            conditionNestedGroup != null ->
                "JourneyConditionsField{conditionNestedGroup=$conditionNestedGroup}"
            _json != null -> "JourneyConditionsField{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid JourneyConditionsField")
        }

    companion object {

        /**
         * A single condition expressed as a positional tuple of strings.
         * - Binary form (3 elements): `[path, operator, value]` where `operator` is one of `is
         *   equal`, `is not equal`, `contains`, `does not contain`, `starts with`, `ends with`,
         *   `greater than`, `greater than or equal`, `less than`, `less than or equal`.
         *
         *   Example: `["user.tier", "is equal", "gold"]`.
         * - Unary form (2 elements): `[path, operator]` where `operator` is one of `exists`, `does
         *   not exist`.
         *
         *   Example: `["user.email", "exists"]`.
         *
         * The first element is a non-empty dot-path. The second element is the operator (must come
         * from one of the two operator sets above). For the binary form, the third element is the
         * comparison value (string). Runtime validation of the operator value and arity is
         * performed by the backend; SDKs surface this as a string list.
         */
        @JvmStatic
        fun ofConditionAtom(conditionAtom: List<String>) =
            JourneyConditionsField(conditionAtom = conditionAtom.toImmutable())

        /**
         * A leaf condition group. Exactly one of `AND` or `OR` must be present at runtime; each is
         * a list of `JourneyConditionAtom` tuples.
         */
        @JvmStatic
        fun ofConditionGroup(conditionGroup: JourneyConditionGroup) =
            JourneyConditionsField(conditionGroup = conditionGroup)

        /**
         * A nested condition group. Exactly one of `AND` or `OR` must be present at runtime; each
         * is a list of `JourneyConditionGroup` items.
         */
        @JvmStatic
        fun ofConditionNestedGroup(conditionNestedGroup: JourneyConditionNestedGroup) =
            JourneyConditionsField(conditionNestedGroup = conditionNestedGroup)
    }

    /**
     * An interface that defines how to map each variant of [JourneyConditionsField] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        /**
         * A single condition expressed as a positional tuple of strings.
         * - Binary form (3 elements): `[path, operator, value]` where `operator` is one of `is
         *   equal`, `is not equal`, `contains`, `does not contain`, `starts with`, `ends with`,
         *   `greater than`, `greater than or equal`, `less than`, `less than or equal`.
         *
         *   Example: `["user.tier", "is equal", "gold"]`.
         * - Unary form (2 elements): `[path, operator]` where `operator` is one of `exists`, `does
         *   not exist`.
         *
         *   Example: `["user.email", "exists"]`.
         *
         * The first element is a non-empty dot-path. The second element is the operator (must come
         * from one of the two operator sets above). For the binary form, the third element is the
         * comparison value (string). Runtime validation of the operator value and arity is
         * performed by the backend; SDKs surface this as a string list.
         */
        fun visitConditionAtom(conditionAtom: List<String>): T

        /**
         * A leaf condition group. Exactly one of `AND` or `OR` must be present at runtime; each is
         * a list of `JourneyConditionAtom` tuples.
         */
        fun visitConditionGroup(conditionGroup: JourneyConditionGroup): T

        /**
         * A nested condition group. Exactly one of `AND` or `OR` must be present at runtime; each
         * is a list of `JourneyConditionGroup` items.
         */
        fun visitConditionNestedGroup(conditionNestedGroup: JourneyConditionNestedGroup): T

        /**
         * Maps an unknown variant of [JourneyConditionsField] to a value of type [T].
         *
         * An instance of [JourneyConditionsField] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws CourierInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw CourierInvalidDataException("Unknown JourneyConditionsField: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<JourneyConditionsField>(JourneyConditionsField::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): JourneyConditionsField {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<JourneyConditionGroup>())?.let {
                            JourneyConditionsField(conditionGroup = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<JourneyConditionNestedGroup>())?.let {
                            JourneyConditionsField(conditionNestedGroup = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                            JourneyConditionsField(conditionAtom = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> JourneyConditionsField(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<JourneyConditionsField>(JourneyConditionsField::class) {

        override fun serialize(
            value: JourneyConditionsField,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.conditionAtom != null -> generator.writeObject(value.conditionAtom)
                value.conditionGroup != null -> generator.writeObject(value.conditionGroup)
                value.conditionNestedGroup != null ->
                    generator.writeObject(value.conditionNestedGroup)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid JourneyConditionsField")
            }
        }
    }
}

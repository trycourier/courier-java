// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.Enum
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Invoke an AI step with `user_prompt` and optional `web_search`. Returns a structured response
 * conforming to `output_schema`.
 */
class JourneyAiNode
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val outputSchema: JsonField<OutputSchema>,
    private val type: JsonField<Type>,
    private val id: JsonField<String>,
    private val conditions: JsonField<JourneyConditionsField>,
    private val model: JsonField<String>,
    private val userPrompt: JsonField<String>,
    private val webSearch: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("output_schema")
        @ExcludeMissing
        outputSchema: JsonField<OutputSchema> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conditions")
        @ExcludeMissing
        conditions: JsonField<JourneyConditionsField> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_prompt")
        @ExcludeMissing
        userPrompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("web_search") @ExcludeMissing webSearch: JsonField<Boolean> = JsonMissing.of(),
    ) : this(outputSchema, type, id, conditions, model, userPrompt, webSearch, mutableMapOf())

    /**
     * A JSONSchema object (Draft-07-compatible). Validated at runtime by Ajv.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outputSchema(): OutputSchema = outputSchema.getRequired("output_schema")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Condition spec for a journey node. Accepts a single condition atom, an AND/OR group, or an
     * AND/OR nested group. Omit the `conditions` property entirely to express "no conditions".
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conditions(): Optional<JourneyConditionsField> = conditions.getOptional("conditions")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = model.getOptional("model")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userPrompt(): Optional<String> = userPrompt.getOptional("user_prompt")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webSearch(): Optional<Boolean> = webSearch.getOptional("web_search")

    /**
     * Returns the raw JSON value of [outputSchema].
     *
     * Unlike [outputSchema], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("output_schema")
    @ExcludeMissing
    fun _outputSchema(): JsonField<OutputSchema> = outputSchema

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [conditions].
     *
     * Unlike [conditions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conditions")
    @ExcludeMissing
    fun _conditions(): JsonField<JourneyConditionsField> = conditions

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [userPrompt].
     *
     * Unlike [userPrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_prompt") @ExcludeMissing fun _userPrompt(): JsonField<String> = userPrompt

    /**
     * Returns the raw JSON value of [webSearch].
     *
     * Unlike [webSearch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("web_search") @ExcludeMissing fun _webSearch(): JsonField<Boolean> = webSearch

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
         * Returns a mutable builder for constructing an instance of [JourneyAiNode].
         *
         * The following fields are required:
         * ```java
         * .outputSchema()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JourneyAiNode]. */
    class Builder internal constructor() {

        private var outputSchema: JsonField<OutputSchema>? = null
        private var type: JsonField<Type>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var conditions: JsonField<JourneyConditionsField> = JsonMissing.of()
        private var model: JsonField<String> = JsonMissing.of()
        private var userPrompt: JsonField<String> = JsonMissing.of()
        private var webSearch: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(journeyAiNode: JourneyAiNode) = apply {
            outputSchema = journeyAiNode.outputSchema
            type = journeyAiNode.type
            id = journeyAiNode.id
            conditions = journeyAiNode.conditions
            model = journeyAiNode.model
            userPrompt = journeyAiNode.userPrompt
            webSearch = journeyAiNode.webSearch
            additionalProperties = journeyAiNode.additionalProperties.toMutableMap()
        }

        /** A JSONSchema object (Draft-07-compatible). Validated at runtime by Ajv. */
        fun outputSchema(outputSchema: OutputSchema) = outputSchema(JsonField.of(outputSchema))

        /**
         * Sets [Builder.outputSchema] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputSchema] with a well-typed [OutputSchema] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputSchema(outputSchema: JsonField<OutputSchema>) = apply {
            this.outputSchema = outputSchema
        }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Condition spec for a journey node. Accepts a single condition atom, an AND/OR group, or
         * an AND/OR nested group. Omit the `conditions` property entirely to express "no
         * conditions".
         */
        fun conditions(conditions: JourneyConditionsField) = conditions(JsonField.of(conditions))

        /**
         * Sets [Builder.conditions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conditions] with a well-typed [JourneyConditionsField]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun conditions(conditions: JsonField<JourneyConditionsField>) = apply {
            this.conditions = conditions
        }

        /**
         * Alias for calling [conditions] with
         * `JourneyConditionsField.ofConditionAtom(conditionAtom)`.
         */
        fun conditionsOfConditionAtom(conditionAtom: List<String>) =
            conditions(JourneyConditionsField.ofConditionAtom(conditionAtom))

        /**
         * Alias for calling [conditions] with
         * `JourneyConditionsField.ofConditionGroup(conditionGroup)`.
         */
        fun conditions(conditionGroup: JourneyConditionGroup) =
            conditions(JourneyConditionsField.ofConditionGroup(conditionGroup))

        /**
         * Alias for calling [conditions] with
         * `JourneyConditionsField.ofConditionNestedGroup(conditionNestedGroup)`.
         */
        fun conditions(conditionNestedGroup: JourneyConditionNestedGroup) =
            conditions(JourneyConditionsField.ofConditionNestedGroup(conditionNestedGroup))

        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        fun userPrompt(userPrompt: String) = userPrompt(JsonField.of(userPrompt))

        /**
         * Sets [Builder.userPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userPrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userPrompt(userPrompt: JsonField<String>) = apply { this.userPrompt = userPrompt }

        fun webSearch(webSearch: Boolean) = webSearch(JsonField.of(webSearch))

        /**
         * Sets [Builder.webSearch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webSearch] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webSearch(webSearch: JsonField<Boolean>) = apply { this.webSearch = webSearch }

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
         * Returns an immutable instance of [JourneyAiNode].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .outputSchema()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JourneyAiNode =
            JourneyAiNode(
                checkRequired("outputSchema", outputSchema),
                checkRequired("type", type),
                id,
                conditions,
                model,
                userPrompt,
                webSearch,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): JourneyAiNode = apply {
        if (validated) {
            return@apply
        }

        outputSchema().validate()
        type().validate()
        id()
        conditions().ifPresent { it.validate() }
        model()
        userPrompt()
        webSearch()
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
        (outputSchema.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (conditions.asKnown().getOrNull()?.validity() ?: 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (if (userPrompt.asKnown().isPresent) 1 else 0) +
            (if (webSearch.asKnown().isPresent) 1 else 0)

    /** A JSONSchema object (Draft-07-compatible). Validated at runtime by Ajv. */
    class OutputSchema
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [OutputSchema]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OutputSchema]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(outputSchema: OutputSchema) = apply {
                additionalProperties = outputSchema.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [OutputSchema].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OutputSchema = OutputSchema(additionalProperties.toImmutable())
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
        fun validate(): OutputSchema = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OutputSchema && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "OutputSchema{additionalProperties=$additionalProperties}"
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AI = of("ai")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            AI
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AI,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AI -> Value.AI
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws CourierInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AI -> Known.AI
                else -> throw CourierInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws CourierInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { CourierInvalidDataException("Value is not a String") }

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
        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JourneyAiNode &&
            outputSchema == other.outputSchema &&
            type == other.type &&
            id == other.id &&
            conditions == other.conditions &&
            model == other.model &&
            userPrompt == other.userPrompt &&
            webSearch == other.webSearch &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            outputSchema,
            type,
            id,
            conditions,
            model,
            userPrompt,
            webSearch,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JourneyAiNode{outputSchema=$outputSchema, type=$type, id=$id, conditions=$conditions, model=$model, userPrompt=$userPrompt, webSearch=$webSearch, additionalProperties=$additionalProperties}"
}

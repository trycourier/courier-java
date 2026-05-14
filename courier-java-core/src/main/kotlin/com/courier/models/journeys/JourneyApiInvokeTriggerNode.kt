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

class JourneyApiInvokeTriggerNode
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val triggerType: JsonField<TriggerType>,
    private val type: JsonField<Type>,
    private val id: JsonField<String>,
    private val conditions: JsonField<JourneyConditionsField>,
    private val schema: JsonField<Schema>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("trigger_type")
        @ExcludeMissing
        triggerType: JsonField<TriggerType> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conditions")
        @ExcludeMissing
        conditions: JsonField<JourneyConditionsField> = JsonMissing.of(),
        @JsonProperty("schema") @ExcludeMissing schema: JsonField<Schema> = JsonMissing.of(),
    ) : this(triggerType, type, id, conditions, schema, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun triggerType(): TriggerType = triggerType.getRequired("trigger_type")

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
     * A JSONSchema object (Draft-07-compatible). Validated at runtime by Ajv.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun schema(): Optional<Schema> = schema.getOptional("schema")

    /**
     * Returns the raw JSON value of [triggerType].
     *
     * Unlike [triggerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trigger_type")
    @ExcludeMissing
    fun _triggerType(): JsonField<TriggerType> = triggerType

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
     * Returns the raw JSON value of [schema].
     *
     * Unlike [schema], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("schema") @ExcludeMissing fun _schema(): JsonField<Schema> = schema

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
         * Returns a mutable builder for constructing an instance of [JourneyApiInvokeTriggerNode].
         *
         * The following fields are required:
         * ```java
         * .triggerType()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JourneyApiInvokeTriggerNode]. */
    class Builder internal constructor() {

        private var triggerType: JsonField<TriggerType>? = null
        private var type: JsonField<Type>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var conditions: JsonField<JourneyConditionsField> = JsonMissing.of()
        private var schema: JsonField<Schema> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(journeyApiInvokeTriggerNode: JourneyApiInvokeTriggerNode) = apply {
            triggerType = journeyApiInvokeTriggerNode.triggerType
            type = journeyApiInvokeTriggerNode.type
            id = journeyApiInvokeTriggerNode.id
            conditions = journeyApiInvokeTriggerNode.conditions
            schema = journeyApiInvokeTriggerNode.schema
            additionalProperties = journeyApiInvokeTriggerNode.additionalProperties.toMutableMap()
        }

        fun triggerType(triggerType: TriggerType) = triggerType(JsonField.of(triggerType))

        /**
         * Sets [Builder.triggerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggerType] with a well-typed [TriggerType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun triggerType(triggerType: JsonField<TriggerType>) = apply {
            this.triggerType = triggerType
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

        /** A JSONSchema object (Draft-07-compatible). Validated at runtime by Ajv. */
        fun schema(schema: Schema) = schema(JsonField.of(schema))

        /**
         * Sets [Builder.schema] to an arbitrary JSON value.
         *
         * You should usually call [Builder.schema] with a well-typed [Schema] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun schema(schema: JsonField<Schema>) = apply { this.schema = schema }

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
         * Returns an immutable instance of [JourneyApiInvokeTriggerNode].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .triggerType()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JourneyApiInvokeTriggerNode =
            JourneyApiInvokeTriggerNode(
                checkRequired("triggerType", triggerType),
                checkRequired("type", type),
                id,
                conditions,
                schema,
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
    fun validate(): JourneyApiInvokeTriggerNode = apply {
        if (validated) {
            return@apply
        }

        triggerType().validate()
        type().validate()
        id()
        conditions().ifPresent { it.validate() }
        schema().ifPresent { it.validate() }
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
        (triggerType.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (conditions.asKnown().getOrNull()?.validity() ?: 0) +
            (schema.asKnown().getOrNull()?.validity() ?: 0)

    class TriggerType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val API_INVOKE = of("api-invoke")

            @JvmStatic fun of(value: String) = TriggerType(JsonField.of(value))
        }

        /** An enum containing [TriggerType]'s known values. */
        enum class Known {
            API_INVOKE
        }

        /**
         * An enum containing [TriggerType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TriggerType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            API_INVOKE,
            /**
             * An enum member indicating that [TriggerType] was instantiated with an unknown value.
             */
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
                API_INVOKE -> Value.API_INVOKE
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
                API_INVOKE -> Known.API_INVOKE
                else -> throw CourierInvalidDataException("Unknown TriggerType: $value")
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
        fun validate(): TriggerType = apply {
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

            return other is TriggerType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

            @JvmField val TRIGGER = of("trigger")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            TRIGGER
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
            TRIGGER,
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
                TRIGGER -> Value.TRIGGER
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
                TRIGGER -> Known.TRIGGER
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

    /** A JSONSchema object (Draft-07-compatible). Validated at runtime by Ajv. */
    class Schema
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

            /** Returns a mutable builder for constructing an instance of [Schema]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Schema]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(schema: Schema) = apply {
                additionalProperties = schema.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Schema].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Schema = Schema(additionalProperties.toImmutable())
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
        fun validate(): Schema = apply {
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

            return other is Schema && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Schema{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JourneyApiInvokeTriggerNode &&
            triggerType == other.triggerType &&
            type == other.type &&
            id == other.id &&
            conditions == other.conditions &&
            schema == other.schema &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(triggerType, type, id, conditions, schema, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JourneyApiInvokeTriggerNode{triggerType=$triggerType, type=$type, id=$id, conditions=$conditions, schema=$schema, additionalProperties=$additionalProperties}"
}

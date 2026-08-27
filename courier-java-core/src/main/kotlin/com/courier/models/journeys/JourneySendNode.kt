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
 * Send to the recipient. A send node sources its content from EXACTLY ONE of `message.template` (a
 * single notification template) or `experiment` (an A/B split across weighted template variants) —
 * supplying both, or neither, is rejected. Optionally override the recipient address, send as a
 * tenant, delay the send, or attach `data`.
 */
class JourneySendNode
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val message: JsonField<Message>,
    private val type: JsonField<Type>,
    private val id: JsonField<String>,
    private val conditions: JsonField<JourneyConditionsField>,
    private val experiment: JsonField<JourneyExperiment>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("message") @ExcludeMissing message: JsonField<Message> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("conditions")
        @ExcludeMissing
        conditions: JsonField<JourneyConditionsField> = JsonMissing.of(),
        @JsonProperty("experiment")
        @ExcludeMissing
        experiment: JsonField<JourneyExperiment> = JsonMissing.of(),
    ) : this(message, type, id, conditions, experiment, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): Message = message.getRequired("message")

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
     * A/B experiment config for a send node. The recipient is deterministically bucketed by
     * `bucketingKey` and routed to one of the `variants` in proportion to its `weight`. Present on
     * a send node INSTEAD OF `message.template`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun experiment(): Optional<JourneyExperiment> = experiment.getOptional("experiment")

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<Message> = message

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
     * Returns the raw JSON value of [experiment].
     *
     * Unlike [experiment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("experiment")
    @ExcludeMissing
    fun _experiment(): JsonField<JourneyExperiment> = experiment

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
         * Returns a mutable builder for constructing an instance of [JourneySendNode].
         *
         * The following fields are required:
         * ```java
         * .message()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JourneySendNode]. */
    class Builder internal constructor() {

        private var message: JsonField<Message>? = null
        private var type: JsonField<Type>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var conditions: JsonField<JourneyConditionsField> = JsonMissing.of()
        private var experiment: JsonField<JourneyExperiment> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(journeySendNode: JourneySendNode) = apply {
            message = journeySendNode.message
            type = journeySendNode.type
            id = journeySendNode.id
            conditions = journeySendNode.conditions
            experiment = journeySendNode.experiment
            additionalProperties = journeySendNode.additionalProperties.toMutableMap()
        }

        fun message(message: Message) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [Message] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<Message>) = apply { this.message = message }

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

        /**
         * A/B experiment config for a send node. The recipient is deterministically bucketed by
         * `bucketingKey` and routed to one of the `variants` in proportion to its `weight`. Present
         * on a send node INSTEAD OF `message.template`.
         */
        fun experiment(experiment: JourneyExperiment) = experiment(JsonField.of(experiment))

        /**
         * Sets [Builder.experiment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.experiment] with a well-typed [JourneyExperiment] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun experiment(experiment: JsonField<JourneyExperiment>) = apply {
            this.experiment = experiment
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
         * Returns an immutable instance of [JourneySendNode].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .message()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JourneySendNode =
            JourneySendNode(
                checkRequired("message", message),
                checkRequired("type", type),
                id,
                conditions,
                experiment,
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
    fun validate(): JourneySendNode = apply {
        if (validated) {
            return@apply
        }

        message().validate()
        type().validate()
        id()
        conditions().ifPresent { it.validate() }
        experiment().ifPresent { it.validate() }
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
        (message.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (conditions.asKnown().getOrNull()?.validity() ?: 0) +
            (experiment.asKnown().getOrNull()?.validity() ?: 0)

    class Message
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val context: JsonField<Context>,
        private val data: JsonField<Data>,
        private val delay: JsonField<Delay>,
        private val template: JsonField<String>,
        private val to: JsonField<To>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("context") @ExcludeMissing context: JsonField<Context> = JsonMissing.of(),
            @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
            @JsonProperty("delay") @ExcludeMissing delay: JsonField<Delay> = JsonMissing.of(),
            @JsonProperty("template")
            @ExcludeMissing
            template: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<To> = JsonMissing.of(),
        ) : this(context, data, delay, template, to, mutableMapOf())

        /**
         * Tenant context for this send. Set it to deliver on behalf of one of your customers, so
         * the message uses that tenant's brand and settings.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun context(): Optional<Context> = context.getOptional("context")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun data(): Optional<Data> = data.getOptional("data")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun delay(): Optional<Delay> = delay.getOptional("delay")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun template(): Optional<String> = template.getOptional("template")

        /**
         * Recipient override for this send. Provide exactly one of `email_override`,
         * `phone_number_override`, `user_id_override`, `slack`, or `ms_teams` — not a combination.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun to(): Optional<To> = to.getOptional("to")

        /**
         * Returns the raw JSON value of [context].
         *
         * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<Context> = context

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

        /**
         * Returns the raw JSON value of [delay].
         *
         * Unlike [delay], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("delay") @ExcludeMissing fun _delay(): JsonField<Delay> = delay

        /**
         * Returns the raw JSON value of [template].
         *
         * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("template") @ExcludeMissing fun _template(): JsonField<String> = template

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<To> = to

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

            /** Returns a mutable builder for constructing an instance of [Message]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Message]. */
        class Builder internal constructor() {

            private var context: JsonField<Context> = JsonMissing.of()
            private var data: JsonField<Data> = JsonMissing.of()
            private var delay: JsonField<Delay> = JsonMissing.of()
            private var template: JsonField<String> = JsonMissing.of()
            private var to: JsonField<To> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(message: Message) = apply {
                context = message.context
                data = message.data
                delay = message.delay
                template = message.template
                to = message.to
                additionalProperties = message.additionalProperties.toMutableMap()
            }

            /**
             * Tenant context for this send. Set it to deliver on behalf of one of your customers,
             * so the message uses that tenant's brand and settings.
             */
            fun context(context: Context) = context(JsonField.of(context))

            /**
             * Sets [Builder.context] to an arbitrary JSON value.
             *
             * You should usually call [Builder.context] with a well-typed [Context] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun context(context: JsonField<Context>) = apply { this.context = context }

            fun data(data: Data) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed [Data] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun data(data: JsonField<Data>) = apply { this.data = data }

            fun delay(delay: Delay) = delay(JsonField.of(delay))

            /**
             * Sets [Builder.delay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.delay] with a well-typed [Delay] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun delay(delay: JsonField<Delay>) = apply { this.delay = delay }

            fun template(template: String) = template(JsonField.of(template))

            /**
             * Sets [Builder.template] to an arbitrary JSON value.
             *
             * You should usually call [Builder.template] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun template(template: JsonField<String>) = apply { this.template = template }

            /**
             * Recipient override for this send. Provide exactly one of `email_override`,
             * `phone_number_override`, `user_id_override`, `slack`, or `ms_teams` — not a
             * combination.
             */
            fun to(to: To) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [To] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<To>) = apply { this.to = to }

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
             * Returns an immutable instance of [Message].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Message =
                Message(context, data, delay, template, to, additionalProperties.toMutableMap())
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
        fun validate(): Message = apply {
            if (validated) {
                return@apply
            }

            context().ifPresent { it.validate() }
            data().ifPresent { it.validate() }
            delay().ifPresent { it.validate() }
            template()
            to().ifPresent { it.validate() }
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
            (context.asKnown().getOrNull()?.validity() ?: 0) +
                (data.asKnown().getOrNull()?.validity() ?: 0) +
                (delay.asKnown().getOrNull()?.validity() ?: 0) +
                (if (template.asKnown().isPresent) 1 else 0) +
                (to.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Tenant context for this send. Set it to deliver on behalf of one of your customers, so
         * the message uses that tenant's brand and settings.
         */
        class Context
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val tenantId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("tenant_id")
                @ExcludeMissing
                tenantId: JsonField<String> = JsonMissing.of()
            ) : this(tenantId, mutableMapOf())

            /**
             * The tenant to send as. Accepts either a literal tenant id (`acme-tenant`) or a
             * whole-string mustache reference to a value the run already holds —
             * `{{data.tenant_id}}` from the invocation payload, or `{{f1.body.tenant_id}}` from the
             * response of an earlier fetch node with id `f1`. A reference is resolved separately on
             * every run, so a single journey can deliver as many tenants. Two forms are rejected
             * with `400`: mid-string interpolation such as `tenant-{{data.region}}`, and any value
             * beginning with `refs.`, which is reserved for internal use. A reference that resolves
             * to nothing at run time does not stop the run — the message is still sent, with no
             * tenant context — so make sure the referenced value is always present. `GET` returns
             * the value in the same form it was supplied.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tenantId(): String = tenantId.getRequired("tenant_id")

            /**
             * Returns the raw JSON value of [tenantId].
             *
             * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

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
                 * Returns a mutable builder for constructing an instance of [Context].
                 *
                 * The following fields are required:
                 * ```java
                 * .tenantId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Context]. */
            class Builder internal constructor() {

                private var tenantId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(context: Context) = apply {
                    tenantId = context.tenantId
                    additionalProperties = context.additionalProperties.toMutableMap()
                }

                /**
                 * The tenant to send as. Accepts either a literal tenant id (`acme-tenant`) or a
                 * whole-string mustache reference to a value the run already holds —
                 * `{{data.tenant_id}}` from the invocation payload, or `{{f1.body.tenant_id}}` from
                 * the response of an earlier fetch node with id `f1`. A reference is resolved
                 * separately on every run, so a single journey can deliver as many tenants. Two
                 * forms are rejected with `400`: mid-string interpolation such as
                 * `tenant-{{data.region}}`, and any value beginning with `refs.`, which is reserved
                 * for internal use. A reference that resolves to nothing at run time does not stop
                 * the run — the message is still sent, with no tenant context — so make sure the
                 * referenced value is always present. `GET` returns the value in the same form it
                 * was supplied.
                 */
                fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

                /**
                 * Sets [Builder.tenantId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tenantId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Context].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .tenantId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Context =
                    Context(
                        checkRequired("tenantId", tenantId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Context = apply {
                if (validated) {
                    return@apply
                }

                tenantId()
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
            internal fun validity(): Int = (if (tenantId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Context &&
                    tenantId == other.tenantId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(tenantId, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Context{tenantId=$tenantId, additionalProperties=$additionalProperties}"
        }

        class Data
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

                /** Returns a mutable builder for constructing an instance of [Data]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Data]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(data: Data) = apply {
                    additionalProperties = data.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Data].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Data = Data(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Data = apply {
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

                return other is Data && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Data{additionalProperties=$additionalProperties}"
        }

        class Delay
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val until: JsonField<String>,
            private val timezone: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("until") @ExcludeMissing until: JsonField<String> = JsonMissing.of(),
                @JsonProperty("timezone")
                @ExcludeMissing
                timezone: JsonField<String> = JsonMissing.of(),
            ) : this(until, timezone, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun until(): String = until.getRequired("until")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun timezone(): Optional<String> = timezone.getOptional("timezone")

            /**
             * Returns the raw JSON value of [until].
             *
             * Unlike [until], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("until") @ExcludeMissing fun _until(): JsonField<String> = until

            /**
             * Returns the raw JSON value of [timezone].
             *
             * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

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
                 * Returns a mutable builder for constructing an instance of [Delay].
                 *
                 * The following fields are required:
                 * ```java
                 * .until()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Delay]. */
            class Builder internal constructor() {

                private var until: JsonField<String>? = null
                private var timezone: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(delay: Delay) = apply {
                    until = delay.until
                    timezone = delay.timezone
                    additionalProperties = delay.additionalProperties.toMutableMap()
                }

                fun until(until: String) = until(JsonField.of(until))

                /**
                 * Sets [Builder.until] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.until] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun until(until: JsonField<String>) = apply { this.until = until }

                fun timezone(timezone: String) = timezone(JsonField.of(timezone))

                /**
                 * Sets [Builder.timezone] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timezone] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Delay].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .until()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Delay =
                    Delay(
                        checkRequired("until", until),
                        timezone,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Delay = apply {
                if (validated) {
                    return@apply
                }

                until()
                timezone()
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
                (if (until.asKnown().isPresent) 1 else 0) +
                    (if (timezone.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Delay &&
                    until == other.until &&
                    timezone == other.timezone &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(until, timezone, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Delay{until=$until, timezone=$timezone, additionalProperties=$additionalProperties}"
        }

        /**
         * Recipient override for this send. Provide exactly one of `email_override`,
         * `phone_number_override`, `user_id_override`, `slack`, or `ms_teams` — not a combination.
         */
        class To
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val emailOverride: JsonField<String>,
            private val msTeams: JsonField<JourneySendNodeToMsTeams>,
            private val phoneNumberOverride: JsonField<String>,
            private val slack: JsonField<JourneySendNodeToSlack>,
            private val userIdOverride: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("email_override")
                @ExcludeMissing
                emailOverride: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ms_teams")
                @ExcludeMissing
                msTeams: JsonField<JourneySendNodeToMsTeams> = JsonMissing.of(),
                @JsonProperty("phone_number_override")
                @ExcludeMissing
                phoneNumberOverride: JsonField<String> = JsonMissing.of(),
                @JsonProperty("slack")
                @ExcludeMissing
                slack: JsonField<JourneySendNodeToSlack> = JsonMissing.of(),
                @JsonProperty("user_id_override")
                @ExcludeMissing
                userIdOverride: JsonField<String> = JsonMissing.of(),
            ) : this(
                emailOverride,
                msTeams,
                phoneNumberOverride,
                slack,
                userIdOverride,
                mutableMapOf(),
            )

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun emailOverride(): Optional<String> = emailOverride.getOptional("email_override")

            /**
             * Send to a Microsoft Teams address directly, bypassing the recipient's stored profile.
             * Requires exactly one target: `channel_id`, `channel_name` (with `team_id`),
             * `user_id`, or `email`. `channel_name`, `user_id`, and `email` also need at least one
             * of `service_url` or `tenant_id` — if you provide both, they must agree. `channel_id`
             * doesn't require tenant context to publish, but provide `service_url` or `tenant_id`
             * anyway: sends without either have failed at delivery in testing. `conversation_id`
             * and `reply_to_activity_id`, available on the send API's `MsTeams` profile, aren't
             * supported here yet.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun msTeams(): Optional<JourneySendNodeToMsTeams> = msTeams.getOptional("ms_teams")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun phoneNumberOverride(): Optional<String> =
                phoneNumberOverride.getOptional("phone_number_override")

            /**
             * Send to a Slack address directly, bypassing the recipient's stored profile. Requires
             * exactly one of `channel`, `user_id`, or `email`.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun slack(): Optional<JourneySendNodeToSlack> = slack.getOptional("slack")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun userIdOverride(): Optional<String> = userIdOverride.getOptional("user_id_override")

            /**
             * Returns the raw JSON value of [emailOverride].
             *
             * Unlike [emailOverride], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("email_override")
            @ExcludeMissing
            fun _emailOverride(): JsonField<String> = emailOverride

            /**
             * Returns the raw JSON value of [msTeams].
             *
             * Unlike [msTeams], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ms_teams")
            @ExcludeMissing
            fun _msTeams(): JsonField<JourneySendNodeToMsTeams> = msTeams

            /**
             * Returns the raw JSON value of [phoneNumberOverride].
             *
             * Unlike [phoneNumberOverride], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("phone_number_override")
            @ExcludeMissing
            fun _phoneNumberOverride(): JsonField<String> = phoneNumberOverride

            /**
             * Returns the raw JSON value of [slack].
             *
             * Unlike [slack], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("slack")
            @ExcludeMissing
            fun _slack(): JsonField<JourneySendNodeToSlack> = slack

            /**
             * Returns the raw JSON value of [userIdOverride].
             *
             * Unlike [userIdOverride], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("user_id_override")
            @ExcludeMissing
            fun _userIdOverride(): JsonField<String> = userIdOverride

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

                /** Returns a mutable builder for constructing an instance of [To]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [To]. */
            class Builder internal constructor() {

                private var emailOverride: JsonField<String> = JsonMissing.of()
                private var msTeams: JsonField<JourneySendNodeToMsTeams> = JsonMissing.of()
                private var phoneNumberOverride: JsonField<String> = JsonMissing.of()
                private var slack: JsonField<JourneySendNodeToSlack> = JsonMissing.of()
                private var userIdOverride: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(to: To) = apply {
                    emailOverride = to.emailOverride
                    msTeams = to.msTeams
                    phoneNumberOverride = to.phoneNumberOverride
                    slack = to.slack
                    userIdOverride = to.userIdOverride
                    additionalProperties = to.additionalProperties.toMutableMap()
                }

                fun emailOverride(emailOverride: String) =
                    emailOverride(JsonField.of(emailOverride))

                /**
                 * Sets [Builder.emailOverride] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.emailOverride] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun emailOverride(emailOverride: JsonField<String>) = apply {
                    this.emailOverride = emailOverride
                }

                /**
                 * Send to a Microsoft Teams address directly, bypassing the recipient's stored
                 * profile. Requires exactly one target: `channel_id`, `channel_name` (with
                 * `team_id`), `user_id`, or `email`. `channel_name`, `user_id`, and `email` also
                 * need at least one of `service_url` or `tenant_id` — if you provide both, they
                 * must agree. `channel_id` doesn't require tenant context to publish, but provide
                 * `service_url` or `tenant_id` anyway: sends without either have failed at delivery
                 * in testing. `conversation_id` and `reply_to_activity_id`, available on the send
                 * API's `MsTeams` profile, aren't supported here yet.
                 */
                fun msTeams(msTeams: JourneySendNodeToMsTeams) = msTeams(JsonField.of(msTeams))

                /**
                 * Sets [Builder.msTeams] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.msTeams] with a well-typed
                 * [JourneySendNodeToMsTeams] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun msTeams(msTeams: JsonField<JourneySendNodeToMsTeams>) = apply {
                    this.msTeams = msTeams
                }

                fun phoneNumberOverride(phoneNumberOverride: String) =
                    phoneNumberOverride(JsonField.of(phoneNumberOverride))

                /**
                 * Sets [Builder.phoneNumberOverride] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumberOverride] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun phoneNumberOverride(phoneNumberOverride: JsonField<String>) = apply {
                    this.phoneNumberOverride = phoneNumberOverride
                }

                /**
                 * Send to a Slack address directly, bypassing the recipient's stored profile.
                 * Requires exactly one of `channel`, `user_id`, or `email`.
                 */
                fun slack(slack: JourneySendNodeToSlack) = slack(JsonField.of(slack))

                /**
                 * Sets [Builder.slack] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.slack] with a well-typed
                 * [JourneySendNodeToSlack] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun slack(slack: JsonField<JourneySendNodeToSlack>) = apply { this.slack = slack }

                /** Alias for calling [slack] with `JourneySendNodeToSlack.ofChannel(channel)`. */
                fun slack(channel: JourneySendNodeToSlackChannel) =
                    slack(JourneySendNodeToSlack.ofChannel(channel))

                /** Alias for calling [slack] with `JourneySendNodeToSlack.ofUserId(userId)`. */
                fun slack(userId: JourneySendNodeToSlackUserId) =
                    slack(JourneySendNodeToSlack.ofUserId(userId))

                /** Alias for calling [slack] with `JourneySendNodeToSlack.ofEmail(email)`. */
                fun slack(email: JourneySendNodeToSlackEmail) =
                    slack(JourneySendNodeToSlack.ofEmail(email))

                fun userIdOverride(userIdOverride: String) =
                    userIdOverride(JsonField.of(userIdOverride))

                /**
                 * Sets [Builder.userIdOverride] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userIdOverride] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userIdOverride(userIdOverride: JsonField<String>) = apply {
                    this.userIdOverride = userIdOverride
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [To].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): To =
                    To(
                        emailOverride,
                        msTeams,
                        phoneNumberOverride,
                        slack,
                        userIdOverride,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): To = apply {
                if (validated) {
                    return@apply
                }

                emailOverride()
                msTeams().ifPresent { it.validate() }
                phoneNumberOverride()
                slack().ifPresent { it.validate() }
                userIdOverride()
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
                (if (emailOverride.asKnown().isPresent) 1 else 0) +
                    (msTeams.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (phoneNumberOverride.asKnown().isPresent) 1 else 0) +
                    (slack.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (userIdOverride.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is To &&
                    emailOverride == other.emailOverride &&
                    msTeams == other.msTeams &&
                    phoneNumberOverride == other.phoneNumberOverride &&
                    slack == other.slack &&
                    userIdOverride == other.userIdOverride &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    emailOverride,
                    msTeams,
                    phoneNumberOverride,
                    slack,
                    userIdOverride,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "To{emailOverride=$emailOverride, msTeams=$msTeams, phoneNumberOverride=$phoneNumberOverride, slack=$slack, userIdOverride=$userIdOverride, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Message &&
                context == other.context &&
                data == other.data &&
                delay == other.delay &&
                template == other.template &&
                to == other.to &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(context, data, delay, template, to, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Message{context=$context, data=$data, delay=$delay, template=$template, to=$to, additionalProperties=$additionalProperties}"
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

            @JvmField val SEND = of("send")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            SEND
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
            SEND,
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
                SEND -> Value.SEND
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
                SEND -> Known.SEND
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

        return other is JourneySendNode &&
            message == other.message &&
            type == other.type &&
            id == other.id &&
            conditions == other.conditions &&
            experiment == other.experiment &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(message, type, id, conditions, experiment, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JourneySendNode{message=$message, type=$type, id=$id, conditions=$conditions, experiment=$experiment, additionalProperties=$additionalProperties}"
}

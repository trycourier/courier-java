// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.auditevents

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.checkRequired
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AuditEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val auditEventId: JsonField<String>,
    private val source: JsonField<String>,
    private val timestamp: JsonField<String>,
    private val type: JsonField<String>,
    private val actor: JsonField<Actor>,
    private val target: JsonField<Target>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("auditEventId")
        @ExcludeMissing
        auditEventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestamp") @ExcludeMissing timestamp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actor") @ExcludeMissing actor: JsonField<Actor> = JsonMissing.of(),
        @JsonProperty("target") @ExcludeMissing target: JsonField<Target> = JsonMissing.of(),
    ) : this(auditEventId, source, timestamp, type, actor, target, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun auditEventId(): String = auditEventId.getRequired("auditEventId")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): String = timestamp.getRequired("timestamp")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actor(): Optional<Actor> = actor.getOptional("actor")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun target(): Optional<Target> = target.getOptional("target")

    /**
     * Returns the raw JSON value of [auditEventId].
     *
     * Unlike [auditEventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auditEventId")
    @ExcludeMissing
    fun _auditEventId(): JsonField<String> = auditEventId

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<String> = timestamp

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [actor].
     *
     * Unlike [actor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actor") @ExcludeMissing fun _actor(): JsonField<Actor> = actor

    /**
     * Returns the raw JSON value of [target].
     *
     * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Target> = target

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
         * Returns a mutable builder for constructing an instance of [AuditEvent].
         *
         * The following fields are required:
         * ```java
         * .auditEventId()
         * .source()
         * .timestamp()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuditEvent]. */
    class Builder internal constructor() {

        private var auditEventId: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var timestamp: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var actor: JsonField<Actor> = JsonMissing.of()
        private var target: JsonField<Target> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(auditEvent: AuditEvent) = apply {
            auditEventId = auditEvent.auditEventId
            source = auditEvent.source
            timestamp = auditEvent.timestamp
            type = auditEvent.type
            actor = auditEvent.actor
            target = auditEvent.target
            additionalProperties = auditEvent.additionalProperties.toMutableMap()
        }

        fun auditEventId(auditEventId: String) = auditEventId(JsonField.of(auditEventId))

        /**
         * Sets [Builder.auditEventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.auditEventId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun auditEventId(auditEventId: JsonField<String>) = apply {
            this.auditEventId = auditEventId
        }

        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        fun timestamp(timestamp: String) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timestamp(timestamp: JsonField<String>) = apply { this.timestamp = timestamp }

        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        fun actor(actor: Actor?) = actor(JsonField.ofNullable(actor))

        /** Alias for calling [Builder.actor] with `actor.orElse(null)`. */
        fun actor(actor: Optional<Actor>) = actor(actor.getOrNull())

        /**
         * Sets [Builder.actor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actor] with a well-typed [Actor] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actor(actor: JsonField<Actor>) = apply { this.actor = actor }

        fun target(target: Target?) = target(JsonField.ofNullable(target))

        /** Alias for calling [Builder.target] with `target.orElse(null)`. */
        fun target(target: Optional<Target>) = target(target.getOrNull())

        /**
         * Sets [Builder.target] to an arbitrary JSON value.
         *
         * You should usually call [Builder.target] with a well-typed [Target] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun target(target: JsonField<Target>) = apply { this.target = target }

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
         * Returns an immutable instance of [AuditEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .auditEventId()
         * .source()
         * .timestamp()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuditEvent =
            AuditEvent(
                checkRequired("auditEventId", auditEventId),
                checkRequired("source", source),
                checkRequired("timestamp", timestamp),
                checkRequired("type", type),
                actor,
                target,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AuditEvent = apply {
        if (validated) {
            return@apply
        }

        auditEventId()
        source()
        timestamp()
        type()
        actor().ifPresent { it.validate() }
        target().ifPresent { it.validate() }
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
        (if (auditEventId.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (actor.asKnown().getOrNull()?.validity() ?: 0) +
            (target.asKnown().getOrNull()?.validity() ?: 0)

    class Actor
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val email: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        ) : this(id, email, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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

            /** Returns a mutable builder for constructing an instance of [Actor]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Actor]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(actor: Actor) = apply {
                id = actor.id
                email = actor.email
                additionalProperties = actor.additionalProperties.toMutableMap()
            }

            fun id(id: String?) = id(JsonField.ofNullable(id))

            /** Alias for calling [Builder.id] with `id.orElse(null)`. */
            fun id(id: Optional<String>) = id(id.getOrNull())

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun email(email: String?) = email(JsonField.ofNullable(email))

            /** Alias for calling [Builder.email] with `email.orElse(null)`. */
            fun email(email: Optional<String>) = email(email.getOrNull())

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

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
             * Returns an immutable instance of [Actor].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Actor = Actor(id, email, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Actor = apply {
            if (validated) {
                return@apply
            }

            id()
            email()
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
            (if (id.asKnown().isPresent) 1 else 0) + (if (email.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Actor &&
                id == other.id &&
                email == other.email &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, email, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Actor{id=$id, email=$email, additionalProperties=$additionalProperties}"
    }

    class Target
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val email: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        ) : this(id, email, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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

            /** Returns a mutable builder for constructing an instance of [Target]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Target]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(target: Target) = apply {
                id = target.id
                email = target.email
                additionalProperties = target.additionalProperties.toMutableMap()
            }

            fun id(id: String?) = id(JsonField.ofNullable(id))

            /** Alias for calling [Builder.id] with `id.orElse(null)`. */
            fun id(id: Optional<String>) = id(id.getOrNull())

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun email(email: String?) = email(JsonField.ofNullable(email))

            /** Alias for calling [Builder.email] with `email.orElse(null)`. */
            fun email(email: Optional<String>) = email(email.getOrNull())

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

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
             * Returns an immutable instance of [Target].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Target = Target(id, email, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Target = apply {
            if (validated) {
                return@apply
            }

            id()
            email()
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
            (if (id.asKnown().isPresent) 1 else 0) + (if (email.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Target &&
                id == other.id &&
                email == other.email &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, email, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Target{id=$id, email=$email, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuditEvent &&
            auditEventId == other.auditEventId &&
            source == other.source &&
            timestamp == other.timestamp &&
            type == other.type &&
            actor == other.actor &&
            target == other.target &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(auditEventId, source, timestamp, type, actor, target, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuditEvent{auditEventId=$auditEventId, source=$source, timestamp=$timestamp, type=$type, actor=$actor, target=$target, additionalProperties=$additionalProperties}"
}

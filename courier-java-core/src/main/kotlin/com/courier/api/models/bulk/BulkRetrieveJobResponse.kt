// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.bulk

import com.courier.api.core.Enum
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
import kotlin.jvm.optionals.getOrNull

class BulkRetrieveJobResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val job: JsonField<Job>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("job") @ExcludeMissing job: JsonField<Job> = JsonMissing.of()
    ) : this(job, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun job(): Job = job.getRequired("job")

    /**
     * Returns the raw JSON value of [job].
     *
     * Unlike [job], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job") @ExcludeMissing fun _job(): JsonField<Job> = job

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
         * Returns a mutable builder for constructing an instance of [BulkRetrieveJobResponse].
         *
         * The following fields are required:
         * ```java
         * .job()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BulkRetrieveJobResponse]. */
    class Builder internal constructor() {

        private var job: JsonField<Job>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bulkRetrieveJobResponse: BulkRetrieveJobResponse) = apply {
            job = bulkRetrieveJobResponse.job
            additionalProperties = bulkRetrieveJobResponse.additionalProperties.toMutableMap()
        }

        fun job(job: Job) = job(JsonField.of(job))

        /**
         * Sets [Builder.job] to an arbitrary JSON value.
         *
         * You should usually call [Builder.job] with a well-typed [Job] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun job(job: JsonField<Job>) = apply { this.job = job }

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
         * Returns an immutable instance of [BulkRetrieveJobResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .job()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BulkRetrieveJobResponse =
            BulkRetrieveJobResponse(checkRequired("job", job), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): BulkRetrieveJobResponse = apply {
        if (validated) {
            return@apply
        }

        job().validate()
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
    @JvmSynthetic internal fun validity(): Int = (job.asKnown().getOrNull()?.validity() ?: 0)

    class Job
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val definition: JsonField<InboundBulkMessage>,
        private val enqueued: JsonField<Long>,
        private val failures: JsonField<Long>,
        private val received: JsonField<Long>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("definition")
            @ExcludeMissing
            definition: JsonField<InboundBulkMessage> = JsonMissing.of(),
            @JsonProperty("enqueued") @ExcludeMissing enqueued: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("failures") @ExcludeMissing failures: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("received") @ExcludeMissing received: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(definition, enqueued, failures, received, status, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun definition(): InboundBulkMessage = definition.getRequired("definition")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun enqueued(): Long = enqueued.getRequired("enqueued")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun failures(): Long = failures.getRequired("failures")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun received(): Long = received.getRequired("received")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Returns the raw JSON value of [definition].
         *
         * Unlike [definition], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("definition")
        @ExcludeMissing
        fun _definition(): JsonField<InboundBulkMessage> = definition

        /**
         * Returns the raw JSON value of [enqueued].
         *
         * Unlike [enqueued], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enqueued") @ExcludeMissing fun _enqueued(): JsonField<Long> = enqueued

        /**
         * Returns the raw JSON value of [failures].
         *
         * Unlike [failures], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("failures") @ExcludeMissing fun _failures(): JsonField<Long> = failures

        /**
         * Returns the raw JSON value of [received].
         *
         * Unlike [received], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("received") @ExcludeMissing fun _received(): JsonField<Long> = received

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
             * Returns a mutable builder for constructing an instance of [Job].
             *
             * The following fields are required:
             * ```java
             * .definition()
             * .enqueued()
             * .failures()
             * .received()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Job]. */
        class Builder internal constructor() {

            private var definition: JsonField<InboundBulkMessage>? = null
            private var enqueued: JsonField<Long>? = null
            private var failures: JsonField<Long>? = null
            private var received: JsonField<Long>? = null
            private var status: JsonField<Status>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(job: Job) = apply {
                definition = job.definition
                enqueued = job.enqueued
                failures = job.failures
                received = job.received
                status = job.status
                additionalProperties = job.additionalProperties.toMutableMap()
            }

            fun definition(definition: InboundBulkMessage) = definition(JsonField.of(definition))

            /**
             * Sets [Builder.definition] to an arbitrary JSON value.
             *
             * You should usually call [Builder.definition] with a well-typed [InboundBulkMessage]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun definition(definition: JsonField<InboundBulkMessage>) = apply {
                this.definition = definition
            }

            /** Alias for calling [definition] with `InboundBulkMessage.ofTemplate(template)`. */
            fun definition(template: InboundBulkMessage.InboundBulkTemplateMessage) =
                definition(InboundBulkMessage.ofTemplate(template))

            /** Alias for calling [definition] with `InboundBulkMessage.ofContent(content)`. */
            fun definition(content: InboundBulkMessage.InboundBulkContentMessage) =
                definition(InboundBulkMessage.ofContent(content))

            fun enqueued(enqueued: Long) = enqueued(JsonField.of(enqueued))

            /**
             * Sets [Builder.enqueued] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enqueued] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enqueued(enqueued: JsonField<Long>) = apply { this.enqueued = enqueued }

            fun failures(failures: Long) = failures(JsonField.of(failures))

            /**
             * Sets [Builder.failures] to an arbitrary JSON value.
             *
             * You should usually call [Builder.failures] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun failures(failures: JsonField<Long>) = apply { this.failures = failures }

            fun received(received: Long) = received(JsonField.of(received))

            /**
             * Sets [Builder.received] to an arbitrary JSON value.
             *
             * You should usually call [Builder.received] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun received(received: JsonField<Long>) = apply { this.received = received }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [Job].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .definition()
             * .enqueued()
             * .failures()
             * .received()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Job =
                Job(
                    checkRequired("definition", definition),
                    checkRequired("enqueued", enqueued),
                    checkRequired("failures", failures),
                    checkRequired("received", received),
                    checkRequired("status", status),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Job = apply {
            if (validated) {
                return@apply
            }

            definition().validate()
            enqueued()
            failures()
            received()
            status().validate()
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
            (definition.asKnown().getOrNull()?.validity() ?: 0) +
                (if (enqueued.asKnown().isPresent) 1 else 0) +
                (if (failures.asKnown().isPresent) 1 else 0) +
                (if (received.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CREATED = of("CREATED")

                @JvmField val PROCESSING = of("PROCESSING")

                @JvmField val COMPLETED = of("COMPLETED")

                @JvmField val ERROR = of("ERROR")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                CREATED,
                PROCESSING,
                COMPLETED,
                ERROR,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CREATED,
                PROCESSING,
                COMPLETED,
                ERROR,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CREATED -> Value.CREATED
                    PROCESSING -> Value.PROCESSING
                    COMPLETED -> Value.COMPLETED
                    ERROR -> Value.ERROR
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CourierInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CREATED -> Known.CREATED
                    PROCESSING -> Known.PROCESSING
                    COMPLETED -> Known.COMPLETED
                    ERROR -> Known.ERROR
                    else -> throw CourierInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CourierInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CourierInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Job &&
                definition == other.definition &&
                enqueued == other.enqueued &&
                failures == other.failures &&
                received == other.received &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(definition, enqueued, failures, received, status, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Job{definition=$definition, enqueued=$enqueued, failures=$failures, received=$received, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BulkRetrieveJobResponse &&
            job == other.job &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(job, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BulkRetrieveJobResponse{job=$job, additionalProperties=$additionalProperties}"
}

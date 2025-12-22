// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Pagerduty
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val eventAction: JsonField<String>,
    private val routingKey: JsonField<String>,
    private val severity: JsonField<String>,
    private val source: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("event_action")
        @ExcludeMissing
        eventAction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routing_key")
        @ExcludeMissing
        routingKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("severity") @ExcludeMissing severity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
    ) : this(eventAction, routingKey, severity, source, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventAction(): Optional<String> = eventAction.getOptional("event_action")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routingKey(): Optional<String> = routingKey.getOptional("routing_key")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun severity(): Optional<String> = severity.getOptional("severity")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun source(): Optional<String> = source.getOptional("source")

    /**
     * Returns the raw JSON value of [eventAction].
     *
     * Unlike [eventAction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_action")
    @ExcludeMissing
    fun _eventAction(): JsonField<String> = eventAction

    /**
     * Returns the raw JSON value of [routingKey].
     *
     * Unlike [routingKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing_key") @ExcludeMissing fun _routingKey(): JsonField<String> = routingKey

    /**
     * Returns the raw JSON value of [severity].
     *
     * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("severity") @ExcludeMissing fun _severity(): JsonField<String> = severity

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

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

        /** Returns a mutable builder for constructing an instance of [Pagerduty]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Pagerduty]. */
    class Builder internal constructor() {

        private var eventAction: JsonField<String> = JsonMissing.of()
        private var routingKey: JsonField<String> = JsonMissing.of()
        private var severity: JsonField<String> = JsonMissing.of()
        private var source: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pagerduty: Pagerduty) = apply {
            eventAction = pagerduty.eventAction
            routingKey = pagerduty.routingKey
            severity = pagerduty.severity
            source = pagerduty.source
            additionalProperties = pagerduty.additionalProperties.toMutableMap()
        }

        fun eventAction(eventAction: String?) = eventAction(JsonField.ofNullable(eventAction))

        /** Alias for calling [Builder.eventAction] with `eventAction.orElse(null)`. */
        fun eventAction(eventAction: Optional<String>) = eventAction(eventAction.getOrNull())

        /**
         * Sets [Builder.eventAction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventAction] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventAction(eventAction: JsonField<String>) = apply { this.eventAction = eventAction }

        fun routingKey(routingKey: String?) = routingKey(JsonField.ofNullable(routingKey))

        /** Alias for calling [Builder.routingKey] with `routingKey.orElse(null)`. */
        fun routingKey(routingKey: Optional<String>) = routingKey(routingKey.getOrNull())

        /**
         * Sets [Builder.routingKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routingKey(routingKey: JsonField<String>) = apply { this.routingKey = routingKey }

        fun severity(severity: String?) = severity(JsonField.ofNullable(severity))

        /** Alias for calling [Builder.severity] with `severity.orElse(null)`. */
        fun severity(severity: Optional<String>) = severity(severity.getOrNull())

        /**
         * Sets [Builder.severity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.severity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun severity(severity: JsonField<String>) = apply { this.severity = severity }

        fun source(source: String?) = source(JsonField.ofNullable(source))

        /** Alias for calling [Builder.source] with `source.orElse(null)`. */
        fun source(source: Optional<String>) = source(source.getOrNull())

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

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
         * Returns an immutable instance of [Pagerduty].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Pagerduty =
            Pagerduty(
                eventAction,
                routingKey,
                severity,
                source,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Pagerduty = apply {
        if (validated) {
            return@apply
        }

        eventAction()
        routingKey()
        severity()
        source()
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
        (if (eventAction.asKnown().isPresent) 1 else 0) +
            (if (routingKey.asKnown().isPresent) 1 else 0) +
            (if (severity.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Pagerduty &&
            eventAction == other.eventAction &&
            routingKey == other.routingKey &&
            severity == other.severity &&
            source == other.source &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(eventAction, routingKey, severity, source, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Pagerduty{eventAction=$eventAction, routingKey=$routingKey, severity=$severity, source=$source, additionalProperties=$additionalProperties}"
}

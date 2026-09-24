// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.courier.models.ChannelClassification
import com.courier.models.PreferenceStatus
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PreferenceChangeLogEntry
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val customRouting: JsonField<List<ChannelClassification>>,
    private val hasCustomRouting: JsonField<Boolean>,
    private val status: JsonField<PreferenceStatus>,
    private val timestamp: JsonField<String>,
    private val topicId: JsonField<String>,
    private val topicName: JsonField<String>,
    private val userId: JsonField<String>,
    private val previous: JsonField<PreferenceChangeLogValue>,
    private val tenantId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("custom_routing")
        @ExcludeMissing
        customRouting: JsonField<List<ChannelClassification>> = JsonMissing.of(),
        @JsonProperty("has_custom_routing")
        @ExcludeMissing
        hasCustomRouting: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<PreferenceStatus> = JsonMissing.of(),
        @JsonProperty("timestamp") @ExcludeMissing timestamp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("topic_id") @ExcludeMissing topicId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("topic_name") @ExcludeMissing topicName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previous")
        @ExcludeMissing
        previous: JsonField<PreferenceChangeLogValue> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        customRouting,
        hasCustomRouting,
        status,
        timestamp,
        topicId,
        topicName,
        userId,
        previous,
        tenantId,
        mutableMapOf(),
    )

    /**
     * Unique identifier for this change.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The channels chosen for this topic, present only when has_custom_routing is true. Empty
     * otherwise.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customRouting(): List<ChannelClassification> = customRouting.getRequired("custom_routing")

    /**
     * Whether specific delivery channels were chosen for this topic rather than the topic's default
     * routing.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasCustomRouting(): Boolean = hasCustomRouting.getRequired("has_custom_routing")

    /**
     * The subscription status the change set.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): PreferenceStatus = status.getRequired("status")

    /**
     * When the change was made, as an ISO-8601 date-time in UTC.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): String = timestamp.getRequired("timestamp")

    /**
     * The subscription topic the change applies to.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun topicId(): String = topicId.getRequired("topic_id")

    /**
     * The display name of that topic when the change was made.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun topicName(): String = topicName.getRequired("topic_name")

    /**
     * The user whose preference changed.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("user_id")

    /**
     * The value before this change, where it was recorded.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previous(): Optional<PreferenceChangeLogValue> = previous.getOptional("previous")

    /**
     * The tenant context the change was made in. Absent when the user set the preference outside
     * any tenant.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tenantId(): Optional<String> = tenantId.getOptional("tenant_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [customRouting].
     *
     * Unlike [customRouting], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_routing")
    @ExcludeMissing
    fun _customRouting(): JsonField<List<ChannelClassification>> = customRouting

    /**
     * Returns the raw JSON value of [hasCustomRouting].
     *
     * Unlike [hasCustomRouting], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("has_custom_routing")
    @ExcludeMissing
    fun _hasCustomRouting(): JsonField<Boolean> = hasCustomRouting

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<PreferenceStatus> = status

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<String> = timestamp

    /**
     * Returns the raw JSON value of [topicId].
     *
     * Unlike [topicId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("topic_id") @ExcludeMissing fun _topicId(): JsonField<String> = topicId

    /**
     * Returns the raw JSON value of [topicName].
     *
     * Unlike [topicName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("topic_name") @ExcludeMissing fun _topicName(): JsonField<String> = topicName

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [previous].
     *
     * Unlike [previous], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previous")
    @ExcludeMissing
    fun _previous(): JsonField<PreferenceChangeLogValue> = previous

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [PreferenceChangeLogEntry].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .customRouting()
         * .hasCustomRouting()
         * .status()
         * .timestamp()
         * .topicId()
         * .topicName()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreferenceChangeLogEntry]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var customRouting: JsonField<MutableList<ChannelClassification>>? = null
        private var hasCustomRouting: JsonField<Boolean>? = null
        private var status: JsonField<PreferenceStatus>? = null
        private var timestamp: JsonField<String>? = null
        private var topicId: JsonField<String>? = null
        private var topicName: JsonField<String>? = null
        private var userId: JsonField<String>? = null
        private var previous: JsonField<PreferenceChangeLogValue> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(preferenceChangeLogEntry: PreferenceChangeLogEntry) = apply {
            id = preferenceChangeLogEntry.id
            customRouting = preferenceChangeLogEntry.customRouting.map { it.toMutableList() }
            hasCustomRouting = preferenceChangeLogEntry.hasCustomRouting
            status = preferenceChangeLogEntry.status
            timestamp = preferenceChangeLogEntry.timestamp
            topicId = preferenceChangeLogEntry.topicId
            topicName = preferenceChangeLogEntry.topicName
            userId = preferenceChangeLogEntry.userId
            previous = preferenceChangeLogEntry.previous
            tenantId = preferenceChangeLogEntry.tenantId
            additionalProperties = preferenceChangeLogEntry.additionalProperties.toMutableMap()
        }

        /** Unique identifier for this change. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The channels chosen for this topic, present only when has_custom_routing is true. Empty
         * otherwise.
         */
        fun customRouting(customRouting: List<ChannelClassification>) =
            customRouting(JsonField.of(customRouting))

        /**
         * Sets [Builder.customRouting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customRouting] with a well-typed
         * `List<ChannelClassification>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun customRouting(customRouting: JsonField<List<ChannelClassification>>) = apply {
            this.customRouting = customRouting.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChannelClassification] to [Builder.customRouting].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomRouting(customRouting: ChannelClassification) = apply {
            this.customRouting =
                (this.customRouting ?: JsonField.of(mutableListOf())).also {
                    checkKnown("customRouting", it).add(customRouting)
                }
        }

        /**
         * Whether specific delivery channels were chosen for this topic rather than the topic's
         * default routing.
         */
        fun hasCustomRouting(hasCustomRouting: Boolean) =
            hasCustomRouting(JsonField.of(hasCustomRouting))

        /**
         * Sets [Builder.hasCustomRouting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasCustomRouting] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasCustomRouting(hasCustomRouting: JsonField<Boolean>) = apply {
            this.hasCustomRouting = hasCustomRouting
        }

        /** The subscription status the change set. */
        fun status(status: PreferenceStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [PreferenceStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<PreferenceStatus>) = apply { this.status = status }

        /** When the change was made, as an ISO-8601 date-time in UTC. */
        fun timestamp(timestamp: String) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timestamp(timestamp: JsonField<String>) = apply { this.timestamp = timestamp }

        /** The subscription topic the change applies to. */
        fun topicId(topicId: String) = topicId(JsonField.of(topicId))

        /**
         * Sets [Builder.topicId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topicId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topicId(topicId: JsonField<String>) = apply { this.topicId = topicId }

        /** The display name of that topic when the change was made. */
        fun topicName(topicName: String) = topicName(JsonField.of(topicName))

        /**
         * Sets [Builder.topicName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topicName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun topicName(topicName: JsonField<String>) = apply { this.topicName = topicName }

        /** The user whose preference changed. */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** The value before this change, where it was recorded. */
        fun previous(previous: PreferenceChangeLogValue) = previous(JsonField.of(previous))

        /**
         * Sets [Builder.previous] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previous] with a well-typed [PreferenceChangeLogValue]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun previous(previous: JsonField<PreferenceChangeLogValue>) = apply {
            this.previous = previous
        }

        /**
         * The tenant context the change was made in. Absent when the user set the preference
         * outside any tenant.
         */
        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

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
         * Returns an immutable instance of [PreferenceChangeLogEntry].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .customRouting()
         * .hasCustomRouting()
         * .status()
         * .timestamp()
         * .topicId()
         * .topicName()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreferenceChangeLogEntry =
            PreferenceChangeLogEntry(
                checkRequired("id", id),
                checkRequired("customRouting", customRouting).map { it.toImmutable() },
                checkRequired("hasCustomRouting", hasCustomRouting),
                checkRequired("status", status),
                checkRequired("timestamp", timestamp),
                checkRequired("topicId", topicId),
                checkRequired("topicName", topicName),
                checkRequired("userId", userId),
                previous,
                tenantId,
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
    fun validate(): PreferenceChangeLogEntry = apply {
        if (validated) {
            return@apply
        }

        id()
        customRouting().forEach { it.validate() }
        hasCustomRouting()
        status().validate()
        timestamp()
        topicId()
        topicName()
        userId()
        previous().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (customRouting.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (hasCustomRouting.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (if (topicId.asKnown().isPresent) 1 else 0) +
            (if (topicName.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (previous.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreferenceChangeLogEntry &&
            id == other.id &&
            customRouting == other.customRouting &&
            hasCustomRouting == other.hasCustomRouting &&
            status == other.status &&
            timestamp == other.timestamp &&
            topicId == other.topicId &&
            topicName == other.topicName &&
            userId == other.userId &&
            previous == other.previous &&
            tenantId == other.tenantId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            customRouting,
            hasCustomRouting,
            status,
            timestamp,
            topicId,
            topicName,
            userId,
            previous,
            tenantId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PreferenceChangeLogEntry{id=$id, customRouting=$customRouting, hasCustomRouting=$hasCustomRouting, status=$status, timestamp=$timestamp, topicId=$topicId, topicName=$topicName, userId=$userId, previous=$previous, tenantId=$tenantId, additionalProperties=$additionalProperties}"
}

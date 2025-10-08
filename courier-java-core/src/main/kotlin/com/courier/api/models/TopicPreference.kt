// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.checkKnown
import com.courier.api.core.checkRequired
import com.courier.api.core.toImmutable
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TopicPreference
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val defaultStatus: JsonField<PreferenceStatus>,
    private val status: JsonField<PreferenceStatus>,
    private val topicId: JsonField<String>,
    private val topicName: JsonField<String>,
    private val customRouting: JsonField<List<ChannelClassification>>,
    private val hasCustomRouting: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("default_status")
        @ExcludeMissing
        defaultStatus: JsonField<PreferenceStatus> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<PreferenceStatus> = JsonMissing.of(),
        @JsonProperty("topic_id") @ExcludeMissing topicId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("topic_name") @ExcludeMissing topicName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("custom_routing")
        @ExcludeMissing
        customRouting: JsonField<List<ChannelClassification>> = JsonMissing.of(),
        @JsonProperty("has_custom_routing")
        @ExcludeMissing
        hasCustomRouting: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        defaultStatus,
        status,
        topicId,
        topicName,
        customRouting,
        hasCustomRouting,
        mutableMapOf(),
    )

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultStatus(): PreferenceStatus = defaultStatus.getRequired("default_status")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): PreferenceStatus = status.getRequired("status")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun topicId(): String = topicId.getRequired("topic_id")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun topicName(): String = topicName.getRequired("topic_name")

    /**
     * The Channels a user has chosen to receive notifications through for this topic
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customRouting(): Optional<List<ChannelClassification>> =
        customRouting.getOptional("custom_routing")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hasCustomRouting(): Optional<Boolean> = hasCustomRouting.getOptional("has_custom_routing")

    /**
     * Returns the raw JSON value of [defaultStatus].
     *
     * Unlike [defaultStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("default_status")
    @ExcludeMissing
    fun _defaultStatus(): JsonField<PreferenceStatus> = defaultStatus

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<PreferenceStatus> = status

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
         * Returns a mutable builder for constructing an instance of [TopicPreference].
         *
         * The following fields are required:
         * ```java
         * .defaultStatus()
         * .status()
         * .topicId()
         * .topicName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TopicPreference]. */
    class Builder internal constructor() {

        private var defaultStatus: JsonField<PreferenceStatus>? = null
        private var status: JsonField<PreferenceStatus>? = null
        private var topicId: JsonField<String>? = null
        private var topicName: JsonField<String>? = null
        private var customRouting: JsonField<MutableList<ChannelClassification>>? = null
        private var hasCustomRouting: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(topicPreference: TopicPreference) = apply {
            defaultStatus = topicPreference.defaultStatus
            status = topicPreference.status
            topicId = topicPreference.topicId
            topicName = topicPreference.topicName
            customRouting = topicPreference.customRouting.map { it.toMutableList() }
            hasCustomRouting = topicPreference.hasCustomRouting
            additionalProperties = topicPreference.additionalProperties.toMutableMap()
        }

        fun defaultStatus(defaultStatus: PreferenceStatus) =
            defaultStatus(JsonField.of(defaultStatus))

        /**
         * Sets [Builder.defaultStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultStatus] with a well-typed [PreferenceStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun defaultStatus(defaultStatus: JsonField<PreferenceStatus>) = apply {
            this.defaultStatus = defaultStatus
        }

        fun status(status: PreferenceStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [PreferenceStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<PreferenceStatus>) = apply { this.status = status }

        fun topicId(topicId: String) = topicId(JsonField.of(topicId))

        /**
         * Sets [Builder.topicId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topicId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topicId(topicId: JsonField<String>) = apply { this.topicId = topicId }

        fun topicName(topicName: String) = topicName(JsonField.of(topicName))

        /**
         * Sets [Builder.topicName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topicName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun topicName(topicName: JsonField<String>) = apply { this.topicName = topicName }

        /** The Channels a user has chosen to receive notifications through for this topic */
        fun customRouting(customRouting: List<ChannelClassification>?) =
            customRouting(JsonField.ofNullable(customRouting))

        /** Alias for calling [Builder.customRouting] with `customRouting.orElse(null)`. */
        fun customRouting(customRouting: Optional<List<ChannelClassification>>) =
            customRouting(customRouting.getOrNull())

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

        fun hasCustomRouting(hasCustomRouting: Boolean?) =
            hasCustomRouting(JsonField.ofNullable(hasCustomRouting))

        /**
         * Alias for [Builder.hasCustomRouting].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun hasCustomRouting(hasCustomRouting: Boolean) =
            hasCustomRouting(hasCustomRouting as Boolean?)

        /** Alias for calling [Builder.hasCustomRouting] with `hasCustomRouting.orElse(null)`. */
        fun hasCustomRouting(hasCustomRouting: Optional<Boolean>) =
            hasCustomRouting(hasCustomRouting.getOrNull())

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
         * Returns an immutable instance of [TopicPreference].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .defaultStatus()
         * .status()
         * .topicId()
         * .topicName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TopicPreference =
            TopicPreference(
                checkRequired("defaultStatus", defaultStatus),
                checkRequired("status", status),
                checkRequired("topicId", topicId),
                checkRequired("topicName", topicName),
                (customRouting ?: JsonMissing.of()).map { it.toImmutable() },
                hasCustomRouting,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TopicPreference = apply {
        if (validated) {
            return@apply
        }

        defaultStatus().validate()
        status().validate()
        topicId()
        topicName()
        customRouting().ifPresent { it.forEach { it.validate() } }
        hasCustomRouting()
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
        (defaultStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (topicId.asKnown().isPresent) 1 else 0) +
            (if (topicName.asKnown().isPresent) 1 else 0) +
            (customRouting.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (hasCustomRouting.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TopicPreference &&
            defaultStatus == other.defaultStatus &&
            status == other.status &&
            topicId == other.topicId &&
            topicName == other.topicName &&
            customRouting == other.customRouting &&
            hasCustomRouting == other.hasCustomRouting &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            defaultStatus,
            status,
            topicId,
            topicName,
            customRouting,
            hasCustomRouting,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TopicPreference{defaultStatus=$defaultStatus, status=$status, topicId=$topicId, topicName=$topicName, customRouting=$customRouting, hasCustomRouting=$hasCustomRouting, additionalProperties=$additionalProperties}"
}

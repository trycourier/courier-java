// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
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

class NotificationPreferenceDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val status: JsonField<PreferenceStatus>,
    private val channelPreferences: JsonField<List<ChannelPreference>>,
    private val rules: JsonField<List<Rule>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<PreferenceStatus> = JsonMissing.of(),
        @JsonProperty("channel_preferences")
        @ExcludeMissing
        channelPreferences: JsonField<List<ChannelPreference>> = JsonMissing.of(),
        @JsonProperty("rules") @ExcludeMissing rules: JsonField<List<Rule>> = JsonMissing.of(),
    ) : this(status, channelPreferences, rules, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): PreferenceStatus = status.getRequired("status")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channelPreferences(): Optional<List<ChannelPreference>> =
        channelPreferences.getOptional("channel_preferences")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rules(): Optional<List<Rule>> = rules.getOptional("rules")

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<PreferenceStatus> = status

    /**
     * Returns the raw JSON value of [channelPreferences].
     *
     * Unlike [channelPreferences], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("channel_preferences")
    @ExcludeMissing
    fun _channelPreferences(): JsonField<List<ChannelPreference>> = channelPreferences

    /**
     * Returns the raw JSON value of [rules].
     *
     * Unlike [rules], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rules") @ExcludeMissing fun _rules(): JsonField<List<Rule>> = rules

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
         * Returns a mutable builder for constructing an instance of
         * [NotificationPreferenceDetails].
         *
         * The following fields are required:
         * ```java
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationPreferenceDetails]. */
    class Builder internal constructor() {

        private var status: JsonField<PreferenceStatus>? = null
        private var channelPreferences: JsonField<MutableList<ChannelPreference>>? = null
        private var rules: JsonField<MutableList<Rule>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(notificationPreferenceDetails: NotificationPreferenceDetails) = apply {
            status = notificationPreferenceDetails.status
            channelPreferences =
                notificationPreferenceDetails.channelPreferences.map { it.toMutableList() }
            rules = notificationPreferenceDetails.rules.map { it.toMutableList() }
            additionalProperties = notificationPreferenceDetails.additionalProperties.toMutableMap()
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

        fun channelPreferences(channelPreferences: List<ChannelPreference>?) =
            channelPreferences(JsonField.ofNullable(channelPreferences))

        /**
         * Alias for calling [Builder.channelPreferences] with `channelPreferences.orElse(null)`.
         */
        fun channelPreferences(channelPreferences: Optional<List<ChannelPreference>>) =
            channelPreferences(channelPreferences.getOrNull())

        /**
         * Sets [Builder.channelPreferences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelPreferences] with a well-typed
         * `List<ChannelPreference>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun channelPreferences(channelPreferences: JsonField<List<ChannelPreference>>) = apply {
            this.channelPreferences = channelPreferences.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChannelPreference] to [channelPreferences].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChannelPreference(channelPreference: ChannelPreference) = apply {
            channelPreferences =
                (channelPreferences ?: JsonField.of(mutableListOf())).also {
                    checkKnown("channelPreferences", it).add(channelPreference)
                }
        }

        fun rules(rules: List<Rule>?) = rules(JsonField.ofNullable(rules))

        /** Alias for calling [Builder.rules] with `rules.orElse(null)`. */
        fun rules(rules: Optional<List<Rule>>) = rules(rules.getOrNull())

        /**
         * Sets [Builder.rules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rules] with a well-typed `List<Rule>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rules(rules: JsonField<List<Rule>>) = apply {
            this.rules = rules.map { it.toMutableList() }
        }

        /**
         * Adds a single [Rule] to [rules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRule(rule: Rule) = apply {
            rules =
                (rules ?: JsonField.of(mutableListOf())).also { checkKnown("rules", it).add(rule) }
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
         * Returns an immutable instance of [NotificationPreferenceDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NotificationPreferenceDetails =
            NotificationPreferenceDetails(
                checkRequired("status", status),
                (channelPreferences ?: JsonMissing.of()).map { it.toImmutable() },
                (rules ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NotificationPreferenceDetails = apply {
        if (validated) {
            return@apply
        }

        status().validate()
        channelPreferences().ifPresent { it.forEach { it.validate() } }
        rules().ifPresent { it.forEach { it.validate() } }
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
        (status.asKnown().getOrNull()?.validity() ?: 0) +
            (channelPreferences.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (rules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationPreferenceDetails &&
            status == other.status &&
            channelPreferences == other.channelPreferences &&
            rules == other.rules &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(status, channelPreferences, rules, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotificationPreferenceDetails{status=$status, channelPreferences=$channelPreferences, rules=$rules, additionalProperties=$additionalProperties}"
}

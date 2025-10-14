// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models

import com.courier.api.core.Enum
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

class Preference
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val status: JsonField<PreferenceStatus>,
    private val channelPreferences: JsonField<List<ChannelPreference>>,
    private val rules: JsonField<List<Rule>>,
    private val source: JsonField<Source>,
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
        @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
    ) : this(status, channelPreferences, rules, source, mutableMapOf())

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
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun source(): Optional<Source> = source.getOptional("source")

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

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

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
         * Returns a mutable builder for constructing an instance of [Preference].
         *
         * The following fields are required:
         * ```java
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Preference]. */
    class Builder internal constructor() {

        private var status: JsonField<PreferenceStatus>? = null
        private var channelPreferences: JsonField<MutableList<ChannelPreference>>? = null
        private var rules: JsonField<MutableList<Rule>>? = null
        private var source: JsonField<Source> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(preference: Preference) = apply {
            status = preference.status
            channelPreferences = preference.channelPreferences.map { it.toMutableList() }
            rules = preference.rules.map { it.toMutableList() }
            source = preference.source
            additionalProperties = preference.additionalProperties.toMutableMap()
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

        fun source(source: Source?) = source(JsonField.ofNullable(source))

        /** Alias for calling [Builder.source] with `source.orElse(null)`. */
        fun source(source: Optional<Source>) = source(source.getOrNull())

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Source] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<Source>) = apply { this.source = source }

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
         * Returns an immutable instance of [Preference].
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
        fun build(): Preference =
            Preference(
                checkRequired("status", status),
                (channelPreferences ?: JsonMissing.of()).map { it.toImmutable() },
                (rules ?: JsonMissing.of()).map { it.toImmutable() },
                source,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Preference = apply {
        if (validated) {
            return@apply
        }

        status().validate()
        channelPreferences().ifPresent { it.forEach { it.validate() } }
        rules().ifPresent { it.forEach { it.validate() } }
        source().ifPresent { it.validate() }
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
            (rules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (source.asKnown().getOrNull()?.validity() ?: 0)

    class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SUBSCRIPTION = of("subscription")

            @JvmField val LIST = of("list")

            @JvmField val RECIPIENT = of("recipient")

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        /** An enum containing [Source]'s known values. */
        enum class Known {
            SUBSCRIPTION,
            LIST,
            RECIPIENT,
        }

        /**
         * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Source] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUBSCRIPTION,
            LIST,
            RECIPIENT,
            /** An enum member indicating that [Source] was instantiated with an unknown value. */
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
                SUBSCRIPTION -> Value.SUBSCRIPTION
                LIST -> Value.LIST
                RECIPIENT -> Value.RECIPIENT
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
                SUBSCRIPTION -> Known.SUBSCRIPTION
                LIST -> Known.LIST
                RECIPIENT -> Known.RECIPIENT
                else -> throw CourierInvalidDataException("Unknown Source: $value")
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

        fun validate(): Source = apply {
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

            return other is Source && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Preference &&
            status == other.status &&
            channelPreferences == other.channelPreferences &&
            rules == other.rules &&
            source == other.source &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(status, channelPreferences, rules, source, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Preference{status=$status, channelPreferences=$channelPreferences, rules=$rules, source=$source, additionalProperties=$additionalProperties}"
}

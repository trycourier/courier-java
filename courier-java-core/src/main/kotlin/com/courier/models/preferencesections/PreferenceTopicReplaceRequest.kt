// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections

import com.courier.core.Enum
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Request body for replacing a preference topic. Full document replacement; missing optional fields
 * are cleared.
 */
class PreferenceTopicReplaceRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val defaultStatus: JsonField<DefaultStatus>,
    private val name: JsonField<String>,
    private val allowedPreferences: JsonField<List<AllowedPreference>>,
    private val includeUnsubscribeHeader: JsonField<Boolean>,
    private val routingOptions: JsonField<List<ChannelClassification>>,
    private val topicData: JsonField<TopicData>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("default_status")
        @ExcludeMissing
        defaultStatus: JsonField<DefaultStatus> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("allowed_preferences")
        @ExcludeMissing
        allowedPreferences: JsonField<List<AllowedPreference>> = JsonMissing.of(),
        @JsonProperty("include_unsubscribe_header")
        @ExcludeMissing
        includeUnsubscribeHeader: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("routing_options")
        @ExcludeMissing
        routingOptions: JsonField<List<ChannelClassification>> = JsonMissing.of(),
        @JsonProperty("topic_data")
        @ExcludeMissing
        topicData: JsonField<TopicData> = JsonMissing.of(),
    ) : this(
        defaultStatus,
        name,
        allowedPreferences,
        includeUnsubscribeHeader,
        routingOptions,
        topicData,
        mutableMapOf(),
    )

    /**
     * The default subscription status applied when a recipient has not set their own.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultStatus(): DefaultStatus = defaultStatus.getRequired("default_status")

    /**
     * Human-readable name for the preference topic.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Preference controls a recipient may customize. Omit to clear.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedPreferences(): Optional<List<AllowedPreference>> =
        allowedPreferences.getOptional("allowed_preferences")

    /**
     * Whether to include a list-unsubscribe header on emails for this topic.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeUnsubscribeHeader(): Optional<Boolean> =
        includeUnsubscribeHeader.getOptional("include_unsubscribe_header")

    /**
     * Default channels delivered for this topic. Omit to clear.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routingOptions(): Optional<List<ChannelClassification>> =
        routingOptions.getOptional("routing_options")

    /**
     * Arbitrary metadata associated with the topic. Omit to clear.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topicData(): Optional<TopicData> = topicData.getOptional("topic_data")

    /**
     * Returns the raw JSON value of [defaultStatus].
     *
     * Unlike [defaultStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("default_status")
    @ExcludeMissing
    fun _defaultStatus(): JsonField<DefaultStatus> = defaultStatus

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [allowedPreferences].
     *
     * Unlike [allowedPreferences], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("allowed_preferences")
    @ExcludeMissing
    fun _allowedPreferences(): JsonField<List<AllowedPreference>> = allowedPreferences

    /**
     * Returns the raw JSON value of [includeUnsubscribeHeader].
     *
     * Unlike [includeUnsubscribeHeader], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("include_unsubscribe_header")
    @ExcludeMissing
    fun _includeUnsubscribeHeader(): JsonField<Boolean> = includeUnsubscribeHeader

    /**
     * Returns the raw JSON value of [routingOptions].
     *
     * Unlike [routingOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing_options")
    @ExcludeMissing
    fun _routingOptions(): JsonField<List<ChannelClassification>> = routingOptions

    /**
     * Returns the raw JSON value of [topicData].
     *
     * Unlike [topicData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("topic_data") @ExcludeMissing fun _topicData(): JsonField<TopicData> = topicData

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
         * [PreferenceTopicReplaceRequest].
         *
         * The following fields are required:
         * ```java
         * .defaultStatus()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreferenceTopicReplaceRequest]. */
    class Builder internal constructor() {

        private var defaultStatus: JsonField<DefaultStatus>? = null
        private var name: JsonField<String>? = null
        private var allowedPreferences: JsonField<MutableList<AllowedPreference>>? = null
        private var includeUnsubscribeHeader: JsonField<Boolean> = JsonMissing.of()
        private var routingOptions: JsonField<MutableList<ChannelClassification>>? = null
        private var topicData: JsonField<TopicData> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(preferenceTopicReplaceRequest: PreferenceTopicReplaceRequest) = apply {
            defaultStatus = preferenceTopicReplaceRequest.defaultStatus
            name = preferenceTopicReplaceRequest.name
            allowedPreferences =
                preferenceTopicReplaceRequest.allowedPreferences.map { it.toMutableList() }
            includeUnsubscribeHeader = preferenceTopicReplaceRequest.includeUnsubscribeHeader
            routingOptions = preferenceTopicReplaceRequest.routingOptions.map { it.toMutableList() }
            topicData = preferenceTopicReplaceRequest.topicData
            additionalProperties = preferenceTopicReplaceRequest.additionalProperties.toMutableMap()
        }

        /** The default subscription status applied when a recipient has not set their own. */
        fun defaultStatus(defaultStatus: DefaultStatus) = defaultStatus(JsonField.of(defaultStatus))

        /**
         * Sets [Builder.defaultStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultStatus] with a well-typed [DefaultStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultStatus(defaultStatus: JsonField<DefaultStatus>) = apply {
            this.defaultStatus = defaultStatus
        }

        /** Human-readable name for the preference topic. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Preference controls a recipient may customize. Omit to clear. */
        fun allowedPreferences(allowedPreferences: List<AllowedPreference>?) =
            allowedPreferences(JsonField.ofNullable(allowedPreferences))

        /**
         * Alias for calling [Builder.allowedPreferences] with `allowedPreferences.orElse(null)`.
         */
        fun allowedPreferences(allowedPreferences: Optional<List<AllowedPreference>>) =
            allowedPreferences(allowedPreferences.getOrNull())

        /**
         * Sets [Builder.allowedPreferences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedPreferences] with a well-typed
         * `List<AllowedPreference>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun allowedPreferences(allowedPreferences: JsonField<List<AllowedPreference>>) = apply {
            this.allowedPreferences = allowedPreferences.map { it.toMutableList() }
        }

        /**
         * Adds a single [AllowedPreference] to [allowedPreferences].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedPreference(allowedPreference: AllowedPreference) = apply {
            allowedPreferences =
                (allowedPreferences ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allowedPreferences", it).add(allowedPreference)
                }
        }

        /** Whether to include a list-unsubscribe header on emails for this topic. */
        fun includeUnsubscribeHeader(includeUnsubscribeHeader: Boolean?) =
            includeUnsubscribeHeader(JsonField.ofNullable(includeUnsubscribeHeader))

        /**
         * Alias for [Builder.includeUnsubscribeHeader].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeUnsubscribeHeader(includeUnsubscribeHeader: Boolean) =
            includeUnsubscribeHeader(includeUnsubscribeHeader as Boolean?)

        /**
         * Alias for calling [Builder.includeUnsubscribeHeader] with
         * `includeUnsubscribeHeader.orElse(null)`.
         */
        fun includeUnsubscribeHeader(includeUnsubscribeHeader: Optional<Boolean>) =
            includeUnsubscribeHeader(includeUnsubscribeHeader.getOrNull())

        /**
         * Sets [Builder.includeUnsubscribeHeader] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeUnsubscribeHeader] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun includeUnsubscribeHeader(includeUnsubscribeHeader: JsonField<Boolean>) = apply {
            this.includeUnsubscribeHeader = includeUnsubscribeHeader
        }

        /** Default channels delivered for this topic. Omit to clear. */
        fun routingOptions(routingOptions: List<ChannelClassification>?) =
            routingOptions(JsonField.ofNullable(routingOptions))

        /** Alias for calling [Builder.routingOptions] with `routingOptions.orElse(null)`. */
        fun routingOptions(routingOptions: Optional<List<ChannelClassification>>) =
            routingOptions(routingOptions.getOrNull())

        /**
         * Sets [Builder.routingOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingOptions] with a well-typed
         * `List<ChannelClassification>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun routingOptions(routingOptions: JsonField<List<ChannelClassification>>) = apply {
            this.routingOptions = routingOptions.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChannelClassification] to [routingOptions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRoutingOption(routingOption: ChannelClassification) = apply {
            routingOptions =
                (routingOptions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("routingOptions", it).add(routingOption)
                }
        }

        /** Arbitrary metadata associated with the topic. Omit to clear. */
        fun topicData(topicData: TopicData?) = topicData(JsonField.ofNullable(topicData))

        /** Alias for calling [Builder.topicData] with `topicData.orElse(null)`. */
        fun topicData(topicData: Optional<TopicData>) = topicData(topicData.getOrNull())

        /**
         * Sets [Builder.topicData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topicData] with a well-typed [TopicData] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun topicData(topicData: JsonField<TopicData>) = apply { this.topicData = topicData }

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
         * Returns an immutable instance of [PreferenceTopicReplaceRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .defaultStatus()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreferenceTopicReplaceRequest =
            PreferenceTopicReplaceRequest(
                checkRequired("defaultStatus", defaultStatus),
                checkRequired("name", name),
                (allowedPreferences ?: JsonMissing.of()).map { it.toImmutable() },
                includeUnsubscribeHeader,
                (routingOptions ?: JsonMissing.of()).map { it.toImmutable() },
                topicData,
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
    fun validate(): PreferenceTopicReplaceRequest = apply {
        if (validated) {
            return@apply
        }

        defaultStatus().validate()
        name()
        allowedPreferences().ifPresent { it.forEach { it.validate() } }
        includeUnsubscribeHeader()
        routingOptions().ifPresent { it.forEach { it.validate() } }
        topicData().ifPresent { it.validate() }
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
            (if (name.asKnown().isPresent) 1 else 0) +
            (allowedPreferences.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (includeUnsubscribeHeader.asKnown().isPresent) 1 else 0) +
            (routingOptions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (topicData.asKnown().getOrNull()?.validity() ?: 0)

    /** The default subscription status applied when a recipient has not set their own. */
    class DefaultStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val OPTED_OUT = of("OPTED_OUT")

            @JvmField val OPTED_IN = of("OPTED_IN")

            @JvmField val REQUIRED = of("REQUIRED")

            @JvmStatic fun of(value: String) = DefaultStatus(JsonField.of(value))
        }

        /** An enum containing [DefaultStatus]'s known values. */
        enum class Known {
            OPTED_OUT,
            OPTED_IN,
            REQUIRED,
        }

        /**
         * An enum containing [DefaultStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DefaultStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPTED_OUT,
            OPTED_IN,
            REQUIRED,
            /**
             * An enum member indicating that [DefaultStatus] was instantiated with an unknown
             * value.
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
                OPTED_OUT -> Value.OPTED_OUT
                OPTED_IN -> Value.OPTED_IN
                REQUIRED -> Value.REQUIRED
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
                OPTED_OUT -> Known.OPTED_OUT
                OPTED_IN -> Known.OPTED_IN
                REQUIRED -> Known.REQUIRED
                else -> throw CourierInvalidDataException("Unknown DefaultStatus: $value")
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
        fun validate(): DefaultStatus = apply {
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

            return other is DefaultStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** A preference control a recipient may customize for a topic. */
    class AllowedPreference @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SNOOZE = of("snooze")

            @JvmField val CHANNEL_PREFERENCES = of("channel_preferences")

            @JvmStatic fun of(value: String) = AllowedPreference(JsonField.of(value))
        }

        /** An enum containing [AllowedPreference]'s known values. */
        enum class Known {
            SNOOZE,
            CHANNEL_PREFERENCES,
        }

        /**
         * An enum containing [AllowedPreference]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AllowedPreference] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SNOOZE,
            CHANNEL_PREFERENCES,
            /**
             * An enum member indicating that [AllowedPreference] was instantiated with an unknown
             * value.
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
                SNOOZE -> Value.SNOOZE
                CHANNEL_PREFERENCES -> Value.CHANNEL_PREFERENCES
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
                SNOOZE -> Known.SNOOZE
                CHANNEL_PREFERENCES -> Known.CHANNEL_PREFERENCES
                else -> throw CourierInvalidDataException("Unknown AllowedPreference: $value")
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
        fun validate(): AllowedPreference = apply {
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

            return other is AllowedPreference && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Arbitrary metadata associated with the topic. Omit to clear. */
    class TopicData
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

            /** Returns a mutable builder for constructing an instance of [TopicData]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TopicData]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(topicData: TopicData) = apply {
                additionalProperties = topicData.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [TopicData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TopicData = TopicData(additionalProperties.toImmutable())
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
        fun validate(): TopicData = apply {
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

            return other is TopicData && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "TopicData{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreferenceTopicReplaceRequest &&
            defaultStatus == other.defaultStatus &&
            name == other.name &&
            allowedPreferences == other.allowedPreferences &&
            includeUnsubscribeHeader == other.includeUnsubscribeHeader &&
            routingOptions == other.routingOptions &&
            topicData == other.topicData &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            defaultStatus,
            name,
            allowedPreferences,
            includeUnsubscribeHeader,
            routingOptions,
            topicData,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PreferenceTopicReplaceRequest{defaultStatus=$defaultStatus, name=$name, allowedPreferences=$allowedPreferences, includeUnsubscribeHeader=$includeUnsubscribeHeader, routingOptions=$routingOptions, topicData=$topicData, additionalProperties=$additionalProperties}"
}

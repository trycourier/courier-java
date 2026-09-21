// File generated from our OpenAPI spec by Stainless.

package com.courier.models.workspacepreferences

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

/** Request body for creating a preference topic. */
class WorkspacePreferenceTopicCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val defaultStatus: JsonField<DefaultStatus>,
    private val name: JsonField<String>,
    private val allowedPreferences: JsonField<List<AllowedPreference>>,
    private val description: JsonField<String>,
    private val digest: JsonField<Digest>,
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
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("digest") @ExcludeMissing digest: JsonField<Digest> = JsonMissing.of(),
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
        description,
        digest,
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
     * Preference controls a recipient may customize for this topic. Defaults to empty if omitted.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedPreferences(): Optional<List<AllowedPreference>> =
        allowedPreferences.getOptional("allowed_preferences")

    /**
     * Optional description shown under the topic on the hosted preferences page.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * A topic's digest, as supplied when the topic itself is created: the template that renders it,
     * the cadences it delivers on, and how collected events are retained.
     *
     * Identical to `TopicDigestRequest`, which a replace uses, except that `schedules` is required
     * — a topic being created has no stored schedules for an absent key to leave alone.
     *
     * Send `null` for the whole object to turn a digest off, which unlinks the template and removes
     * its schedules. There is no `enabled` flag, and `schedules: []` is rejected, because both
     * states are un-deliverable rather than merely off.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun digest(): Optional<Digest> = digest.getOptional("digest")

    /**
     * Whether to include a list-unsubscribe header on emails for this topic.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeUnsubscribeHeader(): Optional<Boolean> =
        includeUnsubscribeHeader.getOptional("include_unsubscribe_header")

    /**
     * Default channels delivered for this topic. Defaults to empty if omitted.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routingOptions(): Optional<List<ChannelClassification>> =
        routingOptions.getOptional("routing_options")

    /**
     * Arbitrary metadata associated with the topic.
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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [digest].
     *
     * Unlike [digest], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("digest") @ExcludeMissing fun _digest(): JsonField<Digest> = digest

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
         * [WorkspacePreferenceTopicCreateRequest].
         *
         * The following fields are required:
         * ```java
         * .defaultStatus()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WorkspacePreferenceTopicCreateRequest]. */
    class Builder internal constructor() {

        private var defaultStatus: JsonField<DefaultStatus>? = null
        private var name: JsonField<String>? = null
        private var allowedPreferences: JsonField<MutableList<AllowedPreference>>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var digest: JsonField<Digest> = JsonMissing.of()
        private var includeUnsubscribeHeader: JsonField<Boolean> = JsonMissing.of()
        private var routingOptions: JsonField<MutableList<ChannelClassification>>? = null
        private var topicData: JsonField<TopicData> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            workspacePreferenceTopicCreateRequest: WorkspacePreferenceTopicCreateRequest
        ) = apply {
            defaultStatus = workspacePreferenceTopicCreateRequest.defaultStatus
            name = workspacePreferenceTopicCreateRequest.name
            allowedPreferences =
                workspacePreferenceTopicCreateRequest.allowedPreferences.map { it.toMutableList() }
            description = workspacePreferenceTopicCreateRequest.description
            digest = workspacePreferenceTopicCreateRequest.digest
            includeUnsubscribeHeader =
                workspacePreferenceTopicCreateRequest.includeUnsubscribeHeader
            routingOptions =
                workspacePreferenceTopicCreateRequest.routingOptions.map { it.toMutableList() }
            topicData = workspacePreferenceTopicCreateRequest.topicData
            additionalProperties =
                workspacePreferenceTopicCreateRequest.additionalProperties.toMutableMap()
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

        /**
         * Preference controls a recipient may customize for this topic. Defaults to empty if
         * omitted.
         */
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

        /** Optional description shown under the topic on the hosted preferences page. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * A topic's digest, as supplied when the topic itself is created: the template that renders
         * it, the cadences it delivers on, and how collected events are retained.
         *
         * Identical to `TopicDigestRequest`, which a replace uses, except that `schedules` is
         * required — a topic being created has no stored schedules for an absent key to leave
         * alone.
         *
         * Send `null` for the whole object to turn a digest off, which unlinks the template and
         * removes its schedules. There is no `enabled` flag, and `schedules: []` is rejected,
         * because both states are un-deliverable rather than merely off.
         */
        fun digest(digest: Digest?) = digest(JsonField.ofNullable(digest))

        /** Alias for calling [Builder.digest] with `digest.orElse(null)`. */
        fun digest(digest: Optional<Digest>) = digest(digest.getOrNull())

        /**
         * Sets [Builder.digest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.digest] with a well-typed [Digest] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun digest(digest: JsonField<Digest>) = apply { this.digest = digest }

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

        /** Default channels delivered for this topic. Defaults to empty if omitted. */
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

        /** Arbitrary metadata associated with the topic. */
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
         * Returns an immutable instance of [WorkspacePreferenceTopicCreateRequest].
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
        fun build(): WorkspacePreferenceTopicCreateRequest =
            WorkspacePreferenceTopicCreateRequest(
                checkRequired("defaultStatus", defaultStatus),
                checkRequired("name", name),
                (allowedPreferences ?: JsonMissing.of()).map { it.toImmutable() },
                description,
                digest,
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
    fun validate(): WorkspacePreferenceTopicCreateRequest = apply {
        if (validated) {
            return@apply
        }

        defaultStatus().validate()
        name()
        allowedPreferences().ifPresent { it.forEach { it.validate() } }
        description()
        digest().ifPresent { it.validate() }
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
            (if (description.asKnown().isPresent) 1 else 0) +
            (digest.asKnown().getOrNull()?.validity() ?: 0) +
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

    /**
     * A topic's digest, as supplied when the topic itself is created: the template that renders it,
     * the cadences it delivers on, and how collected events are retained.
     *
     * Identical to `TopicDigestRequest`, which a replace uses, except that `schedules` is required
     * — a topic being created has no stored schedules for an absent key to leave alone.
     *
     * Send `null` for the whole object to turn a digest off, which unlinks the template and removes
     * its schedules. There is no `enabled` flag, and `schedules: []` is rejected, because both
     * states are un-deliverable rather than merely off.
     */
    class Digest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val schedules: JsonField<List<TopicDigestScheduleRequest>>,
        private val templateId: JsonField<String>,
        private val audienceId: JsonField<String>,
        private val categories: JsonField<List<TopicDigestCategory>>,
        private val triggerEmpty: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("schedules")
            @ExcludeMissing
            schedules: JsonField<List<TopicDigestScheduleRequest>> = JsonMissing.of(),
            @JsonProperty("template_id")
            @ExcludeMissing
            templateId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("audience_id")
            @ExcludeMissing
            audienceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("categories")
            @ExcludeMissing
            categories: JsonField<List<TopicDigestCategory>> = JsonMissing.of(),
            @JsonProperty("trigger_empty")
            @ExcludeMissing
            triggerEmpty: JsonField<Boolean> = JsonMissing.of(),
        ) : this(schedules, templateId, audienceId, categories, triggerEmpty, mutableMapOf())

        /**
         * The cadences this digest delivers on.
         *
         * The array replaces the stored schedules wholesale, so a schedule you leave out of it is
         * deleted along with its delivery rule. Omit the key entirely to leave the stored schedules
         * untouched — useful for changing `template_id` or `categories` without restating every
         * schedule.
         *
         * A digest must end up with at least one schedule, because one with none collects events
         * into an instance that can never fire. So sending `[]` is always a `400`, and so is
         * omitting the key on a topic that has no schedules stored yet.
         *
         * On **create** the key is required outright: a topic being created has nothing stored to
         * leave alone, and the topic row is written before its digest, so rejecting it any later
         * would leave the topic behind and let a retry duplicate it.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun schedules(): List<TopicDigestScheduleRequest> = schedules.getRequired("schedules")

        /**
         * The notification template that renders the digest. A digest with no template collects
         * nothing, so this is required.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun templateId(): String = templateId.getRequired("template_id")

        /**
         * Optional audience the digest is scoped to.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun audienceId(): Optional<String> = audienceId.getOptional("audience_id")

        /**
         * Retention rules per category key. Defaults to a single `digest` category retaining
         * `FIRST`.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun categories(): Optional<List<TopicDigestCategory>> = categories.getOptional("categories")

        /**
         * Whether to deliver the digest even when nothing was collected.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun triggerEmpty(): Optional<Boolean> = triggerEmpty.getOptional("trigger_empty")

        /**
         * Returns the raw JSON value of [schedules].
         *
         * Unlike [schedules], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("schedules")
        @ExcludeMissing
        fun _schedules(): JsonField<List<TopicDigestScheduleRequest>> = schedules

        /**
         * Returns the raw JSON value of [templateId].
         *
         * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("template_id")
        @ExcludeMissing
        fun _templateId(): JsonField<String> = templateId

        /**
         * Returns the raw JSON value of [audienceId].
         *
         * Unlike [audienceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("audience_id")
        @ExcludeMissing
        fun _audienceId(): JsonField<String> = audienceId

        /**
         * Returns the raw JSON value of [categories].
         *
         * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("categories")
        @ExcludeMissing
        fun _categories(): JsonField<List<TopicDigestCategory>> = categories

        /**
         * Returns the raw JSON value of [triggerEmpty].
         *
         * Unlike [triggerEmpty], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trigger_empty")
        @ExcludeMissing
        fun _triggerEmpty(): JsonField<Boolean> = triggerEmpty

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
             * Returns a mutable builder for constructing an instance of [Digest].
             *
             * The following fields are required:
             * ```java
             * .schedules()
             * .templateId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Digest]. */
        class Builder internal constructor() {

            private var schedules: JsonField<MutableList<TopicDigestScheduleRequest>>? = null
            private var templateId: JsonField<String>? = null
            private var audienceId: JsonField<String> = JsonMissing.of()
            private var categories: JsonField<MutableList<TopicDigestCategory>>? = null
            private var triggerEmpty: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digest: Digest) = apply {
                schedules = digest.schedules.map { it.toMutableList() }
                templateId = digest.templateId
                audienceId = digest.audienceId
                categories = digest.categories.map { it.toMutableList() }
                triggerEmpty = digest.triggerEmpty
                additionalProperties = digest.additionalProperties.toMutableMap()
            }

            /**
             * The cadences this digest delivers on.
             *
             * The array replaces the stored schedules wholesale, so a schedule you leave out of it
             * is deleted along with its delivery rule. Omit the key entirely to leave the stored
             * schedules untouched — useful for changing `template_id` or `categories` without
             * restating every schedule.
             *
             * A digest must end up with at least one schedule, because one with none collects
             * events into an instance that can never fire. So sending `[]` is always a `400`, and
             * so is omitting the key on a topic that has no schedules stored yet.
             *
             * On **create** the key is required outright: a topic being created has nothing stored
             * to leave alone, and the topic row is written before its digest, so rejecting it any
             * later would leave the topic behind and let a retry duplicate it.
             */
            fun schedules(schedules: List<TopicDigestScheduleRequest>) =
                schedules(JsonField.of(schedules))

            /**
             * Sets [Builder.schedules] to an arbitrary JSON value.
             *
             * You should usually call [Builder.schedules] with a well-typed
             * `List<TopicDigestScheduleRequest>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun schedules(schedules: JsonField<List<TopicDigestScheduleRequest>>) = apply {
                this.schedules = schedules.map { it.toMutableList() }
            }

            /**
             * Adds a single [TopicDigestScheduleRequest] to [schedules].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSchedule(schedule: TopicDigestScheduleRequest) = apply {
                schedules =
                    (schedules ?: JsonField.of(mutableListOf())).also {
                        checkKnown("schedules", it).add(schedule)
                    }
            }

            /**
             * The notification template that renders the digest. A digest with no template collects
             * nothing, so this is required.
             */
            fun templateId(templateId: String) = templateId(JsonField.of(templateId))

            /**
             * Sets [Builder.templateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templateId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

            /** Optional audience the digest is scoped to. */
            fun audienceId(audienceId: String) = audienceId(JsonField.of(audienceId))

            /**
             * Sets [Builder.audienceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audienceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun audienceId(audienceId: JsonField<String>) = apply { this.audienceId = audienceId }

            /**
             * Retention rules per category key. Defaults to a single `digest` category retaining
             * `FIRST`.
             */
            fun categories(categories: List<TopicDigestCategory>) =
                categories(JsonField.of(categories))

            /**
             * Sets [Builder.categories] to an arbitrary JSON value.
             *
             * You should usually call [Builder.categories] with a well-typed
             * `List<TopicDigestCategory>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun categories(categories: JsonField<List<TopicDigestCategory>>) = apply {
                this.categories = categories.map { it.toMutableList() }
            }

            /**
             * Adds a single [TopicDigestCategory] to [categories].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCategory(category: TopicDigestCategory) = apply {
                categories =
                    (categories ?: JsonField.of(mutableListOf())).also {
                        checkKnown("categories", it).add(category)
                    }
            }

            /** Whether to deliver the digest even when nothing was collected. */
            fun triggerEmpty(triggerEmpty: Boolean) = triggerEmpty(JsonField.of(triggerEmpty))

            /**
             * Sets [Builder.triggerEmpty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.triggerEmpty] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun triggerEmpty(triggerEmpty: JsonField<Boolean>) = apply {
                this.triggerEmpty = triggerEmpty
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
             * Returns an immutable instance of [Digest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .schedules()
             * .templateId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Digest =
                Digest(
                    checkRequired("schedules", schedules).map { it.toImmutable() },
                    checkRequired("templateId", templateId),
                    audienceId,
                    (categories ?: JsonMissing.of()).map { it.toImmutable() },
                    triggerEmpty,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Digest = apply {
            if (validated) {
                return@apply
            }

            schedules().forEach { it.validate() }
            templateId()
            audienceId()
            categories().ifPresent { it.forEach { it.validate() } }
            triggerEmpty()
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
            (schedules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (templateId.asKnown().isPresent) 1 else 0) +
                (if (audienceId.asKnown().isPresent) 1 else 0) +
                (categories.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (triggerEmpty.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Digest &&
                schedules == other.schedules &&
                templateId == other.templateId &&
                audienceId == other.audienceId &&
                categories == other.categories &&
                triggerEmpty == other.triggerEmpty &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                schedules,
                templateId,
                audienceId,
                categories,
                triggerEmpty,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Digest{schedules=$schedules, templateId=$templateId, audienceId=$audienceId, categories=$categories, triggerEmpty=$triggerEmpty, additionalProperties=$additionalProperties}"
    }

    /** Arbitrary metadata associated with the topic. */
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

        return other is WorkspacePreferenceTopicCreateRequest &&
            defaultStatus == other.defaultStatus &&
            name == other.name &&
            allowedPreferences == other.allowedPreferences &&
            description == other.description &&
            digest == other.digest &&
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
            description,
            digest,
            includeUnsubscribeHeader,
            routingOptions,
            topicData,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WorkspacePreferenceTopicCreateRequest{defaultStatus=$defaultStatus, name=$name, allowedPreferences=$allowedPreferences, description=$description, digest=$digest, includeUnsubscribeHeader=$includeUnsubscribeHeader, routingOptions=$routingOptions, topicData=$topicData, additionalProperties=$additionalProperties}"
}

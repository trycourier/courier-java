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

/** A subscription preference topic in your workspace. */
class WorkspacePreferenceTopicGetResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val allowedPreferences: JsonField<List<AllowedPreference>>,
    private val created: JsonField<String>,
    private val defaultStatus: JsonField<DefaultStatus>,
    private val includeUnsubscribeHeader: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val routingOptions: JsonField<List<ChannelClassification>>,
    private val topicData: JsonField<TopicData>,
    private val updated: JsonField<String>,
    private val creator: JsonField<String>,
    private val updater: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("allowed_preferences")
        @ExcludeMissing
        allowedPreferences: JsonField<List<AllowedPreference>> = JsonMissing.of(),
        @JsonProperty("created") @ExcludeMissing created: JsonField<String> = JsonMissing.of(),
        @JsonProperty("default_status")
        @ExcludeMissing
        defaultStatus: JsonField<DefaultStatus> = JsonMissing.of(),
        @JsonProperty("include_unsubscribe_header")
        @ExcludeMissing
        includeUnsubscribeHeader: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routing_options")
        @ExcludeMissing
        routingOptions: JsonField<List<ChannelClassification>> = JsonMissing.of(),
        @JsonProperty("topic_data")
        @ExcludeMissing
        topicData: JsonField<TopicData> = JsonMissing.of(),
        @JsonProperty("updated") @ExcludeMissing updated: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creator") @ExcludeMissing creator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updater") @ExcludeMissing updater: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        allowedPreferences,
        created,
        defaultStatus,
        includeUnsubscribeHeader,
        name,
        routingOptions,
        topicData,
        updated,
        creator,
        updater,
        mutableMapOf(),
    )

    /**
     * The preference topic id.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Preference controls a recipient may customize. May be empty.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allowedPreferences(): List<AllowedPreference> =
        allowedPreferences.getRequired("allowed_preferences")

    /**
     * ISO-8601 timestamp of when the topic was created.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): String = created.getRequired("created")

    /**
     * The default subscription status applied when a recipient has not set their own.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultStatus(): DefaultStatus = defaultStatus.getRequired("default_status")

    /**
     * Whether a list-unsubscribe header is included on emails for this topic.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun includeUnsubscribeHeader(): Boolean =
        includeUnsubscribeHeader.getRequired("include_unsubscribe_header")

    /**
     * Human-readable name.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Default channels delivered for this topic. May be empty.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routingOptions(): List<ChannelClassification> =
        routingOptions.getRequired("routing_options")

    /**
     * Arbitrary metadata associated with the topic.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun topicData(): TopicData = topicData.getRequired("topic_data")

    /**
     * ISO-8601 timestamp of the last update.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): String = updated.getRequired("updated")

    /**
     * Id of the creator.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creator(): Optional<String> = creator.getOptional("creator")

    /**
     * Id of the last updater.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updater(): Optional<String> = updater.getOptional("updater")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<String> = created

    /**
     * Returns the raw JSON value of [defaultStatus].
     *
     * Unlike [defaultStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("default_status")
    @ExcludeMissing
    fun _defaultStatus(): JsonField<DefaultStatus> = defaultStatus

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<String> = updated

    /**
     * Returns the raw JSON value of [creator].
     *
     * Unlike [creator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creator") @ExcludeMissing fun _creator(): JsonField<String> = creator

    /**
     * Returns the raw JSON value of [updater].
     *
     * Unlike [updater], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updater") @ExcludeMissing fun _updater(): JsonField<String> = updater

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
         * [WorkspacePreferenceTopicGetResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .allowedPreferences()
         * .created()
         * .defaultStatus()
         * .includeUnsubscribeHeader()
         * .name()
         * .routingOptions()
         * .topicData()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WorkspacePreferenceTopicGetResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var allowedPreferences: JsonField<MutableList<AllowedPreference>>? = null
        private var created: JsonField<String>? = null
        private var defaultStatus: JsonField<DefaultStatus>? = null
        private var includeUnsubscribeHeader: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var routingOptions: JsonField<MutableList<ChannelClassification>>? = null
        private var topicData: JsonField<TopicData>? = null
        private var updated: JsonField<String>? = null
        private var creator: JsonField<String> = JsonMissing.of()
        private var updater: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            workspacePreferenceTopicGetResponse: WorkspacePreferenceTopicGetResponse
        ) = apply {
            id = workspacePreferenceTopicGetResponse.id
            allowedPreferences =
                workspacePreferenceTopicGetResponse.allowedPreferences.map { it.toMutableList() }
            created = workspacePreferenceTopicGetResponse.created
            defaultStatus = workspacePreferenceTopicGetResponse.defaultStatus
            includeUnsubscribeHeader = workspacePreferenceTopicGetResponse.includeUnsubscribeHeader
            name = workspacePreferenceTopicGetResponse.name
            routingOptions =
                workspacePreferenceTopicGetResponse.routingOptions.map { it.toMutableList() }
            topicData = workspacePreferenceTopicGetResponse.topicData
            updated = workspacePreferenceTopicGetResponse.updated
            creator = workspacePreferenceTopicGetResponse.creator
            updater = workspacePreferenceTopicGetResponse.updater
            additionalProperties =
                workspacePreferenceTopicGetResponse.additionalProperties.toMutableMap()
        }

        /** The preference topic id. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Preference controls a recipient may customize. May be empty. */
        fun allowedPreferences(allowedPreferences: List<AllowedPreference>) =
            allowedPreferences(JsonField.of(allowedPreferences))

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

        /** ISO-8601 timestamp of when the topic was created. */
        fun created(created: String) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun created(created: JsonField<String>) = apply { this.created = created }

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

        /** Whether a list-unsubscribe header is included on emails for this topic. */
        fun includeUnsubscribeHeader(includeUnsubscribeHeader: Boolean) =
            includeUnsubscribeHeader(JsonField.of(includeUnsubscribeHeader))

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

        /** Human-readable name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Default channels delivered for this topic. May be empty. */
        fun routingOptions(routingOptions: List<ChannelClassification>) =
            routingOptions(JsonField.of(routingOptions))

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
        fun topicData(topicData: TopicData) = topicData(JsonField.of(topicData))

        /**
         * Sets [Builder.topicData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topicData] with a well-typed [TopicData] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun topicData(topicData: JsonField<TopicData>) = apply { this.topicData = topicData }

        /** ISO-8601 timestamp of the last update. */
        fun updated(updated: String) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updated(updated: JsonField<String>) = apply { this.updated = updated }

        /** Id of the creator. */
        fun creator(creator: String?) = creator(JsonField.ofNullable(creator))

        /** Alias for calling [Builder.creator] with `creator.orElse(null)`. */
        fun creator(creator: Optional<String>) = creator(creator.getOrNull())

        /**
         * Sets [Builder.creator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun creator(creator: JsonField<String>) = apply { this.creator = creator }

        /** Id of the last updater. */
        fun updater(updater: String?) = updater(JsonField.ofNullable(updater))

        /** Alias for calling [Builder.updater] with `updater.orElse(null)`. */
        fun updater(updater: Optional<String>) = updater(updater.getOrNull())

        /**
         * Sets [Builder.updater] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updater] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updater(updater: JsonField<String>) = apply { this.updater = updater }

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
         * Returns an immutable instance of [WorkspacePreferenceTopicGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .allowedPreferences()
         * .created()
         * .defaultStatus()
         * .includeUnsubscribeHeader()
         * .name()
         * .routingOptions()
         * .topicData()
         * .updated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WorkspacePreferenceTopicGetResponse =
            WorkspacePreferenceTopicGetResponse(
                checkRequired("id", id),
                checkRequired("allowedPreferences", allowedPreferences).map { it.toImmutable() },
                checkRequired("created", created),
                checkRequired("defaultStatus", defaultStatus),
                checkRequired("includeUnsubscribeHeader", includeUnsubscribeHeader),
                checkRequired("name", name),
                checkRequired("routingOptions", routingOptions).map { it.toImmutable() },
                checkRequired("topicData", topicData),
                checkRequired("updated", updated),
                creator,
                updater,
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
    fun validate(): WorkspacePreferenceTopicGetResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        allowedPreferences().forEach { it.validate() }
        created()
        defaultStatus().validate()
        includeUnsubscribeHeader()
        name()
        routingOptions().forEach { it.validate() }
        topicData().validate()
        updated()
        creator()
        updater()
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
            (allowedPreferences.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (defaultStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (includeUnsubscribeHeader.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (routingOptions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (topicData.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (if (creator.asKnown().isPresent) 1 else 0) +
            (if (updater.asKnown().isPresent) 1 else 0)

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

        return other is WorkspacePreferenceTopicGetResponse &&
            id == other.id &&
            allowedPreferences == other.allowedPreferences &&
            created == other.created &&
            defaultStatus == other.defaultStatus &&
            includeUnsubscribeHeader == other.includeUnsubscribeHeader &&
            name == other.name &&
            routingOptions == other.routingOptions &&
            topicData == other.topicData &&
            updated == other.updated &&
            creator == other.creator &&
            updater == other.updater &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            allowedPreferences,
            created,
            defaultStatus,
            includeUnsubscribeHeader,
            name,
            routingOptions,
            topicData,
            updated,
            creator,
            updater,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WorkspacePreferenceTopicGetResponse{id=$id, allowedPreferences=$allowedPreferences, created=$created, defaultStatus=$defaultStatus, includeUnsubscribeHeader=$includeUnsubscribeHeader, name=$name, routingOptions=$routingOptions, topicData=$topicData, updated=$updated, creator=$creator, updater=$updater, additionalProperties=$additionalProperties}"
}

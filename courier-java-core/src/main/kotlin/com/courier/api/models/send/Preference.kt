// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.send

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
    private val status: JsonField<Status>,
    private val channelPreferences: JsonField<List<ChannelPreference>>,
    private val rules: JsonField<List<Rule>>,
    private val source: JsonField<Source>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
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
    fun status(): Status = status.getRequired("status")

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
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

        private var status: JsonField<Status>? = null
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

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val OPTED_IN = of("OPTED_IN")

            @JvmField val OPTED_OUT = of("OPTED_OUT")

            @JvmField val REQUIRED = of("REQUIRED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            OPTED_IN,
            OPTED_OUT,
            REQUIRED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPTED_IN,
            OPTED_OUT,
            REQUIRED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                OPTED_IN -> Value.OPTED_IN
                OPTED_OUT -> Value.OPTED_OUT
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
                OPTED_IN -> Known.OPTED_IN
                OPTED_OUT -> Known.OPTED_OUT
                REQUIRED -> Known.REQUIRED
                else -> throw CourierInvalidDataException("Unknown Status: $value")
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

    class ChannelPreference
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val channel: JsonField<Channel>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("channel") @ExcludeMissing channel: JsonField<Channel> = JsonMissing.of()
        ) : this(channel, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun channel(): Channel = channel.getRequired("channel")

        /**
         * Returns the raw JSON value of [channel].
         *
         * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<Channel> = channel

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
             * Returns a mutable builder for constructing an instance of [ChannelPreference].
             *
             * The following fields are required:
             * ```java
             * .channel()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ChannelPreference]. */
        class Builder internal constructor() {

            private var channel: JsonField<Channel>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(channelPreference: ChannelPreference) = apply {
                channel = channelPreference.channel
                additionalProperties = channelPreference.additionalProperties.toMutableMap()
            }

            fun channel(channel: Channel) = channel(JsonField.of(channel))

            /**
             * Sets [Builder.channel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channel] with a well-typed [Channel] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

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
             * Returns an immutable instance of [ChannelPreference].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .channel()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ChannelPreference =
                ChannelPreference(
                    checkRequired("channel", channel),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ChannelPreference = apply {
            if (validated) {
                return@apply
            }

            channel().validate()
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
        internal fun validity(): Int = (channel.asKnown().getOrNull()?.validity() ?: 0)

        class Channel @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val DIRECT_MESSAGE = of("direct_message")

                @JvmField val EMAIL = of("email")

                @JvmField val PUSH = of("push")

                @JvmField val SMS = of("sms")

                @JvmField val WEBHOOK = of("webhook")

                @JvmField val INBOX = of("inbox")

                @JvmStatic fun of(value: String) = Channel(JsonField.of(value))
            }

            /** An enum containing [Channel]'s known values. */
            enum class Known {
                DIRECT_MESSAGE,
                EMAIL,
                PUSH,
                SMS,
                WEBHOOK,
                INBOX,
            }

            /**
             * An enum containing [Channel]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Channel] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DIRECT_MESSAGE,
                EMAIL,
                PUSH,
                SMS,
                WEBHOOK,
                INBOX,
                /**
                 * An enum member indicating that [Channel] was instantiated with an unknown value.
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
                    DIRECT_MESSAGE -> Value.DIRECT_MESSAGE
                    EMAIL -> Value.EMAIL
                    PUSH -> Value.PUSH
                    SMS -> Value.SMS
                    WEBHOOK -> Value.WEBHOOK
                    INBOX -> Value.INBOX
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
                    DIRECT_MESSAGE -> Known.DIRECT_MESSAGE
                    EMAIL -> Known.EMAIL
                    PUSH -> Known.PUSH
                    SMS -> Known.SMS
                    WEBHOOK -> Known.WEBHOOK
                    INBOX -> Known.INBOX
                    else -> throw CourierInvalidDataException("Unknown Channel: $value")
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

            fun validate(): Channel = apply {
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

                return other is Channel && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ChannelPreference &&
                channel == other.channel &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(channel, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ChannelPreference{channel=$channel, additionalProperties=$additionalProperties}"
    }

    class Rule
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val until: JsonField<String>,
        private val start: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("until") @ExcludeMissing until: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start") @ExcludeMissing start: JsonField<String> = JsonMissing.of(),
        ) : this(until, start, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun until(): String = until.getRequired("until")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun start(): Optional<String> = start.getOptional("start")

        /**
         * Returns the raw JSON value of [until].
         *
         * Unlike [until], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("until") @ExcludeMissing fun _until(): JsonField<String> = until

        /**
         * Returns the raw JSON value of [start].
         *
         * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<String> = start

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
             * Returns a mutable builder for constructing an instance of [Rule].
             *
             * The following fields are required:
             * ```java
             * .until()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Rule]. */
        class Builder internal constructor() {

            private var until: JsonField<String>? = null
            private var start: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(rule: Rule) = apply {
                until = rule.until
                start = rule.start
                additionalProperties = rule.additionalProperties.toMutableMap()
            }

            fun until(until: String) = until(JsonField.of(until))

            /**
             * Sets [Builder.until] to an arbitrary JSON value.
             *
             * You should usually call [Builder.until] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun until(until: JsonField<String>) = apply { this.until = until }

            fun start(start: String?) = start(JsonField.ofNullable(start))

            /** Alias for calling [Builder.start] with `start.orElse(null)`. */
            fun start(start: Optional<String>) = start(start.getOrNull())

            /**
             * Sets [Builder.start] to an arbitrary JSON value.
             *
             * You should usually call [Builder.start] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun start(start: JsonField<String>) = apply { this.start = start }

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
             * Returns an immutable instance of [Rule].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .until()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Rule =
                Rule(checkRequired("until", until), start, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Rule = apply {
            if (validated) {
                return@apply
            }

            until()
            start()
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
            (if (until.asKnown().isPresent) 1 else 0) + (if (start.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Rule &&
                until == other.until &&
                start == other.start &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(until, start, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rule{until=$until, start=$start, additionalProperties=$additionalProperties}"
    }

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

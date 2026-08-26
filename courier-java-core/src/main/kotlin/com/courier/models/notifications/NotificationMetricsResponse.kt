// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.Enum
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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class NotificationMetricsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val end: JsonField<OffsetDateTime>,
    private val granularity: JsonField<Granularity>,
    private val notificationId: JsonField<String>,
    private val series: JsonField<List<Series>>,
    private val start: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("end") @ExcludeMissing end: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("granularity")
        @ExcludeMissing
        granularity: JsonField<Granularity> = JsonMissing.of(),
        @JsonProperty("notificationId")
        @ExcludeMissing
        notificationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("series") @ExcludeMissing series: JsonField<List<Series>> = JsonMissing.of(),
        @JsonProperty("start") @ExcludeMissing start: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(end, granularity, notificationId, series, start, mutableMapOf())

    /**
     * End of the window actually queried, ceiled onto the granularity grid. Second-precision UTC.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun end(): OffsetDateTime = end.getRequired("end")

    /**
     * Bucket size the series was built at.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun granularity(): Granularity = granularity.getRequired("granularity")

    /**
     * The template the series describes, echoed from the request.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun notificationId(): String = notificationId.getRequired("notificationId")

    /**
     * One entry per bucket between `start` and `end`, oldest first, including buckets with no
     * activity.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun series(): List<Series> = series.getRequired("series")

    /**
     * Inclusive start of the window actually queried, floored onto the granularity grid.
     * Second-precision UTC.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun start(): OffsetDateTime = start.getRequired("start")

    /**
     * Returns the raw JSON value of [end].
     *
     * Unlike [end], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end") @ExcludeMissing fun _end(): JsonField<OffsetDateTime> = end

    /**
     * Returns the raw JSON value of [granularity].
     *
     * Unlike [granularity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("granularity")
    @ExcludeMissing
    fun _granularity(): JsonField<Granularity> = granularity

    /**
     * Returns the raw JSON value of [notificationId].
     *
     * Unlike [notificationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notificationId")
    @ExcludeMissing
    fun _notificationId(): JsonField<String> = notificationId

    /**
     * Returns the raw JSON value of [series].
     *
     * Unlike [series], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("series") @ExcludeMissing fun _series(): JsonField<List<Series>> = series

    /**
     * Returns the raw JSON value of [start].
     *
     * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<OffsetDateTime> = start

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
         * Returns a mutable builder for constructing an instance of [NotificationMetricsResponse].
         *
         * The following fields are required:
         * ```java
         * .end()
         * .granularity()
         * .notificationId()
         * .series()
         * .start()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationMetricsResponse]. */
    class Builder internal constructor() {

        private var end: JsonField<OffsetDateTime>? = null
        private var granularity: JsonField<Granularity>? = null
        private var notificationId: JsonField<String>? = null
        private var series: JsonField<MutableList<Series>>? = null
        private var start: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(notificationMetricsResponse: NotificationMetricsResponse) = apply {
            end = notificationMetricsResponse.end
            granularity = notificationMetricsResponse.granularity
            notificationId = notificationMetricsResponse.notificationId
            series = notificationMetricsResponse.series.map { it.toMutableList() }
            start = notificationMetricsResponse.start
            additionalProperties = notificationMetricsResponse.additionalProperties.toMutableMap()
        }

        /**
         * End of the window actually queried, ceiled onto the granularity grid. Second-precision
         * UTC.
         */
        fun end(end: OffsetDateTime) = end(JsonField.of(end))

        /**
         * Sets [Builder.end] to an arbitrary JSON value.
         *
         * You should usually call [Builder.end] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun end(end: JsonField<OffsetDateTime>) = apply { this.end = end }

        /** Bucket size the series was built at. */
        fun granularity(granularity: Granularity) = granularity(JsonField.of(granularity))

        /**
         * Sets [Builder.granularity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.granularity] with a well-typed [Granularity] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun granularity(granularity: JsonField<Granularity>) = apply {
            this.granularity = granularity
        }

        /** The template the series describes, echoed from the request. */
        fun notificationId(notificationId: String) = notificationId(JsonField.of(notificationId))

        /**
         * Sets [Builder.notificationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notificationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notificationId(notificationId: JsonField<String>) = apply {
            this.notificationId = notificationId
        }

        /**
         * One entry per bucket between `start` and `end`, oldest first, including buckets with no
         * activity.
         */
        fun series(series: List<Series>) = series(JsonField.of(series))

        /**
         * Sets [Builder.series] to an arbitrary JSON value.
         *
         * You should usually call [Builder.series] with a well-typed `List<Series>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun series(series: JsonField<List<Series>>) = apply {
            this.series = series.map { it.toMutableList() }
        }

        /**
         * Adds a single [Series] to [Builder.series].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeries(series: Series) = apply {
            this.series =
                (this.series ?: JsonField.of(mutableListOf())).also {
                    checkKnown("series", it).add(series)
                }
        }

        /**
         * Inclusive start of the window actually queried, floored onto the granularity grid.
         * Second-precision UTC.
         */
        fun start(start: OffsetDateTime) = start(JsonField.of(start))

        /**
         * Sets [Builder.start] to an arbitrary JSON value.
         *
         * You should usually call [Builder.start] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun start(start: JsonField<OffsetDateTime>) = apply { this.start = start }

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
         * Returns an immutable instance of [NotificationMetricsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .end()
         * .granularity()
         * .notificationId()
         * .series()
         * .start()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NotificationMetricsResponse =
            NotificationMetricsResponse(
                checkRequired("end", end),
                checkRequired("granularity", granularity),
                checkRequired("notificationId", notificationId),
                checkRequired("series", series).map { it.toImmutable() },
                checkRequired("start", start),
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
    fun validate(): NotificationMetricsResponse = apply {
        if (validated) {
            return@apply
        }

        end()
        granularity().validate()
        notificationId()
        series().forEach { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (end.asKnown().isPresent) 1 else 0) +
            (granularity.asKnown().getOrNull()?.validity() ?: 0) +
            (if (notificationId.asKnown().isPresent) 1 else 0) +
            (series.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (start.asKnown().isPresent) 1 else 0)

    /** Bucket size the series was built at. */
    class Granularity @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val HOUR = of("HOUR")

            @JvmField val DAY = of("DAY")

            @JvmField val WEEK = of("WEEK")

            @JvmField val MONTH = of("MONTH")

            @JvmStatic fun of(value: String) = Granularity(JsonField.of(value))
        }

        /** An enum containing [Granularity]'s known values. */
        enum class Known {
            HOUR,
            DAY,
            WEEK,
            MONTH,
        }

        /**
         * An enum containing [Granularity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Granularity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HOUR,
            DAY,
            WEEK,
            MONTH,
            /**
             * An enum member indicating that [Granularity] was instantiated with an unknown value.
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
                HOUR -> Value.HOUR
                DAY -> Value.DAY
                WEEK -> Value.WEEK
                MONTH -> Value.MONTH
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
                HOUR -> Known.HOUR
                DAY -> Known.DAY
                WEEK -> Known.WEEK
                MONTH -> Known.MONTH
                else -> throw CourierInvalidDataException("Unknown Granularity: $value")
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
        fun validate(): Granularity = apply {
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

            return other is Granularity && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Series
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val data: JsonField<List<Data>>,
        private val period: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
            @JsonProperty("period")
            @ExcludeMissing
            period: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(data, period, mutableMapOf())

        /**
         * One entry per provider and channel that handled a message in this bucket. Empty when
         * nothing was sent.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun data(): List<Data> = data.getRequired("data")

        /**
         * Start of the bucket, second-precision UTC.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun period(): OffsetDateTime = period.getRequired("period")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

        /**
         * Returns the raw JSON value of [period].
         *
         * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<OffsetDateTime> = period

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
             * Returns a mutable builder for constructing an instance of [Series].
             *
             * The following fields are required:
             * ```java
             * .data()
             * .period()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Series]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<Data>>? = null
            private var period: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(series: Series) = apply {
                data = series.data.map { it.toMutableList() }
                period = series.period
                additionalProperties = series.additionalProperties.toMutableMap()
            }

            /**
             * One entry per provider and channel that handled a message in this bucket. Empty when
             * nothing was sent.
             */
            fun data(data: List<Data>) = data(JsonField.of(data))

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed `List<Data>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun data(data: JsonField<List<Data>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [Data] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: Data) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            /** Start of the bucket, second-precision UTC. */
            fun period(period: OffsetDateTime) = period(JsonField.of(period))

            /**
             * Sets [Builder.period] to an arbitrary JSON value.
             *
             * You should usually call [Builder.period] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun period(period: JsonField<OffsetDateTime>) = apply { this.period = period }

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
             * Returns an immutable instance of [Series].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .data()
             * .period()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Series =
                Series(
                    checkRequired("data", data).map { it.toImmutable() },
                    checkRequired("period", period),
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
        fun validate(): Series = apply {
            if (validated) {
                return@apply
            }

            data().forEach { it.validate() }
            period()
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
            (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (period.asKnown().isPresent) 1 else 0)

        class Data
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val channel: JsonField<String>,
            private val clicked: JsonField<Long>,
            private val delivered: JsonField<Long>,
            private val errors: JsonField<Long>,
            private val opened: JsonField<Long>,
            private val provider: JsonField<String>,
            private val sent: JsonField<Long>,
            private val undeliverable: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("channel")
                @ExcludeMissing
                channel: JsonField<String> = JsonMissing.of(),
                @JsonProperty("clicked")
                @ExcludeMissing
                clicked: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("delivered")
                @ExcludeMissing
                delivered: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("errors") @ExcludeMissing errors: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("opened") @ExcludeMissing opened: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("provider")
                @ExcludeMissing
                provider: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sent") @ExcludeMissing sent: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("undeliverable")
                @ExcludeMissing
                undeliverable: JsonField<Long> = JsonMissing.of(),
            ) : this(
                channel,
                clicked,
                delivered,
                errors,
                opened,
                provider,
                sent,
                undeliverable,
                mutableMapOf(),
            )

            /**
             * Channel the provider delivered on, e.g. `email`.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun channel(): String = channel.getRequired("channel")

            /**
             * Messages with at least one tracked link click.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun clicked(): Long = clicked.getRequired("clicked")

            /**
             * Messages the provider confirmed as delivered.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun delivered(): Long = delivered.getRequired("delivered")

            /**
             * Messages the provider rejected or failed on, including ones a later provider then
             * delivered.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun errors(): Long = errors.getRequired("errors")

            /**
             * Messages opened at least once. Always `0` on channels with no open tracking.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun opened(): Long = opened.getRequired("opened")

            /**
             * Provider that handled the messages, e.g. `sendgrid`.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun provider(): String = provider.getRequired("provider")

            /**
             * Messages handed to the provider.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun sent(): Long = sent.getRequired("sent")

            /**
             * Messages Courier could not deliver on any provider for the channel.
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun undeliverable(): Long = undeliverable.getRequired("undeliverable")

            /**
             * Returns the raw JSON value of [channel].
             *
             * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<String> = channel

            /**
             * Returns the raw JSON value of [clicked].
             *
             * Unlike [clicked], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("clicked") @ExcludeMissing fun _clicked(): JsonField<Long> = clicked

            /**
             * Returns the raw JSON value of [delivered].
             *
             * Unlike [delivered], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("delivered") @ExcludeMissing fun _delivered(): JsonField<Long> = delivered

            /**
             * Returns the raw JSON value of [errors].
             *
             * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<Long> = errors

            /**
             * Returns the raw JSON value of [opened].
             *
             * Unlike [opened], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("opened") @ExcludeMissing fun _opened(): JsonField<Long> = opened

            /**
             * Returns the raw JSON value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

            /**
             * Returns the raw JSON value of [sent].
             *
             * Unlike [sent], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sent") @ExcludeMissing fun _sent(): JsonField<Long> = sent

            /**
             * Returns the raw JSON value of [undeliverable].
             *
             * Unlike [undeliverable], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("undeliverable")
            @ExcludeMissing
            fun _undeliverable(): JsonField<Long> = undeliverable

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
                 * Returns a mutable builder for constructing an instance of [Data].
                 *
                 * The following fields are required:
                 * ```java
                 * .channel()
                 * .clicked()
                 * .delivered()
                 * .errors()
                 * .opened()
                 * .provider()
                 * .sent()
                 * .undeliverable()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Data]. */
            class Builder internal constructor() {

                private var channel: JsonField<String>? = null
                private var clicked: JsonField<Long>? = null
                private var delivered: JsonField<Long>? = null
                private var errors: JsonField<Long>? = null
                private var opened: JsonField<Long>? = null
                private var provider: JsonField<String>? = null
                private var sent: JsonField<Long>? = null
                private var undeliverable: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(data: Data) = apply {
                    channel = data.channel
                    clicked = data.clicked
                    delivered = data.delivered
                    errors = data.errors
                    opened = data.opened
                    provider = data.provider
                    sent = data.sent
                    undeliverable = data.undeliverable
                    additionalProperties = data.additionalProperties.toMutableMap()
                }

                /** Channel the provider delivered on, e.g. `email`. */
                fun channel(channel: String) = channel(JsonField.of(channel))

                /**
                 * Sets [Builder.channel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.channel] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun channel(channel: JsonField<String>) = apply { this.channel = channel }

                /** Messages with at least one tracked link click. */
                fun clicked(clicked: Long) = clicked(JsonField.of(clicked))

                /**
                 * Sets [Builder.clicked] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clicked] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun clicked(clicked: JsonField<Long>) = apply { this.clicked = clicked }

                /** Messages the provider confirmed as delivered. */
                fun delivered(delivered: Long) = delivered(JsonField.of(delivered))

                /**
                 * Sets [Builder.delivered] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.delivered] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun delivered(delivered: JsonField<Long>) = apply { this.delivered = delivered }

                /**
                 * Messages the provider rejected or failed on, including ones a later provider then
                 * delivered.
                 */
                fun errors(errors: Long) = errors(JsonField.of(errors))

                /**
                 * Sets [Builder.errors] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errors] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun errors(errors: JsonField<Long>) = apply { this.errors = errors }

                /** Messages opened at least once. Always `0` on channels with no open tracking. */
                fun opened(opened: Long) = opened(JsonField.of(opened))

                /**
                 * Sets [Builder.opened] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.opened] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun opened(opened: JsonField<Long>) = apply { this.opened = opened }

                /** Provider that handled the messages, e.g. `sendgrid`. */
                fun provider(provider: String) = provider(JsonField.of(provider))

                /**
                 * Sets [Builder.provider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: JsonField<String>) = apply { this.provider = provider }

                /** Messages handed to the provider. */
                fun sent(sent: Long) = sent(JsonField.of(sent))

                /**
                 * Sets [Builder.sent] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sent] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun sent(sent: JsonField<Long>) = apply { this.sent = sent }

                /** Messages Courier could not deliver on any provider for the channel. */
                fun undeliverable(undeliverable: Long) = undeliverable(JsonField.of(undeliverable))

                /**
                 * Sets [Builder.undeliverable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.undeliverable] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun undeliverable(undeliverable: JsonField<Long>) = apply {
                    this.undeliverable = undeliverable
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Data].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .channel()
                 * .clicked()
                 * .delivered()
                 * .errors()
                 * .opened()
                 * .provider()
                 * .sent()
                 * .undeliverable()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Data =
                    Data(
                        checkRequired("channel", channel),
                        checkRequired("clicked", clicked),
                        checkRequired("delivered", delivered),
                        checkRequired("errors", errors),
                        checkRequired("opened", opened),
                        checkRequired("provider", provider),
                        checkRequired("sent", sent),
                        checkRequired("undeliverable", undeliverable),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Data = apply {
                if (validated) {
                    return@apply
                }

                channel()
                clicked()
                delivered()
                errors()
                opened()
                provider()
                sent()
                undeliverable()
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
                (if (channel.asKnown().isPresent) 1 else 0) +
                    (if (clicked.asKnown().isPresent) 1 else 0) +
                    (if (delivered.asKnown().isPresent) 1 else 0) +
                    (if (errors.asKnown().isPresent) 1 else 0) +
                    (if (opened.asKnown().isPresent) 1 else 0) +
                    (if (provider.asKnown().isPresent) 1 else 0) +
                    (if (sent.asKnown().isPresent) 1 else 0) +
                    (if (undeliverable.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Data &&
                    channel == other.channel &&
                    clicked == other.clicked &&
                    delivered == other.delivered &&
                    errors == other.errors &&
                    opened == other.opened &&
                    provider == other.provider &&
                    sent == other.sent &&
                    undeliverable == other.undeliverable &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    channel,
                    clicked,
                    delivered,
                    errors,
                    opened,
                    provider,
                    sent,
                    undeliverable,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Data{channel=$channel, clicked=$clicked, delivered=$delivered, errors=$errors, opened=$opened, provider=$provider, sent=$sent, undeliverable=$undeliverable, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Series &&
                data == other.data &&
                period == other.period &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(data, period, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Series{data=$data, period=$period, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationMetricsResponse &&
            end == other.end &&
            granularity == other.granularity &&
            notificationId == other.notificationId &&
            series == other.series &&
            start == other.start &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(end, granularity, notificationId, series, start, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotificationMetricsResponse{end=$end, granularity=$granularity, notificationId=$notificationId, series=$series, start=$start, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.Enum
import com.courier.core.JsonField
import com.courier.core.Params
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Fetch the delivery funnel for one Notification Template as a time series — sent, delivered,
 * opened, clicked, errors, and undeliverable — broken out per provider and channel inside each
 * bucket. Sum the entries in a bucket for its totals; there is no bucket-level total.
 *
 * Choose the window absolutely with `start` and `end`, or relatively with `lookback` (an ISO 8601
 * duration). `start` and `end` take precedence when both are supplied, and a request carrying
 * neither defaults to `lookback=P30D`. The window is snapped outwards onto the `granularity` grid
 * so every bucket it overlaps is returned whole, and the snapped boundaries come back as `start`
 * and `end` — align a chart on those rather than on what was requested. Every boundary is UTC;
 * there is no timezone support.
 *
 * Every bucket in the window is returned, including the quiet ones, whose `data` array is empty, so
 * a series is directly plottable with no gap filling client-side. An unknown template id returns
 * `200` with an all-empty series rather than `404`, and messages sent without a Notification
 * Template never appear here.
 *
 * Available in the US region only.
 */
class NotificationGetMetricsParams
private constructor(
    private val id: String?,
    private val end: OffsetDateTime?,
    private val granularity: Granularity?,
    private val lookback: String?,
    private val start: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * The end of the window, as an ISO 8601 timestamp with an offset. Must be supplied together
     * with `start`. An `end` in the future is accepted and not clamped — the trailing buckets come
     * back empty.
     */
    fun end(): Optional<OffsetDateTime> = Optional.ofNullable(end)

    /**
     * The size of each bucket in the series. Defaults to `DAY`. `WEEK` buckets start on Sunday. A
     * fine granularity caps the window it can cover: `HOUR` spans at most 7 days and `DAY` at most
     * 90 days, and a wider window returns `400` — request a coarser granularity instead. `WEEK` and
     * `MONTH` are uncapped, subject to the 1000-bucket limit on a single response.
     */
    fun granularity(): Optional<Granularity> = Optional.ofNullable(granularity)

    /**
     * The length of the window, counted back from now, as an ISO 8601 duration (`P30D`, `P12W`,
     * `PT12H`). Defaults to `P30D`, and is ignored when `start` and `end` are supplied. A malformed
     * or non-positive duration returns `400`.
     */
    fun lookback(): Optional<String> = Optional.ofNullable(lookback)

    /**
     * The inclusive start of the window, as an ISO 8601 timestamp with an offset
     * (`2026-04-01T00:00:00Z`). Must be supplied together with `end` and be earlier than it; either
     * one alone returns `400`.
     */
    fun start(): Optional<OffsetDateTime> = Optional.ofNullable(start)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): NotificationGetMetricsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [NotificationGetMetricsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationGetMetricsParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var end: OffsetDateTime? = null
        private var granularity: Granularity? = null
        private var lookback: String? = null
        private var start: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(notificationGetMetricsParams: NotificationGetMetricsParams) = apply {
            id = notificationGetMetricsParams.id
            end = notificationGetMetricsParams.end
            granularity = notificationGetMetricsParams.granularity
            lookback = notificationGetMetricsParams.lookback
            start = notificationGetMetricsParams.start
            additionalHeaders = notificationGetMetricsParams.additionalHeaders.toBuilder()
            additionalQueryParams = notificationGetMetricsParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * The end of the window, as an ISO 8601 timestamp with an offset. Must be supplied together
         * with `start`. An `end` in the future is accepted and not clamped — the trailing buckets
         * come back empty.
         */
        fun end(end: OffsetDateTime?) = apply { this.end = end }

        /** Alias for calling [Builder.end] with `end.orElse(null)`. */
        fun end(end: Optional<OffsetDateTime>) = end(end.getOrNull())

        /**
         * The size of each bucket in the series. Defaults to `DAY`. `WEEK` buckets start on Sunday.
         * A fine granularity caps the window it can cover: `HOUR` spans at most 7 days and `DAY` at
         * most 90 days, and a wider window returns `400` — request a coarser granularity instead.
         * `WEEK` and `MONTH` are uncapped, subject to the 1000-bucket limit on a single response.
         */
        fun granularity(granularity: Granularity?) = apply { this.granularity = granularity }

        /** Alias for calling [Builder.granularity] with `granularity.orElse(null)`. */
        fun granularity(granularity: Optional<Granularity>) = granularity(granularity.getOrNull())

        /**
         * The length of the window, counted back from now, as an ISO 8601 duration (`P30D`, `P12W`,
         * `PT12H`). Defaults to `P30D`, and is ignored when `start` and `end` are supplied. A
         * malformed or non-positive duration returns `400`.
         */
        fun lookback(lookback: String?) = apply { this.lookback = lookback }

        /** Alias for calling [Builder.lookback] with `lookback.orElse(null)`. */
        fun lookback(lookback: Optional<String>) = lookback(lookback.getOrNull())

        /**
         * The inclusive start of the window, as an ISO 8601 timestamp with an offset
         * (`2026-04-01T00:00:00Z`). Must be supplied together with `end` and be earlier than it;
         * either one alone returns `400`.
         */
        fun start(start: OffsetDateTime?) = apply { this.start = start }

        /** Alias for calling [Builder.start] with `start.orElse(null)`. */
        fun start(start: Optional<OffsetDateTime>) = start(start.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [NotificationGetMetricsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NotificationGetMetricsParams =
            NotificationGetMetricsParams(
                id,
                end,
                granularity,
                lookback,
                start,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                end?.let { put("end", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                granularity?.let { put("granularity", it.toString()) }
                lookback?.let { put("lookback", it) }
                start?.let { put("start", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * The size of each bucket in the series. Defaults to `DAY`. `WEEK` buckets start on Sunday. A
     * fine granularity caps the window it can cover: `HOUR` spans at most 7 days and `DAY` at most
     * 90 days, and a wider window returns `400` — request a coarser granularity instead. `WEEK` and
     * `MONTH` are uncapped, subject to the 1000-bucket limit on a single response.
     */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationGetMetricsParams &&
            id == other.id &&
            end == other.end &&
            granularity == other.granularity &&
            lookback == other.lookback &&
            start == other.start &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            end,
            granularity,
            lookback,
            start,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "NotificationGetMetricsParams{id=$id, end=$end, granularity=$granularity, lookback=$lookback, start=$start, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

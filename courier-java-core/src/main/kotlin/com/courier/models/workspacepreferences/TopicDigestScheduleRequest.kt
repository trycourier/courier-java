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
import com.courier.models.digests.DigestDayOfWeek
import com.courier.models.digests.DigestFrequency
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * One delivery cadence for a topic's digest. Supply `schedule_id` to update an existing schedule in
 * place; omit it and one is assigned and returned. The `schedules` array is a full replacement, so
 * a stored schedule absent from it is deleted along with its delivery rule.
 *
 * Updating by `schedule_id` replaces that schedule rather than merging into it: any field you leave
 * out is cleared. Two of those change delivery silently — an omitted `timezone` reverts the
 * schedule to UTC, and an omitted `is_default` can leave the topic with no default schedule, which
 * is what recipients who have not chosen one fall back to. Restate every field you want to keep.
 */
class TopicDigestScheduleRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val frequency: JsonField<DigestFrequency>,
    private val dayOfMonth: JsonField<Long>,
    private val dayOfWeek: JsonField<DigestDayOfWeek>,
    private val daysOfWeek: JsonField<List<DigestDayOfWeek>>,
    private val disabled: JsonField<Boolean>,
    private val isDefault: JsonField<Boolean>,
    private val scheduleId: JsonField<String>,
    private val time: JsonField<String>,
    private val timezone: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("frequency")
        @ExcludeMissing
        frequency: JsonField<DigestFrequency> = JsonMissing.of(),
        @JsonProperty("day_of_month")
        @ExcludeMissing
        dayOfMonth: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("day_of_week")
        @ExcludeMissing
        dayOfWeek: JsonField<DigestDayOfWeek> = JsonMissing.of(),
        @JsonProperty("days_of_week")
        @ExcludeMissing
        daysOfWeek: JsonField<List<DigestDayOfWeek>> = JsonMissing.of(),
        @JsonProperty("disabled") @ExcludeMissing disabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_default")
        @ExcludeMissing
        isDefault: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("schedule_id")
        @ExcludeMissing
        scheduleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("time") @ExcludeMissing time: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
    ) : this(
        frequency,
        dayOfMonth,
        dayOfWeek,
        daysOfWeek,
        disabled,
        isDefault,
        scheduleId,
        time,
        timezone,
        mutableMapOf(),
    )

    /**
     * How often a digest is delivered. `instant` delivers immediately without batching, and is the
     * one value that takes no `time`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun frequency(): DigestFrequency = frequency.getRequired("frequency")

    /**
     * Required when `frequency` is `monthly`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dayOfMonth(): Optional<Long> = dayOfMonth.getOptional("day_of_month")

    /**
     * Required when `frequency` is `weekly`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dayOfWeek(): Optional<DigestDayOfWeek> = dayOfWeek.getOptional("day_of_week")

    /**
     * Required when `frequency` is `custom_days`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun daysOfWeek(): Optional<List<DigestDayOfWeek>> = daysOfWeek.getOptional("days_of_week")

    /**
     * Whether the schedule is disabled.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun disabled(): Optional<Boolean> = disabled.getOptional("disabled")

    /**
     * The schedule recipients are placed on when they have not chosen one. Set this explicitly
     * rather than relying on array position.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isDefault(): Optional<Boolean> = isDefault.getOptional("is_default")

    /**
     * Identifier of an existing schedule to update. Omit when creating a new one.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduleId(): Optional<String> = scheduleId.getOptional("schedule_id")

    /**
     * 24-hour local delivery time, `HH:MM`. Required for every frequency except `instant`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun time(): Optional<String> = time.getOptional("time")

    /**
     * IANA timezone the `time` and day fields are expressed in, e.g. `America/New_York`. Absent
     * means UTC. Delivery follows the same local wall-clock across daylight-saving changes.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timezone(): Optional<String> = timezone.getOptional("timezone")

    /**
     * Returns the raw JSON value of [frequency].
     *
     * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frequency")
    @ExcludeMissing
    fun _frequency(): JsonField<DigestFrequency> = frequency

    /**
     * Returns the raw JSON value of [dayOfMonth].
     *
     * Unlike [dayOfMonth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("day_of_month") @ExcludeMissing fun _dayOfMonth(): JsonField<Long> = dayOfMonth

    /**
     * Returns the raw JSON value of [dayOfWeek].
     *
     * Unlike [dayOfWeek], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("day_of_week")
    @ExcludeMissing
    fun _dayOfWeek(): JsonField<DigestDayOfWeek> = dayOfWeek

    /**
     * Returns the raw JSON value of [daysOfWeek].
     *
     * Unlike [daysOfWeek], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("days_of_week")
    @ExcludeMissing
    fun _daysOfWeek(): JsonField<List<DigestDayOfWeek>> = daysOfWeek

    /**
     * Returns the raw JSON value of [disabled].
     *
     * Unlike [disabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("disabled") @ExcludeMissing fun _disabled(): JsonField<Boolean> = disabled

    /**
     * Returns the raw JSON value of [isDefault].
     *
     * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_default") @ExcludeMissing fun _isDefault(): JsonField<Boolean> = isDefault

    /**
     * Returns the raw JSON value of [scheduleId].
     *
     * Unlike [scheduleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("schedule_id") @ExcludeMissing fun _scheduleId(): JsonField<String> = scheduleId

    /**
     * Returns the raw JSON value of [time].
     *
     * Unlike [time], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("time") @ExcludeMissing fun _time(): JsonField<String> = time

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

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
         * Returns a mutable builder for constructing an instance of [TopicDigestScheduleRequest].
         *
         * The following fields are required:
         * ```java
         * .frequency()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TopicDigestScheduleRequest]. */
    class Builder internal constructor() {

        private var frequency: JsonField<DigestFrequency>? = null
        private var dayOfMonth: JsonField<Long> = JsonMissing.of()
        private var dayOfWeek: JsonField<DigestDayOfWeek> = JsonMissing.of()
        private var daysOfWeek: JsonField<MutableList<DigestDayOfWeek>>? = null
        private var disabled: JsonField<Boolean> = JsonMissing.of()
        private var isDefault: JsonField<Boolean> = JsonMissing.of()
        private var scheduleId: JsonField<String> = JsonMissing.of()
        private var time: JsonField<String> = JsonMissing.of()
        private var timezone: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(topicDigestScheduleRequest: TopicDigestScheduleRequest) = apply {
            frequency = topicDigestScheduleRequest.frequency
            dayOfMonth = topicDigestScheduleRequest.dayOfMonth
            dayOfWeek = topicDigestScheduleRequest.dayOfWeek
            daysOfWeek = topicDigestScheduleRequest.daysOfWeek.map { it.toMutableList() }
            disabled = topicDigestScheduleRequest.disabled
            isDefault = topicDigestScheduleRequest.isDefault
            scheduleId = topicDigestScheduleRequest.scheduleId
            time = topicDigestScheduleRequest.time
            timezone = topicDigestScheduleRequest.timezone
            additionalProperties = topicDigestScheduleRequest.additionalProperties.toMutableMap()
        }

        /**
         * How often a digest is delivered. `instant` delivers immediately without batching, and is
         * the one value that takes no `time`.
         */
        fun frequency(frequency: DigestFrequency) = frequency(JsonField.of(frequency))

        /**
         * Sets [Builder.frequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequency] with a well-typed [DigestFrequency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frequency(frequency: JsonField<DigestFrequency>) = apply { this.frequency = frequency }

        /** Required when `frequency` is `monthly`. */
        fun dayOfMonth(dayOfMonth: Long) = dayOfMonth(JsonField.of(dayOfMonth))

        /**
         * Sets [Builder.dayOfMonth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dayOfMonth] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dayOfMonth(dayOfMonth: JsonField<Long>) = apply { this.dayOfMonth = dayOfMonth }

        /** Required when `frequency` is `weekly`. */
        fun dayOfWeek(dayOfWeek: DigestDayOfWeek) = dayOfWeek(JsonField.of(dayOfWeek))

        /**
         * Sets [Builder.dayOfWeek] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dayOfWeek] with a well-typed [DigestDayOfWeek] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dayOfWeek(dayOfWeek: JsonField<DigestDayOfWeek>) = apply { this.dayOfWeek = dayOfWeek }

        /** Required when `frequency` is `custom_days`. */
        fun daysOfWeek(daysOfWeek: List<DigestDayOfWeek>) = daysOfWeek(JsonField.of(daysOfWeek))

        /**
         * Sets [Builder.daysOfWeek] to an arbitrary JSON value.
         *
         * You should usually call [Builder.daysOfWeek] with a well-typed `List<DigestDayOfWeek>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun daysOfWeek(daysOfWeek: JsonField<List<DigestDayOfWeek>>) = apply {
            this.daysOfWeek = daysOfWeek.map { it.toMutableList() }
        }

        /**
         * Adds a single [DigestDayOfWeek] to [Builder.daysOfWeek].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDaysOfWeek(daysOfWeek: DigestDayOfWeek) = apply {
            this.daysOfWeek =
                (this.daysOfWeek ?: JsonField.of(mutableListOf())).also {
                    checkKnown("daysOfWeek", it).add(daysOfWeek)
                }
        }

        /** Whether the schedule is disabled. */
        fun disabled(disabled: Boolean) = disabled(JsonField.of(disabled))

        /**
         * Sets [Builder.disabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun disabled(disabled: JsonField<Boolean>) = apply { this.disabled = disabled }

        /**
         * The schedule recipients are placed on when they have not chosen one. Set this explicitly
         * rather than relying on array position.
         */
        fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

        /**
         * Sets [Builder.isDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDefault] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

        /** Identifier of an existing schedule to update. Omit when creating a new one. */
        fun scheduleId(scheduleId: String) = scheduleId(JsonField.of(scheduleId))

        /**
         * Sets [Builder.scheduleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduleId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scheduleId(scheduleId: JsonField<String>) = apply { this.scheduleId = scheduleId }

        /** 24-hour local delivery time, `HH:MM`. Required for every frequency except `instant`. */
        fun time(time: String) = time(JsonField.of(time))

        /**
         * Sets [Builder.time] to an arbitrary JSON value.
         *
         * You should usually call [Builder.time] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun time(time: JsonField<String>) = apply { this.time = time }

        /**
         * IANA timezone the `time` and day fields are expressed in, e.g. `America/New_York`. Absent
         * means UTC. Delivery follows the same local wall-clock across daylight-saving changes.
         */
        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

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
         * Returns an immutable instance of [TopicDigestScheduleRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .frequency()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TopicDigestScheduleRequest =
            TopicDigestScheduleRequest(
                checkRequired("frequency", frequency),
                dayOfMonth,
                dayOfWeek,
                (daysOfWeek ?: JsonMissing.of()).map { it.toImmutable() },
                disabled,
                isDefault,
                scheduleId,
                time,
                timezone,
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
    fun validate(): TopicDigestScheduleRequest = apply {
        if (validated) {
            return@apply
        }

        frequency().validate()
        dayOfMonth()
        dayOfWeek().ifPresent { it.validate() }
        daysOfWeek().ifPresent { it.forEach { it.validate() } }
        disabled()
        isDefault()
        scheduleId()
        time()
        timezone()
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
        (frequency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (dayOfMonth.asKnown().isPresent) 1 else 0) +
            (dayOfWeek.asKnown().getOrNull()?.validity() ?: 0) +
            (daysOfWeek.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (disabled.asKnown().isPresent) 1 else 0) +
            (if (isDefault.asKnown().isPresent) 1 else 0) +
            (if (scheduleId.asKnown().isPresent) 1 else 0) +
            (if (time.asKnown().isPresent) 1 else 0) +
            (if (timezone.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TopicDigestScheduleRequest &&
            frequency == other.frequency &&
            dayOfMonth == other.dayOfMonth &&
            dayOfWeek == other.dayOfWeek &&
            daysOfWeek == other.daysOfWeek &&
            disabled == other.disabled &&
            isDefault == other.isDefault &&
            scheduleId == other.scheduleId &&
            time == other.time &&
            timezone == other.timezone &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            frequency,
            dayOfMonth,
            dayOfWeek,
            daysOfWeek,
            disabled,
            isDefault,
            scheduleId,
            time,
            timezone,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TopicDigestScheduleRequest{frequency=$frequency, dayOfMonth=$dayOfMonth, dayOfWeek=$dayOfWeek, daysOfWeek=$daysOfWeek, disabled=$disabled, isDefault=$isDefault, scheduleId=$scheduleId, time=$time, timezone=$timezone, additionalProperties=$additionalProperties}"
}

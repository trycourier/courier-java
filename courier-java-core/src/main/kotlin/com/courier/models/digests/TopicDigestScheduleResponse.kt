// File generated from our OpenAPI spec by Stainless.

package com.courier.models.digests

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

/** A delivery cadence for a topic's digest, with its assigned id. */
class TopicDigestScheduleResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val scheduleId: JsonField<String>,
    private val created: JsonField<String>,
    private val dayOfMonth: JsonField<Long>,
    private val dayOfWeek: JsonField<DigestDayOfWeek>,
    private val daysOfWeek: JsonField<List<DigestDayOfWeek>>,
    private val disabled: JsonField<Boolean>,
    private val frequency: JsonField<DigestFrequency>,
    private val isDefault: JsonField<Boolean>,
    private val time: JsonField<String>,
    private val timezone: JsonField<String>,
    private val updated: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("schedule_id")
        @ExcludeMissing
        scheduleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created") @ExcludeMissing created: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("frequency")
        @ExcludeMissing
        frequency: JsonField<DigestFrequency> = JsonMissing.of(),
        @JsonProperty("is_default")
        @ExcludeMissing
        isDefault: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("time") @ExcludeMissing time: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated") @ExcludeMissing updated: JsonField<String> = JsonMissing.of(),
    ) : this(
        scheduleId,
        created,
        dayOfMonth,
        dayOfWeek,
        daysOfWeek,
        disabled,
        frequency,
        isDefault,
        time,
        timezone,
        updated,
        mutableMapOf(),
    )

    /**
     * The schedule's identifier, assigned by the server. This is the value the
     * `/digests/schedules/{schedule_id}` endpoints are keyed by.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scheduleId(): String = scheduleId.getRequired("schedule_id")

    /**
     * ISO-8601 timestamp of when the schedule was created.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun created(): Optional<String> = created.getOptional("created")

    /**
     * Day of the month, 1-31.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dayOfMonth(): Optional<Long> = dayOfMonth.getOptional("day_of_month")

    /**
     * A day of the week. Accepted case-insensitively, returned lowercase.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dayOfWeek(): Optional<DigestDayOfWeek> = dayOfWeek.getOptional("day_of_week")

    /**
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
     * Omitted for a stored schedule this enum cannot express. Those schedules never fire, but their
     * `schedule_id` is still returned so the `/digests&#47;*` endpoints remain reachable for them.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frequency(): Optional<DigestFrequency> = frequency.getOptional("frequency")

    /**
     * Whether this is the schedule recipients are placed on by default.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isDefault(): Optional<Boolean> = isDefault.getOptional("is_default")

    /**
     * 24-hour local delivery time, `HH:MM`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun time(): Optional<String> = time.getOptional("time")

    /**
     * IANA timezone the schedule is expressed in. Absent means UTC.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timezone(): Optional<String> = timezone.getOptional("timezone")

    /**
     * ISO-8601 timestamp of the last update.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updated(): Optional<String> = updated.getOptional("updated")

    /**
     * Returns the raw JSON value of [scheduleId].
     *
     * Unlike [scheduleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("schedule_id") @ExcludeMissing fun _scheduleId(): JsonField<String> = scheduleId

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<String> = created

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
     * Returns the raw JSON value of [frequency].
     *
     * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frequency")
    @ExcludeMissing
    fun _frequency(): JsonField<DigestFrequency> = frequency

    /**
     * Returns the raw JSON value of [isDefault].
     *
     * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_default") @ExcludeMissing fun _isDefault(): JsonField<Boolean> = isDefault

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

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<String> = updated

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
         * Returns a mutable builder for constructing an instance of [TopicDigestScheduleResponse].
         *
         * The following fields are required:
         * ```java
         * .scheduleId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TopicDigestScheduleResponse]. */
    class Builder internal constructor() {

        private var scheduleId: JsonField<String>? = null
        private var created: JsonField<String> = JsonMissing.of()
        private var dayOfMonth: JsonField<Long> = JsonMissing.of()
        private var dayOfWeek: JsonField<DigestDayOfWeek> = JsonMissing.of()
        private var daysOfWeek: JsonField<MutableList<DigestDayOfWeek>>? = null
        private var disabled: JsonField<Boolean> = JsonMissing.of()
        private var frequency: JsonField<DigestFrequency> = JsonMissing.of()
        private var isDefault: JsonField<Boolean> = JsonMissing.of()
        private var time: JsonField<String> = JsonMissing.of()
        private var timezone: JsonField<String> = JsonMissing.of()
        private var updated: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(topicDigestScheduleResponse: TopicDigestScheduleResponse) = apply {
            scheduleId = topicDigestScheduleResponse.scheduleId
            created = topicDigestScheduleResponse.created
            dayOfMonth = topicDigestScheduleResponse.dayOfMonth
            dayOfWeek = topicDigestScheduleResponse.dayOfWeek
            daysOfWeek = topicDigestScheduleResponse.daysOfWeek.map { it.toMutableList() }
            disabled = topicDigestScheduleResponse.disabled
            frequency = topicDigestScheduleResponse.frequency
            isDefault = topicDigestScheduleResponse.isDefault
            time = topicDigestScheduleResponse.time
            timezone = topicDigestScheduleResponse.timezone
            updated = topicDigestScheduleResponse.updated
            additionalProperties = topicDigestScheduleResponse.additionalProperties.toMutableMap()
        }

        /**
         * The schedule's identifier, assigned by the server. This is the value the
         * `/digests/schedules/{schedule_id}` endpoints are keyed by.
         */
        fun scheduleId(scheduleId: String) = scheduleId(JsonField.of(scheduleId))

        /**
         * Sets [Builder.scheduleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduleId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scheduleId(scheduleId: JsonField<String>) = apply { this.scheduleId = scheduleId }

        /** ISO-8601 timestamp of when the schedule was created. */
        fun created(created: String) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun created(created: JsonField<String>) = apply { this.created = created }

        /** Day of the month, 1-31. */
        fun dayOfMonth(dayOfMonth: Long) = dayOfMonth(JsonField.of(dayOfMonth))

        /**
         * Sets [Builder.dayOfMonth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dayOfMonth] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dayOfMonth(dayOfMonth: JsonField<Long>) = apply { this.dayOfMonth = dayOfMonth }

        /** A day of the week. Accepted case-insensitively, returned lowercase. */
        fun dayOfWeek(dayOfWeek: DigestDayOfWeek) = dayOfWeek(JsonField.of(dayOfWeek))

        /**
         * Sets [Builder.dayOfWeek] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dayOfWeek] with a well-typed [DigestDayOfWeek] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dayOfWeek(dayOfWeek: JsonField<DigestDayOfWeek>) = apply { this.dayOfWeek = dayOfWeek }

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
         * Omitted for a stored schedule this enum cannot express. Those schedules never fire, but
         * their `schedule_id` is still returned so the `/digests&#47;*` endpoints remain reachable
         * for them.
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

        /** Whether this is the schedule recipients are placed on by default. */
        fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

        /**
         * Sets [Builder.isDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDefault] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

        /** 24-hour local delivery time, `HH:MM`. */
        fun time(time: String) = time(JsonField.of(time))

        /**
         * Sets [Builder.time] to an arbitrary JSON value.
         *
         * You should usually call [Builder.time] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun time(time: JsonField<String>) = apply { this.time = time }

        /** IANA timezone the schedule is expressed in. Absent means UTC. */
        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

        /** ISO-8601 timestamp of the last update. */
        fun updated(updated: String) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun updated(updated: JsonField<String>) = apply { this.updated = updated }

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
         * Returns an immutable instance of [TopicDigestScheduleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .scheduleId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TopicDigestScheduleResponse =
            TopicDigestScheduleResponse(
                checkRequired("scheduleId", scheduleId),
                created,
                dayOfMonth,
                dayOfWeek,
                (daysOfWeek ?: JsonMissing.of()).map { it.toImmutable() },
                disabled,
                frequency,
                isDefault,
                time,
                timezone,
                updated,
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
    fun validate(): TopicDigestScheduleResponse = apply {
        if (validated) {
            return@apply
        }

        scheduleId()
        created()
        dayOfMonth()
        dayOfWeek().ifPresent { it.validate() }
        daysOfWeek().ifPresent { it.forEach { it.validate() } }
        disabled()
        frequency().ifPresent { it.validate() }
        isDefault()
        time()
        timezone()
        updated()
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
        (if (scheduleId.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (dayOfMonth.asKnown().isPresent) 1 else 0) +
            (dayOfWeek.asKnown().getOrNull()?.validity() ?: 0) +
            (daysOfWeek.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (disabled.asKnown().isPresent) 1 else 0) +
            (frequency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isDefault.asKnown().isPresent) 1 else 0) +
            (if (time.asKnown().isPresent) 1 else 0) +
            (if (timezone.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TopicDigestScheduleResponse &&
            scheduleId == other.scheduleId &&
            created == other.created &&
            dayOfMonth == other.dayOfMonth &&
            dayOfWeek == other.dayOfWeek &&
            daysOfWeek == other.daysOfWeek &&
            disabled == other.disabled &&
            frequency == other.frequency &&
            isDefault == other.isDefault &&
            time == other.time &&
            timezone == other.timezone &&
            updated == other.updated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            scheduleId,
            created,
            dayOfMonth,
            dayOfWeek,
            daysOfWeek,
            disabled,
            frequency,
            isDefault,
            time,
            timezone,
            updated,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TopicDigestScheduleResponse{scheduleId=$scheduleId, created=$created, dayOfMonth=$dayOfMonth, dayOfWeek=$dayOfWeek, daysOfWeek=$daysOfWeek, disabled=$disabled, frequency=$frequency, isDefault=$isDefault, time=$time, timezone=$timezone, updated=$updated, additionalProperties=$additionalProperties}"
}

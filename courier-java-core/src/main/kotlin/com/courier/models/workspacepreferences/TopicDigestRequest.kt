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
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A topic's digest configuration: the template that renders it, the cadences it delivers on, and
 * how collected events are retained.
 *
 * Send `null` for the whole object to turn a digest off, which unlinks the template and removes its
 * schedules. There is no `enabled` flag, and `schedules: []` is rejected -- both states are
 * un-deliverable rather than merely off.
 */
class TopicDigestRequest
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
     * The cadences this digest delivers on. At least one is required: a digest with no schedule
     * collects events into an instance that can never fire. Omitting the key on a replace leaves
     * stored schedules untouched; sending `[]` is a `400`.
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
     * Retention rules per category key. Defaults to a single `digest` category retaining `FIRST`.
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
    @JsonProperty("template_id") @ExcludeMissing fun _templateId(): JsonField<String> = templateId

    /**
     * Returns the raw JSON value of [audienceId].
     *
     * Unlike [audienceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audience_id") @ExcludeMissing fun _audienceId(): JsonField<String> = audienceId

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
     * Unlike [triggerEmpty], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [TopicDigestRequest].
         *
         * The following fields are required:
         * ```java
         * .schedules()
         * .templateId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TopicDigestRequest]. */
    class Builder internal constructor() {

        private var schedules: JsonField<MutableList<TopicDigestScheduleRequest>>? = null
        private var templateId: JsonField<String>? = null
        private var audienceId: JsonField<String> = JsonMissing.of()
        private var categories: JsonField<MutableList<TopicDigestCategory>>? = null
        private var triggerEmpty: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(topicDigestRequest: TopicDigestRequest) = apply {
            schedules = topicDigestRequest.schedules.map { it.toMutableList() }
            templateId = topicDigestRequest.templateId
            audienceId = topicDigestRequest.audienceId
            categories = topicDigestRequest.categories.map { it.toMutableList() }
            triggerEmpty = topicDigestRequest.triggerEmpty
            additionalProperties = topicDigestRequest.additionalProperties.toMutableMap()
        }

        /**
         * The cadences this digest delivers on. At least one is required: a digest with no schedule
         * collects events into an instance that can never fire. Omitting the key on a replace
         * leaves stored schedules untouched; sending `[]` is a `400`.
         */
        fun schedules(schedules: List<TopicDigestScheduleRequest>) =
            schedules(JsonField.of(schedules))

        /**
         * Sets [Builder.schedules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.schedules] with a well-typed
         * `List<TopicDigestScheduleRequest>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
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
         * You should usually call [Builder.templateId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

        /** Optional audience the digest is scoped to. */
        fun audienceId(audienceId: String) = audienceId(JsonField.of(audienceId))

        /**
         * Sets [Builder.audienceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audienceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun audienceId(audienceId: JsonField<String>) = apply { this.audienceId = audienceId }

        /**
         * Retention rules per category key. Defaults to a single `digest` category retaining
         * `FIRST`.
         */
        fun categories(categories: List<TopicDigestCategory>) = categories(JsonField.of(categories))

        /**
         * Sets [Builder.categories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.categories] with a well-typed
         * `List<TopicDigestCategory>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
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
         * You should usually call [Builder.triggerEmpty] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [TopicDigestRequest].
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
        fun build(): TopicDigestRequest =
            TopicDigestRequest(
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
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws CourierInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): TopicDigestRequest = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

        return other is TopicDigestRequest &&
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
        "TopicDigestRequest{schedules=$schedules, templateId=$templateId, audienceId=$audienceId, categories=$categories, triggerEmpty=$triggerEmpty, additionalProperties=$additionalProperties}"
}

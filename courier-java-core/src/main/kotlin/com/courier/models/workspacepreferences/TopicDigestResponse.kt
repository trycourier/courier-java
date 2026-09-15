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
import com.courier.models.digests.TopicDigestScheduleResponse
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A topic's digest configuration. */
class TopicDigestResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val categories: JsonField<List<TopicDigestCategory>>,
    private val schedules: JsonField<List<TopicDigestScheduleResponse>>,
    private val templateId: JsonField<String>,
    private val audienceId: JsonField<String>,
    private val created: JsonField<String>,
    private val triggerEmpty: JsonField<Boolean>,
    private val updated: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("categories")
        @ExcludeMissing
        categories: JsonField<List<TopicDigestCategory>> = JsonMissing.of(),
        @JsonProperty("schedules")
        @ExcludeMissing
        schedules: JsonField<List<TopicDigestScheduleResponse>> = JsonMissing.of(),
        @JsonProperty("template_id")
        @ExcludeMissing
        templateId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("audience_id")
        @ExcludeMissing
        audienceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created") @ExcludeMissing created: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trigger_empty")
        @ExcludeMissing
        triggerEmpty: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("updated") @ExcludeMissing updated: JsonField<String> = JsonMissing.of(),
    ) : this(
        categories,
        schedules,
        templateId,
        audienceId,
        created,
        triggerEmpty,
        updated,
        mutableMapOf(),
    )

    /**
     * Retention rules per category key.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun categories(): List<TopicDigestCategory> = categories.getRequired("categories")

    /**
     * The digest's delivery cadences, each with its server-assigned `schedule_id`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun schedules(): List<TopicDigestScheduleResponse> = schedules.getRequired("schedules")

    /**
     * The notification template that renders the digest.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun templateId(): String = templateId.getRequired("template_id")

    /**
     * The audience the digest is scoped to, when set.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun audienceId(): Optional<String> = audienceId.getOptional("audience_id")

    /**
     * ISO-8601 timestamp of when the digest was configured.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun created(): Optional<String> = created.getOptional("created")

    /**
     * Whether the digest is delivered even when nothing was collected.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun triggerEmpty(): Optional<Boolean> = triggerEmpty.getOptional("trigger_empty")

    /**
     * ISO-8601 timestamp of the last update.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updated(): Optional<String> = updated.getOptional("updated")

    /**
     * Returns the raw JSON value of [categories].
     *
     * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("categories")
    @ExcludeMissing
    fun _categories(): JsonField<List<TopicDigestCategory>> = categories

    /**
     * Returns the raw JSON value of [schedules].
     *
     * Unlike [schedules], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("schedules")
    @ExcludeMissing
    fun _schedules(): JsonField<List<TopicDigestScheduleResponse>> = schedules

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
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<String> = created

    /**
     * Returns the raw JSON value of [triggerEmpty].
     *
     * Unlike [triggerEmpty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trigger_empty")
    @ExcludeMissing
    fun _triggerEmpty(): JsonField<Boolean> = triggerEmpty

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
         * Returns a mutable builder for constructing an instance of [TopicDigestResponse].
         *
         * The following fields are required:
         * ```java
         * .categories()
         * .schedules()
         * .templateId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TopicDigestResponse]. */
    class Builder internal constructor() {

        private var categories: JsonField<MutableList<TopicDigestCategory>>? = null
        private var schedules: JsonField<MutableList<TopicDigestScheduleResponse>>? = null
        private var templateId: JsonField<String>? = null
        private var audienceId: JsonField<String> = JsonMissing.of()
        private var created: JsonField<String> = JsonMissing.of()
        private var triggerEmpty: JsonField<Boolean> = JsonMissing.of()
        private var updated: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(topicDigestResponse: TopicDigestResponse) = apply {
            categories = topicDigestResponse.categories.map { it.toMutableList() }
            schedules = topicDigestResponse.schedules.map { it.toMutableList() }
            templateId = topicDigestResponse.templateId
            audienceId = topicDigestResponse.audienceId
            created = topicDigestResponse.created
            triggerEmpty = topicDigestResponse.triggerEmpty
            updated = topicDigestResponse.updated
            additionalProperties = topicDigestResponse.additionalProperties.toMutableMap()
        }

        /** Retention rules per category key. */
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

        /** The digest's delivery cadences, each with its server-assigned `schedule_id`. */
        fun schedules(schedules: List<TopicDigestScheduleResponse>) =
            schedules(JsonField.of(schedules))

        /**
         * Sets [Builder.schedules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.schedules] with a well-typed
         * `List<TopicDigestScheduleResponse>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun schedules(schedules: JsonField<List<TopicDigestScheduleResponse>>) = apply {
            this.schedules = schedules.map { it.toMutableList() }
        }

        /**
         * Adds a single [TopicDigestScheduleResponse] to [schedules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSchedule(schedule: TopicDigestScheduleResponse) = apply {
            schedules =
                (schedules ?: JsonField.of(mutableListOf())).also {
                    checkKnown("schedules", it).add(schedule)
                }
        }

        /** The notification template that renders the digest. */
        fun templateId(templateId: String) = templateId(JsonField.of(templateId))

        /**
         * Sets [Builder.templateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

        /** The audience the digest is scoped to, when set. */
        fun audienceId(audienceId: String) = audienceId(JsonField.of(audienceId))

        /**
         * Sets [Builder.audienceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audienceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun audienceId(audienceId: JsonField<String>) = apply { this.audienceId = audienceId }

        /** ISO-8601 timestamp of when the digest was configured. */
        fun created(created: String) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun created(created: JsonField<String>) = apply { this.created = created }

        /** Whether the digest is delivered even when nothing was collected. */
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
         * Returns an immutable instance of [TopicDigestResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .categories()
         * .schedules()
         * .templateId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TopicDigestResponse =
            TopicDigestResponse(
                checkRequired("categories", categories).map { it.toImmutable() },
                checkRequired("schedules", schedules).map { it.toImmutable() },
                checkRequired("templateId", templateId),
                audienceId,
                created,
                triggerEmpty,
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
    fun validate(): TopicDigestResponse = apply {
        if (validated) {
            return@apply
        }

        categories().forEach { it.validate() }
        schedules().forEach { it.validate() }
        templateId()
        audienceId()
        created()
        triggerEmpty()
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
        (categories.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (schedules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (templateId.asKnown().isPresent) 1 else 0) +
            (if (audienceId.asKnown().isPresent) 1 else 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (triggerEmpty.asKnown().isPresent) 1 else 0) +
            (if (updated.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TopicDigestResponse &&
            categories == other.categories &&
            schedules == other.schedules &&
            templateId == other.templateId &&
            audienceId == other.audienceId &&
            created == other.created &&
            triggerEmpty == other.triggerEmpty &&
            updated == other.updated &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            categories,
            schedules,
            templateId,
            audienceId,
            created,
            triggerEmpty,
            updated,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TopicDigestResponse{categories=$categories, schedules=$schedules, templateId=$templateId, audienceId=$audienceId, created=$created, triggerEmpty=$triggerEmpty, updated=$updated, additionalProperties=$additionalProperties}"
}

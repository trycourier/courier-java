// File generated from our OpenAPI spec by Stainless.

package com.courier.models.digests

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DigestInstance
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val digestInstanceId: JsonField<String>,
    private val eventCount: JsonField<Long>,
    private val status: JsonField<Status>,
    private val userId: JsonField<String>,
    private val categories: JsonField<List<DigestCategory>>,
    private val categoryKeyCounts: JsonField<CategoryKeyCounts>,
    private val createdAt: JsonField<String>,
    private val disabled: JsonField<Boolean>,
    private val tenantId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("digest_instance_id")
        @ExcludeMissing
        digestInstanceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_count") @ExcludeMissing eventCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("categories")
        @ExcludeMissing
        categories: JsonField<List<DigestCategory>> = JsonMissing.of(),
        @JsonProperty("category_key_counts")
        @ExcludeMissing
        categoryKeyCounts: JsonField<CategoryKeyCounts> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("disabled") @ExcludeMissing disabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
    ) : this(
        digestInstanceId,
        eventCount,
        status,
        userId,
        categories,
        categoryKeyCounts,
        createdAt,
        disabled,
        tenantId,
        mutableMapOf(),
    )

    /**
     * A unique identifier for the digest instance.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun digestInstanceId(): String = digestInstanceId.getRequired("digest_instance_id")

    /**
     * The total number of events received for this instance.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventCount(): Long = eventCount.getRequired("event_count")

    /**
     * The status of the digest instance. `IN_PROGRESS` instances are still accumulating events;
     * `COMPLETED` instances have been released.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The ID of the user this digest instance belongs to.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("user_id")

    /**
     * The categories configured for the digest.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun categories(): Optional<List<DigestCategory>> = categories.getOptional("categories")

    /**
     * A map of category key to the number of events received for that category.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun categoryKeyCounts(): Optional<CategoryKeyCounts> =
        categoryKeyCounts.getOptional("category_key_counts")

    /**
     * An ISO 8601 timestamp of when the digest instance was created.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * Whether the digest instance has been disabled.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun disabled(): Optional<Boolean> = disabled.getOptional("disabled")

    /**
     * The ID of the tenant this digest instance belongs to, if any.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tenantId(): Optional<String> = tenantId.getOptional("tenant_id")

    /**
     * Returns the raw JSON value of [digestInstanceId].
     *
     * Unlike [digestInstanceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("digest_instance_id")
    @ExcludeMissing
    fun _digestInstanceId(): JsonField<String> = digestInstanceId

    /**
     * Returns the raw JSON value of [eventCount].
     *
     * Unlike [eventCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_count") @ExcludeMissing fun _eventCount(): JsonField<Long> = eventCount

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [categories].
     *
     * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("categories")
    @ExcludeMissing
    fun _categories(): JsonField<List<DigestCategory>> = categories

    /**
     * Returns the raw JSON value of [categoryKeyCounts].
     *
     * Unlike [categoryKeyCounts], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("category_key_counts")
    @ExcludeMissing
    fun _categoryKeyCounts(): JsonField<CategoryKeyCounts> = categoryKeyCounts

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [disabled].
     *
     * Unlike [disabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("disabled") @ExcludeMissing fun _disabled(): JsonField<Boolean> = disabled

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

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
         * Returns a mutable builder for constructing an instance of [DigestInstance].
         *
         * The following fields are required:
         * ```java
         * .digestInstanceId()
         * .eventCount()
         * .status()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DigestInstance]. */
    class Builder internal constructor() {

        private var digestInstanceId: JsonField<String>? = null
        private var eventCount: JsonField<Long>? = null
        private var status: JsonField<Status>? = null
        private var userId: JsonField<String>? = null
        private var categories: JsonField<MutableList<DigestCategory>>? = null
        private var categoryKeyCounts: JsonField<CategoryKeyCounts> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var disabled: JsonField<Boolean> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(digestInstance: DigestInstance) = apply {
            digestInstanceId = digestInstance.digestInstanceId
            eventCount = digestInstance.eventCount
            status = digestInstance.status
            userId = digestInstance.userId
            categories = digestInstance.categories.map { it.toMutableList() }
            categoryKeyCounts = digestInstance.categoryKeyCounts
            createdAt = digestInstance.createdAt
            disabled = digestInstance.disabled
            tenantId = digestInstance.tenantId
            additionalProperties = digestInstance.additionalProperties.toMutableMap()
        }

        /** A unique identifier for the digest instance. */
        fun digestInstanceId(digestInstanceId: String) =
            digestInstanceId(JsonField.of(digestInstanceId))

        /**
         * Sets [Builder.digestInstanceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.digestInstanceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun digestInstanceId(digestInstanceId: JsonField<String>) = apply {
            this.digestInstanceId = digestInstanceId
        }

        /** The total number of events received for this instance. */
        fun eventCount(eventCount: Long) = eventCount(JsonField.of(eventCount))

        /**
         * Sets [Builder.eventCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eventCount(eventCount: JsonField<Long>) = apply { this.eventCount = eventCount }

        /**
         * The status of the digest instance. `IN_PROGRESS` instances are still accumulating events;
         * `COMPLETED` instances have been released.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The ID of the user this digest instance belongs to. */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** The categories configured for the digest. */
        fun categories(categories: List<DigestCategory>) = categories(JsonField.of(categories))

        /**
         * Sets [Builder.categories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.categories] with a well-typed `List<DigestCategory>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun categories(categories: JsonField<List<DigestCategory>>) = apply {
            this.categories = categories.map { it.toMutableList() }
        }

        /**
         * Adds a single [DigestCategory] to [categories].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCategory(category: DigestCategory) = apply {
            categories =
                (categories ?: JsonField.of(mutableListOf())).also {
                    checkKnown("categories", it).add(category)
                }
        }

        /** A map of category key to the number of events received for that category. */
        fun categoryKeyCounts(categoryKeyCounts: CategoryKeyCounts) =
            categoryKeyCounts(JsonField.of(categoryKeyCounts))

        /**
         * Sets [Builder.categoryKeyCounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.categoryKeyCounts] with a well-typed [CategoryKeyCounts]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun categoryKeyCounts(categoryKeyCounts: JsonField<CategoryKeyCounts>) = apply {
            this.categoryKeyCounts = categoryKeyCounts
        }

        /** An ISO 8601 timestamp of when the digest instance was created. */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** Whether the digest instance has been disabled. */
        fun disabled(disabled: Boolean) = disabled(JsonField.of(disabled))

        /**
         * Sets [Builder.disabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun disabled(disabled: JsonField<Boolean>) = apply { this.disabled = disabled }

        /** The ID of the tenant this digest instance belongs to, if any. */
        fun tenantId(tenantId: String?) = tenantId(JsonField.ofNullable(tenantId))

        /** Alias for calling [Builder.tenantId] with `tenantId.orElse(null)`. */
        fun tenantId(tenantId: Optional<String>) = tenantId(tenantId.getOrNull())

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

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
         * Returns an immutable instance of [DigestInstance].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .digestInstanceId()
         * .eventCount()
         * .status()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DigestInstance =
            DigestInstance(
                checkRequired("digestInstanceId", digestInstanceId),
                checkRequired("eventCount", eventCount),
                checkRequired("status", status),
                checkRequired("userId", userId),
                (categories ?: JsonMissing.of()).map { it.toImmutable() },
                categoryKeyCounts,
                createdAt,
                disabled,
                tenantId,
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
    fun validate(): DigestInstance = apply {
        if (validated) {
            return@apply
        }

        digestInstanceId()
        eventCount()
        status().validate()
        userId()
        categories().ifPresent { it.forEach { it.validate() } }
        categoryKeyCounts().ifPresent { it.validate() }
        createdAt()
        disabled()
        tenantId()
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
        (if (digestInstanceId.asKnown().isPresent) 1 else 0) +
            (if (eventCount.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (categories.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (categoryKeyCounts.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (disabled.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0)

    /**
     * The status of the digest instance. `IN_PROGRESS` instances are still accumulating events;
     * `COMPLETED` instances have been released.
     */
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

            @JvmField val IN_PROGRESS = of("IN_PROGRESS")

            @JvmField val COMPLETED = of("COMPLETED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            IN_PROGRESS,
            COMPLETED,
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
            IN_PROGRESS,
            COMPLETED,
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
                IN_PROGRESS -> Value.IN_PROGRESS
                COMPLETED -> Value.COMPLETED
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
                IN_PROGRESS -> Known.IN_PROGRESS
                COMPLETED -> Known.COMPLETED
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CourierInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    /** A map of category key to the number of events received for that category. */
    class CategoryKeyCounts
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

            /** Returns a mutable builder for constructing an instance of [CategoryKeyCounts]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CategoryKeyCounts]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(categoryKeyCounts: CategoryKeyCounts) = apply {
                additionalProperties = categoryKeyCounts.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CategoryKeyCounts].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CategoryKeyCounts = CategoryKeyCounts(additionalProperties.toImmutable())
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
        fun validate(): CategoryKeyCounts = apply {
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

            return other is CategoryKeyCounts && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CategoryKeyCounts{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DigestInstance &&
            digestInstanceId == other.digestInstanceId &&
            eventCount == other.eventCount &&
            status == other.status &&
            userId == other.userId &&
            categories == other.categories &&
            categoryKeyCounts == other.categoryKeyCounts &&
            createdAt == other.createdAt &&
            disabled == other.disabled &&
            tenantId == other.tenantId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            digestInstanceId,
            eventCount,
            status,
            userId,
            categories,
            categoryKeyCounts,
            createdAt,
            disabled,
            tenantId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DigestInstance{digestInstanceId=$digestInstanceId, eventCount=$eventCount, status=$status, userId=$userId, categories=$categories, categoryKeyCounts=$categoryKeyCounts, createdAt=$createdAt, disabled=$disabled, tenantId=$tenantId, additionalProperties=$additionalProperties}"
}

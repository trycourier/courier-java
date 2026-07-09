// File generated from our OpenAPI spec by Stainless.

package com.courier.models.users.preferences

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
import kotlin.jvm.optionals.getOrNull

class PreferenceBulkUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val errors: JsonField<List<Error>>,
    private val items: JsonField<List<BulkPreferenceTopic>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("errors") @ExcludeMissing errors: JsonField<List<Error>> = JsonMissing.of(),
        @JsonProperty("items")
        @ExcludeMissing
        items: JsonField<List<BulkPreferenceTopic>> = JsonMissing.of(),
    ) : this(errors, items, mutableMapOf())

    /**
     * The topics that could not be applied, each with a reason.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun errors(): List<Error> = errors.getRequired("errors")

    /**
     * The topics that were successfully created or updated.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<BulkPreferenceTopic> = items.getRequired("items")

    /**
     * Returns the raw JSON value of [errors].
     *
     * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<List<Error>> = errors

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items")
    @ExcludeMissing
    fun _items(): JsonField<List<BulkPreferenceTopic>> = items

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
         * Returns a mutable builder for constructing an instance of [PreferenceBulkUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .errors()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreferenceBulkUpdateResponse]. */
    class Builder internal constructor() {

        private var errors: JsonField<MutableList<Error>>? = null
        private var items: JsonField<MutableList<BulkPreferenceTopic>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(preferenceBulkUpdateResponse: PreferenceBulkUpdateResponse) = apply {
            errors = preferenceBulkUpdateResponse.errors.map { it.toMutableList() }
            items = preferenceBulkUpdateResponse.items.map { it.toMutableList() }
            additionalProperties = preferenceBulkUpdateResponse.additionalProperties.toMutableMap()
        }

        /** The topics that could not be applied, each with a reason. */
        fun errors(errors: List<Error>) = errors(JsonField.of(errors))

        /**
         * Sets [Builder.errors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errors] with a well-typed `List<Error>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errors(errors: JsonField<List<Error>>) = apply {
            this.errors = errors.map { it.toMutableList() }
        }

        /**
         * Adds a single [Error] to [errors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addError(error: Error) = apply {
            errors =
                (errors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("errors", it).add(error)
                }
        }

        /** The topics that were successfully created or updated. */
        fun items(items: List<BulkPreferenceTopic>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<BulkPreferenceTopic>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun items(items: JsonField<List<BulkPreferenceTopic>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [BulkPreferenceTopic] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: BulkPreferenceTopic) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
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
         * Returns an immutable instance of [PreferenceBulkUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .errors()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreferenceBulkUpdateResponse =
            PreferenceBulkUpdateResponse(
                checkRequired("errors", errors).map { it.toImmutable() },
                checkRequired("items", items).map { it.toImmutable() },
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
    fun validate(): PreferenceBulkUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        errors().forEach { it.validate() }
        items().forEach { it.validate() }
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
        (errors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** A single topic that could not be applied in a bulk preference request. */
    class Error
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val reason: JsonField<String>,
        private val topicId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("topic_id") @ExcludeMissing topicId: JsonField<String> = JsonMissing.of(),
        ) : this(reason, topicId, mutableMapOf())

        /**
         * A human-readable explanation of why the topic could not be applied.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): String = reason.getRequired("reason")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun topicId(): String = topicId.getRequired("topic_id")

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /**
         * Returns the raw JSON value of [topicId].
         *
         * Unlike [topicId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("topic_id") @ExcludeMissing fun _topicId(): JsonField<String> = topicId

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
             * Returns a mutable builder for constructing an instance of [Error].
             *
             * The following fields are required:
             * ```java
             * .reason()
             * .topicId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Error]. */
        class Builder internal constructor() {

            private var reason: JsonField<String>? = null
            private var topicId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(error: Error) = apply {
                reason = error.reason
                topicId = error.topicId
                additionalProperties = error.additionalProperties.toMutableMap()
            }

            /** A human-readable explanation of why the topic could not be applied. */
            fun reason(reason: String) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun topicId(topicId: String) = topicId(JsonField.of(topicId))

            /**
             * Sets [Builder.topicId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topicId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun topicId(topicId: JsonField<String>) = apply { this.topicId = topicId }

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
             * Returns an immutable instance of [Error].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .reason()
             * .topicId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Error =
                Error(
                    checkRequired("reason", reason),
                    checkRequired("topicId", topicId),
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
        fun validate(): Error = apply {
            if (validated) {
                return@apply
            }

            reason()
            topicId()
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
            (if (reason.asKnown().isPresent) 1 else 0) + (if (topicId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Error &&
                reason == other.reason &&
                topicId == other.topicId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(reason, topicId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Error{reason=$reason, topicId=$topicId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreferenceBulkUpdateResponse &&
            errors == other.errors &&
            items == other.items &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(errors, items, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PreferenceBulkUpdateResponse{errors=$errors, items=$items, additionalProperties=$additionalProperties}"
}

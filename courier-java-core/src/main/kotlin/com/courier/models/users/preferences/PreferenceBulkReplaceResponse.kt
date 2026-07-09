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

class PreferenceBulkReplaceResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val deleted: JsonField<List<String>>,
    private val items: JsonField<List<BulkPreferenceTopic>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("deleted")
        @ExcludeMissing
        deleted: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("items")
        @ExcludeMissing
        items: JsonField<List<BulkPreferenceTopic>> = JsonMissing.of(),
    ) : this(deleted, items, mutableMapOf())

    /**
     * The ids of the overrides that were reset to their topic default.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deleted(): List<String> = deleted.getRequired("deleted")

    /**
     * The complete resulting set of topic overrides for the user.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<BulkPreferenceTopic> = items.getRequired("items")

    /**
     * Returns the raw JSON value of [deleted].
     *
     * Unlike [deleted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deleted") @ExcludeMissing fun _deleted(): JsonField<List<String>> = deleted

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
         * Returns a mutable builder for constructing an instance of
         * [PreferenceBulkReplaceResponse].
         *
         * The following fields are required:
         * ```java
         * .deleted()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreferenceBulkReplaceResponse]. */
    class Builder internal constructor() {

        private var deleted: JsonField<MutableList<String>>? = null
        private var items: JsonField<MutableList<BulkPreferenceTopic>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(preferenceBulkReplaceResponse: PreferenceBulkReplaceResponse) = apply {
            deleted = preferenceBulkReplaceResponse.deleted.map { it.toMutableList() }
            items = preferenceBulkReplaceResponse.items.map { it.toMutableList() }
            additionalProperties = preferenceBulkReplaceResponse.additionalProperties.toMutableMap()
        }

        /** The ids of the overrides that were reset to their topic default. */
        fun deleted(deleted: List<String>) = deleted(JsonField.of(deleted))

        /**
         * Sets [Builder.deleted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deleted] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deleted(deleted: JsonField<List<String>>) = apply {
            this.deleted = deleted.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.deleted].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDeleted(deleted: String) = apply {
            this.deleted =
                (this.deleted ?: JsonField.of(mutableListOf())).also {
                    checkKnown("deleted", it).add(deleted)
                }
        }

        /** The complete resulting set of topic overrides for the user. */
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
         * Returns an immutable instance of [PreferenceBulkReplaceResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .deleted()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreferenceBulkReplaceResponse =
            PreferenceBulkReplaceResponse(
                checkRequired("deleted", deleted).map { it.toImmutable() },
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
    fun validate(): PreferenceBulkReplaceResponse = apply {
        if (validated) {
            return@apply
        }

        deleted()
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
        (deleted.asKnown().getOrNull()?.size ?: 0) +
            (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreferenceBulkReplaceResponse &&
            deleted == other.deleted &&
            items == other.items &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(deleted, items, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PreferenceBulkReplaceResponse{deleted=$deleted, items=$items, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.profiles

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.checkRequired
import com.courier.api.errors.CourierInvalidDataException
import com.courier.api.models.RecipientPreferences
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SubscribeToListsRequestItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val listId: JsonField<String>,
    private val preferences: JsonField<RecipientPreferences>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("listId") @ExcludeMissing listId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("preferences")
        @ExcludeMissing
        preferences: JsonField<RecipientPreferences> = JsonMissing.of(),
    ) : this(listId, preferences, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listId(): String = listId.getRequired("listId")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preferences(): Optional<RecipientPreferences> = preferences.getOptional("preferences")

    /**
     * Returns the raw JSON value of [listId].
     *
     * Unlike [listId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listId") @ExcludeMissing fun _listId(): JsonField<String> = listId

    /**
     * Returns the raw JSON value of [preferences].
     *
     * Unlike [preferences], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("preferences")
    @ExcludeMissing
    fun _preferences(): JsonField<RecipientPreferences> = preferences

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
         * Returns a mutable builder for constructing an instance of [SubscribeToListsRequestItem].
         *
         * The following fields are required:
         * ```java
         * .listId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscribeToListsRequestItem]. */
    class Builder internal constructor() {

        private var listId: JsonField<String>? = null
        private var preferences: JsonField<RecipientPreferences> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscribeToListsRequestItem: SubscribeToListsRequestItem) = apply {
            listId = subscribeToListsRequestItem.listId
            preferences = subscribeToListsRequestItem.preferences
            additionalProperties = subscribeToListsRequestItem.additionalProperties.toMutableMap()
        }

        fun listId(listId: String) = listId(JsonField.of(listId))

        /**
         * Sets [Builder.listId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun listId(listId: JsonField<String>) = apply { this.listId = listId }

        fun preferences(preferences: RecipientPreferences?) =
            preferences(JsonField.ofNullable(preferences))

        /** Alias for calling [Builder.preferences] with `preferences.orElse(null)`. */
        fun preferences(preferences: Optional<RecipientPreferences>) =
            preferences(preferences.getOrNull())

        /**
         * Sets [Builder.preferences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preferences] with a well-typed [RecipientPreferences]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun preferences(preferences: JsonField<RecipientPreferences>) = apply {
            this.preferences = preferences
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
         * Returns an immutable instance of [SubscribeToListsRequestItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .listId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscribeToListsRequestItem =
            SubscribeToListsRequestItem(
                checkRequired("listId", listId),
                preferences,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SubscribeToListsRequestItem = apply {
        if (validated) {
            return@apply
        }

        listId()
        preferences().ifPresent { it.validate() }
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
        (if (listId.asKnown().isPresent) 1 else 0) +
            (preferences.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscribeToListsRequestItem &&
            listId == other.listId &&
            preferences == other.preferences &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(listId, preferences, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscribeToListsRequestItem{listId=$listId, preferences=$preferences, additionalProperties=$additionalProperties}"
}

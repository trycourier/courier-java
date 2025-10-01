// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.preferences

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.checkKnown
import com.courier.api.core.checkRequired
import com.courier.api.core.toImmutable
import com.courier.api.errors.CourierInvalidDataException
import com.courier.api.models.audiences.Paging
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PreferenceRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<TopicPreference>>,
    private val paging: JsonField<Paging>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items")
        @ExcludeMissing
        items: JsonField<List<TopicPreference>> = JsonMissing.of(),
        @JsonProperty("paging") @ExcludeMissing paging: JsonField<Paging> = JsonMissing.of(),
    ) : this(items, paging, mutableMapOf())

    /**
     * The Preferences associated with the user_id.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<TopicPreference> = items.getRequired("items")

    /**
     * Deprecated - Paging not implemented on this endpoint
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paging(): Paging = paging.getRequired("paging")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<TopicPreference>> = items

    /**
     * Returns the raw JSON value of [paging].
     *
     * Unlike [paging], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paging") @ExcludeMissing fun _paging(): JsonField<Paging> = paging

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
         * Returns a mutable builder for constructing an instance of [PreferenceRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * .paging()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreferenceRetrieveResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<TopicPreference>>? = null
        private var paging: JsonField<Paging>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(preferenceRetrieveResponse: PreferenceRetrieveResponse) = apply {
            items = preferenceRetrieveResponse.items.map { it.toMutableList() }
            paging = preferenceRetrieveResponse.paging
            additionalProperties = preferenceRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** The Preferences associated with the user_id. */
        fun items(items: List<TopicPreference>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<TopicPreference>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun items(items: JsonField<List<TopicPreference>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [TopicPreference] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: TopicPreference) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

        /** Deprecated - Paging not implemented on this endpoint */
        fun paging(paging: Paging) = paging(JsonField.of(paging))

        /**
         * Sets [Builder.paging] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paging] with a well-typed [Paging] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

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
         * Returns an immutable instance of [PreferenceRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .items()
         * .paging()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreferenceRetrieveResponse =
            PreferenceRetrieveResponse(
                checkRequired("items", items).map { it.toImmutable() },
                checkRequired("paging", paging),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PreferenceRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
        paging().validate()
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
        (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (paging.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreferenceRetrieveResponse &&
            items == other.items &&
            paging == other.paging &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, paging, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PreferenceRetrieveResponse{items=$items, paging=$paging, additionalProperties=$additionalProperties}"
}

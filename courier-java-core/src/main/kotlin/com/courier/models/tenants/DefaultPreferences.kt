// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.courier.models.ChannelClassification
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DefaultPreferences
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<Item>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of()
    ) : this(items, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun items(): Optional<List<Item>> = items.getOptional("items")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

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

        /** Returns a mutable builder for constructing an instance of [DefaultPreferences]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DefaultPreferences]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(defaultPreferences: DefaultPreferences) = apply {
            items = defaultPreferences.items.map { it.toMutableList() }
            additionalProperties = defaultPreferences.additionalProperties.toMutableMap()
        }

        fun items(items: List<Item>?) = items(JsonField.ofNullable(items))

        /** Alias for calling [Builder.items] with `items.orElse(null)`. */
        fun items(items: Optional<List<Item>>) = items(items.getOrNull())

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: JsonField<List<Item>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [Item] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: Item) = apply {
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
         * Returns an immutable instance of [DefaultPreferences].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DefaultPreferences =
            DefaultPreferences(
                (items ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DefaultPreferences = apply {
        if (validated) {
            return@apply
        }

        items().ifPresent { it.forEach { it.validate() } }
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
        (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Item
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val status: JsonField<SubscriptionTopicNew.Status>,
        private val customRouting: JsonField<List<ChannelClassification>>,
        private val hasCustomRouting: JsonField<Boolean>,
        private val id: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<SubscriptionTopicNew.Status> = JsonMissing.of(),
            @JsonProperty("custom_routing")
            @ExcludeMissing
            customRouting: JsonField<List<ChannelClassification>> = JsonMissing.of(),
            @JsonProperty("has_custom_routing")
            @ExcludeMissing
            hasCustomRouting: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        ) : this(status, customRouting, hasCustomRouting, id, mutableMapOf())

        fun toSubscriptionTopicNew(): SubscriptionTopicNew =
            SubscriptionTopicNew.builder()
                .status(status)
                .customRouting(customRouting)
                .hasCustomRouting(hasCustomRouting)
                .build()

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): SubscriptionTopicNew.Status = status.getRequired("status")

        /**
         * The default channels to send to this tenant when has_custom_routing is enabled
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customRouting(): Optional<List<ChannelClassification>> =
            customRouting.getOptional("custom_routing")

        /**
         * Override channel routing with custom preferences. This will override any template
         * prefernces that are set, but a user can still customize their preferences
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasCustomRouting(): Optional<Boolean> =
            hasCustomRouting.getOptional("has_custom_routing")

        /**
         * Topic ID
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<SubscriptionTopicNew.Status> = status

        /**
         * Returns the raw JSON value of [customRouting].
         *
         * Unlike [customRouting], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_routing")
        @ExcludeMissing
        fun _customRouting(): JsonField<List<ChannelClassification>> = customRouting

        /**
         * Returns the raw JSON value of [hasCustomRouting].
         *
         * Unlike [hasCustomRouting], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("has_custom_routing")
        @ExcludeMissing
        fun _hasCustomRouting(): JsonField<Boolean> = hasCustomRouting

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
             * Returns a mutable builder for constructing an instance of [Item].
             *
             * The following fields are required:
             * ```java
             * .status()
             * .id()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var status: JsonField<SubscriptionTopicNew.Status>? = null
            private var customRouting: JsonField<MutableList<ChannelClassification>>? = null
            private var hasCustomRouting: JsonField<Boolean> = JsonMissing.of()
            private var id: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                status = item.status
                customRouting = item.customRouting.map { it.toMutableList() }
                hasCustomRouting = item.hasCustomRouting
                id = item.id
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            fun status(status: SubscriptionTopicNew.Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed
             * [SubscriptionTopicNew.Status] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun status(status: JsonField<SubscriptionTopicNew.Status>) = apply {
                this.status = status
            }

            /** The default channels to send to this tenant when has_custom_routing is enabled */
            fun customRouting(customRouting: List<ChannelClassification>?) =
                customRouting(JsonField.ofNullable(customRouting))

            /** Alias for calling [Builder.customRouting] with `customRouting.orElse(null)`. */
            fun customRouting(customRouting: Optional<List<ChannelClassification>>) =
                customRouting(customRouting.getOrNull())

            /**
             * Sets [Builder.customRouting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customRouting] with a well-typed
             * `List<ChannelClassification>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun customRouting(customRouting: JsonField<List<ChannelClassification>>) = apply {
                this.customRouting = customRouting.map { it.toMutableList() }
            }

            /**
             * Adds a single [ChannelClassification] to [Builder.customRouting].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCustomRouting(customRouting: ChannelClassification) = apply {
                this.customRouting =
                    (this.customRouting ?: JsonField.of(mutableListOf())).also {
                        checkKnown("customRouting", it).add(customRouting)
                    }
            }

            /**
             * Override channel routing with custom preferences. This will override any template
             * prefernces that are set, but a user can still customize their preferences
             */
            fun hasCustomRouting(hasCustomRouting: Boolean?) =
                hasCustomRouting(JsonField.ofNullable(hasCustomRouting))

            /**
             * Alias for [Builder.hasCustomRouting].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun hasCustomRouting(hasCustomRouting: Boolean) =
                hasCustomRouting(hasCustomRouting as Boolean?)

            /**
             * Alias for calling [Builder.hasCustomRouting] with `hasCustomRouting.orElse(null)`.
             */
            fun hasCustomRouting(hasCustomRouting: Optional<Boolean>) =
                hasCustomRouting(hasCustomRouting.getOrNull())

            /**
             * Sets [Builder.hasCustomRouting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasCustomRouting] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hasCustomRouting(hasCustomRouting: JsonField<Boolean>) = apply {
                this.hasCustomRouting = hasCustomRouting
            }

            /** Topic ID */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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
             * Returns an immutable instance of [Item].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .status()
             * .id()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Item =
                Item(
                    checkRequired("status", status),
                    (customRouting ?: JsonMissing.of()).map { it.toImmutable() },
                    hasCustomRouting,
                    checkRequired("id", id),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            status().validate()
            customRouting().ifPresent { it.forEach { it.validate() } }
            hasCustomRouting()
            id()
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
            (status.asKnown().getOrNull()?.validity() ?: 0) +
                (customRouting.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (hasCustomRouting.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                status == other.status &&
                customRouting == other.customRouting &&
                hasCustomRouting == other.hasCustomRouting &&
                id == other.id &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(status, customRouting, hasCustomRouting, id, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{status=$status, customRouting=$customRouting, hasCustomRouting=$hasCustomRouting, id=$id, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DefaultPreferences &&
            items == other.items &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DefaultPreferences{items=$items, additionalProperties=$additionalProperties}"
}

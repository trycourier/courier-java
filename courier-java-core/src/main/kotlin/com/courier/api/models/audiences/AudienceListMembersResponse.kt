// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.audiences

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.checkKnown
import com.courier.api.core.checkRequired
import com.courier.api.core.toImmutable
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class AudienceListMembersResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<Item>>,
    private val paging: JsonField<Paging>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of(),
        @JsonProperty("paging") @ExcludeMissing paging: JsonField<Paging> = JsonMissing.of(),
    ) : this(items, paging, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<Item> = items.getRequired("items")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paging(): Paging = paging.getRequired("paging")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

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
         * Returns a mutable builder for constructing an instance of [AudienceListMembersResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * .paging()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AudienceListMembersResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var paging: JsonField<Paging>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(audienceListMembersResponse: AudienceListMembersResponse) = apply {
            items = audienceListMembersResponse.items.map { it.toMutableList() }
            paging = audienceListMembersResponse.paging
            additionalProperties = audienceListMembersResponse.additionalProperties.toMutableMap()
        }

        fun items(items: List<Item>) = items(JsonField.of(items))

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
         * Returns an immutable instance of [AudienceListMembersResponse].
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
        fun build(): AudienceListMembersResponse =
            AudienceListMembersResponse(
                checkRequired("items", items).map { it.toImmutable() },
                checkRequired("paging", paging),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AudienceListMembersResponse = apply {
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

    class Item
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val addedAt: JsonField<String>,
        private val audienceId: JsonField<String>,
        private val audienceVersion: JsonField<Long>,
        private val memberId: JsonField<String>,
        private val reason: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("added_at") @ExcludeMissing addedAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("audience_id")
            @ExcludeMissing
            audienceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("audience_version")
            @ExcludeMissing
            audienceVersion: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("member_id")
            @ExcludeMissing
            memberId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        ) : this(addedAt, audienceId, audienceVersion, memberId, reason, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun addedAt(): String = addedAt.getRequired("added_at")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun audienceId(): String = audienceId.getRequired("audience_id")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun audienceVersion(): Long = audienceVersion.getRequired("audience_version")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun memberId(): String = memberId.getRequired("member_id")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): String = reason.getRequired("reason")

        /**
         * Returns the raw JSON value of [addedAt].
         *
         * Unlike [addedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("added_at") @ExcludeMissing fun _addedAt(): JsonField<String> = addedAt

        /**
         * Returns the raw JSON value of [audienceId].
         *
         * Unlike [audienceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("audience_id")
        @ExcludeMissing
        fun _audienceId(): JsonField<String> = audienceId

        /**
         * Returns the raw JSON value of [audienceVersion].
         *
         * Unlike [audienceVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("audience_version")
        @ExcludeMissing
        fun _audienceVersion(): JsonField<Long> = audienceVersion

        /**
         * Returns the raw JSON value of [memberId].
         *
         * Unlike [memberId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("member_id") @ExcludeMissing fun _memberId(): JsonField<String> = memberId

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

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
             * .addedAt()
             * .audienceId()
             * .audienceVersion()
             * .memberId()
             * .reason()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var addedAt: JsonField<String>? = null
            private var audienceId: JsonField<String>? = null
            private var audienceVersion: JsonField<Long>? = null
            private var memberId: JsonField<String>? = null
            private var reason: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                addedAt = item.addedAt
                audienceId = item.audienceId
                audienceVersion = item.audienceVersion
                memberId = item.memberId
                reason = item.reason
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            fun addedAt(addedAt: String) = addedAt(JsonField.of(addedAt))

            /**
             * Sets [Builder.addedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addedAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addedAt(addedAt: JsonField<String>) = apply { this.addedAt = addedAt }

            fun audienceId(audienceId: String) = audienceId(JsonField.of(audienceId))

            /**
             * Sets [Builder.audienceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audienceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun audienceId(audienceId: JsonField<String>) = apply { this.audienceId = audienceId }

            fun audienceVersion(audienceVersion: Long) =
                audienceVersion(JsonField.of(audienceVersion))

            /**
             * Sets [Builder.audienceVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.audienceVersion] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun audienceVersion(audienceVersion: JsonField<Long>) = apply {
                this.audienceVersion = audienceVersion
            }

            fun memberId(memberId: String) = memberId(JsonField.of(memberId))

            /**
             * Sets [Builder.memberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memberId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun memberId(memberId: JsonField<String>) = apply { this.memberId = memberId }

            fun reason(reason: String) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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
             * .addedAt()
             * .audienceId()
             * .audienceVersion()
             * .memberId()
             * .reason()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Item =
                Item(
                    checkRequired("addedAt", addedAt),
                    checkRequired("audienceId", audienceId),
                    checkRequired("audienceVersion", audienceVersion),
                    checkRequired("memberId", memberId),
                    checkRequired("reason", reason),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            addedAt()
            audienceId()
            audienceVersion()
            memberId()
            reason()
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
            (if (addedAt.asKnown().isPresent) 1 else 0) +
                (if (audienceId.asKnown().isPresent) 1 else 0) +
                (if (audienceVersion.asKnown().isPresent) 1 else 0) +
                (if (memberId.asKnown().isPresent) 1 else 0) +
                (if (reason.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                addedAt == other.addedAt &&
                audienceId == other.audienceId &&
                audienceVersion == other.audienceVersion &&
                memberId == other.memberId &&
                reason == other.reason &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                addedAt,
                audienceId,
                audienceVersion,
                memberId,
                reason,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{addedAt=$addedAt, audienceId=$audienceId, audienceVersion=$audienceVersion, memberId=$memberId, reason=$reason, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AudienceListMembersResponse &&
            items == other.items &&
            paging == other.paging &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, paging, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AudienceListMembersResponse{items=$items, paging=$paging, additionalProperties=$additionalProperties}"
}

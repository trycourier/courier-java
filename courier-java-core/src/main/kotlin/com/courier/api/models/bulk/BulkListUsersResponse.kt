// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.bulk

import com.courier.api.core.Enum
import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.checkKnown
import com.courier.api.core.checkRequired
import com.courier.api.core.toImmutable
import com.courier.api.errors.CourierInvalidDataException
import com.courier.api.models.Paging
import com.courier.api.models.RecipientPreferences
import com.courier.api.models.UserRecipient
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BulkListUsersResponse
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
         * Returns a mutable builder for constructing an instance of [BulkListUsersResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * .paging()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BulkListUsersResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var paging: JsonField<Paging>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bulkListUsersResponse: BulkListUsersResponse) = apply {
            items = bulkListUsersResponse.items.map { it.toMutableList() }
            paging = bulkListUsersResponse.paging
            additionalProperties = bulkListUsersResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [BulkListUsersResponse].
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
        fun build(): BulkListUsersResponse =
            BulkListUsersResponse(
                checkRequired("items", items).map { it.toImmutable() },
                checkRequired("paging", paging),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BulkListUsersResponse = apply {
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
        private val data: JsonValue,
        private val preferences: JsonField<RecipientPreferences>,
        private val profile: JsonValue,
        private val recipient: JsonField<String>,
        private val to: JsonField<UserRecipient>,
        private val status: JsonField<Status>,
        private val messageId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") @ExcludeMissing data: JsonValue = JsonMissing.of(),
            @JsonProperty("preferences")
            @ExcludeMissing
            preferences: JsonField<RecipientPreferences> = JsonMissing.of(),
            @JsonProperty("profile") @ExcludeMissing profile: JsonValue = JsonMissing.of(),
            @JsonProperty("recipient")
            @ExcludeMissing
            recipient: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<UserRecipient> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("messageId")
            @ExcludeMissing
            messageId: JsonField<String> = JsonMissing.of(),
        ) : this(data, preferences, profile, recipient, to, status, messageId, mutableMapOf())

        fun toInboundBulkMessageUser(): InboundBulkMessageUser =
            InboundBulkMessageUser.builder()
                .data(data)
                .preferences(preferences)
                .profile(profile)
                .recipient(recipient)
                .to(to)
                .build()

        @JsonProperty("data") @ExcludeMissing fun _data(): JsonValue = data

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun preferences(): Optional<RecipientPreferences> = preferences.getOptional("preferences")

        @JsonProperty("profile") @ExcludeMissing fun _profile(): JsonValue = profile

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recipient(): Optional<String> = recipient.getOptional("recipient")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun to(): Optional<UserRecipient> = to.getOptional("to")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun messageId(): Optional<String> = messageId.getOptional("messageId")

        /**
         * Returns the raw JSON value of [preferences].
         *
         * Unlike [preferences], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preferences")
        @ExcludeMissing
        fun _preferences(): JsonField<RecipientPreferences> = preferences

        /**
         * Returns the raw JSON value of [recipient].
         *
         * Unlike [recipient], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recipient") @ExcludeMissing fun _recipient(): JsonField<String> = recipient

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<UserRecipient> = to

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [messageId].
         *
         * Unlike [messageId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("messageId") @ExcludeMissing fun _messageId(): JsonField<String> = messageId

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
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var data: JsonValue = JsonMissing.of()
            private var preferences: JsonField<RecipientPreferences> = JsonMissing.of()
            private var profile: JsonValue = JsonMissing.of()
            private var recipient: JsonField<String> = JsonMissing.of()
            private var to: JsonField<UserRecipient> = JsonMissing.of()
            private var status: JsonField<Status>? = null
            private var messageId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                data = item.data
                preferences = item.preferences
                profile = item.profile
                recipient = item.recipient
                to = item.to
                status = item.status
                messageId = item.messageId
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            fun data(data: JsonValue) = apply { this.data = data }

            fun preferences(preferences: RecipientPreferences?) =
                preferences(JsonField.ofNullable(preferences))

            /** Alias for calling [Builder.preferences] with `preferences.orElse(null)`. */
            fun preferences(preferences: Optional<RecipientPreferences>) =
                preferences(preferences.getOrNull())

            /**
             * Sets [Builder.preferences] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preferences] with a well-typed
             * [RecipientPreferences] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun preferences(preferences: JsonField<RecipientPreferences>) = apply {
                this.preferences = preferences
            }

            fun profile(profile: JsonValue) = apply { this.profile = profile }

            fun recipient(recipient: String?) = recipient(JsonField.ofNullable(recipient))

            /** Alias for calling [Builder.recipient] with `recipient.orElse(null)`. */
            fun recipient(recipient: Optional<String>) = recipient(recipient.getOrNull())

            /**
             * Sets [Builder.recipient] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipient] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recipient(recipient: JsonField<String>) = apply { this.recipient = recipient }

            fun to(to: UserRecipient?) = to(JsonField.ofNullable(to))

            /** Alias for calling [Builder.to] with `to.orElse(null)`. */
            fun to(to: Optional<UserRecipient>) = to(to.getOrNull())

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [UserRecipient] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun to(to: JsonField<UserRecipient>) = apply { this.to = to }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun messageId(messageId: String?) = messageId(JsonField.ofNullable(messageId))

            /** Alias for calling [Builder.messageId] with `messageId.orElse(null)`. */
            fun messageId(messageId: Optional<String>) = messageId(messageId.getOrNull())

            /**
             * Sets [Builder.messageId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messageId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messageId(messageId: JsonField<String>) = apply { this.messageId = messageId }

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
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Item =
                Item(
                    data,
                    preferences,
                    profile,
                    recipient,
                    to,
                    checkRequired("status", status),
                    messageId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Item = apply {
            if (validated) {
                return@apply
            }

            preferences().ifPresent { it.validate() }
            recipient()
            to().ifPresent { it.validate() }
            status().validate()
            messageId()
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
            (preferences.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recipient.asKnown().isPresent) 1 else 0) +
                (to.asKnown().getOrNull()?.validity() ?: 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (messageId.asKnown().isPresent) 1 else 0)

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PENDING = of("PENDING")

                @JvmField val ENQUEUED = of("ENQUEUED")

                @JvmField val ERROR = of("ERROR")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PENDING,
                ENQUEUED,
                ERROR,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                ENQUEUED,
                ERROR,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PENDING -> Value.PENDING
                    ENQUEUED -> Value.ENQUEUED
                    ERROR -> Value.ERROR
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws CourierInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PENDING -> Known.PENDING
                    ENQUEUED -> Known.ENQUEUED
                    ERROR -> Known.ERROR
                    else -> throw CourierInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws CourierInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    CourierInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                data == other.data &&
                preferences == other.preferences &&
                profile == other.profile &&
                recipient == other.recipient &&
                to == other.to &&
                status == other.status &&
                messageId == other.messageId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                data,
                preferences,
                profile,
                recipient,
                to,
                status,
                messageId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{data=$data, preferences=$preferences, profile=$profile, recipient=$recipient, to=$to, status=$status, messageId=$messageId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BulkListUsersResponse &&
            items == other.items &&
            paging == other.paging &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(items, paging, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BulkListUsersResponse{items=$items, paging=$paging, additionalProperties=$additionalProperties}"
}

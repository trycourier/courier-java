// File generated from our OpenAPI spec by Stainless.

package com.courier.models.users.preferences

import com.courier.core.Enum
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.Params
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.http.Headers
import com.courier.core.http.QueryParams
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

/**
 * Replace a user's complete set of preference overrides in a single request. The topics in the
 * request body become the recipient's entire set of overrides: listed topics are created or
 * updated, and every existing override that is not included in the body is reset to its topic
 * default. Submitting an empty `topics` array is a valid clear-all that resets every existing
 * override.
 *
 * This operation is validation-atomic (all-or-nothing): structural validation fails fast with a
 * single `400`, and if any topic is semantically invalid (an unknown topic, a `REQUIRED` topic that
 * cannot be opted out, or a custom routing request that is not available on the workspace's plan)
 * the request returns a single `400` aggregating every failure in `errors` and writes nothing. On
 * success it returns `200` with `items` (the complete resulting override set) and `deleted` (the
 * ids of the overrides that were reset to default).
 *
 * Every `topic_id` in the response — in `items`, `deleted`, and any `errors` — is returned in
 * Courier's canonical topic id form, regardless of the form supplied in the request.
 */
class PreferenceBulkReplaceParams
private constructor(
    private val userId: String?,
    private val tenantId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun userId(): Optional<String> = Optional.ofNullable(userId)

    /** Update the preferences of a user for this specific tenant context. */
    fun tenantId(): Optional<String> = Optional.ofNullable(tenantId)

    /**
     * The complete set of topic overrides for the user. Up to 50 topics may be provided. Any
     * existing override not listed here is reset to its topic default; an empty array resets every
     * existing override.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun topics(): List<Topic> = body.topics()

    /**
     * Returns the raw JSON value of [topics].
     *
     * Unlike [topics], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _topics(): JsonField<List<Topic>> = body._topics()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PreferenceBulkReplaceParams].
         *
         * The following fields are required:
         * ```java
         * .topics()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreferenceBulkReplaceParams]. */
    class Builder internal constructor() {

        private var userId: String? = null
        private var tenantId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(preferenceBulkReplaceParams: PreferenceBulkReplaceParams) = apply {
            userId = preferenceBulkReplaceParams.userId
            tenantId = preferenceBulkReplaceParams.tenantId
            body = preferenceBulkReplaceParams.body.toBuilder()
            additionalHeaders = preferenceBulkReplaceParams.additionalHeaders.toBuilder()
            additionalQueryParams = preferenceBulkReplaceParams.additionalQueryParams.toBuilder()
        }

        fun userId(userId: String?) = apply { this.userId = userId }

        /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

        /** Update the preferences of a user for this specific tenant context. */
        fun tenantId(tenantId: String?) = apply { this.tenantId = tenantId }

        /** Alias for calling [Builder.tenantId] with `tenantId.orElse(null)`. */
        fun tenantId(tenantId: Optional<String>) = tenantId(tenantId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [topics]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The complete set of topic overrides for the user. Up to 50 topics may be provided. Any
         * existing override not listed here is reset to its topic default; an empty array resets
         * every existing override.
         */
        fun topics(topics: List<Topic>) = apply { body.topics(topics) }

        /**
         * Sets [Builder.topics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topics] with a well-typed `List<Topic>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun topics(topics: JsonField<List<Topic>>) = apply { body.topics(topics) }

        /**
         * Adds a single [Topic] to [topics].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTopic(topic: Topic) = apply { body.addTopic(topic) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PreferenceBulkReplaceParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .topics()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreferenceBulkReplaceParams =
            PreferenceBulkReplaceParams(
                userId,
                tenantId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> userId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                tenantId?.let { put("tenant_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val topics: JsonField<List<Topic>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("topics")
            @ExcludeMissing
            topics: JsonField<List<Topic>> = JsonMissing.of()
        ) : this(topics, mutableMapOf())

        /**
         * The complete set of topic overrides for the user. Up to 50 topics may be provided. Any
         * existing override not listed here is reset to its topic default; an empty array resets
         * every existing override.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun topics(): List<Topic> = topics.getRequired("topics")

        /**
         * Returns the raw JSON value of [topics].
         *
         * Unlike [topics], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("topics") @ExcludeMissing fun _topics(): JsonField<List<Topic>> = topics

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .topics()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var topics: JsonField<MutableList<Topic>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                topics = body.topics.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The complete set of topic overrides for the user. Up to 50 topics may be provided.
             * Any existing override not listed here is reset to its topic default; an empty array
             * resets every existing override.
             */
            fun topics(topics: List<Topic>) = topics(JsonField.of(topics))

            /**
             * Sets [Builder.topics] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topics] with a well-typed `List<Topic>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun topics(topics: JsonField<List<Topic>>) = apply {
                this.topics = topics.map { it.toMutableList() }
            }

            /**
             * Adds a single [Topic] to [topics].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTopic(topic: Topic) = apply {
                topics =
                    (topics ?: JsonField.of(mutableListOf())).also {
                        checkKnown("topics", it).add(topic)
                    }
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .topics()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("topics", topics).map { it.toImmutable() },
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            topics().forEach { it.validate() }
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
            (topics.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                topics == other.topics &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(topics, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{topics=$topics, additionalProperties=$additionalProperties}"
    }

    class Topic
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val status: JsonField<Status>,
        private val topicId: JsonField<String>,
        private val customRouting: JsonField<List<ChannelClassification>>,
        private val hasCustomRouting: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("topic_id") @ExcludeMissing topicId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_routing")
            @ExcludeMissing
            customRouting: JsonField<List<ChannelClassification>> = JsonMissing.of(),
            @JsonProperty("has_custom_routing")
            @ExcludeMissing
            hasCustomRouting: JsonField<Boolean> = JsonMissing.of(),
        ) : this(status, topicId, customRouting, hasCustomRouting, mutableMapOf())

        /**
         * The subscription status to apply for this topic.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * A unique identifier associated with a subscription topic.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun topicId(): String = topicId.getRequired("topic_id")

        /**
         * The channels a user has chosen to receive notifications through for this topic.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customRouting(): Optional<List<ChannelClassification>> =
            customRouting.getOptional("custom_routing")

        /**
         * Whether the recipient has chosen specific delivery channels for this topic.
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hasCustomRouting(): Optional<Boolean> =
            hasCustomRouting.getOptional("has_custom_routing")

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [topicId].
         *
         * Unlike [topicId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("topic_id") @ExcludeMissing fun _topicId(): JsonField<String> = topicId

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
             * Returns a mutable builder for constructing an instance of [Topic].
             *
             * The following fields are required:
             * ```java
             * .status()
             * .topicId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Topic]. */
        class Builder internal constructor() {

            private var status: JsonField<Status>? = null
            private var topicId: JsonField<String>? = null
            private var customRouting: JsonField<MutableList<ChannelClassification>>? = null
            private var hasCustomRouting: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(topic: Topic) = apply {
                status = topic.status
                topicId = topic.topicId
                customRouting = topic.customRouting.map { it.toMutableList() }
                hasCustomRouting = topic.hasCustomRouting
                additionalProperties = topic.additionalProperties.toMutableMap()
            }

            /** The subscription status to apply for this topic. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** A unique identifier associated with a subscription topic. */
            fun topicId(topicId: String) = topicId(JsonField.of(topicId))

            /**
             * Sets [Builder.topicId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topicId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun topicId(topicId: JsonField<String>) = apply { this.topicId = topicId }

            /** The channels a user has chosen to receive notifications through for this topic. */
            fun customRouting(customRouting: List<ChannelClassification>) =
                customRouting(JsonField.of(customRouting))

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

            /** Whether the recipient has chosen specific delivery channels for this topic. */
            fun hasCustomRouting(hasCustomRouting: Boolean) =
                hasCustomRouting(JsonField.of(hasCustomRouting))

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
             * Returns an immutable instance of [Topic].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .status()
             * .topicId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Topic =
                Topic(
                    checkRequired("status", status),
                    checkRequired("topicId", topicId),
                    (customRouting ?: JsonMissing.of()).map { it.toImmutable() },
                    hasCustomRouting,
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
        fun validate(): Topic = apply {
            if (validated) {
                return@apply
            }

            status().validate()
            topicId()
            customRouting().ifPresent { it.forEach { it.validate() } }
            hasCustomRouting()
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
                (if (topicId.asKnown().isPresent) 1 else 0) +
                (customRouting.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (hasCustomRouting.asKnown().isPresent) 1 else 0)

        /** The subscription status to apply for this topic. */
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

                @JvmField val OPTED_IN = of("OPTED_IN")

                @JvmField val OPTED_OUT = of("OPTED_OUT")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                OPTED_IN,
                OPTED_OUT,
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
                OPTED_IN,
                OPTED_OUT,
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
                    OPTED_IN -> Value.OPTED_IN
                    OPTED_OUT -> Value.OPTED_OUT
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
                    OPTED_IN -> Known.OPTED_IN
                    OPTED_OUT -> Known.OPTED_OUT
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Topic &&
                status == other.status &&
                topicId == other.topicId &&
                customRouting == other.customRouting &&
                hasCustomRouting == other.hasCustomRouting &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(status, topicId, customRouting, hasCustomRouting, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Topic{status=$status, topicId=$topicId, customRouting=$customRouting, hasCustomRouting=$hasCustomRouting, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreferenceBulkReplaceParams &&
            userId == other.userId &&
            tenantId == other.tenantId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(userId, tenantId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PreferenceBulkReplaceParams{userId=$userId, tenantId=$tenantId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

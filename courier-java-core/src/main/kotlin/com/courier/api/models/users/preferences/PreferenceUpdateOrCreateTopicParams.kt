// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.users.preferences

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.Params
import com.courier.api.core.checkKnown
import com.courier.api.core.checkRequired
import com.courier.api.core.http.Headers
import com.courier.api.core.http.QueryParams
import com.courier.api.core.toImmutable
import com.courier.api.errors.CourierInvalidDataException
import com.courier.api.models.ChannelClassification
import com.courier.api.models.PreferenceStatus
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update or Create user preferences for a specific subscription topic. */
class PreferenceUpdateOrCreateTopicParams
private constructor(
    private val userId: String,
    private val topicId: String?,
    private val tenantId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun userId(): String = userId

    fun topicId(): Optional<String> = Optional.ofNullable(topicId)

    /** Update the preferences of a user for this specific tenant context. */
    fun tenantId(): Optional<String> = Optional.ofNullable(tenantId)

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun topic(): Topic = body.topic()

    /**
     * Returns the raw JSON value of [topic].
     *
     * Unlike [topic], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _topic(): JsonField<Topic> = body._topic()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PreferenceUpdateOrCreateTopicParams].
         *
         * The following fields are required:
         * ```java
         * .userId()
         * .topic()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreferenceUpdateOrCreateTopicParams]. */
    class Builder internal constructor() {

        private var userId: String? = null
        private var topicId: String? = null
        private var tenantId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            preferenceUpdateOrCreateTopicParams: PreferenceUpdateOrCreateTopicParams
        ) = apply {
            userId = preferenceUpdateOrCreateTopicParams.userId
            topicId = preferenceUpdateOrCreateTopicParams.topicId
            tenantId = preferenceUpdateOrCreateTopicParams.tenantId
            body = preferenceUpdateOrCreateTopicParams.body.toBuilder()
            additionalHeaders = preferenceUpdateOrCreateTopicParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                preferenceUpdateOrCreateTopicParams.additionalQueryParams.toBuilder()
        }

        fun userId(userId: String) = apply { this.userId = userId }

        fun topicId(topicId: String?) = apply { this.topicId = topicId }

        /** Alias for calling [Builder.topicId] with `topicId.orElse(null)`. */
        fun topicId(topicId: Optional<String>) = topicId(topicId.getOrNull())

        /** Update the preferences of a user for this specific tenant context. */
        fun tenantId(tenantId: String?) = apply { this.tenantId = tenantId }

        /** Alias for calling [Builder.tenantId] with `tenantId.orElse(null)`. */
        fun tenantId(tenantId: Optional<String>) = tenantId(tenantId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [topic]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun topic(topic: Topic) = apply { body.topic(topic) }

        /**
         * Sets [Builder.topic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topic] with a well-typed [Topic] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun topic(topic: JsonField<Topic>) = apply { body.topic(topic) }

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
         * Returns an immutable instance of [PreferenceUpdateOrCreateTopicParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .userId()
         * .topic()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreferenceUpdateOrCreateTopicParams =
            PreferenceUpdateOrCreateTopicParams(
                checkRequired("userId", userId),
                topicId,
                tenantId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> userId
            1 -> topicId ?: ""
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
        private val topic: JsonField<Topic>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("topic") @ExcludeMissing topic: JsonField<Topic> = JsonMissing.of()
        ) : this(topic, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun topic(): Topic = topic.getRequired("topic")

        /**
         * Returns the raw JSON value of [topic].
         *
         * Unlike [topic], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("topic") @ExcludeMissing fun _topic(): JsonField<Topic> = topic

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
             * .topic()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var topic: JsonField<Topic>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                topic = body.topic
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun topic(topic: Topic) = topic(JsonField.of(topic))

            /**
             * Sets [Builder.topic] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topic] with a well-typed [Topic] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun topic(topic: JsonField<Topic>) = apply { this.topic = topic }

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
             * .topic()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(checkRequired("topic", topic), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            topic().validate()
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
        @JvmSynthetic internal fun validity(): Int = (topic.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                topic == other.topic &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(topic, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{topic=$topic, additionalProperties=$additionalProperties}"
    }

    class Topic
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val status: JsonField<PreferenceStatus>,
        private val customRouting: JsonField<List<ChannelClassification>>,
        private val hasCustomRouting: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<PreferenceStatus> = JsonMissing.of(),
            @JsonProperty("custom_routing")
            @ExcludeMissing
            customRouting: JsonField<List<ChannelClassification>> = JsonMissing.of(),
            @JsonProperty("has_custom_routing")
            @ExcludeMissing
            hasCustomRouting: JsonField<Boolean> = JsonMissing.of(),
        ) : this(status, customRouting, hasCustomRouting, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): PreferenceStatus = status.getRequired("status")

        /**
         * The Channels a user has chosen to receive notifications through for this topic
         *
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customRouting(): Optional<List<ChannelClassification>> =
            customRouting.getOptional("custom_routing")

        /**
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
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<PreferenceStatus> = status

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
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Topic]. */
        class Builder internal constructor() {

            private var status: JsonField<PreferenceStatus>? = null
            private var customRouting: JsonField<MutableList<ChannelClassification>>? = null
            private var hasCustomRouting: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(topic: Topic) = apply {
                status = topic.status
                customRouting = topic.customRouting.map { it.toMutableList() }
                hasCustomRouting = topic.hasCustomRouting
                additionalProperties = topic.additionalProperties.toMutableMap()
            }

            fun status(status: PreferenceStatus) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [PreferenceStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<PreferenceStatus>) = apply { this.status = status }

            /** The Channels a user has chosen to receive notifications through for this topic */
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
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Topic =
                Topic(
                    checkRequired("status", status),
                    (customRouting ?: JsonMissing.of()).map { it.toImmutable() },
                    hasCustomRouting,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Topic = apply {
            if (validated) {
                return@apply
            }

            status().validate()
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
                (customRouting.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (hasCustomRouting.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Topic &&
                status == other.status &&
                customRouting == other.customRouting &&
                hasCustomRouting == other.hasCustomRouting &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(status, customRouting, hasCustomRouting, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Topic{status=$status, customRouting=$customRouting, hasCustomRouting=$hasCustomRouting, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreferenceUpdateOrCreateTopicParams &&
            userId == other.userId &&
            topicId == other.topicId &&
            tenantId == other.tenantId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(userId, topicId, tenantId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PreferenceUpdateOrCreateTopicParams{userId=$userId, topicId=$topicId, tenantId=$tenantId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

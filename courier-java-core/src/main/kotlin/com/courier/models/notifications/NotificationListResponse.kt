// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.BaseDeserializer
import com.courier.core.BaseSerializer
import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.allMaxBy
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.getOrThrow
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.courier.models.MessageRouting
import com.courier.models.Paging
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class NotificationListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val paging: JsonField<Paging>,
    private val results: JsonField<List<Result>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("paging") @ExcludeMissing paging: JsonField<Paging> = JsonMissing.of(),
        @JsonProperty("results") @ExcludeMissing results: JsonField<List<Result>> = JsonMissing.of(),
    ) : this(paging, results, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paging(): Paging = paging.getRequired("paging")

    /**
     * Notification templates in this workspace.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): List<Result> = results.getRequired("results")

    /**
     * Returns the raw JSON value of [paging].
     *
     * Unlike [paging], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paging") @ExcludeMissing fun _paging(): JsonField<Paging> = paging

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

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
         * Returns a mutable builder for constructing an instance of [NotificationListResponse].
         *
         * The following fields are required:
         * ```java
         * .paging()
         * .results()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationListResponse]. */
    class Builder internal constructor() {

        private var paging: JsonField<Paging>? = null
        private var results: JsonField<MutableList<Result>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(notificationListResponse: NotificationListResponse) = apply {
            paging = notificationListResponse.paging
            results = notificationListResponse.results.map { it.toMutableList() }
            additionalProperties = notificationListResponse.additionalProperties.toMutableMap()
        }

        fun paging(paging: Paging) = paging(JsonField.of(paging))

        /**
         * Sets [Builder.paging] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paging] with a well-typed [Paging] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

        /** Notification templates in this workspace. */
        fun results(results: List<Result>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun results(results: JsonField<List<Result>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [Result] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
                }
        }

        /** Alias for calling [addResult] with `Result.ofNotification(notification)`. */
        fun addResult(notification: Result.Notification) =
            addResult(Result.ofNotification(notification))

        /**
         * Alias for calling [addResult] with
         * `Result.ofNotificationTemplateSummary(notificationTemplateSummary)`.
         */
        fun addResult(notificationTemplateSummary: NotificationTemplateSummary) =
            addResult(Result.ofNotificationTemplateSummary(notificationTemplateSummary))

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
         * Returns an immutable instance of [NotificationListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .paging()
         * .results()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NotificationListResponse =
            NotificationListResponse(
                checkRequired("paging", paging),
                checkRequired("results", results).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NotificationListResponse = apply {
        if (validated) {
            return@apply
        }

        paging().validate()
        results().forEach { it.validate() }
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
        (paging.asKnown().getOrNull()?.validity() ?: 0) +
            (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** V2 (CDS) template summary returned in list responses. */
    @JsonDeserialize(using = Result.Deserializer::class)
    @JsonSerialize(using = Result.Serializer::class)
    class Result
    private constructor(
        private val notification: Notification? = null,
        private val notificationTemplateSummary: NotificationTemplateSummary? = null,
        private val _json: JsonValue? = null,
    ) {

        fun notification(): Optional<Notification> = Optional.ofNullable(notification)

        /** V2 (CDS) template summary returned in list responses. */
        fun notificationTemplateSummary(): Optional<NotificationTemplateSummary> =
            Optional.ofNullable(notificationTemplateSummary)

        fun isNotification(): Boolean = notification != null

        fun isNotificationTemplateSummary(): Boolean = notificationTemplateSummary != null

        fun asNotification(): Notification = notification.getOrThrow("notification")

        /** V2 (CDS) template summary returned in list responses. */
        fun asNotificationTemplateSummary(): NotificationTemplateSummary =
            notificationTemplateSummary.getOrThrow("notificationTemplateSummary")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                notification != null -> visitor.visitNotification(notification)
                notificationTemplateSummary != null ->
                    visitor.visitNotificationTemplateSummary(notificationTemplateSummary)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNotification(notification: Notification) {
                        notification.validate()
                    }

                    override fun visitNotificationTemplateSummary(
                        notificationTemplateSummary: NotificationTemplateSummary
                    ) {
                        notificationTemplateSummary.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitNotification(notification: Notification) =
                        notification.validity()

                    override fun visitNotificationTemplateSummary(
                        notificationTemplateSummary: NotificationTemplateSummary
                    ) = notificationTemplateSummary.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                notification == other.notification &&
                notificationTemplateSummary == other.notificationTemplateSummary
        }

        override fun hashCode(): Int = Objects.hash(notification, notificationTemplateSummary)

        override fun toString(): String =
            when {
                notification != null -> "Result{notification=$notification}"
                notificationTemplateSummary != null ->
                    "Result{notificationTemplateSummary=$notificationTemplateSummary}"
                _json != null -> "Result{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Result")
            }

        companion object {

            @JvmStatic
            fun ofNotification(notification: Notification) = Result(notification = notification)

            /** V2 (CDS) template summary returned in list responses. */
            @JvmStatic
            fun ofNotificationTemplateSummary(
                notificationTemplateSummary: NotificationTemplateSummary
            ) = Result(notificationTemplateSummary = notificationTemplateSummary)
        }

        /** An interface that defines how to map each variant of [Result] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitNotification(notification: Notification): T

            /** V2 (CDS) template summary returned in list responses. */
            fun visitNotificationTemplateSummary(
                notificationTemplateSummary: NotificationTemplateSummary
            ): T

            /**
             * Maps an unknown variant of [Result] to a value of type [T].
             *
             * An instance of [Result] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws CourierInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw CourierInvalidDataException("Unknown Result: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Result>(Result::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Result {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Notification>())?.let {
                                Result(notification = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NotificationTemplateSummary>())
                                ?.let { Result(notificationTemplateSummary = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Result(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Result>(Result::class) {

            override fun serialize(
                value: Result,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.notification != null -> generator.writeObject(value.notification)
                    value.notificationTemplateSummary != null ->
                        generator.writeObject(value.notificationTemplateSummary)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Result")
                }
            }
        }

        class Notification
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val createdAt: JsonField<Long>,
            private val eventIds: JsonField<List<String>>,
            private val routing: JsonField<MessageRouting>,
            private val topicId: JsonField<String>,
            private val updatedAt: JsonField<Long>,
            private val note: JsonField<String>,
            private val tags: JsonField<Tags>,
            private val title: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("event_ids")
                @ExcludeMissing
                eventIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("routing")
                @ExcludeMissing
                routing: JsonField<MessageRouting> = JsonMissing.of(),
                @JsonProperty("topic_id")
                @ExcludeMissing
                topicId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("note") @ExcludeMissing note: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tags") @ExcludeMissing tags: JsonField<Tags> = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                createdAt,
                eventIds,
                routing,
                topicId,
                updatedAt,
                note,
                tags,
                title,
                mutableMapOf(),
            )

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): Long = createdAt.getRequired("created_at")

            /**
             * Array of event IDs associated with this notification
             *
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun eventIds(): List<String> = eventIds.getRequired("event_ids")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun routing(): MessageRouting = routing.getRequired("routing")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun topicId(): String = topicId.getRequired("topic_id")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun updatedAt(): Long = updatedAt.getRequired("updated_at")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun note(): Optional<String> = note.getOptional("note")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun tags(): Optional<Tags> = tags.getOptional("tags")

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun title(): Optional<String> = title.getOptional("title")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<Long> = createdAt

            /**
             * Returns the raw JSON value of [eventIds].
             *
             * Unlike [eventIds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("event_ids")
            @ExcludeMissing
            fun _eventIds(): JsonField<List<String>> = eventIds

            /**
             * Returns the raw JSON value of [routing].
             *
             * Unlike [routing], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("routing")
            @ExcludeMissing
            fun _routing(): JsonField<MessageRouting> = routing

            /**
             * Returns the raw JSON value of [topicId].
             *
             * Unlike [topicId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("topic_id") @ExcludeMissing fun _topicId(): JsonField<String> = topicId

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<Long> = updatedAt

            /**
             * Returns the raw JSON value of [note].
             *
             * Unlike [note], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("note") @ExcludeMissing fun _note(): JsonField<String> = note

            /**
             * Returns the raw JSON value of [tags].
             *
             * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<Tags> = tags

            /**
             * Returns the raw JSON value of [title].
             *
             * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
                 * Returns a mutable builder for constructing an instance of [Notification].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .createdAt()
                 * .eventIds()
                 * .routing()
                 * .topicId()
                 * .updatedAt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Notification]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var createdAt: JsonField<Long>? = null
                private var eventIds: JsonField<MutableList<String>>? = null
                private var routing: JsonField<MessageRouting>? = null
                private var topicId: JsonField<String>? = null
                private var updatedAt: JsonField<Long>? = null
                private var note: JsonField<String> = JsonMissing.of()
                private var tags: JsonField<Tags> = JsonMissing.of()
                private var title: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(notification: Notification) = apply {
                    id = notification.id
                    createdAt = notification.createdAt
                    eventIds = notification.eventIds.map { it.toMutableList() }
                    routing = notification.routing
                    topicId = notification.topicId
                    updatedAt = notification.updatedAt
                    note = notification.note
                    tags = notification.tags
                    title = notification.title
                    additionalProperties = notification.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

                /** Array of event IDs associated with this notification */
                fun eventIds(eventIds: List<String>) = eventIds(JsonField.of(eventIds))

                /**
                 * Sets [Builder.eventIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eventIds] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eventIds(eventIds: JsonField<List<String>>) = apply {
                    this.eventIds = eventIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [eventIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addEventId(eventId: String) = apply {
                    eventIds =
                        (eventIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("eventIds", it).add(eventId)
                        }
                }

                fun routing(routing: MessageRouting) = routing(JsonField.of(routing))

                /**
                 * Sets [Builder.routing] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routing] with a well-typed [MessageRouting]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun routing(routing: JsonField<MessageRouting>) = apply { this.routing = routing }

                fun topicId(topicId: String) = topicId(JsonField.of(topicId))

                /**
                 * Sets [Builder.topicId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.topicId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun topicId(topicId: JsonField<String>) = apply { this.topicId = topicId }

                fun updatedAt(updatedAt: Long) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

                fun note(note: String) = note(JsonField.of(note))

                /**
                 * Sets [Builder.note] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.note] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun note(note: JsonField<String>) = apply { this.note = note }

                fun tags(tags: Tags?) = tags(JsonField.ofNullable(tags))

                /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
                fun tags(tags: Optional<Tags>) = tags(tags.getOrNull())

                /**
                 * Sets [Builder.tags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tags] with a well-typed [Tags] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tags(tags: JsonField<Tags>) = apply { this.tags = tags }

                fun title(title: String?) = title(JsonField.ofNullable(title))

                /** Alias for calling [Builder.title] with `title.orElse(null)`. */
                fun title(title: Optional<String>) = title(title.getOrNull())

                /**
                 * Sets [Builder.title] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.title] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun title(title: JsonField<String>) = apply { this.title = title }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Notification].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .createdAt()
                 * .eventIds()
                 * .routing()
                 * .topicId()
                 * .updatedAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Notification =
                    Notification(
                        checkRequired("id", id),
                        checkRequired("createdAt", createdAt),
                        checkRequired("eventIds", eventIds).map { it.toImmutable() },
                        checkRequired("routing", routing),
                        checkRequired("topicId", topicId),
                        checkRequired("updatedAt", updatedAt),
                        note,
                        tags,
                        title,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Notification = apply {
                if (validated) {
                    return@apply
                }

                id()
                createdAt()
                eventIds()
                routing().validate()
                topicId()
                updatedAt()
                note()
                tags().ifPresent { it.validate() }
                title()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (eventIds.asKnown().getOrNull()?.size ?: 0) +
                    (routing.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (topicId.asKnown().isPresent) 1 else 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0) +
                    (if (note.asKnown().isPresent) 1 else 0) +
                    (tags.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (title.asKnown().isPresent) 1 else 0)

            class Tags
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val data: JsonField<List<Data>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("data")
                    @ExcludeMissing
                    data: JsonField<List<Data>> = JsonMissing.of()
                ) : this(data, mutableMapOf())

                /**
                 * @throws CourierInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun data(): List<Data> = data.getRequired("data")

                /**
                 * Returns the raw JSON value of [data].
                 *
                 * Unlike [data], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

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
                     * Returns a mutable builder for constructing an instance of [Tags].
                     *
                     * The following fields are required:
                     * ```java
                     * .data()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Tags]. */
                class Builder internal constructor() {

                    private var data: JsonField<MutableList<Data>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tags: Tags) = apply {
                        data = tags.data.map { it.toMutableList() }
                        additionalProperties = tags.additionalProperties.toMutableMap()
                    }

                    fun data(data: List<Data>) = data(JsonField.of(data))

                    /**
                     * Sets [Builder.data] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.data] with a well-typed `List<Data>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun data(data: JsonField<List<Data>>) = apply {
                        this.data = data.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Data] to [Builder.data].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addData(data: Data) = apply {
                        this.data =
                            (this.data ?: JsonField.of(mutableListOf())).also {
                                checkKnown("data", it).add(data)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Tags].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .data()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Tags =
                        Tags(
                            checkRequired("data", data).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Tags = apply {
                    if (validated) {
                        return@apply
                    }

                    data().forEach { it.validate() }
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
                    (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                class Data
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val id: JsonField<String>,
                    private val name: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id")
                        @ExcludeMissing
                        id: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                    ) : this(id, name, mutableMapOf())

                    /**
                     * @throws CourierInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun id(): String = id.getRequired("id")

                    /**
                     * @throws CourierInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                         * Returns a mutable builder for constructing an instance of [Data].
                         *
                         * The following fields are required:
                         * ```java
                         * .id()
                         * .name()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Data]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String>? = null
                        private var name: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(data: Data) = apply {
                            id = data.id
                            name = data.name
                            additionalProperties = data.additionalProperties.toMutableMap()
                        }

                        fun id(id: String) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<String>) = apply { this.id = id }

                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Data].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .id()
                         * .name()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Data =
                            Data(
                                checkRequired("id", id),
                                checkRequired("name", name),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Data = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        name()
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
                        (if (id.asKnown().isPresent) 1 else 0) +
                            (if (name.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Data &&
                            id == other.id &&
                            name == other.name &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(id, name, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Data{id=$id, name=$name, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Tags &&
                        data == other.data &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tags{data=$data, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Notification &&
                    id == other.id &&
                    createdAt == other.createdAt &&
                    eventIds == other.eventIds &&
                    routing == other.routing &&
                    topicId == other.topicId &&
                    updatedAt == other.updatedAt &&
                    note == other.note &&
                    tags == other.tags &&
                    title == other.title &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    createdAt,
                    eventIds,
                    routing,
                    topicId,
                    updatedAt,
                    note,
                    tags,
                    title,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Notification{id=$id, createdAt=$createdAt, eventIds=$eventIds, routing=$routing, topicId=$topicId, updatedAt=$updatedAt, note=$note, tags=$tags, title=$title, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationListResponse &&
            paging == other.paging &&
            results == other.results &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(paging, results, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotificationListResponse{paging=$paging, results=$results, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.messages

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MessageRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val clicked: JsonField<Long>,
    private val delivered: JsonField<Long>,
    private val enqueued: JsonField<Long>,
    private val event: JsonField<String>,
    private val notification: JsonField<String>,
    private val opened: JsonField<Long>,
    private val recipient: JsonField<String>,
    private val sent: JsonField<Long>,
    private val status: JsonField<MessageDetails.Status>,
    private val error: JsonField<String>,
    private val reason: JsonField<MessageDetails.Reason>,
    private val providers: JsonField<List<Provider>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("clicked") @ExcludeMissing clicked: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("delivered") @ExcludeMissing delivered: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("enqueued") @ExcludeMissing enqueued: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("event") @ExcludeMissing event: JsonField<String> = JsonMissing.of(),
        @JsonProperty("notification")
        @ExcludeMissing
        notification: JsonField<String> = JsonMissing.of(),
        @JsonProperty("opened") @ExcludeMissing opened: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("recipient") @ExcludeMissing recipient: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sent") @ExcludeMissing sent: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<MessageDetails.Status> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        reason: JsonField<MessageDetails.Reason> = JsonMissing.of(),
        @JsonProperty("providers")
        @ExcludeMissing
        providers: JsonField<List<Provider>> = JsonMissing.of(),
    ) : this(
        id,
        clicked,
        delivered,
        enqueued,
        event,
        notification,
        opened,
        recipient,
        sent,
        status,
        error,
        reason,
        providers,
        mutableMapOf(),
    )

    fun toMessageDetails(): MessageDetails =
        MessageDetails.builder()
            .id(id)
            .clicked(clicked)
            .delivered(delivered)
            .enqueued(enqueued)
            .event(event)
            .notification(notification)
            .opened(opened)
            .recipient(recipient)
            .sent(sent)
            .status(status)
            .error(error)
            .reason(reason)
            .build()

    /**
     * A unique identifier associated with the message you wish to retrieve (results from a send).
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * A UTC timestamp at which the recipient clicked on a tracked link for the first time. Stored
     * as a millisecond representation of the Unix epoch.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clicked(): Long = clicked.getRequired("clicked")

    /**
     * A UTC timestamp at which the Integration provider delivered the message. Stored as a
     * millisecond representation of the Unix epoch.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun delivered(): Long = delivered.getRequired("delivered")

    /**
     * A UTC timestamp at which Courier received the message request. Stored as a millisecond
     * representation of the Unix epoch.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enqueued(): Long = enqueued.getRequired("enqueued")

    /**
     * A unique identifier associated with the event of the delivered message.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun event(): String = event.getRequired("event")

    /**
     * A unique identifier associated with the notification of the delivered message.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun notification(): String = notification.getRequired("notification")

    /**
     * A UTC timestamp at which the recipient opened a message for the first time. Stored as a
     * millisecond representation of the Unix epoch.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun opened(): Long = opened.getRequired("opened")

    /**
     * A unique identifier associated with the recipient of the delivered message.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipient(): String = recipient.getRequired("recipient")

    /**
     * A UTC timestamp at which Courier passed the message to the Integration provider. Stored as a
     * millisecond representation of the Unix epoch.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sent(): Long = sent.getRequired("sent")

    /**
     * The current status of the message.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): MessageDetails.Status = status.getRequired("status")

    /**
     * A message describing the error that occurred.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * The reason for the current status of the message.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reason(): Optional<MessageDetails.Reason> = reason.getOptional("reason")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun providers(): Optional<List<Provider>> = providers.getOptional("providers")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [clicked].
     *
     * Unlike [clicked], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clicked") @ExcludeMissing fun _clicked(): JsonField<Long> = clicked

    /**
     * Returns the raw JSON value of [delivered].
     *
     * Unlike [delivered], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("delivered") @ExcludeMissing fun _delivered(): JsonField<Long> = delivered

    /**
     * Returns the raw JSON value of [enqueued].
     *
     * Unlike [enqueued], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enqueued") @ExcludeMissing fun _enqueued(): JsonField<Long> = enqueued

    /**
     * Returns the raw JSON value of [event].
     *
     * Unlike [event], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<String> = event

    /**
     * Returns the raw JSON value of [notification].
     *
     * Unlike [notification], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notification")
    @ExcludeMissing
    fun _notification(): JsonField<String> = notification

    /**
     * Returns the raw JSON value of [opened].
     *
     * Unlike [opened], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opened") @ExcludeMissing fun _opened(): JsonField<Long> = opened

    /**
     * Returns the raw JSON value of [recipient].
     *
     * Unlike [recipient], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipient") @ExcludeMissing fun _recipient(): JsonField<String> = recipient

    /**
     * Returns the raw JSON value of [sent].
     *
     * Unlike [sent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sent") @ExcludeMissing fun _sent(): JsonField<Long> = sent

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<MessageDetails.Status> = status

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<MessageDetails.Reason> = reason

    /**
     * Returns the raw JSON value of [providers].
     *
     * Unlike [providers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("providers")
    @ExcludeMissing
    fun _providers(): JsonField<List<Provider>> = providers

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
         * Returns a mutable builder for constructing an instance of [MessageRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .clicked()
         * .delivered()
         * .enqueued()
         * .event()
         * .notification()
         * .opened()
         * .recipient()
         * .sent()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var clicked: JsonField<Long>? = null
        private var delivered: JsonField<Long>? = null
        private var enqueued: JsonField<Long>? = null
        private var event: JsonField<String>? = null
        private var notification: JsonField<String>? = null
        private var opened: JsonField<Long>? = null
        private var recipient: JsonField<String>? = null
        private var sent: JsonField<Long>? = null
        private var status: JsonField<MessageDetails.Status>? = null
        private var error: JsonField<String> = JsonMissing.of()
        private var reason: JsonField<MessageDetails.Reason> = JsonMissing.of()
        private var providers: JsonField<MutableList<Provider>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messageRetrieveResponse: MessageRetrieveResponse) = apply {
            id = messageRetrieveResponse.id
            clicked = messageRetrieveResponse.clicked
            delivered = messageRetrieveResponse.delivered
            enqueued = messageRetrieveResponse.enqueued
            event = messageRetrieveResponse.event
            notification = messageRetrieveResponse.notification
            opened = messageRetrieveResponse.opened
            recipient = messageRetrieveResponse.recipient
            sent = messageRetrieveResponse.sent
            status = messageRetrieveResponse.status
            error = messageRetrieveResponse.error
            reason = messageRetrieveResponse.reason
            providers = messageRetrieveResponse.providers.map { it.toMutableList() }
            additionalProperties = messageRetrieveResponse.additionalProperties.toMutableMap()
        }

        /**
         * A unique identifier associated with the message you wish to retrieve (results from a
         * send).
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * A UTC timestamp at which the recipient clicked on a tracked link for the first time.
         * Stored as a millisecond representation of the Unix epoch.
         */
        fun clicked(clicked: Long) = clicked(JsonField.of(clicked))

        /**
         * Sets [Builder.clicked] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clicked] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clicked(clicked: JsonField<Long>) = apply { this.clicked = clicked }

        /**
         * A UTC timestamp at which the Integration provider delivered the message. Stored as a
         * millisecond representation of the Unix epoch.
         */
        fun delivered(delivered: Long) = delivered(JsonField.of(delivered))

        /**
         * Sets [Builder.delivered] to an arbitrary JSON value.
         *
         * You should usually call [Builder.delivered] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun delivered(delivered: JsonField<Long>) = apply { this.delivered = delivered }

        /**
         * A UTC timestamp at which Courier received the message request. Stored as a millisecond
         * representation of the Unix epoch.
         */
        fun enqueued(enqueued: Long) = enqueued(JsonField.of(enqueued))

        /**
         * Sets [Builder.enqueued] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enqueued] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enqueued(enqueued: JsonField<Long>) = apply { this.enqueued = enqueued }

        /** A unique identifier associated with the event of the delivered message. */
        fun event(event: String) = event(JsonField.of(event))

        /**
         * Sets [Builder.event] to an arbitrary JSON value.
         *
         * You should usually call [Builder.event] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun event(event: JsonField<String>) = apply { this.event = event }

        /** A unique identifier associated with the notification of the delivered message. */
        fun notification(notification: String) = notification(JsonField.of(notification))

        /**
         * Sets [Builder.notification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notification] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun notification(notification: JsonField<String>) = apply {
            this.notification = notification
        }

        /**
         * A UTC timestamp at which the recipient opened a message for the first time. Stored as a
         * millisecond representation of the Unix epoch.
         */
        fun opened(opened: Long) = opened(JsonField.of(opened))

        /**
         * Sets [Builder.opened] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opened] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun opened(opened: JsonField<Long>) = apply { this.opened = opened }

        /** A unique identifier associated with the recipient of the delivered message. */
        fun recipient(recipient: String) = recipient(JsonField.of(recipient))

        /**
         * Sets [Builder.recipient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipient] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recipient(recipient: JsonField<String>) = apply { this.recipient = recipient }

        /**
         * A UTC timestamp at which Courier passed the message to the Integration provider. Stored
         * as a millisecond representation of the Unix epoch.
         */
        fun sent(sent: Long) = sent(JsonField.of(sent))

        /**
         * Sets [Builder.sent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sent] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sent(sent: JsonField<Long>) = apply { this.sent = sent }

        /** The current status of the message. */
        fun status(status: MessageDetails.Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [MessageDetails.Status] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<MessageDetails.Status>) = apply { this.status = status }

        /** A message describing the error that occurred. */
        fun error(error: String?) = error(JsonField.ofNullable(error))

        /** Alias for calling [Builder.error] with `error.orElse(null)`. */
        fun error(error: Optional<String>) = error(error.getOrNull())

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        /** The reason for the current status of the message. */
        fun reason(reason: MessageDetails.Reason?) = reason(JsonField.ofNullable(reason))

        /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
        fun reason(reason: Optional<MessageDetails.Reason>) = reason(reason.getOrNull())

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [MessageDetails.Reason] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reason(reason: JsonField<MessageDetails.Reason>) = apply { this.reason = reason }

        fun providers(providers: List<Provider>?) = providers(JsonField.ofNullable(providers))

        /** Alias for calling [Builder.providers] with `providers.orElse(null)`. */
        fun providers(providers: Optional<List<Provider>>) = providers(providers.getOrNull())

        /**
         * Sets [Builder.providers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providers] with a well-typed `List<Provider>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providers(providers: JsonField<List<Provider>>) = apply {
            this.providers = providers.map { it.toMutableList() }
        }

        /**
         * Adds a single [Provider] to [providers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProvider(provider: Provider) = apply {
            providers =
                (providers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("providers", it).add(provider)
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
         * Returns an immutable instance of [MessageRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .clicked()
         * .delivered()
         * .enqueued()
         * .event()
         * .notification()
         * .opened()
         * .recipient()
         * .sent()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessageRetrieveResponse =
            MessageRetrieveResponse(
                checkRequired("id", id),
                checkRequired("clicked", clicked),
                checkRequired("delivered", delivered),
                checkRequired("enqueued", enqueued),
                checkRequired("event", event),
                checkRequired("notification", notification),
                checkRequired("opened", opened),
                checkRequired("recipient", recipient),
                checkRequired("sent", sent),
                checkRequired("status", status),
                error,
                reason,
                (providers ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessageRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        clicked()
        delivered()
        enqueued()
        event()
        notification()
        opened()
        recipient()
        sent()
        status().validate()
        error()
        reason().ifPresent { it.validate() }
        providers().ifPresent { it.forEach { it.validate() } }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (clicked.asKnown().isPresent) 1 else 0) +
            (if (delivered.asKnown().isPresent) 1 else 0) +
            (if (enqueued.asKnown().isPresent) 1 else 0) +
            (if (event.asKnown().isPresent) 1 else 0) +
            (if (notification.asKnown().isPresent) 1 else 0) +
            (if (opened.asKnown().isPresent) 1 else 0) +
            (if (recipient.asKnown().isPresent) 1 else 0) +
            (if (sent.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (reason.asKnown().getOrNull()?.validity() ?: 0) +
            (providers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Provider
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Provider]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Provider]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(provider: Provider) = apply {
                additionalProperties = provider.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Provider].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Provider = Provider(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Provider = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Provider && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Provider{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageRetrieveResponse &&
            id == other.id &&
            clicked == other.clicked &&
            delivered == other.delivered &&
            enqueued == other.enqueued &&
            event == other.event &&
            notification == other.notification &&
            opened == other.opened &&
            recipient == other.recipient &&
            sent == other.sent &&
            status == other.status &&
            error == other.error &&
            reason == other.reason &&
            providers == other.providers &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            clicked,
            delivered,
            enqueued,
            event,
            notification,
            opened,
            recipient,
            sent,
            status,
            error,
            reason,
            providers,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessageRetrieveResponse{id=$id, clicked=$clicked, delivered=$delivered, enqueued=$enqueued, event=$event, notification=$notification, opened=$opened, recipient=$recipient, sent=$sent, status=$status, error=$error, reason=$reason, providers=$providers, additionalProperties=$additionalProperties}"
}

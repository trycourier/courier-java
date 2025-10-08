// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.messages

import com.courier.api.core.Params
import com.courier.api.core.http.Headers
import com.courier.api.core.http.QueryParams
import com.courier.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Fetch the statuses of messages you've previously sent. */
class MessageListParams
private constructor(
    private val archived: Boolean?,
    private val cursor: String?,
    private val enqueuedAfter: String?,
    private val event: String?,
    private val list: String?,
    private val messageId: String?,
    private val notification: String?,
    private val provider: List<String?>?,
    private val recipient: String?,
    private val status: List<String?>?,
    private val tag: List<String?>?,
    private val tags: String?,
    private val tenantId: String?,
    private val traceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A boolean value that indicates whether archived messages should be included in the response.
     */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    /** A unique identifier that allows for fetching the next set of messages. */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** The enqueued datetime of a message to filter out messages received before. */
    fun enqueuedAfter(): Optional<String> = Optional.ofNullable(enqueuedAfter)

    /** A unique identifier representing the event that was used to send the event. */
    fun event(): Optional<String> = Optional.ofNullable(event)

    /** A unique identifier representing the list the message was sent to. */
    fun list(): Optional<String> = Optional.ofNullable(list)

    /** A unique identifier representing the message_id returned from either /send or /send/list. */
    fun messageId(): Optional<String> = Optional.ofNullable(messageId)

    /** A unique identifier representing the notification that was used to send the event. */
    fun notification(): Optional<String> = Optional.ofNullable(notification)

    /**
     * The key assocated to the provider you want to filter on. E.g., sendgrid, inbox, twilio,
     * slack, msteams, etc. Allows multiple values to be set in query parameters.
     */
    fun provider(): Optional<List<String?>> = Optional.ofNullable(provider)

    /** A unique identifier representing the recipient associated with the requested profile. */
    fun recipient(): Optional<String> = Optional.ofNullable(recipient)

    /**
     * An indicator of the current status of the message. Allows multiple values to be set in query
     * parameters.
     */
    fun status(): Optional<List<String?>> = Optional.ofNullable(status)

    /**
     * A tag placed in the metadata.tags during a notification send. Allows multiple values to be
     * set in query parameters.
     */
    fun tag(): Optional<List<String?>> = Optional.ofNullable(tag)

    /**
     * A comma delimited list of 'tags'. Messages will be returned if they match any of the tags
     * passed in.
     */
    fun tags(): Optional<String> = Optional.ofNullable(tags)

    /** Messages sent with the context of a Tenant */
    fun tenantId(): Optional<String> = Optional.ofNullable(tenantId)

    /** The unique identifier used to trace the requests */
    fun traceId(): Optional<String> = Optional.ofNullable(traceId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MessageListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [MessageListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageListParams]. */
    class Builder internal constructor() {

        private var archived: Boolean? = null
        private var cursor: String? = null
        private var enqueuedAfter: String? = null
        private var event: String? = null
        private var list: String? = null
        private var messageId: String? = null
        private var notification: String? = null
        private var provider: MutableList<String?>? = null
        private var recipient: String? = null
        private var status: MutableList<String?>? = null
        private var tag: MutableList<String?>? = null
        private var tags: String? = null
        private var tenantId: String? = null
        private var traceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(messageListParams: MessageListParams) = apply {
            archived = messageListParams.archived
            cursor = messageListParams.cursor
            enqueuedAfter = messageListParams.enqueuedAfter
            event = messageListParams.event
            list = messageListParams.list
            messageId = messageListParams.messageId
            notification = messageListParams.notification
            provider = messageListParams.provider?.toMutableList()
            recipient = messageListParams.recipient
            status = messageListParams.status?.toMutableList()
            tag = messageListParams.tag?.toMutableList()
            tags = messageListParams.tags
            tenantId = messageListParams.tenantId
            traceId = messageListParams.traceId
            additionalHeaders = messageListParams.additionalHeaders.toBuilder()
            additionalQueryParams = messageListParams.additionalQueryParams.toBuilder()
        }

        /**
         * A boolean value that indicates whether archived messages should be included in the
         * response.
         */
        fun archived(archived: Boolean?) = apply { this.archived = archived }

        /**
         * Alias for [Builder.archived].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun archived(archived: Boolean) = archived(archived as Boolean?)

        /** Alias for calling [Builder.archived] with `archived.orElse(null)`. */
        fun archived(archived: Optional<Boolean>) = archived(archived.getOrNull())

        /** A unique identifier that allows for fetching the next set of messages. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** The enqueued datetime of a message to filter out messages received before. */
        fun enqueuedAfter(enqueuedAfter: String?) = apply { this.enqueuedAfter = enqueuedAfter }

        /** Alias for calling [Builder.enqueuedAfter] with `enqueuedAfter.orElse(null)`. */
        fun enqueuedAfter(enqueuedAfter: Optional<String>) =
            enqueuedAfter(enqueuedAfter.getOrNull())

        /** A unique identifier representing the event that was used to send the event. */
        fun event(event: String?) = apply { this.event = event }

        /** Alias for calling [Builder.event] with `event.orElse(null)`. */
        fun event(event: Optional<String>) = event(event.getOrNull())

        /** A unique identifier representing the list the message was sent to. */
        fun list(list: String?) = apply { this.list = list }

        /** Alias for calling [Builder.list] with `list.orElse(null)`. */
        fun list(list: Optional<String>) = list(list.getOrNull())

        /**
         * A unique identifier representing the message_id returned from either /send or /send/list.
         */
        fun messageId(messageId: String?) = apply { this.messageId = messageId }

        /** Alias for calling [Builder.messageId] with `messageId.orElse(null)`. */
        fun messageId(messageId: Optional<String>) = messageId(messageId.getOrNull())

        /** A unique identifier representing the notification that was used to send the event. */
        fun notification(notification: String?) = apply { this.notification = notification }

        /** Alias for calling [Builder.notification] with `notification.orElse(null)`. */
        fun notification(notification: Optional<String>) = notification(notification.getOrNull())

        /**
         * The key assocated to the provider you want to filter on. E.g., sendgrid, inbox, twilio,
         * slack, msteams, etc. Allows multiple values to be set in query parameters.
         */
        fun provider(provider: List<String?>?) = apply { this.provider = provider?.toMutableList() }

        /** Alias for calling [Builder.provider] with `provider.orElse(null)`. */
        fun provider(provider: Optional<List<String?>>) = provider(provider.getOrNull())

        /**
         * Adds a single [String] to [Builder.provider].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProvider(provider: String) = apply {
            this.provider = (this.provider ?: mutableListOf()).apply { add(provider) }
        }

        /** A unique identifier representing the recipient associated with the requested profile. */
        fun recipient(recipient: String?) = apply { this.recipient = recipient }

        /** Alias for calling [Builder.recipient] with `recipient.orElse(null)`. */
        fun recipient(recipient: Optional<String>) = recipient(recipient.getOrNull())

        /**
         * An indicator of the current status of the message. Allows multiple values to be set in
         * query parameters.
         */
        fun status(status: List<String?>?) = apply { this.status = status?.toMutableList() }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<List<String?>>) = status(status.getOrNull())

        /**
         * Adds a single [String] to [Builder.status].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatus(status: String) = apply {
            this.status = (this.status ?: mutableListOf()).apply { add(status) }
        }

        /**
         * A tag placed in the metadata.tags during a notification send. Allows multiple values to
         * be set in query parameters.
         */
        fun tag(tag: List<String?>?) = apply { this.tag = tag?.toMutableList() }

        /** Alias for calling [Builder.tag] with `tag.orElse(null)`. */
        fun tag(tag: Optional<List<String?>>) = tag(tag.getOrNull())

        /**
         * Adds a single [String] to [Builder.tag].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            this.tag = (this.tag ?: mutableListOf()).apply { add(tag) }
        }

        /**
         * A comma delimited list of 'tags'. Messages will be returned if they match any of the tags
         * passed in.
         */
        fun tags(tags: String?) = apply { this.tags = tags }

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<String>) = tags(tags.getOrNull())

        /** Messages sent with the context of a Tenant */
        fun tenantId(tenantId: String?) = apply { this.tenantId = tenantId }

        /** Alias for calling [Builder.tenantId] with `tenantId.orElse(null)`. */
        fun tenantId(tenantId: Optional<String>) = tenantId(tenantId.getOrNull())

        /** The unique identifier used to trace the requests */
        fun traceId(traceId: String?) = apply { this.traceId = traceId }

        /** Alias for calling [Builder.traceId] with `traceId.orElse(null)`. */
        fun traceId(traceId: Optional<String>) = traceId(traceId.getOrNull())

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
         * Returns an immutable instance of [MessageListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessageListParams =
            MessageListParams(
                archived,
                cursor,
                enqueuedAfter,
                event,
                list,
                messageId,
                notification,
                provider?.toImmutable(),
                recipient,
                status?.toImmutable(),
                tag?.toImmutable(),
                tags,
                tenantId,
                traceId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                archived?.let { put("archived", it.toString()) }
                cursor?.let { put("cursor", it) }
                enqueuedAfter?.let { put("enqueued_after", it) }
                event?.let { put("event", it) }
                list?.let { put("list", it) }
                messageId?.let { put("messageId", it) }
                notification?.let { put("notification", it) }
                provider?.let { put("provider", it.joinToString(",")) }
                recipient?.let { put("recipient", it) }
                status?.let { put("status", it.joinToString(",")) }
                tag?.let { put("tag", it.joinToString(",")) }
                tags?.let { put("tags", it) }
                tenantId?.let { put("tenant_id", it) }
                traceId?.let { put("traceId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageListParams &&
            archived == other.archived &&
            cursor == other.cursor &&
            enqueuedAfter == other.enqueuedAfter &&
            event == other.event &&
            list == other.list &&
            messageId == other.messageId &&
            notification == other.notification &&
            provider == other.provider &&
            recipient == other.recipient &&
            status == other.status &&
            tag == other.tag &&
            tags == other.tags &&
            tenantId == other.tenantId &&
            traceId == other.traceId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            archived,
            cursor,
            enqueuedAfter,
            event,
            list,
            messageId,
            notification,
            provider,
            recipient,
            status,
            tag,
            tags,
            tenantId,
            traceId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "MessageListParams{archived=$archived, cursor=$cursor, enqueuedAfter=$enqueuedAfter, event=$event, list=$list, messageId=$messageId, notification=$notification, provider=$provider, recipient=$recipient, status=$status, tag=$tag, tags=$tags, tenantId=$tenantId, traceId=$traceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

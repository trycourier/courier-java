// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.inbound

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.checkRequired
import com.courier.api.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class InboundTrackEventResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val messageId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("messageId") @ExcludeMissing messageId: JsonField<String> = JsonMissing.of()
    ) : this(messageId, mutableMapOf())

    /**
     * A successful call returns a `202` status code along with a `requestId` in the response body.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageId(): String = messageId.getRequired("messageId")

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
         * Returns a mutable builder for constructing an instance of [InboundTrackEventResponse].
         *
         * The following fields are required:
         * ```java
         * .messageId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundTrackEventResponse]. */
    class Builder internal constructor() {

        private var messageId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundTrackEventResponse: InboundTrackEventResponse) = apply {
            messageId = inboundTrackEventResponse.messageId
            additionalProperties = inboundTrackEventResponse.additionalProperties.toMutableMap()
        }

        /**
         * A successful call returns a `202` status code along with a `requestId` in the response
         * body.
         */
        fun messageId(messageId: String) = messageId(JsonField.of(messageId))

        /**
         * Sets [Builder.messageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [InboundTrackEventResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .messageId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundTrackEventResponse =
            InboundTrackEventResponse(
                checkRequired("messageId", messageId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InboundTrackEventResponse = apply {
        if (validated) {
            return@apply
        }

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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = (if (messageId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundTrackEventResponse &&
            messageId == other.messageId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(messageId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundTrackEventResponse{messageId=$messageId, additionalProperties=$additionalProperties}"
}

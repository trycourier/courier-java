// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkRequired
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Send via Slack (channel, email, or user_id) */
class SlackRecipient
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val slack: JsonField<Slack>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("slack") @ExcludeMissing slack: JsonField<Slack> = JsonMissing.of()
    ) : this(slack, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun slack(): Slack = slack.getRequired("slack")

    /**
     * Returns the raw JSON value of [slack].
     *
     * Unlike [slack], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("slack") @ExcludeMissing fun _slack(): JsonField<Slack> = slack

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
         * Returns a mutable builder for constructing an instance of [SlackRecipient].
         *
         * The following fields are required:
         * ```java
         * .slack()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SlackRecipient]. */
    class Builder internal constructor() {

        private var slack: JsonField<Slack>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(slackRecipient: SlackRecipient) = apply {
            slack = slackRecipient.slack
            additionalProperties = slackRecipient.additionalProperties.toMutableMap()
        }

        fun slack(slack: Slack) = slack(JsonField.of(slack))

        /**
         * Sets [Builder.slack] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slack] with a well-typed [Slack] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun slack(slack: JsonField<Slack>) = apply { this.slack = slack }

        /** Alias for calling [slack] with `Slack.ofSendToSlackChannel(sendToSlackChannel)`. */
        fun slack(sendToSlackChannel: SendToSlackChannel) =
            slack(Slack.ofSendToSlackChannel(sendToSlackChannel))

        /** Alias for calling [slack] with `Slack.ofSendToSlackEmail(sendToSlackEmail)`. */
        fun slack(sendToSlackEmail: SendToSlackEmail) =
            slack(Slack.ofSendToSlackEmail(sendToSlackEmail))

        /** Alias for calling [slack] with `Slack.ofSendToSlackUserId(sendToSlackUserId)`. */
        fun slack(sendToSlackUserId: SendToSlackUserId) =
            slack(Slack.ofSendToSlackUserId(sendToSlackUserId))

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
         * Returns an immutable instance of [SlackRecipient].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .slack()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SlackRecipient =
            SlackRecipient(checkRequired("slack", slack), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): SlackRecipient = apply {
        if (validated) {
            return@apply
        }

        slack().validate()
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
    @JvmSynthetic internal fun validity(): Int = (slack.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SlackRecipient &&
            slack == other.slack &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(slack, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SlackRecipient{slack=$slack, additionalProperties=$additionalProperties}"
}

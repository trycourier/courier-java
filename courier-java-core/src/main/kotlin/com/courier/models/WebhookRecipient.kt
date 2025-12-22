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

/** Send via webhook */
class WebhookRecipient
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val webhook: JsonField<WebhookProfile>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("webhook")
        @ExcludeMissing
        webhook: JsonField<WebhookProfile> = JsonMissing.of()
    ) : this(webhook, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun webhook(): WebhookProfile = webhook.getRequired("webhook")

    /**
     * Returns the raw JSON value of [webhook].
     *
     * Unlike [webhook], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook") @ExcludeMissing fun _webhook(): JsonField<WebhookProfile> = webhook

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
         * Returns a mutable builder for constructing an instance of [WebhookRecipient].
         *
         * The following fields are required:
         * ```java
         * .webhook()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookRecipient]. */
    class Builder internal constructor() {

        private var webhook: JsonField<WebhookProfile>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webhookRecipient: WebhookRecipient) = apply {
            webhook = webhookRecipient.webhook
            additionalProperties = webhookRecipient.additionalProperties.toMutableMap()
        }

        fun webhook(webhook: WebhookProfile) = webhook(JsonField.of(webhook))

        /**
         * Sets [Builder.webhook] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhook] with a well-typed [WebhookProfile] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhook(webhook: JsonField<WebhookProfile>) = apply { this.webhook = webhook }

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
         * Returns an immutable instance of [WebhookRecipient].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .webhook()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookRecipient =
            WebhookRecipient(checkRequired("webhook", webhook), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): WebhookRecipient = apply {
        if (validated) {
            return@apply
        }

        webhook().validate()
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
    @JvmSynthetic internal fun validity(): Int = (webhook.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookRecipient &&
            webhook == other.webhook &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(webhook, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookRecipient{webhook=$webhook, additionalProperties=$additionalProperties}"
}

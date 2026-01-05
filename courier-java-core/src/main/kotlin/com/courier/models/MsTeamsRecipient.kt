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

/** Send via Microsoft Teams */
class MsTeamsRecipient
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val msTeams: JsonField<MsTeams>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ms_teams") @ExcludeMissing msTeams: JsonField<MsTeams> = JsonMissing.of()
    ) : this(msTeams, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun msTeams(): MsTeams = msTeams.getRequired("ms_teams")

    /**
     * Returns the raw JSON value of [msTeams].
     *
     * Unlike [msTeams], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ms_teams") @ExcludeMissing fun _msTeams(): JsonField<MsTeams> = msTeams

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
         * Returns a mutable builder for constructing an instance of [MsTeamsRecipient].
         *
         * The following fields are required:
         * ```java
         * .msTeams()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MsTeamsRecipient]. */
    class Builder internal constructor() {

        private var msTeams: JsonField<MsTeams>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(msTeamsRecipient: MsTeamsRecipient) = apply {
            msTeams = msTeamsRecipient.msTeams
            additionalProperties = msTeamsRecipient.additionalProperties.toMutableMap()
        }

        fun msTeams(msTeams: MsTeams) = msTeams(JsonField.of(msTeams))

        /**
         * Sets [Builder.msTeams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msTeams] with a well-typed [MsTeams] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun msTeams(msTeams: JsonField<MsTeams>) = apply { this.msTeams = msTeams }

        /**
         * Alias for calling [msTeams] with `MsTeams.ofSendToMsTeamsUserId(sendToMsTeamsUserId)`.
         */
        fun msTeams(sendToMsTeamsUserId: SendToMsTeamsUserId) =
            msTeams(MsTeams.ofSendToMsTeamsUserId(sendToMsTeamsUserId))

        /** Alias for calling [msTeams] with `MsTeams.ofSendToMsTeamsEmail(sendToMsTeamsEmail)`. */
        fun msTeams(sendToMsTeamsEmail: SendToMsTeamsEmail) =
            msTeams(MsTeams.ofSendToMsTeamsEmail(sendToMsTeamsEmail))

        /**
         * Alias for calling [msTeams] with
         * `MsTeams.ofSendToMsTeamsChannelId(sendToMsTeamsChannelId)`.
         */
        fun msTeams(sendToMsTeamsChannelId: SendToMsTeamsChannelId) =
            msTeams(MsTeams.ofSendToMsTeamsChannelId(sendToMsTeamsChannelId))

        /**
         * Alias for calling [msTeams] with
         * `MsTeams.ofSendToMsTeamsConversationId(sendToMsTeamsConversationId)`.
         */
        fun msTeams(sendToMsTeamsConversationId: SendToMsTeamsConversationId) =
            msTeams(MsTeams.ofSendToMsTeamsConversationId(sendToMsTeamsConversationId))

        /**
         * Alias for calling [msTeams] with
         * `MsTeams.ofSendToMsTeamsChannelName(sendToMsTeamsChannelName)`.
         */
        fun msTeams(sendToMsTeamsChannelName: SendToMsTeamsChannelName) =
            msTeams(MsTeams.ofSendToMsTeamsChannelName(sendToMsTeamsChannelName))

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
         * Returns an immutable instance of [MsTeamsRecipient].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .msTeams()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MsTeamsRecipient =
            MsTeamsRecipient(checkRequired("msTeams", msTeams), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): MsTeamsRecipient = apply {
        if (validated) {
            return@apply
        }

        msTeams().validate()
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
    @JvmSynthetic internal fun validity(): Int = (msTeams.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MsTeamsRecipient &&
            msTeams == other.msTeams &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(msTeams, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MsTeamsRecipient{msTeams=$msTeams, additionalProperties=$additionalProperties}"
}

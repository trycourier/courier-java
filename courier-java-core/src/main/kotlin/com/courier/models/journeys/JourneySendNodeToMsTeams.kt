// File generated from our OpenAPI spec by Stainless.

package com.courier.models.journeys

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Send to a Microsoft Teams address directly, bypassing the recipient's stored profile. Requires
 * exactly one target: `channel_id`, `channel_name` (with `team_id`), `user_id`, or `email`.
 * `channel_name`, `user_id`, and `email` also need at least one of `service_url` or `tenant_id` —
 * if you provide both, they must agree. `channel_id` doesn't require tenant context to publish, but
 * provide `service_url` or `tenant_id` anyway: sends without either have failed at delivery in
 * testing. `conversation_id` and `reply_to_activity_id`, available on the send API's `MsTeams`
 * profile, aren't supported here yet.
 */
class JourneySendNodeToMsTeams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val channelId: JsonField<String>,
    private val channelName: JsonField<String>,
    private val email: JsonField<String>,
    private val serviceUrl: JsonField<String>,
    private val teamId: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val userId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("channel_id") @ExcludeMissing channelId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("channel_name")
        @ExcludeMissing
        channelName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("service_url")
        @ExcludeMissing
        serviceUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("team_id") @ExcludeMissing teamId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
    ) : this(channelId, channelName, email, serviceUrl, teamId, tenantId, userId, mutableMapOf())

    /**
     * Bot Framework channel ID to send to.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channelId(): Optional<String> = channelId.getOptional("channel_id")

    /**
     * Teams channel name to send to. Requires `team_id`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun channelName(): Optional<String> = channelName.getOptional("channel_name")

    /**
     * Email address of the Teams user to send to.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * The regional Bot Framework host for this conversation, e.g.
     * `https://smba.trafficmanager.net/amer`. A path segment naming the Microsoft tenant may follow
     * it and is used to derive `tenant_id` when it is not supplied directly.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceUrl(): Optional<String> = serviceUrl.getOptional("service_url")

    /**
     * Microsoft Teams team ID. Required alongside `channel_name`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun teamId(): Optional<String> = teamId.getOptional("team_id")

    /**
     * The Microsoft (Azure AD) tenant this send targets or authenticates against. Unrelated to
     * `message.context.tenant_id`, which is the Courier customer's own multi-tenant context.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tenantId(): Optional<String> = tenantId.getOptional("tenant_id")

    /**
     * Microsoft Teams user ID to send to.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * Returns the raw JSON value of [channelId].
     *
     * Unlike [channelId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel_id") @ExcludeMissing fun _channelId(): JsonField<String> = channelId

    /**
     * Returns the raw JSON value of [channelName].
     *
     * Unlike [channelName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel_name")
    @ExcludeMissing
    fun _channelName(): JsonField<String> = channelName

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [serviceUrl].
     *
     * Unlike [serviceUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service_url") @ExcludeMissing fun _serviceUrl(): JsonField<String> = serviceUrl

    /**
     * Returns the raw JSON value of [teamId].
     *
     * Unlike [teamId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("team_id") @ExcludeMissing fun _teamId(): JsonField<String> = teamId

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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

        /** Returns a mutable builder for constructing an instance of [JourneySendNodeToMsTeams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JourneySendNodeToMsTeams]. */
    class Builder internal constructor() {

        private var channelId: JsonField<String> = JsonMissing.of()
        private var channelName: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var serviceUrl: JsonField<String> = JsonMissing.of()
        private var teamId: JsonField<String> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(journeySendNodeToMsTeams: JourneySendNodeToMsTeams) = apply {
            channelId = journeySendNodeToMsTeams.channelId
            channelName = journeySendNodeToMsTeams.channelName
            email = journeySendNodeToMsTeams.email
            serviceUrl = journeySendNodeToMsTeams.serviceUrl
            teamId = journeySendNodeToMsTeams.teamId
            tenantId = journeySendNodeToMsTeams.tenantId
            userId = journeySendNodeToMsTeams.userId
            additionalProperties = journeySendNodeToMsTeams.additionalProperties.toMutableMap()
        }

        /** Bot Framework channel ID to send to. */
        fun channelId(channelId: String) = channelId(JsonField.of(channelId))

        /**
         * Sets [Builder.channelId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun channelId(channelId: JsonField<String>) = apply { this.channelId = channelId }

        /** Teams channel name to send to. Requires `team_id`. */
        fun channelName(channelName: String) = channelName(JsonField.of(channelName))

        /**
         * Sets [Builder.channelName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun channelName(channelName: JsonField<String>) = apply { this.channelName = channelName }

        /** Email address of the Teams user to send to. */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /**
         * The regional Bot Framework host for this conversation, e.g.
         * `https://smba.trafficmanager.net/amer`. A path segment naming the Microsoft tenant may
         * follow it and is used to derive `tenant_id` when it is not supplied directly.
         */
        fun serviceUrl(serviceUrl: String) = serviceUrl(JsonField.of(serviceUrl))

        /**
         * Sets [Builder.serviceUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serviceUrl(serviceUrl: JsonField<String>) = apply { this.serviceUrl = serviceUrl }

        /** Microsoft Teams team ID. Required alongside `channel_name`. */
        fun teamId(teamId: String) = teamId(JsonField.of(teamId))

        /**
         * Sets [Builder.teamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun teamId(teamId: JsonField<String>) = apply { this.teamId = teamId }

        /**
         * The Microsoft (Azure AD) tenant this send targets or authenticates against. Unrelated to
         * `message.context.tenant_id`, which is the Courier customer's own multi-tenant context.
         */
        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        /** Microsoft Teams user ID to send to. */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
         * Returns an immutable instance of [JourneySendNodeToMsTeams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): JourneySendNodeToMsTeams =
            JourneySendNodeToMsTeams(
                channelId,
                channelName,
                email,
                serviceUrl,
                teamId,
                tenantId,
                userId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws CourierInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): JourneySendNodeToMsTeams = apply {
        if (validated) {
            return@apply
        }

        channelId()
        channelName()
        email()
        serviceUrl()
        teamId()
        tenantId()
        userId()
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
        (if (channelId.asKnown().isPresent) 1 else 0) +
            (if (channelName.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (serviceUrl.asKnown().isPresent) 1 else 0) +
            (if (teamId.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JourneySendNodeToMsTeams &&
            channelId == other.channelId &&
            channelName == other.channelName &&
            email == other.email &&
            serviceUrl == other.serviceUrl &&
            teamId == other.teamId &&
            tenantId == other.tenantId &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            channelId,
            channelName,
            email,
            serviceUrl,
            teamId,
            tenantId,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JourneySendNodeToMsTeams{channelId=$channelId, channelName=$channelName, email=$email, serviceUrl=$serviceUrl, teamId=$teamId, tenantId=$tenantId, userId=$userId, additionalProperties=$additionalProperties}"
}

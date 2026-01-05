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

class MsTeamsBaseProperties
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val serviceUrl: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("service_url")
        @ExcludeMissing
        serviceUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
    ) : this(serviceUrl, tenantId, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun serviceUrl(): String = serviceUrl.getRequired("service_url")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * Returns the raw JSON value of [serviceUrl].
     *
     * Unlike [serviceUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service_url") @ExcludeMissing fun _serviceUrl(): JsonField<String> = serviceUrl

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

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
         * Returns a mutable builder for constructing an instance of [MsTeamsBaseProperties].
         *
         * The following fields are required:
         * ```java
         * .serviceUrl()
         * .tenantId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MsTeamsBaseProperties]. */
    class Builder internal constructor() {

        private var serviceUrl: JsonField<String>? = null
        private var tenantId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(msTeamsBaseProperties: MsTeamsBaseProperties) = apply {
            serviceUrl = msTeamsBaseProperties.serviceUrl
            tenantId = msTeamsBaseProperties.tenantId
            additionalProperties = msTeamsBaseProperties.additionalProperties.toMutableMap()
        }

        fun serviceUrl(serviceUrl: String) = serviceUrl(JsonField.of(serviceUrl))

        /**
         * Sets [Builder.serviceUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serviceUrl(serviceUrl: JsonField<String>) = apply { this.serviceUrl = serviceUrl }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

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
         * Returns an immutable instance of [MsTeamsBaseProperties].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .serviceUrl()
         * .tenantId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MsTeamsBaseProperties =
            MsTeamsBaseProperties(
                checkRequired("serviceUrl", serviceUrl),
                checkRequired("tenantId", tenantId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MsTeamsBaseProperties = apply {
        if (validated) {
            return@apply
        }

        serviceUrl()
        tenantId()
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
        (if (serviceUrl.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MsTeamsBaseProperties &&
            serviceUrl == other.serviceUrl &&
            tenantId == other.tenantId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(serviceUrl, tenantId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MsTeamsBaseProperties{serviceUrl=$serviceUrl, tenantId=$tenantId, additionalProperties=$additionalProperties}"
}

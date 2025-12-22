// File generated from our OpenAPI spec by Stainless.

package com.courier.models

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class AirshipProfile
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val audience: JsonField<AirshipProfileAudience>,
    private val deviceTypes: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("audience")
        @ExcludeMissing
        audience: JsonField<AirshipProfileAudience> = JsonMissing.of(),
        @JsonProperty("device_types")
        @ExcludeMissing
        deviceTypes: JsonField<List<String>> = JsonMissing.of(),
    ) : this(audience, deviceTypes, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun audience(): AirshipProfileAudience = audience.getRequired("audience")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deviceTypes(): List<String> = deviceTypes.getRequired("device_types")

    /**
     * Returns the raw JSON value of [audience].
     *
     * Unlike [audience], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("audience")
    @ExcludeMissing
    fun _audience(): JsonField<AirshipProfileAudience> = audience

    /**
     * Returns the raw JSON value of [deviceTypes].
     *
     * Unlike [deviceTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("device_types")
    @ExcludeMissing
    fun _deviceTypes(): JsonField<List<String>> = deviceTypes

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
         * Returns a mutable builder for constructing an instance of [AirshipProfile].
         *
         * The following fields are required:
         * ```java
         * .audience()
         * .deviceTypes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AirshipProfile]. */
    class Builder internal constructor() {

        private var audience: JsonField<AirshipProfileAudience>? = null
        private var deviceTypes: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(airshipProfile: AirshipProfile) = apply {
            audience = airshipProfile.audience
            deviceTypes = airshipProfile.deviceTypes.map { it.toMutableList() }
            additionalProperties = airshipProfile.additionalProperties.toMutableMap()
        }

        fun audience(audience: AirshipProfileAudience) = audience(JsonField.of(audience))

        /**
         * Sets [Builder.audience] to an arbitrary JSON value.
         *
         * You should usually call [Builder.audience] with a well-typed [AirshipProfileAudience]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun audience(audience: JsonField<AirshipProfileAudience>) = apply {
            this.audience = audience
        }

        fun deviceTypes(deviceTypes: List<String>) = deviceTypes(JsonField.of(deviceTypes))

        /**
         * Sets [Builder.deviceTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deviceTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deviceTypes(deviceTypes: JsonField<List<String>>) = apply {
            this.deviceTypes = deviceTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [deviceTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDeviceType(deviceType: String) = apply {
            deviceTypes =
                (deviceTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("deviceTypes", it).add(deviceType)
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
         * Returns an immutable instance of [AirshipProfile].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .audience()
         * .deviceTypes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AirshipProfile =
            AirshipProfile(
                checkRequired("audience", audience),
                checkRequired("deviceTypes", deviceTypes).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AirshipProfile = apply {
        if (validated) {
            return@apply
        }

        audience().validate()
        deviceTypes()
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
        (audience.asKnown().getOrNull()?.validity() ?: 0) +
            (deviceTypes.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AirshipProfile &&
            audience == other.audience &&
            deviceTypes == other.deviceTypes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(audience, deviceTypes, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AirshipProfile{audience=$audience, deviceTypes=$deviceTypes, additionalProperties=$additionalProperties}"
}

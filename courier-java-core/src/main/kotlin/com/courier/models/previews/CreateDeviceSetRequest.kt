// File generated from our OpenAPI spec by Stainless.

package com.courier.models.previews

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

/**
 * Request body for creating or replacing a device set. A full replace, not a patch — both fields
 * are always written.
 */
class CreateDeviceSetRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val deviceIds: JsonField<List<String>>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("device_ids")
        @ExcludeMissing
        deviceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(deviceIds, name, mutableMapOf())

    /**
     * The devices the set contains, by `PreviewDevice.id`. At least one is required.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deviceIds(): List<String> = deviceIds.getRequired("device_ids")

    /**
     * Human-readable name.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Returns the raw JSON value of [deviceIds].
     *
     * Unlike [deviceIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("device_ids")
    @ExcludeMissing
    fun _deviceIds(): JsonField<List<String>> = deviceIds

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [CreateDeviceSetRequest].
         *
         * The following fields are required:
         * ```java
         * .deviceIds()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreateDeviceSetRequest]. */
    class Builder internal constructor() {

        private var deviceIds: JsonField<MutableList<String>>? = null
        private var name: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createDeviceSetRequest: CreateDeviceSetRequest) = apply {
            deviceIds = createDeviceSetRequest.deviceIds.map { it.toMutableList() }
            name = createDeviceSetRequest.name
            additionalProperties = createDeviceSetRequest.additionalProperties.toMutableMap()
        }

        /** The devices the set contains, by `PreviewDevice.id`. At least one is required. */
        fun deviceIds(deviceIds: List<String>) = deviceIds(JsonField.of(deviceIds))

        /**
         * Sets [Builder.deviceIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deviceIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deviceIds(deviceIds: JsonField<List<String>>) = apply {
            this.deviceIds = deviceIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [deviceIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDeviceId(deviceId: String) = apply {
            deviceIds =
                (deviceIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("deviceIds", it).add(deviceId)
                }
        }

        /** Human-readable name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [CreateDeviceSetRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .deviceIds()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreateDeviceSetRequest =
            CreateDeviceSetRequest(
                checkRequired("deviceIds", deviceIds).map { it.toImmutable() },
                checkRequired("name", name),
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
    fun validate(): CreateDeviceSetRequest = apply {
        if (validated) {
            return@apply
        }

        deviceIds()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (deviceIds.asKnown().getOrNull()?.size ?: 0) + (if (name.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateDeviceSetRequest &&
            deviceIds == other.deviceIds &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(deviceIds, name, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreateDeviceSetRequest{deviceIds=$deviceIds, name=$name, additionalProperties=$additionalProperties}"
}

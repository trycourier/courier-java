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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A named, reusable list of preview devices. */
class DeviceSet
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val deviceIds: JsonField<List<String>>,
    private val name: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val archivedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device_ids")
        @ExcludeMissing
        deviceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("archived_at")
        @ExcludeMissing
        archivedAt: JsonField<String> = JsonMissing.of(),
    ) : this(id, createdAt, deviceIds, name, updatedAt, archivedAt, mutableMapOf())

    /**
     * Unique identifier for the device set.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * ISO-8601 timestamp of when the set was created.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): String = createdAt.getRequired("created_at")

    /**
     * The devices in this set, by `PreviewDevice.id`.
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
     * ISO-8601 timestamp of when the set was last written.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): String = updatedAt.getRequired("updated_at")

    /**
     * ISO-8601 timestamp of when the set was archived. Present only on the archive response, which
     * is the one place the state is observable.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archivedAt(): Optional<String> = archivedAt.getOptional("archived_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

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

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    /**
     * Returns the raw JSON value of [archivedAt].
     *
     * Unlike [archivedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived_at") @ExcludeMissing fun _archivedAt(): JsonField<String> = archivedAt

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
         * Returns a mutable builder for constructing an instance of [DeviceSet].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .deviceIds()
         * .name()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DeviceSet]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<String>? = null
        private var deviceIds: JsonField<MutableList<String>>? = null
        private var name: JsonField<String>? = null
        private var updatedAt: JsonField<String>? = null
        private var archivedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(deviceSet: DeviceSet) = apply {
            id = deviceSet.id
            createdAt = deviceSet.createdAt
            deviceIds = deviceSet.deviceIds.map { it.toMutableList() }
            name = deviceSet.name
            updatedAt = deviceSet.updatedAt
            archivedAt = deviceSet.archivedAt
            additionalProperties = deviceSet.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the device set. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** ISO-8601 timestamp of when the set was created. */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** The devices in this set, by `PreviewDevice.id`. */
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

        /** ISO-8601 timestamp of when the set was last written. */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

        /**
         * ISO-8601 timestamp of when the set was archived. Present only on the archive response,
         * which is the one place the state is observable.
         */
        fun archivedAt(archivedAt: String) = archivedAt(JsonField.of(archivedAt))

        /**
         * Sets [Builder.archivedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archivedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archivedAt(archivedAt: JsonField<String>) = apply { this.archivedAt = archivedAt }

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
         * Returns an immutable instance of [DeviceSet].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .deviceIds()
         * .name()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DeviceSet =
            DeviceSet(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("deviceIds", deviceIds).map { it.toImmutable() },
                checkRequired("name", name),
                checkRequired("updatedAt", updatedAt),
                archivedAt,
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
    fun validate(): DeviceSet = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        deviceIds()
        name()
        updatedAt()
        archivedAt()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (deviceIds.asKnown().getOrNull()?.size ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (archivedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DeviceSet &&
            id == other.id &&
            createdAt == other.createdAt &&
            deviceIds == other.deviceIds &&
            name == other.name &&
            updatedAt == other.updatedAt &&
            archivedAt == other.archivedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, createdAt, deviceIds, name, updatedAt, archivedAt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DeviceSet{id=$id, createdAt=$createdAt, deviceIds=$deviceIds, name=$name, updatedAt=$updatedAt, archivedAt=$archivedAt, additionalProperties=$additionalProperties}"
}

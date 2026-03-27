// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

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
import java.util.Optional

/** A version entry for a notification template. */
class VersionNode
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val created: JsonField<Long>,
    private val creator: JsonField<String>,
    private val version: JsonField<String>,
    private val hasChanges: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created") @ExcludeMissing created: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("creator") @ExcludeMissing creator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
        @JsonProperty("has_changes")
        @ExcludeMissing
        hasChanges: JsonField<Boolean> = JsonMissing.of(),
    ) : this(created, creator, version, hasChanges, mutableMapOf())

    /**
     * Epoch milliseconds when this version was created.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): Long = created.getRequired("created")

    /**
     * User ID of the version creator.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creator(): String = creator.getRequired("creator")

    /**
     * Version identifier. One of "draft", "published:vNNN" (current published version), or "vNNN"
     * (historical version).
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): String = version.getRequired("version")

    /**
     * Whether the draft has unpublished changes. Only present on the draft version.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hasChanges(): Optional<Boolean> = hasChanges.getOptional("has_changes")

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<Long> = created

    /**
     * Returns the raw JSON value of [creator].
     *
     * Unlike [creator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creator") @ExcludeMissing fun _creator(): JsonField<String> = creator

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

    /**
     * Returns the raw JSON value of [hasChanges].
     *
     * Unlike [hasChanges], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_changes") @ExcludeMissing fun _hasChanges(): JsonField<Boolean> = hasChanges

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
         * Returns a mutable builder for constructing an instance of [VersionNode].
         *
         * The following fields are required:
         * ```java
         * .created()
         * .creator()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VersionNode]. */
    class Builder internal constructor() {

        private var created: JsonField<Long>? = null
        private var creator: JsonField<String>? = null
        private var version: JsonField<String>? = null
        private var hasChanges: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(versionNode: VersionNode) = apply {
            created = versionNode.created
            creator = versionNode.creator
            version = versionNode.version
            hasChanges = versionNode.hasChanges
            additionalProperties = versionNode.additionalProperties.toMutableMap()
        }

        /** Epoch milliseconds when this version was created. */
        fun created(created: Long) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun created(created: JsonField<Long>) = apply { this.created = created }

        /** User ID of the version creator. */
        fun creator(creator: String) = creator(JsonField.of(creator))

        /**
         * Sets [Builder.creator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun creator(creator: JsonField<String>) = apply { this.creator = creator }

        /**
         * Version identifier. One of "draft", "published:vNNN" (current published version), or
         * "vNNN" (historical version).
         */
        fun version(version: String) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<String>) = apply { this.version = version }

        /** Whether the draft has unpublished changes. Only present on the draft version. */
        fun hasChanges(hasChanges: Boolean) = hasChanges(JsonField.of(hasChanges))

        /**
         * Sets [Builder.hasChanges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasChanges] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasChanges(hasChanges: JsonField<Boolean>) = apply { this.hasChanges = hasChanges }

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
         * Returns an immutable instance of [VersionNode].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .created()
         * .creator()
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VersionNode =
            VersionNode(
                checkRequired("created", created),
                checkRequired("creator", creator),
                checkRequired("version", version),
                hasChanges,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VersionNode = apply {
        if (validated) {
            return@apply
        }

        created()
        creator()
        version()
        hasChanges()
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
        (if (created.asKnown().isPresent) 1 else 0) +
            (if (creator.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0) +
            (if (hasChanges.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VersionNode &&
            created == other.created &&
            creator == other.creator &&
            version == other.version &&
            hasChanges == other.hasChanges &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(created, creator, version, hasChanges, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VersionNode{created=$created, creator=$creator, version=$version, hasChanges=$hasChanges, additionalProperties=$additionalProperties}"
}

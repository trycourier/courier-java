// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants

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

/** Request body for publishing a tenant template version */
class PostTenantTemplatePublishRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val version: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of()
    ) : this(version, mutableMapOf())

    /**
     * The version of the template to publish (e.g., "v1", "v2", "latest"). If not provided,
     * defaults to "latest".
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<String> = version.getOptional("version")

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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
         * Returns a mutable builder for constructing an instance of
         * [PostTenantTemplatePublishRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PostTenantTemplatePublishRequest]. */
    class Builder internal constructor() {

        private var version: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(postTenantTemplatePublishRequest: PostTenantTemplatePublishRequest) =
            apply {
                version = postTenantTemplatePublishRequest.version
                additionalProperties =
                    postTenantTemplatePublishRequest.additionalProperties.toMutableMap()
            }

        /**
         * The version of the template to publish (e.g., "v1", "v2", "latest"). If not provided,
         * defaults to "latest".
         */
        fun version(version: String) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<String>) = apply { this.version = version }

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
         * Returns an immutable instance of [PostTenantTemplatePublishRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PostTenantTemplatePublishRequest =
            PostTenantTemplatePublishRequest(version, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PostTenantTemplatePublishRequest = apply {
        if (validated) {
            return@apply
        }

        version()
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
    @JvmSynthetic internal fun validity(): Int = (if (version.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PostTenantTemplatePublishRequest &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(version, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PostTenantTemplatePublishRequest{version=$version, additionalProperties=$additionalProperties}"
}

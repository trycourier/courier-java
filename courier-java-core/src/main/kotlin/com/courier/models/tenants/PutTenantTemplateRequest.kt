// File generated from our OpenAPI spec by Stainless.

package com.courier.models.tenants

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
import kotlin.jvm.optionals.getOrNull

/** Request body for creating or updating a tenant notification template */
class PutTenantTemplateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val template: JsonField<TenantTemplateInput>,
    private val published: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("template")
        @ExcludeMissing
        template: JsonField<TenantTemplateInput> = JsonMissing.of(),
        @JsonProperty("published") @ExcludeMissing published: JsonField<Boolean> = JsonMissing.of(),
    ) : this(template, published, mutableMapOf())

    /**
     * Template configuration for creating or updating a tenant notification template
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun template(): TenantTemplateInput = template.getRequired("template")

    /**
     * Whether to publish the template immediately after saving. When true, the template becomes the
     * active/published version. When false (default), the template is saved as a draft.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun published(): Optional<Boolean> = published.getOptional("published")

    /**
     * Returns the raw JSON value of [template].
     *
     * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("template")
    @ExcludeMissing
    fun _template(): JsonField<TenantTemplateInput> = template

    /**
     * Returns the raw JSON value of [published].
     *
     * Unlike [published], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published") @ExcludeMissing fun _published(): JsonField<Boolean> = published

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
         * Returns a mutable builder for constructing an instance of [PutTenantTemplateRequest].
         *
         * The following fields are required:
         * ```java
         * .template()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PutTenantTemplateRequest]. */
    class Builder internal constructor() {

        private var template: JsonField<TenantTemplateInput>? = null
        private var published: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(putTenantTemplateRequest: PutTenantTemplateRequest) = apply {
            template = putTenantTemplateRequest.template
            published = putTenantTemplateRequest.published
            additionalProperties = putTenantTemplateRequest.additionalProperties.toMutableMap()
        }

        /** Template configuration for creating or updating a tenant notification template */
        fun template(template: TenantTemplateInput) = template(JsonField.of(template))

        /**
         * Sets [Builder.template] to an arbitrary JSON value.
         *
         * You should usually call [Builder.template] with a well-typed [TenantTemplateInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun template(template: JsonField<TenantTemplateInput>) = apply { this.template = template }

        /**
         * Whether to publish the template immediately after saving. When true, the template becomes
         * the active/published version. When false (default), the template is saved as a draft.
         */
        fun published(published: Boolean) = published(JsonField.of(published))

        /**
         * Sets [Builder.published] to an arbitrary JSON value.
         *
         * You should usually call [Builder.published] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun published(published: JsonField<Boolean>) = apply { this.published = published }

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
         * Returns an immutable instance of [PutTenantTemplateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .template()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PutTenantTemplateRequest =
            PutTenantTemplateRequest(
                checkRequired("template", template),
                published,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PutTenantTemplateRequest = apply {
        if (validated) {
            return@apply
        }

        template().validate()
        published()
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
        (template.asKnown().getOrNull()?.validity() ?: 0) +
            (if (published.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PutTenantTemplateRequest &&
            template == other.template &&
            published == other.published &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(template, published, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PutTenantTemplateRequest{template=$template, published=$published, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
import com.courier.core.checkRequired
import com.courier.core.toImmutable
import com.courier.errors.CourierInvalidDataException
import com.courier.models.Paging
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class NotificationTemplateVersionListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val paging: JsonField<Paging>,
    private val versions: JsonField<List<VersionNode>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("paging") @ExcludeMissing paging: JsonField<Paging> = JsonMissing.of(),
        @JsonProperty("versions")
        @ExcludeMissing
        versions: JsonField<List<VersionNode>> = JsonMissing.of(),
    ) : this(paging, versions, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paging(): Paging = paging.getRequired("paging")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun versions(): List<VersionNode> = versions.getRequired("versions")

    /**
     * Returns the raw JSON value of [paging].
     *
     * Unlike [paging], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paging") @ExcludeMissing fun _paging(): JsonField<Paging> = paging

    /**
     * Returns the raw JSON value of [versions].
     *
     * Unlike [versions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("versions")
    @ExcludeMissing
    fun _versions(): JsonField<List<VersionNode>> = versions

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
         * [NotificationTemplateVersionListResponse].
         *
         * The following fields are required:
         * ```java
         * .paging()
         * .versions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationTemplateVersionListResponse]. */
    class Builder internal constructor() {

        private var paging: JsonField<Paging>? = null
        private var versions: JsonField<MutableList<VersionNode>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            notificationTemplateVersionListResponse: NotificationTemplateVersionListResponse
        ) = apply {
            paging = notificationTemplateVersionListResponse.paging
            versions = notificationTemplateVersionListResponse.versions.map { it.toMutableList() }
            additionalProperties =
                notificationTemplateVersionListResponse.additionalProperties.toMutableMap()
        }

        fun paging(paging: Paging) = paging(JsonField.of(paging))

        /**
         * Sets [Builder.paging] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paging] with a well-typed [Paging] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun paging(paging: JsonField<Paging>) = apply { this.paging = paging }

        fun versions(versions: List<VersionNode>) = versions(JsonField.of(versions))

        /**
         * Sets [Builder.versions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.versions] with a well-typed `List<VersionNode>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun versions(versions: JsonField<List<VersionNode>>) = apply {
            this.versions = versions.map { it.toMutableList() }
        }

        /**
         * Adds a single [VersionNode] to [versions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVersion(version: VersionNode) = apply {
            versions =
                (versions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("versions", it).add(version)
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
         * Returns an immutable instance of [NotificationTemplateVersionListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .paging()
         * .versions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NotificationTemplateVersionListResponse =
            NotificationTemplateVersionListResponse(
                checkRequired("paging", paging),
                checkRequired("versions", versions).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NotificationTemplateVersionListResponse = apply {
        if (validated) {
            return@apply
        }

        paging().validate()
        versions().forEach { it.validate() }
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
        (paging.asKnown().getOrNull()?.validity() ?: 0) +
            (versions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationTemplateVersionListResponse &&
            paging == other.paging &&
            versions == other.versions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(paging, versions, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotificationTemplateVersionListResponse{paging=$paging, versions=$versions, additionalProperties=$additionalProperties}"
}

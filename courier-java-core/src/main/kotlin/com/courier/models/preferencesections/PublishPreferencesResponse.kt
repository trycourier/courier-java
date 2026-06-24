// File generated from our OpenAPI spec by Stainless.

package com.courier.models.preferencesections

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

/** Result of publishing the workspace's preferences page. */
class PublishPreferencesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val pageId: JsonField<String>,
    private val publishedAt: JsonField<String>,
    private val publishedVersion: JsonField<Double>,
    private val previewUrl: JsonField<String>,
    private val publishedBy: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("page_id") @ExcludeMissing pageId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("published_at")
        @ExcludeMissing
        publishedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("published_version")
        @ExcludeMissing
        publishedVersion: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("preview_url")
        @ExcludeMissing
        previewUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("published_by")
        @ExcludeMissing
        publishedBy: JsonField<String> = JsonMissing.of(),
    ) : this(pageId, publishedAt, publishedVersion, previewUrl, publishedBy, mutableMapOf())

    /**
     * Id of the published page snapshot.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pageId(): String = pageId.getRequired("page_id")

    /**
     * ISO-8601 timestamp of the publish.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun publishedAt(): String = publishedAt.getRequired("published_at")

    /**
     * Monotonic published version (epoch milliseconds).
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun publishedVersion(): Double = publishedVersion.getRequired("published_version")

    /**
     * Draft-mode hosted preferences page URL for previewing.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previewUrl(): Optional<String> = previewUrl.getOptional("preview_url")

    /**
     * Id of the publisher.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun publishedBy(): Optional<String> = publishedBy.getOptional("published_by")

    /**
     * Returns the raw JSON value of [pageId].
     *
     * Unlike [pageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("page_id") @ExcludeMissing fun _pageId(): JsonField<String> = pageId

    /**
     * Returns the raw JSON value of [publishedAt].
     *
     * Unlike [publishedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published_at")
    @ExcludeMissing
    fun _publishedAt(): JsonField<String> = publishedAt

    /**
     * Returns the raw JSON value of [publishedVersion].
     *
     * Unlike [publishedVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("published_version")
    @ExcludeMissing
    fun _publishedVersion(): JsonField<Double> = publishedVersion

    /**
     * Returns the raw JSON value of [previewUrl].
     *
     * Unlike [previewUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("preview_url") @ExcludeMissing fun _previewUrl(): JsonField<String> = previewUrl

    /**
     * Returns the raw JSON value of [publishedBy].
     *
     * Unlike [publishedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published_by")
    @ExcludeMissing
    fun _publishedBy(): JsonField<String> = publishedBy

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
         * Returns a mutable builder for constructing an instance of [PublishPreferencesResponse].
         *
         * The following fields are required:
         * ```java
         * .pageId()
         * .publishedAt()
         * .publishedVersion()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublishPreferencesResponse]. */
    class Builder internal constructor() {

        private var pageId: JsonField<String>? = null
        private var publishedAt: JsonField<String>? = null
        private var publishedVersion: JsonField<Double>? = null
        private var previewUrl: JsonField<String> = JsonMissing.of()
        private var publishedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publishPreferencesResponse: PublishPreferencesResponse) = apply {
            pageId = publishPreferencesResponse.pageId
            publishedAt = publishPreferencesResponse.publishedAt
            publishedVersion = publishPreferencesResponse.publishedVersion
            previewUrl = publishPreferencesResponse.previewUrl
            publishedBy = publishPreferencesResponse.publishedBy
            additionalProperties = publishPreferencesResponse.additionalProperties.toMutableMap()
        }

        /** Id of the published page snapshot. */
        fun pageId(pageId: String) = pageId(JsonField.of(pageId))

        /**
         * Sets [Builder.pageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageId(pageId: JsonField<String>) = apply { this.pageId = pageId }

        /** ISO-8601 timestamp of the publish. */
        fun publishedAt(publishedAt: String) = publishedAt(JsonField.of(publishedAt))

        /**
         * Sets [Builder.publishedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publishedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun publishedAt(publishedAt: JsonField<String>) = apply { this.publishedAt = publishedAt }

        /** Monotonic published version (epoch milliseconds). */
        fun publishedVersion(publishedVersion: Double) =
            publishedVersion(JsonField.of(publishedVersion))

        /**
         * Sets [Builder.publishedVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publishedVersion] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun publishedVersion(publishedVersion: JsonField<Double>) = apply {
            this.publishedVersion = publishedVersion
        }

        /** Draft-mode hosted preferences page URL for previewing. */
        fun previewUrl(previewUrl: String?) = previewUrl(JsonField.ofNullable(previewUrl))

        /** Alias for calling [Builder.previewUrl] with `previewUrl.orElse(null)`. */
        fun previewUrl(previewUrl: Optional<String>) = previewUrl(previewUrl.getOrNull())

        /**
         * Sets [Builder.previewUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previewUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun previewUrl(previewUrl: JsonField<String>) = apply { this.previewUrl = previewUrl }

        /** Id of the publisher. */
        fun publishedBy(publishedBy: String?) = publishedBy(JsonField.ofNullable(publishedBy))

        /** Alias for calling [Builder.publishedBy] with `publishedBy.orElse(null)`. */
        fun publishedBy(publishedBy: Optional<String>) = publishedBy(publishedBy.getOrNull())

        /**
         * Sets [Builder.publishedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publishedBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun publishedBy(publishedBy: JsonField<String>) = apply { this.publishedBy = publishedBy }

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
         * Returns an immutable instance of [PublishPreferencesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .pageId()
         * .publishedAt()
         * .publishedVersion()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublishPreferencesResponse =
            PublishPreferencesResponse(
                checkRequired("pageId", pageId),
                checkRequired("publishedAt", publishedAt),
                checkRequired("publishedVersion", publishedVersion),
                previewUrl,
                publishedBy,
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
    fun validate(): PublishPreferencesResponse = apply {
        if (validated) {
            return@apply
        }

        pageId()
        publishedAt()
        publishedVersion()
        previewUrl()
        publishedBy()
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
        (if (pageId.asKnown().isPresent) 1 else 0) +
            (if (publishedAt.asKnown().isPresent) 1 else 0) +
            (if (publishedVersion.asKnown().isPresent) 1 else 0) +
            (if (previewUrl.asKnown().isPresent) 1 else 0) +
            (if (publishedBy.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublishPreferencesResponse &&
            pageId == other.pageId &&
            publishedAt == other.publishedAt &&
            publishedVersion == other.publishedVersion &&
            previewUrl == other.previewUrl &&
            publishedBy == other.publishedBy &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            pageId,
            publishedAt,
            publishedVersion,
            previewUrl,
            publishedBy,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublishPreferencesResponse{pageId=$pageId, publishedAt=$publishedAt, publishedVersion=$publishedVersion, previewUrl=$previewUrl, publishedBy=$publishedBy, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications.previews.runs

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

/** One device's result within a preview run. */
class PreviewResult
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val deviceId: JsonField<String>,
    private val screenshotUrl: JsonField<String>,
    private val status: JsonField<PreviewResultStatus>,
    private val thumbnailUrl: JsonField<String>,
    private val failureReason: JsonField<PreviewResultFailureReason>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("device_id") @ExcludeMissing deviceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("screenshot_url")
        @ExcludeMissing
        screenshotUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<PreviewResultStatus> = JsonMissing.of(),
        @JsonProperty("thumbnail_url")
        @ExcludeMissing
        thumbnailUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("failure_reason")
        @ExcludeMissing
        failureReason: JsonField<PreviewResultFailureReason> = JsonMissing.of(),
    ) : this(deviceId, screenshotUrl, status, thumbnailUrl, failureReason, mutableMapOf())

    /**
     * The device this result is for, by `PreviewDevice.id`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deviceId(): String = deviceId.getRequired("device_id")

    /**
     * Short-lived signed URL for the full-sized image. Null until the screenshot exists. Re-signed
     * on every read, so fetch it rather than storing it.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun screenshotUrl(): Optional<String> = screenshotUrl.getOptional("screenshot_url")

    /**
     * One device's outcome. `COMPLETED` means the screenshot exists and its URLs are populated.
     * `UNSUPPORTED`, `TIMED_OUT` and `FAILED` are all terminal, and none stands in for another —
     * `UNSUPPORTED` means the device was retired at the vendor, `TIMED_OUT` means it did not report
     * in time.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): PreviewResultStatus = status.getRequired("status")

    /**
     * Short-lived signed URL for the grid-sized image. Null until the screenshot exists. Re-signed
     * on every read, so fetch it rather than storing it.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thumbnailUrl(): Optional<String> = thumbnailUrl.getOptional("thumbnail_url")

    /**
     * Why one device's render failed, when its `status` is `FAILED` and the cause has a public
     * name. `DELIVERY_FAILED` means the rendering service could not deliver the message to its own
     * capture mailbox — infrastructure, not anything wrong with the template.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failureReason(): Optional<PreviewResultFailureReason> =
        failureReason.getOptional("failure_reason")

    /**
     * Returns the raw JSON value of [deviceId].
     *
     * Unlike [deviceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("device_id") @ExcludeMissing fun _deviceId(): JsonField<String> = deviceId

    /**
     * Returns the raw JSON value of [screenshotUrl].
     *
     * Unlike [screenshotUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("screenshot_url")
    @ExcludeMissing
    fun _screenshotUrl(): JsonField<String> = screenshotUrl

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<PreviewResultStatus> = status

    /**
     * Returns the raw JSON value of [thumbnailUrl].
     *
     * Unlike [thumbnailUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thumbnail_url")
    @ExcludeMissing
    fun _thumbnailUrl(): JsonField<String> = thumbnailUrl

    /**
     * Returns the raw JSON value of [failureReason].
     *
     * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failure_reason")
    @ExcludeMissing
    fun _failureReason(): JsonField<PreviewResultFailureReason> = failureReason

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
         * Returns a mutable builder for constructing an instance of [PreviewResult].
         *
         * The following fields are required:
         * ```java
         * .deviceId()
         * .screenshotUrl()
         * .status()
         * .thumbnailUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreviewResult]. */
    class Builder internal constructor() {

        private var deviceId: JsonField<String>? = null
        private var screenshotUrl: JsonField<String>? = null
        private var status: JsonField<PreviewResultStatus>? = null
        private var thumbnailUrl: JsonField<String>? = null
        private var failureReason: JsonField<PreviewResultFailureReason> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(previewResult: PreviewResult) = apply {
            deviceId = previewResult.deviceId
            screenshotUrl = previewResult.screenshotUrl
            status = previewResult.status
            thumbnailUrl = previewResult.thumbnailUrl
            failureReason = previewResult.failureReason
            additionalProperties = previewResult.additionalProperties.toMutableMap()
        }

        /** The device this result is for, by `PreviewDevice.id`. */
        fun deviceId(deviceId: String) = deviceId(JsonField.of(deviceId))

        /**
         * Sets [Builder.deviceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deviceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deviceId(deviceId: JsonField<String>) = apply { this.deviceId = deviceId }

        /**
         * Short-lived signed URL for the full-sized image. Null until the screenshot exists.
         * Re-signed on every read, so fetch it rather than storing it.
         */
        fun screenshotUrl(screenshotUrl: String?) =
            screenshotUrl(JsonField.ofNullable(screenshotUrl))

        /** Alias for calling [Builder.screenshotUrl] with `screenshotUrl.orElse(null)`. */
        fun screenshotUrl(screenshotUrl: Optional<String>) =
            screenshotUrl(screenshotUrl.getOrNull())

        /**
         * Sets [Builder.screenshotUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.screenshotUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun screenshotUrl(screenshotUrl: JsonField<String>) = apply {
            this.screenshotUrl = screenshotUrl
        }

        /**
         * One device's outcome. `COMPLETED` means the screenshot exists and its URLs are populated.
         * `UNSUPPORTED`, `TIMED_OUT` and `FAILED` are all terminal, and none stands in for another
         * — `UNSUPPORTED` means the device was retired at the vendor, `TIMED_OUT` means it did not
         * report in time.
         */
        fun status(status: PreviewResultStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [PreviewResultStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<PreviewResultStatus>) = apply { this.status = status }

        /**
         * Short-lived signed URL for the grid-sized image. Null until the screenshot exists.
         * Re-signed on every read, so fetch it rather than storing it.
         */
        fun thumbnailUrl(thumbnailUrl: String?) = thumbnailUrl(JsonField.ofNullable(thumbnailUrl))

        /** Alias for calling [Builder.thumbnailUrl] with `thumbnailUrl.orElse(null)`. */
        fun thumbnailUrl(thumbnailUrl: Optional<String>) = thumbnailUrl(thumbnailUrl.getOrNull())

        /**
         * Sets [Builder.thumbnailUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thumbnailUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun thumbnailUrl(thumbnailUrl: JsonField<String>) = apply {
            this.thumbnailUrl = thumbnailUrl
        }

        /**
         * Why one device's render failed, when its `status` is `FAILED` and the cause has a public
         * name. `DELIVERY_FAILED` means the rendering service could not deliver the message to its
         * own capture mailbox — infrastructure, not anything wrong with the template.
         */
        fun failureReason(failureReason: PreviewResultFailureReason) =
            failureReason(JsonField.of(failureReason))

        /**
         * Sets [Builder.failureReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureReason] with a well-typed
         * [PreviewResultFailureReason] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun failureReason(failureReason: JsonField<PreviewResultFailureReason>) = apply {
            this.failureReason = failureReason
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
         * Returns an immutable instance of [PreviewResult].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .deviceId()
         * .screenshotUrl()
         * .status()
         * .thumbnailUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreviewResult =
            PreviewResult(
                checkRequired("deviceId", deviceId),
                checkRequired("screenshotUrl", screenshotUrl),
                checkRequired("status", status),
                checkRequired("thumbnailUrl", thumbnailUrl),
                failureReason,
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
    fun validate(): PreviewResult = apply {
        if (validated) {
            return@apply
        }

        deviceId()
        screenshotUrl()
        status().validate()
        thumbnailUrl()
        failureReason().ifPresent { it.validate() }
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
        (if (deviceId.asKnown().isPresent) 1 else 0) +
            (if (screenshotUrl.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (thumbnailUrl.asKnown().isPresent) 1 else 0) +
            (failureReason.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreviewResult &&
            deviceId == other.deviceId &&
            screenshotUrl == other.screenshotUrl &&
            status == other.status &&
            thumbnailUrl == other.thumbnailUrl &&
            failureReason == other.failureReason &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            deviceId,
            screenshotUrl,
            status,
            thumbnailUrl,
            failureReason,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PreviewResult{deviceId=$deviceId, screenshotUrl=$screenshotUrl, status=$status, thumbnailUrl=$thumbnailUrl, failureReason=$failureReason, additionalProperties=$additionalProperties}"
}

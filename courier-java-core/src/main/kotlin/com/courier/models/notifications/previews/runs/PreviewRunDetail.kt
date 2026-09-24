// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications.previews.runs

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

/** A preview run together with its per-device results. */
class PreviewRunDetail
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val deviceIds: JsonField<List<String>>,
    private val results: JsonField<List<PreviewResult>>,
    private val status: JsonField<PreviewRunStatus>,
    private val templateId: JsonField<String>,
    private val failureReason: JsonField<PreviewRunFailureReason>,
    private val templateVersion: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device_ids")
        @ExcludeMissing
        deviceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("results")
        @ExcludeMissing
        results: JsonField<List<PreviewResult>> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<PreviewRunStatus> = JsonMissing.of(),
        @JsonProperty("template_id")
        @ExcludeMissing
        templateId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("failure_reason")
        @ExcludeMissing
        failureReason: JsonField<PreviewRunFailureReason> = JsonMissing.of(),
        @JsonProperty("template_version")
        @ExcludeMissing
        templateVersion: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        deviceIds,
        results,
        status,
        templateId,
        failureReason,
        templateVersion,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the preview run.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * ISO-8601 timestamp of when the run was created.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): String = createdAt.getRequired("created_at")

    /**
     * The devices this run was submitted for, snapshotted when the run was created.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deviceIds(): List<String> = deviceIds.getRequired("device_ids")

    /**
     * One entry per device in `device_ids`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): List<PreviewResult> = results.getRequired("results")

    /**
     * Where the run itself has got to. `PENDING` and `RENDERED` mean Courier is still preparing the
     * email, `SUBMITTED` means it is with the rendering service, and `COMPLETED` means every device
     * has reported. `FAILED` is the run as a whole failing — an individual device failing never
     * fails the run.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): PreviewRunStatus = status.getRequired("status")

    /**
     * The template that was rendered.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun templateId(): String = templateId.getRequired("template_id")

    /**
     * Why the run failed, when `status` is `FAILED`. `NO_EMAIL_CHANNEL` and
     * `TEMPLATE_NOT_SUPPORTED` mean there was nothing to render; `ALL_DEVICES_UNSUPPORTED` means
     * every requested device has been retired and the request can be fixed by choosing others.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failureReason(): Optional<PreviewRunFailureReason> =
        failureReason.getOptional("failure_reason")

    /**
     * The version of the template that was rendered — `draft`, or a zero-padded published version
     * such as `v002`. Absent until the render settles.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateVersion(): Optional<String> = templateVersion.getOptional("template_version")

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
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results")
    @ExcludeMissing
    fun _results(): JsonField<List<PreviewResult>> = results

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<PreviewRunStatus> = status

    /**
     * Returns the raw JSON value of [templateId].
     *
     * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("template_id") @ExcludeMissing fun _templateId(): JsonField<String> = templateId

    /**
     * Returns the raw JSON value of [failureReason].
     *
     * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failure_reason")
    @ExcludeMissing
    fun _failureReason(): JsonField<PreviewRunFailureReason> = failureReason

    /**
     * Returns the raw JSON value of [templateVersion].
     *
     * Unlike [templateVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("template_version")
    @ExcludeMissing
    fun _templateVersion(): JsonField<String> = templateVersion

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
         * Returns a mutable builder for constructing an instance of [PreviewRunDetail].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .deviceIds()
         * .results()
         * .status()
         * .templateId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreviewRunDetail]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<String>? = null
        private var deviceIds: JsonField<MutableList<String>>? = null
        private var results: JsonField<MutableList<PreviewResult>>? = null
        private var status: JsonField<PreviewRunStatus>? = null
        private var templateId: JsonField<String>? = null
        private var failureReason: JsonField<PreviewRunFailureReason> = JsonMissing.of()
        private var templateVersion: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(previewRunDetail: PreviewRunDetail) = apply {
            id = previewRunDetail.id
            createdAt = previewRunDetail.createdAt
            deviceIds = previewRunDetail.deviceIds.map { it.toMutableList() }
            results = previewRunDetail.results.map { it.toMutableList() }
            status = previewRunDetail.status
            templateId = previewRunDetail.templateId
            failureReason = previewRunDetail.failureReason
            templateVersion = previewRunDetail.templateVersion
            additionalProperties = previewRunDetail.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the preview run. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** ISO-8601 timestamp of when the run was created. */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** The devices this run was submitted for, snapshotted when the run was created. */
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

        /** One entry per device in `device_ids`. */
        fun results(results: List<PreviewResult>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<PreviewResult>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun results(results: JsonField<List<PreviewResult>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [PreviewResult] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: PreviewResult) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
                }
        }

        /**
         * Where the run itself has got to. `PENDING` and `RENDERED` mean Courier is still preparing
         * the email, `SUBMITTED` means it is with the rendering service, and `COMPLETED` means
         * every device has reported. `FAILED` is the run as a whole failing — an individual device
         * failing never fails the run.
         */
        fun status(status: PreviewRunStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [PreviewRunStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<PreviewRunStatus>) = apply { this.status = status }

        /** The template that was rendered. */
        fun templateId(templateId: String) = templateId(JsonField.of(templateId))

        /**
         * Sets [Builder.templateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

        /**
         * Why the run failed, when `status` is `FAILED`. `NO_EMAIL_CHANNEL` and
         * `TEMPLATE_NOT_SUPPORTED` mean there was nothing to render; `ALL_DEVICES_UNSUPPORTED`
         * means every requested device has been retired and the request can be fixed by choosing
         * others.
         */
        fun failureReason(failureReason: PreviewRunFailureReason) =
            failureReason(JsonField.of(failureReason))

        /**
         * Sets [Builder.failureReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureReason] with a well-typed
         * [PreviewRunFailureReason] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun failureReason(failureReason: JsonField<PreviewRunFailureReason>) = apply {
            this.failureReason = failureReason
        }

        /**
         * The version of the template that was rendered — `draft`, or a zero-padded published
         * version such as `v002`. Absent until the render settles.
         */
        fun templateVersion(templateVersion: String) =
            templateVersion(JsonField.of(templateVersion))

        /**
         * Sets [Builder.templateVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateVersion] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun templateVersion(templateVersion: JsonField<String>) = apply {
            this.templateVersion = templateVersion
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
         * Returns an immutable instance of [PreviewRunDetail].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .deviceIds()
         * .results()
         * .status()
         * .templateId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreviewRunDetail =
            PreviewRunDetail(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("deviceIds", deviceIds).map { it.toImmutable() },
                checkRequired("results", results).map { it.toImmutable() },
                checkRequired("status", status),
                checkRequired("templateId", templateId),
                failureReason,
                templateVersion,
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
    fun validate(): PreviewRunDetail = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        deviceIds()
        results().forEach { it.validate() }
        status().validate()
        templateId()
        failureReason().ifPresent { it.validate() }
        templateVersion()
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
            (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (templateId.asKnown().isPresent) 1 else 0) +
            (failureReason.asKnown().getOrNull()?.validity() ?: 0) +
            (if (templateVersion.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreviewRunDetail &&
            id == other.id &&
            createdAt == other.createdAt &&
            deviceIds == other.deviceIds &&
            results == other.results &&
            status == other.status &&
            templateId == other.templateId &&
            failureReason == other.failureReason &&
            templateVersion == other.templateVersion &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            deviceIds,
            results,
            status,
            templateId,
            failureReason,
            templateVersion,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PreviewRunDetail{id=$id, createdAt=$createdAt, deviceIds=$deviceIds, results=$results, status=$status, templateId=$templateId, failureReason=$failureReason, templateVersion=$templateVersion, additionalProperties=$additionalProperties}"
}

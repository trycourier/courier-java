// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications.previews.runs

import com.courier.core.ExcludeMissing
import com.courier.core.JsonField
import com.courier.core.JsonMissing
import com.courier.core.JsonValue
import com.courier.core.checkKnown
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

/**
 * Request body for creating a preview run of the template in the path. Provide exactly one of
 * `device_set_id` or `device_ids`. The template is the path's `{id}`; a `template_id` here is an
 * unknown key and a 400.
 */
class CreatePreviewRunRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val deviceIds: JsonField<List<String>>,
    private val deviceSetId: JsonField<String>,
    private val locale: JsonField<String>,
    private val templateVersion: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("device_ids")
        @ExcludeMissing
        deviceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("device_set_id")
        @ExcludeMissing
        deviceSetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locale") @ExcludeMissing locale: JsonField<String> = JsonMissing.of(),
        @JsonProperty("template_version")
        @ExcludeMissing
        templateVersion: JsonField<String> = JsonMissing.of(),
    ) : this(data, deviceIds, deviceSetId, locale, templateVersion, mutableMapOf())

    /**
     * Template variables to render with, the same shape as the `data` object on a send.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * The devices to render on, by `PreviewDevice.id`, for a one-off run. Mutually exclusive with
     * `device_set_id`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deviceIds(): Optional<List<String>> = deviceIds.getOptional("device_ids")

    /**
     * A saved device set naming the devices to render on. Mutually exclusive with `device_ids`.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deviceSetId(): Optional<String> = deviceSetId.getOptional("device_set_id")

    /**
     * Render the template's content for this locale, e.g. "fr-FR".
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locale(): Optional<String> = locale.getOptional("locale")

    /**
     * Which version of the template to render. Omit for the latest saved draft, which always exists
     * and is what the editor shows. `published` renders the live version; a zero-padded `v002`
     * renders that specific publish. Versions are 1-based, so `v000` is not a version, and the
     * unpadded `v2` is rejected — that spelling belongs to journeys' AutomationVersionId, a
     * different scheme in which `v0` means published.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateVersion(): Optional<String> = templateVersion.getOptional("template_version")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [deviceIds].
     *
     * Unlike [deviceIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("device_ids")
    @ExcludeMissing
    fun _deviceIds(): JsonField<List<String>> = deviceIds

    /**
     * Returns the raw JSON value of [deviceSetId].
     *
     * Unlike [deviceSetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("device_set_id")
    @ExcludeMissing
    fun _deviceSetId(): JsonField<String> = deviceSetId

    /**
     * Returns the raw JSON value of [locale].
     *
     * Unlike [locale], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locale") @ExcludeMissing fun _locale(): JsonField<String> = locale

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

        /** Returns a mutable builder for constructing an instance of [CreatePreviewRunRequest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CreatePreviewRunRequest]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var deviceIds: JsonField<MutableList<String>>? = null
        private var deviceSetId: JsonField<String> = JsonMissing.of()
        private var locale: JsonField<String> = JsonMissing.of()
        private var templateVersion: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(createPreviewRunRequest: CreatePreviewRunRequest) = apply {
            data = createPreviewRunRequest.data
            deviceIds = createPreviewRunRequest.deviceIds.map { it.toMutableList() }
            deviceSetId = createPreviewRunRequest.deviceSetId
            locale = createPreviewRunRequest.locale
            templateVersion = createPreviewRunRequest.templateVersion
            additionalProperties = createPreviewRunRequest.additionalProperties.toMutableMap()
        }

        /** Template variables to render with, the same shape as the `data` object on a send. */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /**
         * The devices to render on, by `PreviewDevice.id`, for a one-off run. Mutually exclusive
         * with `device_set_id`.
         */
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

        /**
         * A saved device set naming the devices to render on. Mutually exclusive with `device_ids`.
         */
        fun deviceSetId(deviceSetId: String) = deviceSetId(JsonField.of(deviceSetId))

        /**
         * Sets [Builder.deviceSetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deviceSetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deviceSetId(deviceSetId: JsonField<String>) = apply { this.deviceSetId = deviceSetId }

        /** Render the template's content for this locale, e.g. "fr-FR". */
        fun locale(locale: String) = locale(JsonField.of(locale))

        /**
         * Sets [Builder.locale] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locale] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locale(locale: JsonField<String>) = apply { this.locale = locale }

        /**
         * Which version of the template to render. Omit for the latest saved draft, which always
         * exists and is what the editor shows. `published` renders the live version; a zero-padded
         * `v002` renders that specific publish. Versions are 1-based, so `v000` is not a version,
         * and the unpadded `v2` is rejected — that spelling belongs to journeys'
         * AutomationVersionId, a different scheme in which `v0` means published.
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
         * Returns an immutable instance of [CreatePreviewRunRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CreatePreviewRunRequest =
            CreatePreviewRunRequest(
                data,
                (deviceIds ?: JsonMissing.of()).map { it.toImmutable() },
                deviceSetId,
                locale,
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
    fun validate(): CreatePreviewRunRequest = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
        deviceIds()
        deviceSetId()
        locale()
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
        (data.asKnown().getOrNull()?.validity() ?: 0) +
            (deviceIds.asKnown().getOrNull()?.size ?: 0) +
            (if (deviceSetId.asKnown().isPresent) 1 else 0) +
            (if (locale.asKnown().isPresent) 1 else 0) +
            (if (templateVersion.asKnown().isPresent) 1 else 0)

    /** Template variables to render with, the same shape as the `data` object on a send. */
    class Data
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                additionalProperties = data.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data = Data(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws CourierInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Data{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreatePreviewRunRequest &&
            data == other.data &&
            deviceIds == other.deviceIds &&
            deviceSetId == other.deviceSetId &&
            locale == other.locale &&
            templateVersion == other.templateVersion &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(data, deviceIds, deviceSetId, locale, templateVersion, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreatePreviewRunRequest{data=$data, deviceIds=$deviceIds, deviceSetId=$deviceSetId, locale=$locale, templateVersion=$templateVersion, additionalProperties=$additionalProperties}"
}

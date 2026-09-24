// File generated from our OpenAPI spec by Stainless.

package com.courier.models.previews

import com.courier.core.Enum
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

/**
 * One mail app on one platform, operating system and theme that a preview can be rendered on.
 * Reference data, identical for every workspace. Every field is always present; `platform` and
 * `platform_version` are null where they do not apply.
 */
class PreviewDevice
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val app: JsonField<String>,
    private val category: JsonField<Category>,
    private val name: JsonField<String>,
    private val os: JsonField<String>,
    private val osVersion: JsonField<String>,
    private val platform: JsonField<String>,
    private val platformVersion: JsonField<String>,
    private val theme: JsonField<Theme>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("app") @ExcludeMissing app: JsonField<String> = JsonMissing.of(),
        @JsonProperty("category") @ExcludeMissing category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("os") @ExcludeMissing os: JsonField<String> = JsonMissing.of(),
        @JsonProperty("os_version") @ExcludeMissing osVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("platform") @ExcludeMissing platform: JsonField<String> = JsonMissing.of(),
        @JsonProperty("platform_version")
        @ExcludeMissing
        platformVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("theme") @ExcludeMissing theme: JsonField<Theme> = JsonMissing.of(),
    ) : this(
        id,
        app,
        category,
        name,
        os,
        osVersion,
        platform,
        platformVersion,
        theme,
        mutableMapOf(),
    )

    /**
     * The device's identifier, used in `device_ids` when creating a device set or a run.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The mail app. For webmail it is the service (`outlook_com`, `gmail_com`); for mobile the app
     * (`apple_mail`, `gmail`); for desktop the app together with the version it is sold under
     * (`outlook_2019`, `outlook_microsoft_365`, `apple_mail_16`), because that version is what
     * separates one desktop Outlook from another.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun app(): String = app.getRequired("app")

    /**
     * Where the app runs.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): Category = category.getRequired("category")

    /**
     * Display name. Render it as-is rather than parsing it. It is also what separates the two
     * 120-dpi Outlook renders from their 100% siblings, which are otherwise identical field for
     * field.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The operating system.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun os(): String = os.getRequired("os")

    /**
     * The operating system's version. Always set.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun osVersion(): String = osVersion.getRequired("os_version")

    /**
     * What the app runs on — the browser for webmail (`chrome`, `edge`, `firefox`), the phone for
     * mobile (`iphone`, `pixel`). Null for desktop, where the app runs on nothing but the OS.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun platform(): Optional<String> = platform.getOptional("platform")

    /**
     * Which one of the platform — the phone model for mobile (`15_pro_max`, `10`). Null for
     * webmail, which always renders in the current browser, and for desktop.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun platformVersion(): Optional<String> = platformVersion.getOptional("platform_version")

    /**
     * Whether the email is rendered in light or dark mode.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun theme(): Theme = theme.getRequired("theme")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [app].
     *
     * Unlike [app], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("app") @ExcludeMissing fun _app(): JsonField<String> = app

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [os].
     *
     * Unlike [os], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("os") @ExcludeMissing fun _os(): JsonField<String> = os

    /**
     * Returns the raw JSON value of [osVersion].
     *
     * Unlike [osVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("os_version") @ExcludeMissing fun _osVersion(): JsonField<String> = osVersion

    /**
     * Returns the raw JSON value of [platform].
     *
     * Unlike [platform], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform") @ExcludeMissing fun _platform(): JsonField<String> = platform

    /**
     * Returns the raw JSON value of [platformVersion].
     *
     * Unlike [platformVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platform_version")
    @ExcludeMissing
    fun _platformVersion(): JsonField<String> = platformVersion

    /**
     * Returns the raw JSON value of [theme].
     *
     * Unlike [theme], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("theme") @ExcludeMissing fun _theme(): JsonField<Theme> = theme

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
         * Returns a mutable builder for constructing an instance of [PreviewDevice].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .app()
         * .category()
         * .name()
         * .os()
         * .osVersion()
         * .platform()
         * .platformVersion()
         * .theme()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreviewDevice]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var app: JsonField<String>? = null
        private var category: JsonField<Category>? = null
        private var name: JsonField<String>? = null
        private var os: JsonField<String>? = null
        private var osVersion: JsonField<String>? = null
        private var platform: JsonField<String>? = null
        private var platformVersion: JsonField<String>? = null
        private var theme: JsonField<Theme>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(previewDevice: PreviewDevice) = apply {
            id = previewDevice.id
            app = previewDevice.app
            category = previewDevice.category
            name = previewDevice.name
            os = previewDevice.os
            osVersion = previewDevice.osVersion
            platform = previewDevice.platform
            platformVersion = previewDevice.platformVersion
            theme = previewDevice.theme
            additionalProperties = previewDevice.additionalProperties.toMutableMap()
        }

        /** The device's identifier, used in `device_ids` when creating a device set or a run. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The mail app. For webmail it is the service (`outlook_com`, `gmail_com`); for mobile the
         * app (`apple_mail`, `gmail`); for desktop the app together with the version it is sold
         * under (`outlook_2019`, `outlook_microsoft_365`, `apple_mail_16`), because that version is
         * what separates one desktop Outlook from another.
         */
        fun app(app: String) = app(JsonField.of(app))

        /**
         * Sets [Builder.app] to an arbitrary JSON value.
         *
         * You should usually call [Builder.app] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun app(app: JsonField<String>) = apply { this.app = app }

        /** Where the app runs. */
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /**
         * Display name. Render it as-is rather than parsing it. It is also what separates the two
         * 120-dpi Outlook renders from their 100% siblings, which are otherwise identical field for
         * field.
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The operating system. */
        fun os(os: String) = os(JsonField.of(os))

        /**
         * Sets [Builder.os] to an arbitrary JSON value.
         *
         * You should usually call [Builder.os] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun os(os: JsonField<String>) = apply { this.os = os }

        /** The operating system's version. Always set. */
        fun osVersion(osVersion: String) = osVersion(JsonField.of(osVersion))

        /**
         * Sets [Builder.osVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.osVersion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun osVersion(osVersion: JsonField<String>) = apply { this.osVersion = osVersion }

        /**
         * What the app runs on — the browser for webmail (`chrome`, `edge`, `firefox`), the phone
         * for mobile (`iphone`, `pixel`). Null for desktop, where the app runs on nothing but the
         * OS.
         */
        fun platform(platform: String?) = platform(JsonField.ofNullable(platform))

        /** Alias for calling [Builder.platform] with `platform.orElse(null)`. */
        fun platform(platform: Optional<String>) = platform(platform.getOrNull())

        /**
         * Sets [Builder.platform] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platform] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun platform(platform: JsonField<String>) = apply { this.platform = platform }

        /**
         * Which one of the platform — the phone model for mobile (`15_pro_max`, `10`). Null for
         * webmail, which always renders in the current browser, and for desktop.
         */
        fun platformVersion(platformVersion: String?) =
            platformVersion(JsonField.ofNullable(platformVersion))

        /** Alias for calling [Builder.platformVersion] with `platformVersion.orElse(null)`. */
        fun platformVersion(platformVersion: Optional<String>) =
            platformVersion(platformVersion.getOrNull())

        /**
         * Sets [Builder.platformVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformVersion] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun platformVersion(platformVersion: JsonField<String>) = apply {
            this.platformVersion = platformVersion
        }

        /** Whether the email is rendered in light or dark mode. */
        fun theme(theme: Theme) = theme(JsonField.of(theme))

        /**
         * Sets [Builder.theme] to an arbitrary JSON value.
         *
         * You should usually call [Builder.theme] with a well-typed [Theme] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun theme(theme: JsonField<Theme>) = apply { this.theme = theme }

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
         * Returns an immutable instance of [PreviewDevice].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .app()
         * .category()
         * .name()
         * .os()
         * .osVersion()
         * .platform()
         * .platformVersion()
         * .theme()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreviewDevice =
            PreviewDevice(
                checkRequired("id", id),
                checkRequired("app", app),
                checkRequired("category", category),
                checkRequired("name", name),
                checkRequired("os", os),
                checkRequired("osVersion", osVersion),
                checkRequired("platform", platform),
                checkRequired("platformVersion", platformVersion),
                checkRequired("theme", theme),
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
    fun validate(): PreviewDevice = apply {
        if (validated) {
            return@apply
        }

        id()
        app()
        category().validate()
        name()
        os()
        osVersion()
        platform()
        platformVersion()
        theme().validate()
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
            (if (app.asKnown().isPresent) 1 else 0) +
            (category.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (os.asKnown().isPresent) 1 else 0) +
            (if (osVersion.asKnown().isPresent) 1 else 0) +
            (if (platform.asKnown().isPresent) 1 else 0) +
            (if (platformVersion.asKnown().isPresent) 1 else 0) +
            (theme.asKnown().getOrNull()?.validity() ?: 0)

    /** Where the app runs. */
    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val WEBMAIL = of("webmail")

            @JvmField val MOBILE = of("mobile")

            @JvmField val DESKTOP = of("desktop")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            WEBMAIL,
            MOBILE,
            DESKTOP,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WEBMAIL,
            MOBILE,
            DESKTOP,
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                WEBMAIL -> Value.WEBMAIL
                MOBILE -> Value.MOBILE
                DESKTOP -> Value.DESKTOP
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws CourierInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                WEBMAIL -> Known.WEBMAIL
                MOBILE -> Known.MOBILE
                DESKTOP -> Known.DESKTOP
                else -> throw CourierInvalidDataException("Unknown Category: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws CourierInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { CourierInvalidDataException("Value is not a String") }

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
        fun validate(): Category = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Whether the email is rendered in light or dark mode. */
    class Theme @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LIGHT = of("light")

            @JvmField val DARK = of("dark")

            @JvmStatic fun of(value: String) = Theme(JsonField.of(value))
        }

        /** An enum containing [Theme]'s known values. */
        enum class Known {
            LIGHT,
            DARK,
        }

        /**
         * An enum containing [Theme]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Theme] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LIGHT,
            DARK,
            /** An enum member indicating that [Theme] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                LIGHT -> Value.LIGHT
                DARK -> Value.DARK
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws CourierInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                LIGHT -> Known.LIGHT
                DARK -> Known.DARK
                else -> throw CourierInvalidDataException("Unknown Theme: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws CourierInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { CourierInvalidDataException("Value is not a String") }

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
        fun validate(): Theme = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Theme && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreviewDevice &&
            id == other.id &&
            app == other.app &&
            category == other.category &&
            name == other.name &&
            os == other.os &&
            osVersion == other.osVersion &&
            platform == other.platform &&
            platformVersion == other.platformVersion &&
            theme == other.theme &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            app,
            category,
            name,
            os,
            osVersion,
            platform,
            platformVersion,
            theme,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PreviewDevice{id=$id, app=$app, category=$category, name=$name, os=$os, osVersion=$osVersion, platform=$platform, platformVersion=$platformVersion, theme=$theme, additionalProperties=$additionalProperties}"
}

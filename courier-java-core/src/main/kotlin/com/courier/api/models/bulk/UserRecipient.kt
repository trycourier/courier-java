// File generated from our OpenAPI spec by Stainless.

package com.courier.api.models.bulk

import com.courier.api.core.ExcludeMissing
import com.courier.api.core.JsonField
import com.courier.api.core.JsonMissing
import com.courier.api.core.JsonValue
import com.courier.api.core.checkRequired
import com.courier.api.core.toImmutable
import com.courier.api.errors.CourierInvalidDataException
import com.courier.api.models.send.MessageContext
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UserRecipient
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountId: JsonField<String>,
    private val context: JsonField<MessageContext>,
    private val data: JsonField<Data>,
    private val email: JsonField<String>,
    private val locale: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val preferences: JsonField<Preferences>,
    private val tenantId: JsonField<String>,
    private val userId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("context")
        @ExcludeMissing
        context: JsonField<MessageContext> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locale") @ExcludeMissing locale: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("preferences")
        @ExcludeMissing
        preferences: JsonField<Preferences> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountId,
        context,
        data,
        email,
        locale,
        phoneNumber,
        preferences,
        tenantId,
        userId,
        mutableMapOf(),
    )

    /**
     * Use `tenant_id` instad.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountId(): Optional<String> = accountId.getOptional("account_id")

    /**
     * Context information such as tenant_id to send the notification with.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun context(): Optional<MessageContext> = context.getOptional("context")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * The user's preferred ISO 639-1 language code.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locale(): Optional<String> = locale.getOptional("locale")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preferences(): Optional<Preferences> = preferences.getOptional("preferences")

    /**
     * An id of a tenant, [see tenants api docs](https://www.courier.com/docs/reference/tenants).
     * Will load brand, default preferences and any other base context data associated with this
     * tenant.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tenantId(): Optional<String> = tenantId.getOptional("tenant_id")

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [context].
     *
     * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<MessageContext> = context

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [locale].
     *
     * Unlike [locale], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locale") @ExcludeMissing fun _locale(): JsonField<String> = locale

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [preferences].
     *
     * Unlike [preferences], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("preferences")
    @ExcludeMissing
    fun _preferences(): JsonField<Preferences> = preferences

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

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

        /** Returns a mutable builder for constructing an instance of [UserRecipient]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserRecipient]. */
    class Builder internal constructor() {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var context: JsonField<MessageContext> = JsonMissing.of()
        private var data: JsonField<Data> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var locale: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var preferences: JsonField<Preferences> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userRecipient: UserRecipient) = apply {
            accountId = userRecipient.accountId
            context = userRecipient.context
            data = userRecipient.data
            email = userRecipient.email
            locale = userRecipient.locale
            phoneNumber = userRecipient.phoneNumber
            preferences = userRecipient.preferences
            tenantId = userRecipient.tenantId
            userId = userRecipient.userId
            additionalProperties = userRecipient.additionalProperties.toMutableMap()
        }

        /** Use `tenant_id` instad. */
        fun accountId(accountId: String?) = accountId(JsonField.ofNullable(accountId))

        /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
        fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** Context information such as tenant_id to send the notification with. */
        fun context(context: MessageContext?) = context(JsonField.ofNullable(context))

        /** Alias for calling [Builder.context] with `context.orElse(null)`. */
        fun context(context: Optional<MessageContext>) = context(context.getOrNull())

        /**
         * Sets [Builder.context] to an arbitrary JSON value.
         *
         * You should usually call [Builder.context] with a well-typed [MessageContext] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun context(context: JsonField<MessageContext>) = apply { this.context = context }

        fun data(data: Data?) = data(JsonField.ofNullable(data))

        /** Alias for calling [Builder.data] with `data.orElse(null)`. */
        fun data(data: Optional<Data>) = data(data.getOrNull())

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun email(email: String?) = email(JsonField.ofNullable(email))

        /** Alias for calling [Builder.email] with `email.orElse(null)`. */
        fun email(email: Optional<String>) = email(email.getOrNull())

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The user's preferred ISO 639-1 language code. */
        fun locale(locale: String?) = locale(JsonField.ofNullable(locale))

        /** Alias for calling [Builder.locale] with `locale.orElse(null)`. */
        fun locale(locale: Optional<String>) = locale(locale.getOrNull())

        /**
         * Sets [Builder.locale] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locale] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locale(locale: JsonField<String>) = apply { this.locale = locale }

        fun phoneNumber(phoneNumber: String?) = phoneNumber(JsonField.ofNullable(phoneNumber))

        /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
        fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        fun preferences(preferences: Preferences?) = preferences(JsonField.ofNullable(preferences))

        /** Alias for calling [Builder.preferences] with `preferences.orElse(null)`. */
        fun preferences(preferences: Optional<Preferences>) = preferences(preferences.getOrNull())

        /**
         * Sets [Builder.preferences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preferences] with a well-typed [Preferences] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun preferences(preferences: JsonField<Preferences>) = apply {
            this.preferences = preferences
        }

        /**
         * An id of a tenant,
         * [see tenants api docs](https://www.courier.com/docs/reference/tenants). Will load brand,
         * default preferences and any other base context data associated with this tenant.
         */
        fun tenantId(tenantId: String?) = tenantId(JsonField.ofNullable(tenantId))

        /** Alias for calling [Builder.tenantId] with `tenantId.orElse(null)`. */
        fun tenantId(tenantId: Optional<String>) = tenantId(tenantId.getOrNull())

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

        /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
         * Returns an immutable instance of [UserRecipient].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserRecipient =
            UserRecipient(
                accountId,
                context,
                data,
                email,
                locale,
                phoneNumber,
                preferences,
                tenantId,
                userId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserRecipient = apply {
        if (validated) {
            return@apply
        }

        accountId()
        context().ifPresent { it.validate() }
        data().ifPresent { it.validate() }
        email()
        locale()
        phoneNumber()
        preferences().ifPresent { it.validate() }
        tenantId()
        userId()
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
        (if (accountId.asKnown().isPresent) 1 else 0) +
            (context.asKnown().getOrNull()?.validity() ?: 0) +
            (data.asKnown().getOrNull()?.validity() ?: 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (locale.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (preferences.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

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

    class Preferences
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val notifications: JsonField<Notifications>,
        private val categories: JsonField<Categories>,
        private val templateId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("notifications")
            @ExcludeMissing
            notifications: JsonField<Notifications> = JsonMissing.of(),
            @JsonProperty("categories")
            @ExcludeMissing
            categories: JsonField<Categories> = JsonMissing.of(),
            @JsonProperty("templateId")
            @ExcludeMissing
            templateId: JsonField<String> = JsonMissing.of(),
        ) : this(notifications, categories, templateId, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun notifications(): Notifications = notifications.getRequired("notifications")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun categories(): Optional<Categories> = categories.getOptional("categories")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun templateId(): Optional<String> = templateId.getOptional("templateId")

        /**
         * Returns the raw JSON value of [notifications].
         *
         * Unlike [notifications], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("notifications")
        @ExcludeMissing
        fun _notifications(): JsonField<Notifications> = notifications

        /**
         * Returns the raw JSON value of [categories].
         *
         * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("categories")
        @ExcludeMissing
        fun _categories(): JsonField<Categories> = categories

        /**
         * Returns the raw JSON value of [templateId].
         *
         * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("templateId")
        @ExcludeMissing
        fun _templateId(): JsonField<String> = templateId

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
             * Returns a mutable builder for constructing an instance of [Preferences].
             *
             * The following fields are required:
             * ```java
             * .notifications()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Preferences]. */
        class Builder internal constructor() {

            private var notifications: JsonField<Notifications>? = null
            private var categories: JsonField<Categories> = JsonMissing.of()
            private var templateId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(preferences: Preferences) = apply {
                notifications = preferences.notifications
                categories = preferences.categories
                templateId = preferences.templateId
                additionalProperties = preferences.additionalProperties.toMutableMap()
            }

            fun notifications(notifications: Notifications) =
                notifications(JsonField.of(notifications))

            /**
             * Sets [Builder.notifications] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notifications] with a well-typed [Notifications]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun notifications(notifications: JsonField<Notifications>) = apply {
                this.notifications = notifications
            }

            fun categories(categories: Categories?) = categories(JsonField.ofNullable(categories))

            /** Alias for calling [Builder.categories] with `categories.orElse(null)`. */
            fun categories(categories: Optional<Categories>) = categories(categories.getOrNull())

            /**
             * Sets [Builder.categories] to an arbitrary JSON value.
             *
             * You should usually call [Builder.categories] with a well-typed [Categories] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun categories(categories: JsonField<Categories>) = apply {
                this.categories = categories
            }

            fun templateId(templateId: String?) = templateId(JsonField.ofNullable(templateId))

            /** Alias for calling [Builder.templateId] with `templateId.orElse(null)`. */
            fun templateId(templateId: Optional<String>) = templateId(templateId.getOrNull())

            /**
             * Sets [Builder.templateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templateId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

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
             * Returns an immutable instance of [Preferences].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .notifications()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Preferences =
                Preferences(
                    checkRequired("notifications", notifications),
                    categories,
                    templateId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Preferences = apply {
            if (validated) {
                return@apply
            }

            notifications().validate()
            categories().ifPresent { it.validate() }
            templateId()
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
            (notifications.asKnown().getOrNull()?.validity() ?: 0) +
                (categories.asKnown().getOrNull()?.validity() ?: 0) +
                (if (templateId.asKnown().isPresent) 1 else 0)

        class Notifications
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

                /** Returns a mutable builder for constructing an instance of [Notifications]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Notifications]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(notifications: Notifications) = apply {
                    additionalProperties = notifications.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Notifications].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Notifications = Notifications(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Notifications = apply {
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

                return other is Notifications && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Notifications{additionalProperties=$additionalProperties}"
        }

        class Categories
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

                /** Returns a mutable builder for constructing an instance of [Categories]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Categories]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(categories: Categories) = apply {
                    additionalProperties = categories.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Categories].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Categories = Categories(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Categories = apply {
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

                return other is Categories && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Categories{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Preferences &&
                notifications == other.notifications &&
                categories == other.categories &&
                templateId == other.templateId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(notifications, categories, templateId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Preferences{notifications=$notifications, categories=$categories, templateId=$templateId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserRecipient &&
            accountId == other.accountId &&
            context == other.context &&
            data == other.data &&
            email == other.email &&
            locale == other.locale &&
            phoneNumber == other.phoneNumber &&
            preferences == other.preferences &&
            tenantId == other.tenantId &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountId,
            context,
            data,
            email,
            locale,
            phoneNumber,
            preferences,
            tenantId,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserRecipient{accountId=$accountId, context=$context, data=$data, email=$email, locale=$locale, phoneNumber=$phoneNumber, preferences=$preferences, tenantId=$tenantId, userId=$userId, additionalProperties=$additionalProperties}"
}

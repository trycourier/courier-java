// File generated from our OpenAPI spec by Stainless.

package com.courier.models.notifications

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
 * Email header fields for the template's email channel: the From, Reply-to, CC and BCC values set
 * in the Studio email channel settings. Each value may use template variables, such as
 * `{{data.cc}}`, which are resolved at send time. Reads omit `email` when no header is set, and
 * omit each unset field. Writes treat it as optional, with three meanings. Omit it to keep the
 * stored headers. Send null to clear all four. Send an object to replace all four: a field the
 * object leaves out is cleared. Other email channel settings, such as the subject, are kept either
 * way. Headers only apply while `content` has an email channel; with no email channel they are not
 * stored.
 */
class NotificationTemplateEmail
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bcc: JsonField<List<String>>,
    private val cc: JsonField<List<String>>,
    private val from: JsonField<String>,
    private val replyTo: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bcc") @ExcludeMissing bcc: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("cc") @ExcludeMissing cc: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reply_to") @ExcludeMissing replyTo: JsonField<String> = JsonMissing.of(),
    ) : this(bcc, cc, from, replyTo, mutableMapOf())

    /**
     * BCC addresses.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bcc(): Optional<List<String>> = bcc.getOptional("bcc")

    /**
     * CC addresses.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cc(): Optional<List<String>> = cc.getOptional("cc")

    /**
     * The From address.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun from(): Optional<String> = from.getOptional("from")

    /**
     * The Reply-to address.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun replyTo(): Optional<String> = replyTo.getOptional("reply_to")

    /**
     * Returns the raw JSON value of [bcc].
     *
     * Unlike [bcc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bcc") @ExcludeMissing fun _bcc(): JsonField<List<String>> = bcc

    /**
     * Returns the raw JSON value of [cc].
     *
     * Unlike [cc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cc") @ExcludeMissing fun _cc(): JsonField<List<String>> = cc

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

    /**
     * Returns the raw JSON value of [replyTo].
     *
     * Unlike [replyTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reply_to") @ExcludeMissing fun _replyTo(): JsonField<String> = replyTo

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
         * Returns a mutable builder for constructing an instance of [NotificationTemplateEmail].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationTemplateEmail]. */
    class Builder internal constructor() {

        private var bcc: JsonField<MutableList<String>>? = null
        private var cc: JsonField<MutableList<String>>? = null
        private var from: JsonField<String> = JsonMissing.of()
        private var replyTo: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(notificationTemplateEmail: NotificationTemplateEmail) = apply {
            bcc = notificationTemplateEmail.bcc.map { it.toMutableList() }
            cc = notificationTemplateEmail.cc.map { it.toMutableList() }
            from = notificationTemplateEmail.from
            replyTo = notificationTemplateEmail.replyTo
            additionalProperties = notificationTemplateEmail.additionalProperties.toMutableMap()
        }

        /** BCC addresses. */
        fun bcc(bcc: List<String>) = bcc(JsonField.of(bcc))

        /**
         * Sets [Builder.bcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bcc] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bcc(bcc: JsonField<List<String>>) = apply { this.bcc = bcc.map { it.toMutableList() } }

        /**
         * Adds a single [String] to [Builder.bcc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBcc(bcc: String) = apply {
            this.bcc =
                (this.bcc ?: JsonField.of(mutableListOf())).also { checkKnown("bcc", it).add(bcc) }
        }

        /** CC addresses. */
        fun cc(cc: List<String>) = cc(JsonField.of(cc))

        /**
         * Sets [Builder.cc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cc] with a well-typed `List<String>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cc(cc: JsonField<List<String>>) = apply { this.cc = cc.map { it.toMutableList() } }

        /**
         * Adds a single [String] to [Builder.cc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCc(cc: String) = apply {
            this.cc =
                (this.cc ?: JsonField.of(mutableListOf())).also { checkKnown("cc", it).add(cc) }
        }

        /** The From address. */
        fun from(from: String) = from(JsonField.of(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<String>) = apply { this.from = from }

        /** The Reply-to address. */
        fun replyTo(replyTo: String) = replyTo(JsonField.of(replyTo))

        /**
         * Sets [Builder.replyTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyTo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun replyTo(replyTo: JsonField<String>) = apply { this.replyTo = replyTo }

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
         * Returns an immutable instance of [NotificationTemplateEmail].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NotificationTemplateEmail =
            NotificationTemplateEmail(
                (bcc ?: JsonMissing.of()).map { it.toImmutable() },
                (cc ?: JsonMissing.of()).map { it.toImmutable() },
                from,
                replyTo,
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
    fun validate(): NotificationTemplateEmail = apply {
        if (validated) {
            return@apply
        }

        bcc()
        cc()
        from()
        replyTo()
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
        (bcc.asKnown().getOrNull()?.size ?: 0) +
            (cc.asKnown().getOrNull()?.size ?: 0) +
            (if (from.asKnown().isPresent) 1 else 0) +
            (if (replyTo.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationTemplateEmail &&
            bcc == other.bcc &&
            cc == other.cc &&
            from == other.from &&
            replyTo == other.replyTo &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(bcc, cc, from, replyTo, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotificationTemplateEmail{bcc=$bcc, cc=$cc, from=$from, replyTo=$replyTo, additionalProperties=$additionalProperties}"
}

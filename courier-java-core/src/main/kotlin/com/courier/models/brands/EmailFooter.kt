// File generated from our OpenAPI spec by Stainless.

package com.courier.models.brands

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
import kotlin.jvm.optionals.getOrNull

class EmailFooter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val inheritDefault: JsonField<Boolean>,
    private val markdown: JsonField<String>,
    private val social: JsonField<Social>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("inheritDefault")
        @ExcludeMissing
        inheritDefault: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("markdown") @ExcludeMissing markdown: JsonField<String> = JsonMissing.of(),
        @JsonProperty("social") @ExcludeMissing social: JsonField<Social> = JsonMissing.of(),
    ) : this(inheritDefault, markdown, social, mutableMapOf())

    /**
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inheritDefault(): Optional<Boolean> = inheritDefault.getOptional("inheritDefault")

    /**
     * The footer body, as markdown. This is the field the API returns and accepts; it is omitted
     * entirely when no footer body is set. Sending null is accepted and treated as no footer body.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun markdown(): Optional<String> = markdown.getOptional("markdown")

    /**
     * Social links rendered in the email footer.
     *
     * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun social(): Optional<Social> = social.getOptional("social")

    /**
     * Returns the raw JSON value of [inheritDefault].
     *
     * Unlike [inheritDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inheritDefault")
    @ExcludeMissing
    fun _inheritDefault(): JsonField<Boolean> = inheritDefault

    /**
     * Returns the raw JSON value of [markdown].
     *
     * Unlike [markdown], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("markdown") @ExcludeMissing fun _markdown(): JsonField<String> = markdown

    /**
     * Returns the raw JSON value of [social].
     *
     * Unlike [social], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("social") @ExcludeMissing fun _social(): JsonField<Social> = social

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

        /** Returns a mutable builder for constructing an instance of [EmailFooter]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailFooter]. */
    class Builder internal constructor() {

        private var inheritDefault: JsonField<Boolean> = JsonMissing.of()
        private var markdown: JsonField<String> = JsonMissing.of()
        private var social: JsonField<Social> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailFooter: EmailFooter) = apply {
            inheritDefault = emailFooter.inheritDefault
            markdown = emailFooter.markdown
            social = emailFooter.social
            additionalProperties = emailFooter.additionalProperties.toMutableMap()
        }

        fun inheritDefault(inheritDefault: Boolean?) =
            inheritDefault(JsonField.ofNullable(inheritDefault))

        /**
         * Alias for [Builder.inheritDefault].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun inheritDefault(inheritDefault: Boolean) = inheritDefault(inheritDefault as Boolean?)

        /** Alias for calling [Builder.inheritDefault] with `inheritDefault.orElse(null)`. */
        fun inheritDefault(inheritDefault: Optional<Boolean>) =
            inheritDefault(inheritDefault.getOrNull())

        /**
         * Sets [Builder.inheritDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inheritDefault] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inheritDefault(inheritDefault: JsonField<Boolean>) = apply {
            this.inheritDefault = inheritDefault
        }

        /**
         * The footer body, as markdown. This is the field the API returns and accepts; it is
         * omitted entirely when no footer body is set. Sending null is accepted and treated as no
         * footer body.
         */
        fun markdown(markdown: String?) = markdown(JsonField.ofNullable(markdown))

        /** Alias for calling [Builder.markdown] with `markdown.orElse(null)`. */
        fun markdown(markdown: Optional<String>) = markdown(markdown.getOrNull())

        /**
         * Sets [Builder.markdown] to an arbitrary JSON value.
         *
         * You should usually call [Builder.markdown] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun markdown(markdown: JsonField<String>) = apply { this.markdown = markdown }

        /** Social links rendered in the email footer. */
        fun social(social: Social?) = social(JsonField.ofNullable(social))

        /** Alias for calling [Builder.social] with `social.orElse(null)`. */
        fun social(social: Optional<Social>) = social(social.getOrNull())

        /**
         * Sets [Builder.social] to an arbitrary JSON value.
         *
         * You should usually call [Builder.social] with a well-typed [Social] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun social(social: JsonField<Social>) = apply { this.social = social }

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
         * Returns an immutable instance of [EmailFooter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EmailFooter =
            EmailFooter(inheritDefault, markdown, social, additionalProperties.toMutableMap())
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
    fun validate(): EmailFooter = apply {
        if (validated) {
            return@apply
        }

        inheritDefault()
        markdown()
        social().ifPresent { it.validate() }
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
        (if (inheritDefault.asKnown().isPresent) 1 else 0) +
            (if (markdown.asKnown().isPresent) 1 else 0) +
            (social.asKnown().getOrNull()?.validity() ?: 0)

    /** Social links rendered in the email footer. */
    class Social
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val facebook: JsonField<Facebook>,
        private val instagram: JsonField<Instagram>,
        private val linkedin: JsonField<Linkedin>,
        private val medium: JsonField<Medium>,
        private val twitter: JsonField<Twitter>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("facebook")
            @ExcludeMissing
            facebook: JsonField<Facebook> = JsonMissing.of(),
            @JsonProperty("instagram")
            @ExcludeMissing
            instagram: JsonField<Instagram> = JsonMissing.of(),
            @JsonProperty("linkedin")
            @ExcludeMissing
            linkedin: JsonField<Linkedin> = JsonMissing.of(),
            @JsonProperty("medium") @ExcludeMissing medium: JsonField<Medium> = JsonMissing.of(),
            @JsonProperty("twitter") @ExcludeMissing twitter: JsonField<Twitter> = JsonMissing.of(),
        ) : this(facebook, instagram, linkedin, medium, twitter, mutableMapOf())

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun facebook(): Optional<Facebook> = facebook.getOptional("facebook")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun instagram(): Optional<Instagram> = instagram.getOptional("instagram")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun linkedin(): Optional<Linkedin> = linkedin.getOptional("linkedin")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun medium(): Optional<Medium> = medium.getOptional("medium")

        /**
         * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun twitter(): Optional<Twitter> = twitter.getOptional("twitter")

        /**
         * Returns the raw JSON value of [facebook].
         *
         * Unlike [facebook], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("facebook") @ExcludeMissing fun _facebook(): JsonField<Facebook> = facebook

        /**
         * Returns the raw JSON value of [instagram].
         *
         * Unlike [instagram], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("instagram")
        @ExcludeMissing
        fun _instagram(): JsonField<Instagram> = instagram

        /**
         * Returns the raw JSON value of [linkedin].
         *
         * Unlike [linkedin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("linkedin") @ExcludeMissing fun _linkedin(): JsonField<Linkedin> = linkedin

        /**
         * Returns the raw JSON value of [medium].
         *
         * Unlike [medium], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("medium") @ExcludeMissing fun _medium(): JsonField<Medium> = medium

        /**
         * Returns the raw JSON value of [twitter].
         *
         * Unlike [twitter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("twitter") @ExcludeMissing fun _twitter(): JsonField<Twitter> = twitter

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

            /** Returns a mutable builder for constructing an instance of [Social]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Social]. */
        class Builder internal constructor() {

            private var facebook: JsonField<Facebook> = JsonMissing.of()
            private var instagram: JsonField<Instagram> = JsonMissing.of()
            private var linkedin: JsonField<Linkedin> = JsonMissing.of()
            private var medium: JsonField<Medium> = JsonMissing.of()
            private var twitter: JsonField<Twitter> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(social: Social) = apply {
                facebook = social.facebook
                instagram = social.instagram
                linkedin = social.linkedin
                medium = social.medium
                twitter = social.twitter
                additionalProperties = social.additionalProperties.toMutableMap()
            }

            fun facebook(facebook: Facebook?) = facebook(JsonField.ofNullable(facebook))

            /** Alias for calling [Builder.facebook] with `facebook.orElse(null)`. */
            fun facebook(facebook: Optional<Facebook>) = facebook(facebook.getOrNull())

            /**
             * Sets [Builder.facebook] to an arbitrary JSON value.
             *
             * You should usually call [Builder.facebook] with a well-typed [Facebook] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun facebook(facebook: JsonField<Facebook>) = apply { this.facebook = facebook }

            fun instagram(instagram: Instagram?) = instagram(JsonField.ofNullable(instagram))

            /** Alias for calling [Builder.instagram] with `instagram.orElse(null)`. */
            fun instagram(instagram: Optional<Instagram>) = instagram(instagram.getOrNull())

            /**
             * Sets [Builder.instagram] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instagram] with a well-typed [Instagram] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instagram(instagram: JsonField<Instagram>) = apply { this.instagram = instagram }

            fun linkedin(linkedin: Linkedin?) = linkedin(JsonField.ofNullable(linkedin))

            /** Alias for calling [Builder.linkedin] with `linkedin.orElse(null)`. */
            fun linkedin(linkedin: Optional<Linkedin>) = linkedin(linkedin.getOrNull())

            /**
             * Sets [Builder.linkedin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkedin] with a well-typed [Linkedin] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun linkedin(linkedin: JsonField<Linkedin>) = apply { this.linkedin = linkedin }

            fun medium(medium: Medium?) = medium(JsonField.ofNullable(medium))

            /** Alias for calling [Builder.medium] with `medium.orElse(null)`. */
            fun medium(medium: Optional<Medium>) = medium(medium.getOrNull())

            /**
             * Sets [Builder.medium] to an arbitrary JSON value.
             *
             * You should usually call [Builder.medium] with a well-typed [Medium] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun medium(medium: JsonField<Medium>) = apply { this.medium = medium }

            fun twitter(twitter: Twitter?) = twitter(JsonField.ofNullable(twitter))

            /** Alias for calling [Builder.twitter] with `twitter.orElse(null)`. */
            fun twitter(twitter: Optional<Twitter>) = twitter(twitter.getOrNull())

            /**
             * Sets [Builder.twitter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.twitter] with a well-typed [Twitter] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun twitter(twitter: JsonField<Twitter>) = apply { this.twitter = twitter }

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
             * Returns an immutable instance of [Social].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Social =
                Social(
                    facebook,
                    instagram,
                    linkedin,
                    medium,
                    twitter,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Social = apply {
            if (validated) {
                return@apply
            }

            facebook().ifPresent { it.validate() }
            instagram().ifPresent { it.validate() }
            linkedin().ifPresent { it.validate() }
            medium().ifPresent { it.validate() }
            twitter().ifPresent { it.validate() }
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
            (facebook.asKnown().getOrNull()?.validity() ?: 0) +
                (instagram.asKnown().getOrNull()?.validity() ?: 0) +
                (linkedin.asKnown().getOrNull()?.validity() ?: 0) +
                (medium.asKnown().getOrNull()?.validity() ?: 0) +
                (twitter.asKnown().getOrNull()?.validity() ?: 0)

        class Facebook
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of()
            ) : this(url, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun url(): Optional<String> = url.getOptional("url")

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

                /** Returns a mutable builder for constructing an instance of [Facebook]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Facebook]. */
            class Builder internal constructor() {

                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(facebook: Facebook) = apply {
                    url = facebook.url
                    additionalProperties = facebook.additionalProperties.toMutableMap()
                }

                fun url(url: String?) = url(JsonField.ofNullable(url))

                /** Alias for calling [Builder.url] with `url.orElse(null)`. */
                fun url(url: Optional<String>) = url(url.getOrNull())

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

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
                 * Returns an immutable instance of [Facebook].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Facebook = Facebook(url, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Facebook = apply {
                if (validated) {
                    return@apply
                }

                url()
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
            @JvmSynthetic internal fun validity(): Int = (if (url.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Facebook &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(url, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Facebook{url=$url, additionalProperties=$additionalProperties}"
        }

        class Instagram
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of()
            ) : this(url, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun url(): Optional<String> = url.getOptional("url")

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

                /** Returns a mutable builder for constructing an instance of [Instagram]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Instagram]. */
            class Builder internal constructor() {

                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(instagram: Instagram) = apply {
                    url = instagram.url
                    additionalProperties = instagram.additionalProperties.toMutableMap()
                }

                fun url(url: String?) = url(JsonField.ofNullable(url))

                /** Alias for calling [Builder.url] with `url.orElse(null)`. */
                fun url(url: Optional<String>) = url(url.getOrNull())

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

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
                 * Returns an immutable instance of [Instagram].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Instagram = Instagram(url, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Instagram = apply {
                if (validated) {
                    return@apply
                }

                url()
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
            @JvmSynthetic internal fun validity(): Int = (if (url.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Instagram &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(url, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Instagram{url=$url, additionalProperties=$additionalProperties}"
        }

        class Linkedin
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of()
            ) : this(url, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun url(): Optional<String> = url.getOptional("url")

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

                /** Returns a mutable builder for constructing an instance of [Linkedin]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Linkedin]. */
            class Builder internal constructor() {

                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(linkedin: Linkedin) = apply {
                    url = linkedin.url
                    additionalProperties = linkedin.additionalProperties.toMutableMap()
                }

                fun url(url: String?) = url(JsonField.ofNullable(url))

                /** Alias for calling [Builder.url] with `url.orElse(null)`. */
                fun url(url: Optional<String>) = url(url.getOrNull())

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

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
                 * Returns an immutable instance of [Linkedin].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Linkedin = Linkedin(url, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Linkedin = apply {
                if (validated) {
                    return@apply
                }

                url()
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
            @JvmSynthetic internal fun validity(): Int = (if (url.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Linkedin &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(url, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Linkedin{url=$url, additionalProperties=$additionalProperties}"
        }

        class Medium
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of()
            ) : this(url, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun url(): Optional<String> = url.getOptional("url")

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

                /** Returns a mutable builder for constructing an instance of [Medium]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Medium]. */
            class Builder internal constructor() {

                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(medium: Medium) = apply {
                    url = medium.url
                    additionalProperties = medium.additionalProperties.toMutableMap()
                }

                fun url(url: String?) = url(JsonField.ofNullable(url))

                /** Alias for calling [Builder.url] with `url.orElse(null)`. */
                fun url(url: Optional<String>) = url(url.getOrNull())

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

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
                 * Returns an immutable instance of [Medium].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Medium = Medium(url, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Medium = apply {
                if (validated) {
                    return@apply
                }

                url()
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
            @JvmSynthetic internal fun validity(): Int = (if (url.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Medium &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(url, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Medium{url=$url, additionalProperties=$additionalProperties}"
        }

        class Twitter
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of()
            ) : this(url, mutableMapOf())

            /**
             * @throws CourierInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun url(): Optional<String> = url.getOptional("url")

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

                /** Returns a mutable builder for constructing an instance of [Twitter]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Twitter]. */
            class Builder internal constructor() {

                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(twitter: Twitter) = apply {
                    url = twitter.url
                    additionalProperties = twitter.additionalProperties.toMutableMap()
                }

                fun url(url: String?) = url(JsonField.ofNullable(url))

                /** Alias for calling [Builder.url] with `url.orElse(null)`. */
                fun url(url: Optional<String>) = url(url.getOrNull())

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

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
                 * Returns an immutable instance of [Twitter].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Twitter = Twitter(url, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws CourierInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Twitter = apply {
                if (validated) {
                    return@apply
                }

                url()
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
            @JvmSynthetic internal fun validity(): Int = (if (url.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Twitter &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(url, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Twitter{url=$url, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Social &&
                facebook == other.facebook &&
                instagram == other.instagram &&
                linkedin == other.linkedin &&
                medium == other.medium &&
                twitter == other.twitter &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(facebook, instagram, linkedin, medium, twitter, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Social{facebook=$facebook, instagram=$instagram, linkedin=$linkedin, medium=$medium, twitter=$twitter, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailFooter &&
            inheritDefault == other.inheritDefault &&
            markdown == other.markdown &&
            social == other.social &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(inheritDefault, markdown, social, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailFooter{inheritDefault=$inheritDefault, markdown=$markdown, social=$social, additionalProperties=$additionalProperties}"
}

/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.send.types;

import com.courier.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = EmailFooter.Builder.class)
public final class EmailFooter {
    private final Optional<Object> content;

    private final Optional<Boolean> inheritDefault;

    private final Map<String, Object> additionalProperties;

    private EmailFooter(
            Optional<Object> content, Optional<Boolean> inheritDefault, Map<String, Object> additionalProperties) {
        this.content = content;
        this.inheritDefault = inheritDefault;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("content")
    public Optional<Object> getContent() {
        return content;
    }

    @JsonProperty("inheritDefault")
    public Optional<Boolean> getInheritDefault() {
        return inheritDefault;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EmailFooter && equalTo((EmailFooter) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(EmailFooter other) {
        return content.equals(other.content) && inheritDefault.equals(other.inheritDefault);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.content, this.inheritDefault);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<Object> content = Optional.empty();

        private Optional<Boolean> inheritDefault = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(EmailFooter other) {
            content(other.getContent());
            inheritDefault(other.getInheritDefault());
            return this;
        }

        @JsonSetter(value = "content", nulls = Nulls.SKIP)
        public Builder content(Optional<Object> content) {
            this.content = content;
            return this;
        }

        public Builder content(Object content) {
            this.content = Optional.of(content);
            return this;
        }

        @JsonSetter(value = "inheritDefault", nulls = Nulls.SKIP)
        public Builder inheritDefault(Optional<Boolean> inheritDefault) {
            this.inheritDefault = inheritDefault;
            return this;
        }

        public Builder inheritDefault(Boolean inheritDefault) {
            this.inheritDefault = Optional.of(inheritDefault);
            return this;
        }

        public EmailFooter build() {
            return new EmailFooter(content, inheritDefault, additionalProperties);
        }
    }
}

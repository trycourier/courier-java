/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.brands.types;

import com.courier.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = BrandSnippet.Builder.class)
public final class BrandSnippet {
    private final String name;

    private final String value;

    private final Map<String, Object> additionalProperties;

    private BrandSnippet(String name, String value, Map<String, Object> additionalProperties) {
        this.name = name;
        this.value = value;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("format")
    public String getFormat() {
        return "handlebars";
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BrandSnippet && equalTo((BrandSnippet) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BrandSnippet other) {
        return name.equals(other.name) && value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.name, this.value);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        ValueStage name(String name);

        Builder from(BrandSnippet other);
    }

    public interface ValueStage {
        _FinalStage value(String value);
    }

    public interface _FinalStage {
        BrandSnippet build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, ValueStage, _FinalStage {
        private String name;

        private String value;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(BrandSnippet other) {
            name(other.getName());
            value(other.getValue());
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public ValueStage name(String name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        @JsonSetter("value")
        public _FinalStage value(String value) {
            this.value = value;
            return this;
        }

        @java.lang.Override
        public BrandSnippet build() {
            return new BrandSnippet(name, value, additionalProperties);
        }
    }
}
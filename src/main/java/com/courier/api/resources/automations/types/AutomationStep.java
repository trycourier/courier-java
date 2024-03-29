/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.automations.types;

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
@JsonDeserialize(builder = AutomationStep.Builder.class)
public final class AutomationStep implements IAutomationStep {
    private final Optional<String> if_;

    private final Optional<String> ref;

    private final Map<String, Object> additionalProperties;

    private AutomationStep(Optional<String> if_, Optional<String> ref, Map<String, Object> additionalProperties) {
        this.if_ = if_;
        this.ref = ref;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("if")
    @java.lang.Override
    public Optional<String> getIf() {
        return if_;
    }

    @JsonProperty("ref")
    @java.lang.Override
    public Optional<String> getRef() {
        return ref;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AutomationStep && equalTo((AutomationStep) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AutomationStep other) {
        return if_.equals(other.if_) && ref.equals(other.ref);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.if_, this.ref);
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
        private Optional<String> if_ = Optional.empty();

        private Optional<String> ref = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(AutomationStep other) {
            if_(other.getIf());
            ref(other.getRef());
            return this;
        }

        @JsonSetter(value = "if", nulls = Nulls.SKIP)
        public Builder if_(Optional<String> if_) {
            this.if_ = if_;
            return this;
        }

        public Builder if_(String if_) {
            this.if_ = Optional.of(if_);
            return this;
        }

        @JsonSetter(value = "ref", nulls = Nulls.SKIP)
        public Builder ref(Optional<String> ref) {
            this.ref = ref;
            return this;
        }

        public Builder ref(String ref) {
            this.ref = Optional.of(ref);
            return this;
        }

        public AutomationStep build() {
            return new AutomationStep(if_, ref, additionalProperties);
        }
    }
}

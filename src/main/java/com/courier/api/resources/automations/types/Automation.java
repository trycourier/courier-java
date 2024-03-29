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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Automation.Builder.class)
public final class Automation {
    private final Optional<String> cancelationToken;

    private final List<AutomationStepOption> steps;

    private final Map<String, Object> additionalProperties;

    private Automation(
            Optional<String> cancelationToken,
            List<AutomationStepOption> steps,
            Map<String, Object> additionalProperties) {
        this.cancelationToken = cancelationToken;
        this.steps = steps;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("cancelation_token")
    public Optional<String> getCancelationToken() {
        return cancelationToken;
    }

    @JsonProperty("steps")
    public List<AutomationStepOption> getSteps() {
        return steps;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Automation && equalTo((Automation) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Automation other) {
        return cancelationToken.equals(other.cancelationToken) && steps.equals(other.steps);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.cancelationToken, this.steps);
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
        private Optional<String> cancelationToken = Optional.empty();

        private List<AutomationStepOption> steps = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Automation other) {
            cancelationToken(other.getCancelationToken());
            steps(other.getSteps());
            return this;
        }

        @JsonSetter(value = "cancelation_token", nulls = Nulls.SKIP)
        public Builder cancelationToken(Optional<String> cancelationToken) {
            this.cancelationToken = cancelationToken;
            return this;
        }

        public Builder cancelationToken(String cancelationToken) {
            this.cancelationToken = Optional.of(cancelationToken);
            return this;
        }

        @JsonSetter(value = "steps", nulls = Nulls.SKIP)
        public Builder steps(List<AutomationStepOption> steps) {
            this.steps.clear();
            this.steps.addAll(steps);
            return this;
        }

        public Builder addSteps(AutomationStepOption steps) {
            this.steps.add(steps);
            return this;
        }

        public Builder addAllSteps(List<AutomationStepOption> steps) {
            this.steps.addAll(steps);
            return this;
        }

        public Automation build() {
            return new Automation(cancelationToken, steps, additionalProperties);
        }
    }
}

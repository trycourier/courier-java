/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.audiences.types;

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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = NestedFilterConfig.Builder.class)
public final class NestedFilterConfig implements IBaseFilterConfig {
    private final Operator operator;

    private final List<FilterConfig> rules;

    private final Map<String, Object> additionalProperties;

    private NestedFilterConfig(Operator operator, List<FilterConfig> rules, Map<String, Object> additionalProperties) {
        this.operator = operator;
        this.rules = rules;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The operator to use for filtering
     */
    @JsonProperty("operator")
    @java.lang.Override
    public Operator getOperator() {
        return operator;
    }

    @JsonProperty("rules")
    public List<FilterConfig> getRules() {
        return rules;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NestedFilterConfig && equalTo((NestedFilterConfig) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(NestedFilterConfig other) {
        return operator.equals(other.operator) && rules.equals(other.rules);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.operator, this.rules);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static OperatorStage builder() {
        return new Builder();
    }

    public interface OperatorStage {
        _FinalStage operator(Operator operator);

        Builder from(NestedFilterConfig other);
    }

    public interface _FinalStage {
        NestedFilterConfig build();

        _FinalStage rules(List<FilterConfig> rules);

        _FinalStage addRules(FilterConfig rules);

        _FinalStage addAllRules(List<FilterConfig> rules);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OperatorStage, _FinalStage {
        private Operator operator;

        private List<FilterConfig> rules = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(NestedFilterConfig other) {
            operator(other.getOperator());
            rules(other.getRules());
            return this;
        }

        /**
         * <p>The operator to use for filtering</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("operator")
        public _FinalStage operator(Operator operator) {
            this.operator = operator;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllRules(List<FilterConfig> rules) {
            this.rules.addAll(rules);
            return this;
        }

        @java.lang.Override
        public _FinalStage addRules(FilterConfig rules) {
            this.rules.add(rules);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "rules", nulls = Nulls.SKIP)
        public _FinalStage rules(List<FilterConfig> rules) {
            this.rules.clear();
            this.rules.addAll(rules);
            return this;
        }

        @java.lang.Override
        public NestedFilterConfig build() {
            return new NestedFilterConfig(operator, rules, additionalProperties);
        }
    }
}

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
@JsonDeserialize(builder = AutomationInvokeTemplateParams.Builder.class)
public final class AutomationInvokeTemplateParams implements IAutomationInvokeParams {
    private final Optional<String> brand;

    private final Optional<Map<String, Object>> data;

    private final Optional<Object> profile;

    private final Optional<String> recipient;

    private final Optional<String> template;

    private final String templateId;

    private final Map<String, Object> additionalProperties;

    private AutomationInvokeTemplateParams(
            Optional<String> brand,
            Optional<Map<String, Object>> data,
            Optional<Object> profile,
            Optional<String> recipient,
            Optional<String> template,
            String templateId,
            Map<String, Object> additionalProperties) {
        this.brand = brand;
        this.data = data;
        this.profile = profile;
        this.recipient = recipient;
        this.template = template;
        this.templateId = templateId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("brand")
    @java.lang.Override
    public Optional<String> getBrand() {
        return brand;
    }

    @JsonProperty("data")
    @java.lang.Override
    public Optional<Map<String, Object>> getData() {
        return data;
    }

    @JsonProperty("profile")
    @java.lang.Override
    public Optional<Object> getProfile() {
        return profile;
    }

    @JsonProperty("recipient")
    @java.lang.Override
    public Optional<String> getRecipient() {
        return recipient;
    }

    @JsonProperty("template")
    @java.lang.Override
    public Optional<String> getTemplate() {
        return template;
    }

    @JsonProperty("templateId")
    public String getTemplateId() {
        return templateId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AutomationInvokeTemplateParams && equalTo((AutomationInvokeTemplateParams) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AutomationInvokeTemplateParams other) {
        return brand.equals(other.brand)
                && data.equals(other.data)
                && profile.equals(other.profile)
                && recipient.equals(other.recipient)
                && template.equals(other.template)
                && templateId.equals(other.templateId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.brand, this.data, this.profile, this.recipient, this.template, this.templateId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TemplateIdStage builder() {
        return new Builder();
    }

    public interface TemplateIdStage {
        _FinalStage templateId(String templateId);

        Builder from(AutomationInvokeTemplateParams other);
    }

    public interface _FinalStage {
        AutomationInvokeTemplateParams build();

        _FinalStage brand(Optional<String> brand);

        _FinalStage brand(String brand);

        _FinalStage data(Optional<Map<String, Object>> data);

        _FinalStage data(Map<String, Object> data);

        _FinalStage profile(Optional<Object> profile);

        _FinalStage profile(Object profile);

        _FinalStage recipient(Optional<String> recipient);

        _FinalStage recipient(String recipient);

        _FinalStage template(Optional<String> template);

        _FinalStage template(String template);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TemplateIdStage, _FinalStage {
        private String templateId;

        private Optional<String> template = Optional.empty();

        private Optional<String> recipient = Optional.empty();

        private Optional<Object> profile = Optional.empty();

        private Optional<Map<String, Object>> data = Optional.empty();

        private Optional<String> brand = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AutomationInvokeTemplateParams other) {
            brand(other.getBrand());
            data(other.getData());
            profile(other.getProfile());
            recipient(other.getRecipient());
            template(other.getTemplate());
            templateId(other.getTemplateId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("templateId")
        public _FinalStage templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        @java.lang.Override
        public _FinalStage template(String template) {
            this.template = Optional.of(template);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "template", nulls = Nulls.SKIP)
        public _FinalStage template(Optional<String> template) {
            this.template = template;
            return this;
        }

        @java.lang.Override
        public _FinalStage recipient(String recipient) {
            this.recipient = Optional.of(recipient);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "recipient", nulls = Nulls.SKIP)
        public _FinalStage recipient(Optional<String> recipient) {
            this.recipient = recipient;
            return this;
        }

        @java.lang.Override
        public _FinalStage profile(Object profile) {
            this.profile = Optional.of(profile);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "profile", nulls = Nulls.SKIP)
        public _FinalStage profile(Optional<Object> profile) {
            this.profile = profile;
            return this;
        }

        @java.lang.Override
        public _FinalStage data(Map<String, Object> data) {
            this.data = Optional.of(data);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public _FinalStage data(Optional<Map<String, Object>> data) {
            this.data = data;
            return this;
        }

        @java.lang.Override
        public _FinalStage brand(String brand) {
            this.brand = Optional.of(brand);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "brand", nulls = Nulls.SKIP)
        public _FinalStage brand(Optional<String> brand) {
            this.brand = brand;
            return this;
        }

        @java.lang.Override
        public AutomationInvokeTemplateParams build() {
            return new AutomationInvokeTemplateParams(
                    brand, data, profile, recipient, template, templateId, additionalProperties);
        }
    }
}

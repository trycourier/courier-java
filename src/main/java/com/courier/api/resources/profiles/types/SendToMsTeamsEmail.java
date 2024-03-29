/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.profiles.types;

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
@JsonDeserialize(builder = SendToMsTeamsEmail.Builder.class)
public final class SendToMsTeamsEmail implements IMsTeamsBaseProperties {
    private final String tenantId;

    private final String serviceUrl;

    private final String email;

    private final Map<String, Object> additionalProperties;

    private SendToMsTeamsEmail(
            String tenantId, String serviceUrl, String email, Map<String, Object> additionalProperties) {
        this.tenantId = tenantId;
        this.serviceUrl = serviceUrl;
        this.email = email;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("tenant_id")
    @java.lang.Override
    public String getTenantId() {
        return tenantId;
    }

    @JsonProperty("service_url")
    @java.lang.Override
    public String getServiceUrl() {
        return serviceUrl;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SendToMsTeamsEmail && equalTo((SendToMsTeamsEmail) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SendToMsTeamsEmail other) {
        return tenantId.equals(other.tenantId) && serviceUrl.equals(other.serviceUrl) && email.equals(other.email);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.tenantId, this.serviceUrl, this.email);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TenantIdStage builder() {
        return new Builder();
    }

    public interface TenantIdStage {
        ServiceUrlStage tenantId(String tenantId);

        Builder from(SendToMsTeamsEmail other);
    }

    public interface ServiceUrlStage {
        EmailStage serviceUrl(String serviceUrl);
    }

    public interface EmailStage {
        _FinalStage email(String email);
    }

    public interface _FinalStage {
        SendToMsTeamsEmail build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TenantIdStage, ServiceUrlStage, EmailStage, _FinalStage {
        private String tenantId;

        private String serviceUrl;

        private String email;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(SendToMsTeamsEmail other) {
            tenantId(other.getTenantId());
            serviceUrl(other.getServiceUrl());
            email(other.getEmail());
            return this;
        }

        @java.lang.Override
        @JsonSetter("tenant_id")
        public ServiceUrlStage tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("service_url")
        public EmailStage serviceUrl(String serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }

        @java.lang.Override
        @JsonSetter("email")
        public _FinalStage email(String email) {
            this.email = email;
            return this;
        }

        @java.lang.Override
        public SendToMsTeamsEmail build() {
            return new SendToMsTeamsEmail(tenantId, serviceUrl, email, additionalProperties);
        }
    }
}

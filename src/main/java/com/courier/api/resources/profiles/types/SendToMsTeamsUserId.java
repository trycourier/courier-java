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
@JsonDeserialize(builder = SendToMsTeamsUserId.Builder.class)
public final class SendToMsTeamsUserId implements IMsTeamsBaseProperties {
    private final String tenantId;

    private final String serviceUrl;

    private final String userId;

    private final Map<String, Object> additionalProperties;

    private SendToMsTeamsUserId(
            String tenantId, String serviceUrl, String userId, Map<String, Object> additionalProperties) {
        this.tenantId = tenantId;
        this.serviceUrl = serviceUrl;
        this.userId = userId;
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

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SendToMsTeamsUserId && equalTo((SendToMsTeamsUserId) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SendToMsTeamsUserId other) {
        return tenantId.equals(other.tenantId) && serviceUrl.equals(other.serviceUrl) && userId.equals(other.userId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.tenantId, this.serviceUrl, this.userId);
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

        Builder from(SendToMsTeamsUserId other);
    }

    public interface ServiceUrlStage {
        UserIdStage serviceUrl(String serviceUrl);
    }

    public interface UserIdStage {
        _FinalStage userId(String userId);
    }

    public interface _FinalStage {
        SendToMsTeamsUserId build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TenantIdStage, ServiceUrlStage, UserIdStage, _FinalStage {
        private String tenantId;

        private String serviceUrl;

        private String userId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(SendToMsTeamsUserId other) {
            tenantId(other.getTenantId());
            serviceUrl(other.getServiceUrl());
            userId(other.getUserId());
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
        public UserIdStage serviceUrl(String serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }

        @java.lang.Override
        @JsonSetter("user_id")
        public _FinalStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @java.lang.Override
        public SendToMsTeamsUserId build() {
            return new SendToMsTeamsUserId(tenantId, serviceUrl, userId, additionalProperties);
        }
    }
}

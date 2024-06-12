/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.commons.types;

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
@JsonDeserialize(builder = UserTenantAssociation.Builder.class)
public final class UserTenantAssociation {
    private final Optional<String> userId;

    private final Optional<String> type;

    private final String tenantId;

    private final Optional<Map<String, Object>> profile;

    private final Map<String, Object> additionalProperties;

    private UserTenantAssociation(
            Optional<String> userId,
            Optional<String> type,
            String tenantId,
            Optional<Map<String, Object>> profile,
            Map<String, Object> additionalProperties) {
        this.userId = userId;
        this.type = type;
        this.tenantId = tenantId;
        this.profile = profile;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return User ID for the assocation between tenant and user
     */
    @JsonProperty("user_id")
    public Optional<String> getUserId() {
        return userId;
    }

    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    /**
     * @return Tenant ID for the assocation between tenant and user
     */
    @JsonProperty("tenant_id")
    public String getTenantId() {
        return tenantId;
    }

    /**
     * @return Additional metadata to be applied to a user profile when used in a tenant context
     */
    @JsonProperty("profile")
    public Optional<Map<String, Object>> getProfile() {
        return profile;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserTenantAssociation && equalTo((UserTenantAssociation) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserTenantAssociation other) {
        return userId.equals(other.userId)
                && type.equals(other.type)
                && tenantId.equals(other.tenantId)
                && profile.equals(other.profile);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.userId, this.type, this.tenantId, this.profile);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TenantIdStage builder() {
        return new Builder();
    }

    public interface TenantIdStage {
        _FinalStage tenantId(String tenantId);

        Builder from(UserTenantAssociation other);
    }

    public interface _FinalStage {
        UserTenantAssociation build();

        _FinalStage userId(Optional<String> userId);

        _FinalStage userId(String userId);

        _FinalStage type(Optional<String> type);

        _FinalStage type(String type);

        _FinalStage profile(Optional<Map<String, Object>> profile);

        _FinalStage profile(Map<String, Object> profile);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TenantIdStage, _FinalStage {
        private String tenantId;

        private Optional<Map<String, Object>> profile = Optional.empty();

        private Optional<String> type = Optional.empty();

        private Optional<String> userId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UserTenantAssociation other) {
            userId(other.getUserId());
            type(other.getType());
            tenantId(other.getTenantId());
            profile(other.getProfile());
            return this;
        }

        /**
         * <p>Tenant ID for the assocation between tenant and user</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("tenant_id")
        public _FinalStage tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>Additional metadata to be applied to a user profile when used in a tenant context</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage profile(Map<String, Object> profile) {
            this.profile = Optional.of(profile);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "profile", nulls = Nulls.SKIP)
        public _FinalStage profile(Optional<Map<String, Object>> profile) {
            this.profile = profile;
            return this;
        }

        @java.lang.Override
        public _FinalStage type(String type) {
            this.type = Optional.of(type);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public _FinalStage type(Optional<String> type) {
            this.type = type;
            return this;
        }

        /**
         * <p>User ID for the assocation between tenant and user</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage userId(String userId) {
            this.userId = Optional.of(userId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "user_id", nulls = Nulls.SKIP)
        public _FinalStage userId(Optional<String> userId) {
            this.userId = userId;
            return this;
        }

        @java.lang.Override
        public UserTenantAssociation build() {
            return new UserTenantAssociation(userId, type, tenantId, profile, additionalProperties);
        }
    }
}

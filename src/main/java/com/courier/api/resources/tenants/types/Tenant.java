/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.tenants.types;

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
@JsonDeserialize(builder = Tenant.Builder.class)
public final class Tenant {
    private final String id;

    private final String name;

    private final Optional<String> parentTenantId;

    private final Optional<DefaultPreferences> defaultPreferences;

    private final Optional<Object> properties;

    private final Optional<Map<String, Object>> userProfile;

    private final Optional<String> brandId;

    private final Map<String, Object> additionalProperties;

    private Tenant(
            String id,
            String name,
            Optional<String> parentTenantId,
            Optional<DefaultPreferences> defaultPreferences,
            Optional<Object> properties,
            Optional<Map<String, Object>> userProfile,
            Optional<String> brandId,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.name = name;
        this.parentTenantId = parentTenantId;
        this.defaultPreferences = defaultPreferences;
        this.properties = properties;
        this.userProfile = userProfile;
        this.brandId = brandId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Id of the tenant.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return Name of the tenant.
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return Tenant's parent id (if any).
     */
    @JsonProperty("parent_tenant_id")
    public Optional<String> getParentTenantId() {
        return parentTenantId;
    }

    /**
     * @return Defines the preferences used for the account when the user hasn't specified their own.
     */
    @JsonProperty("default_preferences")
    public Optional<DefaultPreferences> getDefaultPreferences() {
        return defaultPreferences;
    }

    /**
     * @return Arbitrary properties accessible to a template.
     */
    @JsonProperty("properties")
    public Optional<Object> getProperties() {
        return properties;
    }

    /**
     * @return A user profile object merged with user profile on send.
     */
    @JsonProperty("user_profile")
    public Optional<Map<String, Object>> getUserProfile() {
        return userProfile;
    }

    /**
     * @return Brand to be used for the account when one is not specified by the send call.
     */
    @JsonProperty("brand_id")
    public Optional<String> getBrandId() {
        return brandId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Tenant && equalTo((Tenant) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Tenant other) {
        return id.equals(other.id)
                && name.equals(other.name)
                && parentTenantId.equals(other.parentTenantId)
                && defaultPreferences.equals(other.defaultPreferences)
                && properties.equals(other.properties)
                && userProfile.equals(other.userProfile)
                && brandId.equals(other.brandId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.name,
                this.parentTenantId,
                this.defaultPreferences,
                this.properties,
                this.userProfile,
                this.brandId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        NameStage id(String id);

        Builder from(Tenant other);
    }

    public interface NameStage {
        _FinalStage name(String name);
    }

    public interface _FinalStage {
        Tenant build();

        _FinalStage parentTenantId(Optional<String> parentTenantId);

        _FinalStage parentTenantId(String parentTenantId);

        _FinalStage defaultPreferences(Optional<DefaultPreferences> defaultPreferences);

        _FinalStage defaultPreferences(DefaultPreferences defaultPreferences);

        _FinalStage properties(Optional<Object> properties);

        _FinalStage properties(Object properties);

        _FinalStage userProfile(Optional<Map<String, Object>> userProfile);

        _FinalStage userProfile(Map<String, Object> userProfile);

        _FinalStage brandId(Optional<String> brandId);

        _FinalStage brandId(String brandId);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, NameStage, _FinalStage {
        private String id;

        private String name;

        private Optional<String> brandId = Optional.empty();

        private Optional<Map<String, Object>> userProfile = Optional.empty();

        private Optional<Object> properties = Optional.empty();

        private Optional<DefaultPreferences> defaultPreferences = Optional.empty();

        private Optional<String> parentTenantId = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Tenant other) {
            id(other.getId());
            name(other.getName());
            parentTenantId(other.getParentTenantId());
            defaultPreferences(other.getDefaultPreferences());
            properties(other.getProperties());
            userProfile(other.getUserProfile());
            brandId(other.getBrandId());
            return this;
        }

        /**
         * <p>Id of the tenant.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public NameStage id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Name of the tenant.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name")
        public _FinalStage name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Brand to be used for the account when one is not specified by the send call.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage brandId(String brandId) {
            this.brandId = Optional.of(brandId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "brand_id", nulls = Nulls.SKIP)
        public _FinalStage brandId(Optional<String> brandId) {
            this.brandId = brandId;
            return this;
        }

        /**
         * <p>A user profile object merged with user profile on send.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage userProfile(Map<String, Object> userProfile) {
            this.userProfile = Optional.of(userProfile);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "user_profile", nulls = Nulls.SKIP)
        public _FinalStage userProfile(Optional<Map<String, Object>> userProfile) {
            this.userProfile = userProfile;
            return this;
        }

        /**
         * <p>Arbitrary properties accessible to a template.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage properties(Object properties) {
            this.properties = Optional.of(properties);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "properties", nulls = Nulls.SKIP)
        public _FinalStage properties(Optional<Object> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * <p>Defines the preferences used for the account when the user hasn't specified their own.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage defaultPreferences(DefaultPreferences defaultPreferences) {
            this.defaultPreferences = Optional.of(defaultPreferences);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "default_preferences", nulls = Nulls.SKIP)
        public _FinalStage defaultPreferences(Optional<DefaultPreferences> defaultPreferences) {
            this.defaultPreferences = defaultPreferences;
            return this;
        }

        /**
         * <p>Tenant's parent id (if any).</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage parentTenantId(String parentTenantId) {
            this.parentTenantId = Optional.of(parentTenantId);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "parent_tenant_id", nulls = Nulls.SKIP)
        public _FinalStage parentTenantId(Optional<String> parentTenantId) {
            this.parentTenantId = parentTenantId;
            return this;
        }

        @java.lang.Override
        public Tenant build() {
            return new Tenant(
                    id,
                    name,
                    parentTenantId,
                    defaultPreferences,
                    properties,
                    userProfile,
                    brandId,
                    additionalProperties);
        }
    }
}

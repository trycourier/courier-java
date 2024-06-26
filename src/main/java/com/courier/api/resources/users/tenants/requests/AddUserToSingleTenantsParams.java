/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.users.tenants.requests;

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
@JsonDeserialize(builder = AddUserToSingleTenantsParams.Builder.class)
public final class AddUserToSingleTenantsParams {
    private final Optional<Map<String, Object>> profile;

    private final Map<String, Object> additionalProperties;

    private AddUserToSingleTenantsParams(
            Optional<Map<String, Object>> profile, Map<String, Object> additionalProperties) {
        this.profile = profile;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("profile")
    public Optional<Map<String, Object>> getProfile() {
        return profile;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AddUserToSingleTenantsParams && equalTo((AddUserToSingleTenantsParams) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AddUserToSingleTenantsParams other) {
        return profile.equals(other.profile);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.profile);
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
        private Optional<Map<String, Object>> profile = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(AddUserToSingleTenantsParams other) {
            profile(other.getProfile());
            return this;
        }

        @JsonSetter(value = "profile", nulls = Nulls.SKIP)
        public Builder profile(Optional<Map<String, Object>> profile) {
            this.profile = profile;
            return this;
        }

        public Builder profile(Map<String, Object> profile) {
            this.profile = Optional.of(profile);
            return this;
        }

        public AddUserToSingleTenantsParams build() {
            return new AddUserToSingleTenantsParams(profile, additionalProperties);
        }
    }
}

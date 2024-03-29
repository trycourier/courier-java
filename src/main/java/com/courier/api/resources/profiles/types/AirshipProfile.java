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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AirshipProfile.Builder.class)
public final class AirshipProfile {
    private final AirshipProfileAudience audience;

    private final List<Object> deviceTypes;

    private final Map<String, Object> additionalProperties;

    private AirshipProfile(
            AirshipProfileAudience audience, List<Object> deviceTypes, Map<String, Object> additionalProperties) {
        this.audience = audience;
        this.deviceTypes = deviceTypes;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("audience")
    public AirshipProfileAudience getAudience() {
        return audience;
    }

    @JsonProperty("device_types")
    public List<Object> getDeviceTypes() {
        return deviceTypes;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AirshipProfile && equalTo((AirshipProfile) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AirshipProfile other) {
        return audience.equals(other.audience) && deviceTypes.equals(other.deviceTypes);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.audience, this.deviceTypes);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AudienceStage builder() {
        return new Builder();
    }

    public interface AudienceStage {
        _FinalStage audience(AirshipProfileAudience audience);

        Builder from(AirshipProfile other);
    }

    public interface _FinalStage {
        AirshipProfile build();

        _FinalStage deviceTypes(List<Object> deviceTypes);

        _FinalStage addDeviceTypes(Object deviceTypes);

        _FinalStage addAllDeviceTypes(List<Object> deviceTypes);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AudienceStage, _FinalStage {
        private AirshipProfileAudience audience;

        private List<Object> deviceTypes = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AirshipProfile other) {
            audience(other.getAudience());
            deviceTypes(other.getDeviceTypes());
            return this;
        }

        @java.lang.Override
        @JsonSetter("audience")
        public _FinalStage audience(AirshipProfileAudience audience) {
            this.audience = audience;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllDeviceTypes(List<Object> deviceTypes) {
            this.deviceTypes.addAll(deviceTypes);
            return this;
        }

        @java.lang.Override
        public _FinalStage addDeviceTypes(Object deviceTypes) {
            this.deviceTypes.add(deviceTypes);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "device_types", nulls = Nulls.SKIP)
        public _FinalStage deviceTypes(List<Object> deviceTypes) {
            this.deviceTypes.clear();
            this.deviceTypes.addAll(deviceTypes);
            return this;
        }

        @java.lang.Override
        public AirshipProfile build() {
            return new AirshipProfile(audience, deviceTypes, additionalProperties);
        }
    }
}

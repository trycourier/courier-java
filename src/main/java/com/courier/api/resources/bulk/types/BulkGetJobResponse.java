/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.bulk.types;

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
@JsonDeserialize(builder = BulkGetJobResponse.Builder.class)
public final class BulkGetJobResponse {
    private final JobDetails job;

    private final Map<String, Object> additionalProperties;

    private BulkGetJobResponse(JobDetails job, Map<String, Object> additionalProperties) {
        this.job = job;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("job")
    public JobDetails getJob() {
        return job;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BulkGetJobResponse && equalTo((BulkGetJobResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BulkGetJobResponse other) {
        return job.equals(other.job);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.job);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static JobStage builder() {
        return new Builder();
    }

    public interface JobStage {
        _FinalStage job(JobDetails job);

        Builder from(BulkGetJobResponse other);
    }

    public interface _FinalStage {
        BulkGetJobResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements JobStage, _FinalStage {
        private JobDetails job;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(BulkGetJobResponse other) {
            job(other.getJob());
            return this;
        }

        @java.lang.Override
        @JsonSetter("job")
        public _FinalStage job(JobDetails job) {
            this.job = job;
            return this;
        }

        @java.lang.Override
        public BulkGetJobResponse build() {
            return new BulkGetJobResponse(job, additionalProperties);
        }
    }
}
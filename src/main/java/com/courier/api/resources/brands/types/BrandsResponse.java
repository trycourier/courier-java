/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.brands.types;

import com.courier.api.core.ObjectMappers;
import com.courier.api.resources.commons.types.Paging;
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
@JsonDeserialize(builder = BrandsResponse.Builder.class)
public final class BrandsResponse {
    private final Paging paging;

    private final List<Brand> results;

    private final Map<String, Object> additionalProperties;

    private BrandsResponse(Paging paging, List<Brand> results, Map<String, Object> additionalProperties) {
        this.paging = paging;
        this.results = results;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("paging")
    public Paging getPaging() {
        return paging;
    }

    @JsonProperty("results")
    public List<Brand> getResults() {
        return results;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BrandsResponse && equalTo((BrandsResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BrandsResponse other) {
        return paging.equals(other.paging) && results.equals(other.results);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.paging, this.results);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static PagingStage builder() {
        return new Builder();
    }

    public interface PagingStage {
        _FinalStage paging(Paging paging);

        Builder from(BrandsResponse other);
    }

    public interface _FinalStage {
        BrandsResponse build();

        _FinalStage results(List<Brand> results);

        _FinalStage addResults(Brand results);

        _FinalStage addAllResults(List<Brand> results);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements PagingStage, _FinalStage {
        private Paging paging;

        private List<Brand> results = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(BrandsResponse other) {
            paging(other.getPaging());
            results(other.getResults());
            return this;
        }

        @java.lang.Override
        @JsonSetter("paging")
        public _FinalStage paging(Paging paging) {
            this.paging = paging;
            return this;
        }

        @java.lang.Override
        public _FinalStage addAllResults(List<Brand> results) {
            this.results.addAll(results);
            return this;
        }

        @java.lang.Override
        public _FinalStage addResults(Brand results) {
            this.results.add(results);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "results", nulls = Nulls.SKIP)
        public _FinalStage results(List<Brand> results) {
            this.results.clear();
            this.results.addAll(results);
            return this;
        }

        @java.lang.Override
        public BrandsResponse build() {
            return new BrandsResponse(paging, results, additionalProperties);
        }
    }
}

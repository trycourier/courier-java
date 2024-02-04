/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.lists.types;

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
@JsonDeserialize(builder = List.Builder.class)
public final class List {
    private final String id;

    private final String name;

    private final Optional<Integer> created;

    private final Optional<Integer> updated;

    private final Map<String, Object> additionalProperties;

    private List(
            String id,
            String name,
            Optional<Integer> created,
            Optional<Integer> updated,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.name = name;
        this.created = created;
        this.updated = updated;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("created")
    public Optional<Integer> getCreated() {
        return created;
    }

    @JsonProperty("updated")
    public Optional<Integer> getUpdated() {
        return updated;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof List && equalTo((List) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(List other) {
        return id.equals(other.id)
                && name.equals(other.name)
                && created.equals(other.created)
                && updated.equals(other.updated);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.created, this.updated);
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

        Builder from(List other);
    }

    public interface NameStage {
        _FinalStage name(String name);
    }

    public interface _FinalStage {
        List build();

        _FinalStage created(Optional<Integer> created);

        _FinalStage created(Integer created);

        _FinalStage updated(Optional<Integer> updated);

        _FinalStage updated(Integer updated);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, NameStage, _FinalStage {
        private String id;

        private String name;

        private Optional<Integer> updated = Optional.empty();

        private Optional<Integer> created = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(List other) {
            id(other.getId());
            name(other.getName());
            created(other.getCreated());
            updated(other.getUpdated());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public NameStage id(String id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public _FinalStage name(String name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        public _FinalStage updated(Integer updated) {
            this.updated = Optional.of(updated);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "updated", nulls = Nulls.SKIP)
        public _FinalStage updated(Optional<Integer> updated) {
            this.updated = updated;
            return this;
        }

        @java.lang.Override
        public _FinalStage created(Integer created) {
            this.created = Optional.of(created);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "created", nulls = Nulls.SKIP)
        public _FinalStage created(Optional<Integer> created) {
            this.created = created;
            return this;
        }

        @java.lang.Override
        public List build() {
            return new List(id, name, created, updated, additionalProperties);
        }
    }
}
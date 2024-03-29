/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.brands.types;

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
@JsonDeserialize(builder = Brand.Builder.class)
public final class Brand {
    private final int created;

    private final Optional<String> id;

    private final String name;

    private final int published;

    private final BrandSettings settings;

    private final int updated;

    private final Optional<BrandSnippets> snippets;

    private final String version;

    private final Map<String, Object> additionalProperties;

    private Brand(
            int created,
            Optional<String> id,
            String name,
            int published,
            BrandSettings settings,
            int updated,
            Optional<BrandSnippets> snippets,
            String version,
            Map<String, Object> additionalProperties) {
        this.created = created;
        this.id = id;
        this.name = name;
        this.published = published;
        this.settings = settings;
        this.updated = updated;
        this.snippets = snippets;
        this.version = version;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The date/time of when the brand was created. Represented in milliseconds since Unix epoch.
     */
    @JsonProperty("created")
    public int getCreated() {
        return created;
    }

    /**
     * @return Brand Identifier
     */
    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return Brand name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return The date/time of when the brand was published. Represented in milliseconds since Unix epoch.
     */
    @JsonProperty("published")
    public int getPublished() {
        return published;
    }

    @JsonProperty("settings")
    public BrandSettings getSettings() {
        return settings;
    }

    /**
     * @return The date/time of when the brand was updated. Represented in milliseconds since Unix epoch.
     */
    @JsonProperty("updated")
    public int getUpdated() {
        return updated;
    }

    @JsonProperty("snippets")
    public Optional<BrandSnippets> getSnippets() {
        return snippets;
    }

    /**
     * @return The version identifier for the brand
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Brand && equalTo((Brand) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Brand other) {
        return created == other.created
                && id.equals(other.id)
                && name.equals(other.name)
                && published == other.published
                && settings.equals(other.settings)
                && updated == other.updated
                && snippets.equals(other.snippets)
                && version.equals(other.version);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.created,
                this.id,
                this.name,
                this.published,
                this.settings,
                this.updated,
                this.snippets,
                this.version);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CreatedStage builder() {
        return new Builder();
    }

    public interface CreatedStage {
        NameStage created(int created);

        Builder from(Brand other);
    }

    public interface NameStage {
        PublishedStage name(String name);
    }

    public interface PublishedStage {
        SettingsStage published(int published);
    }

    public interface SettingsStage {
        UpdatedStage settings(BrandSettings settings);
    }

    public interface UpdatedStage {
        VersionStage updated(int updated);
    }

    public interface VersionStage {
        _FinalStage version(String version);
    }

    public interface _FinalStage {
        Brand build();

        _FinalStage id(Optional<String> id);

        _FinalStage id(String id);

        _FinalStage snippets(Optional<BrandSnippets> snippets);

        _FinalStage snippets(BrandSnippets snippets);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements CreatedStage, NameStage, PublishedStage, SettingsStage, UpdatedStage, VersionStage, _FinalStage {
        private int created;

        private String name;

        private int published;

        private BrandSettings settings;

        private int updated;

        private String version;

        private Optional<BrandSnippets> snippets = Optional.empty();

        private Optional<String> id = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Brand other) {
            created(other.getCreated());
            id(other.getId());
            name(other.getName());
            published(other.getPublished());
            settings(other.getSettings());
            updated(other.getUpdated());
            snippets(other.getSnippets());
            version(other.getVersion());
            return this;
        }

        /**
         * <p>The date/time of when the brand was created. Represented in milliseconds since Unix epoch.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("created")
        public NameStage created(int created) {
            this.created = created;
            return this;
        }

        /**
         * <p>Brand name</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name")
        public PublishedStage name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The date/time of when the brand was published. Represented in milliseconds since Unix epoch.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("published")
        public SettingsStage published(int published) {
            this.published = published;
            return this;
        }

        @java.lang.Override
        @JsonSetter("settings")
        public UpdatedStage settings(BrandSettings settings) {
            this.settings = settings;
            return this;
        }

        /**
         * <p>The date/time of when the brand was updated. Represented in milliseconds since Unix epoch.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("updated")
        public VersionStage updated(int updated) {
            this.updated = updated;
            return this;
        }

        /**
         * <p>The version identifier for the brand</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("version")
        public _FinalStage version(String version) {
            this.version = version;
            return this;
        }

        @java.lang.Override
        public _FinalStage snippets(BrandSnippets snippets) {
            this.snippets = Optional.of(snippets);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "snippets", nulls = Nulls.SKIP)
        public _FinalStage snippets(Optional<BrandSnippets> snippets) {
            this.snippets = snippets;
            return this;
        }

        /**
         * <p>Brand Identifier</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage id(String id) {
            this.id = Optional.of(id);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public _FinalStage id(Optional<String> id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        public Brand build() {
            return new Brand(created, id, name, published, settings, updated, snippets, version, additionalProperties);
        }
    }
}

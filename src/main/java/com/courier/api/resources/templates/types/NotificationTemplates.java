/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.templates.types;

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
@JsonDeserialize(builder = NotificationTemplates.Builder.class)
public final class NotificationTemplates {
    private final int createdAt;

    private final String id;

    private final RoutingStrategy routing;

    private final List<Tag> tags;

    private final String title;

    private final int updatedAt;

    private final Map<String, Object> additionalProperties;

    private NotificationTemplates(
            int createdAt,
            String id,
            RoutingStrategy routing,
            List<Tag> tags,
            String title,
            int updatedAt,
            Map<String, Object> additionalProperties) {
        this.createdAt = createdAt;
        this.id = id;
        this.routing = routing;
        this.tags = tags;
        this.title = title;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return A UTC timestamp at which notification was created. This is stored as a millisecond representation of the Unix epoch (the time passed since January 1, 1970).
     */
    @JsonProperty("created_at")
    public int getCreatedAt() {
        return createdAt;
    }

    /**
     * @return A unique identifier associated with the notification.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return Routing strategy used by this notification.
     */
    @JsonProperty("routing")
    public RoutingStrategy getRouting() {
        return routing;
    }

    /**
     * @return A list of tags attached to the notification.
     */
    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * @return The title of the notification.
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * @return A UTC timestamp at which notification was updated. This is stored as a millisecond representation of the Unix epoch (the time passed since January 1, 1970).
     */
    @JsonProperty("updated_at")
    public int getUpdatedAt() {
        return updatedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NotificationTemplates && equalTo((NotificationTemplates) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(NotificationTemplates other) {
        return createdAt == other.createdAt
                && id.equals(other.id)
                && routing.equals(other.routing)
                && tags.equals(other.tags)
                && title.equals(other.title)
                && updatedAt == other.updatedAt;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.createdAt, this.id, this.routing, this.tags, this.title, this.updatedAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CreatedAtStage builder() {
        return new Builder();
    }

    public interface CreatedAtStage {
        IdStage createdAt(int createdAt);

        Builder from(NotificationTemplates other);
    }

    public interface IdStage {
        RoutingStage id(String id);
    }

    public interface RoutingStage {
        TitleStage routing(RoutingStrategy routing);
    }

    public interface TitleStage {
        UpdatedAtStage title(String title);
    }

    public interface UpdatedAtStage {
        _FinalStage updatedAt(int updatedAt);
    }

    public interface _FinalStage {
        NotificationTemplates build();

        _FinalStage tags(List<Tag> tags);

        _FinalStage addTags(Tag tags);

        _FinalStage addAllTags(List<Tag> tags);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements CreatedAtStage, IdStage, RoutingStage, TitleStage, UpdatedAtStage, _FinalStage {
        private int createdAt;

        private String id;

        private RoutingStrategy routing;

        private String title;

        private int updatedAt;

        private List<Tag> tags = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(NotificationTemplates other) {
            createdAt(other.getCreatedAt());
            id(other.getId());
            routing(other.getRouting());
            tags(other.getTags());
            title(other.getTitle());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * <p>A UTC timestamp at which notification was created. This is stored as a millisecond representation of the Unix epoch (the time passed since January 1, 1970).</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("created_at")
        public IdStage createdAt(int createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>A unique identifier associated with the notification.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public RoutingStage id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Routing strategy used by this notification.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("routing")
        public TitleStage routing(RoutingStrategy routing) {
            this.routing = routing;
            return this;
        }

        /**
         * <p>The title of the notification.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("title")
        public UpdatedAtStage title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>A UTC timestamp at which notification was updated. This is stored as a millisecond representation of the Unix epoch (the time passed since January 1, 1970).</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("updated_at")
        public _FinalStage updatedAt(int updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>A list of tags attached to the notification.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllTags(List<Tag> tags) {
            this.tags.addAll(tags);
            return this;
        }

        /**
         * <p>A list of tags attached to the notification.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addTags(Tag tags) {
            this.tags.add(tags);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "tags", nulls = Nulls.SKIP)
        public _FinalStage tags(List<Tag> tags) {
            this.tags.clear();
            this.tags.addAll(tags);
            return this;
        }

        @java.lang.Override
        public NotificationTemplates build() {
            return new NotificationTemplates(createdAt, id, routing, tags, title, updatedAt, additionalProperties);
        }
    }
}

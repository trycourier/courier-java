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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TenantListResponse.Builder.class)
public final class TenantListResponse {
    private final Optional<String> cursor;

    private final boolean hasMore;

    private final List<Tenant> items;

    private final Optional<String> nextUrl;

    private final String url;

    private final Map<String, Object> additionalProperties;

    private TenantListResponse(
            Optional<String> cursor,
            boolean hasMore,
            List<Tenant> items,
            Optional<String> nextUrl,
            String url,
            Map<String, Object> additionalProperties) {
        this.cursor = cursor;
        this.hasMore = hasMore;
        this.items = items;
        this.nextUrl = nextUrl;
        this.url = url;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return A pointer to the next page of results. Defined only when has_more is set to true.
     */
    @JsonProperty("cursor")
    public Optional<String> getCursor() {
        return cursor;
    }

    /**
     * @return Set to true when there are more pages that can be retrieved.
     */
    @JsonProperty("has_more")
    public boolean getHasMore() {
        return hasMore;
    }

    /**
     * @return An array of Tenants
     */
    @JsonProperty("items")
    public List<Tenant> getItems() {
        return items;
    }

    /**
     * @return A url that may be used to generate fetch the next set of results.
     * Defined only when has_more is set to true
     */
    @JsonProperty("next_url")
    public Optional<String> getNextUrl() {
        return nextUrl;
    }

    /**
     * @return A url that may be used to generate these results.
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * @return Always set to &quot;list&quot;. Represents the type of this object.
     */
    @JsonProperty("type")
    public String getType() {
        return "list";
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TenantListResponse && equalTo((TenantListResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TenantListResponse other) {
        return cursor.equals(other.cursor)
                && hasMore == other.hasMore
                && items.equals(other.items)
                && nextUrl.equals(other.nextUrl)
                && url.equals(other.url);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.cursor, this.hasMore, this.items, this.nextUrl, this.url);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static HasMoreStage builder() {
        return new Builder();
    }

    public interface HasMoreStage {
        UrlStage hasMore(boolean hasMore);

        Builder from(TenantListResponse other);
    }

    public interface UrlStage {
        _FinalStage url(String url);
    }

    public interface _FinalStage {
        TenantListResponse build();

        _FinalStage cursor(Optional<String> cursor);

        _FinalStage cursor(String cursor);

        _FinalStage items(List<Tenant> items);

        _FinalStage addItems(Tenant items);

        _FinalStage addAllItems(List<Tenant> items);

        _FinalStage nextUrl(Optional<String> nextUrl);

        _FinalStage nextUrl(String nextUrl);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements HasMoreStage, UrlStage, _FinalStage {
        private boolean hasMore;

        private String url;

        private Optional<String> nextUrl = Optional.empty();

        private List<Tenant> items = new ArrayList<>();

        private Optional<String> cursor = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TenantListResponse other) {
            cursor(other.getCursor());
            hasMore(other.getHasMore());
            items(other.getItems());
            nextUrl(other.getNextUrl());
            url(other.getUrl());
            return this;
        }

        /**
         * <p>Set to true when there are more pages that can be retrieved.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("has_more")
        public UrlStage hasMore(boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>A url that may be used to generate these results.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("url")
        public _FinalStage url(String url) {
            this.url = url;
            return this;
        }

        /**
         * <p>A url that may be used to generate fetch the next set of results.
         * Defined only when has_more is set to true</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage nextUrl(String nextUrl) {
            this.nextUrl = Optional.of(nextUrl);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "next_url", nulls = Nulls.SKIP)
        public _FinalStage nextUrl(Optional<String> nextUrl) {
            this.nextUrl = nextUrl;
            return this;
        }

        /**
         * <p>An array of Tenants</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllItems(List<Tenant> items) {
            this.items.addAll(items);
            return this;
        }

        /**
         * <p>An array of Tenants</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addItems(Tenant items) {
            this.items.add(items);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "items", nulls = Nulls.SKIP)
        public _FinalStage items(List<Tenant> items) {
            this.items.clear();
            this.items.addAll(items);
            return this;
        }

        /**
         * <p>A pointer to the next page of results. Defined only when has_more is set to true.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage cursor(String cursor) {
            this.cursor = Optional.of(cursor);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "cursor", nulls = Nulls.SKIP)
        public _FinalStage cursor(Optional<String> cursor) {
            this.cursor = cursor;
            return this;
        }

        @java.lang.Override
        public TenantListResponse build() {
            return new TenantListResponse(cursor, hasMore, items, nextUrl, url, additionalProperties);
        }
    }
}

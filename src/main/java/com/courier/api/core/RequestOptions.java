/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public final class RequestOptions {
    private final String authorizationToken;

    private final Optional<Integer> timeout;

    private final TimeUnit timeoutTimeUnit;

    private RequestOptions(String authorizationToken, Optional<Integer> timeout, TimeUnit timeoutTimeUnit) {
        this.authorizationToken = authorizationToken;
        this.timeout = timeout;
        this.timeoutTimeUnit = timeoutTimeUnit;
    }

    public Optional<Integer> getTimeout() {
        return timeout;
    }

    public TimeUnit getTimeoutTimeUnit() {
        return timeoutTimeUnit;
    }

    public Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        if (this.authorizationToken != null) {
            headers.put("Authorization", "Bearer " + this.authorizationToken);
        }
        return headers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String authorizationToken = null;

        private Optional<Integer> timeout = Optional.empty();

        private TimeUnit timeoutTimeUnit = TimeUnit.SECONDS;

        public Builder authorizationToken(String authorizationToken) {
            this.authorizationToken = authorizationToken;
            return this;
        }

        public Builder timeout(Integer timeout) {
            this.timeout = Optional.of(timeout);
            return this;
        }

        public Builder timeout(Integer timeout, TimeUnit timeoutTimeUnit) {
            this.timeout = Optional.of(timeout);
            this.timeoutTimeUnit = timeoutTimeUnit;
            return this;
        }

        public RequestOptions build() {
            return new RequestOptions(authorizationToken, timeout, timeoutTimeUnit);
        }
    }
}
